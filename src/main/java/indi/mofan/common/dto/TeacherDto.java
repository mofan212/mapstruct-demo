package indi.mofan.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author mofan 2021/2/3
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private String id;
    private String username;
    private String password;
    private String department;
    private String age;
    private Date createTime;
    private String firstName;
    private String lastName;
    private Integer sex;
    private String idCardNum;
}
