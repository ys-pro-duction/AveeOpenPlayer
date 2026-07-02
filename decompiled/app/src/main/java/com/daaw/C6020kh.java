package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: com.daaw.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6020kh implements KW {
    public static final int[] e = {-1, -1, -1, -1, -1, -1};
    public Canvas a;
    public Paint b;
    public final int c;
    public final float d;

    /* JADX INFO: renamed from: com.daaw.kh$a */
    public class a implements HQ {
        public final /* synthetic */ IQ a;
        public final /* synthetic */ float[] b;

        public a(IQ iq, float[] fArr) {
            this.a = iq;
            this.b = fArr;
        }

        @Override // com.daaw.HQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            return (Boolean) this.a.c(num, fArr, iArr, this.b);
        }
    }

    public C6020kh() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = 70;
        this.d = 3.0f;
        paint.setColor(1090519039);
    }

    public void a(InterfaceC9336wX interfaceC9336wX, HQ hq, int i, float f, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0) {
        float[] fArr = new float[8];
        char c = 4;
        int[] iArr = new int[4];
        char c2 = 0;
        int i2 = 0;
        while (i2 < i) {
            if (((Boolean) hq.j(Integer.valueOf(i2), fArr, iArr)).booleanValue()) {
                this.b.setColor(VT.t(iArr[c2], 70));
                float f2 = fArr[c2];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float f5 = fArr[3];
                float f6 = fArr[c];
                float f7 = fArr[5];
                float f8 = fArr[6];
                float f9 = fArr[7];
                this.a.drawLine(f2, f3, f4, f5, this.b);
                this.a.drawLine(f4, f5, f6, f7, this.b);
                this.a.drawLine(f6, f7, f8, f9, this.b);
                this.a.drawLine(f8, f9, f2, f3, this.b);
                this.a.drawLine(f4, f5, f8, f9, this.b);
                this.a.drawLine(f6, f7, f2, f3, this.b);
                g(f2, f3, this.b);
                g(f4, f5, this.b);
                g(f6, f7, this.b);
                g(f8, f9, this.b);
            }
            i2++;
            c = 4;
            c2 = 0;
        }
    }

    @Override // com.daaw.KW
    public void b(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, IW iw, int i2, C4312ec1 c4312ec1) {
        e(interfaceC9336wX, f, f2, f3, f4, f5, f6, f7, f8, f9, i, c1458Lc1, c1458Lc12, iw, i2);
    }

    @Override // com.daaw.KW
    public void c(InterfaceC9336wX interfaceC9336wX, IQ iq, int i, float f, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, IW iw, int i2, C4312ec1 c4312ec1) {
        a(interfaceC9336wX, new a(iq, new float[8]), i, f, c1458Lc1, c1458Lc12, new RH0(i2, iw, c4312ec1, (InterfaceC6129l2) null));
    }

    @Override // com.daaw.KW
    public void d(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0) {
        e(interfaceC9336wX, f, f2, f3, f4, f5, f6, f7, f8, f9, i, c1458Lc1, c1458Lc12, rh0.f(), rh0.a);
    }

    @Override // com.daaw.KW
    public void e(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, IW iw, int i2) {
        this.b.setColor(VT.t(i, 70));
        this.a.drawLine(f, f2, f3, f4, this.b);
        this.a.drawLine(f3, f4, f5, f6, this.b);
        this.a.drawLine(f5, f6, f7, f8, this.b);
        this.a.drawLine(f7, f8, f, f2, this.b);
        this.a.drawLine(f3, f4, f7, f8, this.b);
        this.a.drawLine(f5, f6, f, f2, this.b);
        g(f, f2, this.b);
        g(f3, f4, this.b);
        g(f5, f6, this.b);
        g(f7, f8, this.b);
    }

    @Override // com.daaw.KW
    public void f(InterfaceC9336wX interfaceC9336wX, HQ hq, int i, float f, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0) {
        a(interfaceC9336wX, hq, i, f, c1458Lc1, c1458Lc12, rh0);
    }

    public void g(float f, float f2, Paint paint) {
        this.a.drawCircle(f, f2, 3.0f, paint);
    }

    public void h(Canvas canvas) {
        this.a = canvas;
    }
}
