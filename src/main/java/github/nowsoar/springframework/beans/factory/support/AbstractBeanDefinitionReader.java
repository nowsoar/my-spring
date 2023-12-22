package github.nowsoar.springframework.beans.factory.support;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.core.io.DefaultResourceLoader;
import github.nowsoar.springframework.core.io.Resource;
import github.nowsoar.springframework.core.io.ResourceLoader;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
