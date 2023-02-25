package indi.mofan.mapper;

import indi.mofan.common.dto.CageDto;
import indi.mofan.common.dto.DogDto;
import indi.mofan.common.entity.Animal;
import indi.mofan.common.entity.Cage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author mofan 2021/2/7
 */
@Mapper
public interface CageMapper {

    CageMapper INSTANCE = Mappers.getMapper(CageMapper.class);

    @Mapping(source = "animal", target = "dog")
    CageDto toCageDto(Cage cage);

    DogDto toDogDto(Animal animal);
}
