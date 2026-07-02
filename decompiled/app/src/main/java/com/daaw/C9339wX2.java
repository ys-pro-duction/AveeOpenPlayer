package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.wX2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9339wX2 {
    public static final C9339wX2 b = new C9339wX2();
    public final AtomicReference a = new AtomicReference(new WX2(new OX2(null), null));

    public static C9339wX2 a() {
        return b;
    }

    public final Class b(Class cls) {
        return ((WX2) this.a.get()).a(cls);
    }

    public final Object c(AbstractC8758uT2 abstractC8758uT2, Class cls) {
        return ((WX2) this.a.get()).b(abstractC8758uT2, cls);
    }

    public final Object d(XT2 xt2, Class cls) {
        return ((WX2) this.a.get()).c(xt2, cls);
    }

    public final synchronized void e(LX2 lx2) {
        OX2 ox2 = new OX2((WX2) this.a.get(), null);
        ox2.a(lx2);
        this.a.set(new WX2(ox2, null));
    }

    public final synchronized void f(YT2 yt2) {
        OX2 ox2 = new OX2((WX2) this.a.get(), null);
        ox2.b(yt2);
        this.a.set(new WX2(ox2, null));
    }
}
