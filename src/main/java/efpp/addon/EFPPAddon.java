package efpp.addon;

import efpp.addon.modules.ElytraFlyPlusPlus;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EFPPAddon extends MeteorAddon {
    public static final Logger LOG = LoggerFactory.getLogger("EFPP-Addon");
    public static final Category CATEGORY = new Category("EFPP", Items.ELYTRA.getDefaultStack());

    @Override
    public void onInitialize() {
        LOG.info("Initializing EFPP-Addon");

        Modules.get().add(new ElytraFlyPlusPlus());

        LOG.info("EFPP-Addon initialized");
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "efpp.addon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("EFPP-Addon", "efpp-addon");
    }
}
