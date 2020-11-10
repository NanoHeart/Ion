package com.nanoheart.ion.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ServerProxy implements IProxy{

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Client Only");
    }
}
