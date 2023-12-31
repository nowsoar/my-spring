package github.nowsoar.springframework.beans.factory.config;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.PropertyValues;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/29
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException;

    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;

    default Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
