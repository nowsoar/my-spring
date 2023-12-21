package github.nowsoar.springframework.test;

import github.nowsoar.springframework.beans.PropertyValue;
import github.nowsoar.springframework.beans.PropertyValues;
import github.nowsoar.springframework.beans.factory.config.BeanDefinition;
import github.nowsoar.springframework.beans.factory.BeanFactory;
import github.nowsoar.springframework.beans.factory.config.BeanReference;
import github.nowsoar.springframework.beans.factory.support.DefaultListableBeanFactory;
import github.nowsoar.springframework.test.bean.UserDao;
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
        // DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        // beanFactory.registerBeanDefinition("userService", beanDefinition);
        // UserService userService = (UserService) beanFactory.getBean("userService");
        // userService.queryUserInfo();
        // 第3章
        // DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        // beanFactory.registerBeanDefinition("userService", beanDefinition);
        // UserService userService = (UserService) beanFactory.getBean("userService", "zkp");
        // userService.queryUserInfo();
        //第4章
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "1"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
