package com.daaw;

/* JADX INFO: renamed from: com.daaw.Sn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2253Sn1 implements InterfaceC6903no1 {
    public final C2461Un1 a;
    public final long b;

    public C2253Sn1(C2461Un1 c2461Un1, long j) {
        this.a = c2461Un1;
        this.b = j;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        AbstractC6048km2.b(this.a.k);
        C2461Un1 c2461Un1 = this.a;
        C2357Tn1 c2357Tn1 = c2461Un1.k;
        long[] jArr = c2357Tn1.a;
        long[] jArr2 = c2357Tn1.b;
        int iO = AbstractC9004vJ2.o(jArr, c2461Un1.b(j), true, false);
        C7182oo1 c7182oo1C = c(iO == -1 ? 0L : jArr[iO], iO != -1 ? jArr2[iO] : 0L);
        if (c7182oo1C.a == j || iO == jArr.length - 1) {
            return new C6345lo1(c7182oo1C, c7182oo1C);
        }
        int i = iO + 1;
        return new C6345lo1(c7182oo1C, c(jArr[i], jArr2[i]));
    }

    public final C7182oo1 c(long j, long j2) {
        return new C7182oo1((j * 1000000) / ((long) this.a.e), this.b + j2);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.a.a();
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return true;
    }
}
