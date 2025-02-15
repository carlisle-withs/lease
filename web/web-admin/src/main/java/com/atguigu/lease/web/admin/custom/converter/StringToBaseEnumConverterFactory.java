package com.atguigu.lease.web.admin.custom.converter;

import com.atguigu.lease.model.enums.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

/**
 * Author: Carlisle Cullen
 * Date: 2025/1/9 下午1:03
 * projectName: com.atguigu.lease.web.admin.custom.converter
 * description: 通过实现ConverterFactory接口来实现从String向继承了BaseEnum类的所有子类的转换器
 */
@Component
public class StringToBaseEnumConverterFactory implements ConverterFactory<String, BaseEnum> {

    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return new Converter<String, T>() {
            @Override
            public T convert(String code) {
                T[] enumConstants = targetType.getEnumConstants();
                for (T enumConstant : enumConstants) {
                    if (enumConstant.getCode().equals(Integer.valueOf(code))) {
                        return enumConstant;
                    }
                }
                throw new IllegalArgumentException("code:" + code + "非法");
            }
        };
    }
}
