package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class X32 {
    public final M82 a;
    public final C4303ea2 b;

    public X32(M82 m82, C4303ea2 c4303ea2) {
        this.a = m82;
        this.b = c4303ea2;
    }

    public final M82 a() {
        return this.a;
    }

    public final C4303ea2 b() {
        return this.b;
    }

    public final C0623Db2 c() {
        C4303ea2 c4303ea2 = this.b;
        return c4303ea2 != null ? new C0623Db2(c4303ea2, AbstractC9322wT1.f) : new C0623Db2(new W32(this), AbstractC9322wT1.f);
    }
}
