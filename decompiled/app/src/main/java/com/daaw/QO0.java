package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class QO0 implements AX {
    public float a = 1.0f;
    public float b = 0.0f;

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        this.a = c2591Vu.p("radius", 1.0f);
        this.b = c2591Vu.p("gap", 0.0f);
    }

    @Override // com.daaw.AX
    public int e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        float f2 = ((z ? i2 - i : i) / i2) + f;
        float f3 = this.b;
        double d = ((double) ((f2 * (1.0f - f3)) + (f3 * 0.5f))) * 6.283185307179586d;
        pointF2.x = (float) ((-Math.sin(d)) * 1.0d);
        pointF2.y = (float) (Math.cos(d) * 1.0d);
        float fWidth = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.a;
        pointF.x = rectF.centerX() + ((-pointF2.x) * fWidth);
        pointF.y = rectF.centerY() + ((-pointF2.y) * fWidth);
        return ((i + i2) - 1) % i2;
    }

    @Override // com.daaw.AX
    public int i(RectF rectF) {
        return Math.max((int) ((k(rectF, 0) / 18.0f) + 0.5f), 18);
    }

    @Override // com.daaw.AX
    public float k(RectF rectF, int i) {
        return ((float) (((double) ((rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.a)) * 6.283185307179586d)) * (1.0f - this.b);
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.Q("radius", this.a, "misc", 0.5f, 3.0f);
        c2591Vu.Q("gap", this.b, "misc", 0.0f, 0.9f);
    }

    @Override // com.daaw.AX
    public void d(InterfaceC9336wX interfaceC9336wX) {
    }
}
