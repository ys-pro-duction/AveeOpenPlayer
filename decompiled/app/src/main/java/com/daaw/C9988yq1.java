package com.daaw;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzafl;

/* JADX INFO: renamed from: com.daaw.yq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9988yq1 implements InterfaceC0682Dq1 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public C9988yq1(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? AbstractC9004vJ2.C(jArr2[jArr2.length - 1]) : j;
    }

    public static C9988yq1 c(long j, zzafl zzaflVar, long j2) {
        int length = zzaflVar.F.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzaflVar.D + zzaflVar.F[i3]);
            j3 += (long) (zzaflVar.E + zzaflVar.G[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C9988yq1(jArr, jArr2, j2);
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        int iO = AbstractC9004vJ2.o(jArr, j, true, true);
        long j2 = jArr[iO];
        long j3 = jArr2[iO];
        int i = iO + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        Pair pairD = d(AbstractC9004vJ2.E(Math.max(0L, Math.min(j, this.c))), this.b, this.a);
        C7182oo1 c7182oo1 = new C7182oo1(AbstractC9004vJ2.C(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new C6345lo1(c7182oo1, c7182oo1);
    }

    @Override // com.daaw.InterfaceC0682Dq1
    public final long b(long j) {
        return AbstractC9004vJ2.C(((Long) d(j, this.a, this.b).second).longValue());
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC0682Dq1
    public final long zzc() {
        return -1L;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return true;
    }
}
