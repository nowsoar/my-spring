package github.nowsoar.springframework.test;

import github.nowsoar.springframework.aop.AdvisedSupport;
import github.nowsoar.springframework.aop.TargetSource;
import github.nowsoar.springframework.aop.aspectj.AspectJExpressionPointcut;
import github.nowsoar.springframework.aop.framework.Cglib2AopProxy;
import github.nowsoar.springframework.aop.framework.JdkDynamicAopProxy;
import github.nowsoar.springframework.beans.PropertyValue;
import github.nowsoar.springframework.beans.PropertyValues;
import github.nowsoar.springframework.beans.factory.config.BeanDefinition;
import github.nowsoar.springframework.beans.factory.BeanFactory;
import github.nowsoar.springframework.beans.factory.config.BeanReference;
import github.nowsoar.springframework.beans.factory.support.DefaultListableBeanFactory;
import github.nowsoar.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import github.nowsoar.springframework.context.support.ClassPathXmlApplicationContext;
import github.nowsoar.springframework.core.io.DefaultResourceLoader;
import github.nowsoar.springframework.test.bean.IUserService;
import github.nowsoar.springframework.test.bean.UserDao;
import github.nowsoar.springframework.test.bean.UserService;
import github.nowsoar.springframework.test.bean.UserServiceInterceptor;
import github.nowsoar.springframework.test.event.CustomEvent;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/19
 */
public class ApiTest {

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_dynamic() {
        UserService userService = new UserService();
        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setTargetSource(new TargetSource(userService));
        advisedSupport.setMethodInterceptor(new UserServiceInterceptor());
        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* github.nowsoar.springframework.test.bean.IUserService.*(..))"));
        IUserService proxy_jdk = (IUserService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        System.out.println("测试结果: " + proxy_jdk.queryInfo());
        IUserService proxy_cglib = (IUserService) new Cglib2AopProxy(advisedSupport).getProxy();
        System.out.println("测试结果; " + proxy_cglib.queryInfo());
    }

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果: " + userService.queryInfo());
    }

    @Test
    public void test_property() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果: " + userService);
    }

    @Test
    public void test_aop() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        applicationContext.getBean("pointcutAdvisor");
        System.out.println("测试结果: " + userService.queryInfo());
    }

    // @Test
    // public void test_aop() throws NoSuchMethodException {
    //     AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* github.nowsoar.springframework.test.bean.UserService.*(..))");
    //     Class<UserService> clazz = UserService.class;
    //     Method method = clazz.getDeclaredMethod("queryUserInfo");
    //     System.out.println(pointcut.matches(clazz));
    //     System.out.println(pointcut.matches(method, clazz));
    // }

    // @Test
    // public void test_proxy_method() {
    //     Object targetObj = new UserService();
    //
    //     Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
    //             targetObj.getClass().getInterfaces(), new InvocationHandler() {
    //                 @Override
    //                 public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    //                     if ()
    //                     return null;
    //                 }
    //             })
    // }

    // @Test
    // public void test_xml() {
    //     DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    //     XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
    //     reader.loadBeanDefinitions("classpath:spring.xml");
    //     UserService userService = (UserService) beanFactory.getBean("userService", UserService.class);
    //     userService.queryUserInfo();
    // }

    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor() {

    }

    @Test
    public void test_xml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext
                ("classpath:spring.xml");
        applicationContext.registerShutdownHook();
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.queryUserInfo();
        System.out.println(userService.getApplicationContext());
        System.out.println(userService.getBeanFactory());
        userService.queryUserInfo();
    }

    @Test
    public void test_prototype() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext
                ("classpath:spring.xml");
        applicationContext.registerShutdownHook();
        UserService userService1 = applicationContext.getBean("userService", UserService.class);
        UserService userService2 = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService1);
        System.out.println(userService2);
        userService1.queryUserInfo();
    }

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext
                ("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 192732L, "成功"));
        applicationContext.registerShutdownHook();
    }

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
        // DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        // PropertyValues propertyValues = new PropertyValues();
        // propertyValues.addPropertyValue(new PropertyValue("uId", "1"));
        // propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        // BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        // beanFactory.registerBeanDefinition("userService", beanDefinition);
        // UserService userService = (UserService) beanFactory.getBean("userService");
        // userService.queryUserInfo();
        //第5章

    }
}
