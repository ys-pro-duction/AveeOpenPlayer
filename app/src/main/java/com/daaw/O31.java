package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class O31 extends ON0 implements Runnable {
    public final long F;

    public O31(long j, InterfaceC1416Ks interfaceC1416Ks) {
        super(interfaceC1416Ks.getContext(), interfaceC1416Ks);
        this.F = j;
    }

    @Override // com.daaw.AbstractC9472x, com.daaw.C3889d40
    public String m0() {
        return super.m0() + "(timeMillis=" + this.F + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        v(P31.a(this.F, AbstractC0391Ay.b(getContext()), this));
    }
}
