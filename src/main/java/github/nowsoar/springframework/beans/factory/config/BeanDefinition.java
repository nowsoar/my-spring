package github.nowsoar.springframework.beans.factory.config;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/19
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
