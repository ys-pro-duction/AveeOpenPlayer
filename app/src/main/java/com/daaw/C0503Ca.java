package com.daaw;

import android.graphics.RectF;
import java.util.Random;

/* JADX INFO: renamed from: com.daaw.Ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0503Ca implements HW {
    public Random a = new Random();
    public float b = 0.0f;
    public float c = 1.0f;
    public C1665Nc1 d = new C1665Nc1(0.0f, 0.0f, 0.0f);
    public boolean e = false;
    public boolean f = false;

    public C0503Ca() {
        s(270.0f);
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        this.f = c2591Vu.o("use3dVectorInstead", this.f);
        this.e = c2591Vu.o("useRandomVectorInstead", this.e);
        s(c2591Vu.p("vectorAngle", c()));
        t(c2591Vu.p("vectorAngleZ", j()));
    }

    public float c() {
        return this.b;
    }

    public float j() {
        return this.c;
    }

    @Override // com.daaw.HW
    public void l(RectF rectF, C1665Nc1 c1665Nc1, C1665Nc1 c1665Nc12, boolean z) {
        float fNextFloat = this.a.nextFloat();
        float fNextFloat2 = this.a.nextFloat();
        c1665Nc1.a = rectF.left + (rectF.width() * fNextFloat);
        c1665Nc1.b = rectF.top + (rectF.height() * fNextFloat2);
        c1665Nc1.c = 0.0f;
        C1665Nc1 c1665Nc13 = this.d;
        c1665Nc12.c = c1665Nc13.c;
        if (this.f) {
            c1665Nc12.a = (fNextFloat * 2.0f) - 1.0f;
            c1665Nc12.b = (fNextFloat2 * 2.0f) - 1.0f;
        } else if (!this.e) {
            c1665Nc12.a = c1665Nc13.a;
            c1665Nc12.b = c1665Nc13.b;
        } else {
            float fNextFloat3 = this.a.nextFloat();
            float fNextFloat4 = this.a.nextFloat();
            c1665Nc12.a = (fNextFloat3 * 2.0f) - 1.0f;
            c1665Nc12.b = (fNextFloat4 * 2.0f) - 1.0f;
        }
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.N("use3dVectorInstead", this.f, "misc");
        c2591Vu.N("useRandomVectorInstead", this.e, "misc");
        c2591Vu.Q("vectorAngle", c(), "misc", 0.0f, 360.0f);
        c2591Vu.Q("vectorAngleZ", j(), "misc", -1.0f, 1.0f);
    }

    public C0503Ca s(float f) {
        this.b = f;
        u();
        return this;
    }

    public C0503Ca t(float f) {
        this.c = f;
        u();
        return this;
    }

    public final void u() {
        C1458Lc1 c1458Lc1H = C1458Lc1.h(this.b);
        float fAbs = 1.0f - Math.abs(this.c);
        C1665Nc1 c1665Nc1 = new C1665Nc1(c1458Lc1H.a * fAbs, c1458Lc1H.b * fAbs, this.c);
        this.d = c1665Nc1;
        c1665Nc1.c();
    }
}
