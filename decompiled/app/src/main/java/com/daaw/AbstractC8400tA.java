package com.daaw;

import com.daaw.AbstractC0587Cv;
import com.daaw.Q80;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.tA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8400tA {
    public static final C2352Tm0 a;

    /* JADX INFO: renamed from: com.daaw.tA$a */
    public /* synthetic */ class a extends AbstractC9312wR implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(InterfaceC9918yc1.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC9918yc1 interfaceC9918yc1) {
            G10.g(interfaceC9918yc1, "p0");
            return Boolean.valueOf(interfaceC9918yc1.s0());
        }
    }

    /* JADX INFO: renamed from: com.daaw.tA$b */
    public static final class b extends AbstractC0587Cv.b {
        public final /* synthetic */ C6748nF0 a;
        public final /* synthetic */ NQ b;

        public b(C6748nF0 c6748nF0, NQ nq) {
            this.a = c6748nF0;
            this.b = nq;
        }

        @Override // com.daaw.AbstractC0587Cv.b, com.daaw.AbstractC0587Cv.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC1583Mi interfaceC1583Mi) {
            G10.g(interfaceC1583Mi, "current");
            if (this.a.B == null && ((Boolean) this.b.invoke(interfaceC1583Mi)).booleanValue()) {
                this.a.B = interfaceC1583Mi;
            }
        }

        @Override // com.daaw.AbstractC0587Cv.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1583Mi interfaceC1583Mi) {
            G10.g(interfaceC1583Mi, "current");
            return this.a.B == null;
        }

        @Override // com.daaw.AbstractC0587Cv.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC1583Mi a() {
            return (InterfaceC1583Mi) this.a.B;
        }
    }

    static {
        C2352Tm0 c2352Tm0L = C2352Tm0.l("value");
        G10.f(c2352Tm0L, "identifier(...)");
        a = c2352Tm0L;
    }

    public static final KP0 A(boolean z, InterfaceC1583Mi interfaceC1583Mi) {
        G10.d(interfaceC1583Mi);
        return z(interfaceC1583Mi, z);
    }

    public static final InterfaceC4923gl B(InterfaceC2968Zk0 interfaceC2968Zk0, AP ap, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(interfaceC2968Zk0, "<this>");
        G10.g(ap, "topLevelClassFqName");
        G10.g(interfaceC7689qe0, "location");
        ap.d();
        AP apE = ap.e();
        G10.f(apE, "parent(...)");
        InterfaceC4346ej0 interfaceC4346ej0Q = interfaceC2968Zk0.r0(apE).q();
        C2352Tm0 c2352Tm0G = ap.g();
        G10.f(c2352Tm0G, "shortName(...)");
        InterfaceC10240zl interfaceC10240zlG = interfaceC4346ej0Q.g(c2352Tm0G, interfaceC7689qe0);
        if (interfaceC10240zlG instanceof InterfaceC4923gl) {
            return (InterfaceC4923gl) interfaceC10240zlG;
        }
        return null;
    }

    public static final InterfaceC8612tw a(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "it");
        return interfaceC8612tw.b();
    }

    public static final boolean f(InterfaceC9918yc1 interfaceC9918yc1) {
        G10.g(interfaceC9918yc1, "<this>");
        Boolean boolE = AbstractC0587Cv.e(AbstractC1496Lm.e(interfaceC9918yc1), C7285pA.a, a.B);
        G10.f(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    public static final Iterable g(InterfaceC9918yc1 interfaceC9918yc1) {
        Collection collectionE = interfaceC9918yc1.e();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collectionE, 10));
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC9918yc1) it.next()).a());
        }
        return arrayList;
    }

    public static final InterfaceC1583Mi h(InterfaceC1583Mi interfaceC1583Mi, boolean z, NQ nq) {
        G10.g(interfaceC1583Mi, "<this>");
        G10.g(nq, "predicate");
        return (InterfaceC1583Mi) AbstractC0587Cv.b(AbstractC1496Lm.e(interfaceC1583Mi), new C7842rA(z), new b(new C6748nF0(), nq));
    }

    public static /* synthetic */ InterfaceC1583Mi i(InterfaceC1583Mi interfaceC1583Mi, boolean z, NQ nq, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return h(interfaceC1583Mi, z, nq);
    }

    public static final Iterable j(boolean z, InterfaceC1583Mi interfaceC1583Mi) {
        Collection collectionE;
        if (z) {
            interfaceC1583Mi = interfaceC1583Mi != null ? interfaceC1583Mi.a() : null;
        }
        return (interfaceC1583Mi == null || (collectionE = interfaceC1583Mi.e()) == null) ? AbstractC1599Mm.k() : collectionE;
    }

    public static final AP k(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        BP bpP = p(interfaceC8612tw);
        if (!bpP.f()) {
            bpP = null;
        }
        if (bpP != null) {
            return bpP.l();
        }
        return null;
    }

    public static final InterfaceC4923gl l(O7 o7) {
        G10.g(o7, "<this>");
        InterfaceC10240zl interfaceC10240zlC = o7.getType().N0().c();
        if (interfaceC10240zlC instanceof InterfaceC4923gl) {
            return (InterfaceC4923gl) interfaceC10240zlC;
        }
        return null;
    }

    public static final AbstractC8670u80 m(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        return s(interfaceC8612tw).p();
    }

    public static final C6607ml n(InterfaceC10240zl interfaceC10240zl) {
        InterfaceC8612tw interfaceC8612twB;
        C6607ml c6607mlN;
        if (interfaceC10240zl != null && (interfaceC8612twB = interfaceC10240zl.b()) != null) {
            if (interfaceC8612twB instanceof InterfaceC2372Tr0) {
                AP apD = ((InterfaceC2372Tr0) interfaceC8612twB).d();
                C2352Tm0 name = interfaceC10240zl.getName();
                G10.f(name, "getName(...)");
                return new C6607ml(apD, name);
            }
            if ((interfaceC8612twB instanceof InterfaceC0339Al) && (c6607mlN = n((InterfaceC10240zl) interfaceC8612twB)) != null) {
                C2352Tm0 name2 = interfaceC10240zl.getName();
                G10.f(name2, "getName(...)");
                return c6607mlN.d(name2);
            }
        }
        return null;
    }

    public static final AP o(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        AP apN = AbstractC7006oA.n(interfaceC8612tw);
        G10.f(apN, "getFqNameSafe(...)");
        return apN;
    }

    public static final BP p(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        BP bpM = AbstractC7006oA.m(interfaceC8612tw);
        G10.f(bpM, "getFqName(...)");
        return bpM;
    }

    public static final IZ q(InterfaceC4923gl interfaceC4923gl) {
        AbstractC7958rc1 abstractC7958rc1X0 = interfaceC4923gl != null ? interfaceC4923gl.x0() : null;
        if (abstractC7958rc1X0 instanceof IZ) {
            return (IZ) abstractC7958rc1X0;
        }
        return null;
    }

    public static final Q80 r(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "<this>");
        AbstractC6314li0.a(interfaceC2968Zk0.z0(R80.a()));
        return Q80.a.a;
    }

    public static final InterfaceC2968Zk0 s(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        InterfaceC2968Zk0 interfaceC2968Zk0G = AbstractC7006oA.g(interfaceC8612tw);
        G10.f(interfaceC2968Zk0G, "getContainingModule(...)");
        return interfaceC2968Zk0G;
    }

    public static final C2034Ql0 t(InterfaceC4923gl interfaceC4923gl) {
        AbstractC7958rc1 abstractC7958rc1X0 = interfaceC4923gl != null ? interfaceC4923gl.x0() : null;
        if (abstractC7958rc1X0 instanceof C2034Ql0) {
            return (C2034Ql0) abstractC7958rc1X0;
        }
        return null;
    }

    public static final KP0 u(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        return UP0.m(v(interfaceC8612tw), 1);
    }

    public static final KP0 v(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        return SP0.i(interfaceC8612tw, C7564qA.B);
    }

    public static final InterfaceC1583Mi w(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "<this>");
        if (!(interfaceC1583Mi instanceof InterfaceC3640cA0)) {
            return interfaceC1583Mi;
        }
        InterfaceC4476fA0 interfaceC4476fA0A0 = ((InterfaceC3640cA0) interfaceC1583Mi).A0();
        G10.f(interfaceC4476fA0A0, "getCorrespondingProperty(...)");
        return interfaceC4476fA0A0;
    }

    public static final InterfaceC4923gl x(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "<this>");
        for (I80 i80 : interfaceC4923gl.s().N0().b()) {
            if (!AbstractC8670u80.b0(i80)) {
                InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
                if (AbstractC7006oA.w(interfaceC10240zlC)) {
                    G10.e(interfaceC10240zlC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC4923gl) interfaceC10240zlC;
                }
            }
        }
        return null;
    }

    public static final boolean y(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "<this>");
        AbstractC6314li0.a(interfaceC2968Zk0.z0(R80.a()));
        return false;
    }

    public static final KP0 z(InterfaceC1583Mi interfaceC1583Mi, boolean z) {
        G10.g(interfaceC1583Mi, "<this>");
        if (z) {
            interfaceC1583Mi = interfaceC1583Mi.a();
        }
        KP0 kp0J = SP0.j(interfaceC1583Mi);
        Collection collectionE = interfaceC1583Mi.e();
        G10.f(collectionE, "getOverriddenDescriptors(...)");
        return UP0.v(kp0J, UP0.r(AbstractC2455Um.V(collectionE), new C8121sA(z)));
    }
}
