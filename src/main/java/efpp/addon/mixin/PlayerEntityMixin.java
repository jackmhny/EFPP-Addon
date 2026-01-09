package efpp.addon.mixin;

import efpp.addon.modules.ElytraFlyPlusPlus;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static meteordevelopment.meteorclient.MeteorClient.mc;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "travel", at = @At("HEAD"), cancellable = true)
    private void onTravel(CallbackInfo ci) {
        Modules modules = Modules.get();
        if (modules == null) return;

        if ((Object) this == mc.player) {
            ElytraFlyPlusPlus elytraFlyPP = modules.get(ElytraFlyPlusPlus.class);
            if (elytraFlyPP != null && elytraFlyPP.isActive() && elytraFlyPP.shouldDoChestSwapExploit()) {
                elytraFlyPP.doChestSwapExploit(ci);
            }
        }
    }
}
