package indi.mofan.mapper;

import indi.mofan.common.dto.DogDto;
import indi.mofan.common.entity.Animal;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author mofan 2021/2/3
 */
@Mapper
public interface AnimalMapper {

    AnimalMapper INSTANCE = Mappers.getMapper(AnimalMapper.class);

    /**
     * 将 Animal 转换为 DogDTO
     * @param animal Animal 实例
     * @return DogDto 实例
     */
    DogDto toDogDto(Animal animal);
}
