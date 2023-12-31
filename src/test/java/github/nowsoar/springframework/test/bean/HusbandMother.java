package github.nowsoar.springframework.test.bean;

import github.nowsoar.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public class HusbandMother implements FactoryBean<IMother> {

    @Override
    public IMother getObject() throws Exception {
        return (IMother) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{IMother.class}, ((proxy, method, args) -> "代理" + method.getName()));
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
