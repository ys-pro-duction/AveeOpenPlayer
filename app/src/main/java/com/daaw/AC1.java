package com.daaw;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class AC1 {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
