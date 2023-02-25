package indi.mofan.common.entity;

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
public class UserInfo {
    private String id;
    private String username;
    private String pwd;
    private String dept;
    private Integer age;
    private Date createTime;
}
