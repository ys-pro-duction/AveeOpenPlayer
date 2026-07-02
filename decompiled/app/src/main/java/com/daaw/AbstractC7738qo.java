package com.daaw;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: renamed from: com.daaw.qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7738qo {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(AbstractActivityC5776jo abstractActivityC5776jo, AbstractC1300Jp abstractC1300Jp, InterfaceC3429bR interfaceC3429bR) {
        View childAt = ((ViewGroup) abstractActivityC5776jo.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(abstractC1300Jp);
            composeView.setContent(interfaceC3429bR);
            return;
        }
        ComposeView composeView2 = new ComposeView(abstractActivityC5776jo, null, 0, 6, null);
        composeView2.setParentCompositionContext(abstractC1300Jp);
        composeView2.setContent(interfaceC3429bR);
        c(abstractActivityC5776jo);
        abstractActivityC5776jo.setContentView(composeView2, a);
    }

    public static /* synthetic */ void b(AbstractActivityC5776jo abstractActivityC5776jo, AbstractC1300Jp abstractC1300Jp, InterfaceC3429bR interfaceC3429bR, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC1300Jp = null;
        }
        a(abstractActivityC5776jo, abstractC1300Jp, interfaceC3429bR);
    }

    public static final void c(AbstractActivityC5776jo abstractActivityC5776jo) {
        View decorView = abstractActivityC5776jo.getWindow().getDecorView();
        if (AbstractC2217Se1.a(decorView) == null) {
            AbstractC2217Se1.b(decorView, abstractActivityC5776jo);
        }
        if (AbstractC2529Ve1.a(decorView) == null) {
            AbstractC2529Ve1.b(decorView, abstractActivityC5776jo);
        }
        if (AbstractC2425Ue1.a(decorView) == null) {
            AbstractC2425Ue1.b(decorView, abstractActivityC5776jo);
        }
    }
}
