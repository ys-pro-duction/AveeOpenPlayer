package com.daaw;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: renamed from: com.daaw.mn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6618mn0 extends androidx.appcompat.view.menu.e {
    public C6618mn0(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) a(i, i2, i3, charSequence);
        C7176on0 c7176on0 = new C7176on0(w(), this, gVar);
        gVar.x(c7176on0);
        return c7176on0;
    }
}
