package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class RG2 implements InterfaceC6244lS2 {
    public final /* synthetic */ UG2 a;
    public final /* synthetic */ VG2 b;

    public RG2(VG2 vg2, UG2 ug2) {
        this.b = vg2;
        this.a = ug2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        synchronized (this.b) {
            try {
                this.b.e = null;
                this.b.d.addFirst(this.a);
                VG2 vg2 = this.b;
                if (vg2.f == 1) {
                    vg2.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        synchronized (this.b) {
            this.b.e = null;
        }
    }
}
