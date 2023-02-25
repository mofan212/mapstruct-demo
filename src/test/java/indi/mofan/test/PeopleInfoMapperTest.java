package indi.mofan.test;

import indi.mofan.common.dto.WorkerDto;
import indi.mofan.common.entity.PeopleInfo;
import indi.mofan.common.enums.GenderEnum;
import indi.mofan.mapper.PeopleInfoMapper;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author mofan 2021/2/3
 */
public class PeopleInfoMapperTest {
    @Test
    public void testInheritInverseConfiguration() {
        PeopleInfo peopleInfo = new PeopleInfo();
        peopleInfo.setId(233L);
        // 缺少 name 属性值
        peopleInfo.setAge("18");
        peopleInfo.setCreateTime(new Date(1604325269401L));
        peopleInfo.setWeight(122.2345);
        peopleInfo.setBloodType("AB 型血");
        peopleInfo.setGender(GenderEnum.MAN);

        // to workerDto
        WorkerDto workerDto = PeopleInfoMapper.INSTANCE.toWorkerDto(peopleInfo);
        assertEquals("默烦", workerDto.getName());
        assertEquals(1, workerDto.getGender().intValue());
        assertEquals(19, workerDto.getAge().intValue());
        System.out.println(workerDto.getCreateTime());
        System.out.println(workerDto.getWeight());
        System.out.println(workerDto.getBloodType());

        // from PeopleInfo
        PeopleInfo person = PeopleInfoMapper.INSTANCE.fromPersonInfo(workerDto);
        assertEquals("B 型血", person.getBloodType());
        assertEquals("19", person.getAge());
        assertEquals(GenderEnum.MAN, person.getGender());
    }
}
