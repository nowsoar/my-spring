package github.nowsoar.springframework.beans.factory;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
