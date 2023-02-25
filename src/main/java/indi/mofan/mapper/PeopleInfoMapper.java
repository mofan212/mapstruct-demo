package indi.mofan.mapper;

import indi.mofan.common.dto.WorkerDto;
import indi.mofan.common.entity.PeopleInfo;
import indi.mofan.common.enums.GenderEnum;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * @author mofan 2021/2/3
 */
@Mapper
public interface PeopleInfoMapper {
    PeopleInfoMapper INSTANCE = Mappers.getMapper(PeopleInfoMapper.class);

    /**
     * 将 PeopleInfo 转换为 WorkerDto
     * @param peopleInfo peopleInfo实例
     * @return WorkerDto
     */
    @Mappings({
            @Mapping(target = "name", defaultValue = "默烦"),
            @Mapping(target = "age", expression = "java(java.lang.Integer.valueOf(peopleInfo.getAge()) + 1)"),
            @Mapping(target = "createTime", dateFormat = "yyyy-MM-dd"),
            @Mapping(target = "weight", numberFormat = "0.00"),
            @Mapping(target = "bloodType", constant = "A 型血"),
            @Mapping(source = "gender", target = "gender", qualifiedByName = "getGenderEnumCode")
    })
    WorkerDto toWorkerDto(PeopleInfo peopleInfo);

    /**
     * 将 DTO 转换为实体
     * @param workerDto workerDto 实例
     * @return PeopleInfo
     */
    @InheritInverseConfiguration(name = "toWorkerDto")
    @Mappings({
            @Mapping(target = "age", expression = "java(java.lang.String.valueOf(workerDto.getAge()))"),
            @Mapping(target = "bloodType", constant = "B 型血"),
            @Mapping(target = "gender", qualifiedByName = "getGenderEnum")
    })
    PeopleInfo fromPersonInfo(WorkerDto workerDto);

    /**
     * 根据枚举值的代码获取枚举值
     * @param code 枚举值对应的代码
     * @return 枚举值
     */
    @Named("getGenderEnum")
    default GenderEnum getGenderEnum(Integer code) {
        for (GenderEnum value : GenderEnum.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }

    /**
     * 根据性别枚举值获取对应的代码
     * @param genderEnum 枚举值
     * @return 枚举值对应的代码
     */
    @Named("getGenderEnumCode")
    default Integer getGenderEnumCode(GenderEnum genderEnum) {
        return genderEnum.getCode();
    }
}
