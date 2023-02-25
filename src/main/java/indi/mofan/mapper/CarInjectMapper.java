package indi.mofan.mapper;

import indi.mofan.common.dto.CarDto;
import indi.mofan.common.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author mofan 2021/2/6
 */
@Mapper(componentModel = "spring")
public interface CarInjectMapper {

    @Mapping(source = "numberOfSeats", target = "seatCount")
    @Mapping(target = "manufacturingDate", ignore = true)
    CarDto carToCarDto(Car car);
}
