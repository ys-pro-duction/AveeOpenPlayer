package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.vn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9136vn1 implements InterfaceC6903no1 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public C9136vn1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        long[] jArr = this.e;
        int iO = AbstractC9004vJ2.o(jArr, j, true, true);
        C7182oo1 c7182oo1 = new C7182oo1(jArr[iO], this.c[iO]);
        if (c7182oo1.a >= j || iO == this.a - 1) {
            return new C6345lo1(c7182oo1, c7182oo1);
        }
        int i = iO + 1;
        return new C6345lo1(c7182oo1, new C7182oo1(this.e[i], this.c[i]));
    }

    public final String toString() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        long[] jArr3 = this.c;
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.f;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return true;
    }
}
