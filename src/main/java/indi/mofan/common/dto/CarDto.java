package indi.mofan.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author mofan 2021/2/2
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private String make;
    private int seatCount;
    private String type;
    private String manufacturingDate;
}
