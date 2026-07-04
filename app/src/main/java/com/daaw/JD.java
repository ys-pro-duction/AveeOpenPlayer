package com.daaw;

import com.daaw.C6876nj;

/* JADX INFO: loaded from: classes.dex */
public final class JD extends H90 implements InterfaceC1516Lr0 {
    public static final b J = new b(null);
    public static final NQ K = a.B;
    public FD F;
    public final InterfaceC7981rh G;
    public boolean H;
    public final LQ I;

    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        public final void a(JD jd) {
            G10.g(jd, "drawEntity");
            if (jd.isValid()) {
                jd.H = true;
                jd.b().m1();
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JD) obj);
            return G91.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    public static final class c implements InterfaceC7981rh {
        public final InterfaceC4988gz a;
        public final /* synthetic */ K90 c;

        public c(K90 k90) {
            this.c = k90;
            this.a = JD.this.a().Q();
        }

        @Override // com.daaw.InterfaceC7981rh
        public long a() {
            return J00.b(this.c.d());
        }

        @Override // com.daaw.InterfaceC7981rh
        public InterfaceC4988gz getDensity() {
            return this.a;
        }

        @Override // com.daaw.InterfaceC7981rh
        public EnumC7560q90 getLayoutDirection() {
            return JD.this.a().getLayoutDirection();
        }
    }

    public static final class d extends AbstractC4192e90 implements LQ {
        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m9invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m9invoke() {
            FD fd = JD.this.F;
            if (fd != null) {
                fd.K(JD.this.G);
            }
            JD.this.H = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JD(K90 k90, KD kd) {
        super(k90, kd);
        G10.g(k90, "layoutNodeWrapper");
        G10.g(kd, "modifier");
        this.F = o();
        this.G = new c(k90);
        this.H = true;
        this.I = new d();
    }

    @Override // com.daaw.H90
    public void g() {
        this.F = o();
        this.H = true;
        super.g();
    }

    @Override // com.daaw.InterfaceC1516Lr0
    public boolean isValid() {
        return b().C();
    }

    public final void m(InterfaceC6318lj interfaceC6318lj) {
        G10.g(interfaceC6318lj, "canvas");
        long jB = J00.b(e());
        if (this.F != null && this.H) {
            I90.a(a()).getSnapshotObserver().e(this, K, this.I);
        }
        G90 g90Z = a().Z();
        K90 k90B = b();
        JD jd = g90Z.C;
        g90Z.C = this;
        C6876nj c6876nj = g90Z.B;
        InterfaceC1269Jh0 interfaceC1269Jh0Z0 = k90B.Z0();
        EnumC7560q90 layoutDirection = k90B.Z0().getLayoutDirection();
        C6876nj.a aVarO = c6876nj.o();
        InterfaceC4988gz interfaceC4988gzA = aVarO.a();
        EnumC7560q90 enumC7560q90B = aVarO.b();
        InterfaceC6318lj interfaceC6318ljC = aVarO.c();
        long jD = aVarO.d();
        C6876nj.a aVarO2 = c6876nj.o();
        aVarO2.j(interfaceC1269Jh0Z0);
        aVarO2.k(layoutDirection);
        aVarO2.i(interfaceC6318lj);
        aVarO2.l(jB);
        interfaceC6318lj.i();
        ((KD) c()).G(g90Z);
        interfaceC6318lj.o();
        C6876nj.a aVarO3 = c6876nj.o();
        aVarO3.j(interfaceC4988gzA);
        aVarO3.k(enumC7560q90B);
        aVarO3.i(interfaceC6318ljC);
        aVarO3.l(jD);
        g90Z.C = jd;
    }

    public final void n() {
        this.H = true;
    }

    public final FD o() {
        KD kd = (KD) c();
        if (kd instanceof FD) {
            return (FD) kd;
        }
        return null;
    }
}
