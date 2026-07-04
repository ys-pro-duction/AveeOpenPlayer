package com.daaw;

import com.daaw.AbstractC7365pU;
import com.daaw.C1301Jp0;
import com.daaw.C1509Lp0;
import com.daaw.C1716Np0;
import com.daaw.C4720g10;
import com.daaw.C6262lX0;
import com.daaw.C6759nI;
import com.daaw.C6760nI0;
import com.daaw.C6882nk0;
import com.daaw.C6917nr0;
import com.daaw.CW;
import com.daaw.F70;
import com.daaw.InterfaceC2971Zl;
import com.daaw.InterfaceC3525bm;
import com.daaw.InterfaceC7420pg0;
import com.daaw.InterfaceC7628qQ;
import com.daaw.T51;
import com.revenuecat.purchases.common.Constants;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.daaw.Mp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1612Mp0 implements InterfaceC0463Bq, C6759nI.a, C6917nr0.d {
    public static final Map V = Q();
    public static final Logger W = Logger.getLogger(C1612Mp0.class.getName());
    public final SocketFactory A;
    public SSLSocketFactory B;
    public HostnameVerifier C;
    public Socket D;
    public int E;
    public final Deque F;
    public final C0567Cq G;
    public F70 H;
    public boolean I;
    public long J;
    public long K;
    public boolean L;
    public final Runnable M;
    public final int N;
    public final boolean O;
    public final T51 P;
    public final AbstractC4018dZ Q;
    public C4720g10.b R;
    public final C9332wW S;
    public int T;
    public Runnable U;
    public final InetSocketAddress a;
    public final String b;
    public final String c;
    public final Random d;
    public final AZ0 e;
    public final int f;
    public final InterfaceC1146Ic1 g;
    public InterfaceC7420pg0.a h;
    public C6759nI i;
    public C6917nr0 j;
    public final Object k;
    public final C6404m10 l;
    public int m;
    public final Map n;
    public final Executor o;
    public final ZP0 p;
    public final ScheduledExecutorService q;
    public final int r;
    public int s;
    public e t;
    public C1971Qb u;
    public C6262lX0 v;
    public boolean w;
    public C9053vW x;
    public boolean y;
    public boolean z;

    /* JADX INFO: renamed from: com.daaw.Mp0$a */
    public class a extends AbstractC4018dZ {
        public a() {
        }

        @Override // com.daaw.AbstractC4018dZ
        public void b() {
            C1612Mp0.this.h.d(true);
        }

        @Override // com.daaw.AbstractC4018dZ
        public void c() {
            C1612Mp0.this.h.d(false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Mp0$b */
    public class b implements T51.c {
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Mp0$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = C1612Mp0.this.U;
            if (runnable != null) {
                runnable.run();
            }
            C1612Mp0.this.o.execute(C1612Mp0.this.t);
            synchronized (C1612Mp0.this.k) {
                C1612Mp0.this.E = Integer.MAX_VALUE;
                C1612Mp0.this.l0();
            }
            C1612Mp0.this.getClass();
        }
    }

    public C1612Mp0(C1301Jp0.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, C1971Qb c1971Qb, C9332wW c9332wW, Runnable runnable) {
        this(fVar, inetSocketAddress, str, str2, c1971Qb, AbstractC7365pU.w, new C8488tW(), c9332wW, runnable);
    }

    public static /* synthetic */ int D(C1612Mp0 c1612Mp0, int i) {
        int i2 = c1612Mp0.s + i;
        c1612Mp0.s = i2;
        return i2;
    }

    public static Map Q() {
        EnumMap enumMap = new EnumMap(EnumC7034oH.class);
        EnumC7034oH enumC7034oH = EnumC7034oH.NO_ERROR;
        C6262lX0 c6262lX0 = C6262lX0.t;
        enumMap.put(enumC7034oH, c6262lX0.q("No error: A GRPC status of OK should have been sent"));
        enumMap.put(EnumC7034oH.PROTOCOL_ERROR, c6262lX0.q("Protocol error"));
        enumMap.put(EnumC7034oH.INTERNAL_ERROR, c6262lX0.q("Internal error"));
        enumMap.put(EnumC7034oH.FLOW_CONTROL_ERROR, c6262lX0.q("Flow control error"));
        enumMap.put(EnumC7034oH.STREAM_CLOSED, c6262lX0.q("Stream closed"));
        enumMap.put(EnumC7034oH.FRAME_TOO_LARGE, c6262lX0.q("Frame too large"));
        enumMap.put(EnumC7034oH.REFUSED_STREAM, C6262lX0.u.q("Refused stream"));
        enumMap.put(EnumC7034oH.CANCEL, C6262lX0.g.q("Cancelled"));
        enumMap.put(EnumC7034oH.COMPRESSION_ERROR, c6262lX0.q("Compression error"));
        enumMap.put(EnumC7034oH.CONNECT_ERROR, c6262lX0.q("Connect error"));
        enumMap.put(EnumC7034oH.ENHANCE_YOUR_CALM, C6262lX0.o.q("Enhance your calm"));
        enumMap.put(EnumC7034oH.INADEQUATE_SECURITY, C6262lX0.m.q("Inadequate security"));
        return DesugarCollections.unmodifiableMap(enumMap);
    }

    public static String g0(PU0 pu0) throws EOFException {
        C4057dh c4057dh = new C4057dh();
        while (pu0.A0(c4057dh, 1L) != -1) {
            if (c4057dh.o(c4057dh.f1() - 1) == 10) {
                return c4057dh.Y0();
            }
        }
        throw new EOFException("\\n not found: " + c4057dh.x0().l());
    }

    public static C6262lX0 p0(EnumC7034oH enumC7034oH) {
        C6262lX0 c6262lX0 = (C6262lX0) V.get(enumC7034oH);
        if (c6262lX0 != null) {
            return c6262lX0;
        }
        return C6262lX0.h.q("Unknown http2 error code: " + enumC7034oH.B);
    }

    public final C6760nI0 R(InetSocketAddress inetSocketAddress, String str, String str2) {
        CW cwA = new CW.b().k("https").h(inetSocketAddress.getHostName()).j(inetSocketAddress.getPort()).a();
        C6760nI0.b bVarD = new C6760nI0.b().e(cwA).d("Host", cwA.c() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + cwA.f()).d("User-Agent", this.c);
        if (str != null && str2 != null) {
            bVarD.d("Proxy-Authorization", AbstractC5524iu.a(str, str2));
        }
        return bVarD.c();
    }

    public final Socket S(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws C6541mX0 {
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(this.T);
            PU0 pu0H = AbstractC2468Up0.h(socketCreateSocket);
            InterfaceC7145oh interfaceC7145ohA = AbstractC2468Up0.a(AbstractC2468Up0.e(socketCreateSocket));
            C6760nI0 c6760nI0R = R(inetSocketAddress, str, str2);
            CW cwB = c6760nI0R.b();
            interfaceC7145ohA.d0(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", cwB.c(), Integer.valueOf(cwB.f()))).d0("\r\n");
            int iB = c6760nI0R.a().b();
            for (int i = 0; i < iB; i++) {
                interfaceC7145ohA.d0(c6760nI0R.a().a(i)).d0(": ").d0(c6760nI0R.a().c(i)).d0("\r\n");
            }
            interfaceC7145ohA.d0("\r\n");
            interfaceC7145ohA.flush();
            C7099oX0 c7099oX0A = C7099oX0.a(g0(pu0H));
            while (!g0(pu0H).equals("")) {
            }
            int i2 = c7099oX0A.b;
            if (i2 >= 200 && i2 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            C4057dh c4057dh = new C4057dh();
            try {
                socketCreateSocket.shutdownOutput();
                pu0H.A0(c4057dh, 1024L);
            } catch (IOException e2) {
                c4057dh.d0("Unable to read body: " + e2.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            throw C6262lX0.u.q(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(c7099oX0A.b), c7099oX0A.c, c4057dh.E0())).c();
        } catch (IOException e3) {
            if (socketCreateSocket != null) {
                AbstractC7365pU.e(socketCreateSocket);
            }
            throw C6262lX0.u.q("Failed trying to connect with proxy").p(e3).c();
        }
    }

    public void T(boolean z, long j, long j2, boolean z2) {
        this.I = z;
        this.J = j;
        this.K = j2;
        this.L = z2;
    }

    public void U(int i, C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, boolean z, EnumC7034oH enumC7034oH, C2756Xj0 c2756Xj0) {
        synchronized (this.k) {
            try {
                C1509Lp0 c1509Lp0 = (C1509Lp0) this.n.remove(Integer.valueOf(i));
                if (c1509Lp0 != null) {
                    if (enumC7034oH != null) {
                        this.i.f(i, EnumC7034oH.CANCEL);
                    }
                    if (c6262lX0 != null) {
                        C1509Lp0.b bVarN = c1509Lp0.u();
                        if (c2756Xj0 == null) {
                            c2756Xj0 = new C2756Xj0();
                        }
                        bVarN.M(c6262lX0, aVar, z, c2756Xj0);
                    }
                    if (!l0()) {
                        n0();
                        d0(c1509Lp0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1971Qb V() {
        return this.u;
    }

    public String W() {
        URI uriB = AbstractC7365pU.b(this.b);
        return uriB.getHost() != null ? uriB.getHost() : this.b;
    }

    public int X() {
        URI uriB = AbstractC7365pU.b(this.b);
        return uriB.getPort() != -1 ? uriB.getPort() : this.a.getPort();
    }

    public final Throwable Y() {
        synchronized (this.k) {
            try {
                C6262lX0 c6262lX0 = this.v;
                if (c6262lX0 != null) {
                    return c6262lX0.c();
                }
                return C6262lX0.u.q("Connection closed").c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1509Lp0 Z(int i) {
        C1509Lp0 c1509Lp0;
        synchronized (this.k) {
            c1509Lp0 = (C1509Lp0) this.n.get(Integer.valueOf(i));
        }
        return c1509Lp0;
    }

    @Override // com.daaw.C6917nr0.d
    public C6917nr0.c[] a() {
        C6917nr0.c[] cVarArr;
        synchronized (this.k) {
            try {
                cVarArr = new C6917nr0.c[this.n.size()];
                Iterator it = this.n.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    cVarArr[i] = ((C1509Lp0) it.next()).u().b0();
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarArr;
    }

    public final void a0() {
        synchronized (this.k) {
            this.P.g(new b());
        }
    }

    @Override // com.daaw.InterfaceC7420pg0
    public Runnable b(InterfaceC7420pg0.a aVar) {
        this.h = (InterfaceC7420pg0.a) AbstractC7785qy0.o(aVar, "listener");
        if (this.I) {
            F70 f70 = new F70(new F70.c(this), this.q, this.J, this.K, this.L);
            this.H = f70;
            f70.p();
        }
        C0403Bb c0403BbW = C0403Bb.W(this.p, this, 10000);
        InterfaceC8464tQ interfaceC8464tQU = c0403BbW.U(this.g.b(AbstractC2468Up0.a(c0403BbW), true));
        synchronized (this.k) {
            C6759nI c6759nI = new C6759nI(this, interfaceC8464tQU);
            this.i = c6759nI;
            this.j = new C6917nr0(this, c6759nI);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.p.execute(new c(countDownLatch, c0403BbW));
        try {
            i0();
            countDownLatch.countDown();
            this.p.execute(new d());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    public boolean b0() {
        return this.B == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c0(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            int r1 = r2.m     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r1) goto Lc
            r1 = 1
            r3 = r3 & r1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1612Mp0.c0(int):boolean");
    }

    @Override // com.daaw.InterfaceC7420pg0
    public void d(C6262lX0 c6262lX0) {
        g(c6262lX0);
        synchronized (this.k) {
            try {
                Iterator it = this.n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((C1509Lp0) entry.getValue()).u().N(c6262lX0, false, new C2756Xj0());
                    d0((C1509Lp0) entry.getValue());
                }
                for (C1509Lp0 c1509Lp0 : this.F) {
                    c1509Lp0.u().M(c6262lX0, InterfaceC2971Zl.a.MISCARRIED, true, new C2756Xj0());
                    d0(c1509Lp0);
                }
                this.F.clear();
                n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d0(C1509Lp0 c1509Lp0) {
        if (this.z && this.F.isEmpty() && this.n.isEmpty()) {
            this.z = false;
            F70 f70 = this.H;
            if (f70 != null) {
                f70.o();
            }
        }
        if (c1509Lp0.y()) {
            this.Q.e(c1509Lp0, false);
        }
    }

    @Override // com.daaw.C6759nI.a
    public void e(Throwable th) {
        AbstractC7785qy0.o(th, "failureCause");
        k0(0, EnumC7034oH.INTERNAL_ERROR, C6262lX0.u.p(th));
    }

    @Override // com.daaw.InterfaceC3525bm
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C1509Lp0 c(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, AbstractC3246am[] abstractC3246amArr) {
        C1509Lp0 c1509Lp0;
        AbstractC7785qy0.o(c6882nk0, "method");
        AbstractC7785qy0.o(c2756Xj0, "headers");
        C5695jX0 c5695jX0H = C5695jX0.h(abstractC3246amArr, V(), c2756Xj0);
        synchronized (this.k) {
            c1509Lp0 = new C1509Lp0(c6882nk0, c2756Xj0, this.i, this, this.j, this.k, this.r, this.f, this.b, this.c, c5695jX0H, this.P, c1168Ii, this.O);
        }
        return c1509Lp0;
    }

    @Override // com.daaw.InterfaceC8921v10
    public C6404m10 f() {
        return this.l;
    }

    public final void f0(EnumC7034oH enumC7034oH, String str) {
        k0(0, enumC7034oH, p0(enumC7034oH).e(str));
    }

    @Override // com.daaw.InterfaceC7420pg0
    public void g(C6262lX0 c6262lX0) {
        synchronized (this.k) {
            try {
                if (this.v != null) {
                    return;
                }
                this.v = c6262lX0;
                this.h.a(c6262lX0);
                n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC3525bm
    public void h(InterfaceC3525bm.a aVar, Executor executor) {
        long jNextLong;
        synchronized (this.k) {
            try {
                boolean z = true;
                AbstractC7785qy0.t(this.i != null);
                if (this.y) {
                    C9053vW.g(aVar, executor, Y());
                    return;
                }
                C9053vW c9053vW = this.x;
                if (c9053vW != null) {
                    jNextLong = 0;
                    z = false;
                } else {
                    jNextLong = this.d.nextLong();
                    C8772uX0 c8772uX0 = (C8772uX0) this.e.get();
                    c8772uX0.g();
                    C9053vW c9053vW2 = new C9053vW(jNextLong, c8772uX0);
                    this.x = c9053vW2;
                    this.P.b();
                    c9053vW = c9053vW2;
                }
                if (z) {
                    this.i.h(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                c9053vW.a(aVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h0(C1509Lp0 c1509Lp0) {
        this.F.remove(c1509Lp0);
        d0(c1509Lp0);
    }

    public final void i0() {
        synchronized (this.k) {
            try {
                this.i.M();
                CQ0 cq0 = new CQ0();
                AbstractC2050Qp0.c(cq0, 7, this.f);
                this.i.k0(cq0);
                if (this.f > 65535) {
                    this.i.g(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j0(C1509Lp0 c1509Lp0) {
        if (!this.z) {
            this.z = true;
            F70 f70 = this.H;
            if (f70 != null) {
                f70.n();
            }
        }
        if (c1509Lp0.y()) {
            this.Q.e(c1509Lp0, true);
        }
    }

    public final void k0(int i, EnumC7034oH enumC7034oH, C6262lX0 c6262lX0) {
        synchronized (this.k) {
            try {
                if (this.v == null) {
                    this.v = c6262lX0;
                    this.h.a(c6262lX0);
                }
                if (enumC7034oH != null && !this.w) {
                    this.w = true;
                    this.i.D0(0, enumC7034oH, new byte[0]);
                }
                Iterator it = this.n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it.remove();
                        ((C1509Lp0) entry.getValue()).u().M(c6262lX0, InterfaceC2971Zl.a.REFUSED, false, new C2756Xj0());
                        d0((C1509Lp0) entry.getValue());
                    }
                }
                for (C1509Lp0 c1509Lp0 : this.F) {
                    c1509Lp0.u().M(c6262lX0, InterfaceC2971Zl.a.MISCARRIED, true, new C2756Xj0());
                    d0(c1509Lp0);
                }
                this.F.clear();
                n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l0() {
        boolean z = false;
        while (!this.F.isEmpty() && this.n.size() < this.E) {
            m0((C1509Lp0) this.F.poll());
            z = true;
        }
        return z;
    }

    public final void m0(C1509Lp0 c1509Lp0) {
        AbstractC7785qy0.u(c1509Lp0.u().c0() == -1, "StreamId already assigned");
        this.n.put(Integer.valueOf(this.m), c1509Lp0);
        j0(c1509Lp0);
        c1509Lp0.u().f0(this.m);
        if ((c1509Lp0.M() != C6882nk0.d.UNARY && c1509Lp0.M() != C6882nk0.d.SERVER_STREAMING) || c1509Lp0.O()) {
            this.i.flush();
        }
        int i = this.m;
        if (i < 2147483645) {
            this.m = i + 2;
        } else {
            this.m = Integer.MAX_VALUE;
            k0(Integer.MAX_VALUE, EnumC7034oH.NO_ERROR, C6262lX0.u.q("Stream ids exhausted"));
        }
    }

    public final void n0() {
        if (this.v == null || !this.n.isEmpty() || !this.F.isEmpty() || this.y) {
            return;
        }
        this.y = true;
        F70 f70 = this.H;
        if (f70 != null) {
            f70.q();
        }
        C9053vW c9053vW = this.x;
        if (c9053vW != null) {
            c9053vW.f(Y());
            this.x = null;
        }
        if (!this.w) {
            this.w = true;
            this.i.D0(0, EnumC7034oH.NO_ERROR, new byte[0]);
        }
        this.i.close();
    }

    public void o0(C1509Lp0 c1509Lp0) {
        if (this.v != null) {
            c1509Lp0.u().M(this.v, InterfaceC2971Zl.a.MISCARRIED, true, new C2756Xj0());
        } else if (this.n.size() < this.E) {
            m0(c1509Lp0);
        } else {
            this.F.add(c1509Lp0);
            j0(c1509Lp0);
        }
    }

    public String toString() {
        return AbstractC6329ll0.b(this).c("logId", this.l.d()).d("address", this.a).toString();
    }

    public C1612Mp0(C1301Jp0.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, C1971Qb c1971Qb, AZ0 az0, InterfaceC1146Ic1 interfaceC1146Ic1, C9332wW c9332wW, Runnable runnable) {
        this.d = new Random();
        this.k = new Object();
        this.n = new HashMap();
        this.E = 0;
        this.F = new LinkedList();
        this.Q = new a();
        this.T = 30000;
        this.a = (InetSocketAddress) AbstractC7785qy0.o(inetSocketAddress, "address");
        this.b = str;
        this.r = fVar.K;
        this.f = fVar.P;
        this.o = (Executor) AbstractC7785qy0.o(fVar.C, "executor");
        this.p = new ZP0(fVar.C);
        this.q = (ScheduledExecutorService) AbstractC7785qy0.o(fVar.E, "scheduledExecutorService");
        this.m = 3;
        SocketFactory socketFactory = fVar.G;
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = fVar.H;
        this.C = fVar.I;
        this.G = (C0567Cq) AbstractC7785qy0.o(fVar.J, "connectionSpec");
        this.e = (AZ0) AbstractC7785qy0.o(az0, "stopwatchFactory");
        this.g = (InterfaceC1146Ic1) AbstractC7785qy0.o(interfaceC1146Ic1, "variant");
        this.c = AbstractC7365pU.g("okhttp", str2);
        this.S = c9332wW;
        this.M = (Runnable) AbstractC7785qy0.o(runnable, "tooManyPingsRunnable");
        this.N = fVar.R;
        this.P = fVar.F.a();
        this.l = C6404m10.a(getClass(), inetSocketAddress.toString());
        this.u = C1971Qb.c().d(AbstractC4565fU.b, c1971Qb).a();
        this.O = fVar.S;
        a0();
    }

    /* JADX INFO: renamed from: com.daaw.Mp0$c */
    public class c implements Runnable {
        public final /* synthetic */ CountDownLatch B;
        public final /* synthetic */ C0403Bb C;

        public c(CountDownLatch countDownLatch, C0403Bb c0403Bb) {
            this.B = countDownLatch;
            this.C = c0403Bb;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            C1612Mp0 c1612Mp0;
            e eVar;
            Socket socketS;
            SSLSession session;
            Socket socket;
            try {
                this.B.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            InterfaceC7424ph interfaceC7424phB = AbstractC2468Up0.b(new a());
            try {
                try {
                    C1612Mp0 c1612Mp02 = C1612Mp0.this;
                    C9332wW c9332wW = c1612Mp02.S;
                    if (c9332wW == null) {
                        socketS = c1612Mp02.A.createSocket(C1612Mp0.this.a.getAddress(), C1612Mp0.this.a.getPort());
                    } else {
                        if (!(c9332wW.b() instanceof InetSocketAddress)) {
                            throw C6262lX0.t.q("Unsupported SocketAddress implementation " + C1612Mp0.this.S.b().getClass()).c();
                        }
                        C1612Mp0 c1612Mp03 = C1612Mp0.this;
                        socketS = c1612Mp03.S(c1612Mp03.S.c(), (InetSocketAddress) C1612Mp0.this.S.b(), C1612Mp0.this.S.d(), C1612Mp0.this.S.a());
                    }
                    Socket socket2 = socketS;
                    if (C1612Mp0.this.B != null) {
                        SSLSocket sSLSocketB = AbstractC2154Rp0.b(C1612Mp0.this.B, C1612Mp0.this.C, socket2, C1612Mp0.this.W(), C1612Mp0.this.X(), C1612Mp0.this.G);
                        session = sSLSocketB.getSession();
                        socket = sSLSocketB;
                    } else {
                        session = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    InterfaceC7424ph interfaceC7424phB2 = AbstractC2468Up0.b(AbstractC2468Up0.h(socket));
                    this.C.R(AbstractC2468Up0.e(socket), socket);
                    C1612Mp0 c1612Mp04 = C1612Mp0.this;
                    c1612Mp04.u = c1612Mp04.u.d().d(AbstractC4276eU.a, socket.getRemoteSocketAddress()).d(AbstractC4276eU.b, socket.getLocalSocketAddress()).d(AbstractC4276eU.c, session).d(AbstractC4565fU.a, session == null ? BO0.NONE : BO0.PRIVACY_AND_INTEGRITY).a();
                    C1612Mp0 c1612Mp05 = C1612Mp0.this;
                    c1612Mp05.t = c1612Mp05.new e(c1612Mp05.g.a(interfaceC7424phB2, true));
                    synchronized (C1612Mp0.this.k) {
                        try {
                            C1612Mp0.this.D = (Socket) AbstractC7785qy0.o(socket, "socket");
                            if (session != null) {
                                C1612Mp0.this.R = new C4720g10.b(new C4720g10.c(session));
                            }
                        } finally {
                        }
                    }
                } catch (C6541mX0 e) {
                    C1612Mp0.this.k0(0, EnumC7034oH.INTERNAL_ERROR, e.a());
                    c1612Mp0 = C1612Mp0.this;
                    eVar = c1612Mp0.new e(c1612Mp0.g.a(interfaceC7424phB, true));
                    c1612Mp0.t = eVar;
                } catch (Exception e2) {
                    C1612Mp0.this.e(e2);
                    c1612Mp0 = C1612Mp0.this;
                    eVar = c1612Mp0.new e(c1612Mp0.g.a(interfaceC7424phB, true));
                    c1612Mp0.t = eVar;
                }
            } catch (Throwable th) {
                C1612Mp0 c1612Mp06 = C1612Mp0.this;
                c1612Mp06.t = c1612Mp06.new e(c1612Mp06.g.a(interfaceC7424phB, true));
                throw th;
            }
        }

        /* JADX INFO: renamed from: com.daaw.Mp0$c$a */
        public class a implements PU0, AutoCloseable {
            public a() {
            }

            @Override // com.daaw.PU0
            public long A0(C4057dh c4057dh, long j) {
                return -1L;
            }

            @Override // com.daaw.PU0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Mp0$e */
    public class e implements InterfaceC7628qQ.a, Runnable {
        public InterfaceC7628qQ C;
        public final C1716Np0 B = new C1716Np0(Level.FINE, C1612Mp0.class);
        public boolean D = true;

        public e(InterfaceC7628qQ interfaceC7628qQ) {
            this.C = interfaceC7628qQ;
        }

        public final int a(List list) {
            long jS = 0;
            for (int i = 0; i < list.size(); i++) {
                FU fu = (FU) list.get(i);
                jS += (long) (fu.a.s() + 32 + fu.b.s());
            }
            return (int) Math.min(jS, 2147483647L);
        }

        @Override // com.daaw.InterfaceC7628qQ.a
        public void f(int i, EnumC7034oH enumC7034oH) {
            this.B.h(C1716Np0.a.INBOUND, i, enumC7034oH);
            C6262lX0 c6262lX0E = C1612Mp0.p0(enumC7034oH).e("Rst Stream");
            boolean z = c6262lX0E.m() == C6262lX0.b.CANCELLED || c6262lX0E.m() == C6262lX0.b.DEADLINE_EXCEEDED;
            synchronized (C1612Mp0.this.k) {
                try {
                    C1509Lp0 c1509Lp0 = (C1509Lp0) C1612Mp0.this.n.get(Integer.valueOf(i));
                    if (c1509Lp0 != null) {
                        AbstractC1213It0.c("OkHttpClientTransport$ClientFrameHandler.rstStream", c1509Lp0.u().h0());
                        C1612Mp0.this.U(i, c6262lX0E, enumC7034oH == EnumC7034oH.REFUSED_STREAM ? InterfaceC2971Zl.a.REFUSED : InterfaceC2971Zl.a.PROCESSED, z, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        @Override // com.daaw.InterfaceC7628qQ.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(int r8, long r9) {
            /*
                r7 = this;
                com.daaw.Np0 r0 = r7.B
                com.daaw.Np0$a r1 = com.daaw.C1716Np0.a.INBOUND
                r0.k(r1, r8, r9)
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 != 0) goto L2c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L19
                com.daaw.Mp0 r8 = com.daaw.C1612Mp0.this
                com.daaw.oH r10 = com.daaw.EnumC7034oH.PROTOCOL_ERROR
                com.daaw.C1612Mp0.A(r8, r10, r9)
                return
            L19:
                com.daaw.Mp0 r0 = com.daaw.C1612Mp0.this
                com.daaw.lX0 r10 = com.daaw.C6262lX0.t
                com.daaw.lX0 r2 = r10.q(r9)
                com.daaw.Zl$a r3 = com.daaw.InterfaceC2971Zl.a.PROCESSED
                com.daaw.oH r5 = com.daaw.EnumC7034oH.PROTOCOL_ERROR
                r6 = 0
                r4 = 0
                r1 = r8
                r0.U(r1, r2, r3, r4, r5, r6)
                return
            L2c:
                r1 = r8
                com.daaw.Mp0 r8 = com.daaw.C1612Mp0.this
                java.lang.Object r8 = com.daaw.C1612Mp0.j(r8)
                monitor-enter(r8)
                if (r1 != 0) goto L46
                com.daaw.Mp0 r0 = com.daaw.C1612Mp0.this     // Catch: java.lang.Throwable -> L43
                com.daaw.nr0 r0 = com.daaw.C1612Mp0.w(r0)     // Catch: java.lang.Throwable -> L43
                r1 = 0
                int r10 = (int) r9     // Catch: java.lang.Throwable -> L43
                r0.g(r1, r10)     // Catch: java.lang.Throwable -> L43
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
                return
            L43:
                r0 = move-exception
                r9 = r0
                goto L92
            L46:
                com.daaw.Mp0 r0 = com.daaw.C1612Mp0.this     // Catch: java.lang.Throwable -> L43
                java.util.Map r0 = com.daaw.C1612Mp0.F(r0)     // Catch: java.lang.Throwable -> L43
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
                java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L43
                com.daaw.Lp0 r0 = (com.daaw.C1509Lp0) r0     // Catch: java.lang.Throwable -> L43
                if (r0 == 0) goto L6b
                com.daaw.Mp0 r2 = com.daaw.C1612Mp0.this     // Catch: java.lang.Throwable -> L43
                com.daaw.nr0 r2 = com.daaw.C1612Mp0.w(r2)     // Catch: java.lang.Throwable -> L43
                com.daaw.Lp0$b r0 = r0.u()     // Catch: java.lang.Throwable -> L43
                com.daaw.nr0$c r0 = r0.b0()     // Catch: java.lang.Throwable -> L43
                int r10 = (int) r9     // Catch: java.lang.Throwable -> L43
                r2.g(r0, r10)     // Catch: java.lang.Throwable -> L43
                goto L75
            L6b:
                com.daaw.Mp0 r9 = com.daaw.C1612Mp0.this     // Catch: java.lang.Throwable -> L43
                boolean r9 = r9.c0(r1)     // Catch: java.lang.Throwable -> L43
                if (r9 != 0) goto L75
                r9 = 1
                goto L76
            L75:
                r9 = 0
            L76:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
                if (r9 == 0) goto L91
                com.daaw.Mp0 r8 = com.daaw.C1612Mp0.this
                com.daaw.oH r9 = com.daaw.EnumC7034oH.PROTOCOL_ERROR
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "Received window_update for unknown stream: "
                r10.append(r0)
                r10.append(r1)
                java.lang.String r10 = r10.toString()
                com.daaw.C1612Mp0.A(r8, r9, r10)
            L91:
                return
            L92:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1612Mp0.e.g(int, long):void");
        }

        @Override // com.daaw.InterfaceC7628qQ.a
        public void h(boolean z, int i, int i2) {
            C9053vW c9053vW;
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            this.B.e(C1716Np0.a.INBOUND, j);
            if (!z) {
                synchronized (C1612Mp0.this.k) {
                    C1612Mp0.this.i.h(true, i, i2);
                }
                return;
            }
            synchronized (C1612Mp0.this.k) {
                try {
                    c9053vW = null;
                    if (C1612Mp0.this.x == null) {
                        C1612Mp0.W.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (C1612Mp0.this.x.h() == j) {
                        C9053vW c9053vW2 = C1612Mp0.this.x;
                        C1612Mp0.this.x = null;
                        c9053vW = c9053vW2;
                    } else {
                        C1612Mp0.W.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(C1612Mp0.this.x.h()), Long.valueOf(j)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c9053vW != null) {
                c9053vW.d();
            }
        }

        @Override // com.daaw.InterfaceC7628qQ.a
        public void i(boolean z, CQ0 cq0) {
            boolean zF;
            this.B.i(C1716Np0.a.INBOUND, cq0);
            synchronized (C1612Mp0.this.k) {
                try {
                    if (AbstractC2050Qp0.b(cq0, 4)) {
                        C1612Mp0.this.E = AbstractC2050Qp0.a(cq0, 4);
                    }
                    if (AbstractC2050Qp0.b(cq0, 7)) {
                        zF = C1612Mp0.this.j.f(AbstractC2050Qp0.a(cq0, 7));
                    } else {
                        zF = false;
                    }
                    if (this.D) {
                        C1612Mp0.this.h.b();
                        this.D = false;
                    }
                    C1612Mp0.this.i.R0(cq0);
                    if (zF) {
                        C1612Mp0.this.j.h();
                    }
                    C1612Mp0.this.l0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.InterfaceC7628qQ.a
        public void k(boolean z, int i, InterfaceC7424ph interfaceC7424ph, int i2) {
            this.B.b(C1716Np0.a.INBOUND, i, interfaceC7424ph.J(), i2, z);
            C1509Lp0 c1509Lp0Z = C1612Mp0.this.Z(i);
            if (c1509Lp0Z != null) {
                long j = i2;
                interfaceC7424ph.X0(j);
                C4057dh c4057dh = new C4057dh();
                c4057dh.O0(interfaceC7424ph.J(), j);
                AbstractC1213It0.c("OkHttpClientTransport$ClientFrameHandler.data", c1509Lp0Z.u().h0());
                synchronized (C1612Mp0.this.k) {
                    c1509Lp0Z.u().i0(c4057dh, z);
                }
            } else {
                if (!C1612Mp0.this.c0(i)) {
                    C1612Mp0.this.f0(EnumC7034oH.PROTOCOL_ERROR, "Received data for unknown stream: " + i);
                    return;
                }
                synchronized (C1612Mp0.this.k) {
                    C1612Mp0.this.i.f(i, EnumC7034oH.STREAM_CLOSED);
                }
                interfaceC7424ph.skip(i2);
            }
            C1612Mp0.D(C1612Mp0.this, i2);
            if (C1612Mp0.this.s >= C1612Mp0.this.f * 0.5f) {
                synchronized (C1612Mp0.this.k) {
                    C1612Mp0.this.i.g(0, C1612Mp0.this.s);
                }
                C1612Mp0.this.s = 0;
            }
        }

        @Override // com.daaw.InterfaceC7628qQ.a
        public void l(boolean z, boolean z2, int i, int i2, List list, DV dv) {
            C6262lX0 c6262lX0Q;
            int iA;
            boolean z3 = true;
            this.B.d(C1716Np0.a.INBOUND, i, list, z2);
            if (C1612Mp0.this.N == Integer.MAX_VALUE || (iA = a(list)) <= C1612Mp0.this.N) {
                c6262lX0Q = null;
            } else {
                c6262lX0Q = C6262lX0.o.q(String.format(Locale.US, "Response %s metadata larger than %d: %d", z2 ? "trailer" : "header", Integer.valueOf(C1612Mp0.this.N), Integer.valueOf(iA)));
            }
            synchronized (C1612Mp0.this.k) {
                try {
                    C1509Lp0 c1509Lp0 = (C1509Lp0) C1612Mp0.this.n.get(Integer.valueOf(i));
                    if (c1509Lp0 == null) {
                        if (C1612Mp0.this.c0(i)) {
                            C1612Mp0.this.i.f(i, EnumC7034oH.STREAM_CLOSED);
                        }
                    } else if (c6262lX0Q == null) {
                        AbstractC1213It0.c("OkHttpClientTransport$ClientFrameHandler.headers", c1509Lp0.u().h0());
                        c1509Lp0.u().j0(list, z2);
                    } else {
                        if (!z2) {
                            C1612Mp0.this.i.f(i, EnumC7034oH.CANCEL);
                        }
                        c1509Lp0.u().N(c6262lX0Q, false, new C2756Xj0());
                    }
                    z3 = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                C1612Mp0.this.f0(EnumC7034oH.PROTOCOL_ERROR, "Received header for unknown stream: " + i);
            }
        }

        @Override // com.daaw.InterfaceC7628qQ.a
        public void n(int i, int i2, List list) {
            this.B.g(C1716Np0.a.INBOUND, i, i2, list);
            synchronized (C1612Mp0.this.k) {
                C1612Mp0.this.i.f(i, EnumC7034oH.PROTOCOL_ERROR);
            }
        }

        @Override // com.daaw.InterfaceC7628qQ.a
        public void o(int i, EnumC7034oH enumC7034oH, C4908gi c4908gi) {
            this.B.c(C1716Np0.a.INBOUND, i, enumC7034oH, c4908gi);
            if (enumC7034oH == EnumC7034oH.ENHANCE_YOUR_CALM) {
                String strY = c4908gi.y();
                C1612Mp0.W.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strY));
                if ("too_many_pings".equals(strY)) {
                    C1612Mp0.this.M.run();
                }
            }
            C6262lX0 c6262lX0E = AbstractC7365pU.h.k(enumC7034oH.B).e("Received Goaway");
            if (c4908gi.s() > 0) {
                c6262lX0E = c6262lX0E.e(c4908gi.y());
            }
            C1612Mp0.this.k0(i, null, c6262lX0E);
        }

        @Override // java.lang.Runnable
        public void run() {
            C6262lX0 c6262lX0Q;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.C.Q(this)) {
                try {
                    if (C1612Mp0.this.H != null) {
                        C1612Mp0.this.H.m();
                    }
                } catch (Throwable th) {
                    try {
                        C1612Mp0.this.k0(0, EnumC7034oH.PROTOCOL_ERROR, C6262lX0.t.q("error in frame handler").p(th));
                        try {
                            this.C.close();
                        } catch (IOException e) {
                            e = e;
                            C1612Mp0.W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        }
                    } catch (Throwable th2) {
                        try {
                            this.C.close();
                        } catch (IOException e2) {
                            C1612Mp0.W.log(Level.INFO, "Exception closing frame reader", (Throwable) e2);
                        }
                        C1612Mp0.this.h.c();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (C1612Mp0.this.k) {
                c6262lX0Q = C1612Mp0.this.v;
            }
            if (c6262lX0Q == null) {
                c6262lX0Q = C6262lX0.u.q("End of stream or IOException");
            }
            C1612Mp0.this.k0(0, EnumC7034oH.INTERNAL_ERROR, c6262lX0Q);
            try {
                this.C.close();
            } catch (IOException e3) {
                e = e3;
                C1612Mp0.W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            }
            C1612Mp0.this.h.c();
            Thread.currentThread().setName(name);
        }

        @Override // com.daaw.InterfaceC7628qQ.a
        public void j() {
        }

        @Override // com.daaw.InterfaceC7628qQ.a
        public void m(int i, int i2, int i3, boolean z) {
        }
    }
}
