package com.daaw;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class ES0 extends AbstractC4145e {
    public Paint c = AbstractC8874us0.c().a();
    public float[] d = new float[3];

    @Override // com.daaw.InterfaceC6896nn
    public void a() {
        int size = this.b.size();
        float width = this.a.g.getWidth() / 2.0f;
        C6617mn c6617mn = this.a;
        int i = c6617mn.a;
        float f = c6617mn.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (i3 / (i - 1)) * f;
            float f3 = this.a.c;
            int iE = e(f2, f3);
            int i4 = 0;
            while (i4 < iE) {
                double d = iE;
                float f4 = width;
                float f5 = f;
                double d2 = ((((double) i4) * 6.283185307179586d) / d) + ((3.141592653589793d / d) * ((double) ((i3 + 1) % 2)));
                double d3 = f2;
                float fCos = f4 + ((float) (Math.cos(d2) * d3));
                float fSin = f4 + ((float) (d3 * Math.sin(d2)));
                float[] fArr = this.d;
                fArr[0] = (float) ((d2 * 180.0d) / 3.141592653589793d);
                fArr[1] = f2 / f5;
                fArr[2] = this.a.f;
                this.c.setColor(Color.HSVToColor(fArr));
                this.c.setAlpha(f());
                C6617mn c6617mn2 = this.a;
                c6617mn2.g.drawCircle(fCos, fSin, f3 - c6617mn2.d, this.c);
                if (i2 >= size) {
                    this.b.add(new C2663Wm(fCos, fSin, this.d));
                } else {
                    ((C2663Wm) this.b.get(i2)).f(fCos, fSin, this.d);
                }
                i2++;
                i4++;
                width = f4;
                f = f5;
            }
        }
    }
}
