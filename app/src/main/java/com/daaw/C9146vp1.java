package com.daaw;

/* JADX INFO: renamed from: com.daaw.vp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9146vp1 implements InterfaceC1398Kn1 {
    public final long B;
    public final InterfaceC1398Kn1 C;

    public C9146vp1(long j, InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.B = j;
        this.C = interfaceC1398Kn1;
    }

    @Override // com.daaw.InterfaceC1398Kn1
    public final void b() {
        this.C.b();
    }

    @Override // com.daaw.InterfaceC1398Kn1
    public final InterfaceC8576to1 o(int i, int i2) {
        return this.C.o(i, i2);
    }

    @Override // com.daaw.InterfaceC1398Kn1
    public final void p(InterfaceC6903no1 interfaceC6903no1) {
        this.C.p(new C8860up1(this, interfaceC6903no1, interfaceC6903no1));
    }
}
