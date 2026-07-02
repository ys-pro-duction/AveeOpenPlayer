package com.daaw;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.xQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9588xQ0 {
    public static Set a(Set set) {
        G10.g(set, "builder");
        return ((C7907rQ0) set).s();
    }

    public static Set b() {
        return new C7907rQ0();
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        G10.f(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
