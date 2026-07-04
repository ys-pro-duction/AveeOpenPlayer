package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.daaw.AbstractC2916Yx0;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;

/* JADX INFO: loaded from: classes.dex */
public class PrImageButton extends ImageButton {
    public static final C0746Eg1 B = new C0746Eg1();
    public static final C0850Fg1 C = new C0850Fg1();

    public PrImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setEnabled(((Boolean) B.a(Boolean.FALSE)).booleanValue());
        Drawable drawableA = AbstractC2916Yx0.a();
        if (drawableA != null) {
            int intrinsicWidth = drawableA.getIntrinsicWidth();
            int width = canvas.getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            drawableA.setBounds(width - intrinsicWidth, paddingTop, width, intrinsicWidth + paddingTop);
            drawableA.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && ((Boolean) C.a(this, Boolean.FALSE)).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
