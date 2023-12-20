package github.nowsoar.springframework.beans.factory.config;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/20
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
