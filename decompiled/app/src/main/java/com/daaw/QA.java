package com.daaw;

import com.daaw.C0560Co0;
import com.daaw.C10202zd1;
import com.daaw.C9245wA0;
import com.daaw.FI0;
import com.daaw.G10;
import com.daaw.InterfaceC4346ej0;
import com.daaw.InterfaceC9624xZ0;
import com.daaw.TA0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class QA extends AbstractC8349t implements InterfaceC8612tw {
    public final C9245wA0 G;
    public final AbstractC1156If H;
    public final RU0 I;
    public final C6607ml J;
    public final EnumC0336Ak0 K;
    public final AbstractC8965vA L;
    public final EnumC6886nl M;
    public final BA N;
    public final boolean O;
    public final AbstractC4635fj0 P;
    public final b Q;
    public final UN0 R;
    public final c S;
    public final InterfaceC8612tw T;
    public final InterfaceC4097dp0 U;
    public final InterfaceC0881Fo0 V;
    public final InterfaceC4097dp0 W;
    public final InterfaceC0881Fo0 X;
    public final InterfaceC4097dp0 Y;
    public final TA0.a Z;
    public final InterfaceC3072a8 a0;

    public final class a extends AbstractC3922dB {
        public final Q80 g;
        public final InterfaceC0881Fo0 h;
        public final InterfaceC0881Fo0 i;
        public final /* synthetic */ QA j;

        /* JADX INFO: renamed from: com.daaw.QA$a$a, reason: collision with other inner class name */
        public static final class C0111a extends AbstractC9419wo0 {
            public final /* synthetic */ List a;

            public C0111a(List list) {
                this.a = list;
            }

            @Override // com.daaw.AbstractC0685Dr0
            public void a(InterfaceC1583Mi interfaceC1583Mi) {
                G10.g(interfaceC1583Mi, "fakeOverride");
                C0789Er0.K(interfaceC1583Mi, null);
                this.a.add(interfaceC1583Mi);
            }

            @Override // com.daaw.AbstractC9419wo0
            public void e(InterfaceC1583Mi interfaceC1583Mi, InterfaceC1583Mi interfaceC1583Mi2) {
                G10.g(interfaceC1583Mi, "fromSuper");
                G10.g(interfaceC1583Mi2, "fromCurrent");
                if (interfaceC1583Mi2 instanceof AbstractC8747uR) {
                    ((AbstractC8747uR) interfaceC1583Mi2).U0(XA.a, interfaceC1583Mi);
                }
            }
        }

        public a(QA qa, Q80 q80) {
            G10.g(q80, "kotlinTypeRefiner");
            this.j = qa;
            BA baD1 = qa.d1();
            List listL0 = qa.e1().L0();
            G10.f(listL0, "getFunctionList(...)");
            List listZ0 = qa.e1().Z0();
            G10.f(listZ0, "getPropertyList(...)");
            List listH1 = qa.e1().h1();
            G10.f(listH1, "getTypeAliasList(...)");
            List listW0 = qa.e1().W0();
            G10.f(listW0, "getNestedClassNameList(...)");
            List list = listW0;
            InterfaceC2664Wm0 interfaceC2664Wm0G = qa.d1().g();
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3252an0.b(interfaceC2664Wm0G, ((Number) it.next()).intValue()));
            }
            super(baD1, listL0, listZ0, listH1, new NA(arrayList));
            this.g = q80;
            this.h = s().h().h(new OA(this));
            this.i = s().h().h(new PA(this));
        }

        public static final List B(List list) {
            G10.g(list, "$it");
            return list;
        }

        public static final Collection F(a aVar) {
            G10.g(aVar, "this$0");
            return aVar.m(C1651Mz.o, InterfaceC4346ej0.a.c(), EnumC5496io0.N);
        }

        public static final Collection J(a aVar) {
            G10.g(aVar, "this$0");
            return aVar.g.g(aVar.H());
        }

        @Override // com.daaw.AbstractC3922dB
        public boolean A(IS0 is0) {
            G10.g(is0, "function");
            return s().c().t().b(this.j, is0);
        }

        public final void G(C2352Tm0 c2352Tm0, Collection collection, List list) {
            s().c().n().a().v(c2352Tm0, collection, new ArrayList(list), H(), new C0111a(list));
        }

        public final QA H() {
            return this.j;
        }

        public void I(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            G10.g(c2352Tm0, "name");
            G10.g(interfaceC7689qe0, "location");
            AbstractC1038Hb1.a(s().c().p(), interfaceC7689qe0, H(), c2352Tm0);
        }

        @Override // com.daaw.AbstractC3922dB, com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            G10.g(c2352Tm0, "name");
            G10.g(interfaceC7689qe0, "location");
            I(c2352Tm0, interfaceC7689qe0);
            return super.a(c2352Tm0, interfaceC7689qe0);
        }

        @Override // com.daaw.AbstractC3922dB, com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
        public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            G10.g(c2352Tm0, "name");
            G10.g(interfaceC7689qe0, "location");
            I(c2352Tm0, interfaceC7689qe0);
            return super.c(c2352Tm0, interfaceC7689qe0);
        }

        @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
        public Collection f(C1651Mz c1651Mz, NQ nq) {
            G10.g(c1651Mz, "kindFilter");
            G10.g(nq, "nameFilter");
            return (Collection) this.h.invoke();
        }

        @Override // com.daaw.AbstractC3922dB, com.daaw.AbstractC4635fj0, com.daaw.FI0
        public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            InterfaceC4923gl interfaceC4923glI;
            G10.g(c2352Tm0, "name");
            G10.g(interfaceC7689qe0, "location");
            I(c2352Tm0, interfaceC7689qe0);
            c cVar = H().S;
            return (cVar == null || (interfaceC4923glI = cVar.i(c2352Tm0)) == null) ? super.g(c2352Tm0, interfaceC7689qe0) : interfaceC4923glI;
        }

        @Override // com.daaw.AbstractC3922dB
        public void j(Collection collection, NQ nq) {
            G10.g(collection, "result");
            G10.g(nq, "nameFilter");
            c cVar = H().S;
            List listD = cVar != null ? cVar.d() : null;
            if (listD == null) {
                listD = AbstractC1599Mm.k();
            }
            collection.addAll(listD);
        }

        @Override // com.daaw.AbstractC3922dB
        public void n(C2352Tm0 c2352Tm0, List list) {
            G10.g(c2352Tm0, "name");
            G10.g(list, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((I80) it.next()).q().c(c2352Tm0, EnumC5496io0.M));
            }
            list.addAll(s().c().c().a(c2352Tm0, this.j));
            G(c2352Tm0, arrayList, list);
        }

        @Override // com.daaw.AbstractC3922dB
        public void o(C2352Tm0 c2352Tm0, List list) {
            G10.g(c2352Tm0, "name");
            G10.g(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((I80) it.next()).q().a(c2352Tm0, EnumC5496io0.M));
            }
            G(c2352Tm0, arrayList, list);
        }

        @Override // com.daaw.AbstractC3922dB
        public C6607ml p(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "name");
            return this.j.J.d(c2352Tm0);
        }

        @Override // com.daaw.AbstractC3922dB
        public Set v() {
            List listB = H().Q.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                Set setE = ((I80) it.next()).q().e();
                if (setE == null) {
                    return null;
                }
                AbstractC2141Rm.A(linkedHashSet, setE);
            }
            return linkedHashSet;
        }

        @Override // com.daaw.AbstractC3922dB
        public Set w() {
            List listB = H().Q.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                AbstractC2141Rm.A(linkedHashSet, ((I80) it.next()).q().b());
            }
            linkedHashSet.addAll(s().c().c().c(this.j));
            return linkedHashSet;
        }

        @Override // com.daaw.AbstractC3922dB
        public Set x() {
            List listB = H().Q.b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                AbstractC2141Rm.A(linkedHashSet, ((I80) it.next()).q().d());
            }
            return linkedHashSet;
        }
    }

    public final class b extends AbstractC8628u {
        public final InterfaceC0881Fo0 d;

        public b() {
            super(QA.this.d1().h());
            this.d = QA.this.d1().h().h(new RA(QA.this));
        }

        public static final List L(QA qa) {
            G10.g(qa, "this$0");
            return AbstractC6161l81.g(qa);
        }

        @Override // com.daaw.AbstractC9961yl, com.daaw.C71
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public QA c() {
            return QA.this;
        }

        @Override // com.daaw.C71
        public boolean d() {
            return true;
        }

        @Override // com.daaw.C71
        public List getParameters() {
            return (List) this.d.invoke();
        }

        @Override // com.daaw.W0
        public Collection r() {
            String strC;
            AP apA;
            List listO = AbstractC3366bB0.o(QA.this.e1(), QA.this.d1().j());
            QA qa = QA.this;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(qa.d1().i().u((KA0) it.next()));
            }
            List listZ0 = AbstractC2455Um.z0(arrayList, QA.this.d1().c().c().e(QA.this));
            ArrayList<C0560Co0.b> arrayList2 = new ArrayList();
            Iterator it2 = listZ0.iterator();
            while (it2.hasNext()) {
                InterfaceC10240zl interfaceC10240zlC = ((I80) it2.next()).N0().c();
                C0560Co0.b bVar = interfaceC10240zlC instanceof C0560Co0.b ? (C0560Co0.b) interfaceC10240zlC : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC8993vH interfaceC8993vHJ = QA.this.d1().c().j();
                QA qa2 = QA.this;
                ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(arrayList2, 10));
                for (C0560Co0.b bVar2 : arrayList2) {
                    C6607ml c6607mlN = AbstractC8400tA.n(bVar2);
                    if (c6607mlN == null || (apA = c6607mlN.a()) == null || (strC = apA.b()) == null) {
                        strC = bVar2.getName().c();
                        G10.f(strC, "asString(...)");
                    }
                    arrayList3.add(strC);
                }
                interfaceC8993vHJ.b(qa2, arrayList3);
            }
            return AbstractC2455Um.M0(listZ0);
        }

        public String toString() {
            String string = QA.this.getName().toString();
            G10.f(string, "toString(...)");
            return string;
        }

        @Override // com.daaw.W0
        public InterfaceC9624xZ0 v() {
            return InterfaceC9624xZ0.a.a;
        }
    }

    public final class c {
        public final Map a;
        public final InterfaceC5752jj0 b;
        public final InterfaceC0881Fo0 c;

        public c() {
            List listG0 = QA.this.e1().G0();
            G10.f(listG0, "getEnumEntryList(...)");
            List list = listG0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(AbstractC3252an0.b(QA.this.d1().g(), ((AA0) obj).I()), obj);
            }
            this.a = linkedHashMap;
            this.b = QA.this.d1().h().b(new SA(this, QA.this));
            this.c = QA.this.d1().h().h(new TA(this));
        }

        public static final InterfaceC4923gl f(c cVar, QA qa, C2352Tm0 c2352Tm0) {
            G10.g(cVar, "this$0");
            G10.g(qa, "this$1");
            G10.g(c2352Tm0, "name");
            AA0 aa0 = (AA0) cVar.a.get(c2352Tm0);
            if (aa0 != null) {
                return C3667cH.L0(qa.d1().h(), qa, c2352Tm0, cVar.c, new DA(qa.d1().h(), new UA(qa, aa0)), RU0.a);
            }
            return null;
        }

        public static final List g(QA qa, AA0 aa0) {
            G10.g(qa, "this$0");
            G10.g(aa0, "$proto");
            return AbstractC2455Um.M0(qa.d1().c().d().j(qa.i1(), aa0));
        }

        public static final Set h(c cVar) {
            G10.g(cVar, "this$0");
            return cVar.e();
        }

        public final Collection d() {
            Set setKeySet = this.a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                InterfaceC4923gl interfaceC4923glI = i((C2352Tm0) it.next());
                if (interfaceC4923glI != null) {
                    arrayList.add(interfaceC4923glI);
                }
            }
            return arrayList;
        }

        public final Set e() {
            HashSet hashSet = new HashSet();
            Iterator it = QA.this.k().b().iterator();
            while (it.hasNext()) {
                for (InterfaceC8612tw interfaceC8612tw : FI0.a.a(((I80) it.next()).q(), null, null, 3, null)) {
                    if ((interfaceC8612tw instanceof IS0) || (interfaceC8612tw instanceof InterfaceC4476fA0)) {
                        hashSet.add(((InterfaceC1583Mi) interfaceC8612tw).getName());
                    }
                }
            }
            List listL0 = QA.this.e1().L0();
            G10.f(listL0, "getFunctionList(...)");
            QA qa = QA.this;
            Iterator it2 = listL0.iterator();
            while (it2.hasNext()) {
                hashSet.add(AbstractC3252an0.b(qa.d1().g(), ((CA0) it2.next()).h0()));
            }
            List listZ0 = QA.this.e1().Z0();
            G10.f(listZ0, "getPropertyList(...)");
            QA qa2 = QA.this;
            Iterator it3 = listZ0.iterator();
            while (it3.hasNext()) {
                hashSet.add(AbstractC3252an0.b(qa2.d1().g(), ((HA0) it3.next()).g0()));
            }
            return AbstractC10146zQ0.j(hashSet, hashSet);
        }

        public final InterfaceC4923gl i(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "name");
            return (InterfaceC4923gl) this.b.invoke(c2352Tm0);
        }
    }

    public /* synthetic */ class d extends AbstractC9312wR implements NQ {
        public d(Object obj) {
            super(1, obj);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "simpleType";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(G10.a.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final YS0 invoke(KA0 ka0) {
            G10.g(ka0, "p0");
            return K71.q((K71) this.receiver, ka0, false, 2, null);
        }
    }

    public /* synthetic */ class e extends AbstractC9312wR implements NQ {
        public e(Object obj) {
            super(1, obj);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "getValueClassPropertyType";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(QA.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final YS0 invoke(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "p0");
            return ((QA) this.receiver).j1(c2352Tm0);
        }
    }

    public /* synthetic */ class f extends AbstractC9312wR implements NQ {
        public f(Object obj) {
            super(1, obj);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "<init>";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(a.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final a invoke(Q80 q80) {
            G10.g(q80, "p0");
            return new a((QA) this.receiver, q80);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QA(BA ba, C9245wA0 c9245wA0, InterfaceC2664Wm0 interfaceC2664Wm0, AbstractC1156If abstractC1156If, RU0 ru0) {
        AbstractC4635fj0 c3175aX0;
        super(ba.h(), AbstractC3252an0.a(interfaceC2664Wm0, c9245wA0.I0()).h());
        G10.g(ba, "outerContext");
        G10.g(c9245wA0, "classProto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(abstractC1156If, "metadataVersion");
        G10.g(ru0, "sourceElement");
        this.G = c9245wA0;
        this.H = abstractC1156If;
        this.I = ru0;
        this.J = AbstractC3252an0.a(interfaceC2664Wm0, c9245wA0.I0());
        WA0 wa0 = WA0.a;
        this.K = wa0.b((EA0) SM.e.d(c9245wA0.H0()));
        this.L = XA0.a(wa0, (RA0) SM.d.d(c9245wA0.H0()));
        EnumC6886nl enumC6886nlA = wa0.a((C9245wA0.c) SM.f.d(c9245wA0.H0()));
        this.M = enumC6886nlA;
        List listK1 = c9245wA0.k1();
        G10.f(listK1, "getTypeParameterList(...)");
        NA0 na0L1 = c9245wA0.l1();
        G10.f(na0L1, "getTypeTable(...)");
        B81 b81 = new B81(na0L1);
        C10202zd1.a aVar = C10202zd1.b;
        QA0 qa0N1 = c9245wA0.n1();
        G10.f(qa0N1, "getVersionRequirementTable(...)");
        BA baA = ba.a(this, listK1, interfaceC2664Wm0, b81, aVar.a(qa0N1), abstractC1156If);
        this.N = baA;
        Boolean boolD = SM.m.d(c9245wA0.H0());
        G10.f(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        this.O = zBooleanValue;
        EnumC6886nl enumC6886nl = EnumC6886nl.E;
        if (enumC6886nlA == enumC6886nl) {
            c3175aX0 = new C3175aX0(baA.h(), this, zBooleanValue || G10.c(baA.c().i().a(), Boolean.TRUE));
        } else {
            c3175aX0 = InterfaceC4346ej0.b.b;
        }
        this.P = c3175aX0;
        this.Q = new b();
        this.R = UN0.e.a(this, baA.h(), baA.c().n().c(), new f(this));
        this.S = enumC6886nlA == enumC6886nl ? new c() : null;
        InterfaceC8612tw interfaceC8612twE = ba.e();
        this.T = interfaceC8612twE;
        this.U = baA.h().a(new HA(this));
        this.V = baA.h().h(new IA(this));
        this.W = baA.h().a(new JA(this));
        this.X = baA.h().h(new KA(this));
        this.Y = baA.h().a(new LA(this));
        InterfaceC2664Wm0 interfaceC2664Wm0G = baA.g();
        B81 b81J = baA.j();
        QA qa = interfaceC8612twE instanceof QA ? (QA) interfaceC8612twE : null;
        this.Z = new TA0.a(c9245wA0, interfaceC2664Wm0G, b81J, ru0, qa != null ? qa.Z : null);
        this.a0 = !SM.c.d(c9245wA0.H0()).booleanValue() ? InterfaceC3072a8.b.b() : new C8854uo0(baA.h(), new MA(this));
    }

    public static final List U0(QA qa) {
        G10.g(qa, "this$0");
        return AbstractC2455Um.M0(qa.N.c().d().f(qa.Z));
    }

    public static final InterfaceC4923gl V0(QA qa) {
        G10.g(qa, "this$0");
        return qa.W0();
    }

    public static final Collection c1(QA qa) {
        G10.g(qa, "this$0");
        return qa.X0();
    }

    public static final InterfaceC3241al l1(QA qa) {
        G10.g(qa, "this$0");
        return qa.Y0();
    }

    public static final Collection m1(QA qa) {
        G10.g(qa, "this$0");
        return qa.a1();
    }

    public static final AbstractC7958rc1 n1(QA qa) {
        G10.g(qa, "this$0");
        return qa.b1();
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean B() {
        Boolean boolD = SM.l.d(this.G.H0());
        G10.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean E0() {
        return false;
    }

    @Override // com.daaw.InterfaceC4923gl
    public Collection H() {
        return (Collection) this.X.invoke();
    }

    @Override // com.daaw.AbstractC8349t, com.daaw.InterfaceC4923gl
    public List H0() {
        List listB = AbstractC3366bB0.b(this.G, this.N.j());
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new SE0(J0(), new C9159vs(this, this.N.i().u((KA0) it.next()), null, null), InterfaceC3072a8.b.b()));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean I0() {
        Boolean boolD = SM.h.d(this.G.H0());
        G10.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean J() {
        Boolean boolD = SM.j.d(this.G.H0());
        G10.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // com.daaw.InterfaceC0339Al
    public boolean K() {
        Boolean boolD = SM.g.d(this.G.H0());
        G10.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC3241al N() {
        return (InterfaceC3241al) this.U.invoke();
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4923gl Q() {
        return (InterfaceC4923gl) this.W.invoke();
    }

    @Override // com.daaw.AbstractC2134Rk0
    public InterfaceC4346ej0 U(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return this.R.c(q80);
    }

    public final InterfaceC4923gl W0() {
        if (!this.G.o1()) {
            return null;
        }
        InterfaceC10240zl interfaceC10240zlG = f1().g(AbstractC3252an0.b(this.N.g(), this.G.u0()), EnumC5496io0.S);
        if (interfaceC10240zlG instanceof InterfaceC4923gl) {
            return (InterfaceC4923gl) interfaceC10240zlG;
        }
        return null;
    }

    public final Collection X0() {
        return AbstractC2455Um.z0(AbstractC2455Um.z0(Z0(), AbstractC1599Mm.o(N())), this.N.c().c().d(this));
    }

    public final InterfaceC3241al Y0() {
        Object next;
        if (this.M.c()) {
            C3520bl c3520blL = AbstractC1444Kz.l(this, RU0.a);
            c3520blL.g1(s());
            return c3520blL;
        }
        List listX0 = this.G.x0();
        G10.f(listX0, "getConstructorList(...)");
        Iterator it = listX0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!SM.n.d(((C9524xA0) next).M()).booleanValue()) {
                break;
            }
        }
        C9524xA0 c9524xA0 = (C9524xA0) next;
        if (c9524xA0 != null) {
            return this.N.f().r(c9524xA0, true);
        }
        return null;
    }

    public final List Z0() {
        List listX0 = this.G.x0();
        G10.f(listX0, "getConstructorList(...)");
        ArrayList<C9524xA0> arrayList = new ArrayList();
        for (Object obj : listX0) {
            Boolean boolD = SM.n.d(((C9524xA0) obj).M());
            G10.f(boolD, "get(...)");
            if (boolD.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(arrayList, 10));
        for (C9524xA0 c9524xA0 : arrayList) {
            C3511bj0 c3511bj0F = this.N.f();
            G10.d(c9524xA0);
            arrayList2.add(c3511bj0F.r(c9524xA0, false));
        }
        return arrayList2;
    }

    public final Collection a1() {
        if (this.K != EnumC0336Ak0.D) {
            return AbstractC1599Mm.k();
        }
        List<Integer> listA1 = this.G.a1();
        G10.d(listA1);
        if (listA1.isEmpty()) {
            return C1180Il.a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listA1) {
            C9523xA c9523xAC = this.N.c();
            InterfaceC2664Wm0 interfaceC2664Wm0G = this.N.g();
            G10.d(num);
            InterfaceC4923gl interfaceC4923glB = c9523xAC.b(AbstractC3252an0.a(interfaceC2664Wm0G, num.intValue()));
            if (interfaceC4923glB != null) {
                arrayList.add(interfaceC4923glB);
            }
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC9177vw, com.daaw.InterfaceC8612tw
    public InterfaceC8612tw b() {
        return this.T;
    }

    public final AbstractC7958rc1 b1() {
        if (!isInline() && !n()) {
            return null;
        }
        AbstractC7958rc1 abstractC7958rc1A = AbstractC8237sc1.a(this.G, this.N.g(), this.N.j(), new d(this.N.i()), new e(this));
        if (abstractC7958rc1A != null) {
            return abstractC7958rc1A;
        }
        if (this.H.c(1, 5, 1)) {
            return null;
        }
        InterfaceC3241al interfaceC3241alN = N();
        if (interfaceC3241alN == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List listH = interfaceC3241alN.h();
        G10.f(listH, "getValueParameters(...)");
        C2352Tm0 name = ((InterfaceC9918yc1) AbstractC2455Um.e0(listH)).getName();
        G10.f(name, "getName(...)");
        YS0 ys0J1 = j1(name);
        if (ys0J1 != null) {
            return new IZ(name, ys0J1);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    public final BA d1() {
        return this.N;
    }

    public final C9245wA0 e1() {
        return this.G;
    }

    public final a f1() {
        return (a) this.R.c(this.N.c().n().c());
    }

    public final AbstractC1156If g1() {
        return this.H;
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        return this.a0;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0, com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        return this.L;
    }

    @Override // com.daaw.InterfaceC4923gl
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public AbstractC4635fj0 O() {
        return this.P;
    }

    @Override // com.daaw.InterfaceC4923gl
    public EnumC6886nl i() {
        return this.M;
    }

    public final TA0.a i1() {
        return this.Z;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        Boolean boolD = SM.i.d(this.G.H0());
        G10.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean isInline() {
        return SM.k.d(this.G.H0()).booleanValue() && this.H.e(1, 4, 1);
    }

    @Override // com.daaw.InterfaceC10293zw
    public RU0 j() {
        return this.I;
    }

    public final YS0 j1(C2352Tm0 c2352Tm0) {
        Iterator it = f1().a(c2352Tm0, EnumC5496io0.S).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((InterfaceC4476fA0) next).i0() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        InterfaceC4476fA0 interfaceC4476fA0 = (InterfaceC4476fA0) obj;
        return (YS0) (interfaceC4476fA0 != null ? interfaceC4476fA0.getType() : null);
    }

    @Override // com.daaw.InterfaceC10240zl
    public C71 k() {
        return this.Q;
    }

    public final boolean k1(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return f1().t().contains(c2352Tm0);
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        return this.K;
    }

    @Override // com.daaw.InterfaceC4923gl
    public Collection m() {
        return (Collection) this.V.invoke();
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean n() {
        return SM.k.d(this.G.H0()).booleanValue() && this.H.c(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        sb.append(J() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC0339Al
    public List v() {
        return this.N.i().m();
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean x() {
        return SM.f.d(this.G.H0()) == C9245wA0.c.COMPANION_OBJECT;
    }

    @Override // com.daaw.InterfaceC4923gl
    public AbstractC7958rc1 x0() {
        return (AbstractC7958rc1) this.Y.invoke();
    }
}
