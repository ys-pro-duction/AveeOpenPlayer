package com.daaw;

import android.os.Looper;

/* JADX INFO: renamed from: com.daaw.uU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8761uU1 implements Runnable {
    public RunnableC8761uU1(C9326wU1 c9326wU1) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
