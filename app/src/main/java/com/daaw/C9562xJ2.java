package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.xJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9562xJ2 {
    public boolean a;

    public final void a(Context context) {
        AbstractC7885rK2.b(context, "Application Context cannot be null");
        if (this.a) {
            return;
        }
        this.a = true;
        C3125aK2.c().d(context);
        OJ2.i().d(context);
        AbstractC6212lK2.b(context);
        AbstractC6491mK2.d(context);
        AbstractC7328pK2.a(context);
        TJ2.b().c(context);
        NJ2.a().d(context);
    }

    public final boolean b() {
        return this.a;
    }
}
