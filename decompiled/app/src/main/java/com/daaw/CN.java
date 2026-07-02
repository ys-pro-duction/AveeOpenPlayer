package com.daaw;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class CN extends AbstractC4145e {
    public Paint c = AbstractC8874us0.c().a();
    public float[] d = new float[3];
    public float e = 1.2f;

    @Override // com.daaw.InterfaceC6896nn
    public void a() {
        int size = this.b.size();
        float f = 2.0f;
        float width = this.a.g.getWidth() / 2.0f;
        C6617mn c6617mn = this.a;
        int i = c6617mn.a;
        float f2 = c6617mn.d;
        float f3 = c6617mn.b;
        float f4 = c6617mn.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f5 = i2;
            float f6 = i;
            float f7 = (f5 / (i - 1)) * f3;
            float fMax = Math.max(1.5f + f2, (i2 == 0 ? 0.0f : ((f5 - (f6 / f)) / f6) * this.e * f4) + f4);
            int iMin = Math.min(e(f7, fMax), i * 2);
            int i4 = 0;
            while (i4 < iMin) {
                float f8 = f4;
                int i5 = i2;
                double d = iMin;
                float f9 = width;
                double d2 = ((((double) i4) * 6.283185307179586d) / d) + ((3.141592653589793d / d) * ((double) ((i5 + 1) % 2)));
                double d3 = f7;
                float fCos = f9 + ((float) (d3 * Math.cos(d2)));
                float fSin = f9 + ((float) (d3 * Math.sin(d2)));
                float[] fArr = this.d;
                fArr[0] = (float) ((180.0d * d2) / 3.141592653589793d);
                fArr[1] = f7 / f3;
                fArr[2] = this.a.f;
                this.c.setColor(Color.HSVToColor(fArr));
                this.c.setAlpha(f());
                this.a.g.drawCircle(fCos, fSin, fMax - f2, this.c);
                if (i3 >= size) {
                    this.b.add(new C2663Wm(fCos, fSin, this.d));
                } else {
                    ((C2663Wm) this.b.get(i3)).f(fCos, fSin, this.d);
                }
                i3++;
                i4++;
                i2 = i5;
                f4 = f8;
                width = f9;
            }
            i2++;
            f = 2.0f;
        }
    }
}
