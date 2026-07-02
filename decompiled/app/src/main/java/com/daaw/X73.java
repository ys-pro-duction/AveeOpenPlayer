package com.daaw;

import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X73 implements InterfaceC4758g83 {
    public final Map a;

    public X73(Map map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }

    public final Map a() {
        return this.a;
    }
}
