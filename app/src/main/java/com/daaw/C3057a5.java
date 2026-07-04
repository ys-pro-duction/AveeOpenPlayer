package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3057a5 implements InterfaceC1160Ig {
    public final View a;

    public C3057a5(View view) {
        G10.g(view, "view");
        this.a = view;
    }

    @Override // com.daaw.InterfaceC1160Ig
    public Object a(C3103aF0 c3103aF0, InterfaceC7002o90 interfaceC7002o90, InterfaceC1416Ks interfaceC1416Ks) {
        this.a.requestRectangleOnScreen(AbstractC1783Og.c(c3103aF0.n(AbstractC7281p90.d(interfaceC7002o90))), false);
        return G91.a;
    }
}
