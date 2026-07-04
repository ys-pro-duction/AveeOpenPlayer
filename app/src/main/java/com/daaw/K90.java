package com.daaw;

import com.daaw.XG;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class K90 extends AbstractC0584Cu0 implements InterfaceC0645Dh0, InterfaceC7002o90, InterfaceC1516Lr0, NQ {
    public static final e X = new e(null);
    public static final NQ Y = d.B;
    public static final NQ Z = c.B;
    public static final C8158sJ0 a0 = new C8158sJ0();
    public static final f b0 = new a();
    public static final f c0 = new b();
    public final E90 F;
    public K90 G;
    public boolean H;
    public NQ I;
    public InterfaceC4988gz J;
    public EnumC7560q90 K;
    public float L;
    public boolean M;
    public InterfaceC1061Hh0 N;
    public Map O;
    public long P;
    public float Q;
    public boolean R;
    public C6892nm0 S;
    public final H90[] T;
    public final LQ U;
    public boolean V;
    public InterfaceC1205Ir0 W;

    public static final class a implements f {
        @Override // com.daaw.K90.f
        public void a(E90 e90, long j, VV vv, boolean z, boolean z2) {
            G10.g(e90, "layoutNode");
            G10.g(vv, "hitTestResult");
            e90.u0(j, vv, z, z2);
        }

        @Override // com.daaw.K90.f
        public boolean d(E90 e90) {
            G10.g(e90, "parentLayoutNode");
            return true;
        }

        @Override // com.daaw.K90.f
        public int e() {
            return XG.a.d();
        }

        @Override // com.daaw.K90.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AbstractC9182vx0 b(C7781qx0 c7781qx0) {
            G10.g(c7781qx0, "entity");
            return ((InterfaceC9461wx0) c7781qx0.c()).C();
        }

        @Override // com.daaw.K90.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean c(C7781qx0 c7781qx0) {
            G10.g(c7781qx0, "entity");
            return ((InterfaceC9461wx0) c7781qx0.c()).C().f0();
        }
    }

    public static final class b implements f {
        @Override // com.daaw.K90.f
        public void a(E90 e90, long j, VV vv, boolean z, boolean z2) {
            G10.g(e90, "layoutNode");
            G10.g(vv, "hitTestResult");
            e90.w0(j, vv, z, z2);
        }

        @Override // com.daaw.K90.f
        public boolean d(E90 e90) {
            C6788nP0 c6788nP0J;
            G10.g(e90, "parentLayoutNode");
            C7346pP0 c7346pP0J = AbstractC8740uP0.j(e90);
            boolean z = false;
            if (c7346pP0J != null && (c6788nP0J = c7346pP0J.j()) != null && c6788nP0J.D()) {
                z = true;
            }
            return !z;
        }

        @Override // com.daaw.K90.f
        public int e() {
            return XG.a.f();
        }

        @Override // com.daaw.K90.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C7346pP0 b(C7346pP0 c7346pP0) {
            G10.g(c7346pP0, "entity");
            return c7346pP0;
        }

        @Override // com.daaw.K90.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean c(C7346pP0 c7346pP0) {
            G10.g(c7346pP0, "entity");
            return false;
        }
    }

    public static final class c extends AbstractC4192e90 implements NQ {
        public static final c B = new c();

        public c() {
            super(1);
        }

        public final void a(K90 k90) {
            G10.g(k90, "wrapper");
            InterfaceC1205Ir0 interfaceC1205Ir0V0 = k90.V0();
            if (interfaceC1205Ir0V0 != null) {
                interfaceC1205Ir0V0.invalidate();
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((K90) obj);
            return G91.a;
        }
    }

    public static final class d extends AbstractC4192e90 implements NQ {
        public static final d B = new d();

        public d() {
            super(1);
        }

        public final void a(K90 k90) {
            G10.g(k90, "wrapper");
            if (k90.isValid()) {
                k90.I1();
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((K90) obj);
            return G91.a;
        }
    }

    public static final class e {
        public /* synthetic */ e(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final f a() {
            return K90.b0;
        }

        public final f b() {
            return K90.c0;
        }

        public e() {
        }
    }

    public interface f {
        void a(E90 e90, long j, VV vv, boolean z, boolean z2);

        Object b(H90 h90);

        boolean c(H90 h90);

        boolean d(E90 e90);

        int e();
    }

    public static final class g extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ H90 C;
        public final /* synthetic */ f D;
        public final /* synthetic */ long E;
        public final /* synthetic */ VV F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ boolean H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(H90 h90, f fVar, long j, VV vv, boolean z, boolean z2) {
            super(0);
            this.C = h90;
            this.D = fVar;
            this.E = j;
            this.F = vv;
            this.G = z;
            this.H = z2;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m11invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m11invoke() {
            K90.this.i1(this.C.d(), this.D, this.E, this.F, this.G, this.H);
        }
    }

    public static final class h extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ H90 C;
        public final /* synthetic */ f D;
        public final /* synthetic */ long E;
        public final /* synthetic */ VV F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ boolean H;
        public final /* synthetic */ float I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(H90 h90, f fVar, long j, VV vv, boolean z, boolean z2, float f) {
            super(0);
            this.C = h90;
            this.D = fVar;
            this.E = j;
            this.F = vv;
            this.G = z;
            this.H = z2;
            this.I = f;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m12invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12invoke() {
            K90.this.j1(this.C.d(), this.D, this.E, this.F, this.G, this.H, this.I);
        }
    }

    public static final class i extends AbstractC4192e90 implements LQ {
        public i() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m13invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m13invoke() {
            K90 k90G1 = K90.this.g1();
            if (k90G1 != null) {
                k90G1.m1();
            }
        }
    }

    public static final class j extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ InterfaceC6318lj C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC6318lj interfaceC6318lj) {
            super(0);
            this.C = interfaceC6318lj;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m14invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m14invoke() {
            K90.this.O0(this.C);
        }
    }

    public static final class k extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ H90 C;
        public final /* synthetic */ f D;
        public final /* synthetic */ long E;
        public final /* synthetic */ VV F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ boolean H;
        public final /* synthetic */ float I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(H90 h90, f fVar, long j, VV vv, boolean z, boolean z2, float f) {
            super(0);
            this.C = h90;
            this.D = fVar;
            this.E = j;
            this.F = vv;
            this.G = z;
            this.H = z2;
            this.I = f;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m15invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m15invoke() {
            K90.this.F1(this.C.d(), this.D, this.E, this.F, this.G, this.H, this.I);
        }
    }

    public static final class l extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(NQ nq) {
            super(0);
            this.B = nq;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m16invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m16invoke() {
            this.B.invoke(K90.a0);
        }
    }

    public K90(E90 e90) {
        G10.g(e90, "layoutNode");
        this.F = e90;
        this.J = e90.Q();
        this.K = e90.getLayoutDirection();
        this.L = 0.8f;
        this.P = D00.b.a();
        this.T = XG.l(null, 1, null);
        this.U = new i();
    }

    public static /* synthetic */ void A1(K90 k90, C6892nm0 c6892nm0, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        k90.z1(c6892nm0, z, z2);
    }

    private final C1620Mr0 e1() {
        return I90.a(this.F).getSnapshotObserver();
    }

    public final void B1(InterfaceC1061Hh0 interfaceC1061Hh0) {
        E90 e90L0;
        G10.g(interfaceC1061Hh0, "value");
        InterfaceC1061Hh0 interfaceC1061Hh02 = this.N;
        if (interfaceC1061Hh0 != interfaceC1061Hh02) {
            this.N = interfaceC1061Hh0;
            if (interfaceC1061Hh02 == null || interfaceC1061Hh0.getWidth() != interfaceC1061Hh02.getWidth() || interfaceC1061Hh0.getHeight() != interfaceC1061Hh02.getHeight()) {
                u1(interfaceC1061Hh0.getWidth(), interfaceC1061Hh0.getHeight());
            }
            Map map = this.O;
            if (((map == null || map.isEmpty()) && interfaceC1061Hh0.b().isEmpty()) || G10.c(interfaceC1061Hh0.b(), this.O)) {
                return;
            }
            K90 k90F1 = f1();
            if (G10.c(k90F1 != null ? k90F1.F : null, this.F)) {
                E90 e90L02 = this.F.l0();
                if (e90L02 != null) {
                    e90L02.K0();
                }
                if (this.F.N().i()) {
                    E90 e90L03 = this.F.l0();
                    if (e90L03 != null) {
                        E90.b1(e90L03, false, 1, null);
                    }
                } else if (this.F.N().h() && (e90L0 = this.F.l0()) != null) {
                    E90.Z0(e90L0, false, 1, null);
                }
            } else {
                this.F.K0();
            }
            this.F.N().n(true);
            Map linkedHashMap = this.O;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.O = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(interfaceC1061Hh0.b());
        }
    }

    @Override // com.daaw.InterfaceC7002o90
    public final boolean C() {
        if (!this.M || this.F.C0()) {
            return this.M;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final void C1(boolean z) {
        this.R = z;
    }

    public final void D1(K90 k90) {
        this.G = k90;
    }

    public final boolean E1() {
        K90 k90F1;
        C7781qx0 c7781qx0 = (C7781qx0) XG.n(this.T, XG.a.d());
        return (c7781qx0 != null && c7781qx0.j()) || ((k90F1 = f1()) != null && k90F1.E1());
    }

    public final void F0(K90 k90, C6892nm0 c6892nm0, boolean z) {
        if (k90 == this) {
            return;
        }
        K90 k902 = this.G;
        if (k902 != null) {
            k902.F0(k90, c6892nm0, z);
        }
        R0(c6892nm0, z);
    }

    public final void F1(H90 h90, f fVar, long j2, VV vv, boolean z, boolean z2, float f2) {
        if (h90 == null) {
            l1(fVar, j2, vv, z, z2);
        } else if (fVar.c(h90)) {
            vv.I(fVar.b(h90), f2, z2, new k(h90, fVar, j2, vv, z, z2, f2));
        } else {
            F1(h90.d(), fVar, j2, vv, z, z2, f2);
        }
    }

    public final long G0(K90 k90, long j2) {
        if (k90 == this) {
            return j2;
        }
        K90 k902 = this.G;
        return (k902 == null || G10.c(k90, k902)) ? Q0(j2) : Q0(k902.G0(k90, j2));
    }

    public long G1(long j2) {
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        if (interfaceC1205Ir0 != null) {
            j2 = interfaceC1205Ir0.d(j2, false);
        }
        return E00.c(j2, this.P);
    }

    public void H0() {
        this.M = true;
        t1(this.I);
        for (H90 h90D : this.T) {
            for (; h90D != null; h90D = h90D.d()) {
                h90D.g();
            }
        }
    }

    public final C3103aF0 H1() {
        if (!C()) {
            return C3103aF0.e.a();
        }
        InterfaceC7002o90 interfaceC7002o90C = AbstractC7281p90.c(this);
        C6892nm0 c6892nm0D1 = d1();
        long jJ0 = J0(a1());
        c6892nm0D1.i(-C9879yT0.i(jJ0));
        c6892nm0D1.k(-C9879yT0.g(jJ0));
        c6892nm0D1.j(o0() + C9879yT0.i(jJ0));
        c6892nm0D1.h(m0() + C9879yT0.g(jJ0));
        K90 k90 = this;
        while (k90 != interfaceC7002o90C) {
            k90.z1(c6892nm0D1, false, true);
            if (c6892nm0D1.f()) {
                return C3103aF0.e.a();
            }
            k90 = k90.G;
            G10.d(k90);
        }
        return AbstractC7171om0.a(c6892nm0D1);
    }

    public abstract int I0(I3 i3);

    public final void I1() {
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        if (interfaceC1205Ir0 != null) {
            NQ nq = this.I;
            if (nq == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C8158sJ0 c8158sJ0 = a0;
            c8158sJ0.i0();
            c8158sJ0.j0(this.F.Q());
            e1().e(this, Y, new l(nq));
            float fC = c8158sJ0.C();
            float fG = c8158sJ0.G();
            float fB = c8158sJ0.b();
            float fF0 = c8158sJ0.f0();
            float fH0 = c8158sJ0.h0();
            float fI = c8158sJ0.I();
            long jE = c8158sJ0.e();
            long jL = c8158sJ0.L();
            float fR = c8158sJ0.r();
            float fX = c8158sJ0.x();
            float fY = c8158sJ0.y();
            float f2 = c8158sJ0.f();
            long jM = c8158sJ0.M();
            InterfaceC5391iR0 interfaceC5391iR0K = c8158sJ0.K();
            boolean zG = c8158sJ0.g();
            c8158sJ0.o();
            interfaceC1205Ir0.b(fC, fG, fB, fF0, fH0, fI, fR, fX, fY, f2, jM, interfaceC5391iR0K, zG, null, jE, jL, this.F.getLayoutDirection(), this.F.Q());
            this.H = c8158sJ0.g();
        } else if (this.I != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.L = a0.b();
        InterfaceC1413Kr0 interfaceC1413Kr0K0 = this.F.k0();
        if (interfaceC1413Kr0K0 != null) {
            interfaceC1413Kr0K0.e(this.F);
        }
    }

    public final long J0(long j2) {
        return BT0.a(Math.max(0.0f, (C9879yT0.i(j2) - o0()) / 2.0f), Math.max(0.0f, (C9879yT0.g(j2) - m0()) / 2.0f));
    }

    public final boolean J1(long j2) {
        if (!AbstractC0460Bp0.b(j2)) {
            return false;
        }
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        return interfaceC1205Ir0 == null || !this.H || interfaceC1205Ir0.c(j2);
    }

    @Override // com.daaw.InterfaceC7002o90
    public C3103aF0 K(InterfaceC7002o90 interfaceC7002o90, boolean z) {
        G10.g(interfaceC7002o90, "sourceCoordinates");
        if (!C()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC7002o90.C()) {
            throw new IllegalStateException(("LayoutCoordinates " + interfaceC7002o90 + " is not attached!").toString());
        }
        K90 k90 = (K90) interfaceC7002o90;
        K90 k90P0 = P0(k90);
        C6892nm0 c6892nm0D1 = d1();
        c6892nm0D1.i(0.0f);
        c6892nm0D1.k(0.0f);
        c6892nm0D1.j(I00.g(interfaceC7002o90.d()));
        c6892nm0D1.h(I00.f(interfaceC7002o90.d()));
        K90 k902 = k90;
        while (k902 != k90P0) {
            boolean z2 = z;
            A1(k902, c6892nm0D1, z2, false, 4, null);
            if (c6892nm0D1.f()) {
                return C3103aF0.e.a();
            }
            k902 = k902.G;
            G10.d(k902);
            z = z2;
        }
        F0(k90P0, c6892nm0D1, z);
        return AbstractC7171om0.a(c6892nm0D1);
    }

    public void K0() {
        for (H90 h90D : this.T) {
            for (; h90D != null; h90D = h90D.d()) {
                h90D.h();
            }
        }
        this.M = false;
        t1(this.I);
        E90 e90L0 = this.F.l0();
        if (e90L0 != null) {
            e90L0.z0();
        }
    }

    @Override // com.daaw.E10
    public Object L() {
        return b1((GS0) XG.n(this.T, XG.a.c()));
    }

    public final float L0(long j2, long j3) {
        if (o0() >= C9879yT0.i(j3) && m0() >= C9879yT0.g(j3)) {
            return Float.POSITIVE_INFINITY;
        }
        long jJ0 = J0(j3);
        float fI = C9879yT0.i(jJ0);
        float fG = C9879yT0.g(jJ0);
        long jR1 = r1(j2);
        if ((fI > 0.0f || fG > 0.0f) && C9982yp0.l(jR1) <= fI && C9982yp0.m(jR1) <= fG) {
            return C9982yp0.k(jR1);
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // com.daaw.InterfaceC7002o90
    public final InterfaceC7002o90 M() {
        if (C()) {
            return this.F.j0().G;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    public final void M0(InterfaceC6318lj interfaceC6318lj) {
        G10.g(interfaceC6318lj, "canvas");
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        if (interfaceC1205Ir0 != null) {
            interfaceC1205Ir0.e(interfaceC6318lj);
            return;
        }
        float f2 = D00.f(this.P);
        float fG = D00.g(this.P);
        interfaceC6318lj.c(f2, fG);
        O0(interfaceC6318lj);
        interfaceC6318lj.c(-f2, -fG);
    }

    public final void N0(InterfaceC6318lj interfaceC6318lj, InterfaceC8595ts0 interfaceC8595ts0) {
        G10.g(interfaceC6318lj, "canvas");
        G10.g(interfaceC8595ts0, "paint");
        interfaceC6318lj.n(new C3103aF0(0.5f, 0.5f, I00.g(n0()) - 0.5f, I00.f(n0()) - 0.5f), interfaceC8595ts0);
    }

    public final void O0(InterfaceC6318lj interfaceC6318lj) {
        JD jd = (JD) XG.n(this.T, XG.a.a());
        if (jd == null) {
            y1(interfaceC6318lj);
        } else {
            jd.m(interfaceC6318lj);
        }
    }

    public final K90 P0(K90 k90) {
        G10.g(k90, "other");
        E90 e90L0 = k90.F;
        E90 e90L02 = this.F;
        if (e90L0 == e90L02) {
            K90 k90J0 = e90L02.j0();
            K90 k902 = this;
            while (k902 != k90J0 && k902 != k90) {
                k902 = k902.G;
                G10.d(k902);
            }
            return k902 == k90 ? k90 : this;
        }
        while (e90L0.R() > e90L02.R()) {
            e90L0 = e90L0.l0();
            G10.d(e90L0);
        }
        while (e90L02.R() > e90L0.R()) {
            e90L02 = e90L02.l0();
            G10.d(e90L02);
        }
        while (e90L0 != e90L02) {
            e90L0 = e90L0.l0();
            e90L02 = e90L02.l0();
            if (e90L0 == null || e90L02 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (e90L02 != this.F) {
            if (e90L0 != k90.F) {
                return e90L0.V();
            }
        }
    }

    public long Q0(long j2) {
        long jB = E00.b(j2, this.P);
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        return interfaceC1205Ir0 != null ? interfaceC1205Ir0.d(jB, true) : jB;
    }

    public final void R0(C6892nm0 c6892nm0, boolean z) {
        float f2 = D00.f(this.P);
        c6892nm0.i(c6892nm0.b() - f2);
        c6892nm0.j(c6892nm0.c() - f2);
        float fG = D00.g(this.P);
        c6892nm0.k(c6892nm0.d() - fG);
        c6892nm0.h(c6892nm0.a() - fG);
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        if (interfaceC1205Ir0 != null) {
            interfaceC1205Ir0.a(c6892nm0, true);
            if (this.H && z) {
                c6892nm0.e(0.0f, 0.0f, I00.g(d()), I00.f(d()));
                c6892nm0.f();
            }
        }
    }

    public final H90[] S0() {
        return this.T;
    }

    public final boolean T0() {
        return this.N != null;
    }

    public final boolean U0() {
        return this.V;
    }

    public final InterfaceC1205Ir0 V0() {
        return this.W;
    }

    public final NQ W0() {
        return this.I;
    }

    public final E90 X0() {
        return this.F;
    }

    public final InterfaceC1061Hh0 Y0() {
        InterfaceC1061Hh0 interfaceC1061Hh0 = this.N;
        if (interfaceC1061Hh0 != null) {
            return interfaceC1061Hh0;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public abstract InterfaceC1269Jh0 Z0();

    public final long a1() {
        return this.J.d0(this.F.o0().d());
    }

    public final Object b1(GS0 gs0) {
        if (gs0 != null) {
            return ((InterfaceC2272Ss0) gs0.c()).L(Z0(), b1((GS0) gs0.d()));
        }
        K90 k90F1 = f1();
        if (k90F1 != null) {
            return k90F1.L();
        }
        return null;
    }

    public final long c1() {
        return this.P;
    }

    @Override // com.daaw.InterfaceC7002o90
    public final long d() {
        return n0();
    }

    public final C6892nm0 d1() {
        C6892nm0 c6892nm0 = this.S;
        if (c6892nm0 != null) {
            return c6892nm0;
        }
        C6892nm0 c6892nm02 = new C6892nm0(0.0f, 0.0f, 0.0f, 0.0f);
        this.S = c6892nm02;
        return c6892nm02;
    }

    @Override // com.daaw.InterfaceC7002o90
    public long f0(long j2) {
        if (!C()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        for (K90 k90 = this; k90 != null; k90 = k90.G) {
            j2 = k90.G1(j2);
        }
        return j2;
    }

    public K90 f1() {
        return null;
    }

    public final K90 g1() {
        return this.G;
    }

    public final float h1() {
        return this.Q;
    }

    public final void i1(H90 h90, f fVar, long j2, VV vv, boolean z, boolean z2) {
        if (h90 == null) {
            l1(fVar, j2, vv, z, z2);
        } else {
            vv.E(fVar.b(h90), z2, new g(h90, fVar, j2, vv, z, z2));
        }
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n1((InterfaceC6318lj) obj);
        return G91.a;
    }

    @Override // com.daaw.InterfaceC1516Lr0
    public boolean isValid() {
        return this.W != null;
    }

    public final void j1(H90 h90, f fVar, long j2, VV vv, boolean z, boolean z2, float f2) {
        if (h90 == null) {
            l1(fVar, j2, vv, z, z2);
        } else {
            vv.F(fVar.b(h90), f2, z2, new h(h90, fVar, j2, vv, z, z2, f2));
        }
    }

    public final void k1(f fVar, long j2, VV vv, boolean z, boolean z2) {
        G10.g(fVar, "hitTestSource");
        G10.g(vv, "hitTestResult");
        H90 h90N = XG.n(this.T, fVar.e());
        if (!J1(j2)) {
            if (z) {
                float fL0 = L0(j2, a1());
                if (Float.isInfinite(fL0) || Float.isNaN(fL0) || !vv.G(fL0, false)) {
                    return;
                }
                j1(h90N, fVar, j2, vv, z, false, fL0);
                return;
            }
            return;
        }
        if (h90N == null) {
            l1(fVar, j2, vv, z, z2);
            return;
        }
        if (o1(j2)) {
            i1(h90N, fVar, j2, vv, z, z2);
            return;
        }
        float fL02 = !z ? Float.POSITIVE_INFINITY : L0(j2, a1());
        if (Float.isInfinite(fL02) || Float.isNaN(fL02) || !vv.G(fL02, z2)) {
            F1(h90N, fVar, j2, vv, z, z2, fL02);
        } else {
            j1(h90N, fVar, j2, vv, z, z2, fL02);
        }
    }

    public void l1(f fVar, long j2, VV vv, boolean z, boolean z2) {
        G10.g(fVar, "hitTestSource");
        G10.g(vv, "hitTestResult");
        K90 k90F1 = f1();
        if (k90F1 != null) {
            k90F1.k1(fVar, k90F1.Q0(j2), vv, z, z2);
        }
    }

    public void m1() {
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        if (interfaceC1205Ir0 != null) {
            interfaceC1205Ir0.invalidate();
            return;
        }
        K90 k90 = this.G;
        if (k90 != null) {
            k90.m1();
        }
    }

    public void n1(InterfaceC6318lj interfaceC6318lj) {
        G10.g(interfaceC6318lj, "canvas");
        if (!this.F.g()) {
            this.V = true;
        } else {
            e1().e(this, Z, new j(interfaceC6318lj));
            this.V = false;
        }
    }

    @Override // com.daaw.InterfaceC7002o90
    public long o(long j2) {
        return I90.a(this.F).d(f0(j2));
    }

    public final boolean o1(long j2) {
        float fL = C9982yp0.l(j2);
        float fM = C9982yp0.m(j2);
        return fL >= 0.0f && fM >= 0.0f && fL < ((float) o0()) && fM < ((float) m0());
    }

    public final boolean p1() {
        return this.R;
    }

    public final boolean q1() {
        if (this.W != null && this.L <= 0.0f) {
            return true;
        }
        K90 k90 = this.G;
        if (k90 != null) {
            return k90.q1();
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1373Kh0
    public final int r(I3 i3) {
        int iI0;
        G10.g(i3, "alignmentLine");
        if (T0() && (iI0 = I0(i3)) != Integer.MIN_VALUE) {
            return iI0 + D00.g(k0());
        }
        return Integer.MIN_VALUE;
    }

    @Override // com.daaw.AbstractC0584Cu0
    public void r0(long j2, float f2, NQ nq) {
        t1(nq);
        if (!D00.e(this.P, j2)) {
            this.P = j2;
            InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
            if (interfaceC1205Ir0 != null) {
                interfaceC1205Ir0.h(j2);
            } else {
                K90 k90 = this.G;
                if (k90 != null) {
                    k90.m1();
                }
            }
            K90 k90F1 = f1();
            if (G10.c(k90F1 != null ? k90F1.F : null, this.F)) {
                E90 e90L0 = this.F.l0();
                if (e90L0 != null) {
                    e90L0.K0();
                }
            } else {
                this.F.K0();
            }
            InterfaceC1413Kr0 interfaceC1413Kr0K0 = this.F.k0();
            if (interfaceC1413Kr0K0 != null) {
                interfaceC1413Kr0K0.e(this.F);
            }
        }
        this.Q = f2;
    }

    public final long r1(long j2) {
        float fL = C9982yp0.l(j2);
        float fMax = Math.max(0.0f, fL < 0.0f ? -fL : fL - o0());
        float fM = C9982yp0.m(j2);
        return AbstractC0460Bp0.a(fMax, Math.max(0.0f, fM < 0.0f ? -fM : fM - m0()));
    }

    public void s1() {
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        if (interfaceC1205Ir0 != null) {
            interfaceC1205Ir0.invalidate();
        }
    }

    public final void t1(NQ nq) {
        InterfaceC1413Kr0 interfaceC1413Kr0K0;
        boolean z = (this.I == nq && G10.c(this.J, this.F.Q()) && this.K == this.F.getLayoutDirection()) ? false : true;
        this.I = nq;
        this.J = this.F.Q();
        this.K = this.F.getLayoutDirection();
        if (!C() || nq == null) {
            InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
            if (interfaceC1205Ir0 != null) {
                interfaceC1205Ir0.destroy();
                this.F.g1(true);
                this.U.invoke();
                if (C() && (interfaceC1413Kr0K0 = this.F.k0()) != null) {
                    interfaceC1413Kr0K0.e(this.F);
                }
            }
            this.W = null;
            this.V = false;
            return;
        }
        if (this.W != null) {
            if (z) {
                I1();
                return;
            }
            return;
        }
        InterfaceC1205Ir0 interfaceC1205Ir0P = I90.a(this.F).p(this, this.U);
        interfaceC1205Ir0P.f(n0());
        interfaceC1205Ir0P.h(this.P);
        this.W = interfaceC1205Ir0P;
        I1();
        this.F.g1(true);
        this.U.invoke();
    }

    public void u1(int i2, int i3) {
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        if (interfaceC1205Ir0 != null) {
            interfaceC1205Ir0.f(J00.a(i2, i3));
        } else {
            K90 k90 = this.G;
            if (k90 != null) {
                k90.m1();
            }
        }
        InterfaceC1413Kr0 interfaceC1413Kr0K0 = this.F.k0();
        if (interfaceC1413Kr0K0 != null) {
            interfaceC1413Kr0K0.e(this.F);
        }
        t0(J00.a(i2, i3));
        for (H90 h90D = this.T[XG.a.a()]; h90D != null; h90D = h90D.d()) {
            ((JD) h90D).n();
        }
    }

    public final void v1() {
        H90[] h90Arr = this.T;
        XG.a aVar = XG.a;
        if (XG.m(h90Arr, aVar.e())) {
            AbstractC3720cU0 abstractC3720cU0A = AbstractC3720cU0.e.a();
            try {
                AbstractC3720cU0 abstractC3720cU0K = abstractC3720cU0A.k();
                try {
                    H90 h90 = this.T[aVar.e()];
                    if (h90 == null) {
                        G91 g91 = G91.a;
                    } else {
                        AbstractC6314li0.a(((GS0) h90).c());
                        n0();
                        throw null;
                    }
                } finally {
                    abstractC3720cU0A.r(abstractC3720cU0K);
                }
            } finally {
                abstractC3720cU0A.d();
            }
        }
    }

    public void w1() {
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        if (interfaceC1205Ir0 != null) {
            interfaceC1205Ir0.invalidate();
        }
    }

    @Override // com.daaw.InterfaceC7002o90
    public long x(InterfaceC7002o90 interfaceC7002o90, long j2) {
        G10.g(interfaceC7002o90, "sourceCoordinates");
        K90 k90 = (K90) interfaceC7002o90;
        K90 k90P0 = P0(k90);
        while (k90 != k90P0) {
            j2 = k90.G1(j2);
            k90 = k90.G;
            G10.d(k90);
        }
        return G0(k90P0, j2);
    }

    public final void x1() {
        for (H90 h90D = this.T[XG.a.b()]; h90D != null; h90D = h90D.d()) {
            ((InterfaceC9429wq0) ((GS0) h90D).c()).o(this);
        }
    }

    public abstract void y1(InterfaceC6318lj interfaceC6318lj);

    public final void z1(C6892nm0 c6892nm0, boolean z, boolean z2) {
        G10.g(c6892nm0, "bounds");
        InterfaceC1205Ir0 interfaceC1205Ir0 = this.W;
        if (interfaceC1205Ir0 != null) {
            if (this.H) {
                if (z2) {
                    long jA1 = a1();
                    float fI = C9879yT0.i(jA1) / 2.0f;
                    float fG = C9879yT0.g(jA1) / 2.0f;
                    c6892nm0.e(-fI, -fG, I00.g(d()) + fI, I00.f(d()) + fG);
                } else if (z) {
                    c6892nm0.e(0.0f, 0.0f, I00.g(d()), I00.f(d()));
                }
                if (c6892nm0.f()) {
                    return;
                }
            }
            interfaceC1205Ir0.a(c6892nm0, false);
        }
        float f2 = D00.f(this.P);
        c6892nm0.i(c6892nm0.b() + f2);
        c6892nm0.j(c6892nm0.c() + f2);
        float fG2 = D00.g(this.P);
        c6892nm0.k(c6892nm0.d() + fG2);
        c6892nm0.h(c6892nm0.a() + fG2);
    }
}
