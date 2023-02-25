package indi.mofan.test;

import indi.mofan.common.dto.StudentDto;
import indi.mofan.common.dto.TeacherDto;
import indi.mofan.common.entity.PersonInfo;
import indi.mofan.common.entity.UserInfo;
import indi.mofan.mapper.UserInfoMapper;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author mofan 2021/2/2
 */
public class UserInfoMapperTest {

    @Test
    public void testToStudent() {
        UserInfo userInfo = new UserInfo("1", "mofan", "123456",
                // 2020-11-02 21:54:29
                "开发部", 19, new Date(1604325269401L));
        StudentDto studentDto = UserInfoMapper.INSTANCE.toStudent(userInfo);

        System.out.println(studentDto.getId());
        System.out.println(studentDto.getUsername());
        System.out.println(studentDto.getPassword());
        System.out.println(studentDto.getDepartment());
        System.out.println(studentDto.getAge());
        System.out.println(studentDto.getCreateTime());
    }

    @Test
    public void testToTeacherDto() {
        UserInfo userInfo = new UserInfo("1", "mofan", "123456",
                // 2020-11-02 21:54:29
                "开发部", 19, new Date(1604325269401L));
        TeacherDto teacherDto = UserInfoMapper.INSTANCE.toTeacherDto(userInfo);
        assertEquals("123456", teacherDto.getPassword());
        assertNull(teacherDto.getFirstName());

        PersonInfo personInfo = new PersonInfo();
        personInfo.setFirstName("默");
        personInfo.setLastName("烦");
        personInfo.setGender(1);
        personInfo.setIdCardNum("123456788914725896");
        UserInfoMapper.INSTANCE.updateTeacherDto(personInfo, teacherDto);
        assertEquals("默", teacherDto.getFirstName());
        assertEquals(1, teacherDto.getSex().intValue());
    }
}
