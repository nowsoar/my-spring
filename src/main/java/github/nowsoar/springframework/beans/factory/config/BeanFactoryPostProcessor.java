package github.nowsoar.springframework.beans.factory.config;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
