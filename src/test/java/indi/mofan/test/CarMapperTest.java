package indi.mofan.test;

import indi.mofan.common.dto.CarDto;
import indi.mofan.common.entity.Car;
import indi.mofan.mapper.CarMapper;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author mofan 2021/2/2
 */
public class CarMapperTest {


    @Test
    public void shouldMapCarToDto() {
        // given
        Car car = new Car( "Morris", 5,  "Sedan", new Date());

        // when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        // then
        assertNotNull(carDto);
        assertEquals("Morris", carDto.getMake());
        assertEquals(5, carDto.getSeatCount());
        assertEquals("Sedan", carDto.getType());
    }

    @Test
    public void testBeanMapping() {
        Car car = new Car( "Morris", 5,  "Sedan", new Date());
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
        System.out.println(carDto.getMake());
        System.out.println(carDto.getSeatCount());
        System.out.println(carDto.getType());
    }

    @Test
    public void testUseDate() {
        // 时间戳表示的时间为 2021-02-09 00:00:00
        Car car = new Car( "Morris", 5,  "Sedan", new Date(1612800000000L));
        CarDto carDto = CarMapper.INSTANCE.carToCarDtoUseDate(car);
        assertEquals("Morris", carDto.getMake());
        assertEquals(5, carDto.getSeatCount());
        assertEquals("Sedan", carDto.getType());
        assertEquals("2021-02-09", carDto.getManufacturingDate());
    }
}
