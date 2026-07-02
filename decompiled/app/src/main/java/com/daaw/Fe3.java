package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Fe3 {
    public final Vp3 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public Fe3(Vp3 vp3, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        AbstractC6048km2.d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        AbstractC6048km2.d(z5);
        this.a = vp3;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final Fe3 a(long j) {
        return j == this.c ? this : new Fe3(this.a, this.b, j, this.d, this.e, false, this.g, this.h, this.i);
    }

    public final Fe3 b(long j) {
        return j == this.b ? this : new Fe3(this.a, j, this.c, this.d, this.e, false, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Fe3.class == obj.getClass()) {
            Fe3 fe3 = (Fe3) obj;
            if (this.b == fe3.b && this.c == fe3.c && this.d == fe3.d && this.e == fe3.e && this.g == fe3.g && this.h == fe3.h && this.i == fe3.i && AbstractC9004vJ2.e(this.a, fe3.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((((((((iHashCode * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
