package github.nowsoar.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.DisposableBean;
import github.nowsoar.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;

    private final String beanName;

    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }
    @Override
    public void destroy() throws Exception {
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }
        if (StrUtil.isNotEmpty(destroyMethodName) && ! (bean instanceof DisposableBean
        && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (destroyMethod == null) {
                throw new BeansException("Could not find a destroy method name '" +
                        destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
