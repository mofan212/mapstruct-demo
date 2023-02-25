package indi.mofan.mapper;

import indi.mofan.common.dto.CarDto;
import indi.mofan.common.entity.Car;
import indi.mofan.common.util.DateMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author mofan 2021/2/2
 */
@Mapper(uses = DateMapper.class)
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    /**
     * 将 Car 转换成 CarDto
     * @param car Car 实例
     * @return    对应的 DTO
     */
    @Mapping(source = "numberOfSeats", target = "seatCount")
    @Mapping(target = "manufacturingDate", ignore = true)
    CarDto carToCarDto(Car car);

    /**
     * 将 Car 转换成 CarDto，不忽略 Date
     * @param car Car 实例
     * @return    对应的 DTO
     */
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDtoUseDate(Car car);
}
