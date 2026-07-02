package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class TO0 implements AX {
    public boolean a = false;

    @Override // com.daaw.AX
    public int e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        float f2 = i2;
        float fWidth = rectF.left + (rectF.width() / f2);
        float fMax = Math.max(1.0f, Math.round((rectF.width() - (r11 * 2.0f)) / f2));
        pointF.x = ((rectF.width() - (((f2 * fMax) + fWidth) - ((fMax * 0.0f) + fWidth))) * 0.5f) + fWidth + (fMax * (z ? i2 - i : i));
        pointF.y = rectF.centerY();
        pointF2.x = 0.0f;
        pointF2.y = 1.0f;
        return i - 1;
    }

    @Override // com.daaw.AX
    public int i(RectF rectF) {
        return 2;
    }

    @Override // com.daaw.AX
    public float k(RectF rectF, int i) {
        return rectF.width() - ((rectF.width() / i) * 2.0f);
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
    }

    @Override // com.daaw.AX
    public void d(InterfaceC9336wX interfaceC9336wX) {
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
    }
}
