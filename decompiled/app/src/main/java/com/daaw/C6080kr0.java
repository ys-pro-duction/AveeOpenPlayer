package com.daaw;

/* JADX INFO: renamed from: com.daaw.kr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6080kr0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ C6080kr0(long j, L90 l90, AbstractC2911Yw abstractC2911Yw) {
        this(j, l90);
    }

    public static /* synthetic */ C6080kr0 b(C6080kr0 c6080kr0, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = c6080kr0.a;
        }
        if ((i5 & 2) != 0) {
            i2 = c6080kr0.b;
        }
        if ((i5 & 4) != 0) {
            i3 = c6080kr0.c;
        }
        if ((i5 & 8) != 0) {
            i4 = c6080kr0.d;
        }
        return c6080kr0.a(i, i2, i3, i4);
    }

    public final C6080kr0 a(int i, int i2, int i3, int i4) {
        return new C6080kr0(i, i2, i3, i4);
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6080kr0)) {
            return false;
        }
        C6080kr0 c6080kr0 = (C6080kr0) obj;
        return this.a == c6080kr0.a && this.b == c6080kr0.b && this.c == c6080kr0.c && this.d == c6080kr0.d;
    }

    public final int f() {
        return this.a;
    }

    public final long g(L90 l90) {
        G10.g(l90, "orientation");
        return l90 == L90.Horizontal ? AbstractC6916nr.a(this.a, this.b, this.c, this.d) : AbstractC6916nr.a(this.c, this.d, this.a, this.b);
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.a + ", mainAxisMax=" + this.b + ", crossAxisMin=" + this.c + ", crossAxisMax=" + this.d + ')';
    }

    public C6080kr0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6080kr0(long j, L90 l90) {
        L90 l902 = L90.Horizontal;
        this(l90 == l902 ? C6079kr.p(j) : C6079kr.o(j), l90 == l902 ? C6079kr.n(j) : C6079kr.m(j), l90 == l902 ? C6079kr.o(j) : C6079kr.p(j), l90 == l902 ? C6079kr.m(j) : C6079kr.n(j));
    }
}
