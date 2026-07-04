package com.daaw;

import com.daaw.C0765El0;
import com.daaw.CO0;

/* JADX INFO: renamed from: com.daaw.Kc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1354Kc1 implements C0765El0.b {
    public final long[] a;
    public final long[] b;
    public final long c;

    public C1354Kc1(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
    }

    public static C1354Kc1 a(long j, long j2, C1285Jl0 c1285Jl0, C2584Vs0 c2584Vs0) {
        int iX;
        c2584Vs0.K(10);
        int i = c2584Vs0.i();
        C1354Kc1 c1354Kc1 = null;
        if (i <= 0) {
            return null;
        }
        int i2 = c1285Jl0.d;
        long jT = AbstractC6280lb1.T(i, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, i2);
        int iD = c2584Vs0.D();
        int iD2 = c2584Vs0.D();
        int iD3 = c2584Vs0.D();
        c2584Vs0.K(2);
        long j3 = j2 + ((long) c1285Jl0.c);
        long[] jArr = new long[iD];
        long[] jArr2 = new long[iD];
        long j4 = j2;
        int i3 = 0;
        while (i3 < iD) {
            C1354Kc1 c1354Kc12 = c1354Kc1;
            long j5 = jT;
            long j6 = j3;
            jArr[i3] = (((long) i3) * j5) / ((long) iD);
            jArr2[i3] = Math.max(j4, j6);
            if (iD3 == 1) {
                iX = c2584Vs0.x();
            } else if (iD3 == 2) {
                iX = c2584Vs0.D();
            } else if (iD3 == 3) {
                iX = c2584Vs0.A();
            } else {
                if (iD3 != 4) {
                    return c1354Kc12;
                }
                iX = c2584Vs0.B();
            }
            j4 += (long) (iX * iD2);
            i3++;
            j3 = j6;
            jT = j5;
            c1354Kc1 = c1354Kc12;
        }
        return new C1354Kc1(jArr, jArr2, jT);
    }

    @Override // com.daaw.C0765El0.b
    public long b(long j) {
        return this.a[AbstractC6280lb1.e(this.b, j, true, true)];
    }

    @Override // com.daaw.CO0
    public boolean e() {
        return true;
    }

    @Override // com.daaw.CO0
    public CO0.a g(long j) {
        int iE = AbstractC6280lb1.e(this.a, j, true, true);
        EO0 eo0 = new EO0(this.a[iE], this.b[iE]);
        if (eo0.a >= j || iE == this.a.length - 1) {
            return new CO0.a(eo0);
        }
        int i = iE + 1;
        return new CO0.a(eo0, new EO0(this.a[i], this.b[i]));
    }

    @Override // com.daaw.CO0
    public long h() {
        return this.c;
    }
}
