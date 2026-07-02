package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class VO0 implements AX {
    public float c;
    public float a = 1.0f;
    public int b = 3;
    public float d = 0.0f;
    public PointF e = new PointF();
    public PointF f = new PointF();

    public VO0() {
        c(3);
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        this.a = c2591Vu.p("radius", 1.0f);
        c(c2591Vu.s("sides", 3));
    }

    public VO0 c(int i) {
        this.b = Math.max(i, 3);
        this.c = 6.2831855f / i;
        return this;
    }

    @Override // com.daaw.AX
    public int e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        float f2 = (z ? i2 - i : i) / i2;
        int i3 = this.b;
        float f3 = (int) (i3 * f2);
        float f4 = (f2 - (f3 / i3)) / (1.0f / i3);
        float f5 = this.c;
        double d = (f3 * f5) + this.d;
        double d2 = ((double) f5) + d;
        double d3 = (d + d2) * 0.5d;
        this.e.x = (float) ((-Math.sin(d)) * 1.0d);
        this.e.y = (float) (Math.cos(d) * 1.0d);
        this.f.x = (float) ((-Math.sin(d2)) * 1.0d);
        this.f.y = (float) (Math.cos(d2) * 1.0d);
        pointF2.x = (float) ((-Math.sin(d3)) * 1.0d);
        pointF2.y = (float) (Math.cos(d3) * 1.0d);
        PointF pointF3 = this.e;
        float f6 = pointF3.x;
        PointF pointF4 = this.f;
        pointF.x = f6 + ((pointF4.x - f6) * f4);
        float f7 = pointF3.y;
        pointF.y = f7 + ((pointF4.y - f7) * f4);
        float fWidth = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.a;
        pointF.x = rectF.centerX() + ((-pointF.x) * fWidth);
        pointF.y = rectF.centerY() + ((-pointF.y) * fWidth);
        return ((i + i2) - 1) % i2;
    }

    @Override // com.daaw.AX
    public int i(RectF rectF) {
        return this.b;
    }

    @Override // com.daaw.AX
    public float k(RectF rectF, int i) {
        return this.c * this.b * this.a * (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f;
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.Q("radius", this.a, "misc", 0.15f, 3.0f);
        c2591Vu.Y("sides", this.b, "misc", 3, 18);
    }

    @Override // com.daaw.AX
    public void d(InterfaceC9336wX interfaceC9336wX) {
    }
}
