package github.nowsoar.springframework.beans.factory;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.config.AutowireCapableBeanFactory;
import github.nowsoar.springframework.beans.factory.config.BeanDefinition;
import github.nowsoar.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, ConfigurableBeanFactory, AutowireCapableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
