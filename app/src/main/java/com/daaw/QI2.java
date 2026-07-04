package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class QI2 implements InterfaceC6244lS2 {
    public final /* synthetic */ TI2 a;
    public final /* synthetic */ EI2 b;
    public final /* synthetic */ boolean c;

    public QI2(TI2 ti2, EI2 ei2, boolean z) {
        this.a = ti2;
        this.b = ei2;
        this.c = z;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void a(Object obj) {
        EI2 ei2 = this.b;
        ei2.zzf(true);
        this.a.a(ei2);
        if (this.c) {
            this.a.g();
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        EI2 ei2 = this.b;
        if (ei2.zzj()) {
            TI2 ti2 = this.a;
            ei2.e(th);
            ei2.zzf(false);
            ti2.a(ei2);
            if (this.c) {
                this.a.g();
            }
        }
    }
}
