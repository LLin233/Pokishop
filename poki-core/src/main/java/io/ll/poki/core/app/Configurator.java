package io.ll.poki.core.app;

import com.joanzapata.iconify.IconFontDescriptor;
import com.joanzapata.iconify.Iconify;

import java.util.ArrayList;
import java.util.HashMap;

public class Configurator {
    private static final HashMap<String, Object> POKI_CONFIGS = new HashMap<>();
    private static final ArrayList<IconFontDescriptor> ICONS = new ArrayList<>();
    public final HashMap<String, Object> getPokiConfigs() {
        return POKI_CONFIGS;
    }

    /**
     * Singleton
     */
    private Configurator(){
        POKI_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }
    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }
    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }


    private void checkConfiguration() {
        final boolean isReady = (boolean) POKI_CONFIGS.get(ConfigType.CONFIG_READY.name());
        if (!isReady) {
            throw new RuntimeException("Configuration is not ready, please complete configurations");
        }
    }

    @SuppressWarnings("unchecked")
    final<T> T getConfiguration (Enum<ConfigType> key) {
        checkConfiguration();
        return (T) POKI_CONFIGS.get(key.name());
    }


    /**
     * API
     */
    public final void configue() {
        initIcons();
        POKI_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }

    public final Configurator withApiHost(String host) {
        POKI_CONFIGS.put(ConfigType.API_HOST.name(), host);
        return this;
    }

    public final Configurator withIcon(IconFontDescriptor descriptor) {
        ICONS.add(descriptor);
        return this;
    }

    /**
     * ICONS
     */
    private void initIcons() {
        if (ICONS.size() > 0) {
            final Iconify.IconifyInitializer initializer = Iconify.with(ICONS.get(0));
            for (int i = 1; i < ICONS.size(); i++) {
                initializer.with(ICONS.get(i));
            }
        }
    }
}
