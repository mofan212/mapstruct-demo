package indi.mofan.test;

import indi.mofan.config.SpringConfig;
import indi.mofan.common.dto.CarDto;
import indi.mofan.common.entity.Car;
import indi.mofan.mapper.CarInjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author mofan 2021/2/6
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class DependencyInjectionTest {

    @Autowired
    private CarInjectMapper carInjectMapper;

    @Test
    public void shouldMapCarToDto() {
        Car car = new Car( "Morris", 5,  "Sedan", new Date());
        CarDto carDto = carInjectMapper.carToCarDto(car);
        assertNotNull(carDto);
        assertEquals("Morris", carDto.getMake());
        assertEquals(5, carDto.getSeatCount());
        assertEquals("Sedan", carDto.getType());
    }
}
