package github.nowsoar.springframework.context.event;

import github.nowsoar.springframework.context.ApplicationEvent;
import github.nowsoar.springframework.context.ApplicationListener;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
