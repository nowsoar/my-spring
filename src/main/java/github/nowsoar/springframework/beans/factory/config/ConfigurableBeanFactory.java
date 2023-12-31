package github.nowsoar.springframework.beans.factory.config;

import com.sun.istack.internal.Nullable;
import github.nowsoar.springframework.beans.factory.HierarchicalBeanFactory;
import github.nowsoar.springframework.core.convert.ConversionService;
import github.nowsoar.springframework.utils.StringValueResolver;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();

    void addEmbeddedValueResolver(StringValueResolver stringValueResolver);

    String resolveEmbeddedValue(String value);

    void setConversionService(ConversionService conversionService);

    @Nullable
    ConversionService getConversionService();
}
