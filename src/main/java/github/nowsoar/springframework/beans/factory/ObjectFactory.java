package github.nowsoar.springframework.beans.factory;

import github.nowsoar.springframework.beans.BeansException;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
