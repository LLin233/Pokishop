package io.ll.poki.bc.icons;

import com.joanzapata.iconify.Icon;

public enum PokishopIcons implements Icon {
    icon_scan('\ue602'),
    icon_ali_pay('\ue606');

    private char character;

    PokishopIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
