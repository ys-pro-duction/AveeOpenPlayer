package com.daaw;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.qI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7597qI0 {

    /* JADX INFO: renamed from: com.daaw.qI0$a */
    public static class a implements ThreadFactory {
        public String B;
        public int C;

        /* JADX INFO: renamed from: com.daaw.qI0$a$a, reason: collision with other inner class name */
        public static class C0225a extends Thread {
            public final int B;

            public C0225a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.B = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.B);
                super.run();
            }
        }

        public a(String str, int i) {
            this.B = str;
            this.C = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0225a(runnable, this.B, this.C);
        }
    }

    /* JADX INFO: renamed from: com.daaw.qI0$b */
    public static class b implements Runnable {
        public Callable B;
        public InterfaceC8589tr C;
        public Handler D;

        /* JADX INFO: renamed from: com.daaw.qI0$b$a */
        public class a implements Runnable {
            public final /* synthetic */ InterfaceC8589tr B;
            public final /* synthetic */ Object C;

            public a(InterfaceC8589tr interfaceC8589tr, Object obj) {
                this.B = interfaceC8589tr;
                this.C = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.B.accept(this.C);
            }
        }

        public b(Handler handler, Callable callable, InterfaceC8589tr interfaceC8589tr) {
            this.B = callable;
            this.C = interfaceC8589tr;
            this.D = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.B.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.D.post(new a(this.C, objCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, InterfaceC8589tr interfaceC8589tr) {
        executor.execute(new b(AbstractC2125Ri.a(), callable, interfaceC8589tr));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
