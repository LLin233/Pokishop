package io.ll.pokishop;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import io.ll.poki.bc.icons.PokiShopFontModule;
import io.ll.poki.core.app.Poki;

public class PokiShopApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Poki.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new PokiShopFontModule())
                .configue();
    }
}
