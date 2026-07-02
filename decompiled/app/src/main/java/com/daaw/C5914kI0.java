package com.daaw;

import android.database.SQLException;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.kI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5914kI0 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final BlockingQueue f;
    public final ThreadPoolExecutor g;
    public final F51 h;
    public final C7191oq0 i;
    public int j;
    public long k;

    /* JADX INFO: renamed from: com.daaw.kI0$b */
    public final class b implements Runnable {
        public final AbstractC2899Yt B;
        public final C7521q11 C;

        @Override // java.lang.Runnable
        public void run() {
            C5914kI0.this.n(this.B, this.C);
            C5914kI0.this.i.c();
            double dG = C5914kI0.this.g();
            C2106Rd0.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.B.d());
            C5914kI0.o(dG);
        }

        public b(AbstractC2899Yt abstractC2899Yt, C7521q11 c7521q11) {
            this.B = abstractC2899Yt;
            this.C = c7521q11;
        }
    }

    public C5914kI0(F51 f51, BQ0 bq0, C7191oq0 c7191oq0) {
        this(bq0.f, bq0.g, ((long) bq0.h) * 1000, f51, c7191oq0);
    }

    public static /* synthetic */ void a(C5914kI0 c5914kI0, C7521q11 c7521q11, boolean z, AbstractC2899Yt abstractC2899Yt, Exception exc) {
        c5914kI0.getClass();
        if (exc != null) {
            c7521q11.d(exc);
            return;
        }
        if (z) {
            c5914kI0.j();
        }
        c7521q11.e(abstractC2899Yt);
    }

    public static /* synthetic */ void b(C5914kI0 c5914kI0, CountDownLatch countDownLatch) {
        c5914kI0.getClass();
        try {
            AbstractC3421bP.a(c5914kI0.h, EnumC8911uz0.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    public static void o(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    public final double g() {
        return Math.min(3600000.0d, (60000.0d / this.a) * Math.pow(this.b, h()));
    }

    public final int h() {
        if (this.k == 0) {
            this.k = m();
        }
        int iM = (int) ((m() - this.k) / this.c);
        int iMin = l() ? Math.min(100, this.j + iM) : Math.max(0, this.j - iM);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = m();
        }
        return iMin;
    }

    public C7521q11 i(AbstractC2899Yt abstractC2899Yt, boolean z) {
        synchronized (this.f) {
            try {
                C7521q11 c7521q11 = new C7521q11();
                if (!z) {
                    n(abstractC2899Yt, c7521q11);
                    return c7521q11;
                }
                this.i.b();
                if (!k()) {
                    h();
                    C2106Rd0.f().b("Dropping report due to queue being full: " + abstractC2899Yt.d());
                    this.i.a();
                    c7521q11.e(abstractC2899Yt);
                    return c7521q11;
                }
                C2106Rd0.f().b("Enqueueing report: " + abstractC2899Yt.d());
                C2106Rd0.f().b("Queue size: " + this.f.size());
                this.g.execute(new b(abstractC2899Yt, c7521q11));
                C2106Rd0.f().b("Closing task for report: " + abstractC2899Yt.d());
                c7521q11.e(abstractC2899Yt);
                return c7521q11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.daaw.jI0
            @Override // java.lang.Runnable
            public final void run() {
                C5914kI0.b(this.B, countDownLatch);
            }
        }).start();
        AbstractC0622Db1.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean k() {
        return this.f.size() < this.e;
    }

    public final boolean l() {
        return this.f.size() == this.e;
    }

    public final long m() {
        return System.currentTimeMillis();
    }

    public final void n(final AbstractC2899Yt abstractC2899Yt, final C7521q11 c7521q11) {
        C2106Rd0.f().b("Sending report through Google DataTransport: " + abstractC2899Yt.d());
        final boolean z = SystemClock.elapsedRealtime() - this.d < 2000;
        this.h.a(GH.e(abstractC2899Yt.b()), new S51() { // from class: com.daaw.iI0
            @Override // com.daaw.S51
            public final void a(Exception exc) {
                C5914kI0.a(this.a, c7521q11, z, abstractC2899Yt, exc);
            }
        });
    }

    public C5914kI0(double d, double d2, long j, F51 f51, C7191oq0 c7191oq0) {
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = f51;
        this.i = c7191oq0;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }
}
