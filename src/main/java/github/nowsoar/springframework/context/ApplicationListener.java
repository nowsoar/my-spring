package github.nowsoar.springframework.context;

import java.util.EventListener;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
