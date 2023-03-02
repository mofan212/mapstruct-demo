package indi.mofan.mapper;

import indi.mofan.common.dto.FishTankWithVolumeDto;
import indi.mofan.common.dto.VolumeDto;
import indi.mofan.common.entity.FishTank;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author mofan 2021/2/7
 */
@Mapper
public abstract class FishTankMapperWithVolume {

    public static FishTankMapperWithVolume INSTANCE
            = Mappers.getMapper(FishTankMapperWithVolume.class);

    /**
     * <p>将 FishTank 转换为 FishTankWithVolumeDto</p>
     * <code>@Mapping</code> 注解的 source 属性值是 map() 方法的参数,
     * 而不是 FishTank 中的属性
     *
     * @param source FishTank实例
     * @return FishTankWithVolumeDto 实例
     */
    @Mapping(target = "fish.kind", source = "source.fish.type")
    @Mapping(target = "volume", source = "source")
    public abstract FishTankWithVolumeDto map(FishTank source);

    protected VolumeDto mapVolume(FishTank source) {
        int volume = source.getLength() * source.getWidth() * source.getHeight();
        String desc = volume < 100 ? "Small" : "Large";
        return new VolumeDto(volume, desc);
    }
}
