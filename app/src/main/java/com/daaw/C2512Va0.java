package com.daaw;

import com.daaw.AbstractC0587Cv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Va0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2512Va0 extends AbstractC2616Wa0 {
    public final C20 n;
    public final F20 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2512Va0(C0504Ca0 c0504Ca0, C20 c20, F20 f20) {
        super(c0504Ca0);
        G10.g(c0504Ca0, "c");
        G10.g(c20, "jClass");
        G10.g(f20, "ownerDescriptor");
        this.n = c20;
        this.o = f20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(InterfaceC3327b30 interfaceC3327b30) {
        G10.g(interfaceC3327b30, "it");
        return interfaceC3327b30.g();
    }

    public static final Collection n0(C2352Tm0 c2352Tm0, InterfaceC4346ej0 interfaceC4346ej0) {
        G10.g(c2352Tm0, "$name");
        G10.g(interfaceC4346ej0, "it");
        return interfaceC4346ej0.a(c2352Tm0, EnumC5496io0.P);
    }

    public static final Collection o0(InterfaceC4346ej0 interfaceC4346ej0) {
        G10.g(interfaceC4346ej0, "it");
        return interfaceC4346ej0.d();
    }

    public static final Iterable q0(InterfaceC4923gl interfaceC4923gl) {
        Collection collectionB = interfaceC4923gl.k().b();
        G10.f(collectionB, "getSupertypes(...)");
        return UP0.k(UP0.u(AbstractC2455Um.V(collectionB), C2408Ua0.B));
    }

    public static final InterfaceC4923gl r0(I80 i80) {
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC instanceof InterfaceC4923gl) {
            return (InterfaceC4923gl) interfaceC10240zlC;
        }
        return null;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public void B(Collection collection, C2352Tm0 c2352Tm0) {
        G10.g(collection, "result");
        G10.g(c2352Tm0, "name");
        Collection collectionE = AbstractC6169lA.e(c2352Tm0, u0(c2352Tm0, R()), collection, R(), L().a().c(), L().a().k().a());
        G10.f(collectionE, "resolveOverridesForStaticMembers(...)");
        collection.addAll(collectionE);
        if (this.n.A()) {
            if (G10.c(c2352Tm0, YV0.f)) {
                IS0 is0G = AbstractC1444Kz.g(R());
                G10.f(is0G, "createEnumValueOfMethod(...)");
                collection.add(is0G);
            } else if (G10.c(c2352Tm0, YV0.d)) {
                IS0 is0H = AbstractC1444Kz.h(R());
                G10.f(is0H, "createEnumValuesMethod(...)");
                collection.add(is0H);
            }
        }
    }

    @Override // com.daaw.AbstractC2616Wa0, com.daaw.AbstractC1864Pa0
    public void C(C2352Tm0 c2352Tm0, Collection collection) {
        C2352Tm0 c2352Tm02;
        Collection collection2;
        G10.g(c2352Tm0, "name");
        G10.g(collection, "result");
        Set setP0 = p0(R(), new LinkedHashSet(), new C2198Sa0(c2352Tm0));
        if (collection.isEmpty()) {
            c2352Tm02 = c2352Tm0;
            collection2 = collection;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setP0) {
                InterfaceC4476fA0 interfaceC4476fA0T0 = t0((InterfaceC4476fA0) obj);
                Object arrayList = linkedHashMap.get(interfaceC4476fA0T0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(interfaceC4476fA0T0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionE = AbstractC6169lA.e(c2352Tm02, (Collection) ((Map.Entry) it.next()).getValue(), collection2, R(), L().a().c(), L().a().k().a());
                G10.f(collectionE, "resolveOverridesForStaticMembers(...)");
                AbstractC2141Rm.A(arrayList2, collectionE);
            }
            collection2.addAll(arrayList2);
        } else {
            c2352Tm02 = c2352Tm0;
            collection2 = collection;
            Collection collectionE2 = AbstractC6169lA.e(c2352Tm02, setP0, collection2, R(), L().a().c(), L().a().k().a());
            G10.f(collectionE2, "resolveOverridesForStaticMembers(...)");
            collection2.addAll(collectionE2);
        }
        if (this.n.A() && G10.c(c2352Tm02, YV0.e)) {
            AbstractC1392Km.a(collection2, AbstractC1444Kz.f(R()));
        }
    }

    @Override // com.daaw.AbstractC1864Pa0
    public Set D(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        Set setP0 = AbstractC2455Um.P0(((InterfaceC0487Bw) N().invoke()).e());
        p0(R(), setP0, C2094Ra0.B);
        if (this.n.A()) {
            setP0.add(YV0.e);
        }
        return setP0;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return null;
    }

    @Override // com.daaw.AbstractC1864Pa0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C4644fl z() {
        return new C4644fl(this.n, C1968Qa0.B);
    }

    public final Set p0(InterfaceC4923gl interfaceC4923gl, Set set, NQ nq) {
        AbstractC0587Cv.b(AbstractC1496Lm.e(interfaceC4923gl), C2304Ta0.a, new a(interfaceC4923gl, set, nq));
        return set;
    }

    @Override // com.daaw.AbstractC1864Pa0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public F20 R() {
        return this.o;
    }

    public final InterfaceC4476fA0 t0(InterfaceC4476fA0 interfaceC4476fA0) {
        if (interfaceC4476fA0.i().a()) {
            return interfaceC4476fA0;
        }
        Collection collectionE = interfaceC4476fA0.e();
        G10.f(collectionE, "getOverriddenDescriptors(...)");
        Collection<InterfaceC4476fA0> collection = collectionE;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collection, 10));
        for (InterfaceC4476fA0 interfaceC4476fA02 : collection) {
            G10.d(interfaceC4476fA02);
            arrayList.add(t0(interfaceC4476fA02));
        }
        return (InterfaceC4476fA0) AbstractC2455Um.C0(AbstractC2455Um.X(arrayList));
    }

    public final Set u0(C2352Tm0 c2352Tm0, InterfaceC4923gl interfaceC4923gl) {
        C2512Va0 c2512Va0B = AbstractC8790ub1.b(interfaceC4923gl);
        return c2512Va0B == null ? AbstractC9867yQ0.d() : AbstractC2455Um.Q0(c2512Va0B.c(c2352Tm0, EnumC5496io0.P));
    }

    @Override // com.daaw.AbstractC1864Pa0
    public Set v(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.AbstractC1864Pa0
    public Set x(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        Set setP0 = AbstractC2455Um.P0(((InterfaceC0487Bw) N().invoke()).a());
        C2512Va0 c2512Va0B = AbstractC8790ub1.b(R());
        Set setB = c2512Va0B != null ? c2512Va0B.b() : null;
        if (setB == null) {
            setB = AbstractC9867yQ0.d();
        }
        setP0.addAll(setB);
        if (this.n.A()) {
            setP0.addAll(AbstractC1599Mm.n(YV0.f, YV0.d));
        }
        setP0.addAll(L().a().w().h(R(), L()));
        return setP0;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public void y(Collection collection, C2352Tm0 c2352Tm0) {
        G10.g(collection, "result");
        G10.g(c2352Tm0, "name");
        L().a().w().c(R(), c2352Tm0, collection, L());
    }

    /* JADX INFO: renamed from: com.daaw.Va0$a */
    public static final class a extends AbstractC0587Cv.b {
        public final /* synthetic */ InterfaceC4923gl a;
        public final /* synthetic */ Set b;
        public final /* synthetic */ NQ c;

        public a(InterfaceC4923gl interfaceC4923gl, Set set, NQ nq) {
            this.a = interfaceC4923gl;
            this.b = set;
            this.c = nq;
        }

        @Override // com.daaw.AbstractC0587Cv.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return G91.a;
        }

        @Override // com.daaw.AbstractC0587Cv.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC4923gl interfaceC4923gl) {
            G10.g(interfaceC4923gl, "current");
            if (interfaceC4923gl == this.a) {
                return true;
            }
            InterfaceC4346ej0 interfaceC4346ej0O = interfaceC4923gl.O();
            G10.f(interfaceC4346ej0O, "getStaticScope(...)");
            if (!(interfaceC4346ej0O instanceof AbstractC2616Wa0)) {
                return true;
            }
            this.b.addAll((Collection) this.c.invoke(interfaceC4346ej0O));
            return false;
        }

        public void e() {
        }
    }
}
