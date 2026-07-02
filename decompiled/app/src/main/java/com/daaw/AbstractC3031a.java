package com.daaw;

/* JADX INFO: renamed from: com.daaw.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3031a implements InterfaceC8492tX {
    public float a = 1.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e;

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        this.a = c2591Vu.p("Speed", 100.0f);
        this.b = c2591Vu.p("speedRandom", 60.0f);
        this.d = c2591Vu.p("trailLength", 0.0f);
    }

    @Override // com.daaw.InterfaceC8492tX
    public float b() {
        return this.d;
    }

    public void c(float f) {
        this.a = f;
    }

    public void j(float f) {
        this.b = f;
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.Q("Speed", this.a, "behaviour", -300.0f, 300.0f);
        c2591Vu.Q("speedRandom", this.b, "behaviour", -300.0f, 300.0f);
        c2591Vu.Q("trailLength", this.d, "appearance", 0.0f, 1.0f);
    }

    public void s(float f) {
        this.d = f;
    }
}
