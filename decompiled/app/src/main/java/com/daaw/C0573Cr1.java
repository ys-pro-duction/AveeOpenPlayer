package com.daaw;

/* JADX INFO: renamed from: com.daaw.Cr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0573Cr1 implements InterfaceC1206Ir1 {
    public final C2461Un1 a;
    public final C2357Tn1 b;
    public long c = -1;
    public long d = -1;

    public C0573Cr1(C2461Un1 c2461Un1, C2357Tn1 c2357Tn1) {
        this.a = c2461Un1;
        this.b = c2357Tn1;
    }

    @Override // com.daaw.InterfaceC1206Ir1
    public final void a(long j) {
        long[] jArr = this.b.a;
        this.d = jArr[AbstractC9004vJ2.o(jArr, j, true, true)];
    }

    @Override // com.daaw.InterfaceC1206Ir1
    public final long b(InterfaceC1190In1 interfaceC1190In1) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        this.d = -1L;
        return -(j + 2);
    }

    public final void c(long j) {
        this.c = j;
    }

    @Override // com.daaw.InterfaceC1206Ir1
    public final InterfaceC6903no1 zze() {
        AbstractC6048km2.f(this.c != -1);
        return new C2253Sn1(this.a, this.c);
    }
}
