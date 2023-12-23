package github.nowsoar.springframework.context.event;

import github.nowsoar.springframework.beans.factory.BeanFactory;
import github.nowsoar.springframework.context.ApplicationEvent;
import github.nowsoar.springframework.context.ApplicationListener;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster{

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
