package github.nowsoar.springframework.test.bean;



import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/26
 */
public class UserServiceInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        long start = System.currentTimeMillis();
        try {
            return invocation.proceed();
        } finally {
            System.out.println("监控 - Begin by AOP");
            System.out.println("方法名称: " + invocation.getMethod());
            System.out.println("方法耗时: " + (System.currentTimeMillis() - start) + "ms");
            System.out.println("监控 - End\r\n");
        }
    }
}
