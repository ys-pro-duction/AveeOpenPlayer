package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import com.daaw.AbstractC2916Yx0;
import com.daaw.AbstractC4781gE0;
import com.daaw.C0850Fg1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PrButton extends Button {
    public static final C0850Fg1 D = new C0850Fg1();
    public static final C0850Fg1 E = new C0850Fg1();
    public boolean B;
    public final List C;

    public PrButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = false;
        this.C = null;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        boolean z = false;
        this.B = getContext().getTheme().obtainStyledAttributes(attributeSet, AbstractC4781gE0.d, 0, 0).getBoolean(AbstractC4781gE0.e, false);
        Object[] objArr = {1, 7, 5, 3};
        if (((Boolean) D.a(objArr, Boolean.FALSE)).booleanValue() && objArr[2].equals(objArr[3])) {
            z = true;
        }
        setEnabled(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
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
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && ((Boolean) E.a(this, Boolean.FALSE)).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
