package indi.mofan.converter;

import indi.mofan.common.dto.NestedDto;
import indi.mofan.common.dto.OptionalDto;
import indi.mofan.config.MapperSpringConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

/**
 * @author mofan
 * @date 2023/2/27 15:07
 */
@Mapper(config = MapperSpringConfig.class)
public interface OptionalConverter extends Converter<NestedDto, OptionalDto> {
    @Override
    @Mapping(source = "carDto", target = "optional")
    OptionalDto convert(NestedDto source);
}
