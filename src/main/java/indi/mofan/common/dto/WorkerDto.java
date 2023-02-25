package indi.mofan.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author mofan 2021/2/3
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WorkerDto {
    private Long id;
    private String name;
    private Integer age;
    private String createTime;
    private String weight;
    private String bloodType;
    private Integer gender;
}
