package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.daaw.AbstractC10241zl0;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC5894kD0;
import com.daaw.AbstractC6991o7;
import com.daaw.JC0;
import com.daaw.YC0;

/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView B;
    public Button C;
    public final TimeInterpolator D;
    public int E;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = AbstractC10241zl0.g(context, JC0.C, AbstractC6991o7.b);
    }

    public static void a(View view, int i, int i2) {
        if (AbstractC2317Td1.W(view)) {
            AbstractC2317Td1.E0(view, AbstractC2317Td1.I(view), i, AbstractC2317Td1.H(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    public final boolean b(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.B.getPaddingTop() == i2 && this.B.getPaddingBottom() == i3) {
            return z;
        }
        a(this.B, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.C;
    }

    public TextView getMessageView() {
        return this.B;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.B = (TextView) findViewById(AbstractC5894kD0.G);
        this.C = (Button) findViewById(AbstractC5894kD0.F);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(YC0.e);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(YC0.d);
        Layout layout = this.B.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.E <= 0 || this.C.getMeasuredWidth() <= this.E) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.E = i;
    }
}
