package io.ll.poki.bc.icons;
import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class PokiShopFontModule implements IconFontDescriptor {
    @Override
    public String ttfFileName() {
        return "iconfont.ttf";
    }

    @Override
    public Icon[] characters() {
        return PokishopIcons.values();
    }
}
