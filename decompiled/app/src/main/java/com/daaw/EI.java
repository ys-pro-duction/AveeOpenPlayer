package com.daaw;

import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EI {
    public static final Executor a = AbstractC8922v11.a;
    public static final Executor b = new ExecutorC2748Xh0();
    public static final Executor c = new ExecutorC8932v31(4, AsyncTask.THREAD_POOL_EXECUTOR);
}
