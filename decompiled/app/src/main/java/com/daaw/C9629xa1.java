package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.xa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9629xa1 implements GJ {
    public final InterfaceC7290pB0 a;
    public final InterfaceC7290pB0 b;
    public final InterfaceC7290pB0 c;
    public final InterfaceC7290pB0 d;
    public final InterfaceC7290pB0 e;
    public final InterfaceC7290pB0 f;
    public final InterfaceC7290pB0 g;
    public final InterfaceC7290pB0 h;
    public final InterfaceC7290pB0 i;

    public C9629xa1(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04, InterfaceC7290pB0 interfaceC7290pB05, InterfaceC7290pB0 interfaceC7290pB06, InterfaceC7290pB0 interfaceC7290pB07, InterfaceC7290pB0 interfaceC7290pB08, InterfaceC7290pB0 interfaceC7290pB09) {
        this.a = interfaceC7290pB0;
        this.b = interfaceC7290pB02;
        this.c = interfaceC7290pB03;
        this.d = interfaceC7290pB04;
        this.e = interfaceC7290pB05;
        this.f = interfaceC7290pB06;
        this.g = interfaceC7290pB07;
        this.h = interfaceC7290pB08;
        this.i = interfaceC7290pB09;
    }

    public static C9629xa1 a(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04, InterfaceC7290pB0 interfaceC7290pB05, InterfaceC7290pB0 interfaceC7290pB06, InterfaceC7290pB0 interfaceC7290pB07, InterfaceC7290pB0 interfaceC7290pB08, InterfaceC7290pB0 interfaceC7290pB09) {
        return new C9629xa1(interfaceC7290pB0, interfaceC7290pB02, interfaceC7290pB03, interfaceC7290pB04, interfaceC7290pB05, interfaceC7290pB06, interfaceC7290pB07, interfaceC7290pB08, interfaceC7290pB09);
    }

    public static C9350wa1 c(Context context, InterfaceC2627Wd interfaceC2627Wd, XH xh, InterfaceC1689Ni1 interfaceC1689Ni1, Executor executor, InterfaceC3591c01 interfaceC3591c01, InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2, InterfaceC2033Ql interfaceC2033Ql) {
        return new C9350wa1(context, interfaceC2627Wd, xh, interfaceC1689Ni1, executor, interfaceC3591c01, interfaceC6333lm, interfaceC6333lm2, interfaceC2033Ql);
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9350wa1 get() {
        return c((Context) this.a.get(), (InterfaceC2627Wd) this.b.get(), (XH) this.c.get(), (InterfaceC1689Ni1) this.d.get(), (Executor) this.e.get(), (InterfaceC3591c01) this.f.get(), (InterfaceC6333lm) this.g.get(), (InterfaceC6333lm) this.h.get(), (InterfaceC2033Ql) this.i.get());
    }
}
