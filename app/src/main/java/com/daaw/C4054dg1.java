package com.daaw;

/* JADX INFO: renamed from: com.daaw.dg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4054dg1 implements InterfaceC5135hX {
    public float a = 50.0f;
    public float b = 50.0f;

    @Override // com.daaw.InterfaceC5135hX
    public float r(float f, float f2, C1458Lc1 c1458Lc1) {
        float f3 = this.b;
        c1458Lc1.a = f2 * f3;
        c1458Lc1.b = (-f) * f3;
        return 1.0f / ((((f * f) + (f2 * f2)) / this.a) + 1.0f);
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
    }
}
