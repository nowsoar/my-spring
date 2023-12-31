package github.nowsoar.springframework.core.convert.converter;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public interface ConverterFactory<S, R> {

    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
