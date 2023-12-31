package github.nowsoar.springframework.test.bean;

import github.nowsoar.springframework.beans.BeansException;
import github.nowsoar.springframework.beans.factory.*;
import github.nowsoar.springframework.beans.factory.annotation.Autowired;
import github.nowsoar.springframework.beans.factory.annotation.Value;
import github.nowsoar.springframework.context.ApplicationContext;
import github.nowsoar.springframework.stereotype.Component;

import java.util.Random;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/19
 */
@Component("userService")
public class UserService implements IUserService, BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware,InitializingBean, DisposableBean {

    private String uId;

    @Value("${token}")
    private String token;

    @Autowired
    private UserDao userDao;

    // private IUserDao userDao;

    private String company;

    private ApplicationContext applicationContext;

    private BeanFactory beanFactory;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

    @Override
    public String queryUserInfo() {
        // System.out.println("查询用户信息: " + userDao.queryUserName(uId)
        // +"，" + company + "，" + location);
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // return userDao.queryUserName("1") + "," + token;
        return "1, zkp, " + token;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    // public UserDao getUserDao() {
    //     return userDao;
    // }

    // public void setUserDao(UserDao userDao) {
    //     this.userDao = userDao;
    // }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行: UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // System.out.println("执行: UserService.afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        // System.out.println("ClassLoader: " + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        // System.out.println("Bean Name is: " + name);
    }

    @Override
    public String queryInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "zkp, 1, 深圳";
    }

    @Override
    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户: " + userName + " success!";
    }

    @Override
    public String toString() {
        return "UserService#token = {" + token + "}";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
