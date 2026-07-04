package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.bI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3393bI implements GJ {
    public final InterfaceC7290pB0 a;

    public C3393bI(InterfaceC7290pB0 interfaceC7290pB0) {
        this.a = interfaceC7290pB0;
    }

    public static C3393bI a(InterfaceC7290pB0 interfaceC7290pB0) {
        return new C3393bI(interfaceC7290pB0);
    }

    public static String c(Context context) {
        return (String) AbstractC7227oy0.c(ZH.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.a.get());
    }
}
