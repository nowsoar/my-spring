package github.nowsoar.springframework.beans.factory.config;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.BeanFactory;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
