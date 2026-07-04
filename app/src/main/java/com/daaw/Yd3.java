package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Yd3 {
    public boolean a;
    public Df3 b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    public Yd3(Df3 df3) {
        this.b = df3;
    }

    public final void a(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.c += i;
    }

    public final void b(int i) {
        this.a = true;
        this.f = true;
        this.g = i;
    }

    public final void c(Df3 df3) {
        this.a |= this.b != df3;
        this.b = df3;
    }

    public final void d(int i) {
        if (this.d && this.e != 5) {
            AbstractC6048km2.d(i == 5);
            return;
        }
        this.a = true;
        this.d = true;
        this.e = i;
    }
}
