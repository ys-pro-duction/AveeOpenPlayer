package com.daaw;

/* JADX INFO: renamed from: com.daaw.dX2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4013dX2 {
    public final Y23 a;
    public final Class b;

    public /* synthetic */ AbstractC4013dX2(Y23 y23, Class cls, AbstractC3734cX2 abstractC3734cX2) {
        this.a = y23;
        this.b = cls;
    }

    public static AbstractC4013dX2 b(InterfaceC3456bX2 interfaceC3456bX2, Y23 y23, Class cls) {
        return new C3177aX2(y23, cls, interfaceC3456bX2);
    }

    public abstract AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2);

    public final Y23 c() {
        return this.a;
    }

    public final Class d() {
        return this.b;
    }
}
