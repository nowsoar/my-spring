package github.nowsoar.springframework.beans.factory;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);
}
