package cc.woverflow.debugify.fabric.integrations;

import cc.woverflow.debugify.Debugify;
import cc.woverflow.debugify.config.ConfigGuiHelper;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return (parent) -> ConfigGuiHelper.createConfigGui(Debugify.config, parent);
    }
}
