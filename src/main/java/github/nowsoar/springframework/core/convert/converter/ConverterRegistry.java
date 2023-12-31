package github.nowsoar.springframework.core.convert.converter;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public interface ConverterRegistry {

    void addConverter(Converter<?, ?> converter);

    void addConverter(GenericConverter converter);

    void addConverterFactory(ConverterFactory<?, ?> converterFactory);
}
