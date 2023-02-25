package indi.mofan.test;

import indi.mofan.common.dto.DogDto;
import indi.mofan.common.entity.Animal;
import indi.mofan.mapper.AnimalMapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mofan 2021/2/3
 */
public class AnimalMapperTest {
    @Test
    public void testToDogDto() {
        Animal animal = new Animal();
        animal.setName("小黑");
        animal.setType("dog");

        DogDto dogDto = AnimalMapper.INSTANCE.toDogDto(animal);
        assertEquals("小黑", dogDto.getName());
        assertEquals("dog", dogDto.getType());
    }
}
