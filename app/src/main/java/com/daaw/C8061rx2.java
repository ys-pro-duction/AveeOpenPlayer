package com.daaw;

/* JADX INFO: renamed from: com.daaw.rx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8061rx2 {
    public final InterfaceFutureC8236sc0 a;
    public final long b;
    public final InterfaceC5485im c;

    public C8061rx2(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, long j, InterfaceC5485im interfaceC5485im) {
        this.a = interfaceFutureC8236sc0;
        this.c = interfaceC5485im;
        this.b = interfaceC5485im.b() + j;
    }

    public final boolean a() {
        return this.b < this.c.b();
    }
}
