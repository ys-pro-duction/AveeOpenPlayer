package com.daaw;

import com.daaw.C4566fU0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.hU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5124hU0 {
    public static final NQ a = b.B;
    public static final BU0 b = new BU0();
    public static final Object c = new Object();
    public static C4566fU0 d;
    public static int e;
    public static final C4277eU0 f;
    public static final List g;
    public static final List h;
    public static final AtomicReference i;
    public static final AbstractC3720cU0 j;

    /* JADX INFO: renamed from: com.daaw.hU0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        public final void a(C4566fU0 c4566fU0) {
            G10.g(c4566fU0, "it");
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4566fU0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.hU0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        public final void a(C4566fU0 c4566fU0) {
            G10.g(c4566fU0, "it");
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4566fU0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.hU0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;
        public final /* synthetic */ NQ C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NQ nq, NQ nq2) {
            super(1);
            this.B = nq;
            this.C = nq2;
        }

        public final void a(Object obj) {
            G10.g(obj, "state");
            this.B.invoke(obj);
            this.C.invoke(obj);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.hU0$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;
        public final /* synthetic */ NQ C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NQ nq, NQ nq2) {
            super(1);
            this.B = nq;
            this.C = nq2;
        }

        public final void a(Object obj) {
            G10.g(obj, "state");
            this.B.invoke(obj);
            this.C.invoke(obj);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.hU0$e */
    public static final class e extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(NQ nq) {
            super(1);
            this.B = nq;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC3720cU0 invoke(C4566fU0 c4566fU0) {
            G10.g(c4566fU0, "invalid");
            AbstractC3720cU0 abstractC3720cU0 = (AbstractC3720cU0) this.B.invoke(c4566fU0);
            synchronized (AbstractC5124hU0.C()) {
                AbstractC5124hU0.d = AbstractC5124hU0.d.G(abstractC3720cU0.f());
                G91 g91 = G91.a;
            }
            return abstractC3720cU0;
        }
    }

    static {
        C4566fU0.a aVar = C4566fU0.F;
        d = aVar.a();
        e = 1;
        f = new C4277eU0();
        g = new ArrayList();
        h = new ArrayList();
        int i2 = e;
        e = i2 + 1;
        C7082oT c7082oT = new C7082oT(i2, aVar.a());
        d = d.G(c7082oT.f());
        AtomicReference atomicReference = new AtomicReference(c7082oT);
        i = atomicReference;
        Object obj = atomicReference.get();
        G10.f(obj, "currentGlobalSnapshot.get()");
        j = (AbstractC3720cU0) obj;
    }

    public static final AW0 A(AW0 aw0, AbstractC3720cU0 abstractC3720cU0) {
        G10.g(aw0, "r");
        G10.g(abstractC3720cU0, "snapshot");
        AW0 aw0N = N(aw0, abstractC3720cU0.f(), abstractC3720cU0.g());
        if (aw0N != null) {
            return aw0N;
        }
        M();
        throw new D80();
    }

    public static final AbstractC3720cU0 B() {
        AbstractC3720cU0 abstractC3720cU0 = (AbstractC3720cU0) b.a();
        if (abstractC3720cU0 != null) {
            return abstractC3720cU0;
        }
        Object obj = i.get();
        G10.f(obj, "currentGlobalSnapshot.get()");
        return (AbstractC3720cU0) obj;
    }

    public static final Object C() {
        return c;
    }

    public static final AbstractC3720cU0 D() {
        return j;
    }

    public static final NQ E(NQ nq, NQ nq2, boolean z) {
        if (!z) {
            nq2 = null;
        }
        return (nq == null || nq2 == null || G10.c(nq, nq2)) ? nq == null ? nq2 : nq : new c(nq, nq2);
    }

    public static /* synthetic */ NQ F(NQ nq, NQ nq2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return E(nq, nq2, z);
    }

    public static final NQ G(NQ nq, NQ nq2) {
        return (nq == null || nq2 == null || G10.c(nq, nq2)) ? nq == null ? nq2 : nq : new d(nq, nq2);
    }

    public static final AW0 H(AW0 aw0, InterfaceC10170zW0 interfaceC10170zW0) {
        G10.g(aw0, "<this>");
        G10.g(interfaceC10170zW0, "state");
        AW0 aw0V = V(interfaceC10170zW0);
        if (aw0V != null) {
            aw0V.f(Integer.MAX_VALUE);
            return aw0V;
        }
        AW0 aw0B = aw0.b();
        aw0B.f(Integer.MAX_VALUE);
        aw0B.e(interfaceC10170zW0.e());
        interfaceC10170zW0.p(aw0B);
        return aw0B;
    }

    public static final AW0 I(AW0 aw0, InterfaceC10170zW0 interfaceC10170zW0, AbstractC3720cU0 abstractC3720cU0) {
        G10.g(aw0, "<this>");
        G10.g(interfaceC10170zW0, "state");
        G10.g(abstractC3720cU0, "snapshot");
        AW0 aw0H = H(aw0, interfaceC10170zW0);
        aw0H.a(aw0);
        aw0H.f(abstractC3720cU0.f());
        return aw0H;
    }

    public static final void J(AbstractC3720cU0 abstractC3720cU0, InterfaceC10170zW0 interfaceC10170zW0) {
        G10.g(abstractC3720cU0, "snapshot");
        G10.g(interfaceC10170zW0, "state");
        NQ nqJ = abstractC3720cU0.j();
        if (nqJ != null) {
            nqJ.invoke(interfaceC10170zW0);
        }
    }

    public static final Map K(C7729qm0 c7729qm0, C7729qm0 c7729qm02, C4566fU0 c4566fU0) {
        AW0 aw0N;
        Set<InterfaceC10170zW0> setC = c7729qm02.C();
        int iF = c7729qm0.f();
        if (setC == null) {
            return null;
        }
        C4566fU0 c4566fU0F = c7729qm02.g().G(c7729qm02.f()).F(c7729qm02.D());
        HashMap map = null;
        for (InterfaceC10170zW0 interfaceC10170zW0 : setC) {
            AW0 aw0E = interfaceC10170zW0.e();
            AW0 aw0N2 = N(aw0E, iF, c4566fU0);
            if (aw0N2 != null && (aw0N = N(aw0E, iF, c4566fU0F)) != null && !G10.c(aw0N2, aw0N)) {
                AW0 aw0N3 = N(aw0E, c7729qm02.f(), c7729qm02.g());
                if (aw0N3 == null) {
                    M();
                    throw new D80();
                }
                AW0 aw0M = interfaceC10170zW0.m(aw0N, aw0N2, aw0N3);
                if (aw0M == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(aw0N2, aw0M);
                map = map;
            }
        }
        return map;
    }

    public static final AW0 L(AW0 aw0, InterfaceC10170zW0 interfaceC10170zW0, AbstractC3720cU0 abstractC3720cU0, AW0 aw02) {
        G10.g(aw0, "<this>");
        G10.g(interfaceC10170zW0, "state");
        G10.g(abstractC3720cU0, "snapshot");
        G10.g(aw02, "candidate");
        if (abstractC3720cU0.i()) {
            abstractC3720cU0.o(interfaceC10170zW0);
        }
        int iF = abstractC3720cU0.f();
        if (aw02.d() == iF) {
            return aw02;
        }
        AW0 aw0H = H(aw0, interfaceC10170zW0);
        aw0H.f(iF);
        abstractC3720cU0.o(interfaceC10170zW0);
        return aw0H;
    }

    public static final Void M() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final AW0 N(AW0 aw0, int i2, C4566fU0 c4566fU0) {
        AW0 aw02 = null;
        while (aw0 != null) {
            if (X(aw0, i2, c4566fU0) && (aw02 == null || aw02.d() < aw0.d())) {
                aw02 = aw0;
            }
            aw0 = aw0.c();
        }
        if (aw02 != null) {
            return aw02;
        }
        return null;
    }

    public static final AW0 O(AW0 aw0, InterfaceC10170zW0 interfaceC10170zW0) {
        G10.g(aw0, "<this>");
        G10.g(interfaceC10170zW0, "state");
        return P(aw0, interfaceC10170zW0, B());
    }

    public static final AW0 P(AW0 aw0, InterfaceC10170zW0 interfaceC10170zW0, AbstractC3720cU0 abstractC3720cU0) {
        G10.g(aw0, "<this>");
        G10.g(interfaceC10170zW0, "state");
        G10.g(abstractC3720cU0, "snapshot");
        NQ nqH = abstractC3720cU0.h();
        if (nqH != null) {
            nqH.invoke(interfaceC10170zW0);
        }
        AW0 aw0N = N(aw0, abstractC3720cU0.f(), abstractC3720cU0.g());
        if (aw0N != null) {
            return aw0N;
        }
        M();
        throw new D80();
    }

    public static final void Q(int i2) {
        f.f(i2);
    }

    public static final Void R() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final Object S(AbstractC3720cU0 abstractC3720cU0, NQ nq) {
        Object objInvoke = nq.invoke(d.y(abstractC3720cU0.f()));
        synchronized (C()) {
            int i2 = e;
            e = i2 + 1;
            d = d.y(abstractC3720cU0.f());
            i.set(new C7082oT(i2, d));
            abstractC3720cU0.d();
            d = d.G(i2);
            G91 g91 = G91.a;
        }
        return objInvoke;
    }

    public static final AbstractC3720cU0 T(NQ nq) {
        return (AbstractC3720cU0) w(new e(nq));
    }

    public static final int U(int i2, C4566fU0 c4566fU0) {
        int iA;
        G10.g(c4566fU0, "invalid");
        int iE = c4566fU0.E(i2);
        synchronized (C()) {
            iA = f.a(iE);
        }
        return iA;
    }

    public static final AW0 V(InterfaceC10170zW0 interfaceC10170zW0) {
        int iE = f.e(e) - 1;
        C4566fU0 c4566fU0A = C4566fU0.F.a();
        AW0 aw0 = null;
        for (AW0 aw0E = interfaceC10170zW0.e(); aw0E != null; aw0E = aw0E.c()) {
            if (aw0E.d() != 0) {
                if (X(aw0E, iE, c4566fU0A)) {
                    if (aw0 == null) {
                        aw0 = aw0E;
                    } else if (aw0E.d() >= aw0.d()) {
                        return aw0;
                    }
                }
            }
            return aw0E;
        }
        return null;
    }

    public static final boolean W(int i2, int i3, C4566fU0 c4566fU0) {
        return (i3 == 0 || i3 > i2 || c4566fU0.D(i3)) ? false : true;
    }

    public static final boolean X(AW0 aw0, int i2, C4566fU0 c4566fU0) {
        return W(i2, aw0.d(), c4566fU0);
    }

    public static final void Y(AbstractC3720cU0 abstractC3720cU0) {
        if (!d.D(abstractC3720cU0.f())) {
            throw new IllegalStateException("Snapshot is not open");
        }
    }

    public static final AW0 Z(AW0 aw0, InterfaceC10170zW0 interfaceC10170zW0, AbstractC3720cU0 abstractC3720cU0) {
        G10.g(aw0, "<this>");
        G10.g(interfaceC10170zW0, "state");
        G10.g(abstractC3720cU0, "snapshot");
        if (abstractC3720cU0.i()) {
            abstractC3720cU0.o(interfaceC10170zW0);
        }
        AW0 aw0N = N(aw0, abstractC3720cU0.f(), abstractC3720cU0.g());
        if (aw0N == null) {
            M();
            throw new D80();
        }
        if (aw0N.d() == abstractC3720cU0.f()) {
            return aw0N;
        }
        AW0 aw0I = I(aw0N, interfaceC10170zW0, abstractC3720cU0);
        abstractC3720cU0.o(interfaceC10170zW0);
        return aw0I;
    }

    public static final C4566fU0 v(C4566fU0 c4566fU0, int i2, int i3) {
        G10.g(c4566fU0, "<this>");
        while (i2 < i3) {
            c4566fU0 = c4566fU0.G(i2);
            i2++;
        }
        return c4566fU0;
    }

    public static final Object w(NQ nq) {
        Object objS;
        List listO0;
        C7082oT c7082oT = (C7082oT) i.get();
        synchronized (C()) {
            G10.f(c7082oT, "previousGlobalSnapshot");
            objS = S(c7082oT, nq);
        }
        Set setC = c7082oT.C();
        if (setC != null) {
            synchronized (C()) {
                listO0 = AbstractC2455Um.O0(g);
            }
            int size = listO0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC3429bR) listO0.get(i2)).invoke(setC, c7082oT);
            }
        }
        return objS;
    }

    public static final void x() {
        w(a.B);
    }

    public static final AbstractC3720cU0 y(AbstractC3720cU0 abstractC3720cU0, NQ nq) {
        boolean z = abstractC3720cU0 instanceof C7729qm0;
        if (z || abstractC3720cU0 == null) {
            return new D51(z ? (C7729qm0) abstractC3720cU0 : null, nq, null, false);
        }
        return new E51(abstractC3720cU0, nq, false);
    }

    public static /* synthetic */ AbstractC3720cU0 z(AbstractC3720cU0 abstractC3720cU0, NQ nq, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            nq = null;
        }
        return y(abstractC3720cU0, nq);
    }
}
