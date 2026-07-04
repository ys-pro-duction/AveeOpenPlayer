package com.daaw;

import com.daaw.InterfaceC1583Mi;
import com.daaw.InterfaceC8157sJ;
import com.daaw.J80;
import com.daaw.P80;
import com.daaw.Q80;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Er0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0789Er0 {
    public static final List e = AbstractC2455Um.M0(ServiceLoader.load(InterfaceC8157sJ.class, InterfaceC8157sJ.class.getClassLoader()));
    public static final C0789Er0 f;
    public static final J80.a g;
    public final Q80 a;
    public final P80 b;
    public final J80.a c;
    public final InterfaceC3429bR d;

    /* JADX INFO: renamed from: com.daaw.Er0$a */
    public static class a implements J80.a {
        public static /* synthetic */ void b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.J80.a
        public boolean a(C71 c71, C71 c712) {
            if (c71 == null) {
                b(0);
            }
            if (c712 == null) {
                b(1);
            }
            return c71.equals(c712);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er0$b */
    public static class b implements InterfaceC3429bR {
        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0576Cs0 invoke(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2) {
            return new C0576Cs0(interfaceC1376Ki, interfaceC1376Ki2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er0$c */
    public static class c implements NQ {
        public final /* synthetic */ InterfaceC8612tw B;

        public c(InterfaceC8612tw interfaceC8612tw) {
            this.B = interfaceC8612tw;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC1583Mi interfaceC1583Mi) {
            return Boolean.valueOf(interfaceC1583Mi.b() == this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er0$e */
    public static class e implements NQ {
        public final /* synthetic */ InterfaceC4923gl B;

        public e(InterfaceC4923gl interfaceC4923gl) {
            this.B = interfaceC4923gl;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC1583Mi interfaceC1583Mi) {
            boolean z = false;
            if (!AbstractC8679uA.g(interfaceC1583Mi.getVisibility()) && AbstractC8679uA.h(interfaceC1583Mi, this.B, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er0$g */
    public static class g implements NQ {
        public final /* synthetic */ AbstractC0685Dr0 B;
        public final /* synthetic */ InterfaceC1583Mi C;

        public g(AbstractC0685Dr0 abstractC0685Dr0, InterfaceC1583Mi interfaceC1583Mi) {
            this.B = abstractC0685Dr0;
            this.C = interfaceC1583Mi;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public G91 invoke(InterfaceC1583Mi interfaceC1583Mi) {
            this.B.b(this.C, interfaceC1583Mi);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er0$h */
    public static /* synthetic */ class h {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[EnumC0336Ak0.values().length];
            c = iArr;
            try {
                iArr[EnumC0336Ak0.C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[EnumC0336Ak0.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[EnumC0336Ak0.E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[EnumC0336Ak0.F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[InterfaceC8157sJ.b.values().length];
            a = iArr3;
            try {
                iArr3[InterfaceC8157sJ.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[InterfaceC8157sJ.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[InterfaceC8157sJ.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er0$i */
    public static class i {
        public static final i c = new i(a.OVERRIDABLE, "SUCCESS");
        public final a a;
        public final String b;

        /* JADX INFO: renamed from: com.daaw.Er0$i$a */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.a = aVar;
            this.b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = 2
                goto L1c
            L1b:
                r5 = 3
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0789Er0.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.a + ": " + this.b;
        }
    }

    static {
        a aVar = new a();
        g = aVar;
        f = new C0789Er0(aVar, Q80.a.a, P80.a.a, null);
    }

    public C0789Er0(J80.a aVar, Q80 q80, P80 p80, InterfaceC3429bR interfaceC3429bR) {
        if (aVar == null) {
            a(5);
        }
        if (q80 == null) {
            a(6);
        }
        if (p80 == null) {
            a(7);
        }
        this.c = aVar;
        this.a = q80;
        this.b = p80;
        this.d = interfaceC3429bR;
    }

    public static boolean A(InterfaceC3640cA0 interfaceC3640cA0, InterfaceC3640cA0 interfaceC3640cA02) {
        if (interfaceC3640cA0 == null || interfaceC3640cA02 == null) {
            return true;
        }
        return H(interfaceC3640cA0, interfaceC3640cA02);
    }

    public static boolean B(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2) {
        if (interfaceC1376Ki == null) {
            a(65);
        }
        if (interfaceC1376Ki2 == null) {
            a(66);
        }
        I80 returnType = interfaceC1376Ki.getReturnType();
        I80 returnType2 = interfaceC1376Ki2.getReturnType();
        if (!H(interfaceC1376Ki, interfaceC1376Ki2)) {
            return false;
        }
        C9510x71 c9510x71L = f.l(interfaceC1376Ki.getTypeParameters(), interfaceC1376Ki2.getTypeParameters());
        if (interfaceC1376Ki instanceof InterfaceC8468tR) {
            return G(interfaceC1376Ki, returnType, interfaceC1376Ki2, returnType2, c9510x71L);
        }
        if (!(interfaceC1376Ki instanceof InterfaceC4476fA0)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC1376Ki.getClass());
        }
        InterfaceC4476fA0 interfaceC4476fA0 = (InterfaceC4476fA0) interfaceC1376Ki;
        InterfaceC4476fA0 interfaceC4476fA02 = (InterfaceC4476fA0) interfaceC1376Ki2;
        if (A(interfaceC4476fA0.g(), interfaceC4476fA02.g())) {
            return (interfaceC4476fA0.f0() && interfaceC4476fA02.f0()) ? N0.a.m(c9510x71L, returnType.Q0(), returnType2.Q0()) : (interfaceC4476fA0.f0() || !interfaceC4476fA02.f0()) && G(interfaceC1376Ki, returnType, interfaceC1376Ki2, returnType2, c9510x71L);
        }
        return false;
    }

    public static boolean C(InterfaceC1376Ki interfaceC1376Ki, Collection collection) {
        if (interfaceC1376Ki == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!B(interfaceC1376Ki, (InterfaceC1376Ki) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(InterfaceC1376Ki interfaceC1376Ki, I80 i80, InterfaceC1376Ki interfaceC1376Ki2, I80 i802, C9510x71 c9510x71) {
        if (interfaceC1376Ki == null) {
            a(71);
        }
        if (i80 == null) {
            a(72);
        }
        if (interfaceC1376Ki2 == null) {
            a(73);
        }
        if (i802 == null) {
            a(74);
        }
        if (c9510x71 == null) {
            a(75);
        }
        return N0.a.t(c9510x71, i80.Q0(), i802.Q0());
    }

    public static boolean H(InterfaceC0383Aw interfaceC0383Aw, InterfaceC0383Aw interfaceC0383Aw2) {
        if (interfaceC0383Aw == null) {
            a(67);
        }
        if (interfaceC0383Aw2 == null) {
            a(68);
        }
        Integer numD = AbstractC8679uA.d(interfaceC0383Aw.getVisibility(), interfaceC0383Aw2.getVisibility());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(InterfaceC2232Si0 interfaceC2232Si0, InterfaceC2232Si0 interfaceC2232Si02, boolean z) {
        if (interfaceC2232Si0 == null) {
            a(55);
        }
        if (interfaceC2232Si02 == null) {
            a(56);
        }
        return !AbstractC8679uA.g(interfaceC2232Si02.getVisibility()) && AbstractC8679uA.h(interfaceC2232Si02, interfaceC2232Si0, z);
    }

    public static boolean J(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, boolean z, boolean z2) {
        if (interfaceC1376Ki == null) {
            a(13);
        }
        if (interfaceC1376Ki2 == null) {
            a(14);
        }
        if (!interfaceC1376Ki.equals(interfaceC1376Ki2) && C1340Jz.a.k(interfaceC1376Ki.a(), interfaceC1376Ki2.a(), z, z2)) {
            return true;
        }
        InterfaceC1376Ki interfaceC1376KiA = interfaceC1376Ki2.a();
        Iterator it = AbstractC7006oA.d(interfaceC1376Ki).iterator();
        while (it.hasNext()) {
            if (C1340Jz.a.k(interfaceC1376KiA, (InterfaceC1376Ki) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    public static void K(InterfaceC1583Mi interfaceC1583Mi, NQ nq) {
        AbstractC8965vA abstractC8965vA;
        if (interfaceC1583Mi == null) {
            a(105);
        }
        for (InterfaceC1583Mi interfaceC1583Mi2 : interfaceC1583Mi.e()) {
            if (interfaceC1583Mi2.getVisibility() == AbstractC8679uA.g) {
                K(interfaceC1583Mi2, nq);
            }
        }
        if (interfaceC1583Mi.getVisibility() != AbstractC8679uA.g) {
            return;
        }
        AbstractC8965vA abstractC8965vAH = h(interfaceC1583Mi);
        if (abstractC8965vAH == null) {
            if (nq != null) {
                nq.invoke(interfaceC1583Mi);
            }
            abstractC8965vA = AbstractC8679uA.e;
        } else {
            abstractC8965vA = abstractC8965vAH;
        }
        if (interfaceC1583Mi instanceof C4765gA0) {
            ((C4765gA0) interfaceC1583Mi).c1(abstractC8965vA);
            Iterator it = ((InterfaceC4476fA0) interfaceC1583Mi).w().iterator();
            while (it.hasNext()) {
                K((InterfaceC3640cA0) it.next(), abstractC8965vAH == null ? null : nq);
            }
            return;
        }
        if (interfaceC1583Mi instanceof AbstractC8747uR) {
            ((AbstractC8747uR) interfaceC1583Mi).j1(abstractC8965vA);
            return;
        }
        AbstractC3919dA0 abstractC3919dA0 = (AbstractC3919dA0) interfaceC1583Mi;
        abstractC3919dA0.N0(abstractC8965vA);
        if (abstractC8965vA != abstractC3919dA0.A0().getVisibility()) {
            abstractC3919dA0.L0(false);
        }
    }

    public static Object L(Collection collection, NQ nq) {
        Object next;
        if (collection == null) {
            a(76);
        }
        if (nq == null) {
            a(77);
        }
        if (collection.size() == 1) {
            Object objD0 = AbstractC2455Um.d0(collection);
            if (objD0 == null) {
                a(78);
            }
            return objD0;
        }
        ArrayList arrayList = new ArrayList(2);
        List listS0 = AbstractC2455Um.s0(collection, nq);
        Object objD02 = AbstractC2455Um.d0(collection);
        InterfaceC1376Ki interfaceC1376Ki = (InterfaceC1376Ki) nq.invoke(objD02);
        for (Object obj : collection) {
            InterfaceC1376Ki interfaceC1376Ki2 = (InterfaceC1376Ki) nq.invoke(obj);
            if (C(interfaceC1376Ki2, listS0)) {
                arrayList.add(obj);
            }
            if (B(interfaceC1376Ki2, interfaceC1376Ki) && !B(interfaceC1376Ki, interfaceC1376Ki2)) {
                objD02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objD02 == null) {
                a(79);
            }
            return objD02;
        }
        if (arrayList.size() == 1) {
            Object objD03 = AbstractC2455Um.d0(arrayList);
            if (objD03 == null) {
                a(80);
            }
            return objD03;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!ZM.b(((InterfaceC1376Ki) nq.invoke(next)).getReturnType())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objD04 = AbstractC2455Um.d0(arrayList);
        if (objD04 == null) {
            a(82);
        }
        return objD04;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instruction units count: 1298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0789Er0.a(int):void");
    }

    public static boolean b(Collection collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return AbstractC2455Um.U(collection, new c(((InterfaceC1583Mi) collection.iterator().next()).b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(com.daaw.Z71 r4, com.daaw.Z71 r5, com.daaw.C9510x71 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 47
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            com.daaw.I80 r5 = (com.daaw.I80) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            com.daaw.I80 r3 = (com.daaw.I80) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0789Er0.c(com.daaw.Z71, com.daaw.Z71, com.daaw.x71):boolean");
    }

    public static boolean d(I80 i80, I80 i802, C9510x71 c9510x71) {
        if (i80 == null) {
            a(44);
        }
        if (i802 == null) {
            a(45);
        }
        if (c9510x71 == null) {
            a(46);
        }
        if (N80.a(i80) && N80.a(i802)) {
            return true;
        }
        return N0.a.m(c9510x71, i80.Q0(), i802.Q0());
    }

    public static i e(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2) {
        if ((interfaceC1376Ki.i0() == null) != (interfaceC1376Ki2.i0() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (interfaceC1376Ki.h().size() != interfaceC1376Ki2.h().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    public static void f(InterfaceC1583Mi interfaceC1583Mi, Set set) {
        if (interfaceC1583Mi == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (interfaceC1583Mi.i().a()) {
            set.add(interfaceC1583Mi);
            return;
        }
        if (interfaceC1583Mi.e().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC1583Mi);
        }
        Iterator it = interfaceC1583Mi.e().iterator();
        while (it.hasNext()) {
            f((InterfaceC1583Mi) it.next(), set);
        }
    }

    public static List g(InterfaceC1376Ki interfaceC1376Ki) {
        RE0 re0I0 = interfaceC1376Ki.i0();
        ArrayList arrayList = new ArrayList();
        if (re0I0 != null) {
            arrayList.add(re0I0.getType());
        }
        Iterator it = interfaceC1376Ki.h().iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC9918yc1) it.next()).getType());
        }
        return arrayList;
    }

    public static AbstractC8965vA h(InterfaceC1583Mi interfaceC1583Mi) {
        if (interfaceC1583Mi == null) {
            a(106);
        }
        Collection<InterfaceC1583Mi> collectionE = interfaceC1583Mi.e();
        AbstractC8965vA abstractC8965vAU = u(collectionE);
        if (abstractC8965vAU == null) {
            return null;
        }
        if (interfaceC1583Mi.i() != InterfaceC1583Mi.a.FAKE_OVERRIDE) {
            return abstractC8965vAU.f();
        }
        for (InterfaceC1583Mi interfaceC1583Mi2 : collectionE) {
            if (interfaceC1583Mi2.l() != EnumC0336Ak0.F && !interfaceC1583Mi2.getVisibility().equals(abstractC8965vAU)) {
                return null;
            }
        }
        return abstractC8965vAU;
    }

    public static C0789Er0 i(Q80 q80, J80.a aVar) {
        if (q80 == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new C0789Er0(aVar, q80, P80.a.a, null);
    }

    public static void j(Collection collection, InterfaceC4923gl interfaceC4923gl, AbstractC0685Dr0 abstractC0685Dr0) {
        if (collection == null) {
            a(83);
        }
        if (interfaceC4923gl == null) {
            a(84);
        }
        if (abstractC0685Dr0 == null) {
            a(85);
        }
        Collection collectionT = t(interfaceC4923gl, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        InterfaceC1583Mi interfaceC1583MiI = ((InterfaceC1583Mi) L(collection, new d())).I(interfaceC4923gl, n(collection, interfaceC4923gl), zIsEmpty ? AbstractC8679uA.h : AbstractC8679uA.g, InterfaceC1583Mi.a.FAKE_OVERRIDE, false);
        abstractC0685Dr0.d(interfaceC1583MiI, collection);
        abstractC0685Dr0.a(interfaceC1583MiI);
    }

    public static void k(InterfaceC4923gl interfaceC4923gl, Collection collection, AbstractC0685Dr0 abstractC0685Dr0) {
        if (interfaceC4923gl == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (abstractC0685Dr0 == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton((InterfaceC1583Mi) it.next()), interfaceC4923gl, abstractC0685Dr0);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(p(AbstractC0950Gf1.a(linkedList), linkedList, abstractC0685Dr0), interfaceC4923gl, abstractC0685Dr0);
            }
        }
    }

    public static C0789Er0 m(Q80 q80) {
        if (q80 == null) {
            a(0);
        }
        return new C0789Er0(g, q80, P80.a.a, null);
    }

    public static EnumC0336Ak0 n(Collection collection, InterfaceC4923gl interfaceC4923gl) {
        if (collection == null) {
            a(86);
        }
        if (interfaceC4923gl == null) {
            a(87);
        }
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            InterfaceC1583Mi interfaceC1583Mi = (InterfaceC1583Mi) it.next();
            int i2 = h.c[interfaceC1583Mi.l().ordinal()];
            if (i2 == 1) {
                EnumC0336Ak0 enumC0336Ak0 = EnumC0336Ak0.C;
                if (enumC0336Ak0 == null) {
                    a(88);
                }
                return enumC0336Ak0;
            }
            if (i2 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC1583Mi);
            }
            if (i2 == 3) {
                z2 = true;
            } else if (i2 == 4) {
                z3 = true;
            }
        }
        if (interfaceC4923gl.J() && interfaceC4923gl.l() != EnumC0336Ak0.F && interfaceC4923gl.l() != EnumC0336Ak0.D) {
            z = true;
        }
        if (z2 && !z3) {
            EnumC0336Ak0 enumC0336Ak02 = EnumC0336Ak0.E;
            if (enumC0336Ak02 == null) {
                a(89);
            }
            return enumC0336Ak02;
        }
        if (!z2 && z3) {
            EnumC0336Ak0 enumC0336Ak0L = z ? interfaceC4923gl.l() : EnumC0336Ak0.F;
            if (enumC0336Ak0L == null) {
                a(90);
            }
            return enumC0336Ak0L;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(z((InterfaceC1583Mi) it2.next()));
        }
        return y(r(hashSet), z, interfaceC4923gl.l());
    }

    public static Collection p(InterfaceC1583Mi interfaceC1583Mi, Queue queue, AbstractC0685Dr0 abstractC0685Dr0) {
        if (interfaceC1583Mi == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (abstractC0685Dr0 == null) {
            a(104);
        }
        return q(interfaceC1583Mi, queue, new f(), new g(abstractC0685Dr0, interfaceC1583Mi));
    }

    public static Collection q(Object obj, Collection collection, NQ nq, NQ nq2) {
        if (obj == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (nq == null) {
            a(99);
        }
        if (nq2 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC1376Ki interfaceC1376Ki = (InterfaceC1376Ki) nq.invoke(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC1376Ki interfaceC1376Ki2 = (InterfaceC1376Ki) nq.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                i.a aVarX = x(interfaceC1376Ki, interfaceC1376Ki2);
                if (aVarX == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarX == i.a.CONFLICT) {
                    nq2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static Set r(Set set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && AbstractC8400tA.y(AbstractC8400tA.s((InterfaceC8612tw) set.iterator().next())), null, new b());
    }

    public static Set s(Set set, boolean z, LQ lq, InterfaceC3429bR interfaceC3429bR) {
        if (set == null) {
            a(9);
        }
        if (interfaceC3429bR == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (lq != null) {
                lq.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                C0576Cs0 c0576Cs0 = (C0576Cs0) interfaceC3429bR.invoke(obj, it.next());
                InterfaceC1376Ki interfaceC1376Ki = (InterfaceC1376Ki) c0576Cs0.a();
                InterfaceC1376Ki interfaceC1376Ki2 = (InterfaceC1376Ki) c0576Cs0.b();
                if (!J(interfaceC1376Ki, interfaceC1376Ki2, z, true)) {
                    if (J(interfaceC1376Ki2, interfaceC1376Ki, z, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection t(InterfaceC4923gl interfaceC4923gl, Collection collection) {
        if (interfaceC4923gl == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List listA0 = AbstractC2455Um.a0(collection, new e(interfaceC4923gl));
        if (listA0 == null) {
            a(96);
        }
        return listA0;
    }

    public static AbstractC8965vA u(Collection collection) {
        AbstractC8965vA abstractC8965vA;
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return AbstractC8679uA.l;
        }
        Iterator it = collection.iterator();
        loop0: while (true) {
            abstractC8965vA = null;
            while (it.hasNext()) {
                AbstractC8965vA visibility = ((InterfaceC1583Mi) it.next()).getVisibility();
                if (abstractC8965vA != null) {
                    Integer numD = AbstractC8679uA.d(visibility, abstractC8965vA);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                abstractC8965vA = visibility;
            }
        }
        if (abstractC8965vA == null) {
            return null;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numD2 = AbstractC8679uA.d(abstractC8965vA, ((InterfaceC1583Mi) it2.next()).getVisibility());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return abstractC8965vA;
    }

    public static i w(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2) {
        boolean z;
        if (interfaceC1376Ki == null) {
            a(38);
        }
        if (interfaceC1376Ki2 == null) {
            a(39);
        }
        boolean z2 = interfaceC1376Ki instanceof InterfaceC8468tR;
        if ((z2 && !(interfaceC1376Ki2 instanceof InterfaceC8468tR)) || (((z = interfaceC1376Ki instanceof InterfaceC4476fA0)) && !(interfaceC1376Ki2 instanceof InterfaceC4476fA0))) {
            return i.d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC1376Ki);
        }
        if (!interfaceC1376Ki.getName().equals(interfaceC1376Ki2.getName())) {
            return i.d("Name mismatch");
        }
        i iVarE = e(interfaceC1376Ki, interfaceC1376Ki2);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    public static i.a x(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2) {
        C0789Er0 c0789Er0 = f;
        i.a aVarC = c0789Er0.D(interfaceC1376Ki2, interfaceC1376Ki, null).c();
        i.a aVarC2 = c0789Er0.D(interfaceC1376Ki, interfaceC1376Ki2, null).c();
        i.a aVar = i.a.OVERRIDABLE;
        if (aVarC == aVar && aVarC2 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (aVarC == aVar2 || aVarC2 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    public static EnumC0336Ak0 y(Collection collection, boolean z, EnumC0336Ak0 enumC0336Ak0) {
        if (collection == null) {
            a(91);
        }
        if (enumC0336Ak0 == null) {
            a(92);
        }
        EnumC0336Ak0 enumC0336Ak02 = EnumC0336Ak0.F;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC1583Mi interfaceC1583Mi = (InterfaceC1583Mi) it.next();
            EnumC0336Ak0 enumC0336Ak0L = (z && interfaceC1583Mi.l() == EnumC0336Ak0.F) ? enumC0336Ak0 : interfaceC1583Mi.l();
            if (enumC0336Ak0L.compareTo(enumC0336Ak02) < 0) {
                enumC0336Ak02 = enumC0336Ak0L;
            }
        }
        if (enumC0336Ak02 == null) {
            a(93);
        }
        return enumC0336Ak02;
    }

    public static Set z(InterfaceC1583Mi interfaceC1583Mi) {
        if (interfaceC1583Mi == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(interfaceC1583Mi, linkedHashSet);
        return linkedHashSet;
    }

    public i D(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC1376Ki == null) {
            a(19);
        }
        if (interfaceC1376Ki2 == null) {
            a(20);
        }
        i iVarE = E(interfaceC1376Ki, interfaceC1376Ki2, interfaceC4923gl, false);
        if (iVarE == null) {
            a(21);
        }
        return iVarE;
    }

    public i E(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, InterfaceC4923gl interfaceC4923gl, boolean z) {
        if (interfaceC1376Ki == null) {
            a(22);
        }
        if (interfaceC1376Ki2 == null) {
            a(23);
        }
        i iVarF = F(interfaceC1376Ki, interfaceC1376Ki2, z);
        boolean z2 = iVarF.c() == i.a.OVERRIDABLE;
        for (InterfaceC8157sJ interfaceC8157sJ : e) {
            if (interfaceC8157sJ.b() != InterfaceC8157sJ.a.CONFLICTS_ONLY && (!z2 || interfaceC8157sJ.b() != InterfaceC8157sJ.a.SUCCESS_ONLY)) {
                int i2 = h.a[interfaceC8157sJ.a(interfaceC1376Ki, interfaceC1376Ki2, interfaceC4923gl).ordinal()];
                if (i2 == 1) {
                    z2 = true;
                } else if (i2 == 2) {
                    i iVarD = i.d("External condition");
                    if (iVarD == null) {
                        a(24);
                    }
                    return iVarD;
                }
            }
        }
        if (!z2) {
            return iVarF;
        }
        for (InterfaceC8157sJ interfaceC8157sJ2 : e) {
            if (interfaceC8157sJ2.b() == InterfaceC8157sJ.a.CONFLICTS_ONLY) {
                int i3 = h.a[interfaceC8157sJ2.a(interfaceC1376Ki, interfaceC1376Ki2, interfaceC4923gl).ordinal()];
                if (i3 == 1) {
                    throw new IllegalStateException("Contract violation in " + interfaceC8157sJ2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i3 == 2) {
                    i iVarD2 = i.d("External condition");
                    if (iVarD2 == null) {
                        a(26);
                    }
                    return iVarD2;
                }
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(27);
        }
        return iVarE;
    }

    public i F(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, boolean z) {
        if (interfaceC1376Ki == null) {
            a(28);
        }
        if (interfaceC1376Ki2 == null) {
            a(29);
        }
        i iVarW = w(interfaceC1376Ki, interfaceC1376Ki2);
        if (iVarW != null) {
            return iVarW;
        }
        List listG = g(interfaceC1376Ki);
        List listG2 = g(interfaceC1376Ki2);
        List typeParameters = interfaceC1376Ki.getTypeParameters();
        List typeParameters2 = interfaceC1376Ki2.getTypeParameters();
        int i2 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i2 < listG.size()) {
                if (!J80.a.d((I80) listG.get(i2), (I80) listG2.get(i2))) {
                    i iVarD = i.d("Type parameter number mismatch");
                    if (iVarD == null) {
                        a(31);
                    }
                    return iVarD;
                }
                i2++;
            }
            i iVarB = i.b("Type parameter number mismatch");
            if (iVarB == null) {
                a(32);
            }
            return iVarB;
        }
        C9510x71 c9510x71L = l(typeParameters, typeParameters2);
        for (int i3 = 0; i3 < typeParameters.size(); i3++) {
            if (!c((Z71) typeParameters.get(i3), (Z71) typeParameters2.get(i3), c9510x71L)) {
                i iVarD2 = i.d("Type parameter bounds mismatch");
                if (iVarD2 == null) {
                    a(33);
                }
                return iVarD2;
            }
        }
        while (i2 < listG.size()) {
            if (!d((I80) listG.get(i2), (I80) listG2.get(i2), c9510x71L)) {
                i iVarD3 = i.d("Value parameter type mismatch");
                if (iVarD3 == null) {
                    a(34);
                }
                return iVarD3;
            }
            i2++;
        }
        if ((interfaceC1376Ki instanceof InterfaceC8468tR) && (interfaceC1376Ki2 instanceof InterfaceC8468tR) && ((InterfaceC8468tR) interfaceC1376Ki).isSuspend() != ((InterfaceC8468tR) interfaceC1376Ki2).isSuspend()) {
            i iVarB2 = i.b("Incompatible suspendability");
            if (iVarB2 == null) {
                a(35);
            }
            return iVarB2;
        }
        if (z) {
            I80 returnType = interfaceC1376Ki.getReturnType();
            I80 returnType2 = interfaceC1376Ki2.getReturnType();
            if (returnType != null && returnType2 != null && ((!N80.a(returnType2) || !N80.a(returnType)) && !N0.a.t(c9510x71L, returnType2.Q0(), returnType.Q0()))) {
                i iVarB3 = i.b("Return type mismatch");
                if (iVarB3 == null) {
                    a(36);
                }
                return iVarB3;
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(37);
        }
        return iVarE;
    }

    public final C9510x71 l(List list, List list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            C9510x71 c9510x71J0 = new C0893Fr0(null, this.c, this.a, this.b, this.d).J0(true, true);
            if (c9510x71J0 == null) {
                a(42);
            }
            return c9510x71J0;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            map.put(((Z71) list.get(i2)).k(), ((Z71) list2.get(i2)).k());
        }
        C9510x71 c9510x71J02 = new C0893Fr0(map, this.c, this.a, this.b, this.d).J0(true, true);
        if (c9510x71J02 == null) {
            a(43);
        }
        return c9510x71J02;
    }

    public final Collection o(InterfaceC1583Mi interfaceC1583Mi, Collection collection, InterfaceC4923gl interfaceC4923gl, AbstractC0685Dr0 abstractC0685Dr0) {
        if (interfaceC1583Mi == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (interfaceC4923gl == null) {
            a(59);
        }
        if (abstractC0685Dr0 == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        VT0 vt0S = VT0.s();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC1583Mi interfaceC1583Mi2 = (InterfaceC1583Mi) it.next();
            i.a aVarC = D(interfaceC1583Mi2, interfaceC1583Mi, interfaceC4923gl).c();
            boolean zI = I(interfaceC1583Mi, interfaceC1583Mi2, false);
            int i2 = h.b[aVarC.ordinal()];
            if (i2 == 1) {
                if (zI) {
                    vt0S.add(interfaceC1583Mi2);
                }
                arrayList.add(interfaceC1583Mi2);
            } else if (i2 == 2) {
                if (zI) {
                    abstractC0685Dr0.c(interfaceC1583Mi2, interfaceC1583Mi);
                }
                arrayList.add(interfaceC1583Mi2);
            }
        }
        abstractC0685Dr0.d(interfaceC1583Mi, vt0S);
        return arrayList;
    }

    public void v(C2352Tm0 c2352Tm0, Collection collection, Collection collection2, InterfaceC4923gl interfaceC4923gl, AbstractC0685Dr0 abstractC0685Dr0) {
        if (c2352Tm0 == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (interfaceC4923gl == null) {
            a(53);
        }
        if (abstractC0685Dr0 == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o((InterfaceC1583Mi) it.next(), collection, interfaceC4923gl, abstractC0685Dr0));
        }
        k(interfaceC4923gl, linkedHashSet, abstractC0685Dr0);
    }

    /* JADX INFO: renamed from: com.daaw.Er0$d */
    public static class d implements NQ {
        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1583Mi invoke(InterfaceC1583Mi interfaceC1583Mi) {
            return interfaceC1583Mi;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Er0$f */
    public static class f implements NQ {
        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1376Ki invoke(InterfaceC1583Mi interfaceC1583Mi) {
            return interfaceC1583Mi;
        }
    }
}
