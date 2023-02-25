package indi.mofan.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author mofan 2021/2/3
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonInfo {
    private String firstName;
    private String lastName;
    private Integer gender;
    private String idCardNum;
}
