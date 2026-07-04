package com.daaw;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.Vb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC2517Vb1 extends AsyncTask implements HX {
    public static final int d;
    public static final int e;
    public static final int f;
    public static final ThreadFactory g;
    public static final BlockingQueue h;
    public static final RejectedExecutionHandler i;
    public static final Executor j;
    public Object a;
    public c b;
    public List c = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.Vb1$a */
    public class a implements ThreadFactory {
        public final AtomicInteger B = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "VAsyncTask #" + this.B.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vb1$b */
    public interface b {
        void a(Object obj, boolean z);
    }

    /* JADX INFO: renamed from: com.daaw.Vb1$c */
    public interface c {
        Object a(AsyncTaskC2517Vb1 asyncTaskC2517Vb1);
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        d = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        e = iMax;
        int i2 = (iAvailableProcessors * 2) + 1;
        f = i2;
        a aVar = new a();
        g = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        h = linkedBlockingQueue;
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
        i = callerRunsPolicy;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i2, 30L, TimeUnit.SECONDS, linkedBlockingQueue, aVar, callerRunsPolicy);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        j = threadPoolExecutor;
    }

    public AsyncTaskC2517Vb1(c cVar) {
        this.b = cVar;
    }

    @Override // com.daaw.HX
    public void a(b bVar) {
        if (getStatus() == AsyncTask.Status.FINISHED) {
            bVar.a(this.a, false);
            return;
        }
        this.c.add(bVar);
        if (getStatus() != AsyncTask.Status.RUNNING) {
            execute(null);
        }
    }

    public void b(b bVar) {
        if (getStatus() == AsyncTask.Status.FINISHED) {
            bVar.a(this.a, false);
            return;
        }
        this.c.add(bVar);
        if (getStatus() != AsyncTask.Status.RUNNING) {
            executeOnExecutor(j, null);
        }
    }

    @Override // android.os.AsyncTask
    public Object doInBackground(Object... objArr) {
        return this.b.a(this);
    }

    @Override // android.os.AsyncTask
    public void onCancelled(Object obj) {
        this.a = obj;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            ((b) this.c.get(i2)).a(null, true);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        this.a = obj;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            ((b) this.c.get(i2)).a(obj, false);
        }
    }
}
