package com.daaw;

import com.daaw.InterfaceC3525bm;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class F70 {
    public static final long l = TimeUnit.SECONDS.toNanos(10);
    public static final long m = TimeUnit.MILLISECONDS.toNanos(10);
    public final ScheduledExecutorService a;
    public final C8772uX0 b;
    public final d c;
    public final boolean d;
    public e e;
    public ScheduledFuture f;
    public ScheduledFuture g;
    public final Runnable h;
    public final Runnable i;
    public final long j;
    public final long k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            synchronized (F70.this) {
                try {
                    e eVar = F70.this.e;
                    e eVar2 = e.DISCONNECTED;
                    if (eVar != eVar2) {
                        F70.this.e = eVar2;
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                F70.this.c.a();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            synchronized (F70.this) {
                try {
                    F70.this.g = null;
                    e eVar = F70.this.e;
                    e eVar2 = e.PING_SCHEDULED;
                    if (eVar == eVar2) {
                        F70.this.e = e.PING_SENT;
                        F70 f70 = F70.this;
                        f70.f = f70.a.schedule(F70.this.h, F70.this.k, TimeUnit.NANOSECONDS);
                        z = true;
                    } else {
                        if (F70.this.e == e.PING_DELAYED) {
                            F70 f702 = F70.this;
                            ScheduledExecutorService scheduledExecutorService = f702.a;
                            Runnable runnable = F70.this.i;
                            long j = F70.this.j;
                            C8772uX0 c8772uX0 = F70.this.b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            f702.g = scheduledExecutorService.schedule(runnable, j - c8772uX0.d(timeUnit), timeUnit);
                            F70.this.e = eVar2;
                        }
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                F70.this.c.b();
            }
        }
    }

    public interface d {
        void a();

        void b();
    }

    public enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public F70(d dVar, ScheduledExecutorService scheduledExecutorService, long j, long j2, boolean z) {
        this(dVar, scheduledExecutorService, C8772uX0.c(), j, j2, z);
    }

    public static long l(long j) {
        return Math.max(j, l);
    }

    public synchronized void m() {
        try {
            this.b.f().g();
            e eVar = this.e;
            e eVar2 = e.PING_SCHEDULED;
            if (eVar == eVar2) {
                this.e = e.PING_DELAYED;
            } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.e == e.IDLE_AND_PING_SENT) {
                    this.e = e.IDLE;
                } else {
                    this.e = eVar2;
                    AbstractC7785qy0.u(this.g == null, "There should be no outstanding pingFuture");
                    this.g = this.a.schedule(this.i, this.j, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void n() {
        try {
            e eVar = this.e;
            if (eVar == e.IDLE) {
                this.e = e.PING_SCHEDULED;
                if (this.g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.a;
                    Runnable runnable = this.i;
                    long j = this.j;
                    C8772uX0 c8772uX0 = this.b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.g = scheduledExecutorService.schedule(runnable, j - c8772uX0.d(timeUnit), timeUnit);
                }
            } else if (eVar == e.IDLE_AND_PING_SENT) {
                this.e = e.PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void o() {
        try {
            if (this.d) {
                return;
            }
            e eVar = this.e;
            if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
                this.e = e.IDLE;
            }
            if (this.e == e.PING_SENT) {
                this.e = e.IDLE_AND_PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void p() {
        if (this.d) {
            n();
        }
    }

    public synchronized void q() {
        try {
            e eVar = this.e;
            e eVar2 = e.DISCONNECTED;
            if (eVar != eVar2) {
                this.e = eVar2;
                ScheduledFuture scheduledFuture = this.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.g;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.g = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public F70(d dVar, ScheduledExecutorService scheduledExecutorService, C8772uX0 c8772uX0, long j, long j2, boolean z) {
        this.e = e.IDLE;
        this.h = new RunnableC0733Ed0(new a());
        this.i = new RunnableC0733Ed0(new b());
        this.c = (d) AbstractC7785qy0.o(dVar, "keepAlivePinger");
        this.a = (ScheduledExecutorService) AbstractC7785qy0.o(scheduledExecutorService, "scheduler");
        this.b = (C8772uX0) AbstractC7785qy0.o(c8772uX0, "stopwatch");
        this.j = j;
        this.k = j2;
        this.d = z;
        c8772uX0.f().g();
    }

    public static final class c implements d {
        public final InterfaceC0463Bq a;

        public c(InterfaceC0463Bq interfaceC0463Bq) {
            this.a = interfaceC0463Bq;
        }

        @Override // com.daaw.F70.d
        public void a() {
            this.a.d(C6262lX0.u.q("Keepalive failed. The connection is likely gone"));
        }

        @Override // com.daaw.F70.d
        public void b() {
            this.a.h(new a(), AbstractC6041kl0.a());
        }

        public class a implements InterfaceC3525bm.a {
            public a() {
            }

            @Override // com.daaw.InterfaceC3525bm.a
            public void a(Throwable th) {
                c.this.a.d(C6262lX0.u.q("Keepalive failed. The connection is likely gone"));
            }

            @Override // com.daaw.InterfaceC3525bm.a
            public void b(long j) {
            }
        }
    }
}
