package indi.mofan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;

import java.util.List;

/**
 * @author mofan 2021/2/6
 */
@Configuration
@ComponentScan({"indi.mofan.mapper", "indi.mofan.converter"})
public class SpringConfig {

    @Bean
    public <S, T> GenericConversionService conversionService(List<Converter<S, T>> converters) {
        GenericConversionService service = new GenericConversionService();
        converters.forEach(service::addConverter);
        return service;
    }
}
