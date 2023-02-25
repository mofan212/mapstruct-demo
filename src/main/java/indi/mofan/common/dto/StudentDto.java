package indi.mofan.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author mofan 2021/2/2
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private String id;
    private String username;
    private String password;
    private String department;
    private String age;
    private Date createTime;
}
