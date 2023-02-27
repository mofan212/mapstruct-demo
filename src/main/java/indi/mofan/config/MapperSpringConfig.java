package indi.mofan.config;

import indi.mofan.adapter.MyAdapter;
import indi.mofan.common.dto.CarDto;
import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.ExternalConversion;
import org.mapstruct.extensions.spring.SpringMapperConfig;

import java.util.Optional;

/**
 * @author mofan
 * @date 2023/2/27 10:06
 */
@MapperConfig(componentModel = "spring", uses = MyAdapter.class)
@SpringMapperConfig(
        conversionServiceAdapterPackage = "indi.mofan.adapter",
        conversionServiceAdapterClassName = "MyAdapter",
        conversionServiceBeanName = "myConversionService",
        externalConversions = {@ExternalConversion(
                sourceType = CarDto.class,
                targetType = Optional.class
        )}
)
public interface MapperSpringConfig {
}
