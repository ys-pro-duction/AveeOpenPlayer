package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HX2 {
    public final Class a;
    public final Class b;

    public /* synthetic */ HX2(Class cls, Class cls2, GX2 gx2) {
        this.a = cls;
        this.b = cls2;
    }

    public static HX2 b(FX2 fx2, Class cls, Class cls2) {
        return new EX2(cls, cls2, fx2);
    }

    public abstract InterfaceC3738cY2 a(MT2 mt2);

    public final Class c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
