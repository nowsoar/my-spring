package github.nowsoar.springframework.beans.factory.config;

import github.nowsoar.springframework.beans.BeansException;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
