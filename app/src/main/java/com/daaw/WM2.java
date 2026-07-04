package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WM2 {
    public static VM2 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new XM2(new C3973dN2(context));
    }
}
