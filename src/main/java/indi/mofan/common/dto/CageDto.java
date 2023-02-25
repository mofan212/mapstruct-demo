package indi.mofan.common.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author mofan 2021/2/7
 */
@Getter
@Setter
public class CageDto {
    private String name;
    private String size;
    private DogDto dog;
}
