package com.daaw;

import android.graphics.RectF;
import java.util.Random;

/* JADX INFO: renamed from: com.daaw.Aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0295Aa implements HW {
    public Random a = new Random();
    public float b = 0.0f;
    public float c = 1.0f;
    public C1458Lc1 d = new C1458Lc1(0.0f, 0.0f);
    public boolean e = true;
    public boolean f = false;

    public C0295Aa() {
        t(270.0f);
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        v(c2591Vu.o("verticalOrientation", false));
        this.e = c2591Vu.o("useRandomVectorInstead", true);
        t(c2591Vu.p("vectorAngle", 270.0f));
        u(c2591Vu.p("vectorAngleZ", 1.0f));
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
        c1665Nc12.c = 0.0f;
        if (this.f) {
            c1665Nc1.a = rectF.centerX();
            c1665Nc1.b = rectF.top + (rectF.height() * fNextFloat);
            c1665Nc1.c = 0.0f;
        } else {
            c1665Nc1.a = rectF.left + (rectF.width() * fNextFloat);
            c1665Nc1.b = rectF.centerY();
            c1665Nc1.c = 0.0f;
        }
        if (this.e) {
            float fNextFloat2 = this.a.nextFloat();
            float fNextFloat3 = this.a.nextFloat();
            c1665Nc12.a = (fNextFloat2 * 2.0f) - 1.0f;
            c1665Nc12.b = (fNextFloat3 * 2.0f) - 1.0f;
        } else {
            C1458Lc1 c1458Lc1 = this.d;
            c1665Nc12.a = c1458Lc1.a;
            c1665Nc12.b = c1458Lc1.b;
        }
        if (z) {
            float fAbs = 1.0f - Math.abs(this.c);
            c1665Nc12.a *= fAbs;
            c1665Nc12.b *= fAbs;
            c1665Nc12.c = this.c;
            c1665Nc12.c();
        }
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.N("verticalOrientation", s(), "misc");
        c2591Vu.N("useRandomVectorInstead", this.e, "misc");
        c2591Vu.Q("vectorAngle", c(), "misc", 0.0f, 360.0f);
        c2591Vu.Q("vectorAngleZ", j(), "misc", -1.0f, 1.0f);
    }

    public boolean s() {
        return this.f;
    }

    public C0295Aa t(float f) {
        this.b = f;
        this.d = C1458Lc1.h(f);
        return this;
    }

    public C0295Aa u(float f) {
        this.c = f;
        return this;
    }

    public C0295Aa v(boolean z) {
        this.f = z;
        return this;
    }
}
