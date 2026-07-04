package com.daaw;

import android.view.ViewStructure;

/* JADX INFO: renamed from: com.daaw.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10200zd {
    public static final C10200zd a = new C10200zd();

    public final int a(ViewStructure viewStructure, int i) {
        G10.g(viewStructure, "structure");
        return viewStructure.addChildCount(i);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i) {
        G10.g(viewStructure, "structure");
        return viewStructure.newChild(i);
    }

    public final void c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        G10.g(viewStructure, "structure");
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    public final void d(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        G10.g(viewStructure, "structure");
        viewStructure.setId(i, str, str2, str3);
    }
}
