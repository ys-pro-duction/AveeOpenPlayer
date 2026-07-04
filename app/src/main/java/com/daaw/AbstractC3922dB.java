package com.daaw;

import com.daaw.C1651Mz;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.dB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3922dB extends AbstractC4635fj0 {
    public static final /* synthetic */ W60[] f = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(AbstractC3922dB.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(AbstractC3922dB.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    public final BA b;
    public final a c;
    public final InterfaceC0881Fo0 d;
    public final InterfaceC4097dp0 e;

    /* JADX INFO: renamed from: com.daaw.dB$a */
    public interface a {
        Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0);

        Set b();

        Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0);

        Set d();

        void e(Collection collection, C1651Mz c1651Mz, NQ nq, InterfaceC7689qe0 interfaceC7689qe0);

        InterfaceC5586j71 f(C2352Tm0 c2352Tm0);

        Set g();
    }

    /* JADX INFO: renamed from: com.daaw.dB$b */
    public final class b implements a {
        public static final /* synthetic */ W60[] o = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        public final List a;
        public final List b;
        public final List c;
        public final InterfaceC0881Fo0 d;
        public final InterfaceC0881Fo0 e;
        public final InterfaceC0881Fo0 f;
        public final InterfaceC0881Fo0 g;
        public final InterfaceC0881Fo0 h;
        public final InterfaceC0881Fo0 i;
        public final InterfaceC0881Fo0 j;
        public final InterfaceC0881Fo0 k;
        public final InterfaceC0881Fo0 l;
        public final InterfaceC0881Fo0 m;
        public final /* synthetic */ AbstractC3922dB n;

        public b(AbstractC3922dB abstractC3922dB, List list, List list2, List list3) {
            G10.g(list, "functionList");
            G10.g(list2, "propertyList");
            G10.g(list3, "typeAliasList");
            this.n = abstractC3922dB;
            this.a = list;
            this.b = list2;
            this.c = abstractC3922dB.s().c().g().g() ? list3 : AbstractC1599Mm.k();
            this.d = abstractC3922dB.s().h().h(new C4200eB(this));
            this.e = abstractC3922dB.s().h().h(new C4479fB(this));
            this.f = abstractC3922dB.s().h().h(new C4768gB(this));
            this.g = abstractC3922dB.s().h().h(new C5047hB(this));
            this.h = abstractC3922dB.s().h().h(new C5326iB(this));
            this.i = abstractC3922dB.s().h().h(new C5603jB(this));
            this.j = abstractC3922dB.s().h().h(new C5885kB(this));
            this.k = abstractC3922dB.s().h().h(new C6173lB(this));
            this.l = abstractC3922dB.s().h().h(new C6452mB(this, abstractC3922dB));
            this.m = abstractC3922dB.s().h().h(new C6731nB(this, abstractC3922dB));
        }

        public static final List B(b bVar) {
            G10.g(bVar, "this$0");
            return bVar.w();
        }

        public static final List C(b bVar) {
            G10.g(bVar, "this$0");
            return bVar.z();
        }

        public static final Set D(b bVar, AbstractC3922dB abstractC3922dB) {
            G10.g(bVar, "this$0");
            G10.g(abstractC3922dB, "this$1");
            List list = bVar.a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC3922dB abstractC3922dB2 = bVar.n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC3252an0.b(abstractC3922dB2.s().g(), ((CA0) ((InterfaceC2026Qj0) it.next())).h0()));
            }
            return AbstractC10146zQ0.j(linkedHashSet, abstractC3922dB.w());
        }

        public static final Map E(b bVar) {
            G10.g(bVar, "this$0");
            List listF = bVar.F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listF) {
                C2352Tm0 name = ((IS0) obj).getName();
                G10.f(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        public static final Map N(b bVar) {
            G10.g(bVar, "this$0");
            List listG = bVar.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listG) {
                C2352Tm0 name = ((InterfaceC4476fA0) obj).getName();
                G10.f(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        public static final Map O(b bVar) {
            G10.g(bVar, "this$0");
            List listH = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(listH, 10)), 16));
            for (Object obj : listH) {
                C2352Tm0 name = ((InterfaceC5586j71) obj).getName();
                G10.f(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        public static final Set P(b bVar, AbstractC3922dB abstractC3922dB) {
            G10.g(bVar, "this$0");
            G10.g(abstractC3922dB, "this$1");
            List list = bVar.b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC3922dB abstractC3922dB2 = bVar.n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC3252an0.b(abstractC3922dB2.s().g(), ((HA0) ((InterfaceC2026Qj0) it.next())).g0()));
            }
            return AbstractC10146zQ0.j(linkedHashSet, abstractC3922dB.x());
        }

        public static final List r(b bVar) {
            G10.g(bVar, "this$0");
            return AbstractC2455Um.z0(bVar.I(), bVar.u());
        }

        public static final List s(b bVar) {
            G10.g(bVar, "this$0");
            return AbstractC2455Um.z0(bVar.J(), bVar.v());
        }

        public static final List t(b bVar) {
            G10.g(bVar, "this$0");
            return bVar.A();
        }

        public final List A() {
            List list = this.c;
            AbstractC3922dB abstractC3922dB = this.n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC5586j71 interfaceC5586j71Z = abstractC3922dB.s().f().z((LA0) ((InterfaceC2026Qj0) it.next()));
                if (interfaceC5586j71Z != null) {
                    arrayList.add(interfaceC5586j71Z);
                }
            }
            return arrayList;
        }

        public final List F() {
            return (List) AbstractC9895yX0.a(this.g, this, o[3]);
        }

        public final List G() {
            return (List) AbstractC9895yX0.a(this.h, this, o[4]);
        }

        public final List H() {
            return (List) AbstractC9895yX0.a(this.f, this, o[2]);
        }

        public final List I() {
            return (List) AbstractC9895yX0.a(this.d, this, o[0]);
        }

        public final List J() {
            return (List) AbstractC9895yX0.a(this.e, this, o[1]);
        }

        public final Map K() {
            return (Map) AbstractC9895yX0.a(this.j, this, o[6]);
        }

        public final Map L() {
            return (Map) AbstractC9895yX0.a(this.k, this, o[7]);
        }

        public final Map M() {
            return (Map) AbstractC9895yX0.a(this.i, this, o[5]);
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            G10.g(c2352Tm0, "name");
            G10.g(interfaceC7689qe0, "location");
            if (!d().contains(c2352Tm0)) {
                return AbstractC1599Mm.k();
            }
            Collection collection = (Collection) L().get(c2352Tm0);
            return collection == null ? AbstractC1599Mm.k() : collection;
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Set b() {
            return (Set) AbstractC9895yX0.a(this.l, this, o[8]);
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            G10.g(c2352Tm0, "name");
            G10.g(interfaceC7689qe0, "location");
            if (!b().contains(c2352Tm0)) {
                return AbstractC1599Mm.k();
            }
            Collection collection = (Collection) K().get(c2352Tm0);
            return collection == null ? AbstractC1599Mm.k() : collection;
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Set d() {
            return (Set) AbstractC9895yX0.a(this.m, this, o[9]);
        }

        @Override // com.daaw.AbstractC3922dB.a
        public void e(Collection collection, C1651Mz c1651Mz, NQ nq, InterfaceC7689qe0 interfaceC7689qe0) {
            G10.g(collection, "result");
            G10.g(c1651Mz, "kindFilter");
            G10.g(nq, "nameFilter");
            G10.g(interfaceC7689qe0, "location");
            if (c1651Mz.a(C1651Mz.c.i())) {
                for (Object obj : G()) {
                    C2352Tm0 name = ((InterfaceC4476fA0) obj).getName();
                    G10.f(name, "getName(...)");
                    if (((Boolean) nq.invoke(name)).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (c1651Mz.a(C1651Mz.c.d())) {
                for (Object obj2 : F()) {
                    C2352Tm0 name2 = ((IS0) obj2).getName();
                    G10.f(name2, "getName(...)");
                    if (((Boolean) nq.invoke(name2)).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // com.daaw.AbstractC3922dB.a
        public InterfaceC5586j71 f(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "name");
            return (InterfaceC5586j71) M().get(c2352Tm0);
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Set g() {
            List list = this.c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC3922dB abstractC3922dB = this.n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(AbstractC3252an0.b(abstractC3922dB.s().g(), ((LA0) ((InterfaceC2026Qj0) it.next())).a0()));
            }
            return linkedHashSet;
        }

        public final List u() {
            Set setW = this.n.w();
            ArrayList arrayList = new ArrayList();
            Iterator it = setW.iterator();
            while (it.hasNext()) {
                AbstractC2141Rm.A(arrayList, x((C2352Tm0) it.next()));
            }
            return arrayList;
        }

        public final List v() {
            Set setX = this.n.x();
            ArrayList arrayList = new ArrayList();
            Iterator it = setX.iterator();
            while (it.hasNext()) {
                AbstractC2141Rm.A(arrayList, y((C2352Tm0) it.next()));
            }
            return arrayList;
        }

        public final List w() {
            List list = this.a;
            AbstractC3922dB abstractC3922dB = this.n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                IS0 is0S = abstractC3922dB.s().f().s((CA0) ((InterfaceC2026Qj0) it.next()));
                if (!abstractC3922dB.A(is0S)) {
                    is0S = null;
                }
                if (is0S != null) {
                    arrayList.add(is0S);
                }
            }
            return arrayList;
        }

        public final List x(C2352Tm0 c2352Tm0) {
            List listI = I();
            AbstractC3922dB abstractC3922dB = this.n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (G10.c(((InterfaceC8612tw) obj).getName(), c2352Tm0)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC3922dB.n(c2352Tm0, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        public final List y(C2352Tm0 c2352Tm0) {
            List listJ = J();
            AbstractC3922dB abstractC3922dB = this.n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (G10.c(((InterfaceC8612tw) obj).getName(), c2352Tm0)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC3922dB.o(c2352Tm0, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        public final List z() {
            List list = this.b;
            AbstractC3922dB abstractC3922dB = this.n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC4476fA0 interfaceC4476fA0U = abstractC3922dB.s().f().u((HA0) ((InterfaceC2026Qj0) it.next()));
                if (interfaceC4476fA0U != null) {
                    arrayList.add(interfaceC4476fA0U);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.daaw.dB$c */
    public final class c implements a {
        public static final /* synthetic */ W60[] j = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        public final Map a;
        public final Map b;
        public final Map c;
        public final InterfaceC5471ij0 d;
        public final InterfaceC5471ij0 e;
        public final InterfaceC5752jj0 f;
        public final InterfaceC0881Fo0 g;
        public final InterfaceC0881Fo0 h;
        public final /* synthetic */ AbstractC3922dB i;

        /* JADX INFO: renamed from: com.daaw.dB$c$a */
        public static final class a implements LQ {
            public final /* synthetic */ InterfaceC2792Xs0 B;
            public final /* synthetic */ ByteArrayInputStream C;
            public final /* synthetic */ AbstractC3922dB D;

            public a(InterfaceC2792Xs0 interfaceC2792Xs0, ByteArrayInputStream byteArrayInputStream, AbstractC3922dB abstractC3922dB) {
                this.B = interfaceC2792Xs0;
                this.C = byteArrayInputStream;
                this.D = abstractC3922dB;
            }

            @Override // com.daaw.LQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2026Qj0 invoke() {
                return (InterfaceC2026Qj0) this.B.a(this.C, this.D.s().c().k());
            }
        }

        public c(AbstractC3922dB abstractC3922dB, List list, List list2, List list3) throws IOException {
            Map mapH;
            G10.g(list, "functionList");
            G10.g(list2, "propertyList");
            G10.g(list3, "typeAliasList");
            this.i = abstractC3922dB;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                C2352Tm0 c2352Tm0B = AbstractC3252an0.b(abstractC3922dB.s().g(), ((CA0) ((InterfaceC2026Qj0) obj)).h0());
                Object arrayList = linkedHashMap.get(c2352Tm0B);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(c2352Tm0B, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.a = r(linkedHashMap);
            AbstractC3922dB abstractC3922dB2 = this.i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                C2352Tm0 c2352Tm0B2 = AbstractC3252an0.b(abstractC3922dB2.s().g(), ((HA0) ((InterfaceC2026Qj0) obj2)).g0());
                Object arrayList2 = linkedHashMap2.get(c2352Tm0B2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(c2352Tm0B2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.b = r(linkedHashMap2);
            if (this.i.s().c().g().g()) {
                AbstractC3922dB abstractC3922dB3 = this.i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    C2352Tm0 c2352Tm0B3 = AbstractC3252an0.b(abstractC3922dB3.s().g(), ((LA0) ((InterfaceC2026Qj0) obj3)).a0());
                    Object arrayList3 = linkedHashMap3.get(c2352Tm0B3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(c2352Tm0B3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapH = r(linkedHashMap3);
            } else {
                mapH = AbstractC1473Lg0.h();
            }
            this.c = mapH;
            this.d = this.i.s().h().g(new C7010oB(this));
            this.e = this.i.s().h().g(new C7289pB(this));
            this.f = this.i.s().h().b(new C7568qB(this));
            this.g = this.i.s().h().h(new C7846rB(this, this.i));
            this.h = this.i.s().h().h(new C8125sB(this, this.i));
        }

        public static final Set p(c cVar, AbstractC3922dB abstractC3922dB) {
            G10.g(cVar, "this$0");
            G10.g(abstractC3922dB, "this$1");
            return AbstractC10146zQ0.j(cVar.a.keySet(), abstractC3922dB.w());
        }

        public static final Collection q(c cVar, C2352Tm0 c2352Tm0) {
            G10.g(cVar, "this$0");
            G10.g(c2352Tm0, "it");
            return cVar.m(c2352Tm0);
        }

        public static final Collection s(c cVar, C2352Tm0 c2352Tm0) {
            G10.g(cVar, "this$0");
            G10.g(c2352Tm0, "it");
            return cVar.n(c2352Tm0);
        }

        public static final InterfaceC5586j71 t(c cVar, C2352Tm0 c2352Tm0) {
            G10.g(cVar, "this$0");
            G10.g(c2352Tm0, "it");
            return cVar.o(c2352Tm0);
        }

        public static final Set u(c cVar, AbstractC3922dB abstractC3922dB) {
            G10.g(cVar, "this$0");
            G10.g(abstractC3922dB, "this$1");
            return AbstractC10146zQ0.j(cVar.b.keySet(), abstractC3922dB.x());
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            G10.g(c2352Tm0, "name");
            G10.g(interfaceC7689qe0, "location");
            return !d().contains(c2352Tm0) ? AbstractC1599Mm.k() : (Collection) this.e.invoke(c2352Tm0);
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Set b() {
            return (Set) AbstractC9895yX0.a(this.g, this, j[0]);
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
            G10.g(c2352Tm0, "name");
            G10.g(interfaceC7689qe0, "location");
            return !b().contains(c2352Tm0) ? AbstractC1599Mm.k() : (Collection) this.d.invoke(c2352Tm0);
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Set d() {
            return (Set) AbstractC9895yX0.a(this.h, this, j[1]);
        }

        @Override // com.daaw.AbstractC3922dB.a
        public void e(Collection collection, C1651Mz c1651Mz, NQ nq, InterfaceC7689qe0 interfaceC7689qe0) {
            G10.g(collection, "result");
            G10.g(c1651Mz, "kindFilter");
            G10.g(nq, "nameFilter");
            G10.g(interfaceC7689qe0, "location");
            if (c1651Mz.a(C1651Mz.c.i())) {
                Set<C2352Tm0> setD = d();
                ArrayList arrayList = new ArrayList();
                for (C2352Tm0 c2352Tm0 : setD) {
                    if (((Boolean) nq.invoke(c2352Tm0)).booleanValue()) {
                        arrayList.addAll(a(c2352Tm0, interfaceC7689qe0));
                    }
                }
                C2126Ri0 c2126Ri0 = C2126Ri0.B;
                G10.f(c2126Ri0, "INSTANCE");
                AbstractC2037Qm.z(arrayList, c2126Ri0);
                collection.addAll(arrayList);
            }
            if (c1651Mz.a(C1651Mz.c.d())) {
                Set<C2352Tm0> setB = b();
                ArrayList arrayList2 = new ArrayList();
                for (C2352Tm0 c2352Tm02 : setB) {
                    if (((Boolean) nq.invoke(c2352Tm02)).booleanValue()) {
                        arrayList2.addAll(c(c2352Tm02, interfaceC7689qe0));
                    }
                }
                C2126Ri0 c2126Ri02 = C2126Ri0.B;
                G10.f(c2126Ri02, "INSTANCE");
                AbstractC2037Qm.z(arrayList2, c2126Ri02);
                collection.addAll(arrayList2);
            }
        }

        @Override // com.daaw.AbstractC3922dB.a
        public InterfaceC5586j71 f(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "name");
            return (InterfaceC5586j71) this.f.invoke(c2352Tm0);
        }

        @Override // com.daaw.AbstractC3922dB.a
        public Set g() {
            return this.c.keySet();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection m(com.daaw.C2352Tm0 r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.a
                com.daaw.Xs0 r1 = com.daaw.CA0.X
                java.lang.String r2 = "PARSER"
                com.daaw.G10.f(r1, r2)
                com.daaw.dB r2 = r5.i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                com.daaw.dB r3 = r5.i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                com.daaw.dB$c$a r0 = new com.daaw.dB$c$a
                r0.<init>(r1, r4, r3)
                com.daaw.KP0 r0 = com.daaw.SP0.h(r0)
                java.util.List r0 = com.daaw.UP0.A(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = com.daaw.AbstractC1599Mm.k()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6b
                java.lang.Object r1 = r0.next()
                com.daaw.CA0 r1 = (com.daaw.CA0) r1
                com.daaw.BA r4 = r2.s()
                com.daaw.bj0 r4 = r4.f()
                com.daaw.G10.d(r1)
                com.daaw.IS0 r1 = r4.s(r1)
                boolean r4 = r2.A(r1)
                if (r4 == 0) goto L64
                goto L65
            L64:
                r1 = 0
            L65:
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L6b:
                r2.n(r6, r3)
                java.util.List r6 = com.daaw.AbstractC1392Km.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC3922dB.c.m(com.daaw.Tm0):java.util.Collection");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection n(com.daaw.C2352Tm0 r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.b
                com.daaw.Xs0 r1 = com.daaw.HA0.X
                java.lang.String r2 = "PARSER"
                com.daaw.G10.f(r1, r2)
                com.daaw.dB r2 = r5.i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                com.daaw.dB r3 = r5.i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                com.daaw.dB$c$a r0 = new com.daaw.dB$c$a
                r0.<init>(r1, r4, r3)
                com.daaw.KP0 r0 = com.daaw.SP0.h(r0)
                java.util.List r0 = com.daaw.UP0.A(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = com.daaw.AbstractC1599Mm.k()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L63
                java.lang.Object r1 = r0.next()
                com.daaw.HA0 r1 = (com.daaw.HA0) r1
                com.daaw.BA r4 = r2.s()
                com.daaw.bj0 r4 = r4.f()
                com.daaw.G10.d(r1)
                com.daaw.fA0 r1 = r4.u(r1)
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L63:
                r2.o(r6, r3)
                java.util.List r6 = com.daaw.AbstractC1392Km.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC3922dB.c.n(com.daaw.Tm0):java.util.Collection");
        }

        public final InterfaceC5586j71 o(C2352Tm0 c2352Tm0) {
            LA0 la0R0;
            byte[] bArr = (byte[]) this.c.get(c2352Tm0);
            if (bArr == null || (la0R0 = LA0.r0(new ByteArrayInputStream(bArr), this.i.s().c().k())) == null) {
                return null;
            }
            return this.i.s().f().z(la0R0);
        }

        public final Map r(Map map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1369Kg0.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((S) it.next()).i(byteArrayOutputStream);
                    arrayList.add(G91.a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    public AbstractC3922dB(BA ba, List list, List list2, List list3, LQ lq) {
        G10.g(ba, "c");
        G10.g(list, "functionList");
        G10.g(list2, "propertyList");
        G10.g(list3, "typeAliasList");
        G10.g(lq, "classNames");
        this.b = ba;
        this.c = q(list, list2, list3);
        this.d = ba.h().h(new C3365bB(lq));
        this.e = ba.h().a(new C3643cB(this));
    }

    public static final Set k(LQ lq) {
        G10.g(lq, "$classNames");
        return AbstractC2455Um.Q0((Iterable) lq.invoke());
    }

    public static final Set l(AbstractC3922dB abstractC3922dB) {
        G10.g(abstractC3922dB, "this$0");
        Set setV = abstractC3922dB.v();
        if (setV == null) {
            return null;
        }
        return AbstractC10146zQ0.j(AbstractC10146zQ0.j(abstractC3922dB.t(), abstractC3922dB.c.g()), setV);
    }

    public boolean A(IS0 is0) {
        G10.g(is0, "function");
        return true;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return this.c.a(c2352Tm0, interfaceC7689qe0);
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set b() {
        return this.c.b();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return this.c.c(c2352Tm0, interfaceC7689qe0);
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set d() {
        return this.c.d();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set e() {
        return u();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        if (z(c2352Tm0)) {
            return r(c2352Tm0);
        }
        if (this.c.g().contains(c2352Tm0)) {
            return y(c2352Tm0);
        }
        return null;
    }

    public abstract void j(Collection collection, NQ nq);

    public final Collection m(C1651Mz c1651Mz, NQ nq, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        G10.g(interfaceC7689qe0, "location");
        ArrayList arrayList = new ArrayList(0);
        C1651Mz.a aVar = C1651Mz.c;
        if (c1651Mz.a(aVar.g())) {
            j(arrayList, nq);
        }
        this.c.e(arrayList, c1651Mz, nq, interfaceC7689qe0);
        if (c1651Mz.a(aVar.c())) {
            for (C2352Tm0 c2352Tm0 : t()) {
                if (((Boolean) nq.invoke(c2352Tm0)).booleanValue()) {
                    AbstractC1392Km.a(arrayList, r(c2352Tm0));
                }
            }
        }
        if (c1651Mz.a(C1651Mz.c.h())) {
            for (C2352Tm0 c2352Tm02 : this.c.g()) {
                if (((Boolean) nq.invoke(c2352Tm02)).booleanValue()) {
                    AbstractC1392Km.a(arrayList, this.c.f(c2352Tm02));
                }
            }
        }
        return AbstractC1392Km.c(arrayList);
    }

    public void n(C2352Tm0 c2352Tm0, List list) {
        G10.g(c2352Tm0, "name");
        G10.g(list, "functions");
    }

    public void o(C2352Tm0 c2352Tm0, List list) {
        G10.g(c2352Tm0, "name");
        G10.g(list, "descriptors");
    }

    public abstract C6607ml p(C2352Tm0 c2352Tm0);

    public final a q(List list, List list2, List list3) {
        return this.b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    public final InterfaceC4923gl r(C2352Tm0 c2352Tm0) {
        return this.b.c().b(p(c2352Tm0));
    }

    public final BA s() {
        return this.b;
    }

    public final Set t() {
        return (Set) AbstractC9895yX0.a(this.d, this, f[0]);
    }

    public final Set u() {
        return (Set) AbstractC9895yX0.b(this.e, this, f[1]);
    }

    public abstract Set v();

    public abstract Set w();

    public abstract Set x();

    public final InterfaceC5586j71 y(C2352Tm0 c2352Tm0) {
        return this.c.f(c2352Tm0);
    }

    public boolean z(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return t().contains(c2352Tm0);
    }
}
