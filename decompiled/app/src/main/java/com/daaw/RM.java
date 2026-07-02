package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class RM {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;

    public RM(byte[] bArr, int i) {
        C2480Us0 c2480Us0 = new C2480Us0(bArr);
        c2480Us0.m(i * 8);
        this.a = c2480Us0.h(16);
        this.b = c2480Us0.h(16);
        this.c = c2480Us0.h(24);
        this.d = c2480Us0.h(24);
        this.e = c2480Us0.h(20);
        this.f = c2480Us0.h(3) + 1;
        this.g = c2480Us0.h(5) + 1;
        this.h = ((((long) c2480Us0.h(4)) & 15) << 32) | (((long) c2480Us0.h(32)) & 4294967295L);
    }

    public int a() {
        return this.g * this.e;
    }

    public long b() {
        return (this.h * 1000000) / ((long) this.e);
    }
}
