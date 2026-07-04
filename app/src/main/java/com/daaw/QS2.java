package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class QS2 implements Executor {
    public final /* synthetic */ Executor B;
    public final /* synthetic */ AbstractC9873yR2 C;

    public QS2(Executor executor, AbstractC9873yR2 abstractC9873yR2) {
        this.B = executor;
        this.C = abstractC9873yR2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.B.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.C.f(e);
        }
    }
}
