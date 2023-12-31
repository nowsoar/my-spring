package github.nowsoar.springframework.core.convert.converter;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public interface Converter<S, T> {

    T convert(S source);
}
