package com.daaw;

import com.daaw.C0765El0;
import com.daaw.CO0;

/* JADX INFO: renamed from: com.daaw.Aj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0333Aj1 implements C0765El0.b {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long[] e;

    public C0333Aj1(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public static C0333Aj1 a(long j, long j2, C1285Jl0 c1285Jl0, C2584Vs0 c2584Vs0) {
        int iB;
        int i = c1285Jl0.g;
        int i2 = c1285Jl0.d;
        int i3 = c2584Vs0.i();
        if ((i3 & 1) != 1 || (iB = c2584Vs0.B()) == 0) {
            return null;
        }
        long jT = AbstractC6280lb1.T(iB, ((long) i) * 1000000, i2);
        if ((i3 & 6) != 6) {
            return new C0333Aj1(j2, c1285Jl0.c, jT);
        }
        long jB = c2584Vs0.B();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = c2584Vs0.x();
        }
        return new C0333Aj1(j2, c1285Jl0.c, jT, jB, jArr);
    }

    @Override // com.daaw.C0765El0.b
    public long b(long j) {
        long j2 = j - this.a;
        if (!e() || j2 <= this.b) {
            return 0L;
        }
        double d = (j2 * 256.0d) / this.d;
        int iE = AbstractC6280lb1.e(this.e, (long) d, true, true);
        long jC = c(iE);
        long j3 = this.e[iE];
        int i = iE + 1;
        long jC2 = c(i);
        return jC + Math.round((j3 == (iE == 99 ? 256L : this.e[i]) ? 0.0d : (d - j3) / (r8 - j3)) * (jC2 - jC));
    }

    public final long c(int i) {
        return (this.c * ((long) i)) / 100;
    }

    @Override // com.daaw.CO0
    public boolean e() {
        return this.e != null;
    }

    @Override // com.daaw.CO0
    public CO0.a g(long j) {
        if (!e()) {
            return new CO0.a(new EO0(0L, this.a + ((long) this.b)));
        }
        long jM = AbstractC6280lb1.m(j, 0L, this.c);
        double d = (jM * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = this.e[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new CO0.a(new EO0(jM, this.a + AbstractC6280lb1.m(Math.round((d2 / 256.0d) * this.d), this.b, this.d - 1)));
    }

    @Override // com.daaw.CO0
    public long h() {
        return this.c;
    }

    public C0333Aj1(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }
}
