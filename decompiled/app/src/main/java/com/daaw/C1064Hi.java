package com.daaw;

import com.daaw.AbstractC0960Gi;
import com.daaw.C2860Yj0;
import com.daaw.InterfaceC3803cm;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.Hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1064Hi implements InterfaceC3803cm, AutoCloseable {
    public final InterfaceC3803cm B;
    public final AbstractC0960Gi C;
    public final Executor D;

    /* JADX INFO: renamed from: com.daaw.Hi$a */
    public class a extends AbstractC6787nP {
        public final InterfaceC0463Bq a;
        public final String b;
        public volatile C6262lX0 d;
        public C6262lX0 e;
        public C6262lX0 f;
        public final AtomicInteger c = new AtomicInteger(-2147483647);
        public final C2860Yj0.a g = new C0067a();

        /* JADX INFO: renamed from: com.daaw.Hi$a$a, reason: collision with other inner class name */
        public class C0067a implements C2860Yj0.a {
            public C0067a() {
            }

            @Override // com.daaw.C2860Yj0.a
            public void a() {
                if (a.this.c.decrementAndGet() == 0) {
                    a.this.j();
                }
            }
        }

        /* JADX INFO: renamed from: com.daaw.Hi$a$b */
        public class b extends AbstractC0960Gi.b {
            public final /* synthetic */ C6882nk0 a;
            public final /* synthetic */ C1168Ii b;

            public b(C6882nk0 c6882nk0, C1168Ii c1168Ii) {
                this.a = c6882nk0;
                this.b = c1168Ii;
            }
        }

        public a(InterfaceC0463Bq interfaceC0463Bq, String str) {
            this.a = (InterfaceC0463Bq) AbstractC7785qy0.o(interfaceC0463Bq, "delegate");
            this.b = (String) AbstractC7785qy0.o(str, "authority");
        }

        @Override // com.daaw.AbstractC6787nP
        public InterfaceC0463Bq a() {
            return this.a;
        }

        @Override // com.daaw.AbstractC6787nP, com.daaw.InterfaceC3525bm
        public InterfaceC2867Yl c(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, AbstractC3246am[] abstractC3246amArr) {
            AbstractC0960Gi abstractC0960GiC = c1168Ii.c();
            if (abstractC0960GiC == null) {
                abstractC0960GiC = C1064Hi.this.C;
            } else if (C1064Hi.this.C != null) {
                abstractC0960GiC = new C7743qp(C1064Hi.this.C, abstractC0960GiC);
            }
            if (abstractC0960GiC == null) {
                return this.c.get() >= 0 ? new KJ(this.d, abstractC3246amArr) : this.a.c(c6882nk0, c2756Xj0, c1168Ii, abstractC3246amArr);
            }
            C2860Yj0 c2860Yj0 = new C2860Yj0(this.a, c6882nk0, c2756Xj0, c1168Ii, this.g, abstractC3246amArr);
            if (this.c.incrementAndGet() > 0) {
                this.g.a();
                return new KJ(this.d, abstractC3246amArr);
            }
            try {
                abstractC0960GiC.a(new b(c6882nk0, c1168Ii), C1064Hi.this.D, c2860Yj0);
            } catch (Throwable th) {
                c2860Yj0.b(C6262lX0.n.q("Credentials should use fail() instead of throwing exceptions").p(th));
            }
            return c2860Yj0.d();
        }

        @Override // com.daaw.AbstractC6787nP, com.daaw.InterfaceC7420pg0
        public void d(C6262lX0 c6262lX0) {
            AbstractC7785qy0.o(c6262lX0, "status");
            synchronized (this) {
                try {
                    if (this.c.get() < 0) {
                        this.d = c6262lX0;
                        this.c.addAndGet(Integer.MAX_VALUE);
                    } else if (this.f != null) {
                        return;
                    }
                    if (this.c.get() != 0) {
                        this.f = c6262lX0;
                    } else {
                        super.d(c6262lX0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.AbstractC6787nP, com.daaw.InterfaceC7420pg0
        public void g(C6262lX0 c6262lX0) {
            AbstractC7785qy0.o(c6262lX0, "status");
            synchronized (this) {
                try {
                    if (this.c.get() < 0) {
                        this.d = c6262lX0;
                        this.c.addAndGet(Integer.MAX_VALUE);
                        if (this.c.get() != 0) {
                            this.e = c6262lX0;
                        } else {
                            super.g(c6262lX0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void j() {
            synchronized (this) {
                try {
                    if (this.c.get() != 0) {
                        return;
                    }
                    C6262lX0 c6262lX0 = this.e;
                    C6262lX0 c6262lX02 = this.f;
                    this.e = null;
                    this.f = null;
                    if (c6262lX0 != null) {
                        super.g(c6262lX0);
                    }
                    if (c6262lX02 != null) {
                        super.d(c6262lX02);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C1064Hi(InterfaceC3803cm interfaceC3803cm, AbstractC0960Gi abstractC0960Gi, Executor executor) {
        this.B = (InterfaceC3803cm) AbstractC7785qy0.o(interfaceC3803cm, "delegate");
        this.C = abstractC0960Gi;
        this.D = (Executor) AbstractC7785qy0.o(executor, "appExecutor");
    }

    @Override // com.daaw.InterfaceC3803cm
    public ScheduledExecutorService M0() {
        return this.B.M0();
    }

    @Override // com.daaw.InterfaceC3803cm, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.B.close();
    }

    @Override // com.daaw.InterfaceC3803cm
    public InterfaceC0463Bq t0(SocketAddress socketAddress, InterfaceC3803cm.a aVar, AbstractC6323lk abstractC6323lk) {
        return new a(this.B.t0(socketAddress, aVar, abstractC6323lk), aVar.a());
    }
}
