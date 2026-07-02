package com.daaw;

/* JADX INFO: renamed from: com.daaw.aP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3143aP0 implements BX {
    public float[] a = new float[4];
    public float[] b = {1.0f, 1.0f, 1.0f, 1.0f};
    public float[] c = {1.0f, 1.0f, 1.0f, 1.0f};
    public boolean d = false;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g;

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        u(c2591Vu.s("colorFrom", -1), c2591Vu.s("colorTo", -1), -1);
        v(c2591Vu.p("fixedHeight", 0.0f));
        this.f = c2591Vu.p("barHeightMultiplier", 1.0f);
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.V("colorFrom", VT.m(this.b), "misc");
        c2591Vu.V("colorTo", VT.m(this.c), "misc");
        c2591Vu.Q("fixedHeight", this.e, "misc", -50.0f, 50.0f);
        c2591Vu.Q("barHeightMultiplier", this.f, "misc", -2.0f, 2.0f);
    }

    public int s(int i, int i2, float f) {
        float f2 = ((i / i2) + (10.0f - f)) % 1.0f;
        this.g = f2;
        if (f2 <= 0.5f) {
            AbstractC0405Bb1.r(this.b, this.c, this.a, f2 * 2.0f);
        } else {
            AbstractC0405Bb1.r(this.c, this.b, this.a, (f2 - 0.5f) * 2.0f);
        }
        return VT.m(this.a);
    }

    public AbstractC3143aP0 t(int i) {
        return u(i, i, i);
    }

    public AbstractC3143aP0 u(int i, int i2, int i3) {
        VT.q(this.b, i);
        VT.q(this.c, i2);
        return this;
    }

    public AbstractC3143aP0 v(float f) {
        this.d = Math.abs(f) > 0.01f;
        this.e = f;
        return this;
    }
}
