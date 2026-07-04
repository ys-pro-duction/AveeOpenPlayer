package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.gu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4968gu implements GJ {
    public final InterfaceC7290pB0 a;
    public final InterfaceC7290pB0 b;
    public final InterfaceC7290pB0 c;

    public C4968gu(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03) {
        this.a = interfaceC7290pB0;
        this.b = interfaceC7290pB02;
        this.c = interfaceC7290pB03;
    }

    public static C4968gu a(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03) {
        return new C4968gu(interfaceC7290pB0, interfaceC7290pB02, interfaceC7290pB03);
    }

    public static C4689fu c(Context context, InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2) {
        return new C4689fu(context, interfaceC6333lm, interfaceC6333lm2);
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4689fu get() {
        return c((Context) this.a.get(), (InterfaceC6333lm) this.b.get(), (InterfaceC6333lm) this.c.get());
    }
}
