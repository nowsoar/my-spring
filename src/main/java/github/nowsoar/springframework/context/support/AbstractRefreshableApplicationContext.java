package github.nowsoar.springframework.context.support;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.ConfigurableListableBeanFactory;
import github.nowsoar.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
