package github.nowsoar.springframework.context.support;

import github.nowsoar.springframework.beans.factory.support.DefaultListableBeanFactory;
import github.nowsoar.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/23
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
