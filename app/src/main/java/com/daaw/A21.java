package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A21 {
    public final C9764y21 a;
    public final C2244Sl0 b;
    public final long c;
    public final float d;
    public final float e;
    public final List f;

    public /* synthetic */ A21(C9764y21 c9764y21, C2244Sl0 c2244Sl0, long j, AbstractC2911Yw abstractC2911Yw) {
        this(c9764y21, c2244Sl0, j);
    }

    public static /* synthetic */ int k(A21 a21, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return a21.j(i, z);
    }

    public final A21 a(C9764y21 c9764y21, long j) {
        G10.g(c9764y21, "layoutInput");
        return new A21(c9764y21, this.b, j, null);
    }

    public final C3103aF0 b(int i) {
        return this.b.b(i);
    }

    public final boolean c() {
        return this.b.c() || ((float) I00.f(this.c)) < this.b.e();
    }

    public final boolean d() {
        return ((float) I00.g(this.c)) < this.b.r();
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A21)) {
            return false;
        }
        A21 a21 = (A21) obj;
        return G10.c(this.a, a21.a) && G10.c(this.b, a21.b) && I00.e(this.c, a21.c) && this.d == a21.d && this.e == a21.e && G10.c(this.f, a21.f);
    }

    public final boolean f() {
        return d() || c();
    }

    public final float g() {
        return this.e;
    }

    public final C9764y21 h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + I00.h(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final int i() {
        return this.b.h();
    }

    public final int j(int i, boolean z) {
        return this.b.i(i, z);
    }

    public final int l(int i) {
        return this.b.j(i);
    }

    public final int m(float f) {
        return this.b.k(f);
    }

    public final int n(int i) {
        return this.b.l(i);
    }

    public final float o(int i) {
        return this.b.m(i);
    }

    public final C2244Sl0 p() {
        return this.b;
    }

    public final int q(long j) {
        return this.b.n(j);
    }

    public final II0 r(int i) {
        return this.b.o(i);
    }

    public final List s() {
        return this.f;
    }

    public final long t() {
        return this.c;
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) I00.i(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }

    public A21(C9764y21 c9764y21, C2244Sl0 c2244Sl0, long j) {
        this.a = c9764y21;
        this.b = c2244Sl0;
        this.c = j;
        this.d = c2244Sl0.d();
        this.e = c2244Sl0.g();
        this.f = c2244Sl0.q();
    }
}
