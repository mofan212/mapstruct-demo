package indi.mofan.common.entity;

import indi.mofan.common.enums.GenderEnum;
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
@NoArgsConstructor
@AllArgsConstructor
public class PeopleInfo {
    private Long id;
    private String name;
    private String age;
    private Date createTime;
    private Double weight;
    private String bloodType;
    private GenderEnum gender;
}
