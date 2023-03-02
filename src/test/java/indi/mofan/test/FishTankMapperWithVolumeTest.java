package indi.mofan.test;

import indi.mofan.common.dto.FishTankWithVolumeDto;
import indi.mofan.common.entity.Fish;
import indi.mofan.common.entity.FishTank;
import indi.mofan.mapper.FishTankMapperWithVolume;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mofan 2021/2/7
 */
public class FishTankMapperWithVolumeTest {

    @Test
    public void testToFishTankWithVolumeDto() {
        FishTank fishTank = new FishTank();
        fishTank.setLength(70);
        fishTank.setWidth(50);
        fishTank.setHeight(60);
        Fish fish = new Fish();
        fish.setType("Carp");
        fishTank.setFish(fish);
        FishTankWithVolumeDto dto = FishTankMapperWithVolume.INSTANCE.map(fishTank);
        Assert.assertEquals(210000, dto.getVolume().getVolume());
        Assert.assertEquals("Large", dto.getVolume().getDescription());
        Assert.assertEquals("Carp", dto.getFish().getKind());
    }
}
