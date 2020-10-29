package jagextime;

import com.google.inject.Provides;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(name = "JagexTime", description = "Adds a Jagex time overlay which you can drag wherever you want")
public class JagexTimePlugin extends Plugin {
    @Inject
    public JagexTimeConfig config;

    @Inject
    public OverlayManager overlayManager;

    @Inject
    public JagexTimeOverlay jagexTimeOverlay;

    @Override
    protected void startUp() {
        overlayManager.add(jagexTimeOverlay);
    }

    @Override
    protected void shutDown() {
        overlayManager.add(jagexTimeOverlay);
    }

    @Provides
    public JagexTimeConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(JagexTimeConfig.class);
    }
}
