package com.daaw;

/* JADX INFO: renamed from: com.daaw.go1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4940go1 implements InterfaceC6903no1 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public C4940go1(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        AbstractC6048km2.d(length == length2);
        boolean z = length2 > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.c = j;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        if (!this.d) {
            C7182oo1 c7182oo1 = C7182oo1.c;
            return new C6345lo1(c7182oo1, c7182oo1);
        }
        int iO = AbstractC9004vJ2.o(this.b, j, true, true);
        C7182oo1 c7182oo12 = new C7182oo1(this.b[iO], this.a[iO]);
        if (c7182oo12.a != j) {
            long[] jArr = this.b;
            if (iO != jArr.length - 1) {
                int i = iO + 1;
                return new C6345lo1(c7182oo12, new C7182oo1(jArr[i], this.a[i]));
            }
        }
        return new C6345lo1(c7182oo12, c7182oo12);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return this.d;
    }
}
