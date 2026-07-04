package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LX2 {
    public final Class a;
    public final Class b;

    public /* synthetic */ LX2(Class cls, Class cls2, KX2 kx2) {
        this.a = cls;
        this.b = cls2;
    }

    public static LX2 b(JX2 jx2, Class cls, Class cls2) {
        return new IX2(cls, cls2, jx2);
    }

    public abstract Object a(AbstractC8758uT2 abstractC8758uT2);

    public final Class c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
