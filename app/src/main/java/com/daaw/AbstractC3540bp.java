package com.daaw;

/* JADX INFO: renamed from: com.daaw.bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3540bp {
    public static final int a(InterfaceC5781jp interfaceC5781jp, int i) {
        return interfaceC5781jp.I();
    }

    public static final UE0 b(InterfaceC5781jp interfaceC5781jp, int i) {
        UE0 ue0B = interfaceC5781jp.b();
        if (ue0B == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        interfaceC5781jp.j(ue0B);
        return ue0B;
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final AbstractC1300Jp d(InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(-1165786124);
        AbstractC1300Jp abstractC1300JpJ = interfaceC5781jp.J();
        interfaceC5781jp.L();
        return abstractC1300JpJ;
    }
}
