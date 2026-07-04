package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC1413Kr0;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class E90 implements InterfaceC0645Dh0, InterfaceC1516Lr0, InterfaceC9519x90, InterfaceC4943gp, InterfaceC1413Kr0.b {
    public static final f u0 = new f(null);
    public static final h v0 = new c();
    public static final LQ w0 = a.B;
    public static final InterfaceC2733Xd1 x0 = new b();
    public static final C6732nB0 y0 = AbstractC1592Mk0.a(d.B);
    public static final e z0 = new e();
    public final boolean B;
    public int C;
    public final C8565tm0 D;
    public C8565tm0 E;
    public boolean F;
    public E90 G;
    public InterfaceC1413Kr0 H;
    public int I;
    public g J;
    public C8565tm0 K;
    public boolean L;
    public final C8565tm0 M;
    public boolean N;
    public InterfaceC0957Gh0 O;
    public final J10 P;
    public InterfaceC4988gz Q;
    public final InterfaceC1269Jh0 R;
    public EnumC7560q90 S;
    public InterfaceC2733Xd1 T;
    public final F90 U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public i Z;
    public i a0;
    public i b0;
    public boolean c0;
    public final K90 d0;
    public final C7754qr0 e0;
    public float f0;
    public J90 g0;
    public K90 h0;
    public boolean i0;
    public final C1800Ok0 j0;
    public C1800Ok0 k0;
    public InterfaceC1073Hk0 l0;
    public NQ m0;
    public NQ n0;
    public C8565tm0 o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public final Comparator t0;

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E90 invoke() {
            return new E90(false, 1, null);
        }
    }

    public static final class b implements InterfaceC2733Xd1 {
        @Override // com.daaw.InterfaceC2733Xd1
        public long a() {
            return 300L;
        }

        @Override // com.daaw.InterfaceC2733Xd1
        public long b() {
            return 40L;
        }

        @Override // com.daaw.InterfaceC2733Xd1
        public long c() {
            return 400L;
        }

        @Override // com.daaw.InterfaceC2733Xd1
        public long d() {
            return AbstractC7576qD.a.b();
        }

        @Override // com.daaw.InterfaceC2733Xd1
        public float e() {
            return 16.0f;
        }
    }

    public static final class c extends h {
        public c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // com.daaw.InterfaceC0957Gh0
        public /* bridge */ /* synthetic */ InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
            return (InterfaceC1061Hh0) b(interfaceC1269Jh0, list, j);
        }

        public Void b(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
            G10.g(interfaceC1269Jh0, "$this$measure");
            G10.g(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    public static final class d extends AbstractC4192e90 implements LQ {
        public static final d B = new d();

        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            throw new IllegalStateException("default value for sentinel shouldn't be read");
        }
    }

    public static final class e implements InterfaceC1696Nk0 {
        @Override // com.daaw.InterfaceC1073Hk0
        public /* synthetic */ boolean I(NQ nq) {
            return AbstractC1177Ik0.a(this, nq);
        }

        @Override // com.daaw.InterfaceC1696Nk0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void getValue() {
            throw new IllegalStateException("Sentinel ModifierLocal shouldn't be read");
        }

        @Override // com.daaw.InterfaceC1073Hk0
        public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
            return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
        }

        @Override // com.daaw.InterfaceC1073Hk0
        public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
            return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
        }

        @Override // com.daaw.InterfaceC1696Nk0
        public C6732nB0 getKey() {
            return E90.y0;
        }

        @Override // com.daaw.InterfaceC1073Hk0
        public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
            return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
        }
    }

    public static final class f {
        public /* synthetic */ f(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final LQ a() {
            return E90.w0;
        }

        public f() {
        }
    }

    public enum g {
        Measuring,
        LayingOut,
        Idle
    }

    public static abstract class h implements InterfaceC0957Gh0 {
        public final String a;

        public h(String str) {
            G10.g(str, "error");
            this.a = str;
        }
    }

    public enum i {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            iArr[g.Idle.ordinal()] = 1;
            a = iArr;
        }
    }

    public static final class k extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C8565tm0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C8565tm0 c8565tm0) {
            super(2);
            this.B = c8565tm0;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean a(com.daaw.InterfaceC1073Hk0.b r7, boolean r8) {
            /*
                r6 = this;
                java.lang.String r0 = "mod"
                com.daaw.G10.g(r7, r0)
                if (r8 != 0) goto L35
                boolean r8 = r7 instanceof com.daaw.InterfaceC8027rq0
                r0 = 0
                if (r8 == 0) goto L36
                com.daaw.tm0 r8 = r6.B
                r1 = 0
                if (r8 == 0) goto L33
                int r2 = r8.r()
                if (r2 <= 0) goto L31
                java.lang.Object[] r8 = r8.q()
                r3 = 0
            L1c:
                r4 = r8[r3]
                r5 = r4
                com.daaw.Cs0 r5 = (com.daaw.C0576Cs0) r5
                java.lang.Object r5 = r5.d()
                boolean r5 = com.daaw.G10.c(r7, r5)
                if (r5 == 0) goto L2d
                r1 = r4
                goto L31
            L2d:
                int r3 = r3 + 1
                if (r3 < r2) goto L1c
            L31:
                com.daaw.Cs0 r1 = (com.daaw.C0576Cs0) r1
            L33:
                if (r1 != 0) goto L36
            L35:
                r0 = 1
            L36:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.E90.k.a(com.daaw.Hk0$b, boolean):java.lang.Boolean");
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC1073Hk0.b) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public static final class l extends AbstractC4192e90 implements LQ {
        public l() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            int i = 0;
            E90.this.Y = 0;
            C8565tm0 c8565tm0R0 = E90.this.r0();
            int iR = c8565tm0R0.r();
            if (iR > 0) {
                Object[] objArrQ = c8565tm0R0.q();
                int i2 = 0;
                do {
                    E90 e90 = (E90) objArrQ[i2];
                    e90.X = e90.m0();
                    e90.W = Integer.MAX_VALUE;
                    e90.N().r(false);
                    if (e90.d0() == i.InLayoutBlock) {
                        e90.h1(i.NotUsed);
                    }
                    i2++;
                } while (i2 < iR);
            }
            E90.this.V().Y0().a();
            C8565tm0 c8565tm0R02 = E90.this.r0();
            E90 e902 = E90.this;
            int iR2 = c8565tm0R02.r();
            if (iR2 > 0) {
                Object[] objArrQ2 = c8565tm0R02.q();
                do {
                    E90 e903 = (E90) objArrQ2[i];
                    if (e903.X != e903.m0()) {
                        e902.P0();
                        e902.z0();
                        if (e903.m0() == Integer.MAX_VALUE) {
                            e903.I0();
                        }
                    }
                    e903.N().o(e903.N().h());
                    i++;
                } while (i < iR2);
            }
        }
    }

    public static final class m extends AbstractC4192e90 implements InterfaceC3429bR {
        public m() {
            super(2);
        }

        public final void a(G91 g91, InterfaceC1073Hk0.b bVar) {
            Object obj;
            G10.g(g91, "<anonymous parameter 0>");
            G10.g(bVar, "mod");
            C8565tm0 c8565tm0 = E90.this.K;
            int iR = c8565tm0.r();
            if (iR > 0) {
                int i = iR - 1;
                Object[] objArrQ = c8565tm0.q();
                do {
                    obj = objArrQ[i];
                    C0865Fk0 c0865Fk0 = (C0865Fk0) obj;
                    if (c0865Fk0.K1() == bVar && !c0865Fk0.L1()) {
                        break;
                    } else {
                        i--;
                    }
                } while (i >= 0);
                obj = null;
            } else {
                obj = null;
            }
            C0865Fk0 c0865Fk02 = (C0865Fk0) obj;
            if (c0865Fk02 == null) {
                return;
            }
            c0865Fk02.N1(true);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G91) obj, (InterfaceC1073Hk0.b) obj2);
            return G91.a;
        }
    }

    public static final class n implements InterfaceC1269Jh0, InterfaceC4988gz {
        public n() {
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ float H(int i) {
            return AbstractC4709fz.b(this, i);
        }

        @Override // com.daaw.InterfaceC4988gz
        public float J() {
            return E90.this.Q().J();
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ float O(float f) {
            return AbstractC4709fz.d(this, f);
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ int V(float f) {
            return AbstractC4709fz.a(this, f);
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ long d0(long j) {
            return AbstractC4709fz.e(this, j);
        }

        @Override // com.daaw.InterfaceC4988gz
        public /* synthetic */ float e0(long j) {
            return AbstractC4709fz.c(this, j);
        }

        @Override // com.daaw.InterfaceC4988gz
        public float getDensity() {
            return E90.this.Q().getDensity();
        }

        @Override // com.daaw.F10
        public EnumC7560q90 getLayoutDirection() {
            return E90.this.getLayoutDirection();
        }

        @Override // com.daaw.InterfaceC1269Jh0
        public /* synthetic */ InterfaceC1061Hh0 s(int i, int i2, Map map, NQ nq) {
            return AbstractC1165Ih0.a(this, i, i2, map, nq);
        }
    }

    public static final class o extends AbstractC4192e90 implements InterfaceC3429bR {
        public o() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K90 invoke(InterfaceC1073Hk0.b bVar, K90 k90) {
            G10.g(bVar, "mod");
            G10.g(k90, "toWrap");
            XG.i(k90.S0(), k90, bVar);
            if (bVar instanceof InterfaceC8027rq0) {
                E90.this.i0().d(D61.a(k90, bVar));
            }
            if (bVar instanceof C90) {
                C90 c90 = (C90) bVar;
                C0865Fk0 c0865Fk0E1 = E90.this.e1(k90, c90);
                if (c0865Fk0E1 == null) {
                    c0865Fk0E1 = new C0865Fk0(k90, c90);
                }
                k90 = c0865Fk0E1;
                k90.s1();
            }
            XG.h(k90.S0(), k90, bVar);
            return k90;
        }
    }

    public static final class p extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ long C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(long j) {
            super(0);
            this.C = j;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            E90.this.j0().G(this.C);
        }
    }

    public static final class q extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C8565tm0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(C8565tm0 c8565tm0) {
            super(2);
            this.C = c8565tm0;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1800Ok0 invoke(C1800Ok0 c1800Ok0, InterfaceC1073Hk0.b bVar) {
            G10.g(c1800Ok0, "lastProvider");
            G10.g(bVar, "mod");
            if (bVar instanceof InterfaceC1385Kk0) {
                E90.this.y((InterfaceC1385Kk0) bVar, c1800Ok0, this.C);
            }
            return bVar instanceof InterfaceC1696Nk0 ? E90.this.z((InterfaceC1696Nk0) bVar, c1800Ok0) : c1800Ok0;
        }
    }

    public E90(boolean z) {
        this.B = z;
        this.D = new C8565tm0(new E90[16], 0);
        this.J = g.Idle;
        this.K = new C8565tm0(new C0865Fk0[16], 0);
        this.M = new C8565tm0(new E90[16], 0);
        this.N = true;
        this.O = v0;
        this.P = new J10(this);
        this.Q = AbstractC5544iz.b(1.0f, 0.0f, 2, null);
        this.R = new n();
        this.S = EnumC7560q90.Ltr;
        this.T = x0;
        this.U = new F90(this);
        this.W = Integer.MAX_VALUE;
        this.X = Integer.MAX_VALUE;
        i iVar = i.NotUsed;
        this.Z = iVar;
        this.a0 = iVar;
        this.b0 = iVar;
        NZ nz = new NZ(this);
        this.d0 = nz;
        this.e0 = new C7754qr0(this, nz);
        this.i0 = true;
        C1800Ok0 c1800Ok0 = new C1800Ok0(this, z0);
        this.j0 = c1800Ok0;
        this.k0 = c1800Ok0;
        this.l0 = InterfaceC1073Hk0.m;
        this.t0 = new Comparator() { // from class: com.daaw.D90
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return E90.j((E90) obj, (E90) obj2);
            }
        };
    }

    public static /* synthetic */ String I(E90 e90, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return e90.H(i2);
    }

    public static /* synthetic */ boolean U0(E90 e90, C6079kr c6079kr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c6079kr = e90.e0.x0();
        }
        return e90.T0(c6079kr);
    }

    public static /* synthetic */ void Z0(E90 e90, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        e90.Y0(z);
    }

    public static /* synthetic */ void b1(E90 e90, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        e90.a1(z);
    }

    public static final int j(E90 e90, E90 e902) {
        float f2 = e90.f0;
        float f3 = e902.f0;
        return f2 == f3 ? G10.h(e90.W, e902.W) : Float.compare(f2, f3);
    }

    public static /* synthetic */ void x0(E90 e90, long j2, VV vv, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        e90.w0(j2, vv, z, z2);
    }

    public final void A() {
        if (this.J != g.Measuring) {
            this.U.p(true);
            return;
        }
        this.U.q(true);
        if (this.U.a()) {
            E0();
        }
    }

    public final void A0() {
        K90 k90J0 = j0();
        K90 k90 = this.d0;
        while (!G10.c(k90J0, k90)) {
            C0865Fk0 c0865Fk0 = (C0865Fk0) k90J0;
            InterfaceC1205Ir0 interfaceC1205Ir0V0 = c0865Fk0.V0();
            if (interfaceC1205Ir0V0 != null) {
                interfaceC1205Ir0V0.invalidate();
            }
            k90J0 = c0865Fk0.f1();
        }
        InterfaceC1205Ir0 interfaceC1205Ir0V02 = this.d0.V0();
        if (interfaceC1205Ir0V02 != null) {
            interfaceC1205Ir0V02.invalidate();
        }
    }

    public final void B(InterfaceC1413Kr0 interfaceC1413Kr0) {
        G10.g(interfaceC1413Kr0, "owner");
        if (this.H != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + I(this, 0, 1, null)).toString());
        }
        E90 e90 = this.G;
        if (e90 != null) {
            if (!G10.c(e90 != null ? e90.H : null, interfaceC1413Kr0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attaching to a different owner(");
                sb.append(interfaceC1413Kr0);
                sb.append(") than the parent's owner(");
                E90 e90L0 = l0();
                sb.append(e90L0 != null ? e90L0.H : null);
                sb.append("). This tree: ");
                sb.append(I(this, 0, 1, null));
                sb.append(" Parent tree: ");
                E90 e902 = this.G;
                sb.append(e902 != null ? I(e902, 0, 1, null) : null);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        E90 e90L02 = l0();
        if (e90L02 == null) {
            this.V = true;
        }
        this.H = interfaceC1413Kr0;
        this.I = (e90L02 != null ? e90L02.I : -1) + 1;
        if (AbstractC8740uP0.j(this) != null) {
            interfaceC1413Kr0.l();
        }
        interfaceC1413Kr0.m(this);
        C8565tm0 c8565tm0 = this.D;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i2 = 0;
            do {
                ((E90) objArrQ[i2]).B(interfaceC1413Kr0);
                i2++;
            } while (i2 < iR);
        }
        b1(this, false, 1, null);
        if (e90L02 != null) {
            b1(e90L02, false, 1, null);
        }
        K90 k90F1 = this.d0.f1();
        for (K90 k90J0 = j0(); !G10.c(k90J0, k90F1) && k90J0 != null; k90J0 = k90J0.f1()) {
            k90J0.H0();
        }
        for (C1800Ok0 c1800Ok0L = this.j0; c1800Ok0L != null; c1800Ok0L = c1800Ok0L.l()) {
            c1800Ok0L.a();
        }
        NQ nq = this.m0;
        if (nq != null) {
            nq.invoke(interfaceC1413Kr0);
        }
    }

    public final void B0() {
        E90 e90L0;
        if (this.C > 0) {
            this.F = true;
        }
        if (!this.B || (e90L0 = l0()) == null) {
            return;
        }
        e90L0.F = true;
    }

    public final Map C() {
        if (!this.e0.w0()) {
            A();
        }
        D0();
        return this.U.b();
    }

    public boolean C0() {
        return this.H != null;
    }

    public final void D() {
        this.b0 = this.a0;
        this.a0 = i.NotUsed;
        C8565tm0 c8565tm0R0 = r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i2 = 0;
            do {
                E90 e90 = (E90) objArrQ[i2];
                if (e90.a0 != i.NotUsed) {
                    e90.D();
                }
                i2++;
            } while (i2 < iR);
        }
    }

    public final void D0() {
        this.U.l();
        if (this.s0) {
            L0();
        }
        if (this.s0) {
            this.s0 = false;
            this.J = g.LayingOut;
            I90.a(this).getSnapshotObserver().c(this, new l());
            this.J = g.Idle;
        }
        if (this.U.h()) {
            this.U.o(true);
        }
        if (this.U.a() && this.U.e()) {
            this.U.j();
        }
    }

    public final void E() {
        this.b0 = this.a0;
        this.a0 = i.NotUsed;
        C8565tm0 c8565tm0R0 = r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i2 = 0;
            do {
                E90 e90 = (E90) objArrQ[i2];
                if (e90.a0 == i.InLayoutBlock) {
                    e90.E();
                }
                i2++;
            } while (i2 < iR);
        }
    }

    public final void E0() {
        this.s0 = true;
    }

    public final void F() {
        K90 k90J0 = j0();
        K90 k90 = this.d0;
        while (!G10.c(k90J0, k90)) {
            C0865Fk0 c0865Fk0 = (C0865Fk0) k90J0;
            this.K.d(c0865Fk0);
            k90J0 = c0865Fk0.f1();
        }
    }

    public final void F0() {
        this.r0 = true;
    }

    @Override // com.daaw.InterfaceC0645Dh0
    public AbstractC0584Cu0 G(long j2) {
        if (this.a0 == i.NotUsed) {
            D();
        }
        return this.e0.G(j2);
    }

    public final void G0() {
        this.V = true;
        K90 k90F1 = this.d0.f1();
        for (K90 k90J0 = j0(); !G10.c(k90J0, k90F1) && k90J0 != null; k90J0 = k90J0.f1()) {
            if (k90J0.U0()) {
                k90J0.m1();
            }
        }
        C8565tm0 c8565tm0R0 = r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i2 = 0;
            do {
                E90 e90 = (E90) objArrQ[i2];
                if (e90.W != Integer.MAX_VALUE) {
                    e90.G0();
                    c1(e90);
                }
                i2++;
            } while (i2 < iR);
        }
    }

    public final String H(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        C8565tm0 c8565tm0R0 = r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i4 = 0;
            do {
                sb.append(((E90) objArrQ[i4]).H(i2 + 1));
                i4++;
            } while (i4 < iR);
        }
        String string = sb.toString();
        G10.f(string, "tree.toString()");
        if (i2 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        G10.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final void H0(InterfaceC1073Hk0 interfaceC1073Hk0) {
        C8565tm0 c8565tm0 = this.K;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i2 = 0;
            do {
                ((C0865Fk0) objArrQ[i2]).N1(false);
                i2++;
            } while (i2 < iR);
        }
        interfaceC1073Hk0.x(G91.a, new m());
    }

    public final void I0() {
        if (g()) {
            int i2 = 0;
            this.V = false;
            C8565tm0 c8565tm0R0 = r0();
            int iR = c8565tm0R0.r();
            if (iR > 0) {
                Object[] objArrQ = c8565tm0R0.q();
                do {
                    ((E90) objArrQ[i2]).I0();
                    i2++;
                } while (i2 < iR);
            }
        }
    }

    public final void J() {
        InterfaceC1413Kr0 interfaceC1413Kr0 = this.H;
        if (interfaceC1413Kr0 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            E90 e90L0 = l0();
            sb.append(e90L0 != null ? I(e90L0, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        E90 e90L02 = l0();
        if (e90L02 != null) {
            e90L02.z0();
            b1(e90L02, false, 1, null);
        }
        this.U.m();
        NQ nq = this.n0;
        if (nq != null) {
            nq.invoke(interfaceC1413Kr0);
        }
        for (C1800Ok0 c1800Ok0L = this.j0; c1800Ok0L != null; c1800Ok0L = c1800Ok0L.l()) {
            c1800Ok0L.d();
        }
        K90 k90F1 = this.d0.f1();
        for (K90 k90J0 = j0(); !G10.c(k90J0, k90F1) && k90J0 != null; k90J0 = k90J0.f1()) {
            k90J0.K0();
        }
        if (AbstractC8740uP0.j(this) != null) {
            interfaceC1413Kr0.l();
        }
        interfaceC1413Kr0.b(this);
        this.H = null;
        this.I = 0;
        C8565tm0 c8565tm0 = this.D;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i2 = 0;
            do {
                ((E90) objArrQ[i2]).J();
                i2++;
            } while (i2 < iR);
        }
        this.W = Integer.MAX_VALUE;
        this.X = Integer.MAX_VALUE;
        this.V = false;
    }

    public final void J0(int i2, int i3, int i4) {
        if (i2 == i3) {
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            this.D.a(i2 > i3 ? i3 + i5 : (i3 + i4) - 2, (E90) this.D.z(i2 > i3 ? i2 + i5 : i2));
        }
        P0();
        B0();
        b1(this, false, 1, null);
    }

    public final void K() {
        C8565tm0 c8565tm0;
        int iR;
        if (this.J != g.Idle || this.s0 || this.r0 || !g() || (c8565tm0 = this.o0) == null || (iR = c8565tm0.r()) <= 0) {
            return;
        }
        Object[] objArrQ = c8565tm0.q();
        int i2 = 0;
        do {
            C0576Cs0 c0576Cs0 = (C0576Cs0) objArrQ[i2];
            ((InterfaceC8027rq0) c0576Cs0.d()).r((InterfaceC7002o90) c0576Cs0.c());
            i2++;
        } while (i2 < iR);
    }

    public final void K0() {
        if (this.U.a()) {
            return;
        }
        this.U.n(true);
        E90 e90L0 = l0();
        if (e90L0 == null) {
            return;
        }
        if (this.U.i()) {
            b1(e90L0, false, 1, null);
        } else if (this.U.c()) {
            Z0(e90L0, false, 1, null);
        }
        if (this.U.g()) {
            b1(this, false, 1, null);
        }
        if (this.U.f()) {
            Z0(e90L0, false, 1, null);
        }
        e90L0.K0();
    }

    @Override // com.daaw.E10
    public Object L() {
        return this.e0.L();
    }

    public final void L0() {
        C8565tm0 c8565tm0R0 = r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i2 = 0;
            do {
                E90 e90 = (E90) objArrQ[i2];
                if (e90.r0 && e90.Z == i.InMeasureBlock && U0(e90, null, 1, null)) {
                    b1(this, false, 1, null);
                }
                i2++;
            } while (i2 < iR);
        }
    }

    public final void M(InterfaceC6318lj interfaceC6318lj) {
        G10.g(interfaceC6318lj, "canvas");
        j0().M0(interfaceC6318lj);
    }

    public final void M0(E90 e90) {
        if (this.H != null) {
            e90.J();
        }
        e90.G = null;
        e90.j0().D1(null);
        if (e90.B) {
            this.C--;
            C8565tm0 c8565tm0 = e90.D;
            int iR = c8565tm0.r();
            if (iR > 0) {
                Object[] objArrQ = c8565tm0.q();
                int i2 = 0;
                do {
                    ((E90) objArrQ[i2]).j0().D1(null);
                    i2++;
                } while (i2 < iR);
            }
        }
        B0();
        P0();
    }

    public final F90 N() {
        return this.U;
    }

    public final void N0() {
        b1(this, false, 1, null);
        E90 e90L0 = l0();
        if (e90L0 != null) {
            e90L0.z0();
        }
        A0();
    }

    public final boolean O() {
        return this.c0;
    }

    public final void O0() {
        E90 e90L0 = l0();
        float fH1 = this.d0.h1();
        K90 k90J0 = j0();
        K90 k90 = this.d0;
        while (!G10.c(k90J0, k90)) {
            C0865Fk0 c0865Fk0 = (C0865Fk0) k90J0;
            fH1 += c0865Fk0.h1();
            k90J0 = c0865Fk0.f1();
        }
        if (fH1 != this.f0) {
            this.f0 = fH1;
            if (e90L0 != null) {
                e90L0.P0();
            }
            if (e90L0 != null) {
                e90L0.z0();
            }
        }
        if (!g()) {
            if (e90L0 != null) {
                e90L0.z0();
            }
            G0();
        }
        if (e90L0 == null) {
            this.W = 0;
        } else if (!this.q0 && e90L0.J == g.LayingOut) {
            if (this.W != Integer.MAX_VALUE) {
                throw new IllegalStateException("Place was called on a node which was placed already");
            }
            int i2 = e90L0.Y;
            this.W = i2;
            e90L0.Y = i2 + 1;
        }
        D0();
    }

    public final List P() {
        return r0().j();
    }

    public final void P0() {
        if (!this.B) {
            this.N = true;
            return;
        }
        E90 e90L0 = l0();
        if (e90L0 != null) {
            e90L0.P0();
        }
    }

    public InterfaceC4988gz Q() {
        return this.Q;
    }

    public final void Q0(long j2) {
        g gVar = g.Measuring;
        this.J = gVar;
        this.r0 = false;
        I90.a(this).getSnapshotObserver().d(this, new p(j2));
        if (this.J == gVar) {
            E0();
            this.J = g.Idle;
        }
    }

    public final int R() {
        return this.I;
    }

    public final void R0(int i2, int i3) {
        if (this.a0 == i.NotUsed) {
            E();
        }
        AbstractC0584Cu0.a.C0054a c0054a = AbstractC0584Cu0.a.a;
        int iO0 = this.e0.o0();
        EnumC7560q90 layoutDirection = getLayoutDirection();
        int iH = c0054a.h();
        EnumC7560q90 enumC7560q90G = c0054a.g();
        AbstractC0584Cu0.a.c = iO0;
        AbstractC0584Cu0.a.b = layoutDirection;
        AbstractC0584Cu0.a.n(c0054a, this.e0, i2, i3, 0.0f, 4, null);
        AbstractC0584Cu0.a.c = iH;
        AbstractC0584Cu0.a.b = enumC7560q90G;
    }

    public final List S() {
        return this.D.j();
    }

    public final void S0() {
        if (this.F) {
            int i2 = 0;
            this.F = false;
            C8565tm0 c8565tm0 = this.E;
            if (c8565tm0 == null) {
                c8565tm0 = new C8565tm0(new E90[16], 0);
                this.E = c8565tm0;
            }
            c8565tm0.k();
            C8565tm0 c8565tm02 = this.D;
            int iR = c8565tm02.r();
            if (iR > 0) {
                Object[] objArrQ = c8565tm02.q();
                do {
                    E90 e90 = (E90) objArrQ[i2];
                    if (e90.B) {
                        c8565tm0.e(c8565tm0.r(), e90.r0());
                    } else {
                        c8565tm0.d(e90);
                    }
                    i2++;
                } while (i2 < iR);
            }
        }
    }

    public int T() {
        return this.e0.l0();
    }

    public final boolean T0(C6079kr c6079kr) {
        if (c6079kr == null) {
            return false;
        }
        if (this.a0 == i.NotUsed) {
            D();
        }
        return this.e0.C0(c6079kr.s());
    }

    public final K90 U() {
        if (this.i0) {
            K90 k90G1 = this.d0;
            K90 k90G12 = j0().g1();
            this.h0 = null;
            while (true) {
                if (G10.c(k90G1, k90G12)) {
                    break;
                }
                if ((k90G1 != null ? k90G1.V0() : null) != null) {
                    this.h0 = k90G1;
                    break;
                }
                k90G1 = k90G1 != null ? k90G1.g1() : null;
            }
        }
        K90 k90 = this.h0;
        if (k90 == null || k90.V0() != null) {
            return k90;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final K90 V() {
        return this.d0;
    }

    public final void V0() {
        int iR = this.D.r();
        while (true) {
            iR--;
            if (-1 >= iR) {
                this.D.k();
                return;
            }
            M0((E90) this.D.q()[iR]);
        }
    }

    public final i W() {
        return this.a0;
    }

    public final void W0(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(("count (" + i3 + ") must be greater than 0").toString());
        }
        int i4 = (i3 + i2) - 1;
        if (i2 > i4) {
            return;
        }
        while (true) {
            M0((E90) this.D.z(i4));
            if (i4 == i2) {
                return;
            } else {
                i4--;
            }
        }
    }

    public final boolean X() {
        return this.s0;
    }

    public final void X0() {
        if (this.a0 == i.NotUsed) {
            E();
        }
        try {
            this.q0 = true;
            this.e0.D0();
        } finally {
            this.q0 = false;
        }
    }

    public final g Y() {
        return this.J;
    }

    public final void Y0(boolean z) {
        InterfaceC1413Kr0 interfaceC1413Kr0;
        if (this.B || (interfaceC1413Kr0 = this.H) == null) {
            return;
        }
        interfaceC1413Kr0.j(this, z);
    }

    public final G90 Z() {
        return I90.a(this).getSharedDrawScope();
    }

    @Override // com.daaw.InterfaceC4943gp
    public void a(InterfaceC1073Hk0 interfaceC1073Hk0) {
        E90 e90L0;
        E90 e90L02;
        InterfaceC1413Kr0 interfaceC1413Kr0;
        G10.g(interfaceC1073Hk0, "value");
        if (G10.c(interfaceC1073Hk0, this.l0)) {
            return;
        }
        if (!G10.c(e0(), InterfaceC1073Hk0.m) && this.B) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        this.l0 = interfaceC1073Hk0;
        boolean zL1 = l1();
        F();
        K90 k90F1 = this.d0.f1();
        for (K90 k90J0 = j0(); !G10.c(k90J0, k90F1) && k90J0 != null; k90J0 = k90J0.f1()) {
            XG.j(k90J0.S0());
        }
        H0(interfaceC1073Hk0);
        K90 k90Y0 = this.e0.y0();
        if (AbstractC8740uP0.j(this) != null && C0()) {
            InterfaceC1413Kr0 interfaceC1413Kr02 = this.H;
            G10.d(interfaceC1413Kr02);
            interfaceC1413Kr02.l();
        }
        boolean zT0 = t0();
        C8565tm0 c8565tm0 = this.o0;
        if (c8565tm0 != null) {
            c8565tm0.k();
        }
        this.d0.s1();
        K90 k90 = (K90) e0().f(this.d0, new o());
        i1(interfaceC1073Hk0);
        E90 e90L03 = l0();
        k90.D1(e90L03 != null ? e90L03.d0 : null);
        this.e0.E0(k90);
        if (C0()) {
            C8565tm0 c8565tm02 = this.K;
            int iR = c8565tm02.r();
            if (iR > 0) {
                Object[] objArrQ = c8565tm02.q();
                int i2 = 0;
                do {
                    ((C0865Fk0) objArrQ[i2]).K0();
                    i2++;
                } while (i2 < iR);
            }
            K90 k90F12 = this.d0.f1();
            for (K90 k90J02 = j0(); !G10.c(k90J02, k90F12) && k90J02 != null; k90J02 = k90J02.f1()) {
                if (k90J02.C()) {
                    for (H90 h90D : k90J02.S0()) {
                        for (; h90D != null; h90D = h90D.d()) {
                            h90D.g();
                        }
                    }
                } else {
                    k90J02.H0();
                }
            }
        }
        this.K.k();
        K90 k90F13 = this.d0.f1();
        for (K90 k90J03 = j0(); !G10.c(k90J03, k90F13) && k90J03 != null; k90J03 = k90J03.f1()) {
            k90J03.w1();
        }
        if (!G10.c(k90Y0, this.d0) || !G10.c(k90, this.d0)) {
            b1(this, false, 1, null);
        } else if (this.J == g.Idle && !this.r0 && zT0) {
            b1(this, false, 1, null);
        } else if (XG.m(this.d0.S0(), XG.a.b()) && (interfaceC1413Kr0 = this.H) != null) {
            interfaceC1413Kr0.o(this);
        }
        Object objL = L();
        this.e0.B0();
        if (!G10.c(objL, L()) && (e90L02 = l0()) != null) {
            b1(e90L02, false, 1, null);
        }
        if ((zL1 || l1()) && (e90L0 = l0()) != null) {
            e90L0.z0();
        }
    }

    public final boolean a0() {
        return this.r0;
    }

    public final void a1(boolean z) {
        InterfaceC1413Kr0 interfaceC1413Kr0;
        if (this.L || this.B || (interfaceC1413Kr0 = this.H) == null) {
            return;
        }
        interfaceC1413Kr0.i(this, z);
        this.e0.z0(z);
    }

    @Override // com.daaw.InterfaceC1413Kr0.b
    public void b() {
        for (H90 h90D = this.d0.S0()[XG.a.b()]; h90D != null; h90D = h90D.d()) {
            ((InterfaceC9429wq0) ((GS0) h90D).c()).o(this.d0);
        }
    }

    public InterfaceC0957Gh0 b0() {
        return this.O;
    }

    @Override // com.daaw.InterfaceC4943gp
    public void c(EnumC7560q90 enumC7560q90) {
        G10.g(enumC7560q90, "value");
        if (this.S != enumC7560q90) {
            this.S = enumC7560q90;
            N0();
        }
    }

    public final InterfaceC1269Jh0 c0() {
        return this.R;
    }

    public final void c1(E90 e90) {
        if (j.a[e90.J.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + e90.J);
        }
        if (e90.r0) {
            e90.a1(true);
        } else if (e90.s0) {
            e90.Y0(true);
        }
    }

    @Override // com.daaw.InterfaceC9519x90
    public InterfaceC7002o90 d() {
        return this.d0;
    }

    public final i d0() {
        return this.Z;
    }

    public final void d1() {
        C8565tm0 c8565tm0R0 = r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i2 = 0;
            do {
                E90 e90 = (E90) objArrQ[i2];
                i iVar = e90.b0;
                e90.a0 = iVar;
                if (iVar != i.NotUsed) {
                    e90.d1();
                }
                i2++;
            } while (i2 < iR);
        }
    }

    @Override // com.daaw.InterfaceC4943gp
    public void e(InterfaceC0957Gh0 interfaceC0957Gh0) {
        G10.g(interfaceC0957Gh0, "value");
        if (G10.c(this.O, interfaceC0957Gh0)) {
            return;
        }
        this.O = interfaceC0957Gh0;
        this.P.a(b0());
        b1(this, false, 1, null);
    }

    public InterfaceC1073Hk0 e0() {
        return this.l0;
    }

    public final C0865Fk0 e1(K90 k90, C90 c90) {
        int i2;
        if (this.K.t()) {
            return null;
        }
        C8565tm0 c8565tm0 = this.K;
        int iR = c8565tm0.r();
        int i3 = -1;
        if (iR > 0) {
            i2 = iR - 1;
            Object[] objArrQ = c8565tm0.q();
            do {
                C0865Fk0 c0865Fk0 = (C0865Fk0) objArrQ[i2];
                if (c0865Fk0.L1() && c0865Fk0.K1() == c90) {
                    break;
                }
                i2--;
            } while (i2 >= 0);
            i2 = -1;
        } else {
            i2 = -1;
        }
        if (i2 < 0) {
            C8565tm0 c8565tm02 = this.K;
            int iR2 = c8565tm02.r();
            if (iR2 > 0) {
                int i4 = iR2 - 1;
                Object[] objArrQ2 = c8565tm02.q();
                while (true) {
                    if (!((C0865Fk0) objArrQ2[i4]).L1()) {
                        i3 = i4;
                        break;
                    }
                    i4--;
                    if (i4 < 0) {
                        break;
                    }
                }
            }
            i2 = i3;
        }
        if (i2 < 0) {
            return null;
        }
        C0865Fk0 c0865Fk02 = (C0865Fk0) this.K.z(i2);
        c0865Fk02.M1(c90);
        c0865Fk02.O1(k90);
        return c0865Fk02;
    }

    @Override // com.daaw.InterfaceC4943gp
    public void f(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "value");
        if (G10.c(this.Q, interfaceC4988gz)) {
            return;
        }
        this.Q = interfaceC4988gz;
        N0();
    }

    public final C1800Ok0 f0() {
        return this.j0;
    }

    public final void f1(boolean z) {
        this.c0 = z;
    }

    @Override // com.daaw.InterfaceC9519x90
    public boolean g() {
        return this.V;
    }

    public final C1800Ok0 g0() {
        return this.k0;
    }

    public final void g1(boolean z) {
        this.i0 = z;
    }

    @Override // com.daaw.InterfaceC9519x90
    public EnumC7560q90 getLayoutDirection() {
        return this.S;
    }

    @Override // com.daaw.InterfaceC4943gp
    public void h(InterfaceC2733Xd1 interfaceC2733Xd1) {
        G10.g(interfaceC2733Xd1, "<set-?>");
        this.T = interfaceC2733Xd1;
    }

    public final boolean h0() {
        return this.p0;
    }

    public final void h1(i iVar) {
        G10.g(iVar, "<set-?>");
        this.Z = iVar;
    }

    public final C8565tm0 i0() {
        C8565tm0 c8565tm0 = this.o0;
        if (c8565tm0 != null) {
            return c8565tm0;
        }
        C8565tm0 c8565tm02 = new C8565tm0(new C0576Cs0[16], 0);
        this.o0 = c8565tm02;
        return c8565tm02;
    }

    public final void i1(InterfaceC1073Hk0 interfaceC1073Hk0) {
        int i2 = 0;
        C8565tm0 c8565tm0 = new C8565tm0(new C1489Lk0[16], 0);
        for (C1800Ok0 c1800Ok0L = this.j0; c1800Ok0L != null; c1800Ok0L = c1800Ok0L.l()) {
            c8565tm0.e(c8565tm0.r(), c1800Ok0L.i());
            c1800Ok0L.i().k();
        }
        C1800Ok0 c1800Ok0 = (C1800Ok0) interfaceC1073Hk0.x(this.j0, new q(c8565tm0));
        this.k0 = c1800Ok0;
        this.k0.p(null);
        if (C0()) {
            int iR = c8565tm0.r();
            if (iR > 0) {
                Object[] objArrQ = c8565tm0.q();
                do {
                    ((C1489Lk0) objArrQ[i2]).h();
                    i2++;
                } while (i2 < iR);
            }
            for (C1800Ok0 c1800Ok0L2 = c1800Ok0.l(); c1800Ok0L2 != null; c1800Ok0L2 = c1800Ok0L2.l()) {
                c1800Ok0L2.d();
            }
            for (C1800Ok0 c1800Ok0L3 = this.j0; c1800Ok0L3 != null; c1800Ok0L3 = c1800Ok0L3.l()) {
                c1800Ok0L3.c();
            }
        }
    }

    @Override // com.daaw.InterfaceC1516Lr0
    public boolean isValid() {
        return C0();
    }

    public final K90 j0() {
        return this.e0.y0();
    }

    public final void j1(boolean z) {
        this.p0 = z;
    }

    public final InterfaceC1413Kr0 k0() {
        return this.H;
    }

    public final void k1(J90 j90) {
        this.g0 = j90;
    }

    public final E90 l0() {
        E90 e90 = this.G;
        if (e90 == null || !e90.B) {
            return e90;
        }
        if (e90 != null) {
            return e90.l0();
        }
        return null;
    }

    public final boolean l1() {
        K90 k90F1 = this.d0.f1();
        for (K90 k90J0 = j0(); !G10.c(k90J0, k90F1) && k90J0 != null; k90J0 = k90J0.f1()) {
            if (k90J0.V0() != null) {
                return false;
            }
            if (XG.m(k90J0.S0(), XG.a.a())) {
                return true;
            }
        }
        return true;
    }

    public final int m0() {
        return this.W;
    }

    public final J90 n0() {
        return this.g0;
    }

    public InterfaceC2733Xd1 o0() {
        return this.T;
    }

    public int p0() {
        return this.e0.q0();
    }

    public final C8565tm0 q0() {
        if (this.N) {
            this.M.k();
            C8565tm0 c8565tm0 = this.M;
            c8565tm0.e(c8565tm0.r(), r0());
            this.M.E(this.t0);
            this.N = false;
        }
        return this.M;
    }

    public final C8565tm0 r0() {
        if (this.C == 0) {
            return this.D;
        }
        S0();
        C8565tm0 c8565tm0 = this.E;
        G10.d(c8565tm0);
        return c8565tm0;
    }

    public final void s0(InterfaceC1061Hh0 interfaceC1061Hh0) {
        G10.g(interfaceC1061Hh0, "measureResult");
        this.d0.B1(interfaceC1061Hh0);
    }

    public final boolean t0() {
        return ((Boolean) e0().f(Boolean.FALSE, new k(this.o0))).booleanValue();
    }

    public String toString() {
        return A40.a(this, null) + " children: " + P().size() + " measurePolicy: " + b0();
    }

    public final void u0(long j2, VV vv, boolean z, boolean z2) {
        G10.g(vv, "hitTestResult");
        j0().k1(K90.X.a(), j0().Q0(j2), vv, z, z2);
    }

    public final void w0(long j2, VV vv, boolean z, boolean z2) {
        G10.g(vv, "hitSemanticsEntities");
        j0().k1(K90.X.b(), j0().Q0(j2), vv, true, z2);
    }

    public final void y(InterfaceC1385Kk0 interfaceC1385Kk0, C1800Ok0 c1800Ok0, C8565tm0 c8565tm0) {
        int i2;
        C1489Lk0 c1489Lk0;
        int iR = c8565tm0.r();
        if (iR <= 0) {
            i2 = -1;
            break;
        }
        Object[] objArrQ = c8565tm0.q();
        i2 = 0;
        while (((C1489Lk0) objArrQ[i2]).i() != interfaceC1385Kk0) {
            i2++;
            if (i2 >= iR) {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            c1489Lk0 = new C1489Lk0(c1800Ok0, interfaceC1385Kk0);
        } else {
            c1489Lk0 = (C1489Lk0) c8565tm0.z(i2);
            c1489Lk0.n(c1800Ok0);
        }
        c1800Ok0.i().d(c1489Lk0);
    }

    public final void y0(int i2, E90 e90) {
        C8565tm0 c8565tm0;
        int iR;
        G10.g(e90, "instance");
        int i3 = 0;
        K90 k90 = null;
        if (e90.G != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(e90);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(I(this, 0, 1, null));
            sb.append(" Other tree: ");
            E90 e902 = e90.G;
            sb.append(e902 != null ? I(e902, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (e90.H != null) {
            throw new IllegalStateException(("Cannot insert " + e90 + " because it already has an owner. This tree: " + I(this, 0, 1, null) + " Other tree: " + I(e90, 0, 1, null)).toString());
        }
        e90.G = this;
        this.D.a(i2, e90);
        P0();
        if (e90.B) {
            if (this.B) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent");
            }
            this.C++;
        }
        B0();
        K90 k90J0 = e90.j0();
        if (this.B) {
            E90 e903 = this.G;
            if (e903 != null) {
                k90 = e903.d0;
            }
        } else {
            k90 = this.d0;
        }
        k90J0.D1(k90);
        if (e90.B && (iR = (c8565tm0 = e90.D).r()) > 0) {
            Object[] objArrQ = c8565tm0.q();
            do {
                ((E90) objArrQ[i3]).j0().D1(this.d0);
                i3++;
            } while (i3 < iR);
        }
        InterfaceC1413Kr0 interfaceC1413Kr0 = this.H;
        if (interfaceC1413Kr0 != null) {
            e90.B(interfaceC1413Kr0);
        }
    }

    public final C1800Ok0 z(InterfaceC1696Nk0 interfaceC1696Nk0, C1800Ok0 c1800Ok0) {
        C1800Ok0 c1800Ok0L = c1800Ok0.l();
        while (c1800Ok0L != null && c1800Ok0L.k() != interfaceC1696Nk0) {
            c1800Ok0L = c1800Ok0L.l();
        }
        if (c1800Ok0L == null) {
            c1800Ok0L = new C1800Ok0(this, interfaceC1696Nk0);
        } else {
            C1800Ok0 c1800Ok0M = c1800Ok0L.m();
            if (c1800Ok0M != null) {
                c1800Ok0M.p(c1800Ok0L.l());
            }
            C1800Ok0 c1800Ok0L2 = c1800Ok0L.l();
            if (c1800Ok0L2 != null) {
                c1800Ok0L2.q(c1800Ok0L.m());
            }
        }
        c1800Ok0L.p(c1800Ok0.l());
        C1800Ok0 c1800Ok0L3 = c1800Ok0.l();
        if (c1800Ok0L3 != null) {
            c1800Ok0L3.q(c1800Ok0L);
        }
        c1800Ok0.p(c1800Ok0L);
        c1800Ok0L.q(c1800Ok0);
        return c1800Ok0L;
    }

    public final void z0() {
        K90 k90U = U();
        if (k90U != null) {
            k90U.m1();
            return;
        }
        E90 e90L0 = l0();
        if (e90L0 != null) {
            e90L0.z0();
        }
    }

    public /* synthetic */ E90(boolean z, int i2, AbstractC2911Yw abstractC2911Yw) {
        this((i2 & 1) != 0 ? false : z);
    }
}
