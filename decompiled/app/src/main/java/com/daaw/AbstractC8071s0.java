package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8071s0 {

    /* JADX INFO: renamed from: com.daaw.s0$a */
    public static final class a {
        public final O80 a;
        public final J30 b;
        public final InterfaceC3631c81 c;

        public a(O80 o80, J30 j30, InterfaceC3631c81 interfaceC3631c81) {
            this.a = o80;
            this.b = j30;
            this.c = interfaceC3631c81;
        }

        public final J30 a() {
            return this.b;
        }

        public final O80 b() {
            return this.a;
        }

        public final InterfaceC3631c81 c() {
            return this.c;
        }
    }

    public static final Iterable I(AbstractC8071s0 abstractC8071s0, InterfaceC9515x81 interfaceC9515x81, a aVar) {
        O80 o80B;
        D71 d71A0;
        List listM0;
        a aVar2;
        O80 o80B2;
        G10.g(abstractC8071s0, "this$0");
        G10.g(interfaceC9515x81, "$this_with");
        G10.g(aVar, "it");
        if ((abstractC8071s0.z() && (o80B2 = aVar.b()) != null && interfaceC9515x81.j0(o80B2)) || (o80B = aVar.b()) == null || (d71A0 = interfaceC9515x81.a0(o80B)) == null || (listM0 = interfaceC9515x81.m0(d71A0)) == null) {
            return null;
        }
        List list = listM0;
        List listW0 = interfaceC9515x81.w0(aVar.b());
        Iterator it = list.iterator();
        Iterator it2 = listW0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1703Nm.v(list, 10), AbstractC1703Nm.v(listW0, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            InterfaceC7272p71 interfaceC7272p71 = (InterfaceC7272p71) it2.next();
            InterfaceC3631c81 interfaceC3631c81 = (InterfaceC3631c81) next;
            if (interfaceC9515x81.z0(interfaceC7272p71)) {
                aVar2 = new a(null, aVar.a(), interfaceC3631c81);
            } else {
                O80 o80H0 = interfaceC9515x81.h0(interfaceC7272p71);
                aVar2 = new a(o80H0, abstractC8071s0.f(o80H0, aVar.a()), interfaceC3631c81);
            }
            arrayList.add(aVar2);
        }
        return arrayList;
    }

    public static final I30 e(M71 m71, I30[] i30Arr, int i) {
        Map mapA;
        I30 i30;
        G10.g(i30Arr, "$computedResult");
        return (m71 == null || (mapA = m71.a()) == null || (i30 = (I30) mapA.get(Integer.valueOf(i))) == null) ? (i < 0 || i >= i30Arr.length) ? I30.e.a() : i30Arr[i] : i30;
    }

    public static final boolean i(AbstractC8071s0 abstractC8071s0, a aVar, Object obj) {
        G10.g(abstractC8071s0, "this$0");
        G10.g(aVar, "$this_extractQualifiersFromAnnotations");
        G10.g(obj, "$this$extractNullability");
        return abstractC8071s0.l(obj, aVar.b());
    }

    public abstract InterfaceC9515x81 A();

    public abstract boolean B(O80 o80);

    public abstract boolean C();

    public abstract boolean D(O80 o80, O80 o802);

    public abstract boolean E(InterfaceC3631c81 interfaceC3631c81);

    public abstract boolean F(O80 o80);

    public final C3541bp0 G(C3541bp0 c3541bp0, C3541bp0 c3541bp02) {
        return c3541bp0 == null ? c3541bp02 : (c3541bp02 != null && ((c3541bp0.d() && !c3541bp02.d()) || ((c3541bp0.d() || !c3541bp02.d()) && (c3541bp0.c().compareTo(c3541bp02.c()) < 0 || c3541bp0.c().compareTo(c3541bp02.c()) <= 0)))) ? c3541bp02 : c3541bp0;
    }

    public final List H(O80 o80) {
        return j(new a(o80, f(o80, r()), null), new C7792r0(this, A()));
    }

    public final NQ d(O80 o80, Iterable iterable, M71 m71, boolean z) {
        int size;
        O80 o80B;
        G10.g(o80, "<this>");
        G10.g(iterable, "overrides");
        List listH = H(o80);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(H((O80) it.next()));
        }
        if (w()) {
            size = 1;
            break;
        }
        if (C() && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!D(o80, (O80) it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listH.size();
        I30[] i30Arr = new I30[size];
        int i = 0;
        while (i < size) {
            I30 i30H = h((a) listH.get(i));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) AbstractC2455Um.h0((List) it3.next(), i);
                I30 i30G = (aVar == null || (o80B = aVar.b()) == null) ? null : g(o80B);
                if (i30G != null) {
                    arrayList2.add(i30G);
                }
            }
            i30Arr[i] = O71.a(i30H, arrayList2, i == 0 && C(), i == 0 && s(), z);
            i++;
        }
        return new C7514q0(m71, i30Arr);
    }

    public final J30 f(O80 o80, J30 j30) {
        return m().d(j30, n(o80));
    }

    public final I30 g(O80 o80) {
        EnumC3262ap0 enumC3262ap0Y;
        EnumC3262ap0 enumC3262ap0Y2 = y(o80);
        EnumC3247am0 enumC3247am0 = null;
        if (enumC3262ap0Y2 == null) {
            O80 o80V = v(o80);
            enumC3262ap0Y = o80V != null ? y(o80V) : null;
        } else {
            enumC3262ap0Y = enumC3262ap0Y2;
        }
        InterfaceC9515x81 interfaceC9515x81A = A();
        C9489x30 c9489x30 = C9489x30.a;
        if (c9489x30.l(x(interfaceC9515x81A.A0(o80)))) {
            enumC3247am0 = EnumC3247am0.B;
        } else if (c9489x30.k(x(interfaceC9515x81A.y(o80)))) {
            enumC3247am0 = EnumC3247am0.C;
        }
        return new I30(enumC3262ap0Y, enumC3247am0, A().h(o80) || F(o80), enumC3262ap0Y != enumC3262ap0Y2);
    }

    public final I30 h(a aVar) {
        List listK;
        C3541bp0 c3541bp0O;
        O80 o80B;
        D71 d71A0;
        if (aVar.b() == null) {
            InterfaceC9515x81 interfaceC9515x81A = A();
            InterfaceC3631c81 interfaceC3631c81C = aVar.c();
            if ((interfaceC3631c81C != null ? interfaceC9515x81A.B(interfaceC3631c81C) : null) == J81.C) {
                return I30.e.a();
            }
        }
        boolean z = false;
        boolean z2 = aVar.c() == null;
        O80 o80B2 = aVar.b();
        if (o80B2 == null || (listK = n(o80B2)) == null) {
            listK = AbstractC1599Mm.k();
        }
        InterfaceC9515x81 interfaceC9515x81A2 = A();
        O80 o80B3 = aVar.b();
        InterfaceC3631c81 interfaceC3631c81L = (o80B3 == null || (d71A0 = interfaceC9515x81A2.a0(o80B3)) == null) ? null : interfaceC9515x81A2.l(d71A0);
        boolean z3 = q() == S7.G;
        if (z2) {
            if (z3 || !u() || (o80B = aVar.b()) == null || !B(o80B)) {
                listK = AbstractC2455Um.x0(p(), listK);
            } else {
                Iterable iterableP = p();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableP) {
                    if (!m().o(obj)) {
                        arrayList.add(obj);
                    }
                }
                listK = AbstractC2455Um.z0(arrayList, listK);
            }
        }
        EnumC3247am0 enumC3247am0G = m().g(listK);
        C3541bp0 c3541bp0H = m().h(listK, new C7235p0(this, aVar));
        if (c3541bp0H != null) {
            EnumC3262ap0 enumC3262ap0C = c3541bp0H.c();
            if (c3541bp0H.c() == EnumC3262ap0.D && interfaceC3631c81L != null) {
                z = true;
            }
            return new I30(enumC3262ap0C, enumC3247am0G, z, c3541bp0H.d());
        }
        S7 s7Q = (z2 || z3) ? q() : S7.F;
        J30 j30A = aVar.a();
        N20 n20A = j30A != null ? j30A.a(s7Q) : null;
        C3541bp0 c3541bp0O2 = interfaceC3631c81L != null ? o(interfaceC3631c81L) : null;
        C3541bp0 c3541bp0T = t(c3541bp0O2, n20A);
        boolean z4 = (c3541bp0O2 != null ? c3541bp0O2.c() : null) == EnumC3262ap0.D || !(interfaceC3631c81L == null || n20A == null || !n20A.c());
        InterfaceC3631c81 interfaceC3631c81C2 = aVar.c();
        if (interfaceC3631c81C2 == null || (c3541bp0O = o(interfaceC3631c81C2)) == null) {
            c3541bp0O = null;
        } else if (c3541bp0O.c() == EnumC3262ap0.C) {
            c3541bp0O = C3541bp0.b(c3541bp0O, EnumC3262ap0.B, false, 2, null);
        }
        C3541bp0 c3541bp0G = G(c3541bp0O, c3541bp0T);
        EnumC3262ap0 enumC3262ap0C2 = c3541bp0G != null ? c3541bp0G.c() : null;
        if (c3541bp0G != null && c3541bp0G.d()) {
            z = true;
        }
        return new I30(enumC3262ap0C2, enumC3247am0G, z4, z);
    }

    public final List j(Object obj, NQ nq) {
        ArrayList arrayList = new ArrayList(1);
        k(obj, arrayList, nq);
        return arrayList;
    }

    public final void k(Object obj, List list, NQ nq) {
        list.add(obj);
        Iterable iterable = (Iterable) nq.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                k(it.next(), list, nq);
            }
        }
    }

    public abstract boolean l(Object obj, O80 o80);

    public abstract AbstractC5548j m();

    public abstract Iterable n(O80 o80);

    public final C3541bp0 o(InterfaceC3631c81 interfaceC3631c81) {
        List arrayList;
        EnumC3262ap0 enumC3262ap0;
        InterfaceC9515x81 interfaceC9515x81A = A();
        if (!E(interfaceC3631c81)) {
            return null;
        }
        List listK0 = interfaceC9515x81A.k0(interfaceC3631c81);
        List list = listK0;
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!interfaceC9515x81A.K((O80) it.next())) {
                    if (!z || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (y((O80) it2.next()) != null) {
                                arrayList = listK0;
                                break;
                            }
                        }
                    }
                    if (!z || !list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (v((O80) it3.next()) != null) {
                                arrayList = new ArrayList();
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    O80 o80V = v((O80) it4.next());
                                    if (o80V != null) {
                                        arrayList.add(o80V);
                                    }
                                }
                                List list2 = arrayList;
                                if ((list2 instanceof Collection) && list2.isEmpty()) {
                                    enumC3262ap0 = EnumC3262ap0.C;
                                } else {
                                    Iterator it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        if (!interfaceC9515x81A.q((O80) it5.next())) {
                                            enumC3262ap0 = EnumC3262ap0.D;
                                            break;
                                        }
                                    }
                                    enumC3262ap0 = EnumC3262ap0.C;
                                }
                                return new C3541bp0(enumC3262ap0, arrayList != listK0);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public abstract Iterable p();

    public abstract S7 q();

    public abstract J30 r();

    public abstract boolean s();

    public abstract C3541bp0 t(C3541bp0 c3541bp0, N20 n20);

    public abstract boolean u();

    public abstract O80 v(O80 o80);

    public boolean w() {
        return false;
    }

    public abstract BP x(O80 o80);

    public final EnumC3262ap0 y(O80 o80) {
        InterfaceC9515x81 interfaceC9515x81A = A();
        if (interfaceC9515x81A.u(interfaceC9515x81A.A0(o80))) {
            return EnumC3262ap0.C;
        }
        if (interfaceC9515x81A.u(interfaceC9515x81A.y(o80))) {
            return null;
        }
        return EnumC3262ap0.D;
    }

    public abstract boolean z();
}
