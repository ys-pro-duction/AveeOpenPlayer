package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.q83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7558q83 {
    public final List a;
    public final List b;

    public /* synthetic */ C7558q83(int i, int i2, AbstractC7279p83 abstractC7279p83) {
        this.a = Y73.c(i);
        this.b = Y73.c(i2);
    }

    public final C7558q83 a(InterfaceC8394t83 interfaceC8394t83) {
        this.b.add(interfaceC8394t83);
        return this;
    }

    public final C7558q83 b(InterfaceC8394t83 interfaceC8394t83) {
        this.a.add(interfaceC8394t83);
        return this;
    }

    public final C7836r83 c() {
        return new C7836r83(this.a, this.b, null);
    }
}
