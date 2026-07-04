package com.daaw;

import com.daaw.InterfaceC2971Zl;
import com.daaw.TX0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0712Dy implements InterfaceC2867Yl {
    public volatile boolean a;
    public InterfaceC2971Zl b;
    public InterfaceC2867Yl c;
    public C6262lX0 d;
    public o f;
    public long g;
    public long h;
    public List e = new ArrayList();
    public List i = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.Dy$a */
    public class a implements Runnable {
        public final /* synthetic */ int B;

        public a(int i) {
            this.B = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.c(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.p();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$c */
    public class c implements Runnable {
        public final /* synthetic */ InterfaceC2675Wp B;

        public c(InterfaceC2675Wp interfaceC2675Wp) {
            this.B = interfaceC2675Wp;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.b(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$d */
    public class d implements Runnable {
        public final /* synthetic */ boolean B;

        public d(boolean z) {
            this.B = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.q(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$e */
    public class e implements Runnable {
        public final /* synthetic */ C1224Iw B;

        public e(C1224Iw c1224Iw) {
            this.B = c1224Iw;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.g(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$f */
    public class f implements Runnable {
        public final /* synthetic */ int B;

        public f(int i) {
            this.B = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.d(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$g */
    public class g implements Runnable {
        public final /* synthetic */ int B;

        public g(int i) {
            this.B = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.e(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$h */
    public class h implements Runnable {
        public final /* synthetic */ C6381lw B;

        public h(C6381lw c6381lw) {
            this.B = c6381lw;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.i(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$i */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.t();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$j */
    public class j implements Runnable {
        public final /* synthetic */ String B;

        public j(String str) {
            this.B = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.h(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$k */
    public class k implements Runnable {
        public final /* synthetic */ InputStream B;

        public k(InputStream inputStream) {
            this.B = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.n(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$l */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.flush();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$m */
    public class m implements Runnable {
        public final /* synthetic */ C6262lX0 B;

        public m(C6262lX0 c6262lX0) {
            this.B = c6262lX0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.f(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$n */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0712Dy.this.c.j();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dy$o */
    public static class o implements InterfaceC2971Zl {
        public final InterfaceC2971Zl a;
        public volatile boolean b;
        public List c = new ArrayList();

        /* JADX INFO: renamed from: com.daaw.Dy$o$a */
        public class a implements Runnable {
            public final /* synthetic */ TX0.a B;

            public a(TX0.a aVar) {
                this.B = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a.a(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Dy$o$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a.d();
            }
        }

        /* JADX INFO: renamed from: com.daaw.Dy$o$c */
        public class c implements Runnable {
            public final /* synthetic */ C2756Xj0 B;

            public c(C2756Xj0 c2756Xj0) {
                this.B = c2756Xj0;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a.b(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Dy$o$d */
        public class d implements Runnable {
            public final /* synthetic */ C6262lX0 B;
            public final /* synthetic */ InterfaceC2971Zl.a C;
            public final /* synthetic */ C2756Xj0 D;

            public d(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
                this.B = c6262lX0;
                this.C = aVar;
                this.D = c2756Xj0;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a.c(this.B, this.C, this.D);
            }
        }

        public o(InterfaceC2971Zl interfaceC2971Zl) {
            this.a = interfaceC2971Zl;
        }

        @Override // com.daaw.TX0
        public void a(TX0.a aVar) {
            if (this.b) {
                this.a.a(aVar);
            } else {
                f(new a(aVar));
            }
        }

        @Override // com.daaw.InterfaceC2971Zl
        public void b(C2756Xj0 c2756Xj0) {
            f(new c(c2756Xj0));
        }

        @Override // com.daaw.InterfaceC2971Zl
        public void c(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
            f(new d(c6262lX0, aVar, c2756Xj0));
        }

        @Override // com.daaw.TX0
        public void d() {
            if (this.b) {
                this.a.d();
            } else {
                f(new b());
            }
        }

        public final void f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.b) {
                        runnable.run();
                    } else {
                        this.c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.c.isEmpty()) {
                            this.c = null;
                            this.b = true;
                            return;
                        } else {
                            list = this.c;
                            this.c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    @Override // com.daaw.LX0
    public boolean a() {
        if (this.a) {
            return this.c.a();
        }
        return false;
    }

    @Override // com.daaw.LX0
    public void b(InterfaceC2675Wp interfaceC2675Wp) {
        AbstractC7785qy0.u(this.b == null, "May only be called before start");
        AbstractC7785qy0.o(interfaceC2675Wp, "compressor");
        this.i.add(new c(interfaceC2675Wp));
    }

    @Override // com.daaw.LX0
    public void c(int i2) {
        AbstractC7785qy0.u(this.b != null, "May only be called after start");
        if (this.a) {
            this.c.c(i2);
        } else {
            s(new a(i2));
        }
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void d(int i2) {
        AbstractC7785qy0.u(this.b == null, "May only be called before start");
        this.i.add(new f(i2));
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void e(int i2) {
        AbstractC7785qy0.u(this.b == null, "May only be called before start");
        this.i.add(new g(i2));
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void f(C6262lX0 c6262lX0) {
        boolean z = false;
        AbstractC7785qy0.u(this.b != null, "May only be called after start");
        AbstractC7785qy0.o(c6262lX0, "reason");
        synchronized (this) {
            try {
                if (this.c == null) {
                    w(C9698xo0.a);
                    this.d = c6262lX0;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            s(new m(c6262lX0));
            return;
        }
        t();
        v(c6262lX0);
        this.b.c(c6262lX0, InterfaceC2971Zl.a.PROCESSED, new C2756Xj0());
    }

    @Override // com.daaw.LX0
    public void flush() {
        AbstractC7785qy0.u(this.b != null, "May only be called after start");
        if (this.a) {
            this.c.flush();
        } else {
            s(new l());
        }
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void g(C1224Iw c1224Iw) {
        AbstractC7785qy0.u(this.b == null, "May only be called before start");
        AbstractC7785qy0.o(c1224Iw, "decompressorRegistry");
        this.i.add(new e(c1224Iw));
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void h(String str) {
        AbstractC7785qy0.u(this.b == null, "May only be called before start");
        AbstractC7785qy0.o(str, "authority");
        this.i.add(new j(str));
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void i(C6381lw c6381lw) {
        AbstractC7785qy0.u(this.b == null, "May only be called before start");
        this.i.add(new h(c6381lw));
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void j() {
        AbstractC7785qy0.u(this.b != null, "May only be called after start");
        s(new n());
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void l(InterfaceC2971Zl interfaceC2971Zl) {
        C6262lX0 c6262lX0;
        boolean z;
        AbstractC7785qy0.o(interfaceC2971Zl, "listener");
        AbstractC7785qy0.u(this.b == null, "already started");
        synchronized (this) {
            try {
                c6262lX0 = this.d;
                z = this.a;
                if (!z) {
                    o oVar = new o(interfaceC2971Zl);
                    this.f = oVar;
                    interfaceC2971Zl = oVar;
                }
                this.b = interfaceC2971Zl;
                this.g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c6262lX0 != null) {
            interfaceC2971Zl.c(c6262lX0, InterfaceC2971Zl.a.PROCESSED, new C2756Xj0());
        } else if (z) {
            u(interfaceC2971Zl);
        }
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void m(C4994h00 c4994h00) {
        synchronized (this) {
            try {
                if (this.b == null) {
                    return;
                }
                if (this.c != null) {
                    c4994h00.b("buffered_nanos", Long.valueOf(this.h - this.g));
                    this.c.m(c4994h00);
                } else {
                    c4994h00.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                    c4994h00.a("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.LX0
    public void n(InputStream inputStream) {
        AbstractC7785qy0.u(this.b != null, "May only be called after start");
        AbstractC7785qy0.o(inputStream, "message");
        if (this.a) {
            this.c.n(inputStream);
        } else {
            s(new k(inputStream));
        }
    }

    @Override // com.daaw.LX0
    public void p() {
        AbstractC7785qy0.u(this.b == null, "May only be called before start");
        this.i.add(new b());
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void q(boolean z) {
        AbstractC7785qy0.u(this.b == null, "May only be called before start");
        this.i.add(new d(z));
    }

    public final void s(Runnable runnable) {
        AbstractC7785qy0.u(this.b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.a) {
                    runnable.run();
                } else {
                    this.e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.e     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.e = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.a = r0     // Catch: java.lang.Throwable -> L1d
            com.daaw.Dy$o r0 = r3.f     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.g()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.e     // Catch: java.lang.Throwable -> L1d
            r3.e = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0712Dy.t():void");
    }

    public final void u(InterfaceC2971Zl interfaceC2971Zl) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.c.l(interfaceC2971Zl);
    }

    public final void w(InterfaceC2867Yl interfaceC2867Yl) {
        InterfaceC2867Yl interfaceC2867Yl2 = this.c;
        AbstractC7785qy0.w(interfaceC2867Yl2 == null, "realStream already set to %s", interfaceC2867Yl2);
        this.c = interfaceC2867Yl;
        this.h = System.nanoTime();
    }

    public final Runnable x(InterfaceC2867Yl interfaceC2867Yl) {
        synchronized (this) {
            try {
                if (this.c != null) {
                    return null;
                }
                w((InterfaceC2867Yl) AbstractC7785qy0.o(interfaceC2867Yl, "stream"));
                InterfaceC2971Zl interfaceC2971Zl = this.b;
                if (interfaceC2971Zl == null) {
                    this.e = null;
                    this.a = true;
                }
                if (interfaceC2971Zl == null) {
                    return null;
                }
                u(interfaceC2971Zl);
                return new i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(C6262lX0 c6262lX0) {
    }
}
