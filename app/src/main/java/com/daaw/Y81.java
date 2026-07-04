package com.daaw;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class Y81 {
    public final InterfaceC6258lW0 a;
    public final Object b;

    public Y81(InterfaceC6258lW0 interfaceC6258lW0) {
        G10.g(interfaceC6258lW0, "resolveResult");
        this.a = interfaceC6258lW0;
        this.b = interfaceC6258lW0.getValue();
    }

    public final Typeface a() {
        return (Typeface) this.b;
    }

    public final boolean b() {
        return this.a.getValue() != this.b;
    }
}
