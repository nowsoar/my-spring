package github.nowsoar.springframework.context.event;

import github.nowsoar.springframework.context.ApplicationContext;
import github.nowsoar.springframework.context.ApplicationEvent;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
