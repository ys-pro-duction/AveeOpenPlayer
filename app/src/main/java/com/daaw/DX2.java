package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DX2 {
    public final Y23 a;
    public final Class b;

    public /* synthetic */ DX2(Y23 y23, Class cls, CX2 cx2) {
        this.a = y23;
        this.b = cls;
    }

    public static DX2 a(BX2 bx2, Y23 y23, Class cls) {
        return new AX2(y23, cls, bx2);
    }

    public final Y23 b() {
        return this.a;
    }

    public final Class c() {
        return this.b;
    }
}
