package com.daaw;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class HZ2 {
    public HashMap a = new HashMap();

    public final JZ2 a() {
        if (this.a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        JZ2 jz2 = new JZ2(DesugarCollections.unmodifiableMap(this.a), null);
        this.a = null;
        return jz2;
    }
}
