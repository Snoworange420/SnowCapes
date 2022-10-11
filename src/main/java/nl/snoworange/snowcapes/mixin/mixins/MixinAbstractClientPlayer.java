package nl.snoworange.snowcapes.mixin.mixins;

import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import nl.snoworange.snowcapes.Capes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={AbstractClientPlayer.class})
public abstract class MixinAbstractClientPlayer {

    @Shadow
    @Nullable
    protected abstract NetworkPlayerInfo getPlayerInfo();

    @Inject(method={"getLocationCape"}, at={@At(value="HEAD")}, cancellable=true)
    public void getLocationCape(CallbackInfoReturnable<ResourceLocation> callbackInfoReturnable) {

        UUID uuid = getPlayerInfo().getGameProfile().getId();

        ResourceLocation cape = Capes.getCapeResource((AbstractClientPlayer)(Object)this);

        if (Capes.getInstance().hasCape(uuid)) {
            callbackInfoReturnable.setReturnValue(cape);
        }
    }
}
