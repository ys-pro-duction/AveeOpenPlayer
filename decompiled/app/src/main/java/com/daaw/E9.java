package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class E9 extends RatingBar {
    public final C9 B;

    public E9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.G);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapB = this.B.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public E9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC4163e31.a(this, getContext());
        C9 c9 = new C9(this);
        this.B = c9;
        c9.c(attributeSet, i);
    }
}
