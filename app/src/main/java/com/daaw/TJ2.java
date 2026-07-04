package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class TJ2 {
    public static final TJ2 b = new TJ2();
    public Context a;

    public static TJ2 b() {
        return b;
    }

    public final Context a() {
        return this.a;
    }

    public final void c(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
