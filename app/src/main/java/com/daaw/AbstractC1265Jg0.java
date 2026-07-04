package com.daaw;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.Jg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1265Jg0 {
    public static final Object a(Map map, Object obj) {
        G10.g(map, "<this>");
        if (map instanceof InterfaceC0849Fg0) {
            return ((InterfaceC0849Fg0) map).q(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
