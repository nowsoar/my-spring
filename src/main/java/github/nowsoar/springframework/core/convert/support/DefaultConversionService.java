package github.nowsoar.springframework.core.convert.support;

import github.nowsoar.springframework.core.convert.converter.ConverterRegistry;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public class DefaultConversionService extends GenericConversionService{

    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());

    }
}
