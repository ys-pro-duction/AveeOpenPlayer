package com.daaw;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class XT2 {
    public final ConcurrentMap a;
    public final List b;
    public final PT2 c;
    public final Class d;
    public final JZ2 e;

    public /* synthetic */ XT2(ConcurrentMap concurrentMap, List list, PT2 pt2, JZ2 jz2, Class cls, WT2 wt2) {
        this.a = concurrentMap;
        this.b = list;
        this.c = pt2;
        this.d = cls;
        this.e = jz2;
    }

    public final PT2 a() {
        return this.c;
    }

    public final JZ2 b() {
        return this.e;
    }

    public final Class c() {
        return this.d;
    }

    public final Collection d() {
        return this.a.values();
    }

    public final List e(byte[] bArr) {
        List list = (List) this.a.get(new VT2(bArr, null));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public final boolean f() {
        return !this.e.a().isEmpty();
    }
}
