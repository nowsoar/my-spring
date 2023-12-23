package github.nowsoar.springframework.beans.factory;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/19
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
