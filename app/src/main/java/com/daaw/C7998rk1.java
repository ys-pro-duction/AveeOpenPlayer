package com.daaw;

/* JADX INFO: renamed from: com.daaw.rk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7998rk1 extends AbstractRunnableC5758jk1 {
    public final /* synthetic */ C0762Ek1 C;

    public C7998rk1(C0762Ek1 c0762Ek1) {
        this.C = c0762Ek1;
    }

    @Override // com.daaw.AbstractRunnableC5758jk1
    public final void b() {
        C0762Ek1 c0762Ek1 = this.C;
        if (c0762Ek1.m != null) {
            c0762Ek1.b.d("Unbind from service.", new Object[0]);
            C0762Ek1 c0762Ek12 = this.C;
            c0762Ek12.a.unbindService(c0762Ek12.l);
            this.C.g = false;
            this.C.m = null;
            this.C.l = null;
        }
        this.C.t();
    }
}
