package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class U71 {
    public static final U71 a = new U71();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a B = new c("START", 0);
        public static final a C = new C0123a("ACCEPT_NULL", 1);
        public static final a D = new d("UNKNOWN", 2);
        public static final a E = new b("NOT_NULL", 3);
        public static final /* synthetic */ a[] F;
        public static final /* synthetic */ YG G;

        /* JADX INFO: renamed from: com.daaw.U71$a$a, reason: collision with other inner class name */
        public static final class C0123a extends a {
            public C0123a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.daaw.U71.a
            public a c(AbstractC5708ja1 abstractC5708ja1) {
                G10.g(abstractC5708ja1, "nextType");
                return g(abstractC5708ja1);
            }
        }

        public static final class b extends a {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.daaw.U71.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public b c(AbstractC5708ja1 abstractC5708ja1) {
                G10.g(abstractC5708ja1, "nextType");
                return this;
            }
        }

        public static final class c extends a {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.daaw.U71.a
            public a c(AbstractC5708ja1 abstractC5708ja1) {
                G10.g(abstractC5708ja1, "nextType");
                return g(abstractC5708ja1);
            }
        }

        public static final class d extends a {
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // com.daaw.U71.a
            public a c(AbstractC5708ja1 abstractC5708ja1) {
                G10.g(abstractC5708ja1, "nextType");
                a aVarG = g(abstractC5708ja1);
                return aVarG == a.C ? this : aVarG;
            }
        }

        static {
            a[] aVarArrA = a();
            F = aVarArrA;
            G = AbstractC3110aH.a(aVarArrA);
        }

        public /* synthetic */ a(String str, int i, AbstractC2911Yw abstractC2911Yw) {
            this(str, i);
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{B, C, D, E};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) F.clone();
        }

        public abstract a c(AbstractC5708ja1 abstractC5708ja1);

        public final a g(AbstractC5708ja1 abstractC5708ja1) {
            G10.g(abstractC5708ja1, "<this>");
            if (abstractC5708ja1.O0()) {
                return C;
            }
            if (abstractC5708ja1 instanceof C8906uy) {
                ((C8906uy) abstractC5708ja1).Z0();
            }
            return C2984Zo0.a.a(abstractC5708ja1) ? E : D;
        }

        public a(String str, int i) {
        }
    }

    public /* synthetic */ class b extends AbstractC9312wR implements InterfaceC3429bR {
        public b(Object obj) {
            super(2, obj);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(U71.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(I80 i80, I80 i802) {
            G10.g(i80, "p0");
            G10.g(i802, "p1");
            return Boolean.valueOf(((U71) this.receiver).g(i80, i802));
        }
    }

    public /* synthetic */ class c extends AbstractC9312wR implements InterfaceC3429bR {
        public c(Object obj) {
            super(2, obj);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "equalTypes";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(C2772Xn0.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(I80 i80, I80 i802) {
            G10.g(i80, "p0");
            G10.g(i802, "p1");
            return Boolean.valueOf(((C2772Xn0) this.receiver).d(i80, i802));
        }
    }

    public static final String f(Set set) {
        G10.g(set, "$inputTypes");
        return "This collections cannot be empty! input types: " + AbstractC2455Um.n0(set, null, null, null, 0, null, null, 63, null);
    }

    public final Collection c(Collection collection, InterfaceC3429bR interfaceC3429bR) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        G10.f(it, "iterator(...)");
        while (it.hasNext()) {
            YS0 ys0 = (YS0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    YS0 ys02 = (YS0) it2.next();
                    if (ys02 != ys0) {
                        G10.d(ys02);
                        G10.d(ys0);
                        if (((Boolean) interfaceC3429bR.invoke(ys02, ys0)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final YS0 d(List list) {
        G10.g(list, "types");
        list.size();
        ArrayList<YS0> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            YS0 ys0 = (YS0) it.next();
            if (ys0.N0() instanceof B10) {
                Collection collectionB = ys0.N0().b();
                G10.f(collectionB, "getSupertypes(...)");
                Collection<I80> collection = collectionB;
                ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(collection, 10));
                for (I80 i80 : collection) {
                    G10.d(i80);
                    YS0 ys0D = ZM.d(i80);
                    if (ys0.O0()) {
                        ys0D = ys0D.R0(true);
                    }
                    arrayList2.add(ys0D);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(ys0);
            }
        }
        a aVarC = a.B;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVarC = aVarC.c((AbstractC5708ja1) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (YS0 ys0I : arrayList) {
            if (aVarC == a.E) {
                if (ys0I instanceof C1604Mn0) {
                    ys0I = AbstractC7370pV0.k((C1604Mn0) ys0I);
                }
                ys0I = AbstractC7370pV0.i(ys0I, false, 1, null);
            }
            linkedHashSet.add(ys0I);
        }
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((YS0) it3.next()).M0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((C8387t71) next).D((C8387t71) it4.next());
        }
        return e(linkedHashSet).T0((C8387t71) next);
    }

    public final YS0 e(Set set) {
        if (set.size() == 1) {
            return (YS0) AbstractC2455Um.B0(set);
        }
        new T71(set);
        Set set2 = set;
        Collection collectionC = c(set2, new b(this));
        collectionC.isEmpty();
        YS0 ys0B = Q00.f.b(collectionC);
        if (ys0B != null) {
            return ys0B;
        }
        Collection collectionC2 = c(collectionC, new c(InterfaceC2668Wn0.b.a()));
        collectionC2.isEmpty();
        return collectionC2.size() < 2 ? (YS0) AbstractC2455Um.B0(collectionC2) : new B10(set2).j();
    }

    public final boolean g(I80 i80, I80 i802) {
        C2772Xn0 c2772Xn0A = InterfaceC2668Wn0.b.a();
        return c2772Xn0A.b(i80, i802) && !c2772Xn0A.b(i802, i80);
    }
}
