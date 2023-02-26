package indi.mofan.converter;

import indi.mofan.common.dto.DogDto;
import indi.mofan.common.entity.Animal;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

/**
 * @author mofan
 * @date 2023/2/27 0:33
 */
@Mapper(componentModel = "spring")
public interface AnimalConverter extends Converter<Animal, DogDto> {
    @Override
    DogDto convert(Animal source);
}
