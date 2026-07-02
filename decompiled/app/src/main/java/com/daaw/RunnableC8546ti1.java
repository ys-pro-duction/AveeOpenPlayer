package com.daaw;

import android.content.Context;
import androidx.work.ListenableWorker;

/* JADX INFO: renamed from: com.daaw.ti1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC8546ti1 implements Runnable {
    public static final String H = AbstractC1772Od0.f("WorkForegroundRunnable");
    public final AQ0 B = AQ0.t();
    public final Context C;
    public final C1793Oi1 D;
    public final ListenableWorker E;
    public final InterfaceC4545fP F;
    public final InterfaceC8357t11 G;

    /* JADX INFO: renamed from: com.daaw.ti1$a */
    public class a implements Runnable {
        public final /* synthetic */ AQ0 B;

        public a(AQ0 aq0) {
            this.B = aq0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.r(RunnableC8546ti1.this.E.getForegroundInfoAsync());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ti1$b */
    public class b implements Runnable {
        public final /* synthetic */ AQ0 B;

        public b(AQ0 aq0) {
            this.B = aq0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3699cP c3699cP = (C3699cP) this.B.get();
                if (c3699cP == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", RunnableC8546ti1.this.D.c));
                }
                AbstractC1772Od0.c().a(RunnableC8546ti1.H, String.format("Updating notification for %s", RunnableC8546ti1.this.D.c), new Throwable[0]);
                RunnableC8546ti1.this.E.setRunInForeground(true);
                RunnableC8546ti1 runnableC8546ti1 = RunnableC8546ti1.this;
                runnableC8546ti1.B.r(runnableC8546ti1.F.a(runnableC8546ti1.C, runnableC8546ti1.E.getId(), c3699cP));
            } catch (Throwable th) {
                RunnableC8546ti1.this.B.q(th);
            }
        }
    }

    public RunnableC8546ti1(Context context, C1793Oi1 c1793Oi1, ListenableWorker listenableWorker, InterfaceC4545fP interfaceC4545fP, InterfaceC8357t11 interfaceC8357t11) {
        this.C = context;
        this.D = c1793Oi1;
        this.E = listenableWorker;
        this.F = interfaceC4545fP;
        this.G = interfaceC8357t11;
    }

    public InterfaceFutureC8236sc0 a() {
        return this.B;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.D.q || C7703qh.b()) {
            this.B.p(null);
            return;
        }
        AQ0 aq0T = AQ0.t();
        this.G.a().execute(new a(aq0T));
        aq0T.g(new b(aq0T), this.G.a());
    }
}
