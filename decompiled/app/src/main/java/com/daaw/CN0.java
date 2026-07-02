package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class CN0 implements GJ {
    public final InterfaceC7290pB0 a;
    public final InterfaceC7290pB0 b;
    public final InterfaceC7290pB0 c;
    public final InterfaceC7290pB0 d;

    public CN0(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04) {
        this.a = interfaceC7290pB0;
        this.b = interfaceC7290pB02;
        this.c = interfaceC7290pB03;
        this.d = interfaceC7290pB04;
    }

    public static CN0 a(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04) {
        return new CN0(interfaceC7290pB0, interfaceC7290pB02, interfaceC7290pB03, interfaceC7290pB04);
    }

    public static InterfaceC1689Ni1 c(Context context, XH xh, AbstractC9018vN0 abstractC9018vN0, InterfaceC6333lm interfaceC6333lm) {
        return (InterfaceC1689Ni1) AbstractC7227oy0.c(BN0.a(context, xh, abstractC9018vN0, interfaceC6333lm), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1689Ni1 get() {
        return c((Context) this.a.get(), (XH) this.b.get(), (AbstractC9018vN0) this.c.get(), (InterfaceC6333lm) this.d.get());
    }
}
