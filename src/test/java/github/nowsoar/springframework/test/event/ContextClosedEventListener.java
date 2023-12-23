package github.nowsoar.springframework.test.event;


import github.nowsoar.springframework.context.ApplicationListener;
import github.nowsoar.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }

}
