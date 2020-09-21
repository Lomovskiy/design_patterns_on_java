package com.lomovskiy.dpoj.creational.multitone;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Multitone {

    public static Multitone getInstance(MultitoneType type) {
        if (!_instances.containsKey(type)) {
            _instances.put(type, new Multitone(type));
        }
        return _instances.get(type);
    }

    private static final Map<MultitoneType, Multitone> _instances = new HashMap<>();

    @NotNull
    private final MultitoneType _type;

    public Multitone(@NotNull MultitoneType type) {
        _type = type;
    }

}
