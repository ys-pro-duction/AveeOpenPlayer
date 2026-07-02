package com.daaw;

import com.daaw.C2559Vm;

/* JADX INFO: loaded from: classes.dex */
public abstract class YU0 {
    public static final long a = T21.d(14);
    public static final long b = T21.d(0);
    public static final long c;
    public static final long d;

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y11 invoke() {
            return Y11.a.a(YU0.d);
        }
    }

    static {
        C2559Vm.a aVar = C2559Vm.b;
        c = aVar.f();
        d = aVar.a();
    }

    public static final XU0 b(XU0 xu0) {
        G10.g(xu0, "style");
        Y11 y11C = xu0.r().c(a.B);
        long jI = T21.e(xu0.i()) ? a : xu0.i();
        SO soL = xu0.l();
        if (soL == null) {
            soL = SO.C.d();
        }
        SO so = soL;
        PO poJ = xu0.j();
        PO poC = PO.c(poJ != null ? poJ.i() : PO.b.b());
        QO qoK = xu0.k();
        QO qoB = QO.b(qoK != null ? qoK.j() : QO.b.a());
        AbstractC7898rO abstractC7898rOG = xu0.g();
        if (abstractC7898rOG == null) {
            abstractC7898rOG = AbstractC7898rO.C.a();
        }
        AbstractC7898rO abstractC7898rO = abstractC7898rOG;
        String strH = xu0.h();
        if (strH == null) {
            strH = "";
        }
        String str = strH;
        long jM = T21.e(xu0.m()) ? b : xu0.m();
        C1671Ne c1671NeD = xu0.d();
        C1671Ne c1671NeB = C1671Ne.b(c1671NeD != null ? c1671NeD.h() : C1671Ne.b.a());
        C4437f21 c4437f21S = xu0.s();
        if (c4437f21S == null) {
            c4437f21S = C4437f21.c.a();
        }
        C4437f21 c4437f21 = c4437f21S;
        C4884gd0 c4884gd0N = xu0.n();
        if (c4884gd0N == null) {
            c4884gd0N = C4884gd0.D.a();
        }
        C4884gd0 c4884gd0 = c4884gd0N;
        long jC = xu0.c();
        if (jC == C2559Vm.b.g()) {
            jC = c;
        }
        long j = jC;
        P11 p11Q = xu0.q();
        if (p11Q == null) {
            p11Q = P11.b.b();
        }
        P11 p11 = p11Q;
        C4265eR0 c4265eR0P = xu0.p();
        if (c4265eR0P == null) {
            c4265eR0P = C4265eR0.d.a();
        }
        xu0.o();
        return new XU0(y11C, jI, so, poC, qoB, abstractC7898rO, str, jM, c1671NeB, c4437f21, c4884gd0, j, p11, c4265eR0P, (AbstractC4973gv0) null, (AbstractC2911Yw) null);
    }
}
