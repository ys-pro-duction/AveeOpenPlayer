package com.daaw;

import com.daaw.InterfaceC5248hu0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6348lp {
    public static final InterfaceC3986dR a = b.B;
    public static final InterfaceC3986dR b = d.B;
    public static final InterfaceC3986dR c = a.B;
    public static final InterfaceC3986dR d = e.B;
    public static final InterfaceC3986dR e = c.B;
    public static final Object f = new C1824Oq0("provider");
    public static final Object g = new C1824Oq0("provider");
    public static final Object h = new C1824Oq0("compositionLocalMap");
    public static final Object i = new C1824Oq0("providerValues");
    public static final Object j = new C1824Oq0("providers");
    public static final Object k = new C1824Oq0("reference");

    /* JADX INFO: renamed from: com.daaw.lp$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final a B = new a();

        public a() {
            super(3);
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            qt0.N();
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lp$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final b B = new b();

        public b() {
            super(3);
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "rememberManager");
            AbstractC6348lp.U(qt0, interfaceC10106zG0);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lp$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final c B = new c();

        public c() {
            super(3);
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            qt0.H0();
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lp$d */
    public static final class d extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final d B = new d();

        public d() {
            super(3);
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            qt0.O0();
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lp$e */
    public static final class e extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final e B = new e();

        public e() {
            super(3);
        }

        public final void a(InterfaceC8783ua interfaceC8783ua, QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
            G10.g(interfaceC8783ua, "<anonymous parameter 0>");
            G10.g(qt0, "slots");
            G10.g(interfaceC10106zG0, "<anonymous parameter 2>");
            qt0.P(0);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8783ua) obj, (QT0) obj2, (InterfaceC10106zG0) obj3);
            return G91.a;
        }
    }

    public static final int A(NT0 nt0, int i2, int i3) {
        int i4 = 0;
        while (i2 > 0 && i2 != i3) {
            i2 = nt0.M(i2);
            i4++;
        }
        return i4;
    }

    public static final List B(List list, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (int iC = C(list, i2); iC < list.size(); iC++) {
            S10 s10 = (S10) list.get(iC);
            if (s10.b() >= i3) {
                break;
            }
            arrayList.add(s10);
        }
        return arrayList;
    }

    public static final int C(List list, int i2) {
        int iD = D(list, i2);
        return iD < 0 ? -(iD + 1) : iD;
    }

    public static final int D(List list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iH = G10.h(((S10) list.get(i4)).b(), i2);
            if (iH < 0) {
                i3 = i4 + 1;
            } else {
                if (iH <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final S10 E(List list, int i2, int i3) {
        int iC = C(list, i2);
        if (iC >= list.size()) {
            return null;
        }
        S10 s10 = (S10) list.get(iC);
        if (s10.b() < i3) {
            return s10;
        }
        return null;
    }

    public static final Object F() {
        return h;
    }

    public static final Object G() {
        return f;
    }

    public static final Object H(P70 p70) {
        return p70.d() != null ? new C4446f40(Integer.valueOf(p70.a()), p70.d()) : Integer.valueOf(p70.a());
    }

    public static final Object I() {
        return g;
    }

    public static final Object J() {
        return j;
    }

    public static final Object K() {
        return i;
    }

    public static final Object L() {
        return k;
    }

    public static final Object M(InterfaceC5248hu0 interfaceC5248hu0, AbstractC2049Qp abstractC2049Qp) {
        G10.g(interfaceC5248hu0, "<this>");
        G10.g(abstractC2049Qp, SubscriberAttributeKt.JSON_NAME_KEY);
        InterfaceC6258lW0 interfaceC6258lW0 = (InterfaceC6258lW0) interfaceC5248hu0.get(abstractC2049Qp);
        if (interfaceC6258lW0 != null) {
            return interfaceC6258lW0.getValue();
        }
        return null;
    }

    public static final void N(List list, int i2, VE0 ve0, Object obj) {
        int iD = D(list, i2);
        WX wx = null;
        if (iD < 0) {
            int i3 = -(iD + 1);
            if (obj != null) {
                wx = new WX();
                wx.add(obj);
            }
            list.add(i3, new S10(ve0, i2, wx));
            return;
        }
        if (obj == null) {
            ((S10) list.get(iD)).e(null);
            return;
        }
        WX wxA = ((S10) list.get(iD)).a();
        if (wxA != null) {
            wxA.add(obj);
        }
    }

    public static final boolean O() {
        return false;
    }

    public static final HashMap P() {
        return new HashMap();
    }

    public static final int Q(NT0 nt0, int i2, int i3, int i4) {
        if (i2 != i3) {
            if (i2 == i4 || i3 == i4) {
                return i4;
            }
            if (nt0.M(i2) == i3) {
                return i3;
            }
            if (nt0.M(i3) != i2) {
                if (nt0.M(i2) == nt0.M(i3)) {
                    return nt0.M(i2);
                }
                int iA = A(nt0, i2, i4);
                int iA2 = A(nt0, i3, i4);
                int i5 = iA - iA2;
                for (int i6 = 0; i6 < i5; i6++) {
                    i2 = nt0.M(i2);
                }
                int i7 = iA2 - iA;
                for (int i8 = 0; i8 < i7; i8++) {
                    i3 = nt0.M(i3);
                }
                while (i2 != i3) {
                    i2 = nt0.M(i2);
                    i3 = nt0.M(i3);
                }
                return i2;
            }
        }
        return i2;
    }

    public static final Object R(HashMap map, Object obj) {
        Object objF0;
        LinkedHashSet linkedHashSet = (LinkedHashSet) map.get(obj);
        if (linkedHashSet == null || (objF0 = AbstractC2455Um.f0(linkedHashSet)) == null) {
            return null;
        }
        T(map, obj, objF0);
        return objF0;
    }

    public static final boolean S(HashMap map, Object obj, Object obj2) {
        Object linkedHashSet = map.get(obj);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map.put(obj, linkedHashSet);
        }
        return ((LinkedHashSet) linkedHashSet).add(obj2);
    }

    public static final G91 T(HashMap map, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) map.get(obj);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(obj2);
        if (linkedHashSet.isEmpty()) {
            map.remove(obj);
        }
        return G91.a;
    }

    public static final void U(QT0 qt0, InterfaceC10106zG0 interfaceC10106zG0) {
        VE0 ve0;
        C1715Np c1715NpL;
        G10.g(qt0, "<this>");
        G10.g(interfaceC10106zG0, "rememberManager");
        Iterator itD0 = qt0.d0();
        while (itD0.hasNext()) {
            Object next = itD0.next();
            if (next instanceof AG0) {
                interfaceC10106zG0.b((AG0) next);
            } else if ((next instanceof VE0) && (c1715NpL = (ve0 = (VE0) next).l()) != null) {
                c1715NpL.F(true);
                ve0.x();
            }
        }
        qt0.E0();
    }

    public static final S10 V(List list, int i2) {
        int iD = D(list, i2);
        if (iD >= 0) {
            return (S10) list.remove(iD);
        }
        return null;
    }

    public static final void W(List list, int i2, int i3) {
        int iC = C(list, i2);
        while (iC < list.size() && ((S10) list.get(iC)).b() < i3) {
            list.remove(iC);
        }
    }

    public static final void X(boolean z) {
        if (z) {
            return;
        }
        x("Check failed");
        throw new D80();
    }

    public static final void Z(int i2, int i3, int i4, String str) {
        G10.g(str, "info");
    }

    public static final boolean t(int i2) {
        return i2 != 0;
    }

    public static final List v(OT0 ot0, C4445f4 c4445f4) {
        ArrayList arrayList = new ArrayList();
        NT0 nt0H = ot0.H();
        try {
            w(nt0H, arrayList, ot0.e(c4445f4));
            G91 g91 = G91.a;
            return arrayList;
        } finally {
            nt0H.d();
        }
    }

    public static final void w(NT0 nt0, List list, int i2) {
        if (nt0.G(i2)) {
            list.add(nt0.I(i2));
            return;
        }
        int iB = i2 + 1;
        int iB2 = i2 + nt0.B(i2);
        while (iB < iB2) {
            w(nt0, list, iB);
            iB += nt0.B(iB);
        }
    }

    public static final Void x(String str) {
        G10.g(str, "message");
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    public static final InterfaceC5248hu0 y(C7011oB0[] c7011oB0Arr, InterfaceC5248hu0 interfaceC5248hu0, InterfaceC5781jp interfaceC5781jp, int i2) {
        interfaceC5781jp.e(721128344);
        InterfaceC5248hu0.a aVarBuilder = AbstractC7878rJ.a().builder();
        for (C7011oB0 c7011oB0 : c7011oB0Arr) {
            if (c7011oB0.a() || !z(interfaceC5248hu0, c7011oB0.b())) {
                aVarBuilder.put(c7011oB0.b(), c7011oB0.b().b(c7011oB0.c(), interfaceC5781jp, 72));
            }
        }
        InterfaceC5248hu0 interfaceC5248hu0A = aVarBuilder.a();
        interfaceC5781jp.L();
        return interfaceC5248hu0A;
    }

    public static final boolean z(InterfaceC5248hu0 interfaceC5248hu0, AbstractC2049Qp abstractC2049Qp) {
        G10.g(interfaceC5248hu0, "<this>");
        G10.g(abstractC2049Qp, SubscriberAttributeKt.JSON_NAME_KEY);
        return interfaceC5248hu0.containsKey(abstractC2049Qp);
    }

    public static final void Y() {
    }

    public static final int u(boolean z) {
        return z ? 1 : 0;
    }
}
