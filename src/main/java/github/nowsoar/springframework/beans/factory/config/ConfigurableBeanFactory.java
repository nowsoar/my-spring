package github.nowsoar.springframework.beans.factory.config;

import github.nowsoar.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();
}
