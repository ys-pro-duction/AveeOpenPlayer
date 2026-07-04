package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0780Ep implements PP0 {
    public final PP0[] B;

    public C0780Ep(PP0[] pp0Arr) {
        this.B = pp0Arr;
    }

    @Override // com.daaw.PP0
    public final long c() {
        long jMin = Long.MAX_VALUE;
        for (PP0 pp0 : this.B) {
            long jC = pp0.c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.daaw.PP0
    public boolean d(long j) {
        boolean zD;
        boolean z = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                return z;
            }
            zD = false;
            for (PP0 pp0 : this.B) {
                long jC2 = pp0.c();
                boolean z2 = jC2 != Long.MIN_VALUE && jC2 <= j;
                if (jC2 == jC || z2) {
                    zD |= pp0.d(j);
                }
            }
            z |= zD;
        } while (zD);
        return z;
    }

    @Override // com.daaw.PP0
    public final long f() {
        long jMin = Long.MAX_VALUE;
        for (PP0 pp0 : this.B) {
            long jF = pp0.f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.daaw.PP0
    public final void g(long j) {
        for (PP0 pp0 : this.B) {
            pp0.g(j);
        }
    }
}
