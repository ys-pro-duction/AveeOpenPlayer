package com.daaw;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.daaw.Ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2125Ri {
    public static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
