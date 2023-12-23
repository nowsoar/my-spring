package github.nowsoar.springframework.test.common;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.PropertyValue;
import github.nowsoar.springframework.beans.PropertyValues;
import github.nowsoar.springframework.beans.factory.ConfigurableListableBeanFactory;
import github.nowsoar.springframework.beans.factory.config.BeanDefinition;
import github.nowsoar.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为: 字节跳动"));
    }
}
