package indi.mofan.common.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author mofan 2021/2/3
 */
@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class DogDto {
    private String name;
    private final String type;

//    protected DogDto (DogDto.Builder builder) {
//        this.type = builder.type;
//        this.name = builder.name;
//    }
//
//    /**
//     * 构建器创建方法
//     *
//     * @return 构建器
//     */
//    public static DogDto.Builder builder() {
//        return new DogDto.Builder();
//    }
//
//    public static class Builder {
//        private String type;
//        private String name;
//
//        public Builder type (String type) {
//            this.type = type;
//            return this;
//        }
//
//        public Builder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        /**
//         * 构建方法
//         *
//         * @return 被构建的对象
//         */
//        public DogDto create() {
//            return new DogDto(this);
//        }
//    }
}
