package io.ll.poki.core.app;

import android.content.Context;

import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.logging.Handler;

public final class Poki {
    public static Configurator init(Context context) {
        Configurator.getInstance()
                .getPokiConfigs()
                .put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static Configurator getConfigurator() {
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(ConfigType key) {
        return getConfigurator().getConfiguration(key);
    }

    public static Context getApplicationContext() {
        return getConfiguration(ConfigType.APPLICATION_CONTEXT);
    }

}
