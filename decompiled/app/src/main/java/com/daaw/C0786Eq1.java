package com.daaw;

/* JADX INFO: renamed from: com.daaw.Eq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0786Eq1 implements InterfaceC0682Dq1 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public C0786Eq1(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public static C0786Eq1 c(long j, long j2, C5219ho1 c5219ho1, C5900kE2 c5900kE2) {
        int iU;
        C5900kE2 c5900kE22 = c5900kE2;
        c5900kE22.h(10);
        int iO = c5900kE22.o();
        C0786Eq1 c0786Eq1 = null;
        if (iO <= 0) {
            return null;
        }
        int i = c5219ho1.d;
        long jD = AbstractC9004vJ2.D(iO, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iY = c5900kE22.y();
        int iY2 = c5900kE22.y();
        int iY3 = c5900kE22.y();
        c5900kE22.h(2);
        long j3 = j2 + ((long) c5219ho1.c);
        long[] jArr = new long[iY];
        long[] jArr2 = new long[iY];
        long j4 = j2;
        int i2 = 0;
        while (i2 < iY) {
            C0786Eq1 c0786Eq12 = c0786Eq1;
            int i3 = iY2;
            long j5 = j3;
            jArr[i2] = (((long) i2) * jD) / ((long) iY);
            jArr2[i2] = Math.max(j4, j5);
            if (iY3 == 1) {
                iU = c5900kE22.u();
            } else if (iY3 == 2) {
                iU = c5900kE22.y();
            } else if (iY3 == 3) {
                iU = c5900kE22.w();
            } else {
                if (iY3 != 4) {
                    return c0786Eq12;
                }
                iU = c5900kE22.x();
            }
            j4 += ((long) iU) * ((long) i3);
            i2++;
            iY2 = i3;
            j3 = j5;
            c5900kE22 = c5900kE2;
            c0786Eq1 = c0786Eq12;
            jArr = jArr;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j4) {
            AbstractC3305ay2.f("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new C0786Eq1(jArr3, jArr2, jD, j4);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        long[] jArr = this.a;
        int iO = AbstractC9004vJ2.o(jArr, j, true, true);
        C7182oo1 c7182oo1 = new C7182oo1(jArr[iO], this.b[iO]);
        if (c7182oo1.a < j) {
            long[] jArr2 = this.a;
            if (iO != jArr2.length - 1) {
                int i = iO + 1;
                return new C6345lo1(c7182oo1, new C7182oo1(jArr2[i], this.b[i]));
            }
        }
        return new C6345lo1(c7182oo1, c7182oo1);
    }

    @Override // com.daaw.InterfaceC0682Dq1
    public final long b(long j) {
        return this.a[AbstractC9004vJ2.o(this.b, j, true, true)];
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC0682Dq1
    public final long zzc() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return true;
    }
}
