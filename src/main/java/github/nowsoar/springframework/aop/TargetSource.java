package github.nowsoar.springframework.aop;

import github.nowsoar.springframework.utils.ClassUtils;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/25
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public Class<?>[] getTargetClass() {
        Class<?> clazz = target.getClass();
        clazz = ClassUtils.isCglibProxyClass(clazz) ? clazz.getSuperclass() : clazz;
        return clazz.getInterfaces();
    }
}
