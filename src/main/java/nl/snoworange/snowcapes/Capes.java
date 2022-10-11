package nl.snoworange.snowcapes;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;

import java.util.*;

public class Capes {

    public static final ResourceLocation CAPE = new ResourceLocation("textures/cape.png");
    List<UUID> uuids = new ArrayList<>();

    private static Capes instance;

    public Capes() {

        uuids.add(UUID.fromString("bcdd57f8-20eb-462c-820b-c49e25ca2e3f")); //DAMU33
        uuids.add(UUID.fromString("94fc4849-d083-45f6-8c1a-88d8d5216700")); //M1zuu
        uuids.add(UUID.fromString("22a3d51e-3bcd-4ffc-a2e5-6d5bc39988af")); //Wood_chan__
        uuids.add(UUID.fromString("7caa99c0-526a-4efa-b6fc-51313a4c6c1f")); //SASAEMON
        uuids.add(UUID.fromString("9258059e-8d81-415e-b00d-34b467daf14a")); //ittun0620
        uuids.add(UUID.fromString("9ddd4796-4a0e-48c2-86a0-cf5da1ebc233")); //7792
        uuids.add(UUID.fromString("74546e2c-bc1f-47dc-8f2d-c9cc1bba9551")); //Ritsucraft_
        uuids.add(UUID.fromString("240af40a-f4fc-495b-9c64-56fbedcc29f3")); //911kaito
        uuids.add(UUID.fromString("18e1b6a4-b013-4644-96e9-4d6d19081728")); //akito_010
        uuids.add(UUID.fromString("11514cd0-5888-49dc-bfe8-07fd4a0c24d2")); //Beefjerky2
        uuids.add(UUID.fromString("f4340302-d214-4bce-aa99-4a56a609ea89")); //AOITYOU
        uuids.add(UUID.fromString("395f2730-0550-46d3-aedd-f1bfc7eff71d")); //Ckara_hajimaru
        uuids.add(UUID.fromString("0da97ccd-281d-4831-8ae5-39c803f6dddc")); //kyosamal
        uuids.add(UUID.fromString("f1a6b142-a33a-450a-9266-33e326599aba")); //par1369083
        uuids.add(UUID.fromString("d9596862-6499-4f71-bc33-67e28ddbf855")); //HIKARI1216
        uuids.add(UUID.fromString("10f23a90-36bd-4172-8792-2879493e1c56")); //sheplet
        uuids.add(UUID.fromString("3550a26e-a0fd-4293-aaf2-b4441dacb35d")); //spfSky_uwu
        uuids.add(UUID.fromString("b373071e-e01a-4174-993b-1c0b9f705c74")); //sigmo_
        uuids.add(UUID.fromString("12be6dbf-fa99-4bd3-94cc-a9efa8f3982a")); //edokkoTV
        uuids.add(UUID.fromString("babf0d93-4d1e-4708-9e8d-26b09c659954")); //omoti_atiti
        uuids.add(UUID.fromString("1c4eefbf-45e3-45c9-bdc4-9e1c54fbf699")); //sweeper_ishida

        uuids.add(UUID.fromString("fe1ad3a4-9e5d-4f68-a04c-2e74bd07df42")); //SnoworangePVV

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
