package github.nowsoar.springframework.beans.factory.support;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.core.io.Resource;
import github.nowsoar.springframework.core.io.ResourceLoader;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
