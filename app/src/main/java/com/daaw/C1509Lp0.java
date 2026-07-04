package com.daaw;

import com.daaw.AbstractC8914v;
import com.daaw.C6882nk0;
import com.daaw.C6917nr0;
import com.daaw.InterfaceC2971Zl;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Lp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1509Lp0 extends AbstractC8914v {
    public static final C4057dh p = new C4057dh();
    public final C6882nk0 h;
    public final String i;
    public final C5695jX0 j;
    public String k;
    public final b l;
    public final a m;
    public final C1971Qb n;
    public boolean o;

    /* JADX INFO: renamed from: com.daaw.Lp0$a */
    public class a implements AbstractC8914v.b {
        public a() {
        }

        @Override // com.daaw.AbstractC8914v.b
        public void f(C6262lX0 c6262lX0) {
            AbstractC1213It0.f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (C1509Lp0.this.l.z) {
                    C1509Lp0.this.l.a0(c6262lX0, true, null);
                }
            } finally {
                AbstractC1213It0.h("OkHttpClientStream$Sink.cancel");
            }
        }

        @Override // com.daaw.AbstractC8914v.b
        public void g(InterfaceC7157oj1 interfaceC7157oj1, boolean z, boolean z2, int i) {
            C4057dh c4057dhF;
            AbstractC1213It0.f("OkHttpClientStream$Sink.writeFrame");
            if (interfaceC7157oj1 == null) {
                c4057dhF = C1509Lp0.p;
            } else {
                c4057dhF = ((C2260Sp0) interfaceC7157oj1).f();
                int iF1 = (int) c4057dhF.f1();
                if (iF1 > 0) {
                    C1509Lp0.this.t(iF1);
                }
            }
            try {
                synchronized (C1509Lp0.this.l.z) {
                    C1509Lp0.this.l.e0(c4057dhF, z, z2);
                    C1509Lp0.this.x().e(i);
                }
            } finally {
                AbstractC1213It0.h("OkHttpClientStream$Sink.writeFrame");
            }
        }

        @Override // com.daaw.AbstractC8914v.b
        public void h(C2756Xj0 c2756Xj0, byte[] bArr) {
            AbstractC1213It0.f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + C1509Lp0.this.h.c();
            if (bArr != null) {
                C1509Lp0.this.o = true;
                str = str + "?" + AbstractC7688qe.a().e(bArr);
            }
            try {
                synchronized (C1509Lp0.this.l.z) {
                    C1509Lp0.this.l.g0(c2756Xj0, str);
                }
            } finally {
                AbstractC1213It0.h("OkHttpClientStream$Sink.writeHeaders");
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lp0$b */
    public class b extends AbstractC8767uW implements C6917nr0.b {
        public List A;
        public C4057dh B;
        public boolean C;
        public boolean D;
        public boolean E;
        public int F;
        public int G;
        public final C6759nI H;
        public final C6917nr0 I;
        public final C1612Mp0 J;
        public boolean K;
        public final U01 L;
        public C6917nr0.c M;
        public int N;
        public final int y;
        public final Object z;

        public b(int i, C5695jX0 c5695jX0, Object obj, C6759nI c6759nI, C6917nr0 c6917nr0, C1612Mp0 c1612Mp0, int i2, String str) {
            super(i, c5695jX0, C1509Lp0.this.x());
            this.B = new C4057dh();
            this.C = false;
            this.D = false;
            this.E = false;
            this.K = true;
            this.N = -1;
            this.z = AbstractC7785qy0.o(obj, "lock");
            this.H = c6759nI;
            this.I = c6917nr0;
            this.J = c1612Mp0;
            this.F = i2;
            this.G = i2;
            this.y = i2;
            this.L = AbstractC1213It0.a(str);
        }

        @Override // com.daaw.AbstractC8767uW
        public void P(C6262lX0 c6262lX0, boolean z, C2756Xj0 c2756Xj0) {
            a0(c6262lX0, z, c2756Xj0);
        }

        public final void a0(C6262lX0 c6262lX0, boolean z, C2756Xj0 c2756Xj0) {
            if (this.E) {
                return;
            }
            this.E = true;
            if (!this.K) {
                this.J.U(c0(), c6262lX0, InterfaceC2971Zl.a.PROCESSED, z, EnumC7034oH.CANCEL, c2756Xj0);
                return;
            }
            this.J.h0(C1509Lp0.this);
            this.A = null;
            this.B.c();
            this.K = false;
            if (c2756Xj0 == null) {
                c2756Xj0 = new C2756Xj0();
            }
            N(c6262lX0, true, c2756Xj0);
        }

        public C6917nr0.c b0() {
            C6917nr0.c cVar;
            synchronized (this.z) {
                cVar = this.M;
            }
            return cVar;
        }

        @Override // com.daaw.AbstractC8767uW, com.daaw.AbstractC8914v.c, com.daaw.C1381Kj0.b
        public void c(boolean z) {
            d0();
            super.c(z);
        }

        public int c0() {
            return this.N;
        }

        @Override // com.daaw.C1381Kj0.b
        public void d(int i) {
            int i2 = this.G - i;
            this.G = i2;
            float f = i2;
            int i3 = this.y;
            if (f <= i3 * 0.5f) {
                int i4 = i3 - i2;
                this.F += i4;
                this.G = i2 + i4;
                this.H.g(c0(), i4);
            }
        }

        public final void d0() {
            if (G()) {
                this.J.U(c0(), null, InterfaceC2971Zl.a.PROCESSED, false, null, null);
            } else {
                this.J.U(c0(), null, InterfaceC2971Zl.a.PROCESSED, false, EnumC7034oH.CANCEL, null);
            }
        }

        @Override // com.daaw.C1381Kj0.b
        public void e(Throwable th) {
            P(C6262lX0.k(th), true, new C2756Xj0());
        }

        public final void e0(C4057dh c4057dh, boolean z, boolean z2) {
            if (this.E) {
                return;
            }
            if (!this.K) {
                AbstractC7785qy0.u(c0() != -1, "streamId should be set");
                this.I.d(z, this.M, c4057dh, z2);
            } else {
                this.B.O0(c4057dh, (int) c4057dh.f1());
                this.C |= z;
                this.D |= z2;
            }
        }

        @Override // com.daaw.C7946ra.d
        public void f(Runnable runnable) {
            synchronized (this.z) {
                runnable.run();
            }
        }

        public void f0(int i) {
            AbstractC7785qy0.v(this.N == -1, "the stream has been started with id %s", i);
            this.N = i;
            this.M = this.I.c(this, i);
            C1509Lp0.this.l.r();
            if (this.K) {
                this.H.W0(C1509Lp0.this.o, false, this.N, 0, this.A);
                C1509Lp0.this.j.c();
                this.A = null;
                if (this.B.f1() > 0) {
                    this.I.d(this.C, this.M, this.B, this.D);
                }
                this.K = false;
            }
        }

        public final void g0(C2756Xj0 c2756Xj0, String str) {
            this.A = BV.b(c2756Xj0, str, C1509Lp0.this.k, C1509Lp0.this.i, C1509Lp0.this.o, this.J.b0());
            this.J.o0(C1509Lp0.this);
        }

        public U01 h0() {
            return this.L;
        }

        public void i0(C4057dh c4057dh, boolean z) throws Throwable {
            int iF1 = this.F - ((int) c4057dh.f1());
            this.F = iF1;
            if (iF1 >= 0) {
                super.S(new C1924Pp0(c4057dh), z);
            } else {
                this.H.f(c0(), EnumC7034oH.FLOW_CONTROL_ERROR);
                this.J.U(c0(), C6262lX0.t.q("Received data size exceeded our receiving window size"), InterfaceC2971Zl.a.PROCESSED, false, null, null);
            }
        }

        public void j0(List list, boolean z) {
            if (z) {
                U(AbstractC0830Fb1.c(list));
            } else {
                T(AbstractC0830Fb1.a(list));
            }
        }

        @Override // com.daaw.A0.a
        public void r() {
            super.r();
            m().c();
        }
    }

    public C1509Lp0(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C6759nI c6759nI, C1612Mp0 c1612Mp0, C6917nr0 c6917nr0, Object obj, int i, int i2, String str, String str2, C5695jX0 c5695jX0, T51 t51, C1168Ii c1168Ii, boolean z) {
        super(new C2364Tp0(), c5695jX0, t51, c2756Xj0, c1168Ii, z && c6882nk0.f());
        this.m = new a();
        this.o = false;
        this.j = (C5695jX0) AbstractC7785qy0.o(c5695jX0, "statsTraceCtx");
        this.h = c6882nk0;
        this.k = str;
        this.i = str2;
        this.n = c1612Mp0.V();
        this.l = new b(i, c5695jX0, obj, c6759nI, c6917nr0, c1612Mp0, i2, c6882nk0.c());
    }

    @Override // com.daaw.AbstractC8914v
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a v() {
        return this.m;
    }

    public C6882nk0.d M() {
        return this.h.e();
    }

    @Override // com.daaw.AbstractC8914v
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b z() {
        return this.l;
    }

    public boolean O() {
        return this.o;
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void h(String str) {
        this.k = (String) AbstractC7785qy0.o(str, "authority");
    }

    @Override // com.daaw.InterfaceC2867Yl
    public C1971Qb k() {
        return this.n;
    }
}
