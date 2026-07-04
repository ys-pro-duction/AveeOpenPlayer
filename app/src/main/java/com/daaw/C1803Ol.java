package com.daaw;

import com.daaw.AbstractC1699Nl;
import com.daaw.C2756Xj0;
import com.daaw.C6262lX0;
import com.daaw.C6882nk0;
import com.daaw.C7141og0;
import com.daaw.C8594ts;
import com.daaw.InterfaceC2971Zl;
import com.daaw.InterfaceC8843um;
import com.daaw.TX0;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1803Ol extends AbstractC1699Nl {
    public static final Logger t = Logger.getLogger(C1803Ol.class.getName());
    public static final byte[] u = "gzip".getBytes(Charset.forName("US-ASCII"));
    public static final double v = TimeUnit.SECONDS.toNanos(1) * 1.0d;
    public final C6882nk0 a;
    public final U01 b;
    public final Executor c;
    public final boolean d;
    public final C1272Ji e;
    public final C8594ts f;
    public volatile ScheduledFuture g;
    public final boolean h;
    public C1168Ii i;
    public InterfaceC2867Yl j;
    public volatile boolean k;
    public boolean l;
    public boolean m;
    public final e n;
    public final ScheduledExecutorService p;
    public boolean q;
    public final f o = new f();
    public C1224Iw r = C1224Iw.c();
    public C2779Xp s = C2779Xp.a();

    /* JADX INFO: renamed from: com.daaw.Ol$b */
    public class b extends AbstractRunnableC0471Bs {
        public final /* synthetic */ AbstractC1699Nl.a C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC1699Nl.a aVar) {
            super(C1803Ol.this.f);
            this.C = aVar;
        }

        @Override // com.daaw.AbstractRunnableC0471Bs
        public void a() {
            C1803Ol c1803Ol = C1803Ol.this;
            c1803Ol.r(this.C, AbstractC1000Gs.a(c1803Ol.f), new C2756Xj0());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ol$c */
    public class c extends AbstractRunnableC0471Bs {
        public final /* synthetic */ AbstractC1699Nl.a C;
        public final /* synthetic */ String D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC1699Nl.a aVar, String str) {
            super(C1803Ol.this.f);
            this.C = aVar;
            this.D = str;
        }

        @Override // com.daaw.AbstractRunnableC0471Bs
        public void a() {
            C1803Ol.this.r(this.C, C6262lX0.t.q(String.format("Unable to find compressor by name %s", this.D)), new C2756Xj0());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ol$d */
    public class d implements InterfaceC2971Zl {
        public final AbstractC1699Nl.a a;
        public C6262lX0 b;

        /* JADX INFO: renamed from: com.daaw.Ol$d$a */
        public final class a extends AbstractRunnableC0471Bs {
            public final /* synthetic */ C4600fc0 C;
            public final /* synthetic */ C2756Xj0 D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4600fc0 c4600fc0, C2756Xj0 c2756Xj0) {
                super(C1803Ol.this.f);
                this.C = c4600fc0;
                this.D = c2756Xj0;
            }

            @Override // com.daaw.AbstractRunnableC0471Bs
            public void a() {
                AbstractC1213It0.g("ClientCall$Listener.headersRead", C1803Ol.this.b);
                AbstractC1213It0.d(this.C);
                try {
                    b();
                } finally {
                    AbstractC1213It0.i("ClientCall$Listener.headersRead", C1803Ol.this.b);
                }
            }

            public final void b() {
                if (d.this.b != null) {
                    return;
                }
                try {
                    d.this.a.b(this.D);
                } catch (Throwable th) {
                    d.this.i(C6262lX0.g.p(th).q("Failed to read headers"));
                }
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ol$d$b */
        public final class b extends AbstractRunnableC0471Bs {
            public final /* synthetic */ C4600fc0 C;
            public final /* synthetic */ TX0.a D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C4600fc0 c4600fc0, TX0.a aVar) {
                super(C1803Ol.this.f);
                this.C = c4600fc0;
                this.D = aVar;
            }

            private void b() {
                if (d.this.b != null) {
                    AbstractC7365pU.d(this.D);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.D.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.a.c(C1803Ol.this.a.i(next));
                            next.close();
                        } catch (Throwable th) {
                            AbstractC7365pU.e(next);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        AbstractC7365pU.d(this.D);
                        d.this.i(C6262lX0.g.p(th2).q("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // com.daaw.AbstractRunnableC0471Bs
            public void a() {
                AbstractC1213It0.g("ClientCall$Listener.messagesAvailable", C1803Ol.this.b);
                AbstractC1213It0.d(this.C);
                try {
                    b();
                } finally {
                    AbstractC1213It0.i("ClientCall$Listener.messagesAvailable", C1803Ol.this.b);
                }
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ol$d$c */
        public final class c extends AbstractRunnableC0471Bs {
            public final /* synthetic */ C4600fc0 C;
            public final /* synthetic */ C6262lX0 D;
            public final /* synthetic */ C2756Xj0 E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C4600fc0 c4600fc0, C6262lX0 c6262lX0, C2756Xj0 c2756Xj0) {
                super(C1803Ol.this.f);
                this.C = c4600fc0;
                this.D = c6262lX0;
                this.E = c2756Xj0;
            }

            private void b() {
                C6262lX0 c6262lX0 = this.D;
                C2756Xj0 c2756Xj0 = this.E;
                if (d.this.b != null) {
                    c6262lX0 = d.this.b;
                    c2756Xj0 = new C2756Xj0();
                }
                C1803Ol.this.k = true;
                try {
                    d dVar = d.this;
                    C1803Ol.this.r(dVar.a, c6262lX0, c2756Xj0);
                } finally {
                    C1803Ol.this.y();
                    C1803Ol.this.e.a(c6262lX0.o());
                }
            }

            @Override // com.daaw.AbstractRunnableC0471Bs
            public void a() {
                AbstractC1213It0.g("ClientCall$Listener.onClose", C1803Ol.this.b);
                AbstractC1213It0.d(this.C);
                try {
                    b();
                } finally {
                    AbstractC1213It0.i("ClientCall$Listener.onClose", C1803Ol.this.b);
                }
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ol$d$d, reason: collision with other inner class name */
        public final class C0105d extends AbstractRunnableC0471Bs {
            public final /* synthetic */ C4600fc0 C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0105d(C4600fc0 c4600fc0) {
                super(C1803Ol.this.f);
                this.C = c4600fc0;
            }

            private void b() {
                if (d.this.b != null) {
                    return;
                }
                try {
                    d.this.a.d();
                } catch (Throwable th) {
                    d.this.i(C6262lX0.g.p(th).q("Failed to call onReady."));
                }
            }

            @Override // com.daaw.AbstractRunnableC0471Bs
            public void a() {
                AbstractC1213It0.g("ClientCall$Listener.onReady", C1803Ol.this.b);
                AbstractC1213It0.d(this.C);
                try {
                    b();
                } finally {
                    AbstractC1213It0.i("ClientCall$Listener.onReady", C1803Ol.this.b);
                }
            }
        }

        public d(AbstractC1699Nl.a aVar) {
            this.a = (AbstractC1699Nl.a) AbstractC7785qy0.o(aVar, "observer");
        }

        @Override // com.daaw.TX0
        public void a(TX0.a aVar) {
            AbstractC1213It0.g("ClientStreamListener.messagesAvailable", C1803Ol.this.b);
            try {
                C1803Ol.this.c.execute(new b(AbstractC1213It0.e(), aVar));
            } finally {
                AbstractC1213It0.i("ClientStreamListener.messagesAvailable", C1803Ol.this.b);
            }
        }

        @Override // com.daaw.InterfaceC2971Zl
        public void b(C2756Xj0 c2756Xj0) {
            AbstractC1213It0.g("ClientStreamListener.headersRead", C1803Ol.this.b);
            try {
                C1803Ol.this.c.execute(new a(AbstractC1213It0.e(), c2756Xj0));
            } finally {
                AbstractC1213It0.i("ClientStreamListener.headersRead", C1803Ol.this.b);
            }
        }

        @Override // com.daaw.InterfaceC2971Zl
        public void c(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
            AbstractC1213It0.g("ClientStreamListener.closed", C1803Ol.this.b);
            try {
                h(c6262lX0, aVar, c2756Xj0);
            } finally {
                AbstractC1213It0.i("ClientStreamListener.closed", C1803Ol.this.b);
            }
        }

        @Override // com.daaw.TX0
        public void d() {
            if (C1803Ol.this.a.e().a()) {
                return;
            }
            AbstractC1213It0.g("ClientStreamListener.onReady", C1803Ol.this.b);
            try {
                C1803Ol.this.c.execute(new C0105d(AbstractC1213It0.e()));
            } finally {
                AbstractC1213It0.i("ClientStreamListener.onReady", C1803Ol.this.b);
            }
        }

        public final void h(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
            C6381lw c6381lwS = C1803Ol.this.s();
            if (c6262lX0.m() == C6262lX0.b.CANCELLED && c6381lwS != null && c6381lwS.m()) {
                C4994h00 c4994h00 = new C4994h00();
                C1803Ol.this.j.m(c4994h00);
                c6262lX0 = C6262lX0.j.e("ClientCall was cancelled at or after deadline. " + c4994h00);
                c2756Xj0 = new C2756Xj0();
            }
            C1803Ol.this.c.execute(new c(AbstractC1213It0.e(), c6262lX0, c2756Xj0));
        }

        public final void i(C6262lX0 c6262lX0) {
            this.b = c6262lX0;
            C1803Ol.this.j.f(c6262lX0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ol$e */
    public interface e {
        InterfaceC2867Yl a(C6882nk0 c6882nk0, C1168Ii c1168Ii, C2756Xj0 c2756Xj0, C8594ts c8594ts);
    }

    /* JADX INFO: renamed from: com.daaw.Ol$f */
    public final class f implements C8594ts.a {
        public f() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ol$g */
    public class g implements Runnable {
        public final long B;

        public g(long j) {
            this.B = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4994h00 c4994h00 = new C4994h00();
            C1803Ol.this.j.m(c4994h00);
            long jAbs = Math.abs(this.B);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(this.B) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.B < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            sb.append(c4994h00);
            C1803Ol.this.j.f(C6262lX0.j.e(sb.toString()));
        }
    }

    public C1803Ol(C6882nk0 c6882nk0, Executor executor, C1168Ii c1168Ii, e eVar, ScheduledExecutorService scheduledExecutorService, C1272Ji c1272Ji, AbstractC5278i10 abstractC5278i10) {
        this.a = c6882nk0;
        U01 u01B = AbstractC1213It0.b(c6882nk0.c(), System.identityHashCode(this));
        this.b = u01B;
        if (executor == AbstractC6041kl0.a()) {
            this.c = new XP0();
            this.d = true;
        } else {
            this.c = new ZP0(executor);
            this.d = false;
        }
        this.e = c1272Ji;
        this.f = C8594ts.e();
        this.h = c6882nk0.e() == C6882nk0.d.UNARY || c6882nk0.e() == C6882nk0.d.SERVER_STREAMING;
        this.i = c1168Ii;
        this.n = eVar;
        this.p = scheduledExecutorService;
        AbstractC1213It0.c("ClientCall.<init>", u01B);
    }

    public static boolean u(C6381lw c6381lw, C6381lw c6381lw2) {
        if (c6381lw == null) {
            return false;
        }
        if (c6381lw2 == null) {
            return true;
        }
        return c6381lw.l(c6381lw2);
    }

    public static void v(C6381lw c6381lw, C6381lw c6381lw2, C6381lw c6381lw3) {
        Logger logger = t;
        if (logger.isLoggable(Level.FINE) && c6381lw != null && c6381lw.equals(c6381lw2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jMax = Math.max(0L, c6381lw.o(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jMax)));
            if (c6381lw3 == null) {
                sb.append(" Explicit call timeout was not set.");
            } else {
                sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c6381lw3.o(timeUnit))));
            }
            logger.fine(sb.toString());
        }
    }

    public static C6381lw w(C6381lw c6381lw, C6381lw c6381lw2) {
        return c6381lw == null ? c6381lw2 : c6381lw2 == null ? c6381lw : c6381lw.n(c6381lw2);
    }

    public static void x(C2756Xj0 c2756Xj0, C1224Iw c1224Iw, InterfaceC2675Wp interfaceC2675Wp, boolean z) {
        c2756Xj0.e(AbstractC7365pU.i);
        C2756Xj0.g gVar = AbstractC7365pU.e;
        c2756Xj0.e(gVar);
        if (interfaceC2675Wp != InterfaceC8843um.b.a) {
            c2756Xj0.p(gVar, interfaceC2675Wp.a());
        }
        C2756Xj0.g gVar2 = AbstractC7365pU.f;
        c2756Xj0.e(gVar2);
        byte[] bArrA = AbstractC5555j10.a(c1224Iw);
        if (bArrA.length != 0) {
            c2756Xj0.p(gVar2, bArrA);
        }
        c2756Xj0.e(AbstractC7365pU.g);
        C2756Xj0.g gVar3 = AbstractC7365pU.h;
        c2756Xj0.e(gVar3);
        if (z) {
            c2756Xj0.p(gVar3, u);
        }
    }

    public C1803Ol A(C2779Xp c2779Xp) {
        this.s = c2779Xp;
        return this;
    }

    public C1803Ol B(C1224Iw c1224Iw) {
        this.r = c1224Iw;
        return this;
    }

    public C1803Ol C(boolean z) {
        this.q = z;
        return this;
    }

    public final ScheduledFuture D(C6381lw c6381lw) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jO = c6381lw.o(timeUnit);
        return this.p.schedule(new RunnableC0733Ed0(new g(jO)), jO, timeUnit);
    }

    public final void E(AbstractC1699Nl.a aVar, C2756Xj0 c2756Xj0) {
        InterfaceC2675Wp interfaceC2675WpB;
        AbstractC7785qy0.u(this.j == null, "Already started");
        AbstractC7785qy0.u(!this.l, "call was cancelled");
        AbstractC7785qy0.o(aVar, "observer");
        AbstractC7785qy0.o(c2756Xj0, "headers");
        if (this.f.h()) {
            this.j = C9698xo0.a;
            this.c.execute(new b(aVar));
            return;
        }
        p();
        String strB = this.i.b();
        if (strB != null) {
            interfaceC2675WpB = this.s.b(strB);
            if (interfaceC2675WpB == null) {
                this.j = C9698xo0.a;
                this.c.execute(new c(aVar, strB));
                return;
            }
        } else {
            interfaceC2675WpB = InterfaceC8843um.b.a;
        }
        x(c2756Xj0, this.r, interfaceC2675WpB, this.q);
        C6381lw c6381lwS = s();
        if (c6381lwS == null || !c6381lwS.m()) {
            v(c6381lwS, this.f.g(), this.i.d());
            this.j = this.n.a(this.a, this.i, c2756Xj0, this.f);
        } else {
            this.j = new KJ(C6262lX0.j.q(String.format("ClientCall started after %s deadline was exceeded .9%f seconds ago", u(this.i.d(), this.f.g()) ? "CallOptions" : "Context", Double.valueOf(c6381lwS.o(TimeUnit.NANOSECONDS) / v))), AbstractC7365pU.f(this.i, c2756Xj0, 0, false));
        }
        if (this.d) {
            this.j.p();
        }
        if (this.i.a() != null) {
            this.j.h(this.i.a());
        }
        if (this.i.f() != null) {
            this.j.d(this.i.f().intValue());
        }
        if (this.i.g() != null) {
            this.j.e(this.i.g().intValue());
        }
        if (c6381lwS != null) {
            this.j.i(c6381lwS);
        }
        this.j.b(interfaceC2675WpB);
        boolean z = this.q;
        if (z) {
            this.j.q(z);
        }
        this.j.g(this.r);
        this.e.b();
        this.j.l(new d(aVar));
        this.f.a(this.o, AbstractC6041kl0.a());
        if (c6381lwS != null && !c6381lwS.equals(this.f.g()) && this.p != null) {
            this.g = D(c6381lwS);
        }
        if (this.k) {
            y();
        }
    }

    @Override // com.daaw.AbstractC1699Nl
    public void a(String str, Throwable th) {
        AbstractC1213It0.g("ClientCall.cancel", this.b);
        try {
            q(str, th);
        } finally {
            AbstractC1213It0.i("ClientCall.cancel", this.b);
        }
    }

    @Override // com.daaw.AbstractC1699Nl
    public void b() {
        AbstractC1213It0.g("ClientCall.halfClose", this.b);
        try {
            t();
        } finally {
            AbstractC1213It0.i("ClientCall.halfClose", this.b);
        }
    }

    @Override // com.daaw.AbstractC1699Nl
    public void c(int i) {
        AbstractC1213It0.g("ClientCall.request", this.b);
        try {
            AbstractC7785qy0.u(this.j != null, "Not started");
            AbstractC7785qy0.e(i >= 0, "Number requested must be non-negative");
            this.j.c(i);
        } finally {
            AbstractC1213It0.i("ClientCall.request", this.b);
        }
    }

    @Override // com.daaw.AbstractC1699Nl
    public void d(Object obj) {
        AbstractC1213It0.g("ClientCall.sendMessage", this.b);
        try {
            z(obj);
        } finally {
            AbstractC1213It0.i("ClientCall.sendMessage", this.b);
        }
    }

    @Override // com.daaw.AbstractC1699Nl
    public void e(AbstractC1699Nl.a aVar, C2756Xj0 c2756Xj0) {
        AbstractC1213It0.g("ClientCall.start", this.b);
        try {
            E(aVar, c2756Xj0);
        } finally {
            AbstractC1213It0.i("ClientCall.start", this.b);
        }
    }

    public final void p() {
        C7141og0.b bVar = (C7141og0.b) this.i.h(C7141og0.b.g);
        if (bVar == null) {
            return;
        }
        Long l = bVar.a;
        if (l != null) {
            C6381lw c6381lwA = C6381lw.a(l.longValue(), TimeUnit.NANOSECONDS);
            C6381lw c6381lwD = this.i.d();
            if (c6381lwD == null || c6381lwA.compareTo(c6381lwD) < 0) {
                this.i = this.i.m(c6381lwA);
            }
        }
        Boolean bool = bVar.b;
        if (bool != null) {
            this.i = bool.booleanValue() ? this.i.s() : this.i.t();
        }
        if (bVar.c != null) {
            Integer numF = this.i.f();
            if (numF != null) {
                this.i = this.i.o(Math.min(numF.intValue(), bVar.c.intValue()));
            } else {
                this.i = this.i.o(bVar.c.intValue());
            }
        }
        if (bVar.d != null) {
            Integer numG = this.i.g();
            if (numG != null) {
                this.i = this.i.p(Math.min(numG.intValue(), bVar.d.intValue()));
            } else {
                this.i = this.i.p(bVar.d.intValue());
            }
        }
    }

    public final void q(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.l) {
            return;
        }
        this.l = true;
        try {
            if (this.j != null) {
                C6262lX0 c6262lX0 = C6262lX0.g;
                C6262lX0 c6262lX0Q = str != null ? c6262lX0.q(str) : c6262lX0.q("Call cancelled without message");
                if (th != null) {
                    c6262lX0Q = c6262lX0Q.p(th);
                }
                this.j.f(c6262lX0Q);
            }
            y();
        } catch (Throwable th2) {
            y();
            throw th2;
        }
    }

    public final void r(AbstractC1699Nl.a aVar, C6262lX0 c6262lX0, C2756Xj0 c2756Xj0) {
        aVar.a(c6262lX0, c2756Xj0);
    }

    public final C6381lw s() {
        return w(this.i.d(), this.f.g());
    }

    public final void t() {
        AbstractC7785qy0.u(this.j != null, "Not started");
        AbstractC7785qy0.u(!this.l, "call was cancelled");
        AbstractC7785qy0.u(!this.m, "call already half-closed");
        this.m = true;
        this.j.j();
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("method", this.a).toString();
    }

    public final void y() {
        this.f.i(this.o);
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void z(Object obj) {
        AbstractC7785qy0.u(this.j != null, "Not started");
        AbstractC7785qy0.u(!this.l, "call was cancelled");
        AbstractC7785qy0.u(!this.m, "call was half-closed");
        try {
            InterfaceC2867Yl interfaceC2867Yl = this.j;
            if (interfaceC2867Yl instanceof AbstractC5636jJ0) {
                ((AbstractC5636jJ0) interfaceC2867Yl).o0(obj);
            } else {
                interfaceC2867Yl.n(this.a.j(obj));
            }
            if (this.h) {
                return;
            }
            this.j.flush();
        } catch (Error e2) {
            this.j.f(C6262lX0.g.q("Client sendMessage() failed with Error"));
            throw e2;
        } catch (RuntimeException e3) {
            this.j.f(C6262lX0.g.p(e3).q("Failed to stream message"));
        }
    }
}
