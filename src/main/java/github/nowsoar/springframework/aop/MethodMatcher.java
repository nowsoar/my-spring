package github.nowsoar.springframework.aop;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/25
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}
