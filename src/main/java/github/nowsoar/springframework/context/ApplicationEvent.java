package github.nowsoar.springframework.context;

import java.util.EventObject;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
