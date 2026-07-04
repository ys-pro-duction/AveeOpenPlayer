package com.daaw;

import com.daaw.C9510x71;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class N0 {
    public static final N0 a = new N0();
    public static boolean b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[J81.values().length];
            try {
                iArr[J81.E.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[J81.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[J81.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[C9510x71.b.values().length];
            try {
                iArr2[C9510x71.b.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C9510x71.b.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[C9510x71.b.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public static final boolean d(InterfaceC9515x81 interfaceC9515x81, InterfaceC3159aT0 interfaceC3159aT0) {
        if (!(interfaceC3159aT0 instanceof InterfaceC1068Hj)) {
            return false;
        }
        InterfaceC7272p71 interfaceC7272p71W = interfaceC9515x81.w(interfaceC9515x81.B0((InterfaceC1068Hj) interfaceC3159aT0));
        return !interfaceC9515x81.z0(interfaceC7272p71W) && interfaceC9515x81.m(interfaceC9515x81.y(interfaceC9515x81.h0(interfaceC7272p71W)));
    }

    public static final boolean e(InterfaceC9515x81 interfaceC9515x81, InterfaceC3159aT0 interfaceC3159aT0) {
        D71 d71F = interfaceC9515x81.f(interfaceC3159aT0);
        if (!(d71F instanceof C10)) {
            return false;
        }
        Collection collectionI = interfaceC9515x81.i(d71F);
        if ((collectionI instanceof Collection) && collectionI.isEmpty()) {
            return false;
        }
        Iterator it = collectionI.iterator();
        while (it.hasNext()) {
            InterfaceC3159aT0 interfaceC3159aT0B = interfaceC9515x81.b((O80) it.next());
            if (interfaceC3159aT0B != null && interfaceC9515x81.m(interfaceC3159aT0B)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(InterfaceC9515x81 interfaceC9515x81, InterfaceC3159aT0 interfaceC3159aT0) {
        return interfaceC9515x81.m(interfaceC3159aT0) || d(interfaceC9515x81, interfaceC3159aT0);
    }

    public static final boolean g(InterfaceC9515x81 interfaceC9515x81, C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02, boolean z) {
        C9510x71 c9510x712;
        InterfaceC3159aT0 interfaceC3159aT03;
        Collection<O80> collectionD0 = interfaceC9515x81.D0(interfaceC3159aT0);
        if ((collectionD0 instanceof Collection) && collectionD0.isEmpty()) {
            return false;
        }
        for (O80 o80 : collectionD0) {
            if (G10.c(interfaceC9515x81.a0(o80), interfaceC9515x81.f(interfaceC3159aT02))) {
                return true;
            }
            if (z) {
                c9510x712 = c9510x71;
                interfaceC3159aT03 = interfaceC3159aT02;
                if (v(a, c9510x712, interfaceC3159aT03, o80, false, 8, null)) {
                    return true;
                }
            } else {
                c9510x712 = c9510x71;
                interfaceC3159aT03 = interfaceC3159aT02;
            }
            c9510x71 = c9510x712;
            interfaceC3159aT02 = interfaceC3159aT03;
        }
        return false;
    }

    public static /* synthetic */ boolean v(N0 n0, C9510x71 c9510x71, O80 o80, O80 o802, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return n0.u(c9510x71, o80, o802, z);
    }

    public static final G91 x(Collection collection, C9510x71 c9510x71, InterfaceC9515x81 interfaceC9515x81, InterfaceC3159aT0 interfaceC3159aT0, C9510x71.a aVar) {
        G10.g(collection, "$supertypesWithSameConstructor");
        G10.g(c9510x71, "$state");
        G10.g(interfaceC9515x81, "$this_with");
        G10.g(interfaceC3159aT0, "$superType");
        G10.g(aVar, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aVar.a(new M0(c9510x71, interfaceC9515x81, (InterfaceC3159aT0) it.next(), interfaceC3159aT0));
        }
        return G91.a;
    }

    public static final boolean y(C9510x71 c9510x71, InterfaceC9515x81 interfaceC9515x81, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
        G10.g(c9510x71, "$state");
        G10.g(interfaceC9515x81, "$this_with");
        G10.g(interfaceC3159aT0, "$subTypeArguments");
        G10.g(interfaceC3159aT02, "$superType");
        return a.s(c9510x71, interfaceC9515x81.J(interfaceC3159aT0), interfaceC3159aT02);
    }

    public final List A(C9510x71 c9510x71, List list) {
        int i;
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC6993o71 interfaceC6993o71J = interfaceC9515x81J.J((InterfaceC3159aT0) obj);
                int iP = interfaceC9515x81J.P(interfaceC6993o71J);
                while (true) {
                    if (i >= iP) {
                        arrayList.add(obj);
                        break;
                    }
                    i = interfaceC9515x81J.p(interfaceC9515x81J.h0(interfaceC9515x81J.G0(interfaceC6993o71J, i))) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    public final Boolean c(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        if (!interfaceC9515x81J.m(interfaceC3159aT0) && !interfaceC9515x81J.m(interfaceC3159aT02)) {
            return null;
        }
        if (f(interfaceC9515x81J, interfaceC3159aT0) && f(interfaceC9515x81J, interfaceC3159aT02)) {
            return Boolean.TRUE;
        }
        if (interfaceC9515x81J.m(interfaceC3159aT0)) {
            if (g(interfaceC9515x81J, c9510x71, interfaceC3159aT0, interfaceC3159aT02, false)) {
                return Boolean.TRUE;
            }
        } else if (interfaceC9515x81J.m(interfaceC3159aT02) && (e(interfaceC9515x81J, interfaceC3159aT0) || g(interfaceC9515x81J, c9510x71, interfaceC3159aT02, interfaceC3159aT0, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean h(com.daaw.C9510x71 r13, com.daaw.InterfaceC3159aT0 r14, com.daaw.InterfaceC3159aT0 r15) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.N0.h(com.daaw.x71, com.daaw.aT0, com.daaw.aT0):java.lang.Boolean");
    }

    public final List i(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, D71 d71) {
        C9510x71.c cVarX;
        InterfaceC3159aT0 interfaceC3159aT02 = interfaceC3159aT0;
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        List listS0 = interfaceC9515x81J.s0(interfaceC3159aT02, d71);
        if (listS0 != null) {
            return listS0;
        }
        if (!interfaceC9515x81J.v0(d71) && interfaceC9515x81J.v(interfaceC3159aT02)) {
            return AbstractC1599Mm.k();
        }
        if (interfaceC9515x81J.t(d71)) {
            if (!interfaceC9515x81J.g0(interfaceC9515x81J.f(interfaceC3159aT02), d71)) {
                return AbstractC1599Mm.k();
            }
            InterfaceC3159aT0 interfaceC3159aT0H = interfaceC9515x81J.H(interfaceC3159aT02, EnumC9951yj.B);
            if (interfaceC3159aT0H != null) {
                interfaceC3159aT02 = interfaceC3159aT0H;
            }
            return AbstractC1496Lm.e(interfaceC3159aT02);
        }
        UT0 ut0 = new UT0();
        c9510x71.k();
        ArrayDeque arrayDequeH = c9510x71.h();
        G10.d(arrayDequeH);
        Set setI = c9510x71.i();
        G10.d(setI);
        arrayDequeH.push(interfaceC3159aT02);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC3159aT02 + ". Supertypes = " + AbstractC2455Um.n0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC3159aT0 interfaceC3159aT03 = (InterfaceC3159aT0) arrayDequeH.pop();
            G10.d(interfaceC3159aT03);
            if (setI.add(interfaceC3159aT03)) {
                InterfaceC3159aT0 interfaceC3159aT0H2 = interfaceC9515x81J.H(interfaceC3159aT03, EnumC9951yj.B);
                if (interfaceC3159aT0H2 == null) {
                    interfaceC3159aT0H2 = interfaceC3159aT03;
                }
                if (interfaceC9515x81J.g0(interfaceC9515x81J.f(interfaceC3159aT0H2), d71)) {
                    ut0.add(interfaceC3159aT0H2);
                    cVarX = C9510x71.c.C0252c.a;
                } else {
                    cVarX = interfaceC9515x81J.I(interfaceC3159aT0H2) == 0 ? C9510x71.c.b.a : c9510x71.j().X(interfaceC3159aT0H2);
                }
                if (G10.c(cVarX, C9510x71.c.C0252c.a)) {
                    cVarX = null;
                }
                if (cVarX != null) {
                    InterfaceC9515x81 interfaceC9515x81J2 = c9510x71.j();
                    Iterator it = interfaceC9515x81J2.i(interfaceC9515x81J2.f(interfaceC3159aT03)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVarX.a(c9510x71, (O80) it.next()));
                    }
                }
            }
        }
        c9510x71.e();
        return ut0;
    }

    public final List j(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, D71 d71) {
        return A(c9510x71, i(c9510x71, interfaceC3159aT0, d71));
    }

    public final boolean k(C9510x71 c9510x71, O80 o80, O80 o802, boolean z) {
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        O80 o80O = c9510x71.o(c9510x71.p(o80));
        O80 o80O2 = c9510x71.o(c9510x71.p(o802));
        N0 n0 = a;
        Boolean boolH = n0.h(c9510x71, interfaceC9515x81J.A0(o80O), interfaceC9515x81J.y(o80O2));
        if (boolH == null) {
            Boolean boolC = c9510x71.c(o80O, o80O2, z);
            return boolC != null ? boolC.booleanValue() : n0.w(c9510x71, interfaceC9515x81J.A0(o80O), interfaceC9515x81J.y(o80O2));
        }
        boolean zBooleanValue = boolH.booleanValue();
        c9510x71.c(o80O, o80O2, z);
        return zBooleanValue;
    }

    public final J81 l(J81 j81, J81 j812) {
        G10.g(j81, "declared");
        G10.g(j812, "useSite");
        J81 j813 = J81.E;
        if (j81 == j813) {
            return j812;
        }
        if (j812 == j813 || j81 == j812) {
            return j81;
        }
        return null;
    }

    public final boolean m(C9510x71 c9510x71, O80 o80, O80 o802) {
        G10.g(c9510x71, "state");
        G10.g(o80, "a");
        G10.g(o802, "b");
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        if (o80 == o802) {
            return true;
        }
        N0 n0 = a;
        if (n0.q(interfaceC9515x81J, o80) && n0.q(interfaceC9515x81J, o802)) {
            O80 o80O = c9510x71.o(c9510x71.p(o80));
            O80 o80O2 = c9510x71.o(c9510x71.p(o802));
            InterfaceC3159aT0 interfaceC3159aT0A0 = interfaceC9515x81J.A0(o80O);
            if (!interfaceC9515x81J.g0(interfaceC9515x81J.a0(o80O), interfaceC9515x81J.a0(o80O2))) {
                return false;
            }
            if (interfaceC9515x81J.I(interfaceC3159aT0A0) == 0) {
                return interfaceC9515x81J.z(o80O) || interfaceC9515x81J.z(o80O2) || interfaceC9515x81J.u(interfaceC3159aT0A0) == interfaceC9515x81J.u(interfaceC9515x81J.A0(o80O2));
            }
        }
        return v(n0, c9510x71, o80, o802, false, 8, null) && v(n0, c9510x71, o802, o80, false, 8, null);
    }

    public final List n(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0, D71 d71) {
        C9510x71.c cVar;
        G10.g(c9510x71, "state");
        G10.g(interfaceC3159aT0, "subType");
        G10.g(d71, "superConstructor");
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        if (interfaceC9515x81J.v(interfaceC3159aT0)) {
            return a.j(c9510x71, interfaceC3159aT0, d71);
        }
        if (!interfaceC9515x81J.v0(d71) && !interfaceC9515x81J.r(d71)) {
            return a.i(c9510x71, interfaceC3159aT0, d71);
        }
        UT0<InterfaceC3159aT0> ut0 = new UT0();
        c9510x71.k();
        ArrayDeque arrayDequeH = c9510x71.h();
        G10.d(arrayDequeH);
        Set setI = c9510x71.i();
        G10.d(setI);
        arrayDequeH.push(interfaceC3159aT0);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC3159aT0 + ". Supertypes = " + AbstractC2455Um.n0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC3159aT0 interfaceC3159aT02 = (InterfaceC3159aT0) arrayDequeH.pop();
            G10.d(interfaceC3159aT02);
            if (setI.add(interfaceC3159aT02)) {
                if (interfaceC9515x81J.v(interfaceC3159aT02)) {
                    ut0.add(interfaceC3159aT02);
                    cVar = C9510x71.c.C0252c.a;
                } else {
                    cVar = C9510x71.c.b.a;
                }
                if (G10.c(cVar, C9510x71.c.C0252c.a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    InterfaceC9515x81 interfaceC9515x81J2 = c9510x71.j();
                    Iterator it = interfaceC9515x81J2.i(interfaceC9515x81J2.f(interfaceC3159aT02)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVar.a(c9510x71, (O80) it.next()));
                    }
                }
            }
        }
        c9510x71.e();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3159aT0 interfaceC3159aT03 : ut0) {
            N0 n0 = a;
            G10.d(interfaceC3159aT03);
            AbstractC2141Rm.A(arrayList, n0.j(c9510x71, interfaceC3159aT03, d71));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r7.n0(r7.a0(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.InterfaceC3631c81 o(com.daaw.InterfaceC9515x81 r7, com.daaw.O80 r8, com.daaw.O80 r9) {
        /*
            r6 = this;
            int r0 = r7.I(r8)
            r1 = 0
            r2 = 0
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            com.daaw.p71 r4 = r7.p0(r8, r2)
            boolean r5 = r7.z0(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            com.daaw.O80 r3 = r7.h0(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            com.daaw.aT0 r4 = r7.A0(r3)
            com.daaw.aT0 r4 = r7.V(r4)
            boolean r4 = r7.W(r4)
            if (r4 == 0) goto L3b
            com.daaw.aT0 r4 = r7.A0(r9)
            com.daaw.aT0 r4 = r7.V(r4)
            boolean r4 = r7.W(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = 0
        L3c:
            boolean r5 = com.daaw.G10.c(r3, r9)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            com.daaw.D71 r4 = r7.a0(r3)
            com.daaw.D71 r5 = r7.a0(r9)
            boolean r4 = com.daaw.G10.c(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            com.daaw.c81 r3 = r6.o(r7, r3, r9)
            if (r3 == 0) goto L63
            return r3
        L5a:
            com.daaw.D71 r8 = r7.a0(r8)
            com.daaw.c81 r7 = r7.n0(r8, r2)
            return r7
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.N0.o(com.daaw.x81, com.daaw.O80, com.daaw.O80):com.daaw.c81");
    }

    public final boolean p(C9510x71 c9510x71, InterfaceC3159aT0 interfaceC3159aT0) {
        InterfaceC9515x81 interfaceC9515x81J = c9510x71.j();
        D71 d71F = interfaceC9515x81J.f(interfaceC3159aT0);
        if (interfaceC9515x81J.v0(d71F)) {
            return interfaceC9515x81J.A(d71F);
        }
        if (interfaceC9515x81J.A(interfaceC9515x81J.f(interfaceC3159aT0))) {
            return true;
        }
        c9510x71.k();
        ArrayDeque arrayDequeH = c9510x71.h();
        G10.d(arrayDequeH);
        Set setI = c9510x71.i();
        G10.d(setI);
        arrayDequeH.push(interfaceC3159aT0);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC3159aT0 + ". Supertypes = " + AbstractC2455Um.n0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC3159aT0 interfaceC3159aT02 = (InterfaceC3159aT0) arrayDequeH.pop();
            G10.d(interfaceC3159aT02);
            if (setI.add(interfaceC3159aT02)) {
                C9510x71.c cVar = interfaceC9515x81J.v(interfaceC3159aT02) ? C9510x71.c.C0252c.a : C9510x71.c.b.a;
                if (G10.c(cVar, C9510x71.c.C0252c.a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    InterfaceC9515x81 interfaceC9515x81J2 = c9510x71.j();
                    Iterator it = interfaceC9515x81J2.i(interfaceC9515x81J2.f(interfaceC3159aT02)).iterator();
                    while (it.hasNext()) {
                        InterfaceC3159aT0 interfaceC3159aT0A = cVar.a(c9510x71, (O80) it.next());
                        if (interfaceC9515x81J.A(interfaceC9515x81J.f(interfaceC3159aT0A))) {
                            c9510x71.e();
                            return true;
                        }
                        arrayDequeH.add(interfaceC3159aT0A);
                    }
                }
            }
        }
        c9510x71.e();
        return false;
    }

    public final boolean q(InterfaceC9515x81 interfaceC9515x81, O80 o80) {
        return (!interfaceC9515x81.k(interfaceC9515x81.a0(o80)) || interfaceC9515x81.C0(o80) || interfaceC9515x81.h(o80) || interfaceC9515x81.q0(o80) || interfaceC9515x81.S(o80)) ? false : true;
    }

    public final boolean r(InterfaceC9515x81 interfaceC9515x81, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
        InterfaceC3159aT0 interfaceC3159aT0O0;
        InterfaceC3159aT0 interfaceC3159aT0O02;
        InterfaceC9185vy interfaceC9185vyZ = interfaceC9515x81.Z(interfaceC3159aT0);
        if (interfaceC9185vyZ == null || (interfaceC3159aT0O0 = interfaceC9515x81.o0(interfaceC9185vyZ)) == null) {
            interfaceC3159aT0O0 = interfaceC3159aT0;
        }
        InterfaceC9185vy interfaceC9185vyZ2 = interfaceC9515x81.Z(interfaceC3159aT02);
        if (interfaceC9185vyZ2 == null || (interfaceC3159aT0O02 = interfaceC9515x81.o0(interfaceC9185vyZ2)) == null) {
            interfaceC3159aT0O02 = interfaceC3159aT02;
        }
        if (interfaceC9515x81.f(interfaceC3159aT0O0) != interfaceC9515x81.f(interfaceC3159aT0O02)) {
            return false;
        }
        if (interfaceC9515x81.h(interfaceC3159aT0) || !interfaceC9515x81.h(interfaceC3159aT02)) {
            return !interfaceC9515x81.u(interfaceC3159aT0) || interfaceC9515x81.u(interfaceC3159aT02);
        }
        return false;
    }

    public final boolean s(C9510x71 c9510x71, InterfaceC6993o71 interfaceC6993o71, InterfaceC3159aT0 interfaceC3159aT0) {
        boolean zM;
        C9510x71 c9510x712 = c9510x71;
        G10.g(c9510x712, "<this>");
        G10.g(interfaceC6993o71, "capturedSubArguments");
        G10.g(interfaceC3159aT0, "superType");
        InterfaceC9515x81 interfaceC9515x81J = c9510x712.j();
        D71 d71F = interfaceC9515x81J.f(interfaceC3159aT0);
        int iP = interfaceC9515x81J.P(interfaceC6993o71);
        int iL = interfaceC9515x81J.L(d71F);
        if (iP != iL || iP != interfaceC9515x81J.I(interfaceC3159aT0)) {
            return false;
        }
        for (int i = 0; i < iL; i++) {
            InterfaceC7272p71 interfaceC7272p71P0 = interfaceC9515x81J.p0(interfaceC3159aT0, i);
            if (!interfaceC9515x81J.z0(interfaceC7272p71P0)) {
                O80 o80H0 = interfaceC9515x81J.h0(interfaceC7272p71P0);
                InterfaceC7272p71 interfaceC7272p71G0 = interfaceC9515x81J.G0(interfaceC6993o71, i);
                interfaceC9515x81J.Y(interfaceC7272p71G0);
                J81 j81 = J81.E;
                O80 o80H02 = interfaceC9515x81J.h0(interfaceC7272p71G0);
                N0 n0 = a;
                J81 j81L = n0.l(interfaceC9515x81J.B(interfaceC9515x81J.n0(d71F, i)), interfaceC9515x81J.Y(interfaceC7272p71P0));
                if (j81L == null) {
                    return c9510x712.m();
                }
                if (j81L != j81 || (!n0.z(interfaceC9515x81J, o80H02, o80H0, d71F) && !n0.z(interfaceC9515x81J, o80H0, o80H02, d71F))) {
                    if (c9510x712.g > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + o80H02).toString());
                    }
                    c9510x712.g++;
                    int i2 = a.a[j81L.ordinal()];
                    if (i2 == 1) {
                        zM = n0.m(c9510x712, o80H02, o80H0);
                    } else if (i2 == 2) {
                        c9510x712 = c9510x71;
                        zM = v(n0, c9510x712, o80H02, o80H0, false, 8, null);
                    } else {
                        if (i2 != 3) {
                            throw new C6902no0();
                        }
                        zM = v(n0, c9510x712, o80H0, o80H02, false, 8, null);
                        c9510x712 = c9510x71;
                    }
                    c9510x712.g--;
                    if (!zM) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean t(C9510x71 c9510x71, O80 o80, O80 o802) {
        G10.g(c9510x71, "state");
        G10.g(o80, "subType");
        G10.g(o802, "superType");
        return v(this, c9510x71, o80, o802, false, 8, null);
    }

    public final boolean u(C9510x71 c9510x71, O80 o80, O80 o802, boolean z) {
        G10.g(c9510x71, "state");
        G10.g(o80, "subType");
        G10.g(o802, "superType");
        if (o80 == o802) {
            return true;
        }
        if (c9510x71.f(o80, o802)) {
            return k(c9510x71, o80, o802, z);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(com.daaw.C9510x71 r18, com.daaw.InterfaceC3159aT0 r19, com.daaw.InterfaceC3159aT0 r20) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.N0.w(com.daaw.x71, com.daaw.aT0, com.daaw.aT0):boolean");
    }

    public final boolean z(InterfaceC9515x81 interfaceC9515x81, O80 o80, O80 o802, D71 d71) {
        InterfaceC3159aT0 interfaceC3159aT0B = interfaceC9515x81.b(o80);
        if (interfaceC3159aT0B instanceof InterfaceC1068Hj) {
            InterfaceC1068Hj interfaceC1068Hj = (InterfaceC1068Hj) interfaceC3159aT0B;
            if (interfaceC9515x81.y0(interfaceC1068Hj) || !interfaceC9515x81.z0(interfaceC9515x81.w(interfaceC9515x81.B0(interfaceC1068Hj))) || interfaceC9515x81.r0(interfaceC1068Hj) != EnumC9951yj.B) {
                return false;
            }
            interfaceC9515x81.a0(o802);
        }
        return false;
    }
}
