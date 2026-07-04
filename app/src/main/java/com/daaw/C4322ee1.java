package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: renamed from: com.daaw.ee1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4322ee1 implements InterfaceC4611fe1 {
    public final ViewGroupOverlay a;

    public C4322ee1(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // com.daaw.InterfaceC0842Fe1
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.daaw.InterfaceC0842Fe1
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }

    @Override // com.daaw.InterfaceC4611fe1
    public void c(View view) {
        this.a.add(view);
    }

    @Override // com.daaw.InterfaceC4611fe1
    public void d(View view) {
        this.a.remove(view);
    }
}
