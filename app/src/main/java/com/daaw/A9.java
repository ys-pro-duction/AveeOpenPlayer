package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class A9 extends PopupWindow {
    public static final boolean b = false;
    public boolean a;

    public A9(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Z31 z31V = Z31.v(context, attributeSet, AbstractC5060hE0.Y1, i, i2);
        if (z31V.s(AbstractC5060hE0.a2)) {
            b(z31V.a(AbstractC5060hE0.a2, false));
        }
        setBackgroundDrawable(z31V.g(AbstractC5060hE0.Z1));
        z31V.x();
    }

    public final void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            AbstractC1852Ox0.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
