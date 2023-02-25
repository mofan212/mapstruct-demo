package indi.mofan.mapper;

import indi.mofan.common.annotation.FromUserInfo;
import indi.mofan.common.dto.StudentDto;
import indi.mofan.common.dto.TeacherDto;
import indi.mofan.common.entity.PersonInfo;
import indi.mofan.common.entity.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * @author mofan 2021/2/2
 */
@Mapper
public interface UserInfoMapper {

    UserInfoMapper INSTANCE = Mappers.getMapper(UserInfoMapper.class);

    /**
     * 转换为 StudentDto
     * @param userInfo userInfo
     * @return StudentDto 实例
     */
    @FromUserInfo
    @Mapping(source = "pwd", target = "password")
    StudentDto toStudent(UserInfo userInfo);

    /**
     * 转换为 TeacherDto --> 缺少部分属性值
     * @param userInfo userInfo
     * @return TeacherDto 实例
     */
    @Mapping(source = "pwd", target = "password")
    @Mapping(source = "dept", target = "department")
    TeacherDto toTeacherDto(UserInfo userInfo);

    /**
     * 更新 TeacherDto 实例 --> 补充缺少的属性值
     * @param personInfo personInfo
     * @param teacherDto teacherDto
     */
    @Mapping(source = "gender", target = "sex")
    void updateTeacherDto(PersonInfo personInfo, @MappingTarget TeacherDto teacherDto);
}
