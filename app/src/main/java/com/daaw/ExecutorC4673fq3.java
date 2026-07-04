package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.fq3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC4673fq3 implements Executor {
    public final Handler B = new HandlerC8566tm1(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.B.post(runnable);
    }
}
