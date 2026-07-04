package com.daaw;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class AW1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ InterfaceC3152aR1 B;
    public final /* synthetic */ FW1 C;

    public AW1(FW1 fw1, InterfaceC3152aR1 interfaceC3152aR1) {
        this.C = fw1;
        this.B = interfaceC3152aR1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.C.G(view, this.B, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
