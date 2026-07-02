package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.s91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8118s91 implements Executor {
    INSTANCE;

    public static final Handler C = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C.post(runnable);
    }
}
