package efpp.addon.mixin;

import efpp.addon.modules.ElytraFlyPlusPlus;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(KeyBinding.class)
public abstract class KeyBindingMixin {
    @Final
    @Shadow
    private String id;

    @Unique
    ElytraFlyPlusPlus efly = null;

    @Inject(at = @At("RETURN"), method = "isPressed", cancellable = true)
    public void isPressed(CallbackInfoReturnable<Boolean> cir) {
        if (Modules.get() == null) return;
        efly = efly == null ? Modules.get().get(ElytraFlyPlusPlus.class) : efly;
        if (efly != null && efly.isActive() && efly.enabled() && id.equals("key.forward")) {
            cir.setReturnValue(true);
        }
    }
}
