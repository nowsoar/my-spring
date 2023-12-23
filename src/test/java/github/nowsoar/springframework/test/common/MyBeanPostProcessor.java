package github.nowsoar.springframework.test.common;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.config.BeanPostProcessor;
import github.nowsoar.springframework.test.bean.UserService;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为: 北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
