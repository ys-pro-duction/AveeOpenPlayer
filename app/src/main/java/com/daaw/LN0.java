package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class LN0 implements GJ {
    public final InterfaceC7290pB0 a;
    public final InterfaceC7290pB0 b;
    public final InterfaceC7290pB0 c;

    public LN0(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03) {
        this.a = interfaceC7290pB0;
        this.b = interfaceC7290pB02;
        this.c = interfaceC7290pB03;
    }

    public static LN0 a(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03) {
        return new LN0(interfaceC7290pB0, interfaceC7290pB02, interfaceC7290pB03);
    }

    public static KN0 c(Context context, String str, int i) {
        return new KN0(context, str, i);
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KN0 get() {
        return c((Context) this.a.get(), (String) this.b.get(), ((Integer) this.c.get()).intValue());
    }
}
