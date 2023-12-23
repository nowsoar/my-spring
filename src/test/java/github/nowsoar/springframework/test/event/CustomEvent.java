package github.nowsoar.springframework.test.event;

import github.nowsoar.springframework.context.ApplicationEvent;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public class CustomEvent extends ApplicationEvent {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomEvent(Object source, Long id, String message) {
        super(source);
        this.id = id;
        this.message = message;
    }
}
