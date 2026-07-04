package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class VQ1 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceFutureC8236sc0 a;

    public VQ1(WQ1 wq1, InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        this.a = interfaceFutureC8236sc0;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        WQ1.m.remove(this.a);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        WQ1.m.remove(this.a);
    }
}
