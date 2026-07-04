package com.daaw;

import com.daaw.AbstractC1864Pa0;
import com.daaw.AbstractC6533mV0;
import com.daaw.C0789Er0;
import com.daaw.H20;
import com.daaw.InterfaceC8468tR;
import com.daaw.InterfaceC9596xS0;
import com.daaw.VT0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.sa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8226sa0 extends AbstractC1864Pa0 {
    public final InterfaceC4923gl n;
    public final C20 o;
    public final boolean p;
    public final InterfaceC0881Fo0 q;
    public final InterfaceC0881Fo0 r;
    public final InterfaceC0881Fo0 s;
    public final InterfaceC0881Fo0 t;
    public final InterfaceC5752jj0 u;

    /* JADX INFO: renamed from: com.daaw.sa0$a */
    public /* synthetic */ class a extends AbstractC9312wR implements NQ {
        public a(Object obj) {
            super(1, obj);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(C8226sa0.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "p0");
            return ((C8226sa0) this.receiver).q1(c2352Tm0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sa0$b */
    public /* synthetic */ class b extends AbstractC9312wR implements NQ {
        public b(Object obj) {
            super(1, obj);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(C8226sa0.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "p0");
            return ((C8226sa0) this.receiver).r1(c2352Tm0);
        }
    }

    public /* synthetic */ C8226sa0(C0504Ca0 c0504Ca0, InterfaceC4923gl interfaceC4923gl, C20 c20, boolean z, C8226sa0 c8226sa0, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c0504Ca0, interfaceC4923gl, c20, z, (i & 16) != 0 ? null : c8226sa0);
    }

    public static final Collection A0(C8226sa0 c8226sa0, C2352Tm0 c2352Tm0) {
        G10.g(c8226sa0, "this$0");
        G10.g(c2352Tm0, "it");
        return c8226sa0.q1(c2352Tm0);
    }

    public static final Collection B0(C8226sa0 c8226sa0, C2352Tm0 c2352Tm0) {
        G10.g(c8226sa0, "this$0");
        G10.g(c2352Tm0, "it");
        return c8226sa0.r1(c2352Tm0);
    }

    public static final List D0(C8226sa0 c8226sa0, C0504Ca0 c0504Ca0) {
        G10.g(c8226sa0, "this$0");
        G10.g(c0504Ca0, "$c");
        Collection collectionM = c8226sa0.o.m();
        ArrayList arrayList = new ArrayList(collectionM.size());
        Iterator it = collectionM.iterator();
        while (it.hasNext()) {
            arrayList.add(c8226sa0.o1((M20) it.next()));
        }
        if (c8226sa0.o.s()) {
            InterfaceC3241al interfaceC3241alG0 = c8226sa0.G0();
            String strC = AbstractC7440pk0.c(interfaceC3241alG0, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(interfaceC3241alG0);
                c0504Ca0.a().h().a(c8226sa0.o, interfaceC3241alG0);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (G10.c(AbstractC7440pk0.c((InterfaceC3241al) it2.next(), false, false, 2, null), strC)) {
                        break;
                    }
                }
                arrayList.add(interfaceC3241alG0);
                c0504Ca0.a().h().a(c8226sa0.o, interfaceC3241alG0);
            }
        }
        c0504Ca0.a().w().a(c8226sa0.R(), arrayList, c0504Ca0);
        C8752uS0 c8752uS0R = c0504Ca0.a().r();
        boolean zIsEmpty = arrayList.isEmpty();
        List listO = arrayList;
        if (zIsEmpty) {
            listO = AbstractC1599Mm.o(c8226sa0.F0());
        }
        return AbstractC2455Um.M0(c8752uS0R.p(c0504Ca0, listO));
    }

    public static /* synthetic */ C6135l30 L0(C8226sa0 c8226sa0, InterfaceC3605c30 interfaceC3605c30, I80 i80, EnumC0336Ak0 enumC0336Ak0, int i, Object obj) {
        if ((i & 2) != 0) {
            i80 = null;
        }
        return c8226sa0.K0(interfaceC3605c30, i80, enumC0336Ak0);
    }

    public static final Map U0(C8226sa0 c8226sa0) {
        G10.g(c8226sa0, "this$0");
        Collection collectionC = c8226sa0.o.C();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionC) {
            if (((V20) obj).G()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((V20) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    public static final Set Y0(C0504Ca0 c0504Ca0, C8226sa0 c8226sa0) {
        G10.g(c0504Ca0, "$c");
        G10.g(c8226sa0, "this$0");
        return AbstractC2455Um.Q0(c0504Ca0.a().w().e(c8226sa0.R(), c0504Ca0));
    }

    public static final Collection g1(IS0 is0, C8226sa0 c8226sa0, C2352Tm0 c2352Tm0) {
        G10.g(is0, "$function");
        G10.g(c8226sa0, "this$0");
        G10.g(c2352Tm0, "accessorName");
        return G10.c(is0.getName(), c2352Tm0) ? AbstractC1496Lm.e(is0) : AbstractC2455Um.z0(c8226sa0.q1(c2352Tm0), c8226sa0.r1(c2352Tm0));
    }

    public static final Set h1(C8226sa0 c8226sa0) {
        G10.g(c8226sa0, "this$0");
        return AbstractC2455Um.Q0(c8226sa0.o.L());
    }

    public static final InterfaceC4923gl i1(C8226sa0 c8226sa0, C0504Ca0 c0504Ca0, C2352Tm0 c2352Tm0) {
        G10.g(c8226sa0, "this$0");
        G10.g(c0504Ca0, "$c");
        G10.g(c2352Tm0, "name");
        if (((Set) c8226sa0.r.invoke()).contains(c2352Tm0)) {
            H20 h20D = c0504Ca0.a().d();
            C6607ml c6607mlN = AbstractC8400tA.n(c8226sa0.R());
            G10.d(c6607mlN);
            C20 c20C = h20D.c(new H20.a(c6607mlN.d(c2352Tm0), null, c8226sa0.o, 2, null));
            if (c20C == null) {
                return null;
            }
            C4869ga0 c4869ga0 = new C4869ga0(c0504Ca0, c8226sa0.R(), c20C, null, 8, null);
            c0504Ca0.a().e().a(c4869ga0);
            return c4869ga0;
        }
        if (!((Set) c8226sa0.s.invoke()).contains(c2352Tm0)) {
            V20 v20 = (V20) ((Map) c8226sa0.t.invoke()).get(c2352Tm0);
            if (v20 == null) {
                return null;
            }
            return C3667cH.L0(c0504Ca0.e(), c8226sa0.R(), c2352Tm0, c0504Ca0.e().h(new C7947ra0(c8226sa0)), AbstractC3744ca0.a(c0504Ca0, v20), c0504Ca0.a().t().a(v20));
        }
        List listC = AbstractC1496Lm.c();
        c0504Ca0.a().w().d(c8226sa0.R(), c2352Tm0, listC, c0504Ca0);
        List listA = AbstractC1496Lm.a(listC);
        int size = listA.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (InterfaceC4923gl) AbstractC2455Um.C0(listA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
    }

    public static final Set j1(C8226sa0 c8226sa0) {
        G10.g(c8226sa0, "this$0");
        return AbstractC10146zQ0.j(c8226sa0.b(), c8226sa0.d());
    }

    public static final boolean z0(InterfaceC3327b30 interfaceC3327b30) {
        G10.g(interfaceC3327b30, "it");
        return !interfaceC3327b30.g();
    }

    @Override // com.daaw.AbstractC1864Pa0
    public void B(Collection collection, C2352Tm0 c2352Tm0) {
        G10.g(collection, "result");
        G10.g(c2352Tm0, "name");
        Set setB1 = b1(c2352Tm0);
        if (!AbstractC6533mV0.a.k(c2352Tm0) && !C1579Mh.o.n(c2352Tm0)) {
            Set set = setB1;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC8468tR) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (f1((IS0) obj)) {
                    arrayList.add(obj);
                }
            }
            t0(collection, c2352Tm0, arrayList, false);
            return;
        }
        VT0 vt0A = VT0.D.a();
        Collection collectionD = AbstractC6169lA.d(c2352Tm0, setB1, AbstractC1599Mm.k(), R(), InterfaceC8993vH.a, L().a().k().a());
        G10.f(collectionD, "resolveOverridesForNonStaticMembers(...)");
        u0(c2352Tm0, collection, collectionD, collection, new a(this));
        u0(c2352Tm0, collection, collectionD, vt0A, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setB1) {
            if (f1((IS0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        t0(collection, c2352Tm0, AbstractC2455Um.z0(arrayList2, vt0A), true);
    }

    @Override // com.daaw.AbstractC1864Pa0
    public void C(C2352Tm0 c2352Tm0, Collection collection) {
        G10.g(c2352Tm0, "name");
        G10.g(collection, "result");
        if (this.o.q()) {
            w0(c2352Tm0, collection);
        }
        Set setD1 = d1(c2352Tm0);
        if (setD1.isEmpty()) {
            return;
        }
        VT0.b bVar = VT0.D;
        VT0 vt0A = bVar.a();
        VT0 vt0A2 = bVar.a();
        v0(setD1, collection, vt0A, new C7390pa0(this));
        v0(AbstractC10146zQ0.h(setD1, vt0A), vt0A2, null, new C7669qa0(this));
        Collection collectionD = AbstractC6169lA.d(c2352Tm0, AbstractC10146zQ0.j(setD1, vt0A2), collection, R(), L().a().c(), L().a().k().a());
        G10.f(collectionD, "resolveOverridesForNonStaticMembers(...)");
        collection.addAll(collectionD);
    }

    public final Collection C0() {
        if (!this.p) {
            return L().a().k().c().g(R());
        }
        Collection collectionB = R().k().b();
        G10.f(collectionB, "getSupertypes(...)");
        return collectionB;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public Set D(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        if (this.o.q()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC0487Bw) N().invoke()).e());
        Collection collectionB = R().k().b();
        G10.f(collectionB, "getSupertypes(...)");
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(linkedHashSet, ((I80) it.next()).q().d());
        }
        return linkedHashSet;
    }

    public final List E0(C3520bl c3520bl) {
        C3520bl c3520bl2;
        C0576Cs0 c0576Cs0;
        Collection collectionN = this.o.N();
        ArrayList arrayList = new ArrayList(collectionN.size());
        B30 b30B = C30.b(C81.C, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionN) {
            if (G10.c(((InterfaceC3605c30) obj).getName(), B40.c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        C0576Cs0 c0576Cs02 = new C0576Cs0(arrayList2, arrayList3);
        List list = (List) c0576Cs02.a();
        List<InterfaceC3605c30> list2 = (List) c0576Cs02.b();
        list.size();
        InterfaceC3605c30 interfaceC3605c30 = (InterfaceC3605c30) AbstractC2455Um.g0(list);
        if (interfaceC3605c30 != null) {
            InterfaceC10047z30 returnType = interfaceC3605c30.getReturnType();
            if (returnType instanceof A20) {
                A20 a20 = (A20) returnType;
                c0576Cs0 = new C0576Cs0(L().g().l(a20, b30B, true), L().g().p(a20.o(), b30B));
            } else {
                c0576Cs0 = new C0576Cs0(L().g().p(returnType, b30B), null);
            }
            I80 i80 = (I80) c0576Cs0.a();
            I80 i802 = (I80) c0576Cs0.b();
            c3520bl2 = c3520bl;
            s0(arrayList, c3520bl2, 0, interfaceC3605c30, i80, i802);
        } else {
            c3520bl2 = c3520bl;
        }
        int i = 0;
        int i2 = interfaceC3605c30 == null ? 0 : 1;
        for (InterfaceC3605c30 interfaceC3605c302 : list2) {
            s0(arrayList, c3520bl2, i + i2, interfaceC3605c302, L().g().p(interfaceC3605c302.getReturnType(), b30B), null);
            i++;
        }
        return arrayList;
    }

    public final InterfaceC3241al F0() {
        boolean zQ = this.o.q();
        if ((this.o.H() || !this.o.t()) && !zQ) {
            return null;
        }
        InterfaceC4923gl interfaceC4923glR = R();
        D20 d20T1 = D20.t1(interfaceC4923glR, InterfaceC3072a8.b.b(), true, L().a().t().a(this.o));
        G10.f(d20T1, "createJavaConstructor(...)");
        List listE0 = zQ ? E0(d20T1) : Collections.EMPTY_LIST;
        d20T1.Z0(false);
        d20T1.q1(listE0, Z0(interfaceC4923glR));
        d20T1.Y0(true);
        d20T1.g1(interfaceC4923glR.s());
        L().a().h().a(this.o, d20T1);
        return d20T1;
    }

    public final InterfaceC3241al G0() {
        InterfaceC4923gl interfaceC4923glR = R();
        D20 d20T1 = D20.t1(interfaceC4923glR, InterfaceC3072a8.b.b(), true, L().a().t().a(this.o));
        G10.f(d20T1, "createJavaConstructor(...)");
        List listM0 = M0(d20T1);
        d20T1.Z0(false);
        d20T1.q1(listM0, Z0(interfaceC4923glR));
        d20T1.Y0(false);
        d20T1.g1(interfaceC4923glR.s());
        return d20T1;
    }

    public final IS0 H0(IS0 is0, InterfaceC1376Ki interfaceC1376Ki, Collection collection) {
        Collection<IS0> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return is0;
        }
        for (IS0 is02 : collection2) {
            if (!G10.c(is0, is02) && is02.b0() == null && Q0(is02, interfaceC1376Ki)) {
                InterfaceC8468tR interfaceC8468tRA = is0.t().q().a();
                G10.d(interfaceC8468tRA);
                return (IS0) interfaceC8468tRA;
            }
        }
        return is0;
    }

    public final IS0 I0(InterfaceC8468tR interfaceC8468tR, NQ nq) {
        Object next;
        C2352Tm0 name = interfaceC8468tR.getName();
        G10.f(name, "getName(...)");
        Iterator it = ((Iterable) nq.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e1((IS0) next, interfaceC8468tR)) {
                break;
            }
        }
        IS0 is0 = (IS0) next;
        if (is0 == null) {
            return null;
        }
        InterfaceC8468tR.a aVarT = is0.t();
        List listH = interfaceC8468tR.h();
        G10.f(listH, "getValueParameters(...)");
        List list = listH;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC9918yc1) it2.next()).getType());
        }
        List listH2 = is0.h();
        G10.f(listH2, "getValueParameters(...)");
        aVarT.c(AbstractC8790ub1.a(arrayList, listH2, interfaceC8468tR));
        aVarT.u();
        aVarT.h();
        aVarT.s(C3884d30.i0, Boolean.TRUE);
        return (IS0) aVarT.a();
    }

    public final C6135l30 J0(InterfaceC4476fA0 interfaceC4476fA0, NQ nq) {
        IS0 is0X0;
        C7843rA0 c7843rA0M = null;
        if (!P0(interfaceC4476fA0, nq)) {
            return null;
        }
        IS0 is0W0 = W0(interfaceC4476fA0, nq);
        G10.d(is0W0);
        if (interfaceC4476fA0.f0()) {
            is0X0 = X0(interfaceC4476fA0, nq);
            G10.d(is0X0);
        } else {
            is0X0 = null;
        }
        if (is0X0 != null) {
            is0X0.l();
            is0W0.l();
        }
        X20 x20 = new X20(R(), is0W0, is0X0, interfaceC4476fA0);
        I80 returnType = is0W0.getReturnType();
        G10.d(returnType);
        x20.b1(returnType, AbstractC1599Mm.k(), O(), null, AbstractC1599Mm.k());
        C5323iA0 c5323iA0K = AbstractC1444Kz.k(x20, is0W0.getAnnotations(), false, false, false, is0W0.j());
        c5323iA0K.M0(is0W0);
        c5323iA0K.P0(x20.getType());
        G10.f(c5323iA0K, "apply(...)");
        if (is0X0 != null) {
            List listH = is0X0.h();
            G10.f(listH, "getValueParameters(...)");
            InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) AbstractC2455Um.g0(listH);
            if (interfaceC9918yc1 == null) {
                throw new AssertionError("No parameter found for " + is0X0);
            }
            c7843rA0M = AbstractC1444Kz.m(x20, is0X0.getAnnotations(), interfaceC9918yc1.getAnnotations(), false, false, false, is0X0.getVisibility(), is0X0.j());
            c7843rA0M.M0(is0X0);
        }
        x20.U0(c5323iA0K, c7843rA0M);
        return x20;
    }

    public final C6135l30 K0(InterfaceC3605c30 interfaceC3605c30, I80 i80, EnumC0336Ak0 enumC0336Ak0) {
        C6135l30 c6135l30;
        C8226sa0 c8226sa0;
        I80 i80A;
        C6135l30 c6135l30F1 = C6135l30.f1(R(), AbstractC3744ca0.a(L(), interfaceC3605c30), enumC0336Ak0, AbstractC1142Ib1.d(interfaceC3605c30.getVisibility()), false, interfaceC3605c30.getName(), L().a().t().a(interfaceC3605c30), false);
        G10.f(c6135l30F1, "create(...)");
        C5323iA0 c5323iA0D = AbstractC1444Kz.d(c6135l30F1, InterfaceC3072a8.b.b());
        G10.f(c5323iA0D, "createDefaultGetter(...)");
        c6135l30F1.U0(c5323iA0D, null);
        if (i80 == null) {
            C0504Ca0 c0504Ca0I = AbstractC10275zs.i(L(), c6135l30F1, interfaceC3605c30, 0, 4, null);
            c6135l30 = c6135l30F1;
            c8226sa0 = this;
            i80A = c8226sa0.A(interfaceC3605c30, c0504Ca0I);
        } else {
            c6135l30 = c6135l30F1;
            c8226sa0 = this;
            i80A = i80;
        }
        c6135l30.b1(i80A, AbstractC1599Mm.k(), c8226sa0.O(), null, AbstractC1599Mm.k());
        c5323iA0D.P0(i80A);
        return c6135l30;
    }

    public final List M0(C3520bl c3520bl) {
        Collection<InterfaceC6693n30> collectionL = this.o.l();
        ArrayList arrayList = new ArrayList(collectionL.size());
        B30 b30B = C30.b(C81.C, false, false, null, 6, null);
        int i = 0;
        for (InterfaceC6693n30 interfaceC6693n30 : collectionL) {
            int i2 = i + 1;
            I80 i80P = L().g().p(interfaceC6693n30.getType(), b30B);
            arrayList.add(new C10197zc1(c3520bl, null, i, InterfaceC3072a8.b.b(), interfaceC6693n30.getName(), i80P, false, false, false, interfaceC6693n30.a() ? L().a().m().p().k(i80P) : null, L().a().t().a(interfaceC6693n30)));
            i = i2;
        }
        return arrayList;
    }

    public final IS0 N0(IS0 is0, C2352Tm0 c2352Tm0) {
        InterfaceC8468tR.a aVarT = is0.t();
        aVarT.i(c2352Tm0);
        aVarT.u();
        aVarT.h();
        InterfaceC8468tR interfaceC8468tRA = aVarT.a();
        G10.d(interfaceC8468tRA);
        return (IS0) interfaceC8468tRA;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public RE0 O() {
        return AbstractC7006oA.l(R());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.IS0 O0(com.daaw.IS0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.h()
            java.lang.String r1 = "getValueParameters(...)"
            com.daaw.G10.f(r0, r1)
            java.lang.Object r0 = com.daaw.AbstractC2455Um.r0(r0)
            com.daaw.yc1 r0 = (com.daaw.InterfaceC9918yc1) r0
            r2 = 0
            if (r0 == 0) goto L7d
            com.daaw.I80 r3 = r0.getType()
            com.daaw.C71 r3 = r3.N0()
            com.daaw.zl r3 = r3.c()
            if (r3 == 0) goto L35
            com.daaw.BP r3 = com.daaw.AbstractC8400tA.p(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            com.daaw.AP r3 = r3.l()
            goto L36
        L35:
            r3 = r2
        L36:
            com.daaw.AP r4 = com.daaw.YV0.v
            boolean r3 = com.daaw.G10.c(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7d
        L43:
            com.daaw.tR$a r2 = r6.t()
            java.util.List r6 = r6.h()
            com.daaw.G10.f(r6, r1)
            r1 = 1
            java.util.List r6 = com.daaw.AbstractC2455Um.Z(r6, r1)
            com.daaw.tR$a r6 = r2.c(r6)
            com.daaw.I80 r0 = r0.getType()
            java.util.List r0 = r0.L0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.daaw.m81 r0 = (com.daaw.InterfaceC6440m81) r0
            com.daaw.I80 r0 = r0.getType()
            com.daaw.tR$a r6 = r6.l(r0)
            com.daaw.tR r6 = r6.a()
            com.daaw.IS0 r6 = (com.daaw.IS0) r6
            r0 = r6
            com.daaw.JS0 r0 = (com.daaw.JS0) r0
            if (r0 == 0) goto L7c
            r0.h1(r1)
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8226sa0.O0(com.daaw.IS0):com.daaw.IS0");
    }

    public final boolean P0(InterfaceC4476fA0 interfaceC4476fA0, NQ nq) {
        if (R20.a(interfaceC4476fA0)) {
            return false;
        }
        IS0 is0W0 = W0(interfaceC4476fA0, nq);
        IS0 is0X0 = X0(interfaceC4476fA0, nq);
        if (is0W0 == null) {
            return false;
        }
        if (interfaceC4476fA0.f0()) {
            return is0X0 != null && is0X0.l() == is0W0.l();
        }
        return true;
    }

    public final boolean Q0(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2) {
        C0789Er0.i.a aVarC = C0789Er0.f.F(interfaceC1376Ki2, interfaceC1376Ki, true).c();
        G10.f(aVarC, "getResult(...)");
        return aVarC == C0789Er0.i.a.OVERRIDABLE && !Y20.a.a(interfaceC1376Ki2, interfaceC1376Ki);
    }

    public final boolean R0(IS0 is0) {
        AbstractC6533mV0.a aVar = AbstractC6533mV0.a;
        C2352Tm0 name = is0.getName();
        G10.f(name, "getName(...)");
        C2352Tm0 c2352Tm0B = aVar.b(name);
        if (c2352Tm0B == null) {
            return false;
        }
        Set setB1 = b1(c2352Tm0B);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            if (AbstractC4849gV0.d((IS0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        IS0 is0N0 = N0(is0, c2352Tm0B);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (S0((IS0) it.next(), is0N0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean S0(IS0 is0, InterfaceC8468tR interfaceC8468tR) {
        if (C1268Jh.o.m(is0)) {
            interfaceC8468tR = interfaceC8468tR.a();
        }
        G10.d(interfaceC8468tR);
        return Q0(interfaceC8468tR, is0);
    }

    public final boolean T0(IS0 is0) {
        IS0 is0O0 = O0(is0);
        if (is0O0 == null) {
            return false;
        }
        C2352Tm0 name = is0.getName();
        G10.f(name, "getName(...)");
        Set<IS0> setB1 = b1(name);
        if ((setB1 instanceof Collection) && setB1.isEmpty()) {
            return false;
        }
        for (IS0 is02 : setB1) {
            if (is02.isSuspend() && Q0(is0O0, is02)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public boolean V(C3884d30 c3884d30) {
        G10.g(c3884d30, "<this>");
        if (this.o.q()) {
            return false;
        }
        return f1(c3884d30);
    }

    public final IS0 V0(InterfaceC4476fA0 interfaceC4476fA0, String str, NQ nq) {
        IS0 is0;
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        Iterator it = ((Iterable) nq.invoke(c2352Tm0L)).iterator();
        do {
            is0 = null;
            if (!it.hasNext()) {
                break;
            }
            IS0 is02 = (IS0) it.next();
            if (is02.h().size() == 0) {
                J80 j80 = J80.a;
                I80 returnType = is02.getReturnType();
                if (returnType == null ? false : j80.b(returnType, interfaceC4476fA0.getType())) {
                    is0 = is02;
                }
            }
        } while (is0 == null);
        return is0;
    }

    public final IS0 W0(InterfaceC4476fA0 interfaceC4476fA0, NQ nq) {
        InterfaceC5044hA0 interfaceC5044hA0F = interfaceC4476fA0.f();
        InterfaceC5044hA0 interfaceC5044hA0 = interfaceC5044hA0F != null ? (InterfaceC5044hA0) AbstractC4849gV0.g(interfaceC5044hA0F) : null;
        String strB = interfaceC5044hA0 != null ? C8838ul.a.b(interfaceC5044hA0) : null;
        if (strB != null && !AbstractC4849gV0.l(R(), interfaceC5044hA0)) {
            return V0(interfaceC4476fA0, strB, nq);
        }
        String strC = interfaceC4476fA0.getName().c();
        G10.f(strC, "asString(...)");
        return V0(interfaceC4476fA0, C10052z40.b(strC), nq);
    }

    public final IS0 X0(InterfaceC4476fA0 interfaceC4476fA0, NQ nq) {
        IS0 is0;
        I80 returnType;
        String strC = interfaceC4476fA0.getName().c();
        G10.f(strC, "asString(...)");
        C2352Tm0 c2352Tm0L = C2352Tm0.l(C10052z40.e(strC));
        G10.f(c2352Tm0L, "identifier(...)");
        Iterator it = ((Iterable) nq.invoke(c2352Tm0L)).iterator();
        do {
            is0 = null;
            if (!it.hasNext()) {
                break;
            }
            IS0 is02 = (IS0) it.next();
            if (is02.h().size() == 1 && (returnType = is02.getReturnType()) != null && AbstractC8670u80.C0(returnType)) {
                J80 j80 = J80.a;
                List listH = is02.h();
                G10.f(listH, "getValueParameters(...)");
                if (j80.d(((InterfaceC9918yc1) AbstractC2455Um.C0(listH)).getType(), interfaceC4476fA0.getType())) {
                    is0 = is02;
                }
            }
        } while (is0 == null);
        return is0;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public AbstractC1864Pa0.a Y(InterfaceC3605c30 interfaceC3605c30, List list, I80 i80, List list2) {
        G10.g(interfaceC3605c30, "method");
        G10.g(list, "methodTypeParameters");
        G10.g(i80, "returnType");
        G10.g(list2, "valueParameters");
        InterfaceC9596xS0.b bVarB = L().a().s().b(interfaceC3605c30, R(), i80, null, list2, list);
        G10.f(bVarB, "resolvePropagatedSignature(...)");
        I80 i80D = bVarB.d();
        G10.f(i80D, "getReturnType(...)");
        I80 i80C = bVarB.c();
        List listF = bVarB.f();
        G10.f(listF, "getValueParameters(...)");
        List listE = bVarB.e();
        G10.f(listE, "getTypeParameters(...)");
        boolean zG = bVarB.g();
        List listB = bVarB.b();
        G10.f(listB, "getErrors(...)");
        return new AbstractC1864Pa0.a(i80D, i80C, listF, listE, zG, listB);
    }

    public final AbstractC8965vA Z0(InterfaceC4923gl interfaceC4923gl) {
        AbstractC8965vA visibility = interfaceC4923gl.getVisibility();
        G10.f(visibility, "getVisibility(...)");
        if (!G10.c(visibility, S20.b)) {
            return visibility;
        }
        AbstractC8965vA abstractC8965vA = S20.c;
        G10.f(abstractC8965vA, "PROTECTED_AND_PACKAGE");
        return abstractC8965vA;
    }

    @Override // com.daaw.AbstractC1864Pa0, com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        n1(c2352Tm0, interfaceC7689qe0);
        return super.a(c2352Tm0, interfaceC7689qe0);
    }

    public final InterfaceC0881Fo0 a1() {
        return this.q;
    }

    public final Set b1(C2352Tm0 c2352Tm0) {
        Collection collectionC0 = C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(linkedHashSet, ((I80) it.next()).q().c(c2352Tm0, EnumC5496io0.P));
        }
        return linkedHashSet;
    }

    @Override // com.daaw.AbstractC1864Pa0, com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        n1(c2352Tm0, interfaceC7689qe0);
        return super.c(c2352Tm0, interfaceC7689qe0);
    }

    @Override // com.daaw.AbstractC1864Pa0
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public InterfaceC4923gl R() {
        return this.n;
    }

    public final Set d1(C2352Tm0 c2352Tm0) {
        Collection collectionC0 = C0();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            Collection collectionA = ((I80) it.next()).q().a(c2352Tm0, EnumC5496io0.P);
            ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(collectionA, 10));
            Iterator it2 = collectionA.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC4476fA0) it2.next());
            }
            AbstractC2141Rm.A(arrayList, arrayList2);
        }
        return AbstractC2455Um.Q0(arrayList);
    }

    public final boolean e1(IS0 is0, InterfaceC8468tR interfaceC8468tR) {
        String strC = AbstractC7440pk0.c(is0, false, false, 2, null);
        InterfaceC8468tR interfaceC8468tRA = interfaceC8468tR.a();
        G10.f(interfaceC8468tRA, "getOriginal(...)");
        return G10.c(strC, AbstractC7440pk0.c(interfaceC8468tRA, false, false, 2, null)) && !Q0(is0, interfaceC8468tR);
    }

    public final boolean f1(IS0 is0) {
        C2352Tm0 name = is0.getName();
        G10.f(name, "getName(...)");
        List listA = AbstractC3362bA0.a(name);
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                Set<InterfaceC4476fA0> setD1 = d1((C2352Tm0) it.next());
                if (!(setD1 instanceof Collection) || !setD1.isEmpty()) {
                    for (InterfaceC4476fA0 interfaceC4476fA0 : setD1) {
                        if (P0(interfaceC4476fA0, new C7111oa0(is0, this))) {
                            if (!interfaceC4476fA0.f0()) {
                                String strC = is0.getName().c();
                                G10.f(strC, "asString(...)");
                                if (!C10052z40.d(strC)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (R0(is0) || s1(is0) || T0(is0)) ? false : true;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        InterfaceC5752jj0 interfaceC5752jj0;
        InterfaceC4923gl interfaceC4923gl;
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        n1(c2352Tm0, interfaceC7689qe0);
        C8226sa0 c8226sa0 = (C8226sa0) Q();
        return (c8226sa0 == null || (interfaceC5752jj0 = c8226sa0.u) == null || (interfaceC4923gl = (InterfaceC4923gl) interfaceC5752jj0.invoke(c2352Tm0)) == null) ? (InterfaceC10240zl) this.u.invoke(c2352Tm0) : interfaceC4923gl;
    }

    public final IS0 k1(IS0 is0, NQ nq, Collection collection) {
        IS0 is0I0;
        InterfaceC8468tR interfaceC8468tRL = C1579Mh.l(is0);
        if (interfaceC8468tRL != null && (is0I0 = I0(interfaceC8468tRL, nq)) != null) {
            if (!f1(is0I0)) {
                is0I0 = null;
            }
            if (is0I0 != null) {
                return H0(is0I0, interfaceC8468tRL, collection);
            }
        }
        return null;
    }

    public final IS0 l1(IS0 is0, NQ nq, C2352Tm0 c2352Tm0, Collection collection) {
        IS0 is02 = (IS0) AbstractC4849gV0.g(is0);
        if (is02 == null) {
            return null;
        }
        String strE = AbstractC4849gV0.e(is02);
        G10.d(strE);
        C2352Tm0 c2352Tm0L = C2352Tm0.l(strE);
        G10.f(c2352Tm0L, "identifier(...)");
        Iterator it = ((Collection) nq.invoke(c2352Tm0L)).iterator();
        while (it.hasNext()) {
            IS0 is0N0 = N0((IS0) it.next(), c2352Tm0);
            if (S0(is02, is0N0)) {
                return H0(is0N0, is02, collection);
            }
        }
        return null;
    }

    public final IS0 m1(IS0 is0, NQ nq) {
        if (!is0.isSuspend()) {
            return null;
        }
        C2352Tm0 name = is0.getName();
        G10.f(name, "getName(...)");
        Iterator it = ((Iterable) nq.invoke(name)).iterator();
        while (it.hasNext()) {
            IS0 is0O0 = O0((IS0) it.next());
            if (is0O0 == null || !Q0(is0O0, is0)) {
                is0O0 = null;
            }
            if (is0O0 != null) {
                return is0O0;
            }
        }
        return null;
    }

    public void n1(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        AbstractC1038Hb1.a(L().a().l(), interfaceC7689qe0, R(), c2352Tm0);
    }

    public final D20 o1(M20 m20) {
        InterfaceC4923gl interfaceC4923glR = R();
        D20 d20T1 = D20.t1(interfaceC4923glR, AbstractC3744ca0.a(L(), m20), false, L().a().t().a(m20));
        G10.f(d20T1, "createJavaConstructor(...)");
        C0504Ca0 c0504Ca0H = AbstractC10275zs.h(L(), d20T1, m20, interfaceC4923glR.v().size());
        AbstractC1864Pa0.b bVarD0 = d0(c0504Ca0H, d20T1, m20.h());
        List listV = interfaceC4923glR.v();
        G10.f(listV, "getDeclaredTypeParameters(...)");
        List list = listV;
        List typeParameters = m20.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            Z71 z71A = c0504Ca0H.f().a((G30) it.next());
            G10.d(z71A);
            arrayList.add(z71A);
        }
        d20T1.r1(bVarD0.a(), AbstractC1142Ib1.d(m20.getVisibility()), AbstractC2455Um.z0(list, arrayList));
        d20T1.Y0(false);
        d20T1.Z0(bVarD0.b());
        d20T1.g1(interfaceC4923glR.s());
        c0504Ca0H.a().h().a(m20, d20T1);
        return d20T1;
    }

    public final C3884d30 p1(InterfaceC6693n30 interfaceC6693n30) {
        C3884d30 c3884d30P1 = C3884d30.p1(R(), AbstractC3744ca0.a(L(), interfaceC6693n30), interfaceC6693n30.getName(), L().a().t().a(interfaceC6693n30), true);
        G10.f(c3884d30P1, "createJavaMethod(...)");
        c3884d30P1.o1(null, O(), AbstractC1599Mm.k(), AbstractC1599Mm.k(), AbstractC1599Mm.k(), L().g().p(interfaceC6693n30.getType(), C30.b(C81.C, false, false, null, 6, null)), EnumC0336Ak0.B.a(false, false, true), AbstractC8679uA.e, null);
        c3884d30P1.s1(false, false);
        L().a().h().e(interfaceC6693n30, c3884d30P1);
        return c3884d30P1;
    }

    public final Collection q1(C2352Tm0 c2352Tm0) {
        Collection collectionB = ((InterfaceC0487Bw) N().invoke()).b(c2352Tm0);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collectionB, 10));
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((InterfaceC3605c30) it.next()));
        }
        return arrayList;
    }

    public final Collection r1(C2352Tm0 c2352Tm0) {
        Set setB1 = b1(c2352Tm0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            IS0 is0 = (IS0) obj;
            if (!AbstractC4849gV0.d(is0) && C1579Mh.l(is0) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void s0(List list, InterfaceC7195or interfaceC7195or, int i, InterfaceC3605c30 interfaceC3605c30, I80 i80, I80 i802) {
        InterfaceC3072a8 interfaceC3072a8B = InterfaceC3072a8.b.b();
        C2352Tm0 name = interfaceC3605c30.getName();
        I80 i80N = D81.n(i80);
        G10.f(i80N, "makeNotNullable(...)");
        list.add(new C10197zc1(interfaceC7195or, null, i, interfaceC3072a8B, name, i80N, interfaceC3605c30.M(), false, false, i802 != null ? D81.n(i802) : null, L().a().t().a(interfaceC3605c30)));
    }

    public final boolean s1(IS0 is0) {
        C1579Mh c1579Mh = C1579Mh.o;
        C2352Tm0 name = is0.getName();
        G10.f(name, "getName(...)");
        if (!c1579Mh.n(name)) {
            return false;
        }
        C2352Tm0 name2 = is0.getName();
        G10.f(name2, "getName(...)");
        Set setB1 = b1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator it = setB1.iterator();
        while (it.hasNext()) {
            InterfaceC8468tR interfaceC8468tRL = C1579Mh.l((IS0) it.next());
            if (interfaceC8468tRL != null) {
                arrayList.add(interfaceC8468tRL);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (e1(is0, (InterfaceC8468tR) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final void t0(Collection collection, C2352Tm0 c2352Tm0, Collection collection2, boolean z) {
        Collection collectionD = AbstractC6169lA.d(c2352Tm0, collection2, collection, R(), L().a().c(), L().a().k().a());
        G10.f(collectionD, "resolveOverridesForNonStaticMembers(...)");
        if (!z) {
            collection.addAll(collectionD);
            return;
        }
        Collection<IS0> collection3 = collectionD;
        List listZ0 = AbstractC2455Um.z0(collection, collection3);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collection3, 10));
        for (IS0 is0H0 : collection3) {
            IS0 is0 = (IS0) AbstractC4849gV0.j(is0H0);
            if (is0 == null) {
                G10.d(is0H0);
            } else {
                G10.d(is0H0);
                is0H0 = H0(is0H0, is0, listZ0);
            }
            arrayList.add(is0H0);
        }
        collection.addAll(arrayList);
    }

    @Override // com.daaw.AbstractC1864Pa0
    public String toString() {
        return "Lazy Java member scope for " + this.o.d();
    }

    public final void u0(C2352Tm0 c2352Tm0, Collection collection, Collection collection2, Collection collection3, NQ nq) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            IS0 is0 = (IS0) it.next();
            AbstractC1392Km.a(collection3, l1(is0, nq, c2352Tm0, collection));
            AbstractC1392Km.a(collection3, k1(is0, nq, collection));
            AbstractC1392Km.a(collection3, m1(is0, nq));
        }
    }

    @Override // com.daaw.AbstractC1864Pa0
    public Set v(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        return AbstractC10146zQ0.j((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    public final void v0(Set set, Collection collection, Set set2, NQ nq) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC4476fA0 interfaceC4476fA0 = (InterfaceC4476fA0) it.next();
            C6135l30 c6135l30J0 = J0(interfaceC4476fA0, nq);
            if (c6135l30J0 != null) {
                collection.add(c6135l30J0);
                if (set2 != null) {
                    set2.add(interfaceC4476fA0);
                    return;
                }
                return;
            }
        }
    }

    public final void w0(C2352Tm0 c2352Tm0, Collection collection) {
        InterfaceC3605c30 interfaceC3605c30 = (InterfaceC3605c30) AbstractC2455Um.D0(((InterfaceC0487Bw) N().invoke()).b(c2352Tm0));
        if (interfaceC3605c30 == null) {
            return;
        }
        collection.add(L0(this, interfaceC3605c30, null, EnumC0336Ak0.C, 2, null));
    }

    @Override // com.daaw.AbstractC1864Pa0
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet x(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        Collection collectionB = R().k().b();
        G10.f(collectionB, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(linkedHashSet, ((I80) it.next()).q().b());
        }
        linkedHashSet.addAll(((InterfaceC0487Bw) N().invoke()).a());
        linkedHashSet.addAll(((InterfaceC0487Bw) N().invoke()).d());
        linkedHashSet.addAll(v(c1651Mz, nq));
        linkedHashSet.addAll(L().a().w().b(R(), L()));
        return linkedHashSet;
    }

    @Override // com.daaw.AbstractC1864Pa0
    public void y(Collection collection, C2352Tm0 c2352Tm0) {
        G10.g(collection, "result");
        G10.g(c2352Tm0, "name");
        if (this.o.s() && ((InterfaceC0487Bw) N().invoke()).f(c2352Tm0) != null) {
            Collection collection2 = collection;
            if (collection2.isEmpty()) {
                InterfaceC6693n30 interfaceC6693n30F = ((InterfaceC0487Bw) N().invoke()).f(c2352Tm0);
                G10.d(interfaceC6693n30F);
                collection.add(p1(interfaceC6693n30F));
            } else {
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (((IS0) it.next()).h().isEmpty()) {
                        break;
                    }
                }
                InterfaceC6693n30 interfaceC6693n30F2 = ((InterfaceC0487Bw) N().invoke()).f(c2352Tm0);
                G10.d(interfaceC6693n30F2);
                collection.add(p1(interfaceC6693n30F2));
            }
        }
        L().a().w().g(R(), c2352Tm0, collection, L());
    }

    @Override // com.daaw.AbstractC1864Pa0
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C4644fl z() {
        return new C4644fl(this.o, C6832na0.B);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8226sa0(C0504Ca0 c0504Ca0, InterfaceC4923gl interfaceC4923gl, C20 c20, boolean z, C8226sa0 c8226sa0) {
        super(c0504Ca0, c8226sa0);
        G10.g(c0504Ca0, "c");
        G10.g(interfaceC4923gl, "ownerDescriptor");
        G10.g(c20, "jClass");
        this.n = interfaceC4923gl;
        this.o = c20;
        this.p = z;
        this.q = c0504Ca0.e().h(new C5427ia0(this, c0504Ca0));
        this.r = c0504Ca0.e().h(new C5707ja0(this));
        this.s = c0504Ca0.e().h(new C5986ka0(c0504Ca0, this));
        this.t = c0504Ca0.e().h(new C6274la0(this));
        this.u = c0504Ca0.e().b(new C6553ma0(this, c0504Ca0));
    }
}
