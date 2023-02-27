package indi.mofan.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

/**
 * @author mofan
 * @date 2023/2/27 15:06
 */
@Getter
@Setter
public class OptionalDto {
    private Optional<CarDto> optional;
}
