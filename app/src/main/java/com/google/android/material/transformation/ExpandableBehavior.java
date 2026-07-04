package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC6314li0;
import com.daaw.InterfaceC3675cJ;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.b {
    public int a;

    public ExpandableBehavior() {
        this.a = 0;
    }

    public InterfaceC3675cJ E(CoordinatorLayout coordinatorLayout, View view) {
        List listQ = coordinatorLayout.q(view);
        int size = listQ.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) listQ.get(i);
            if (e(coordinatorLayout, view, view2)) {
                AbstractC6314li0.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC6314li0.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (AbstractC2317Td1.U(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
