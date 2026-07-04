package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D81 {
    public static final YS0 a = BH.d(AH.f0, new String[0]);
    public static final YS0 b = BH.d(AH.Y, new String[0]);
    public static final YS0 c = new a("NO_EXPECTED_TYPE");
    public static final YS0 d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends AbstractC2711Wy {
        public final String C;

        public a(String str) {
            this.C = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = 3
                goto L14
            L13:
                r5 = 2
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.D81.a.Z0(int):void");
        }

        @Override // com.daaw.AbstractC5708ja1
        /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
        public YS0 R0(boolean z) {
            throw new IllegalStateException(this.C);
        }

        @Override // com.daaw.AbstractC5708ja1
        /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
        public YS0 T0(C8387t71 c8387t71) {
            if (c8387t71 == null) {
                Z0(0);
            }
            throw new IllegalStateException(this.C);
        }

        @Override // com.daaw.AbstractC2711Wy
        public YS0 W0() {
            throw new IllegalStateException(this.C);
        }

        @Override // com.daaw.AbstractC2711Wy
        public AbstractC2711Wy Y0(YS0 ys0) {
            if (ys0 == null) {
                Z0(2);
            }
            throw new IllegalStateException(this.C);
        }

        @Override // com.daaw.AbstractC2711Wy
        /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a X0(Q80 q80) {
            if (q80 == null) {
                Z0(3);
            }
            return this;
        }

        @Override // com.daaw.YS0
        public String toString() {
            String str = this.C;
            if (str == null) {
                Z0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.D81.a(int):void");
    }

    public static boolean b(I80 i80) {
        if (i80 == null) {
            a(28);
        }
        if (i80.O0()) {
            return true;
        }
        return ZM.b(i80) && b(ZM.a(i80).W0());
    }

    public static boolean c(I80 i80, NQ nq) {
        if (nq == null) {
            a(43);
        }
        return d(i80, nq, null);
    }

    public static boolean d(I80 i80, NQ nq, VT0 vt0) {
        if (nq == null) {
            a(44);
        }
        if (i80 == null) {
            return false;
        }
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (w(i80)) {
            return ((Boolean) nq.invoke(abstractC5708ja1Q0)).booleanValue();
        }
        if (vt0 != null && vt0.contains(i80)) {
            return false;
        }
        if (((Boolean) nq.invoke(abstractC5708ja1Q0)).booleanValue()) {
            return true;
        }
        if (vt0 == null) {
            vt0 = VT0.s();
        }
        vt0.add(i80);
        UM um = abstractC5708ja1Q0 instanceof UM ? (UM) abstractC5708ja1Q0 : null;
        if (um != null && (d(um.V0(), nq, vt0) || d(um.W0(), nq, vt0))) {
            return true;
        }
        if ((abstractC5708ja1Q0 instanceof C8906uy) && d(((C8906uy) abstractC5708ja1Q0).Z0(), nq, vt0)) {
            return true;
        }
        C71 c71N0 = i80.N0();
        if (c71N0 instanceof B10) {
            Iterator it = ((B10) c71N0).b().iterator();
            while (it.hasNext()) {
                if (d((I80) it.next(), nq, vt0)) {
                    return true;
                }
            }
            return false;
        }
        for (InterfaceC6440m81 interfaceC6440m81 : i80.L0()) {
            if (!interfaceC6440m81.c()) {
                if (d(interfaceC6440m81.getType(), nq, vt0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static I80 e(I80 i80, I80 i802, C8957v81 c8957v81) {
        if (i80 == null) {
            a(20);
        }
        if (i802 == null) {
            a(21);
        }
        if (c8957v81 == null) {
            a(22);
        }
        I80 i80P = c8957v81.p(i802, EnumC1042Hc1.F);
        if (i80P != null) {
            return q(i80P, i80.O0());
        }
        return null;
    }

    public static InterfaceC4923gl f(I80 i80) {
        if (i80 == null) {
            a(30);
        }
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC instanceof InterfaceC4923gl) {
            return (InterfaceC4923gl) interfaceC10240zlC;
        }
        return null;
    }

    public static List g(List list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C6998o81(((Z71) it.next()).s()));
        }
        List listM0 = AbstractC2455Um.M0(arrayList);
        if (listM0 == null) {
            a(17);
        }
        return listM0;
    }

    public static List h(I80 i80) {
        if (i80 == null) {
            a(18);
        }
        C8957v81 c8957v81F = C8957v81.f(i80);
        Collection collectionB = i80.N0().b();
        ArrayList arrayList = new ArrayList(collectionB.size());
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            I80 i80E = e(i80, (I80) it.next(), c8957v81F);
            if (i80E != null) {
                arrayList.add(i80E);
            }
        }
        return arrayList;
    }

    public static Z71 i(I80 i80) {
        if (i80 == null) {
            a(63);
        }
        if (i80.N0().c() instanceof Z71) {
            return (Z71) i80.N0().c();
        }
        return null;
    }

    public static boolean j(I80 i80) {
        if (i80 == null) {
            a(29);
        }
        if (i80.N0().c() instanceof InterfaceC4923gl) {
            return false;
        }
        Iterator it = h(i80).iterator();
        while (it.hasNext()) {
            if (l((I80) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(I80 i80) {
        return i80 != null && i80.N0() == a.N0();
    }

    public static boolean l(I80 i80) {
        if (i80 == null) {
            a(27);
        }
        if (i80.O0()) {
            return true;
        }
        if (ZM.b(i80) && l(ZM.a(i80).W0())) {
            return true;
        }
        if (AbstractC7370pV0.c(i80)) {
            return false;
        }
        if (m(i80)) {
            return j(i80);
        }
        C71 c71N0 = i80.N0();
        if (c71N0 instanceof B10) {
            Iterator it = c71N0.b().iterator();
            while (it.hasNext()) {
                if (l((I80) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(I80 i80) {
        if (i80 == null) {
            a(60);
        }
        if (i(i80) != null) {
            return true;
        }
        i80.N0();
        return false;
    }

    public static I80 n(I80 i80) {
        if (i80 == null) {
            a(2);
        }
        return p(i80, false);
    }

    public static I80 o(I80 i80) {
        if (i80 == null) {
            a(1);
        }
        return p(i80, true);
    }

    public static I80 p(I80 i80, boolean z) {
        if (i80 == null) {
            a(3);
        }
        AbstractC5708ja1 abstractC5708ja1R0 = i80.Q0().R0(z);
        if (abstractC5708ja1R0 == null) {
            a(4);
        }
        return abstractC5708ja1R0;
    }

    public static I80 q(I80 i80, boolean z) {
        if (i80 == null) {
            a(8);
        }
        if (z) {
            return o(i80);
        }
        if (i80 == null) {
            a(9);
        }
        return i80;
    }

    public static YS0 r(YS0 ys0, boolean z) {
        if (ys0 == null) {
            a(5);
        }
        if (!z) {
            if (ys0 == null) {
                a(7);
            }
            return ys0;
        }
        YS0 ys0R0 = ys0.R0(true);
        if (ys0R0 == null) {
            a(6);
        }
        return ys0R0;
    }

    public static InterfaceC6440m81 s(Z71 z71) {
        if (z71 == null) {
            a(45);
        }
        return new C3450bW0(z71);
    }

    public static InterfaceC6440m81 t(Z71 z71, AbstractC6476mH abstractC6476mH) {
        if (z71 == null) {
            a(46);
        }
        return abstractC6476mH.b() == C81.B ? new C6998o81(AbstractC3728cW0.b(z71)) : new C3450bW0(z71);
    }

    public static YS0 u(InterfaceC10240zl interfaceC10240zl, InterfaceC4346ej0 interfaceC4346ej0, NQ nq) {
        if (!BH.m(interfaceC10240zl)) {
            return v(interfaceC10240zl.k(), interfaceC4346ej0, nq);
        }
        C9830yH c9830yHD = BH.d(AH.e0, interfaceC10240zl.toString());
        if (c9830yHD == null) {
            a(11);
        }
        return c9830yHD;
    }

    public static YS0 v(C71 c71, InterfaceC4346ej0 interfaceC4346ej0, NQ nq) {
        if (c71 == null) {
            a(12);
        }
        if (interfaceC4346ej0 == null) {
            a(13);
        }
        if (nq == null) {
            a(14);
        }
        YS0 ys0N = M80.n(C8387t71.C.j(), c71, g(c71.getParameters()), false, interfaceC4346ej0, nq);
        if (ys0N == null) {
            a(15);
        }
        return ys0N;
    }

    public static boolean w(I80 i80) {
        if (i80 == null) {
            a(0);
        }
        return i80 == c || i80 == d;
    }
}
