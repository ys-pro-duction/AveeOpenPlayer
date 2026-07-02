package com.daaw;

import com.daaw.C6759nI;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: renamed from: com.daaw.Bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0403Bb implements InterfaceC9600xT0, AutoCloseable {
    public final ZP0 D;
    public final C6759nI.a E;
    public final int F;
    public InterfaceC9600xT0 J;
    public Socket K;
    public boolean L;
    public int M;
    public int N;
    public final Object B = new Object();
    public final C4057dh C = new C4057dh();
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;

    /* JADX INFO: renamed from: com.daaw.Bb$a */
    public class a extends e {
        public final C4600fc0 C;

        public a() {
            super(C0403Bb.this, null);
            this.C = AbstractC1213It0.e();
        }

        @Override // com.daaw.C0403Bb.e
        public void a() {
            int i;
            AbstractC1213It0.f("WriteRunnable.runWrite");
            AbstractC1213It0.d(this.C);
            C4057dh c4057dh = new C4057dh();
            try {
                synchronized (C0403Bb.this.B) {
                    c4057dh.O0(C0403Bb.this.C, C0403Bb.this.C.j());
                    C0403Bb.this.G = false;
                    i = C0403Bb.this.N;
                }
                C0403Bb.this.J.O0(c4057dh, c4057dh.f1());
                synchronized (C0403Bb.this.B) {
                    C0403Bb.l(C0403Bb.this, i);
                }
            } finally {
                AbstractC1213It0.h("WriteRunnable.runWrite");
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bb$b */
    public class b extends e {
        public final C4600fc0 C;

        public b() {
            super(C0403Bb.this, null);
            this.C = AbstractC1213It0.e();
        }

        @Override // com.daaw.C0403Bb.e
        public void a() {
            AbstractC1213It0.f("WriteRunnable.runFlush");
            AbstractC1213It0.d(this.C);
            C4057dh c4057dh = new C4057dh();
            try {
                synchronized (C0403Bb.this.B) {
                    c4057dh.O0(C0403Bb.this.C, C0403Bb.this.C.f1());
                    C0403Bb.this.H = false;
                }
                C0403Bb.this.J.O0(c4057dh, c4057dh.f1());
                C0403Bb.this.J.flush();
            } finally {
                AbstractC1213It0.h("WriteRunnable.runFlush");
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bb$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C0403Bb.this.J != null && C0403Bb.this.C.f1() > 0) {
                    C0403Bb.this.J.O0(C0403Bb.this.C, C0403Bb.this.C.f1());
                }
            } catch (IOException e) {
                C0403Bb.this.E.e(e);
            }
            C0403Bb.this.C.close();
            try {
                if (C0403Bb.this.J != null) {
                    C0403Bb.this.J.close();
                }
            } catch (IOException e2) {
                C0403Bb.this.E.e(e2);
            }
            try {
                if (C0403Bb.this.K != null) {
                    C0403Bb.this.K.close();
                }
            } catch (IOException e3) {
                C0403Bb.this.E.e(e3);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bb$d */
    public class d extends AbstractC7345pP {
        public d(InterfaceC8464tQ interfaceC8464tQ) {
            super(interfaceC8464tQ);
        }

        @Override // com.daaw.AbstractC7345pP, com.daaw.InterfaceC8464tQ
        public void R0(CQ0 cq0) {
            C0403Bb.N(C0403Bb.this);
            super.R0(cq0);
        }

        @Override // com.daaw.AbstractC7345pP, com.daaw.InterfaceC8464tQ
        public void f(int i, EnumC7034oH enumC7034oH) {
            C0403Bb.N(C0403Bb.this);
            super.f(i, enumC7034oH);
        }

        @Override // com.daaw.AbstractC7345pP, com.daaw.InterfaceC8464tQ
        public void h(boolean z, int i, int i2) {
            if (z) {
                C0403Bb.N(C0403Bb.this);
            }
            super.h(z, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bb$e */
    public abstract class e implements Runnable {
        public e() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (C0403Bb.this.J == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e) {
                C0403Bb.this.E.e(e);
            }
        }

        public /* synthetic */ e(C0403Bb c0403Bb, a aVar) {
            this();
        }
    }

    public C0403Bb(ZP0 zp0, C6759nI.a aVar, int i) {
        this.D = (ZP0) AbstractC7785qy0.o(zp0, "executor");
        this.E = (C6759nI.a) AbstractC7785qy0.o(aVar, "exceptionHandler");
        this.F = i;
    }

    public static /* synthetic */ int N(C0403Bb c0403Bb) {
        int i = c0403Bb.M;
        c0403Bb.M = i + 1;
        return i;
    }

    public static C0403Bb W(ZP0 zp0, C6759nI.a aVar, int i) {
        return new C0403Bb(zp0, aVar, i);
    }

    public static /* synthetic */ int l(C0403Bb c0403Bb, int i) {
        int i2 = c0403Bb.N - i;
        c0403Bb.N = i2;
        return i2;
    }

    @Override // com.daaw.InterfaceC9600xT0
    public void O0(C4057dh c4057dh, long j) throws IOException {
        AbstractC7785qy0.o(c4057dh, "source");
        if (this.I) {
            throw new IOException("closed");
        }
        AbstractC1213It0.f("AsyncSink.write");
        try {
            synchronized (this.B) {
                try {
                    this.C.O0(c4057dh, j);
                    int i = this.N + this.M;
                    this.N = i;
                    boolean z = false;
                    this.M = 0;
                    if (!this.L && i > this.F) {
                        this.L = true;
                        z = true;
                    } else if (!this.G && !this.H && this.C.j() > 0) {
                        this.G = true;
                    }
                    if (z) {
                        try {
                            this.K.close();
                        } catch (IOException e2) {
                            this.E.e(e2);
                        }
                    } else {
                        this.D.execute(new a());
                    }
                } finally {
                }
            }
        } finally {
            AbstractC1213It0.h("AsyncSink.write");
        }
    }

    public void R(InterfaceC9600xT0 interfaceC9600xT0, Socket socket) {
        AbstractC7785qy0.u(this.J == null, "AsyncSink's becomeConnected should only be called once.");
        this.J = (InterfaceC9600xT0) AbstractC7785qy0.o(interfaceC9600xT0, "sink");
        this.K = (Socket) AbstractC7785qy0.o(socket, "socket");
    }

    public InterfaceC8464tQ U(InterfaceC8464tQ interfaceC8464tQ) {
        return new d(interfaceC8464tQ);
    }

    @Override // com.daaw.InterfaceC9600xT0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.I) {
            return;
        }
        this.I = true;
        this.D.execute(new c());
    }

    @Override // com.daaw.InterfaceC9600xT0, java.io.Flushable
    public void flush() throws IOException {
        if (this.I) {
            throw new IOException("closed");
        }
        AbstractC1213It0.f("AsyncSink.flush");
        try {
            synchronized (this.B) {
                if (!this.H) {
                    this.H = true;
                    this.D.execute(new b());
                }
            }
        } finally {
            AbstractC1213It0.h("AsyncSink.flush");
        }
    }
}
