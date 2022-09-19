package ru.inline.armcheck.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum TypePC {

    SYSTEM_UNIT("Стационарный"),
    LAPTOP("Ноутбук"),
    MONO("Моноблок")
    ;

    @Getter
    private final String name;

}
