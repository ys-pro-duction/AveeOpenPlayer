package com.daaw;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class HU0 extends AbstractC9647xe {
    public final RectF D;
    public final Paint E;
    public final float[] F;
    public final Path G;
    public final C5595j90 H;
    public AbstractC9089ve I;

    public HU0(C4615ff0 c4615ff0, C5595j90 c5595j90) {
        super(c4615ff0, c5595j90);
        this.D = new RectF();
        C3078a90 c3078a90 = new C3078a90();
        this.E = c3078a90;
        this.F = new float[8];
        this.G = new Path();
        this.H = c5595j90;
        c3078a90.setAlpha(0);
        c3078a90.setStyle(Paint.Style.FILL);
        c3078a90.setColor(c5595j90.o());
    }

    @Override // com.daaw.AbstractC9647xe, com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        super.c(obj, c8530tf0);
        if (obj == InterfaceC7136of0.K) {
            if (c8530tf0 == null) {
                this.I = null;
            } else {
                this.I = new C6843nc1(c8530tf0);
            }
        }
    }

    @Override // com.daaw.AbstractC9647xe, com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.D.set(0.0f, 0.0f, this.H.q(), this.H.p());
        this.o.mapRect(this.D);
        rectF.set(this.D);
    }

    @Override // com.daaw.AbstractC9647xe
    public void u(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.H.o());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.x.h() == null ? 100 : ((Integer) this.x.h().h()).intValue())) / 100.0f) * 255.0f);
        this.E.setAlpha(iIntValue);
        AbstractC9089ve abstractC9089ve = this.I;
        if (abstractC9089ve != null) {
            this.E.setColorFilter((ColorFilter) abstractC9089ve.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.H.q();
            float[] fArr2 = this.F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.H.q();
            this.F[5] = this.H.p();
            float[] fArr3 = this.F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.H.p();
            matrix.mapPoints(this.F);
            this.G.reset();
            Path path = this.G;
            float[] fArr4 = this.F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.G;
            float[] fArr5 = this.F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.G;
            float[] fArr6 = this.F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.G;
            float[] fArr7 = this.F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.G;
            float[] fArr8 = this.F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.G.close();
            canvas.drawPath(this.G, this.E);
        }
    }
}
