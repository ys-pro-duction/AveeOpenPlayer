package com.daaw;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class H9 extends SeekBar {
    public final I9 B;

    public H9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.H);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.B.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.B.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.B.g(canvas);
    }

    public H9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC4163e31.a(this, getContext());
        I9 i9 = new I9(this);
        this.B = i9;
        i9.c(attributeSet, i);
    }
}
