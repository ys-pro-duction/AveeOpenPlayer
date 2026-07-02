package com.daaw;

import com.daaw.InterfaceC3525bm;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.vW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9053vW {
    public static final Logger g = Logger.getLogger(C9053vW.class.getName());
    public final long a;
    public final C8772uX0 b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public Throwable e;
    public long f;

    /* JADX INFO: renamed from: com.daaw.vW$a */
    public class a implements Runnable {
        public final /* synthetic */ InterfaceC3525bm.a B;
        public final /* synthetic */ long C;

        public a(InterfaceC3525bm.a aVar, long j) {
            this.B = aVar;
            this.C = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.b(this.C);
        }
    }

    /* JADX INFO: renamed from: com.daaw.vW$b */
    public class b implements Runnable {
        public final /* synthetic */ InterfaceC3525bm.a B;
        public final /* synthetic */ Throwable C;

        public b(InterfaceC3525bm.a aVar, Throwable th) {
            this.B = aVar;
            this.C = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.a(this.C);
        }
    }

    public C9053vW(long j, C8772uX0 c8772uX0) {
        this.a = j;
        this.b = c8772uX0;
    }

    public static Runnable b(InterfaceC3525bm.a aVar, long j) {
        return new a(aVar, j);
    }

    public static Runnable c(InterfaceC3525bm.a aVar, Throwable th) {
        return new b(aVar, th);
    }

    public static void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public static void g(InterfaceC3525bm.a aVar, Executor executor, Throwable th) {
        e(executor, c(aVar, th));
    }

    public void a(InterfaceC3525bm.a aVar, Executor executor) {
        synchronized (this) {
            try {
                if (!this.d) {
                    this.c.put(aVar, executor);
                } else {
                    Throwable th = this.e;
                    e(executor, th != null ? c(aVar, th) : b(aVar, this.f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d() {
        synchronized (this) {
            try {
                if (this.d) {
                    return false;
                }
                this.d = true;
                long jD = this.b.d(TimeUnit.NANOSECONDS);
                this.f = jD;
                Map map = this.c;
                this.c = null;
                for (Map.Entry entry : map.entrySet()) {
                    e((Executor) entry.getValue(), b((InterfaceC3525bm.a) entry.getKey(), jD));
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(Throwable th) {
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                this.d = true;
                this.e = th;
                Map map = this.c;
                this.c = null;
                for (Map.Entry entry : map.entrySet()) {
                    g((InterfaceC3525bm.a) entry.getKey(), (Executor) entry.getValue(), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long h() {
        return this.a;
    }
}
