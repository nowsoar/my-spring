package github.nowsoar.springframework.aop.aspectj;

import github.nowsoar.springframework.aop.PointCut;
import github.nowsoar.springframework.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/29
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    private AspectJExpressionPointcut pointcut;

    private Advice advice;

    private String expression;

    @Override
    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    @Override
    public PointCut getPointcut() {
        if (pointcut == null) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }
}
