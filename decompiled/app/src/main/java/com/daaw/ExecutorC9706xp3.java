package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.xp3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC9706xp3 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
