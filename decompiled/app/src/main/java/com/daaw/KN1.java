package com.daaw;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KN1 {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
