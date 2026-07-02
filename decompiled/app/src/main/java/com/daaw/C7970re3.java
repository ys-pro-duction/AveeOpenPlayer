package com.daaw;

/* JADX INFO: renamed from: com.daaw.re3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7970re3 {
    public final InterfaceC5485im a;
    public long b;

    public C7970re3(InterfaceC5485im interfaceC5485im) {
        AbstractC7506py0.l(interfaceC5485im);
        this.a = interfaceC5485im;
    }

    public final void a() {
        this.b = 0L;
    }

    public final void b() {
        this.b = this.a.b();
    }

    public final boolean c(long j) {
        return this.b == 0 || this.a.b() - this.b >= 3600000;
    }
}
