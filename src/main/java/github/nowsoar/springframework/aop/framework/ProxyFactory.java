package github.nowsoar.springframework.aop.framework;

import github.nowsoar.springframework.aop.AdvisedSupport;
import github.nowsoar.springframework.beans.PropertyValue;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/29
 */
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }
        return new JdkDynamicAopProxy(advisedSupport);
    }
}
