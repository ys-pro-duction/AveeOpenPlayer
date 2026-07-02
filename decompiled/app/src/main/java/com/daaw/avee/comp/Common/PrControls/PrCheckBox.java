package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.AbstractC2916Yx0;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;

/* JADX INFO: loaded from: classes.dex */
public class PrCheckBox extends AppCompatCheckBox {
    public static final C0746Eg1 F = new C0746Eg1();
    public static final C0850Fg1 G = new C0850Fg1();

    public PrCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setEnabled(((Boolean) F.a(Boolean.FALSE)).booleanValue());
        Drawable drawableA = AbstractC2916Yx0.a();
        if (drawableA != null) {
            int intrinsicWidth = drawableA.getIntrinsicWidth();
            int width = canvas.getWidth() - getCompoundPaddingRight();
            int compoundPaddingTop = getCompoundPaddingTop();
            drawableA.setBounds(width - intrinsicWidth, compoundPaddingTop, width, intrinsicWidth + compoundPaddingTop);
            drawableA.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && ((Boolean) G.a(this, Boolean.FALSE)).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
