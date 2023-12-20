package github.nowsoar.springframework.beans.factory.support;

import github.nowsoar.springframework.beans.factory.config.BeanDefinition;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/20
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
