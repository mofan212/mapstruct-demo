package indi.mofan.mapper;

import indi.mofan.common.enums.ExternalOrderType;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.factory.Mappers;

/**
 * @author mofan
 * @date 2023/3/4 17:52
 */
@Mapper
public interface EnumStringMapper {
    EnumStringMapper INSTANCE = Mappers.getMapper(EnumStringMapper.class);

    @ValueMappings({
            @ValueMapping(source = MappingConstants.NULL, target = "DEFAULT"),
            @ValueMapping(source = "RETAIL", target = MappingConstants.NULL),
            @ValueMapping(source = MappingConstants.ANY_UNMAPPED, target = "SPECIAL")
    })
    String enumToString(ExternalOrderType type);

    @ValueMappings({
            @ValueMapping(source = MappingConstants.NULL, target = "DEFAULT"),
            @ValueMapping(source = "STANDARD", target = MappingConstants.NULL),
            @ValueMapping(source = MappingConstants.ANY_UNMAPPED, target = "SPECIAL")
    })
    ExternalOrderType stringToEnumWithUnmapped(String str);

    @ValueMappings({
            @ValueMapping(source = MappingConstants.NULL, target = "DEFAULT"),
            @ValueMapping(source = "STANDARD", target = MappingConstants.NULL),
            @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "SPECIAL")
    })
    ExternalOrderType stringToEnumWithRemaining(String str);
}
