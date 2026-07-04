package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import com.daaw.B21;
import com.daaw.C1631Mu;
import com.daaw.C8222sZ0;
import com.daaw.C9672xj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends View implements B21 {
    public final List B;
    public List C;
    public int D;
    public float E;
    public boolean F;
    public boolean G;
    public C9672xj H;
    public float I;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new ArrayList();
        this.D = 0;
        this.E = 0.0533f;
        this.F = true;
        this.G = true;
        this.H = C9672xj.g;
        this.I = 0.08f;
    }

    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    private C9672xj getUserCaptionStyleV19() {
        return C9672xj.a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    public final float a(int i, float f, int i2, int i3) {
        float f2;
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return Float.MIN_VALUE;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public final float b(C1631Mu c1631Mu, int i, int i2, float f) {
        int i3 = c1631Mu.N;
        if (i3 != Integer.MIN_VALUE) {
            float f2 = c1631Mu.O;
            if (f2 != Float.MIN_VALUE) {
                float fA = a(i3, f2, i, i2);
                if (fA > 0.0f) {
                    return fA;
                }
            }
        }
        return f;
    }

    public void c(float f, boolean z) {
        d(z ? 1 : 0, f);
    }

    public final void d(int i, float f) {
        if (this.D == i && this.E == f) {
            return;
        }
        this.D = i;
        this.E = f;
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.C;
        int i = 0;
        int size = list == null ? 0 : list.size();
        int top = getTop();
        int bottom = getBottom();
        int left = getLeft() + getPaddingLeft();
        int paddingTop = getPaddingTop() + top;
        int right = getRight() - getPaddingRight();
        int paddingBottom = bottom - getPaddingBottom();
        if (paddingBottom <= paddingTop || right <= left) {
            return;
        }
        int i2 = bottom - top;
        int i3 = paddingBottom - paddingTop;
        float fA = a(this.D, this.E, i2, i3);
        if (fA <= 0.0f) {
            return;
        }
        while (i < size) {
            C1631Mu c1631Mu = (C1631Mu) this.C.get(i);
            int i4 = paddingBottom;
            int i5 = paddingTop;
            ((C8222sZ0) this.B.get(i)).b(c1631Mu, this.F, this.G, this.H, b(c1631Mu, i2, i3, fA), this.I, canvas, left, i5, right, i4);
            i++;
            fA = fA;
            paddingTop = i5;
            paddingBottom = i4;
        }
    }

    @Override // com.daaw.B21
    public void h(List list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        invalidate();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.F == z && this.G == z) {
            return;
        }
        this.F = z;
        this.G = z;
        invalidate();
    }

    public void setBottomPaddingFraction(float f) {
        if (this.I == f) {
            return;
        }
        this.I = f;
        invalidate();
    }

    public void setCues(List<C1631Mu> list) {
        if (this.C == list) {
            return;
        }
        this.C = list;
        int size = list == null ? 0 : list.size();
        while (this.B.size() < size) {
            this.B.add(new C8222sZ0(getContext()));
        }
        invalidate();
    }

    public void setFractionalTextSize(float f) {
        c(f, false);
    }

    public void setStyle(C9672xj c9672xj) {
        if (this.H == c9672xj) {
            return;
        }
        this.H = c9672xj;
        invalidate();
    }
}
