package indi.mofan.converter;

import indi.mofan.common.dto.CarDto;
import indi.mofan.common.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.core.convert.converter.Converter;

/**
 * @author mofan
 * @date 2023/2/26 21:45
 */
@Mapper(componentModel = "spring")
public interface CarConverter extends Converter<Car, CarDto> {
    @Mappings({
            @Mapping(target = "seatCount", source = "numberOfSeats"),
            @Mapping(target = "manufacturingDate", source = "manufacturingDate", dateFormat = "yyyy-MM-dd")
    })
    CarDto convert(Car car);
}
