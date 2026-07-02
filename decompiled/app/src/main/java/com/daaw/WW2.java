package com.daaw;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class WW2 {
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    public /* synthetic */ WW2(VW2 vw2) {
    }

    public final WW2 a(Enum r2, Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
        return this;
    }

    public final YW2 b() {
        return new YW2(DesugarCollections.unmodifiableMap(this.a), DesugarCollections.unmodifiableMap(this.b), null);
    }
}
