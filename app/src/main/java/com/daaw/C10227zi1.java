package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.zi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10227zi1 implements GJ {
    public final InterfaceC7290pB0 a;
    public final InterfaceC7290pB0 b;
    public final InterfaceC7290pB0 c;
    public final InterfaceC7290pB0 d;

    public C10227zi1(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04) {
        this.a = interfaceC7290pB0;
        this.b = interfaceC7290pB02;
        this.c = interfaceC7290pB03;
        this.d = interfaceC7290pB04;
    }

    public static C10227zi1 a(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04) {
        return new C10227zi1(interfaceC7290pB0, interfaceC7290pB02, interfaceC7290pB03, interfaceC7290pB04);
    }

    public static C9948yi1 c(Executor executor, XH xh, InterfaceC1689Ni1 interfaceC1689Ni1, InterfaceC3591c01 interfaceC3591c01) {
        return new C9948yi1(executor, xh, interfaceC1689Ni1, interfaceC3591c01);
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9948yi1 get() {
        return c((Executor) this.a.get(), (XH) this.b.get(), (InterfaceC1689Ni1) this.c.get(), (InterfaceC3591c01) this.d.get());
    }
}
