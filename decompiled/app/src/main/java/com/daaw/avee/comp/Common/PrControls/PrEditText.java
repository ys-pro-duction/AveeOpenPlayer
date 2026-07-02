package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.daaw.AbstractC0405Bb1;
import com.daaw.AbstractC2916Yx0;
import com.daaw.AbstractC4781gE0;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C6015kg;
import com.daaw.JD0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PrEditText extends AppCompatEditText {
    public static final C0746Eg1 K = new C0746Eg1();
    public static final C0850Fg1 L = new C0850Fg1();
    public final List H;
    public Integer I;
    public boolean J;

    public PrEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = null;
        this.J = true;
        e();
        this.J = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC4781gE0.f, 0, 0).getBoolean(AbstractC4781gE0.g, false);
    }

    private void e() {
        boolean zBooleanValue = ((Boolean) K.a(Boolean.FALSE)).booleanValue();
        setEnabled(zBooleanValue);
        setClickable(zBooleanValue);
    }

    public final boolean f(String str) {
        return this.I == null || ((Boolean) K.a(Boolean.FALSE)).booleanValue() || AbstractC0405Bb1.w(str) <= this.I.intValue();
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

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (f(charSequence.toString())) {
            super.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        String string = this.I.toString();
        setText(string);
        setSelection(string.length());
        C6015kg.c(getContext(), getContext().getString(JD0.j2, this.I)).e();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && ((Boolean) L.a(this, Boolean.FALSE)).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setLimit(Integer num) {
        e();
        if (isEnabled()) {
            return;
        }
        this.I = num;
        try {
            String string = getText().toString();
            if (string.isEmpty() || Integer.parseInt(string) > num.intValue()) {
                setText(num + "");
            }
        } catch (Exception unused) {
        }
    }
}
