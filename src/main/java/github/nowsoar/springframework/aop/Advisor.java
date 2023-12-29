package github.nowsoar.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/29
 */
public interface Advisor {

    Advice getAdvice();
}
