package com.daaw;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class M5 {
    public static final L5 a(Context context) {
        G10.g(context, "context");
        return new L5(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
