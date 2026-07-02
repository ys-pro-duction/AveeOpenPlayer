package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.ed1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4317ed1 extends AbstractC3482bd1 {
    public final String B;
    public final List C;
    public final int D;
    public final AbstractC2117Rg E;
    public final float F;
    public final AbstractC2117Rg G;
    public final float H;
    public final float I;
    public final int J;
    public final int K;
    public final float L;
    public final float M;
    public final float N;
    public final float O;

    public /* synthetic */ C4317ed1(String str, List list, int i, AbstractC2117Rg abstractC2117Rg, float f, AbstractC2117Rg abstractC2117Rg2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, AbstractC2911Yw abstractC2911Yw) {
        this(str, list, i, abstractC2117Rg, f, abstractC2117Rg2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    public final int D() {
        return this.J;
    }

    public final int E() {
        return this.K;
    }

    public final float F() {
        return this.L;
    }

    public final float G() {
        return this.I;
    }

    public final float H() {
        return this.N;
    }

    public final float I() {
        return this.O;
    }

    public final float J() {
        return this.M;
    }

    public final AbstractC2117Rg e() {
        return this.E;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G10.c(AbstractC5624jG0.b(C4317ed1.class), AbstractC5624jG0.b(obj.getClass()))) {
            C4317ed1 c4317ed1 = (C4317ed1) obj;
            return G10.c(this.B, c4317ed1.B) && G10.c(this.E, c4317ed1.E) && this.F == c4317ed1.F && G10.c(this.G, c4317ed1.G) && this.H == c4317ed1.H && this.I == c4317ed1.I && GY0.g(this.J, c4317ed1.J) && IY0.g(this.K, c4317ed1.K) && this.L == c4317ed1.L && this.M == c4317ed1.M && this.N == c4317ed1.N && this.O == c4317ed1.O && C7206ot0.f(this.D, c4317ed1.D) && G10.c(this.C, c4317ed1.C);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((this.B.hashCode() * 31) + this.C.hashCode()) * 31;
        AbstractC2117Rg abstractC2117Rg = this.E;
        int iHashCode2 = (((iHashCode + (abstractC2117Rg != null ? abstractC2117Rg.hashCode() : 0)) * 31) + Float.floatToIntBits(this.F)) * 31;
        AbstractC2117Rg abstractC2117Rg2 = this.G;
        return ((((((((((((((((((iHashCode2 + (abstractC2117Rg2 != null ? abstractC2117Rg2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.H)) * 31) + Float.floatToIntBits(this.I)) * 31) + GY0.h(this.J)) * 31) + IY0.h(this.K)) * 31) + Float.floatToIntBits(this.L)) * 31) + Float.floatToIntBits(this.M)) * 31) + Float.floatToIntBits(this.N)) * 31) + Float.floatToIntBits(this.O)) * 31) + C7206ot0.g(this.D);
    }

    public final float m() {
        return this.F;
    }

    public final String p() {
        return this.B;
    }

    public final List s() {
        return this.C;
    }

    public final int v() {
        return this.D;
    }

    public final AbstractC2117Rg w() {
        return this.G;
    }

    public final float y() {
        return this.H;
    }

    public C4317ed1(String str, List list, int i, AbstractC2117Rg abstractC2117Rg, float f, AbstractC2117Rg abstractC2117Rg2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.B = str;
        this.C = list;
        this.D = i;
        this.E = abstractC2117Rg;
        this.F = f;
        this.G = abstractC2117Rg2;
        this.H = f2;
        this.I = f3;
        this.J = i2;
        this.K = i3;
        this.L = f4;
        this.M = f5;
        this.N = f6;
        this.O = f7;
    }
}
