package com.daaw;

import com.daaw.CO0;

/* JADX INFO: renamed from: com.daaw.ng1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6863ng1 implements CO0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public long h;

    public C6863ng1(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public int a() {
        return this.b * this.e * this.a;
    }

    public long b(long j) {
        return (Math.max(0L, j - this.g) * 1000000) / ((long) this.c);
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    @Override // com.daaw.CO0
    public boolean e() {
        return true;
    }

    public int f() {
        return this.a;
    }

    @Override // com.daaw.CO0
    public CO0.a g(long j) {
        long j2 = (((long) this.c) * j) / 1000000;
        int i = this.d;
        long jM = AbstractC6280lb1.m((j2 / ((long) i)) * ((long) i), 0L, this.h - ((long) i));
        long j3 = this.g + jM;
        long jB = b(j3);
        EO0 eo0 = new EO0(jB, j3);
        if (jB < j) {
            long j4 = this.h;
            int i2 = this.d;
            if (jM != j4 - ((long) i2)) {
                long j5 = j3 + ((long) i2);
                return new CO0.a(eo0, new EO0(b(j5), j5));
            }
        }
        return new CO0.a(eo0);
    }

    @Override // com.daaw.CO0
    public long h() {
        return ((this.h / ((long) this.d)) * 1000000) / ((long) this.b);
    }

    public int i() {
        return this.b;
    }

    public boolean j() {
        return (this.g == 0 || this.h == 0) ? false : true;
    }

    public void k(long j, long j2) {
        this.g = j;
        this.h = j2;
    }
}
