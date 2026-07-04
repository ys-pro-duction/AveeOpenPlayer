package com.daaw;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4705fy extends AbstractC8636u11 {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new a());
    public volatile Handler c;

    /* JADX INFO: renamed from: com.daaw.fy$a */
    public class a implements ThreadFactory {
        public final AtomicInteger B = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.B.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: com.daaw.fy$b */
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // com.daaw.AbstractC8636u11
    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // com.daaw.AbstractC8636u11
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // com.daaw.AbstractC8636u11
    public void c(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                try {
                    if (this.c == null) {
                        this.c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.c.post(runnable);
    }
}
