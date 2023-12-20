package github.nowsoar.springframework.test;

import github.nowsoar.springframework.beans.factory.config.BeanDefinition;
import github.nowsoar.springframework.beans.factory.BeanFactory;
import github.nowsoar.springframework.beans.factory.support.DefaultListableBeanFactory;
import github.nowsoar.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/19
 */
public class ApiTest {


    @Test
    public void testBeanFactory() {
        // BeanFactory beanFactory = new BeanFactory();
        // BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        // beanFactory.registerBeanDefinition("userService", beanDefinition);
        // UserService userService = (UserService) beanFactory.getBean("userService");
        // userService.queryUserInfo();
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
