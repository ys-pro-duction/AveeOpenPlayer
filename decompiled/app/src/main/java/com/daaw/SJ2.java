package com.daaw;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class SJ2 {
    public final LK2 a;
    public final String b;
    public final FJ2 c;
    public final String d = "Ad overlay";

    public SJ2(View view, FJ2 fj2, String str) {
        this.a = new LK2(view);
        this.b = view.getClass().getCanonicalName();
        this.c = fj2;
    }

    public final FJ2 a() {
        return this.c;
    }

    public final LK2 b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }
}
