package github.nowsoar.springframework.aop;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/29
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Method method, Object[] args, Object target) throws Throwable;
}
