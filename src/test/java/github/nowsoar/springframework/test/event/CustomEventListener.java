package github.nowsoar.springframework.test.event;

import github.nowsoar.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到: " + event.getSource() + "消息; 时间: " + new Date());
        System.out.println("消息: " + event.getId() + ":" + event.getMessage());
    }
}
