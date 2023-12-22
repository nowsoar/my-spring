package github.nowsoar.springframework.beans.factory;

import github.nowsoar.springframework.beans.BeansException;

import java.util.Map;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public interface ListableBeanFactory extends BeanFactory {

    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}
