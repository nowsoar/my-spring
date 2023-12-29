package github.nowsoar.springframework.context.support;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.ApplicationContextAware;
import github.nowsoar.springframework.beans.factory.config.BeanPostProcessor;
import github.nowsoar.springframework.context.ApplicationContext;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
