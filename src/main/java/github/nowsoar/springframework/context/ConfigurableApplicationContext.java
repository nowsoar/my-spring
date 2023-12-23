package github.nowsoar.springframework.context;

import github.nowsoar.springframework.beans.BeansException;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    void refresh() throws BeansException;
}
