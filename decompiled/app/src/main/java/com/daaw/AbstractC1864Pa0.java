package com.daaw;

import com.daaw.AbstractC1547Lz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Pa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1864Pa0 extends AbstractC4635fj0 {
    public static final /* synthetic */ W60[] m = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(AbstractC1864Pa0.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(AbstractC1864Pa0.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(AbstractC1864Pa0.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    public final C0504Ca0 b;
    public final AbstractC1864Pa0 c;
    public final InterfaceC0881Fo0 d;
    public final InterfaceC0881Fo0 e;
    public final InterfaceC5471ij0 f;
    public final InterfaceC5752jj0 g;
    public final InterfaceC5471ij0 h;
    public final InterfaceC0881Fo0 i;
    public final InterfaceC0881Fo0 j;
    public final InterfaceC0881Fo0 k;
    public final InterfaceC5471ij0 l;

    /* JADX INFO: renamed from: com.daaw.Pa0$a */
    public static final class a {
        public final I80 a;
        public final I80 b;
        public final List c;
        public final List d;
        public final boolean e;
        public final List f;

        public a(I80 i80, I80 i802, List list, List list2, boolean z, List list3) {
            G10.g(i80, "returnType");
            G10.g(list, "valueParameters");
            G10.g(list2, "typeParameters");
            G10.g(list3, "errors");
            this.a = i80;
            this.b = i802;
            this.c = list;
            this.d = list2;
            this.e = z;
            this.f = list3;
        }

        public final List a() {
            return this.f;
        }

        public final boolean b() {
            return this.e;
        }

        public final I80 c() {
            return this.b;
        }

        public final I80 d() {
            return this.a;
        }

        public final List e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(this.a, aVar.a) && G10.c(this.b, aVar.b) && G10.c(this.c, aVar.c) && G10.c(this.d, aVar.d) && this.e == aVar.e && G10.c(this.f, aVar.f);
        }

        public final List f() {
            return this.c;
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            I80 i80 = this.b;
            return ((((((((iHashCode + (i80 == null ? 0 : i80.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + AbstractC8813ug.a(this.e)) * 31) + this.f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.a + ", receiverType=" + this.b + ", valueParameters=" + this.c + ", typeParameters=" + this.d + ", hasStableParameterNames=" + this.e + ", errors=" + this.f + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pa0$b */
    public static final class b {
        public final List a;
        public final boolean b;

        public b(List list, boolean z) {
            G10.g(list, "descriptors");
            this.a = list;
            this.b = z;
        }

        public final List a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public /* synthetic */ AbstractC1864Pa0(C0504Ca0 c0504Ca0, AbstractC1864Pa0 abstractC1864Pa0, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c0504Ca0, (i & 2) != 0 ? null : abstractC1864Pa0);
    }

    public static final InterfaceC4476fA0 F(AbstractC1864Pa0 abstractC1864Pa0, C2352Tm0 c2352Tm0) {
        G10.g(abstractC1864Pa0, "this$0");
        G10.g(c2352Tm0, "name");
        AbstractC1864Pa0 abstractC1864Pa02 = abstractC1864Pa0.c;
        if (abstractC1864Pa02 != null) {
            return (InterfaceC4476fA0) abstractC1864Pa02.g.invoke(c2352Tm0);
        }
        V20 v20C = ((InterfaceC0487Bw) abstractC1864Pa0.e.invoke()).c(c2352Tm0);
        if (v20C == null || v20C.G()) {
            return null;
        }
        return abstractC1864Pa0.a0(v20C);
    }

    public static final Collection G(AbstractC1864Pa0 abstractC1864Pa0, C2352Tm0 c2352Tm0) {
        G10.g(abstractC1864Pa0, "this$0");
        G10.g(c2352Tm0, "name");
        AbstractC1864Pa0 abstractC1864Pa02 = abstractC1864Pa0.c;
        if (abstractC1864Pa02 != null) {
            return (Collection) abstractC1864Pa02.f.invoke(c2352Tm0);
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3605c30 interfaceC3605c30 : ((InterfaceC0487Bw) abstractC1864Pa0.e.invoke()).b(c2352Tm0)) {
            C3884d30 c3884d30Z = abstractC1864Pa0.Z(interfaceC3605c30);
            if (abstractC1864Pa0.V(c3884d30Z)) {
                abstractC1864Pa0.b.a().h().e(interfaceC3605c30, c3884d30Z);
                arrayList.add(c3884d30Z);
            }
        }
        abstractC1864Pa0.y(arrayList, c2352Tm0);
        return arrayList;
    }

    public static final InterfaceC0487Bw H(AbstractC1864Pa0 abstractC1864Pa0) {
        G10.g(abstractC1864Pa0, "this$0");
        return abstractC1864Pa0.z();
    }

    public static final Set I(AbstractC1864Pa0 abstractC1864Pa0) {
        G10.g(abstractC1864Pa0, "this$0");
        return abstractC1864Pa0.x(C1651Mz.v, null);
    }

    public static final Collection J(AbstractC1864Pa0 abstractC1864Pa0, C2352Tm0 c2352Tm0) {
        G10.g(abstractC1864Pa0, "this$0");
        G10.g(c2352Tm0, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) abstractC1864Pa0.f.invoke(c2352Tm0));
        abstractC1864Pa0.e0(linkedHashSet);
        abstractC1864Pa0.B(linkedHashSet, c2352Tm0);
        return AbstractC2455Um.M0(abstractC1864Pa0.b.a().r().p(abstractC1864Pa0.b, linkedHashSet));
    }

    public static final List W(AbstractC1864Pa0 abstractC1864Pa0, C2352Tm0 c2352Tm0) {
        G10.g(abstractC1864Pa0, "this$0");
        G10.g(c2352Tm0, "name");
        ArrayList arrayList = new ArrayList();
        AbstractC1392Km.a(arrayList, abstractC1864Pa0.g.invoke(c2352Tm0));
        abstractC1864Pa0.C(c2352Tm0, arrayList);
        return AbstractC7006oA.t(abstractC1864Pa0.R()) ? AbstractC2455Um.M0(arrayList) : AbstractC2455Um.M0(abstractC1864Pa0.b.a().r().p(abstractC1864Pa0.b, arrayList));
    }

    public static final Set X(AbstractC1864Pa0 abstractC1864Pa0) {
        G10.g(abstractC1864Pa0, "this$0");
        return abstractC1864Pa0.D(C1651Mz.w, null);
    }

    public static final InterfaceC4097dp0 b0(AbstractC1864Pa0 abstractC1864Pa0, V20 v20, C6748nF0 c6748nF0) {
        G10.g(abstractC1864Pa0, "this$0");
        G10.g(v20, "$field");
        G10.g(c6748nF0, "$propertyDescriptor");
        return abstractC1864Pa0.b.e().a(new C0825Fa0(abstractC1864Pa0, v20, c6748nF0));
    }

    public static final AbstractC2887Yq c0(AbstractC1864Pa0 abstractC1864Pa0, V20 v20, C6748nF0 c6748nF0) {
        G10.g(abstractC1864Pa0, "this$0");
        G10.g(v20, "$field");
        G10.g(c6748nF0, "$propertyDescriptor");
        return abstractC1864Pa0.b.a().g().a(v20, (InterfaceC4476fA0) c6748nF0.B);
    }

    public static final InterfaceC1376Ki f0(IS0 is0) {
        G10.g(is0, "$this$selectMostSpecificInEachOverridableGroup");
        return is0;
    }

    public static final Collection t(AbstractC1864Pa0 abstractC1864Pa0) {
        G10.g(abstractC1864Pa0, "this$0");
        return abstractC1864Pa0.w(C1651Mz.o, InterfaceC4346ej0.a.c());
    }

    public static final Set u(AbstractC1864Pa0 abstractC1864Pa0) {
        G10.g(abstractC1864Pa0, "this$0");
        return abstractC1864Pa0.v(C1651Mz.t, null);
    }

    public final I80 A(InterfaceC3605c30 interfaceC3605c30, C0504Ca0 c0504Ca0) {
        G10.g(interfaceC3605c30, "method");
        G10.g(c0504Ca0, "c");
        return c0504Ca0.g().p(interfaceC3605c30.getReturnType(), C30.b(C81.C, interfaceC3605c30.Q().q(), false, null, 6, null));
    }

    public abstract void B(Collection collection, C2352Tm0 c2352Tm0);

    public abstract void C(C2352Tm0 c2352Tm0, Collection collection);

    public abstract Set D(C1651Mz c1651Mz, NQ nq);

    public final C4765gA0 E(V20 v20) {
        C6135l30 c6135l30F1 = C6135l30.f1(R(), AbstractC3744ca0.a(this.b, v20), EnumC0336Ak0.C, AbstractC1142Ib1.d(v20.getVisibility()), !v20.isFinal(), v20.getName(), this.b.a().t().a(v20), U(v20));
        G10.f(c6135l30F1, "create(...)");
        return c6135l30F1;
    }

    public final InterfaceC0881Fo0 K() {
        return this.d;
    }

    public final C0504Ca0 L() {
        return this.b;
    }

    public final Set M() {
        return (Set) AbstractC9895yX0.a(this.k, this, m[2]);
    }

    public final InterfaceC0881Fo0 N() {
        return this.e;
    }

    public abstract RE0 O();

    public final Set P() {
        return (Set) AbstractC9895yX0.a(this.i, this, m[0]);
    }

    public final AbstractC1864Pa0 Q() {
        return this.c;
    }

    public abstract InterfaceC8612tw R();

    public final Set S() {
        return (Set) AbstractC9895yX0.a(this.j, this, m[1]);
    }

    public final I80 T(V20 v20) {
        I80 i80P = this.b.g().p(v20.getType(), C30.b(C81.C, false, false, null, 7, null));
        if ((!AbstractC8670u80.s0(i80P) && !AbstractC8670u80.v0(i80P)) || !U(v20) || !v20.P()) {
            return i80P;
        }
        I80 i80N = D81.n(i80P);
        G10.f(i80N, "makeNotNullable(...)");
        return i80N;
    }

    public final boolean U(V20 v20) {
        return v20.isFinal() && v20.g();
    }

    public boolean V(C3884d30 c3884d30) {
        G10.g(c3884d30, "<this>");
        return true;
    }

    public abstract a Y(InterfaceC3605c30 interfaceC3605c30, List list, I80 i80, List list2);

    public final C3884d30 Z(InterfaceC3605c30 interfaceC3605c30) {
        G10.g(interfaceC3605c30, "method");
        C3884d30 c3884d30P1 = C3884d30.p1(R(), AbstractC3744ca0.a(this.b, interfaceC3605c30), interfaceC3605c30.getName(), this.b.a().t().a(interfaceC3605c30), ((InterfaceC0487Bw) this.e.invoke()).f(interfaceC3605c30.getName()) != null && interfaceC3605c30.h().isEmpty());
        G10.f(c3884d30P1, "createJavaMethod(...)");
        C0504Ca0 c0504Ca0I = AbstractC10275zs.i(this.b, c3884d30P1, interfaceC3605c30, 0, 4, null);
        List typeParameters = interfaceC3605c30.getTypeParameters();
        List arrayList = new ArrayList(AbstractC1703Nm.v(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            Z71 z71A = c0504Ca0I.f().a((G30) it.next());
            G10.d(z71A);
            arrayList.add(z71A);
        }
        b bVarD0 = d0(c0504Ca0I, c3884d30P1, interfaceC3605c30.h());
        a aVarY = Y(interfaceC3605c30, arrayList, A(interfaceC3605c30, c0504Ca0I), bVarD0.a());
        I80 i80C = aVarY.c();
        c3884d30P1.o1(i80C != null ? AbstractC1444Kz.i(c3884d30P1, i80C, InterfaceC3072a8.b.b()) : null, O(), AbstractC1599Mm.k(), aVarY.e(), aVarY.f(), aVarY.d(), EnumC0336Ak0.B.a(false, interfaceC3605c30.isAbstract(), !interfaceC3605c30.isFinal()), AbstractC1142Ib1.d(interfaceC3605c30.getVisibility()), aVarY.c() != null ? AbstractC1369Kg0.e(D61.a(C3884d30.h0, AbstractC2455Um.e0(bVarD0.a()))) : AbstractC1473Lg0.h());
        c3884d30P1.s1(aVarY.b(), bVarD0.b());
        if (!aVarY.a().isEmpty()) {
            c0504Ca0I.a().s().a(c3884d30P1, aVarY.a());
        }
        return c3884d30P1;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return !d().contains(c2352Tm0) ? AbstractC1599Mm.k() : (Collection) this.l.invoke(c2352Tm0);
    }

    public final InterfaceC4476fA0 a0(V20 v20) {
        C6748nF0 c6748nF0 = new C6748nF0();
        C4765gA0 c4765gA0E = E(v20);
        c6748nF0.B = c4765gA0E;
        c4765gA0E.V0(null, null, null, null);
        ((C4765gA0) c6748nF0.B).b1(T(v20), AbstractC1599Mm.k(), O(), null, AbstractC1599Mm.k());
        InterfaceC8612tw interfaceC8612twR = R();
        InterfaceC4923gl interfaceC4923gl = interfaceC8612twR instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twR : null;
        if (interfaceC4923gl != null) {
            c6748nF0.B = this.b.a().w().f(interfaceC4923gl, (C4765gA0) c6748nF0.B, this.b);
        }
        Object obj = c6748nF0.B;
        if (AbstractC7006oA.K((InterfaceC0626Dc1) obj, ((C4765gA0) obj).getType())) {
            ((C4765gA0) c6748nF0.B).L0(new C0721Ea0(this, v20, c6748nF0));
        }
        this.b.a().h().b(v20, (InterfaceC4476fA0) c6748nF0.B);
        return (InterfaceC4476fA0) c6748nF0.B;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set b() {
        return P();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return !b().contains(c2352Tm0) ? AbstractC1599Mm.k() : (Collection) this.h.invoke(c2352Tm0);
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set d() {
        return S();
    }

    public final b d0(C0504Ca0 c0504Ca0, InterfaceC8468tR interfaceC8468tR, List list) {
        C0576Cs0 c0576Cs0A;
        C2352Tm0 name;
        G10.g(c0504Ca0, "c");
        InterfaceC8468tR interfaceC8468tR2 = interfaceC8468tR;
        G10.g(interfaceC8468tR2, "function");
        G10.g(list, "jValueParameters");
        Iterable<C8500tZ> iterableS0 = AbstractC2455Um.S0(list);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterableS0, 10));
        boolean z = false;
        for (C8500tZ c8500tZ : iterableS0) {
            int iA = c8500tZ.a();
            O30 o30 = (O30) c8500tZ.b();
            InterfaceC3072a8 interfaceC3072a8A = AbstractC3744ca0.a(c0504Ca0, o30);
            B30 b30B = C30.b(C81.C, false, false, null, 7, null);
            if (o30.a()) {
                InterfaceC10047z30 type = o30.getType();
                A20 a20 = type instanceof A20 ? (A20) type : null;
                if (a20 == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + o30);
                }
                I80 i80L = c0504Ca0.g().l(a20, b30B, true);
                c0576Cs0A = D61.a(i80L, c0504Ca0.d().p().k(i80L));
            } else {
                c0576Cs0A = D61.a(c0504Ca0.g().p(o30.getType(), b30B), null);
            }
            I80 i80 = (I80) c0576Cs0A.a();
            I80 i802 = (I80) c0576Cs0A.b();
            if (G10.c(interfaceC8468tR2.getName().c(), "equals") && list.size() == 1 && G10.c(c0504Ca0.d().p().I(), i80)) {
                name = C2352Tm0.l("other");
            } else {
                name = o30.getName();
                if (name == null) {
                    z = true;
                }
                if (name == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('p');
                    sb.append(iA);
                    name = C2352Tm0.l(sb.toString());
                    G10.f(name, "identifier(...)");
                }
            }
            boolean z2 = z;
            G10.d(name);
            arrayList.add(new C10197zc1(interfaceC8468tR2, null, iA, interfaceC3072a8A, name, i80, false, false, false, i802, c0504Ca0.a().t().a(o30)));
            interfaceC8468tR2 = interfaceC8468tR;
            z = z2;
        }
        return new b(AbstractC2455Um.M0(arrayList), z);
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set e() {
        return M();
    }

    public final void e0(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = AbstractC7440pk0.c((IS0) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection collectionB = AbstractC1101Hr0.b(list2, C1760Oa0.B);
                set.removeAll(list2);
                set.addAll(collectionB);
            }
        }
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        return (Collection) this.d.invoke();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    public abstract Set v(C1651Mz c1651Mz, NQ nq);

    public final List w(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        EnumC5496io0 enumC5496io0 = EnumC5496io0.N;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c1651Mz.a(C1651Mz.c.c())) {
            for (C2352Tm0 c2352Tm0 : v(c1651Mz, nq)) {
                if (((Boolean) nq.invoke(c2352Tm0)).booleanValue()) {
                    AbstractC1392Km.a(linkedHashSet, g(c2352Tm0, enumC5496io0));
                }
            }
        }
        if (c1651Mz.a(C1651Mz.c.d()) && !c1651Mz.l().contains(AbstractC1547Lz.a.a)) {
            for (C2352Tm0 c2352Tm02 : x(c1651Mz, nq)) {
                if (((Boolean) nq.invoke(c2352Tm02)).booleanValue()) {
                    linkedHashSet.addAll(c(c2352Tm02, enumC5496io0));
                }
            }
        }
        if (c1651Mz.a(C1651Mz.c.i()) && !c1651Mz.l().contains(AbstractC1547Lz.a.a)) {
            for (C2352Tm0 c2352Tm03 : D(c1651Mz, nq)) {
                if (((Boolean) nq.invoke(c2352Tm03)).booleanValue()) {
                    linkedHashSet.addAll(a(c2352Tm03, enumC5496io0));
                }
            }
        }
        return AbstractC2455Um.M0(linkedHashSet);
    }

    public abstract Set x(C1651Mz c1651Mz, NQ nq);

    public void y(Collection collection, C2352Tm0 c2352Tm0) {
        G10.g(collection, "result");
        G10.g(c2352Tm0, "name");
    }

    public abstract InterfaceC0487Bw z();

    public AbstractC1864Pa0(C0504Ca0 c0504Ca0, AbstractC1864Pa0 abstractC1864Pa0) {
        G10.g(c0504Ca0, "c");
        this.b = c0504Ca0;
        this.c = abstractC1864Pa0;
        this.d = c0504Ca0.e().e(new C0608Da0(this), AbstractC1599Mm.k());
        this.e = c0504Ca0.e().h(new C0929Ga0(this));
        this.f = c0504Ca0.e().g(new C1033Ha0(this));
        this.g = c0504Ca0.e().b(new C1137Ia0(this));
        this.h = c0504Ca0.e().g(new C1241Ja0(this));
        this.i = c0504Ca0.e().h(new C1345Ka0(this));
        this.j = c0504Ca0.e().h(new C1449La0(this));
        this.k = c0504Ca0.e().h(new C1552Ma0(this));
        this.l = c0504Ca0.e().g(new C1656Na0(this));
    }
}
