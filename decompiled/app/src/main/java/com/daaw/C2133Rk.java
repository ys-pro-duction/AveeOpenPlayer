package com.daaw;

import com.daaw.CO0;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2133Rk implements CO0 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public C2133Rk(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    public int a(long j) {
        return AbstractC6280lb1.e(this.e, j, true, true);
    }

    @Override // com.daaw.CO0
    public boolean e() {
        return true;
    }

    @Override // com.daaw.CO0
    public CO0.a g(long j) {
        int iA = a(j);
        EO0 eo0 = new EO0(this.e[iA], this.c[iA]);
        if (eo0.a >= j || iA == this.a - 1) {
            return new CO0.a(eo0);
        }
        int i = iA + 1;
        return new CO0.a(eo0, new EO0(this.e[i], this.c[i]));
    }

    @Override // com.daaw.CO0
    public long h() {
        return this.f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
