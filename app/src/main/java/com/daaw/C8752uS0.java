package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.uS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8752uS0 {
    public final D30 a;

    public C8752uS0(D30 d30) {
        G10.g(d30, "typeEnhancement");
        this.a = d30;
    }

    public static final Boolean g(AbstractC5708ja1 abstractC5708ja1) {
        InterfaceC10240zl interfaceC10240zlC = abstractC5708ja1.N0().c();
        if (interfaceC10240zlC == null) {
            return Boolean.FALSE;
        }
        C2352Tm0 name = interfaceC10240zlC.getName();
        C9489x30 c9489x30 = C9489x30.a;
        return Boolean.valueOf(G10.c(name, c9489x30.h().g()) && G10.c(AbstractC8400tA.k(interfaceC10240zlC), c9489x30.h()));
    }

    public static /* synthetic */ I80 j(C8752uS0 c8752uS0, InterfaceC1583Mi interfaceC1583Mi, A7 a7, boolean z, C0504Ca0 c0504Ca0, S7 s7, M71 m71, boolean z2, NQ nq, int i, Object obj) {
        return c8752uS0.h(interfaceC1583Mi, a7, z, c0504Ca0, s7, m71, (i & 32) != 0 ? false : z2, nq);
    }

    public static /* synthetic */ I80 k(C8752uS0 c8752uS0, C9317wS0 c9317wS0, I80 i80, List list, M71 m71, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            m71 = null;
        }
        return c8752uS0.i(c9317wS0, i80, list, m71, (i & 8) != 0 ? false : z);
    }

    public static final I80 m(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "it");
        RE0 re0I0 = interfaceC1583Mi.i0();
        G10.d(re0I0);
        I80 type = re0I0.getType();
        G10.f(type, "getType(...)");
        return type;
    }

    public static final I80 n(InterfaceC9918yc1 interfaceC9918yc1, InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "it");
        I80 type = ((InterfaceC9918yc1) interfaceC1583Mi.h().get(interfaceC9918yc1.getIndex())).getType();
        G10.f(type, "getType(...)");
        return type;
    }

    public static final I80 o(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "it");
        I80 returnType = interfaceC1583Mi.getReturnType();
        G10.d(returnType);
        return returnType;
    }

    public static final boolean s(AbstractC5708ja1 abstractC5708ja1) {
        G10.g(abstractC5708ja1, "it");
        return abstractC5708ja1 instanceof BE0;
    }

    public final boolean f(I80 i80) {
        return D81.c(i80, C8473tS0.B);
    }

    public final I80 h(InterfaceC1583Mi interfaceC1583Mi, A7 a7, boolean z, C0504Ca0 c0504Ca0, S7 s7, M71 m71, boolean z2, NQ nq) {
        C9317wS0 c9317wS0 = new C9317wS0(a7, z, c0504Ca0, s7, false, 16, null);
        I80 i80 = (I80) nq.invoke(interfaceC1583Mi);
        Collection collectionE = interfaceC1583Mi.e();
        G10.f(collectionE, "getOverriddenDescriptors(...)");
        Collection<InterfaceC1583Mi> collection = collectionE;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collection, 10));
        for (InterfaceC1583Mi interfaceC1583Mi2 : collection) {
            G10.d(interfaceC1583Mi2);
            arrayList.add((I80) nq.invoke(interfaceC1583Mi2));
        }
        return i(c9317wS0, i80, arrayList, m71, z2);
    }

    public final I80 i(C9317wS0 c9317wS0, I80 i80, List list, M71 m71, boolean z) {
        return this.a.a(i80, c9317wS0.d(i80, list, m71, z), c9317wS0.z());
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f8, code lost:
    
        if (r3 == null) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.InterfaceC1583Mi l(com.daaw.InterfaceC1583Mi r18, com.daaw.C0504Ca0 r19) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8752uS0.l(com.daaw.Mi, com.daaw.Ca0):com.daaw.Mi");
    }

    public final Collection p(C0504Ca0 c0504Ca0, Collection collection) {
        G10.g(c0504Ca0, "c");
        G10.g(collection, "platformSignatures");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(l((InterfaceC1583Mi) it.next(), c0504Ca0));
        }
        return arrayList;
    }

    public final I80 q(I80 i80, C0504Ca0 c0504Ca0) {
        G10.g(i80, "type");
        G10.g(c0504Ca0, "context");
        I80 i80K = k(this, new C9317wS0(null, false, c0504Ca0, S7.F, true), i80, AbstractC1599Mm.k(), null, false, 12, null);
        return i80K == null ? i80 : i80K;
    }

    public final List r(Z71 z71, List list, C0504Ca0 c0504Ca0) {
        I80 i80;
        I80 i80K;
        G10.g(z71, "typeParameter");
        G10.g(list, "bounds");
        G10.g(c0504Ca0, "context");
        List<I80> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        for (I80 i802 : list2) {
            if (H81.e(i802, C8194sS0.B)) {
                i80 = i802;
            } else {
                i80 = i802;
                i80K = k(this, new C9317wS0(z71, false, c0504Ca0, S7.G, false, 16, null), i80, AbstractC1599Mm.k(), null, false, 12, null);
                if (i80K == null) {
                }
                arrayList.add(i80K);
            }
            i80K = i80;
            arrayList.add(i80K);
        }
        return arrayList;
    }

    public final I80 t(InterfaceC1583Mi interfaceC1583Mi, InterfaceC9918yc1 interfaceC9918yc1, C0504Ca0 c0504Ca0, M71 m71, boolean z, NQ nq) {
        C0504Ca0 c0504Ca0K;
        return h(interfaceC1583Mi, interfaceC9918yc1, false, (interfaceC9918yc1 == null || (c0504Ca0K = AbstractC10275zs.k(c0504Ca0, interfaceC9918yc1.getAnnotations())) == null) ? c0504Ca0 : c0504Ca0K, S7.D, m71, z, nq);
    }

    public final InterfaceC3072a8 u(InterfaceC1583Mi interfaceC1583Mi, C0504Ca0 c0504Ca0) {
        InterfaceC10240zl interfaceC10240zlA = AbstractC6727nA.a(interfaceC1583Mi);
        if (interfaceC10240zlA == null) {
            return interfaceC1583Mi.getAnnotations();
        }
        C4869ga0 c4869ga0 = interfaceC10240zlA instanceof C4869ga0 ? (C4869ga0) interfaceC10240zlA : null;
        List listT0 = c4869ga0 != null ? c4869ga0.T0() : null;
        List list = listT0;
        if (list == null || list.isEmpty()) {
            return interfaceC1583Mi.getAnnotations();
        }
        List list2 = listT0;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Z90(c0504Ca0, (InterfaceC7525q20) it.next(), true));
        }
        return InterfaceC3072a8.b.a(AbstractC2455Um.x0(interfaceC1583Mi.getAnnotations(), arrayList));
    }
}
