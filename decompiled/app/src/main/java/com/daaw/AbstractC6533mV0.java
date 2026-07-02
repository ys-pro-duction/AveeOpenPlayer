package com.daaw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.mV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6533mV0 {
    public static final a a = new a(null);
    public static final List b;
    public static final List c;
    public static final List d;
    public static final Map e;
    public static final Map f;
    public static final Set g;
    public static final Set h;
    public static final a.C0213a i;
    public static final Map j;
    public static final Map k;
    public static final Set l;
    public static final Set m;
    public static final Map n;

    /* JADX INFO: renamed from: com.daaw.mV0$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.mV0$a$a, reason: collision with other inner class name */
        public static final class C0213a {
            public final String a;
            public final C2352Tm0 b;
            public final String c;
            public final String d;
            public final String e;

            public C0213a(String str, C2352Tm0 c2352Tm0, String str2, String str3) {
                G10.g(str, "classInternalName");
                G10.g(c2352Tm0, "name");
                G10.g(str2, "parameters");
                G10.g(str3, "returnType");
                this.a = str;
                this.b = c2352Tm0;
                this.c = str2;
                this.d = str3;
                this.e = C7079oS0.a.l(str, c2352Tm0 + '(' + str2 + ')' + str3);
            }

            public static /* synthetic */ C0213a b(C0213a c0213a, String str, C2352Tm0 c2352Tm0, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0213a.a;
                }
                if ((i & 2) != 0) {
                    c2352Tm0 = c0213a.b;
                }
                if ((i & 4) != 0) {
                    str2 = c0213a.c;
                }
                if ((i & 8) != 0) {
                    str3 = c0213a.d;
                }
                return c0213a.a(str, c2352Tm0, str2, str3);
            }

            public final C0213a a(String str, C2352Tm0 c2352Tm0, String str2, String str3) {
                G10.g(str, "classInternalName");
                G10.g(c2352Tm0, "name");
                G10.g(str2, "parameters");
                G10.g(str3, "returnType");
                return new C0213a(str, c2352Tm0, str2, str3);
            }

            public final C2352Tm0 c() {
                return this.b;
            }

            public final String d() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0213a)) {
                    return false;
                }
                C0213a c0213a = (C0213a) obj;
                return G10.c(this.a, c0213a.a) && G10.c(this.b, c0213a.b) && G10.c(this.c, c0213a.c) && G10.c(this.d, c0213a.d);
            }

            public int hashCode() {
                return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.a + ", name=" + this.b + ", parameters=" + this.c + ", returnType=" + this.d + ')';
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C2352Tm0 b(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "name");
            return (C2352Tm0) f().get(c2352Tm0);
        }

        public final List c() {
            return AbstractC6533mV0.c;
        }

        public final Set d() {
            return AbstractC6533mV0.g;
        }

        public final Set e() {
            return AbstractC6533mV0.h;
        }

        public final Map f() {
            return AbstractC6533mV0.n;
        }

        public final Set g() {
            return AbstractC6533mV0.m;
        }

        public final C0213a h() {
            return AbstractC6533mV0.i;
        }

        public final Map i() {
            return AbstractC6533mV0.f;
        }

        public final Map j() {
            return AbstractC6533mV0.k;
        }

        public final boolean k(C2352Tm0 c2352Tm0) {
            G10.g(c2352Tm0, "<this>");
            return g().contains(c2352Tm0);
        }

        public final b l(String str) {
            G10.g(str, "builtinSignature");
            return c().contains(str) ? b.D : ((c) AbstractC1473Lg0.i(i(), str)) == c.C ? b.F : b.E;
        }

        public final C0213a m(String str, String str2, String str3, String str4) {
            C2352Tm0 c2352Tm0L = C2352Tm0.l(str2);
            G10.f(c2352Tm0L, "identifier(...)");
            return new C0213a(str, c2352Tm0L, str3, str4);
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.daaw.mV0$b */
    public static final class b {
        public static final b D = new b("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
        public static final b E = new b("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
        public static final b F = new b("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);
        public static final /* synthetic */ b[] G;
        public static final /* synthetic */ YG H;
        public final String B;
        public final boolean C;

        static {
            b[] bVarArrA = a();
            G = bVarArrA;
            H = AbstractC3110aH.a(bVarArrA);
        }

        public b(String str, int i, String str2, boolean z) {
            this.B = str2;
            this.C = z;
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{D, E, F};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) G.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.daaw.mV0$c */
    public static final class c {
        public static final c C = new c("NULL", 0, null);
        public static final c D = new c("INDEX", 1, -1);
        public static final c E = new c("FALSE", 2, Boolean.FALSE);
        public static final c F = new a("MAP_GET_OR_DEFAULT", 3);
        public static final /* synthetic */ c[] G;
        public static final /* synthetic */ YG H;
        public final Object B;

        /* JADX INFO: renamed from: com.daaw.mV0$c$a */
        public static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            public a(String str, int i) {
                AbstractC2911Yw abstractC2911Yw = null;
                super(str, i, abstractC2911Yw, abstractC2911Yw);
            }
        }

        static {
            c[] cVarArrA = a();
            G = cVarArrA;
            H = AbstractC3110aH.a(cVarArrA);
        }

        public /* synthetic */ c(String str, int i, Object obj, AbstractC2911Yw abstractC2911Yw) {
            this(str, i, obj);
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{C, D, E, F};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) G.clone();
        }

        public c(String str, int i, Object obj) {
            this.B = obj;
        }
    }

    static {
        Set<String> setG = AbstractC9867yQ0.g("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(setG, 10));
        for (String str : setG) {
            a aVar = a;
            String strH = EnumC6703n50.BOOLEAN.h();
            G10.f(strH, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", strH));
        }
        b = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((a.C0213a) it.next()).d());
        }
        c = arrayList3;
        List list = b;
        ArrayList arrayList4 = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0213a) it2.next()).c().c());
        }
        d = arrayList4;
        C7079oS0 c7079oS0 = C7079oS0.a;
        a aVar2 = a;
        String strI = c7079oS0.i("Collection");
        EnumC6703n50 enumC6703n50 = EnumC6703n50.BOOLEAN;
        String strH2 = enumC6703n50.h();
        G10.f(strH2, "getDesc(...)");
        a.C0213a c0213aM = aVar2.m(strI, "contains", "Ljava/lang/Object;", strH2);
        c cVar = c.E;
        C0576Cs0 c0576Cs0A = D61.a(c0213aM, cVar);
        String strI2 = c7079oS0.i("Collection");
        String strH3 = enumC6703n50.h();
        G10.f(strH3, "getDesc(...)");
        C0576Cs0 c0576Cs0A2 = D61.a(aVar2.m(strI2, "remove", "Ljava/lang/Object;", strH3), cVar);
        String strI3 = c7079oS0.i("Map");
        String strH4 = enumC6703n50.h();
        G10.f(strH4, "getDesc(...)");
        C0576Cs0 c0576Cs0A3 = D61.a(aVar2.m(strI3, "containsKey", "Ljava/lang/Object;", strH4), cVar);
        String strI4 = c7079oS0.i("Map");
        String strH5 = enumC6703n50.h();
        G10.f(strH5, "getDesc(...)");
        C0576Cs0 c0576Cs0A4 = D61.a(aVar2.m(strI4, "containsValue", "Ljava/lang/Object;", strH5), cVar);
        String strI5 = c7079oS0.i("Map");
        String strH6 = enumC6703n50.h();
        G10.f(strH6, "getDesc(...)");
        C0576Cs0 c0576Cs0A5 = D61.a(aVar2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strH6), cVar);
        C0576Cs0 c0576Cs0A6 = D61.a(aVar2.m(c7079oS0.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.F);
        a.C0213a c0213aM2 = aVar2.m(c7079oS0.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.C;
        C0576Cs0 c0576Cs0A7 = D61.a(c0213aM2, cVar2);
        C0576Cs0 c0576Cs0A8 = D61.a(aVar2.m(c7079oS0.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strI6 = c7079oS0.i("List");
        EnumC6703n50 enumC6703n502 = EnumC6703n50.INT;
        String strH7 = enumC6703n502.h();
        G10.f(strH7, "getDesc(...)");
        a.C0213a c0213aM3 = aVar2.m(strI6, "indexOf", "Ljava/lang/Object;", strH7);
        c cVar3 = c.D;
        C0576Cs0 c0576Cs0A9 = D61.a(c0213aM3, cVar3);
        String strI7 = c7079oS0.i("List");
        String strH8 = enumC6703n502.h();
        G10.f(strH8, "getDesc(...)");
        Map mapK = AbstractC1473Lg0.k(c0576Cs0A, c0576Cs0A2, c0576Cs0A3, c0576Cs0A4, c0576Cs0A5, c0576Cs0A6, c0576Cs0A7, c0576Cs0A8, c0576Cs0A9, D61.a(aVar2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", strH8), cVar3));
        e = mapK;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1369Kg0.d(mapK.size()));
        for (Map.Entry entry : mapK.entrySet()) {
            linkedHashMap.put(((a.C0213a) entry.getKey()).d(), entry.getValue());
        }
        f = linkedHashMap;
        Set setJ = AbstractC10146zQ0.j(e.keySet(), b);
        ArrayList arrayList5 = new ArrayList(AbstractC1703Nm.v(setJ, 10));
        Iterator it3 = setJ.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((a.C0213a) it3.next()).c());
        }
        g = AbstractC2455Um.Q0(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC1703Nm.v(setJ, 10));
        Iterator it4 = setJ.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((a.C0213a) it4.next()).d());
        }
        h = AbstractC2455Um.Q0(arrayList6);
        a aVar3 = a;
        EnumC6703n50 enumC6703n503 = EnumC6703n50.INT;
        String strH9 = enumC6703n503.h();
        G10.f(strH9, "getDesc(...)");
        a.C0213a c0213aM4 = aVar3.m("java/util/List", "removeAt", strH9, "Ljava/lang/Object;");
        i = c0213aM4;
        C7079oS0 c7079oS02 = C7079oS0.a;
        String strH10 = c7079oS02.h("Number");
        String strH11 = EnumC6703n50.BYTE.h();
        G10.f(strH11, "getDesc(...)");
        C0576Cs0 c0576Cs0A10 = D61.a(aVar3.m(strH10, "toByte", "", strH11), C2352Tm0.l("byteValue"));
        String strH12 = c7079oS02.h("Number");
        String strH13 = EnumC6703n50.SHORT.h();
        G10.f(strH13, "getDesc(...)");
        C0576Cs0 c0576Cs0A11 = D61.a(aVar3.m(strH12, "toShort", "", strH13), C2352Tm0.l("shortValue"));
        String strH14 = c7079oS02.h("Number");
        String strH15 = enumC6703n503.h();
        G10.f(strH15, "getDesc(...)");
        C0576Cs0 c0576Cs0A12 = D61.a(aVar3.m(strH14, "toInt", "", strH15), C2352Tm0.l("intValue"));
        String strH16 = c7079oS02.h("Number");
        String strH17 = EnumC6703n50.LONG.h();
        G10.f(strH17, "getDesc(...)");
        C0576Cs0 c0576Cs0A13 = D61.a(aVar3.m(strH16, "toLong", "", strH17), C2352Tm0.l("longValue"));
        String strH18 = c7079oS02.h("Number");
        String strH19 = EnumC6703n50.FLOAT.h();
        G10.f(strH19, "getDesc(...)");
        C0576Cs0 c0576Cs0A14 = D61.a(aVar3.m(strH18, "toFloat", "", strH19), C2352Tm0.l("floatValue"));
        String strH20 = c7079oS02.h("Number");
        String strH21 = EnumC6703n50.DOUBLE.h();
        G10.f(strH21, "getDesc(...)");
        C0576Cs0 c0576Cs0A15 = D61.a(aVar3.m(strH20, "toDouble", "", strH21), C2352Tm0.l("doubleValue"));
        C0576Cs0 c0576Cs0A16 = D61.a(c0213aM4, C2352Tm0.l("remove"));
        String strH22 = c7079oS02.h("CharSequence");
        String strH23 = enumC6703n503.h();
        G10.f(strH23, "getDesc(...)");
        String strH24 = EnumC6703n50.CHAR.h();
        G10.f(strH24, "getDesc(...)");
        Map mapK2 = AbstractC1473Lg0.k(c0576Cs0A10, c0576Cs0A11, c0576Cs0A12, c0576Cs0A13, c0576Cs0A14, c0576Cs0A15, c0576Cs0A16, D61.a(aVar3.m(strH22, "get", strH23, strH24), C2352Tm0.l("charAt")));
        j = mapK2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC1369Kg0.d(mapK2.size()));
        for (Map.Entry entry2 : mapK2.entrySet()) {
            linkedHashMap2.put(((a.C0213a) entry2.getKey()).d(), entry2.getValue());
        }
        k = linkedHashMap2;
        Map map = j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(a.C0213a.b((a.C0213a) entry3.getKey(), null, (C2352Tm0) entry3.getValue(), null, null, 13, null).d());
        }
        l = linkedHashSet;
        Set setKeySet = j.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((a.C0213a) it5.next()).c());
        }
        m = hashSet;
        Set<Map.Entry> setEntrySet = j.entrySet();
        ArrayList<C0576Cs0> arrayList7 = new ArrayList(AbstractC1703Nm.v(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new C0576Cs0(((a.C0213a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(arrayList7, 10)), 16));
        for (C0576Cs0 c0576Cs0 : arrayList7) {
            linkedHashMap3.put((C2352Tm0) c0576Cs0.d(), (C2352Tm0) c0576Cs0.c());
        }
        n = linkedHashMap3;
    }
}
