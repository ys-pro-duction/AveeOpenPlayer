package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class GY {
    public static final a f = new a(null);
    public static final GY g = new GY(false, 0, false, 0, 0, 31, null);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final GY a() {
            return GY.g;
        }

        public a() {
        }
    }

    public /* synthetic */ GY(boolean z, int i, boolean z2, int i2, int i3, AbstractC2911Yw abstractC2911Yw) {
        this(z, i, z2, i2, i3);
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GY)) {
            return false;
        }
        GY gy = (GY) obj;
        return this.a == gy.a && W70.f(this.b, gy.b) && this.c == gy.c && X70.k(this.d, gy.d) && FY.l(this.e, gy.e);
    }

    public final boolean f() {
        return this.a;
    }

    public int hashCode() {
        return (((((((AbstractC8813ug.a(this.a) * 31) + W70.g(this.b)) * 31) + AbstractC8813ug.a(this.c)) * 31) + X70.l(this.d)) * 31) + FY.m(this.e);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) W70.h(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) X70.m(this.d)) + ", imeAction=" + ((Object) FY.n(this.e)) + ')';
    }

    public GY(boolean z, int i, boolean z2, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ GY(boolean z, int i, boolean z2, int i2, int i3, int i4, AbstractC2911Yw abstractC2911Yw) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? W70.a.b() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? X70.a.h() : i2, (i4 & 16) != 0 ? FY.b.a() : i3, null);
    }
}
