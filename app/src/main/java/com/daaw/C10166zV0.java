package com.daaw;

/* JADX INFO: renamed from: com.daaw.zV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10166zV0 {
    public float a;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double b = Math.sqrt(50.0d);
    public float g = 1.0f;

    public C10166zV0(float f) {
        this.a = f;
    }

    public final float a() {
        return this.g;
    }

    public final float b() {
        double d = this.b;
        return (float) (d * d);
    }

    public final void c() {
        if (this.c) {
            return;
        }
        if (this.a == AV0.b()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f = this.g;
        double d = ((double) f) * ((double) f);
        if (f > 1.0f) {
            double d2 = this.b;
            double d3 = d - ((double) 1);
            this.d = (((double) (-f)) * d2) + (d2 * Math.sqrt(d3));
            double d4 = -this.g;
            double d5 = this.b;
            this.e = (d4 * d5) - (d5 * Math.sqrt(d3));
        } else if (f >= 0.0f && f < 1.0f) {
            this.f = this.b * Math.sqrt(((double) 1) - d);
        }
        this.c = true;
    }

    public final void d(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.g = f;
        this.c = false;
    }

    public final void e(float f) {
        this.a = f;
    }

    public final void f(float f) {
        if (b() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.b = Math.sqrt(f);
        this.c = false;
    }

    public final long g(float f, float f2, long j) {
        double dCos;
        double dExp;
        c();
        float f3 = f - this.a;
        double d = j / 1000.0d;
        float f4 = this.g;
        if (f4 > 1.0f) {
            double d2 = f3;
            double d3 = this.e;
            double d4 = f2;
            double d5 = this.d;
            double d6 = d2 - (((d3 * d2) - d4) / (d3 - d5));
            double d7 = ((d2 * d3) - d4) / (d3 - d5);
            dExp = (Math.exp(d3 * d) * d6) + (Math.exp(this.d * d) * d7);
            double d8 = this.e;
            double dExp2 = d6 * d8 * Math.exp(d8 * d);
            double d9 = this.d;
            dCos = dExp2 + (d7 * d9 * Math.exp(d9 * d));
        } else if (f4 == 1.0f) {
            double d10 = this.b;
            double d11 = f3;
            double d12 = ((double) f2) + (d10 * d11);
            double d13 = d11 + (d12 * d);
            double dExp3 = Math.exp((-d10) * d) * d13;
            double dExp4 = d13 * Math.exp((-this.b) * d);
            double d14 = this.b;
            dCos = (dExp4 * (-d14)) + (d12 * Math.exp((-d14) * d));
            dExp = dExp3;
        } else {
            double d15 = ((double) 1) / this.f;
            double d16 = this.b;
            double d17 = f3;
            double d18 = d15 * ((((double) f4) * d16 * d17) + ((double) f2));
            double dExp5 = Math.exp(((double) (-f4)) * d16 * d) * ((Math.cos(this.f * d) * d17) + (Math.sin(this.f * d) * d18));
            double d19 = this.b;
            float f5 = this.g;
            double d20 = (-d19) * dExp5 * ((double) f5);
            double dExp6 = Math.exp(((double) (-f5)) * d19 * d);
            double d21 = this.f;
            double dSin = (-d21) * d17 * Math.sin(d21 * d);
            double d22 = this.f;
            dCos = d20 + (dExp6 * (dSin + (d18 * d22 * Math.cos(d22 * d))));
            dExp = dExp5;
        }
        return AV0.a((float) (dExp + ((double) this.a)), (float) dCos);
    }
}
