package github.nowsoar.springframework.beans.factory.support;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.BeanFactory;
import github.nowsoar.springframework.beans.factory.config.BeanDefinition;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/20
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
