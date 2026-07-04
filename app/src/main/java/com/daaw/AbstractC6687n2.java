package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.daaw.AbstractC8081s2;

/* JADX INFO: renamed from: com.daaw.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6687n2 {
    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract boolean l();

    public abstract boolean o(int i, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z);

    public abstract void s(boolean z);

    public abstract void t(boolean z);

    public abstract void u(boolean z);

    public abstract void v(boolean z);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public abstract void y(CharSequence charSequence);

    public AbstractC8081s2 z(AbstractC8081s2.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: com.daaw.n2$a */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5060hE0.t);
            this.a = typedArrayObtainStyledAttributes.getInt(AbstractC5060hE0.u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.a = 0;
            this.a = aVar.a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }

    public void n() {
    }

    public void m(Configuration configuration) {
    }
}
