package github.nowsoar.springframework.utils;

import github.nowsoar.springframework.beans.BeansException;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable t) {
            throw new BeansException("Fail to get default classloader", t);
        }
        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }

    public static boolean isCglibProxyClass(Class<?> clazz) {
        return (clazz != null && isCglibProxyClassName(clazz.getName()));
    }

    private static boolean isCglibProxyClassName(String name) {
        return (name != null && name.contains("$$"));
    }
}
