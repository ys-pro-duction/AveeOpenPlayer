package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2081Qx implements GJ {
    public final InterfaceC7290pB0 a;
    public final InterfaceC7290pB0 b;
    public final InterfaceC7290pB0 c;
    public final InterfaceC7290pB0 d;
    public final InterfaceC7290pB0 e;

    public C2081Qx(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04, InterfaceC7290pB0 interfaceC7290pB05) {
        this.a = interfaceC7290pB0;
        this.b = interfaceC7290pB02;
        this.c = interfaceC7290pB03;
        this.d = interfaceC7290pB04;
        this.e = interfaceC7290pB05;
    }

    public static C2081Qx a(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04, InterfaceC7290pB0 interfaceC7290pB05) {
        return new C2081Qx(interfaceC7290pB0, interfaceC7290pB02, interfaceC7290pB03, interfaceC7290pB04, interfaceC7290pB05);
    }

    public static C1955Px c(Executor executor, InterfaceC2627Wd interfaceC2627Wd, InterfaceC1689Ni1 interfaceC1689Ni1, XH xh, InterfaceC3591c01 interfaceC3591c01) {
        return new C1955Px(executor, interfaceC2627Wd, interfaceC1689Ni1, xh, interfaceC3591c01);
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1955Px get() {
        return c((Executor) this.a.get(), (InterfaceC2627Wd) this.b.get(), (InterfaceC1689Ni1) this.c.get(), (XH) this.d.get(), (InterfaceC3591c01) this.e.get());
    }
}
