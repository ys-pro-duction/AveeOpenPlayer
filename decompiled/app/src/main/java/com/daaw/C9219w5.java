package com.daaw;

import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9219w5 {
    public static final C9219w5 a = new C9219w5();

    public final void a(View view, InterfaceC5819jx0 interfaceC5819jx0) {
        G10.g(view, "view");
        PointerIcon systemIcon = interfaceC5819jx0 instanceof C6986o6 ? PointerIcon.getSystemIcon(view.getContext(), ((C6986o6) interfaceC5819jx0).a()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (G10.c(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
