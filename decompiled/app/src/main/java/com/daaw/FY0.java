package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class FY0 extends PD {
    public static final a e = new a(null);
    public static final int f = GY0.b.a();
    public static final int g = IY0.b.b();
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ FY0(float f2, float f3, int i, int i2, InterfaceC6927nt0 interfaceC6927nt0, AbstractC2911Yw abstractC2911Yw) {
        this(f2, f3, i, i2, interfaceC6927nt0);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final float c() {
        return this.b;
    }

    public final InterfaceC6927nt0 d() {
        return null;
    }

    public final float e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FY0)) {
            return false;
        }
        FY0 fy0 = (FY0) obj;
        if (this.a != fy0.a || this.b != fy0.b || !GY0.g(this.c, fy0.c) || !IY0.g(this.d, fy0.d)) {
            return false;
        }
        fy0.getClass();
        return G10.c(null, null);
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + GY0.h(this.c)) * 31) + IY0.h(this.d)) * 31;
    }

    public String toString() {
        return "Stroke(width=" + this.a + ", miter=" + this.b + ", cap=" + ((Object) GY0.i(this.c)) + ", join=" + ((Object) IY0.i(this.d)) + ", pathEffect=" + ((Object) null) + ')';
    }

    public /* synthetic */ FY0(float f2, float f3, int i, int i2, InterfaceC6927nt0 interfaceC6927nt0, int i3, AbstractC2911Yw abstractC2911Yw) {
        this((i3 & 1) != 0 ? 0.0f : f2, (i3 & 2) != 0 ? 4.0f : f3, (i3 & 4) != 0 ? GY0.b.a() : i, (i3 & 8) != 0 ? IY0.b.b() : i2, (i3 & 16) != 0 ? null : interfaceC6927nt0, null);
    }

    public FY0(float f2, float f3, int i, int i2, InterfaceC6927nt0 interfaceC6927nt0) {
        super(null);
        this.a = f2;
        this.b = f3;
        this.c = i;
        this.d = i2;
    }
}
