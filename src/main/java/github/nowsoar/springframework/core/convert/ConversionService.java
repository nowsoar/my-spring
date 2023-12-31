package github.nowsoar.springframework.core.convert;

import com.sun.istack.internal.Nullable;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public interface ConversionService {

    boolean canConvert(@Nullable Class<?> sourceType, Class<?> targetType);

    <T> T convert(Object source, Class<T> targetType);
}
