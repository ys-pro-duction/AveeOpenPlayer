package com.daaw;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E33 {
    public static volatile int d = 100;
    public int a;
    public final int b = d;
    public J33 c;

    public /* synthetic */ E33(D33 d33) {
    }

    public static int e(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long f(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static E33 g(InputStream inputStream, int i) {
        return new C33(inputStream, 4096, null);
    }

    public static E33 h(byte[] bArr, int i, int i2, boolean z) {
        C9771y33 c9771y33 = new C9771y33(bArr, i, i2, z, null);
        try {
            c9771y33.l(i2);
            return c9771y33;
        } catch (C8939v43 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A();

    public abstract void B(int i);

    public abstract void a(int i);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d(int i);

    public abstract double i();

    public abstract float j();

    public abstract int k();

    public abstract int l(int i);

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract long x();

    public abstract AbstractC9213w33 y();

    public abstract String z();
}
