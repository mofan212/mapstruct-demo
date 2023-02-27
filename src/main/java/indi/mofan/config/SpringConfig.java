package indi.mofan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.List;

/**
 * @author mofan 2021/2/6
 */
@Configuration
// @ComponentScan({"indi.mofan.mapper", "indi.mofan.converter", "org.mapstruct.extensions.spring.converter"})
@ComponentScan("indi.mofan")
public class SpringConfig {

    @Bean
    public <S, T> DefaultConversionService myConversionService(List<Converter<S, T>> converters) {
        DefaultConversionService service = new DefaultConversionService();
        converters.forEach(service::addConverter);
        return service;
    }
}
