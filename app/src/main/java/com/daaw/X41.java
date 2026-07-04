package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class X41 {
    public C1539Lx a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public W41 o;
    public int p;
    public C2584Vs0 q;
    public boolean r;
    public long s;

    public void a(InterfaceC9001vJ interfaceC9001vJ) {
        interfaceC9001vJ.g(this.q.a, 0, this.p);
        this.q.J(0);
        this.r = false;
    }

    public void b(C2584Vs0 c2584Vs0) {
        c2584Vs0.g(this.q.a, 0, this.p);
        this.q.J(0);
        this.r = false;
    }

    public long c(int i) {
        return this.k[i] + ((long) this.j[i]);
    }

    public void d(int i) {
        C2584Vs0 c2584Vs0 = this.q;
        if (c2584Vs0 == null || c2584Vs0.d() < i) {
            this.q = new C2584Vs0(i);
        }
        this.p = i;
        this.m = true;
        this.r = true;
    }

    public void e(int i, int i2) {
        this.e = i;
        this.f = i2;
        int[] iArr = this.h;
        if (iArr == null || iArr.length < i) {
            this.g = new long[i];
            this.h = new int[i];
        }
        int[] iArr2 = this.i;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.i = new int[i3];
            this.j = new int[i3];
            this.k = new long[i3];
            this.l = new boolean[i3];
            this.n = new boolean[i3];
        }
    }

    public void f() {
        this.e = 0;
        this.s = 0L;
        this.m = false;
        this.r = false;
        this.o = null;
    }
}
