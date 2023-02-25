package indi.mofan.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author mofan 2021/2/3
 */
public enum GenderEnum {
    /**
     * 男
     */
    MAN(1, "男"),
    /**
     * 女
     */
    WOMAN(0, "女");

    @Setter
    @Getter
    private Integer code;

    @Setter
    @Getter
    private String desc;

    GenderEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
