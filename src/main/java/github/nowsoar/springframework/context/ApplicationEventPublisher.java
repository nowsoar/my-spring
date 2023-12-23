package github.nowsoar.springframework.context;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);
}
