package com.daaw;

import com.daaw.C1381Kj0;
import com.daaw.C7668qa;
import com.daaw.InterfaceC8843um;
import com.daaw.TX0;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A0 implements LX0 {

    public static abstract class a implements C7668qa.h, C1381Kj0.b {
        public InterfaceC10022yy a;
        public final Object b = new Object();
        public final C5695jX0 c;
        public final T51 d;
        public final C1381Kj0 e;
        public int f;
        public boolean g;
        public boolean h;

        /* JADX INFO: renamed from: com.daaw.A0$a$a, reason: collision with other inner class name */
        public class RunnableC0044a implements Runnable {
            public final /* synthetic */ C4600fc0 B;
            public final /* synthetic */ int C;

            public RunnableC0044a(C4600fc0 c4600fc0, int i) {
                this.B = c4600fc0;
                this.C = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC1213It0.f("AbstractStream.request");
                AbstractC1213It0.d(this.B);
                try {
                    a.this.a.c(this.C);
                } catch (Throwable th) {
                    try {
                        a.this.e(th);
                    } finally {
                        AbstractC1213It0.h("AbstractStream.request");
                    }
                }
            }
        }

        public a(int i, C5695jX0 c5695jX0, T51 t51) {
            this.c = (C5695jX0) AbstractC7785qy0.o(c5695jX0, "statsTraceCtx");
            this.d = (T51) AbstractC7785qy0.o(t51, "transportTracer");
            C1381Kj0 c1381Kj0 = new C1381Kj0(this, InterfaceC8843um.b.a, i, c5695jX0, t51);
            this.e = c1381Kj0;
            this.a = c1381Kj0;
        }

        @Override // com.daaw.C1381Kj0.b
        public void a(TX0.a aVar) {
            o().a(aVar);
        }

        public final void b(int i) {
            boolean z;
            synchronized (this.b) {
                AbstractC7785qy0.u(this.g, "onStreamAllocated was not called, but it seems the stream is active");
                int i2 = this.f;
                z = false;
                boolean z2 = i2 < 32768;
                int i3 = i2 - i;
                this.f = i3;
                boolean z3 = i3 < 32768;
                if (!z2 && z3) {
                    z = true;
                }
            }
            if (z) {
                p();
            }
        }

        public final void k(boolean z) {
            if (z) {
                this.a.close();
            } else {
                this.a.j();
            }
        }

        public final void l(IE0 ie0) {
            try {
                this.a.l(ie0);
            } catch (Throwable th) {
                e(th);
            }
        }

        public T51 m() {
            return this.d;
        }

        public final boolean n() {
            boolean z;
            synchronized (this.b) {
                try {
                    z = this.g && this.f < 32768 && !this.h;
                } finally {
                }
            }
            return z;
        }

        public abstract TX0 o();

        public final void p() {
            boolean zN;
            synchronized (this.b) {
                zN = n();
            }
            if (zN) {
                o().d();
            }
        }

        public final void q(int i) {
            synchronized (this.b) {
                this.f += i;
            }
        }

        public void r() {
            AbstractC7785qy0.t(o() != null);
            synchronized (this.b) {
                AbstractC7785qy0.u(!this.g, "Already allocated");
                this.g = true;
            }
            p();
        }

        public final void s() {
            synchronized (this.b) {
                this.h = true;
            }
        }

        public final void t() {
            this.e.o0(this);
            this.a = this.e;
        }

        public final void u(int i) {
            f(new RunnableC0044a(AbstractC1213It0.e(), i));
        }

        public final void v(InterfaceC1120Hw interfaceC1120Hw) {
            this.a.o(interfaceC1120Hw);
        }

        public void w(C8201sU c8201sU) {
            this.e.Y(c8201sU);
            this.a = new C7668qa(this, this, this.e);
        }

        public final void x(int i) {
            this.a.d(i);
        }
    }

    @Override // com.daaw.LX0
    public boolean a() {
        return u().n();
    }

    @Override // com.daaw.LX0
    public final void b(InterfaceC2675Wp interfaceC2675Wp) {
        s().b((InterfaceC2675Wp) AbstractC7785qy0.o(interfaceC2675Wp, "compressor"));
    }

    @Override // com.daaw.LX0
    public final void c(int i) {
        u().u(i);
    }

    @Override // com.daaw.LX0
    public final void flush() {
        if (s().isClosed()) {
            return;
        }
        s().flush();
    }

    @Override // com.daaw.LX0
    public final void n(InputStream inputStream) {
        AbstractC7785qy0.o(inputStream, "message");
        try {
            if (!s().isClosed()) {
                s().c(inputStream);
            }
        } finally {
            AbstractC7365pU.e(inputStream);
        }
    }

    @Override // com.daaw.LX0
    public void p() {
        u().t();
    }

    public final void r() {
        s().close();
    }

    public abstract InterfaceC8743uQ s();

    public final void t(int i) {
        u().q(i);
    }

    public abstract a u();
}
