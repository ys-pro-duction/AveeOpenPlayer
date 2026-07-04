package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.daaw.Ce1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0521Ce1 extends CoordinatorLayout.b {
    public C0634De1 a;
    public int b;
    public int c;

    public AbstractC0521Ce1() {
        this.b = 0;
        this.c = 0;
    }

    public int E() {
        C0634De1 c0634De1 = this.a;
        if (c0634De1 != null) {
            return c0634De1.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.G(view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        F(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new C0634De1(view);
        }
        this.a.c();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.e(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 == 0) {
            return true;
        }
        this.a.d(i3);
        this.c = 0;
        return true;
    }

    public AbstractC0521Ce1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }
}
