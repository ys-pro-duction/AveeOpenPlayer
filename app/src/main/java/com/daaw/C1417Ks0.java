package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ks0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1417Ks0 {
    public final J11 a;
    public final T11 b;
    public final long c;
    public final C4726g21 d;
    public final C3197ac0 e;

    public /* synthetic */ C1417Ks0(J11 j11, T11 t11, long j, C4726g21 c4726g21, AbstractC2911Yw abstractC2911Yw) {
        this(j11, t11, j, c4726g21);
    }

    public static /* synthetic */ C1417Ks0 b(C1417Ks0 c1417Ks0, J11 j11, T11 t11, long j, C4726g21 c4726g21, int i, Object obj) {
        if ((i & 1) != 0) {
            j11 = c1417Ks0.a;
        }
        if ((i & 2) != 0) {
            t11 = c1417Ks0.b;
        }
        if ((i & 4) != 0) {
            j = c1417Ks0.c;
        }
        if ((i & 8) != 0) {
            c4726g21 = c1417Ks0.d;
        }
        C4726g21 c4726g212 = c4726g21;
        return c1417Ks0.a(j11, t11, j, c4726g212);
    }

    public final C1417Ks0 a(J11 j11, T11 t11, long j, C4726g21 c4726g21) {
        return new C1417Ks0(j11, t11, j, c4726g21, null, this.e, null);
    }

    public final long c() {
        return this.c;
    }

    public final C3197ac0 d() {
        return this.e;
    }

    public final AbstractC3848cv0 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1417Ks0)) {
            return false;
        }
        C1417Ks0 c1417Ks0 = (C1417Ks0) obj;
        if (!G10.c(this.a, c1417Ks0.a) || !G10.c(this.b, c1417Ks0.b) || !S21.e(this.c, c1417Ks0.c) || !G10.c(this.d, c1417Ks0.d)) {
            return false;
        }
        c1417Ks0.getClass();
        return G10.c(null, null) && G10.c(this.e, c1417Ks0.e);
    }

    public final J11 f() {
        return this.a;
    }

    public final T11 g() {
        return this.b;
    }

    public final C4726g21 h() {
        return this.d;
    }

    public int hashCode() {
        J11 j11 = this.a;
        int iK = (j11 != null ? J11.k(j11.m()) : 0) * 31;
        T11 t11 = this.b;
        int iJ = (((iK + (t11 != null ? T11.j(t11.l()) : 0)) * 31) + S21.i(this.c)) * 31;
        C4726g21 c4726g21 = this.d;
        int iHashCode = (iJ + (c4726g21 != null ? c4726g21.hashCode() : 0)) * 961;
        C3197ac0 c3197ac0 = this.e;
        return iHashCode + (c3197ac0 != null ? c3197ac0.hashCode() : 0);
    }

    public final C1417Ks0 i(C1417Ks0 c1417Ks0) {
        if (c1417Ks0 == null) {
            return this;
        }
        long j = T21.e(c1417Ks0.c) ? this.c : c1417Ks0.c;
        C4726g21 c4726g21 = c1417Ks0.d;
        if (c4726g21 == null) {
            c4726g21 = this.d;
        }
        C4726g21 c4726g212 = c4726g21;
        J11 j11 = c1417Ks0.a;
        if (j11 == null) {
            j11 = this.a;
        }
        J11 j112 = j11;
        T11 t11 = c1417Ks0.b;
        if (t11 == null) {
            t11 = this.b;
        }
        T11 t112 = t11;
        j(null);
        C3197ac0 c3197ac0 = c1417Ks0.e;
        if (c3197ac0 == null) {
            c3197ac0 = this.e;
        }
        return new C1417Ks0(j112, t112, j, c4726g212, null, c3197ac0, null);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.a + ", textDirection=" + this.b + ", lineHeight=" + ((Object) S21.j(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + ((Object) null) + ", lineHeightStyle=" + this.e + ')';
    }

    public /* synthetic */ C1417Ks0(J11 j11, T11 t11, long j, C4726g21 c4726g21, AbstractC3848cv0 abstractC3848cv0, C3197ac0 c3197ac0, AbstractC2911Yw abstractC2911Yw) {
        this(j11, t11, j, c4726g21, abstractC3848cv0, c3197ac0);
    }

    public C1417Ks0(J11 j11, T11 t11, long j, C4726g21 c4726g21, AbstractC3848cv0 abstractC3848cv0, C3197ac0 c3197ac0) {
        this.a = j11;
        this.b = t11;
        this.c = j;
        this.d = c4726g21;
        this.e = c3197ac0;
        if (S21.e(j, S21.b.a()) || S21.h(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + S21.h(j) + ')').toString());
    }

    public C1417Ks0(J11 j11, T11 t11, long j, C4726g21 c4726g21) {
        this(j11, t11, j, c4726g21, null, null, null);
    }

    public final AbstractC3848cv0 j(AbstractC3848cv0 abstractC3848cv0) {
        return abstractC3848cv0;
    }
}
