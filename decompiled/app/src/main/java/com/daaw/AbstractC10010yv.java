package com.daaw;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.daaw.C4904gh0;

/* JADX INFO: renamed from: com.daaw.yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10010yv extends C4904gh0 {
    public b Z;

    /* JADX INFO: renamed from: com.daaw.yv$c */
    public static class c extends AbstractC10010yv {
        public c(b bVar) {
            super(bVar);
        }

        @Override // com.daaw.C4904gh0
        public void r(Canvas canvas) {
            if (this.Z.w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.Z.w);
            } else {
                canvas.clipRect(this.Z.w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    public static AbstractC10010yv e0(b bVar) {
        return new c(bVar);
    }

    public static AbstractC10010yv f0(C5671jR0 c5671jR0) {
        if (c5671jR0 == null) {
            c5671jR0 = new C5671jR0();
        }
        return e0(new b(c5671jR0, new RectF()));
    }

    public boolean g0() {
        return !this.Z.w.isEmpty();
    }

    public void h0() {
        i0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void i0(float f, float f2, float f3, float f4) {
        if (f == this.Z.w.left && f2 == this.Z.w.top && f3 == this.Z.w.right && f4 == this.Z.w.bottom) {
            return;
        }
        this.Z.w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void j0(RectF rectF) {
        i0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.Z = new b(this.Z);
        return this;
    }

    /* JADX INFO: renamed from: com.daaw.yv$b */
    public static final class b extends C4904gh0.c {
        public final RectF w;

        @Override // com.daaw.C4904gh0.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC10010yv abstractC10010yvE0 = AbstractC10010yv.e0(this);
            abstractC10010yvE0.invalidateSelf();
            return abstractC10010yvE0;
        }

        public b(C5671jR0 c5671jR0, RectF rectF) {
            super(c5671jR0, null);
            this.w = rectF;
        }

        public b(b bVar) {
            super(bVar);
            this.w = bVar.w;
        }
    }

    public AbstractC10010yv(b bVar) {
        super(bVar);
        this.Z = bVar;
    }
}
