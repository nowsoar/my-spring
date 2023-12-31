package github.nowsoar.springframework.context.support;

import com.sun.istack.internal.Nullable;
import github.nowsoar.springframework.beans.factory.FactoryBean;
import github.nowsoar.springframework.beans.factory.InitializingBean;
import github.nowsoar.springframework.core.convert.ConversionService;
import github.nowsoar.springframework.core.convert.converter.Converter;
import github.nowsoar.springframework.core.convert.converter.ConverterFactory;
import github.nowsoar.springframework.core.convert.converter.ConverterRegistry;
import github.nowsoar.springframework.core.convert.converter.GenericConverter;
import github.nowsoar.springframework.core.convert.support.DefaultConversionService;
import github.nowsoar.springframework.core.convert.support.GenericConversionService;

import java.util.Set;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

    private Set<?> converters;

    @Nullable
    private GenericConversionService conversionService;

    @Override
    public ConversionService getObject() throws Exception {
        return conversionService;
    }

    @Override
    public Class<?> getObjectType() {
        return conversionService.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.conversionService = new DefaultConversionService();
        registerConverters(converters, conversionService);
    }

    private void registerConverters(Set<?> converters, ConverterRegistry registry) {
        if (converters != null) {
            for (Object converter : converters) {
                if (converter instanceof GenericConverter) {
                    registry.addConverter((GenericConverter) converter);
                } else if (converter instanceof Converter<?, ?>) {
                    registry.addConverter((Converter<?, ?>) converter);
                } else if (converter instanceof ConverterFactory<?, ?>) {
                    registry.addConverterFactory((ConverterFactory<?, ?>) converter);
                } else {
                    throw new IllegalArgumentException("Each converter objet must implement one of the" +
                            "Converter, ConverterFactory, or GenericConverter interfaces");
                }
            }
        }
    }

    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }
}
