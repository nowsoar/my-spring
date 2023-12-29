package github.nowsoar.springframework.beans.factory.config;

import github.nowsoar.springframework.beans.BeansException;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/29
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;
}
