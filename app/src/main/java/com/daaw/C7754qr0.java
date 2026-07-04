package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.E90;

/* JADX INFO: renamed from: com.daaw.qr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7754qr0 extends AbstractC0584Cu0 implements InterfaceC0645Dh0 {
    public final E90 F;
    public K90 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public long K;
    public NQ L;
    public float M;
    public Object N;

    /* JADX INFO: renamed from: com.daaw.qr0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[E90.g.values().length];
            iArr[E90.g.Measuring.ordinal()] = 1;
            iArr[E90.g.LayingOut.ordinal()] = 2;
            a = iArr;
            int[] iArr2 = new int[E90.i.values().length];
            iArr2[E90.i.InMeasureBlock.ordinal()] = 1;
            iArr2[E90.i.InLayoutBlock.ordinal()] = 2;
            b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.qr0$b */
    public static final class b extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ long C;
        public final /* synthetic */ float D;
        public final /* synthetic */ NQ E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, float f, NQ nq) {
            super(0);
            this.C = j;
            this.D = f;
            this.E = nq;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m62invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m62invoke() {
            C7754qr0.this.A0(this.C, this.D, this.E);
        }
    }

    public C7754qr0(E90 e90, K90 k90) {
        G10.g(e90, "layoutNode");
        G10.g(k90, "outerWrapper");
        this.F = e90;
        this.G = k90;
        this.K = D00.b.a();
    }

    public final void A0(long j, float f, NQ nq) {
        AbstractC0584Cu0.a.C0054a c0054a = AbstractC0584Cu0.a.a;
        if (nq == null) {
            c0054a.k(this.G, j, f);
        } else {
            c0054a.s(this.G, j, f, nq);
        }
    }

    public final void B0() {
        this.N = this.G.L();
    }

    public final boolean C0(long j) {
        InterfaceC1413Kr0 interfaceC1413Kr0A = I90.a(this.F);
        E90 e90L0 = this.F.l0();
        E90 e90 = this.F;
        boolean z = true;
        e90.f1(e90.O() || (e90L0 != null && e90L0.O()));
        if (!this.F.a0() && C6079kr.g(p0(), j)) {
            interfaceC1413Kr0A.g(this.F);
            this.F.d1();
            return false;
        }
        this.F.N().q(false);
        C8565tm0 c8565tm0R0 = this.F.r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i = 0;
            do {
                ((E90) objArrQ[i]).N().s(false);
                i++;
            } while (i < iR);
        }
        this.H = true;
        long jD = this.G.d();
        u0(j);
        this.F.Q0(j);
        if (I00.e(this.G.d(), jD) && this.G.q0() == q0() && this.G.l0() == l0()) {
            z = false;
        }
        t0(J00.a(this.G.q0(), this.G.l0()));
        return z;
    }

    public final void D0() {
        if (!this.I) {
            throw new IllegalStateException("Check failed.");
        }
        r0(this.K, this.M, this.L);
    }

    public final void E0(K90 k90) {
        G10.g(k90, "<set-?>");
        this.G = k90;
    }

    @Override // com.daaw.InterfaceC0645Dh0
    public AbstractC0584Cu0 G(long j) {
        E90.i iVar;
        E90 e90L0 = this.F.l0();
        if (e90L0 == null) {
            this.F.h1(E90.i.NotUsed);
        } else {
            if (this.F.d0() != E90.i.NotUsed && !this.F.O()) {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.F.d0() + ". Parent state " + e90L0.Y() + '.').toString());
            }
            E90 e90 = this.F;
            int i = a.a[e90L0.Y().ordinal()];
            if (i == 1) {
                iVar = E90.i.InMeasureBlock;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is " + e90L0.Y());
                }
                iVar = E90.i.InLayoutBlock;
            }
            e90.h1(iVar);
        }
        C0(j);
        return this;
    }

    @Override // com.daaw.E10
    public Object L() {
        return this.N;
    }

    @Override // com.daaw.AbstractC0584Cu0
    public int o0() {
        return this.G.o0();
    }

    @Override // com.daaw.InterfaceC1373Kh0
    public int r(I3 i3) {
        G10.g(i3, "alignmentLine");
        E90 e90L0 = this.F.l0();
        if ((e90L0 != null ? e90L0.Y() : null) == E90.g.Measuring) {
            this.F.N().s(true);
        } else {
            E90 e90L02 = this.F.l0();
            if ((e90L02 != null ? e90L02.Y() : null) == E90.g.LayingOut) {
                this.F.N().r(true);
            }
        }
        this.J = true;
        int iR = this.G.r(i3);
        this.J = false;
        return iR;
    }

    @Override // com.daaw.AbstractC0584Cu0
    public void r0(long j, float f, NQ nq) {
        this.K = j;
        this.M = f;
        this.L = nq;
        K90 k90G1 = this.G.g1();
        if (k90G1 != null && k90G1.p1()) {
            A0(j, f, nq);
            return;
        }
        this.I = true;
        this.F.N().p(false);
        I90.a(this.F).getSnapshotObserver().b(this.F, new b(j, f, nq));
    }

    public final boolean w0() {
        return this.J;
    }

    public final C6079kr x0() {
        if (this.H) {
            return C6079kr.b(p0());
        }
        return null;
    }

    public final K90 y0() {
        return this.G;
    }

    public final void z0(boolean z) {
        E90 e90L0;
        E90 e90L02 = this.F.l0();
        E90.i iVarW = this.F.W();
        if (e90L02 == null || iVarW == E90.i.NotUsed) {
            return;
        }
        while (e90L02.W() == iVarW && (e90L0 = e90L02.l0()) != null) {
            e90L02 = e90L0;
        }
        int i = a.b[iVarW.ordinal()];
        if (i == 1) {
            e90L02.a1(z);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            e90L02.Y0(z);
        }
    }
}
