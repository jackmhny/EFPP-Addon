package efpp.addon.mixin;

import efpp.addon.modules.ElytraFlyPlusPlus;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.UUID;

import static meteordevelopment.meteorclient.MeteorClient.mc;

@Mixin(Entity.class)
public class EntityMixin {
    @Shadow
    protected UUID uuid;

    private ElytraFlyPlusPlus efly;

    private ElytraFlyPlusPlus getEfly() {
        if (efly == null) efly = Modules.get().get(ElytraFlyPlusPlus.class);
        return efly;
    }

    @Inject(at = @At("HEAD"), method = "Lnet/minecraft/entity/Entity;getPose()Lnet/minecraft/entity/EntityPose;", cancellable = true)
    private void getPose(CallbackInfoReturnable<EntityPose> cir) {
        ElytraFlyPlusPlus eflyModule = getEfly();
        if (eflyModule != null && eflyModule.enabled() && this.uuid == mc.player.getUuid()) {
            cir.setReturnValue(EntityPose.STANDING);
        }
    }

    @Inject(at = @At("HEAD"), method = "Lnet/minecraft/entity/Entity;isSprinting()Z", cancellable = true)
    private void isSprinting(CallbackInfoReturnable<Boolean> cir) {
        ElytraFlyPlusPlus eflyModule = getEfly();
        if (eflyModule != null && eflyModule.enabled() && this.uuid == mc.player.getUuid()) {
            cir.setReturnValue(true);
        }
    }
}
