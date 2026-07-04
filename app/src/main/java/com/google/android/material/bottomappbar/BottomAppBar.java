package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC6314li0;
import com.daaw.JC0;
import com.daaw.SD0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BottomAppBar extends Toolbar {
    public static final int y0 = SD0.i;
    public static final int z0 = JC0.w;
    public static final int A0 = JC0.C;

    public static /* synthetic */ void U(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ View V(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static void X(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.e) view.getLayoutParams()).d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect m;
        public WeakReference n;
        public int o;
        public final View.OnLayoutChangeListener p;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                AbstractC6314li0.a(Behavior.this.n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.p = new a();
            this.m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            AbstractC6314li0.a(view);
            return P(coordinatorLayout, null, view2, view3, i, i2);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.n = new WeakReference(bottomAppBar);
            View viewV = BottomAppBar.V(bottomAppBar);
            if (viewV != null && !AbstractC2317Td1.U(viewV)) {
                BottomAppBar.X(bottomAppBar, viewV);
                this.o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) viewV.getLayoutParams())).bottomMargin;
                viewV.addOnLayoutChangeListener(this.p);
                BottomAppBar.U(bottomAppBar);
            }
            coordinatorLayout.G(bottomAppBar, i);
            return super.l(coordinatorLayout, bottomAppBar, i);
        }

        public boolean P(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            AbstractC6314li0.a(view);
            return O(coordinatorLayout, null, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.p = new a();
            this.m = new Rect();
        }
    }
}
