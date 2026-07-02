package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: renamed from: com.daaw.Ee1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0738Ee1 implements InterfaceC0842Fe1 {
    public final ViewOverlay a;

    public C0738Ee1(View view) {
        this.a = view.getOverlay();
    }

    @Override // com.daaw.InterfaceC0842Fe1
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.daaw.InterfaceC0842Fe1
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }
}
