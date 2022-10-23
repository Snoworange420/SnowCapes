package nl.snoworange.snowcapes;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;

import java.util.*;

public class Capes {

    public static final ResourceLocation CAPE = new ResourceLocation("textures/cape.png");
    List<UUID> uuids = new ArrayList<>();

    private static Capes instance;

    public Capes() {

        // uuid management, this will control witch players's cape can be seen using the mod.
        // add uuids and replace as much as you want

        uuids.add(UUID.fromString("fe1ad3a4-9e5d-4f68-a04c-2e74bd07df42")); //example1
        uuids.add(UUID.fromString("6a5ecc1d-fd61-91bc-a22d-8b09cf67a1c5")); //example2

        instance = this;
    }

    public static Capes getInstance() {
        if (instance == null) {
            instance = new Capes();
        }
        return instance;
    }

    public static ResourceLocation getCapeResource(AbstractClientPlayer player) {
        return CAPE;
    }

    public boolean hasCape(UUID uuid) {
        return uuids.contains(uuid);
    }
}
