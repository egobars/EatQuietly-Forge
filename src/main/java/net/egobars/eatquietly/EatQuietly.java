package net.egobars.eatquietly;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(EatQuietly.MOD_ID)
public class EatQuietly {
    public static final String MOD_ID = "eatquietly";
    public EatQuietly() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}

