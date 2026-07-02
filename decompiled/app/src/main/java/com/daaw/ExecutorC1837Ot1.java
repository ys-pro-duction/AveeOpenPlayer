package com.daaw;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Ot1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC1837Ot1 implements Executor {
    public final /* synthetic */ Handler B;

    public ExecutorC1837Ot1(C2067Qt1 c2067Qt1, Handler handler) {
        this.B = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.B.post(runnable);
    }
}
