package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class D30 {
    public final InterfaceC7530q30 a;

    public static final class a {
        public final I80 a;
        public final int b;

        public a(I80 i80, int i) {
            this.a = i80;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final I80 b() {
            return this.a;
        }
    }

    public static final class b {
        public final YS0 a;
        public final int b;
        public final boolean c;

        public b(YS0 ys0, int i, boolean z) {
            this.a = ys0;
            this.b = i;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final YS0 c() {
            return this.a;
        }
    }

    public D30(InterfaceC7530q30 interfaceC7530q30) {
        G10.g(interfaceC7530q30, "javaResolverSettings");
        this.a = interfaceC7530q30;
    }

    public static /* synthetic */ b c(D30 d30, YS0 ys0, NQ nq, int i, A71 a71, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        return d30.b(ys0, nq, i, a71, z, z2);
    }

    public final I80 a(I80 i80, NQ nq, boolean z) {
        G10.g(i80, "<this>");
        G10.g(nq, "qualifiers");
        return d(i80.Q0(), nq, 0, z).b();
    }

    public final b b(YS0 ys0, NQ nq, int i, A71 a71, boolean z, boolean z2) {
        C71 c71N0;
        Boolean bool;
        a aVar;
        InterfaceC6440m81 interfaceC6440m81S;
        NQ nq2 = nq;
        boolean zA = B71.a(a71);
        boolean z3 = (z2 && z) ? false : true;
        I80 i80 = null;
        if (!zA && ys0.L0().isEmpty()) {
            return new b(null, 1, false);
        }
        InterfaceC10240zl interfaceC10240zlC = ys0.N0().c();
        if (interfaceC10240zlC == null) {
            return new b(null, 1, false);
        }
        I30 i30 = (I30) nq2.invoke(Integer.valueOf(i));
        InterfaceC10240zl interfaceC10240zlF = N71.f(interfaceC10240zlC, i30, a71);
        Boolean boolH = N71.h(i30, a71);
        if (interfaceC10240zlF == null || (c71N0 = interfaceC10240zlF.k()) == null) {
            c71N0 = ys0.N0();
        }
        C71 c71 = c71N0;
        int iA = i + 1;
        List listL0 = ys0.L0();
        List parameters = c71.getParameters();
        G10.f(parameters, "getParameters(...)");
        List list = parameters;
        Iterator it = listL0.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1703Nm.v(listL0, 10), AbstractC1703Nm.v(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            Z71 z71 = (Z71) it2.next();
            InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) next;
            if (z3) {
                bool = boolH;
                if (!interfaceC6440m81.c()) {
                    aVar = d(interfaceC6440m81.getType().Q0(), nq2, iA, z2);
                } else if (((I30) nq2.invoke(Integer.valueOf(iA))).d() == EnumC3262ap0.B) {
                    AbstractC5708ja1 abstractC5708ja1Q0 = interfaceC6440m81.getType().Q0();
                    aVar = new a(M80.e(ZM.c(abstractC5708ja1Q0).R0(false), ZM.d(abstractC5708ja1Q0).R0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                bool = boolH;
                aVar = new a(i80, 0);
            }
            iA += aVar.a();
            if (aVar.b() != null) {
                I80 i80B = aVar.b();
                EnumC1042Hc1 enumC1042Hc1B = interfaceC6440m81.b();
                G10.f(enumC1042Hc1B, "getProjectionKind(...)");
                interfaceC6440m81S = H81.k(i80B, enumC1042Hc1B, z71);
            } else if (interfaceC10240zlF == null || interfaceC6440m81.c()) {
                interfaceC6440m81S = interfaceC10240zlF != null ? D81.s(z71) : null;
            } else {
                I80 type = interfaceC6440m81.getType();
                G10.f(type, "getType(...)");
                EnumC1042Hc1 enumC1042Hc1B2 = interfaceC6440m81.b();
                G10.f(enumC1042Hc1B2, "getProjectionKind(...)");
                interfaceC6440m81S = H81.k(type, enumC1042Hc1B2, z71);
            }
            arrayList.add(interfaceC6440m81S);
            nq2 = nq;
            boolH = bool;
            i80 = null;
        }
        Boolean bool2 = boolH;
        int i2 = iA - i;
        if (interfaceC10240zlF == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC6440m81) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i2, false);
        }
        InterfaceC3072a8 annotations = ys0.getAnnotations();
        UG ug = N71.b;
        if (interfaceC10240zlF == null) {
            ug = null;
        }
        C8387t71 c8387t71B = AbstractC8666u71.b(N71.e(AbstractC1599Mm.p(annotations, ug, bool2 != null ? N71.g() : null)));
        List listL02 = ys0.L0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listL02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC1703Nm.v(arrayList, 10), AbstractC1703Nm.v(listL02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            InterfaceC6440m81 interfaceC6440m812 = (InterfaceC6440m81) it5.next();
            InterfaceC6440m81 interfaceC6440m813 = (InterfaceC6440m81) next2;
            if (interfaceC6440m813 != null) {
                interfaceC6440m812 = interfaceC6440m813;
            }
            arrayList2.add(interfaceC6440m812);
        }
        YS0 ys0K = M80.k(c8387t71B, c71, arrayList2, bool2 != null ? bool2.booleanValue() : ys0.O0(), null, 16, null);
        if (i30.b()) {
            ys0K = e(ys0K);
        }
        return new b(ys0K, i2, bool2 != null && i30.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.D30.a d(com.daaw.AbstractC5708ja1 r21, com.daaw.NQ r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.D30.d(com.daaw.ja1, com.daaw.NQ, int, boolean):com.daaw.D30$a");
    }

    public final YS0 e(YS0 ys0) {
        return this.a.a() ? AbstractC7370pV0.h(ys0, true) : new C1193Io0(ys0);
    }
}
