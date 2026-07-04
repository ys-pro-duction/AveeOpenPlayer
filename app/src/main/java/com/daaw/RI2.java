package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class RI2 implements InterfaceC6244lS2 {
    public final /* synthetic */ TI2 a;
    public final /* synthetic */ EI2 b;

    public RI2(TI2 ti2, EI2 ei2) {
        this.a = ti2;
        this.b = ei2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        EI2 ei2 = this.b;
        ei2.e(th);
        ei2.zzf(false);
        this.a.a(ei2);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void a(Object obj) {
    }
}
