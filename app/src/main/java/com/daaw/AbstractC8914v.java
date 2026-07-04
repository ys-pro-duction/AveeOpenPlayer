package com.daaw;

import com.daaw.A0;
import com.daaw.C1588Mj0;
import com.daaw.C2756Xj0;
import com.daaw.InterfaceC2971Zl;
import com.daaw.InterfaceC8843um;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8914v extends A0 implements InterfaceC2867Yl, C1588Mj0.d {
    public static final Logger g = Logger.getLogger(AbstractC8914v.class.getName());
    public final T51 a;
    public final InterfaceC8743uQ b;
    public boolean c;
    public boolean d;
    public C2756Xj0 e;
    public volatile boolean f;

    /* JADX INFO: renamed from: com.daaw.v$b */
    public interface b {
        void f(C6262lX0 c6262lX0);

        void g(InterfaceC7157oj1 interfaceC7157oj1, boolean z, boolean z2, int i);

        void h(C2756Xj0 c2756Xj0, byte[] bArr);
    }

    /* JADX INFO: renamed from: com.daaw.v$c */
    public static abstract class c extends A0.a {
        public final C5695jX0 i;
        public boolean j;
        public InterfaceC2971Zl k;
        public boolean l;
        public C1224Iw m;
        public boolean n;
        public Runnable o;
        public volatile boolean p;
        public boolean q;
        public boolean r;

        /* JADX INFO: renamed from: com.daaw.v$c$a */
        public class a implements Runnable {
            public final /* synthetic */ C6262lX0 B;
            public final /* synthetic */ InterfaceC2971Zl.a C;
            public final /* synthetic */ C2756Xj0 D;

            public a(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
                this.B = c6262lX0;
                this.C = aVar;
                this.D = c2756Xj0;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.C(this.B, this.C, this.D);
            }
        }

        public c(int i, C5695jX0 c5695jX0, T51 t51) {
            super(i, c5695jX0, t51);
            this.m = C1224Iw.c();
            this.n = false;
            this.i = (C5695jX0) AbstractC7785qy0.o(c5695jX0, "statsTraceCtx");
        }

        public final void C(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
            if (this.j) {
                return;
            }
            this.j = true;
            this.i.m(c6262lX0);
            o().c(c6262lX0, aVar, c2756Xj0);
            if (m() != null) {
                m().f(c6262lX0.o());
            }
        }

        public void D(IE0 ie0) throws Throwable {
            AbstractC7785qy0.o(ie0, "frame");
            boolean z = true;
            try {
                if (this.q) {
                    AbstractC8914v.g.log(Level.INFO, "Received data on closed stream");
                    ie0.close();
                    return;
                } else {
                    try {
                        l(ie0);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (z) {
                ie0.close();
            }
            throw th;
        }

        public void E(C2756Xj0 c2756Xj0) {
            boolean z;
            AbstractC7785qy0.u(!this.q, "Received headers on closed stream");
            this.i.a();
            String str = (String) c2756Xj0.g(AbstractC7365pU.g);
            if (!this.l || str == null) {
                z = false;
            } else if (str.equalsIgnoreCase("gzip")) {
                w(new C8201sU());
                z = true;
            } else {
                if (!str.equalsIgnoreCase("identity")) {
                    e(C6262lX0.t.q(String.format("Can't find full stream decompressor for %s", str)).d());
                    return;
                }
                z = false;
            }
            String str2 = (String) c2756Xj0.g(AbstractC7365pU.e);
            if (str2 != null) {
                InterfaceC1120Hw interfaceC1120HwE = this.m.e(str2);
                if (interfaceC1120HwE == null) {
                    e(C6262lX0.t.q(String.format("Can't find decompressor for %s", str2)).d());
                    return;
                } else if (interfaceC1120HwE != InterfaceC8843um.b.a) {
                    if (z) {
                        e(C6262lX0.t.q("Full stream and gRPC message encoding cannot both be set").d());
                        return;
                    }
                    v(interfaceC1120HwE);
                }
            }
            o().b(c2756Xj0);
        }

        public void F(C2756Xj0 c2756Xj0, C6262lX0 c6262lX0) {
            AbstractC7785qy0.o(c6262lX0, "status");
            AbstractC7785qy0.o(c2756Xj0, "trailers");
            if (this.q) {
                AbstractC8914v.g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{c6262lX0, c2756Xj0});
            } else {
                this.i.b(c2756Xj0);
                N(c6262lX0, false, c2756Xj0);
            }
        }

        public final boolean G() {
            return this.p;
        }

        @Override // com.daaw.A0.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2971Zl o() {
            return this.k;
        }

        public final void I(C1224Iw c1224Iw) {
            AbstractC7785qy0.u(this.k == null, "Already called start");
            this.m = (C1224Iw) AbstractC7785qy0.o(c1224Iw, "decompressorRegistry");
        }

        public final void J(boolean z) {
            this.l = z;
        }

        public final void K(InterfaceC2971Zl interfaceC2971Zl) {
            AbstractC7785qy0.u(this.k == null, "Already called setListener");
            this.k = (InterfaceC2971Zl) AbstractC7785qy0.o(interfaceC2971Zl, "listener");
        }

        public final void L() {
            this.p = true;
        }

        public final void M(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, boolean z, C2756Xj0 c2756Xj0) {
            AbstractC7785qy0.o(c6262lX0, "status");
            AbstractC7785qy0.o(c2756Xj0, "trailers");
            if (!this.q || z) {
                this.q = true;
                this.r = c6262lX0.o();
                s();
                if (this.n) {
                    this.o = null;
                    C(c6262lX0, aVar, c2756Xj0);
                } else {
                    this.o = new a(c6262lX0, aVar, c2756Xj0);
                    k(z);
                }
            }
        }

        public final void N(C6262lX0 c6262lX0, boolean z, C2756Xj0 c2756Xj0) {
            M(c6262lX0, InterfaceC2971Zl.a.PROCESSED, z, c2756Xj0);
        }

        public void c(boolean z) {
            AbstractC7785qy0.u(this.q, "status should have been reported on deframer closed");
            this.n = true;
            if (this.r && z) {
                N(C6262lX0.t.q("Encountered end-of-stream mid-frame"), true, new C2756Xj0());
            }
            Runnable runnable = this.o;
            if (runnable != null) {
                runnable.run();
                this.o = null;
            }
        }
    }

    public AbstractC8914v(InterfaceC7436pj1 interfaceC7436pj1, C5695jX0 c5695jX0, T51 t51, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, boolean z) {
        AbstractC7785qy0.o(c2756Xj0, "headers");
        this.a = (T51) AbstractC7785qy0.o(t51, "transportTracer");
        this.c = AbstractC7365pU.o(c1168Ii);
        this.d = z;
        if (z) {
            this.b = new a(c2756Xj0, c5695jX0);
        } else {
            this.b = new C1588Mj0(this, interfaceC7436pj1, c5695jX0);
            this.e = c2756Xj0;
        }
    }

    @Override // com.daaw.A0, com.daaw.LX0
    public final boolean a() {
        return super.a() && !this.f;
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void d(int i) {
        z().x(i);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void e(int i) {
        this.b.e(i);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void f(C6262lX0 c6262lX0) {
        AbstractC7785qy0.e(!c6262lX0.o(), "Should not cancel with OK status");
        this.f = true;
        v().f(c6262lX0);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void g(C1224Iw c1224Iw) {
        z().I(c1224Iw);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void i(C6381lw c6381lw) {
        C2756Xj0 c2756Xj0 = this.e;
        C2756Xj0.g gVar = AbstractC7365pU.d;
        c2756Xj0.e(gVar);
        this.e.p(gVar, Long.valueOf(Math.max(0L, c6381lw.o(TimeUnit.NANOSECONDS))));
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void j() {
        if (z().G()) {
            return;
        }
        z().L();
        r();
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void l(InterfaceC2971Zl interfaceC2971Zl) {
        z().K(interfaceC2971Zl);
        if (this.d) {
            return;
        }
        v().h(this.e, null);
        this.e = null;
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void m(C4994h00 c4994h00) {
        c4994h00.b("remote_addr", k().b(AbstractC4276eU.a));
    }

    @Override // com.daaw.C1588Mj0.d
    public final void o(InterfaceC7157oj1 interfaceC7157oj1, boolean z, boolean z2, int i) {
        AbstractC7785qy0.e(interfaceC7157oj1 != null || z, "null frame before EOS");
        v().g(interfaceC7157oj1, z, z2, i);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void q(boolean z) {
        z().J(z);
    }

    @Override // com.daaw.A0
    public final InterfaceC8743uQ s() {
        return this.b;
    }

    public abstract b v();

    public T51 x() {
        return this.a;
    }

    public final boolean y() {
        return this.c;
    }

    public abstract c z();

    /* JADX INFO: renamed from: com.daaw.v$a */
    public class a implements InterfaceC8743uQ {
        public C2756Xj0 a;
        public boolean b;
        public final C5695jX0 c;
        public byte[] d;

        public a(C2756Xj0 c2756Xj0, C5695jX0 c5695jX0) {
            this.a = (C2756Xj0) AbstractC7785qy0.o(c2756Xj0, "headers");
            this.c = (C5695jX0) AbstractC7785qy0.o(c5695jX0, "statsTraceCtx");
        }

        @Override // com.daaw.InterfaceC8743uQ
        public void c(InputStream inputStream) {
            AbstractC7785qy0.u(this.d == null, "writePayload should not be called multiple times");
            try {
                this.d = AbstractC4062di.d(inputStream);
                this.c.i(0);
                C5695jX0 c5695jX0 = this.c;
                byte[] bArr = this.d;
                c5695jX0.j(0, bArr.length, bArr.length);
                this.c.k(this.d.length);
                this.c.l(this.d.length);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.daaw.InterfaceC8743uQ
        public void close() {
            this.b = true;
            AbstractC7785qy0.u(this.d != null, "Lack of request message. GET request is only supported for unary requests");
            AbstractC8914v.this.v().h(this.a, this.d);
            this.d = null;
            this.a = null;
        }

        @Override // com.daaw.InterfaceC8743uQ
        public boolean isClosed() {
            return this.b;
        }

        @Override // com.daaw.InterfaceC8743uQ
        public void flush() {
        }

        @Override // com.daaw.InterfaceC8743uQ
        public InterfaceC8743uQ b(InterfaceC2675Wp interfaceC2675Wp) {
            return this;
        }

        @Override // com.daaw.InterfaceC8743uQ
        public void e(int i) {
        }
    }
}
