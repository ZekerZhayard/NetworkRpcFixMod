package io.github.zekerzhayard.networkmodfix;

import com.netease.mc.mod.network.socket.NetworkHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "networkmodfix", version = "@VERSION@", dependencies = "required-after:networkmod;", acceptedMinecraftVersions = "[1.8,1.12.2]")
public class NetworkModFixV2 {
    @Mod.EventHandler()
    public void preInit(FMLPreInitializationEvent event) {
        NetworkHandler.networkHandler.register(ReplyHoldMinecraft.SMID, new ReplyHoldMinecraft());
    }
}
