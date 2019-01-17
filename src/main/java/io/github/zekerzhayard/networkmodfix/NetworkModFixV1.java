package io.github.zekerzhayard.networkmodfix;

import com.netease.mc.mod.network.socket.NetworkHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "networkmodfix", version = "@VERSION@", dependencies = "required-after:networkmod;", acceptedMinecraftVersions = "[1.7.10]")
public class NetworkModFixV1 {
    @Mod.EventHandler()
    public void preInit(FMLPreInitializationEvent event) {
        NetworkHandler.networkHandler.register(ReplyHoldMinecraft.SMID, new ReplyHoldMinecraft());
    }
}
