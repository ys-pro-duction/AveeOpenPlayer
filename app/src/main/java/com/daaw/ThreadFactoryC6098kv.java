package com.daaw;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.daaw.kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ThreadFactoryC6098kv implements ThreadFactory {
    public static final ThreadFactory F = Executors.defaultThreadFactory();
    public final AtomicLong B = new AtomicLong();
    public final String C;
    public final int D;
    public final StrictMode.ThreadPolicy E;

    public ThreadFactoryC6098kv(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.C = str;
        this.D = i;
        this.E = threadPolicy;
    }

    public static /* synthetic */ void a(ThreadFactoryC6098kv threadFactoryC6098kv, Runnable runnable) {
        Process.setThreadPriority(threadFactoryC6098kv.D);
        StrictMode.ThreadPolicy threadPolicy = threadFactoryC6098kv.E;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = F.newThread(new Runnable() { // from class: com.daaw.jv
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC6098kv.a(this.B, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.C, Long.valueOf(this.B.getAndIncrement())));
        return threadNewThread;
    }
}
