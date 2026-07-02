package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.daaw.oY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7102oY extends AbstractC9647xe {
    public final Paint D;
    public final Rect E;
    public final Rect F;
    public final C5732jf0 G;
    public AbstractC9089ve H;
    public AbstractC9089ve I;

    public C7102oY(C4615ff0 c4615ff0, C5595j90 c5595j90) {
        super(c4615ff0, c5595j90);
        this.D = new C3078a90(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = c4615ff0.L(c5595j90.m());
    }

    public final Bitmap O() {
        Bitmap bitmap;
        AbstractC9089ve abstractC9089ve = this.I;
        if (abstractC9089ve != null && (bitmap = (Bitmap) abstractC9089ve.h()) != null) {
            return bitmap;
        }
        Bitmap bitmapD = this.p.D(this.q.m());
        if (bitmapD != null) {
            return bitmapD;
        }
        C5732jf0 c5732jf0 = this.G;
        if (c5732jf0 != null) {
            return c5732jf0.a();
        }
        return null;
    }

    @Override // com.daaw.AbstractC9647xe, com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        super.c(obj, c8530tf0);
        if (obj == InterfaceC7136of0.K) {
            if (c8530tf0 == null) {
                this.H = null;
                return;
            } else {
                this.H = new C6843nc1(c8530tf0);
                return;
            }
        }
        if (obj == InterfaceC7136of0.N) {
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
        if (this.G != null) {
            float fE = AbstractC0301Ab1.e();
            rectF.set(0.0f, 0.0f, this.G.e() * fE, this.G.c() * fE);
            this.o.mapRect(rectF);
        }
    }

    @Override // com.daaw.AbstractC9647xe
    public void u(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapO = O();
        if (bitmapO == null || bitmapO.isRecycled() || this.G == null) {
            return;
        }
        float fE = AbstractC0301Ab1.e();
        this.D.setAlpha(i);
        AbstractC9089ve abstractC9089ve = this.H;
        if (abstractC9089ve != null) {
            this.D.setColorFilter((ColorFilter) abstractC9089ve.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.E.set(0, 0, bitmapO.getWidth(), bitmapO.getHeight());
        if (this.p.M()) {
            this.F.set(0, 0, (int) (this.G.e() * fE), (int) (this.G.c() * fE));
        } else {
            this.F.set(0, 0, (int) (bitmapO.getWidth() * fE), (int) (bitmapO.getHeight() * fE));
        }
        canvas.drawBitmap(bitmapO, this.E, this.F, this.D);
        canvas.restore();
    }
}
