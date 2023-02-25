package indi.mofan.common.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author mofan 2021/2/7
 */
@Setter
@Getter
public class Cage {
    private String name;
    private String size;
    private Animal animal;
}
