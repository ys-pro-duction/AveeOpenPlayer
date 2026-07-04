package com.daaw;

import com.daaw.C0765El0;
import com.daaw.CO0;

/* JADX INFO: renamed from: com.daaw.Xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2783Xq implements C0765El0.b {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;

    public C2783Xq(long j, long j2, C1285Jl0 c1285Jl0) {
        this.a = j2;
        this.b = c1285Jl0.c;
        this.d = c1285Jl0.f;
        if (j == -1) {
            this.c = -1L;
            this.e = -9223372036854775807L;
        } else {
            this.c = j - j2;
            this.e = b(j);
        }
    }

    @Override // com.daaw.C0765El0.b
    public long b(long j) {
        return (Math.max(0L, j - this.a) * 8000000) / ((long) this.d);
    }

    @Override // com.daaw.CO0
    public boolean e() {
        return this.c != -1;
    }

    @Override // com.daaw.CO0
    public CO0.a g(long j) {
        long j2 = this.c;
        if (j2 == -1) {
            return new CO0.a(new EO0(0L, this.a));
        }
        long j3 = (((long) this.d) * j) / 8000000;
        int i = this.b;
        long jM = AbstractC6280lb1.m((j3 / ((long) i)) * ((long) i), 0L, j2 - ((long) i));
        long j4 = this.a + jM;
        long jB = b(j4);
        EO0 eo0 = new EO0(jB, j4);
        if (jB < j) {
            long j5 = this.c;
            int i2 = this.b;
            if (jM != j5 - ((long) i2)) {
                long j6 = j4 + ((long) i2);
                return new CO0.a(eo0, new EO0(b(j6), j6));
            }
        }
        return new CO0.a(eo0);
    }

    @Override // com.daaw.CO0
    public long h() {
        return this.e;
    }
}
