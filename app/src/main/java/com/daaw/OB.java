package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class OB extends androidx.compose.ui.platform.a {
    public final Window I;
    public final InterfaceC8007rm0 J;
    public boolean K;
    public boolean L;

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.C = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            OB.this.a(interfaceC5781jp, this.C | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OB(Context context, Window window) {
        super(context, null, 0, 6, null);
        G10.g(context, "context");
        G10.g(window, "window");
        this.I = window;
        this.J = AbstractC9046vU0.d(C1919Po.a.a(), null, 2, null);
    }

    private final void setContent(InterfaceC3429bR interfaceC3429bR) {
        this.J.setValue(interfaceC3429bR);
    }

    @Override // androidx.compose.ui.platform.a
    public void a(InterfaceC5781jp interfaceC5781jp, int i) {
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(1735448596);
        k().invoke(interfaceC5781jpQ, 0);
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new a(i));
    }

    @Override // androidx.compose.ui.platform.a
    public void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        n().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.L;
    }

    @Override // androidx.compose.ui.platform.a
    public void h(int i, int i2) {
        if (this.K) {
            super.h(i, i2);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(m(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(l(), Integer.MIN_VALUE));
        }
    }

    public final InterfaceC3429bR k() {
        return (InterfaceC3429bR) this.J.getValue();
    }

    public final int l() {
        return AbstractC8261sh0.b(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    public final int m() {
        return AbstractC8261sh0.b(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public Window n() {
        return this.I;
    }

    public final void o(AbstractC1300Jp abstractC1300Jp, InterfaceC3429bR interfaceC3429bR) {
        G10.g(abstractC1300Jp, "parent");
        G10.g(interfaceC3429bR, "content");
        setParentCompositionContext(abstractC1300Jp);
        setContent(interfaceC3429bR);
        this.L = true;
        d();
    }

    public final void p(boolean z) {
        this.K = z;
    }
}
