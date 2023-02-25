package indi.mofan.test;

import indi.mofan.common.dto.CageDto;
import indi.mofan.common.entity.Animal;
import indi.mofan.common.entity.Cage;
import indi.mofan.mapper.CageMapper;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mofan 2021/2/7
 */
public class CageMapperTest {

    @Test
    public void testToCageDto() {
        Cage cage = new Cage();
        Animal animal = new Animal("小黑", "Dog");
        cage.setAnimal(animal);
        cage.setName("小黑的家");
        cage.setSize("70*50*60");
        CageDto cageDto = CageMapper.INSTANCE.toCageDto(cage);
        Assert.assertEquals("小黑的家", cageDto.getName());
        Assert.assertEquals("70*50*60", cageDto.getSize());
        Assert.assertEquals("小黑", cageDto.getDog().getName());
        Assert.assertEquals("Dog", cageDto.getDog().getType());
    }
}
