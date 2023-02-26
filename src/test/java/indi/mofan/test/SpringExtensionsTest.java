package indi.mofan.test;

import indi.mofan.common.dto.CageDto;
import indi.mofan.common.dto.CarDto;
import indi.mofan.common.entity.Animal;
import indi.mofan.common.entity.Cage;
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
    
    @Test
    public void testUseAdapter() {
        Cage cage = new Cage();
        Animal animal = new Animal("小黑", "Dog");
        cage.setAnimal(animal);
        cage.setName("小黑的家");
        cage.setSize("70*50*60");
        CageDto cageDto = conversionService.convert(cage, CageDto.class);
        Assert.assertNotNull(cageDto);
        Assert.assertEquals("小黑的家", cageDto.getName());
        Assert.assertEquals("70*50*60", cageDto.getSize());
        Assert.assertEquals("小黑", cageDto.getDog().getName());
        Assert.assertEquals("Dog", cageDto.getDog().getType());
    }
}
