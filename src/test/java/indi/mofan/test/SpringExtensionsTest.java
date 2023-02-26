package indi.mofan.test;

import indi.mofan.common.dto.CarDto;
import indi.mofan.common.entity.Car;
import indi.mofan.config.SpringConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mofan
 * @date 2023/2/26 21:50
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SpringExtensionsTest {
    @Autowired
    private ConversionService conversionService;

    @Test
    public void testSimpleUse() {
        Date manufacturingDate = new Date();
        Car car = new Car("Morris", 5,  "Sedan", manufacturingDate);
        CarDto carDto = conversionService.convert(car, CarDto.class);
        Assert.assertNotNull(carDto);
        Assert.assertEquals("Morris", carDto.getMake());
        Assert.assertEquals(5, carDto.getSeatCount());
        Assert.assertEquals("Sedan", carDto.getType());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = format.format(manufacturingDate);
        Assert.assertEquals(date, carDto.getManufacturingDate());
    }
}
