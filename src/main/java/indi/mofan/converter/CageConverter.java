package indi.mofan.converter;

import indi.mofan.adapter.MyAdapter;
import indi.mofan.common.dto.CageDto;
import indi.mofan.common.entity.Cage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

/**
 * @author mofan
 * @date 2023/2/27 0:34
 */
// @Mapper(componentModel = "spring", uses = ConversionServiceAdapter.class)
@Mapper(componentModel = "spring", uses = MyAdapter.class)
public interface CageConverter extends Converter<Cage, CageDto> {
    @Override
    @Mapping(source = "animal", target = "dog")
    CageDto convert(Cage source);
}
