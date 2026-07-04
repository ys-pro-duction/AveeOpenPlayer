package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.ak0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3237ak0 implements GJ {
    public final InterfaceC7290pB0 a;
    public final InterfaceC7290pB0 b;

    public C3237ak0(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02) {
        this.a = interfaceC7290pB0;
        this.b = interfaceC7290pB02;
    }

    public static C3237ak0 a(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02) {
        return new C3237ak0(interfaceC7290pB0, interfaceC7290pB02);
    }

    public static C2964Zj0 c(Context context, Object obj) {
        return new C2964Zj0(context, (C4689fu) obj);
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2964Zj0 get() {
        return c((Context) this.a.get(), this.b.get());
    }
}
