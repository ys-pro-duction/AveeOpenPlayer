package com.daaw;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E82 {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }
}
