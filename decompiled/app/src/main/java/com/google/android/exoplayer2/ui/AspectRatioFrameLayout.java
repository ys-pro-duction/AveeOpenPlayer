package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.VD0;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public final c B;
    public float C;
    public int D;

    public interface b {
    }

    public final class c implements Runnable {
        public float B;
        public float C;
        public boolean D;
        public boolean E;

        public c() {
        }

        public void a(float f, float f2, boolean z) {
            this.B = f;
            this.C = f2;
            this.D = z;
            if (this.E) {
                return;
            }
            this.E = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.E = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, VD0.a, 0, 0);
            try {
                this.D = typedArrayObtainStyledAttributes.getInt(VD0.b, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.B = new c();
    }

    public static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.D;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.C <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.C / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.B.a(this.C, f5, false);
            return;
        }
        int i3 = this.D;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.C;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.C;
                    } else {
                        f2 = this.C;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.C;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.C;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.C;
            measuredWidth = (int) (f4 * f);
        }
        this.B.a(this.C, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.C != f) {
            this.C = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i) {
        if (this.D != i) {
            this.D = i;
            requestLayout();
        }
    }
}
