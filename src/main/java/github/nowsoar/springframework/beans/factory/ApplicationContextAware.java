package github.nowsoar.springframework.beans.factory;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.context.ApplicationContext;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
