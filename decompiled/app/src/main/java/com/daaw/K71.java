package com.daaw;

import com.daaw.C8906uy;
import com.daaw.KA0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class K71 {
    public final BA a;
    public final K71 b;
    public final String c;
    public final String d;
    public final NQ e;
    public final NQ f;
    public final Map g;

    public K71(BA ba, K71 k71, List list, String str, String str2) {
        Map linkedHashMap;
        G10.g(ba, "c");
        G10.g(list, "typeParameterProtos");
        G10.g(str, "debugName");
        G10.g(str2, "containerPresentableName");
        this.a = ba;
        this.b = k71;
        this.c = str;
        this.d = str2;
        this.e = ba.h().b(new F71(this));
        this.f = ba.h().b(new G71(this));
        if (list.isEmpty()) {
            linkedHashMap = AbstractC1473Lg0.h();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                MA0 ma0 = (MA0) it.next();
                linkedHashMap.put(Integer.valueOf(ma0.Q()), new CB(this.a, ma0, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static final int A(KA0 ka0) {
        G10.g(ka0, "it");
        return ka0.Y();
    }

    public static final InterfaceC10240zl f(K71 k71, int i) {
        G10.g(k71, "this$0");
        return k71.g(i);
    }

    public static final List p(KA0 ka0, K71 k71) {
        List listZ = ka0.Z();
        G10.f(listZ, "getArgumentList(...)");
        List list = listZ;
        KA0 ka0J = AbstractC3366bB0.j(ka0, k71.a.j());
        List listP = ka0J != null ? p(ka0J, k71) : null;
        if (listP == null) {
            listP = AbstractC1599Mm.k();
        }
        return AbstractC2455Um.z0(list, listP);
    }

    public static /* synthetic */ YS0 q(K71 k71, KA0 ka0, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return k71.o(ka0, z);
    }

    public static final List r(K71 k71, KA0 ka0) {
        G10.g(k71, "this$0");
        G10.g(ka0, "$proto");
        return k71.a.c().d().b(ka0, k71.a.g());
    }

    public static final InterfaceC10240zl v(K71 k71, int i) {
        G10.g(k71, "this$0");
        return k71.i(i);
    }

    public static final InterfaceC4923gl y(K71 k71, KA0 ka0, int i) {
        C6607ml c6607mlA = AbstractC3252an0.a(k71.a.g(), i);
        List listB = UP0.B(UP0.t(SP0.i(ka0, new I71(k71)), J71.B));
        int iL = UP0.l(SP0.i(c6607mlA, new AbstractC6449mA0() { // from class: com.daaw.K71.a
            @Override // com.daaw.InterfaceC3347b70
            public Object get(Object obj) {
                return ((C6607ml) obj).e();
            }

            @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
            public String getName() {
                return "outerClassId";
            }

            @Override // com.daaw.AbstractC1687Ni
            public InterfaceC6429m60 getOwner() {
                return AbstractC5624jG0.b(C6607ml.class);
            }

            @Override // com.daaw.AbstractC1687Ni
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }));
        while (listB.size() < iL) {
            listB.add(0);
        }
        return k71.a.c().r().d(c6607mlA, listB);
    }

    public static final KA0 z(K71 k71, KA0 ka0) {
        G10.g(k71, "this$0");
        G10.g(ka0, "it");
        return AbstractC3366bB0.j(ka0, k71.a.j());
    }

    public final InterfaceC10240zl g(int i) {
        C6607ml c6607mlA = AbstractC3252an0.a(this.a.g(), i);
        return c6607mlA.i() ? this.a.c().b(c6607mlA) : AbstractC5366iL.c(this.a.c().q(), c6607mlA);
    }

    public final YS0 h(int i) {
        if (AbstractC3252an0.a(this.a.g(), i).i()) {
            return this.a.c().o().a();
        }
        return null;
    }

    public final InterfaceC10240zl i(int i) {
        C6607ml c6607mlA = AbstractC3252an0.a(this.a.g(), i);
        if (c6607mlA.i()) {
            return null;
        }
        return AbstractC5366iL.f(this.a.c().q(), c6607mlA);
    }

    public final YS0 j(I80 i80, I80 i802) {
        AbstractC8670u80 abstractC8670u80N = H81.n(i80);
        InterfaceC3072a8 annotations = i80.getAnnotations();
        I80 i80K = AR.k(i80);
        List listE = AR.e(i80);
        List listZ = AbstractC2455Um.Z(AR.m(i80), 1);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listZ, 10));
        Iterator it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC6440m81) it.next()).getType());
        }
        return AR.b(abstractC8670u80N, annotations, i80K, listE, arrayList, null, i802, true).R0(i80.O0());
    }

    public final YS0 k(C8387t71 c8387t71, C71 c71, List list, boolean z) {
        List list2;
        YS0 ys0L;
        int size;
        int size2 = c71.getParameters().size() - list.size();
        if (size2 != 0) {
            ys0L = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                C71 c71K = c71.p().X(size).k();
                G10.f(c71K, "getTypeConstructor(...)");
                list2 = list;
                ys0L = M80.k(c8387t71, c71K, list2, z, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            ys0L = l(c8387t71, c71, list2, z);
        }
        return ys0L == null ? BH.a.f(AH.q0, list2, c71, new String[0]) : ys0L;
    }

    public final YS0 l(C8387t71 c8387t71, C71 c71, List list, boolean z) {
        YS0 ys0K = M80.k(c8387t71, c71, list, z, null, 16, null);
        if (AR.q(ys0K)) {
            return t(ys0K);
        }
        return null;
    }

    public final List m() {
        return AbstractC2455Um.M0(this.g.values());
    }

    public final Z71 n(int i) {
        Z71 z71 = (Z71) this.g.get(Integer.valueOf(i));
        if (z71 != null) {
            return z71;
        }
        K71 k71 = this.b;
        if (k71 != null) {
            return k71.n(i);
        }
        return null;
    }

    public final YS0 o(KA0 ka0, boolean z) {
        YS0 ys0C;
        YS0 ys0J;
        G10.g(ka0, "proto");
        YS0 ys0H = ka0.p0() ? h(ka0.a0()) : ka0.x0() ? h(ka0.k0()) : null;
        if (ys0H != null) {
            return ys0H;
        }
        C71 c71X = x(ka0);
        if (BH.m(c71X.c())) {
            return BH.a.c(AH.V0, c71X, c71X.toString());
        }
        DA da = new DA(this.a.h(), new H71(this, ka0));
        C8387t71 c8387t71S = s(this.a.c().v(), da, c71X, this.a.e());
        List listP = p(ka0, this);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listP, 10));
        int i = 0;
        for (Object obj : listP) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            List parameters = c71X.getParameters();
            G10.f(parameters, "getParameters(...)");
            arrayList.add(w((Z71) AbstractC2455Um.h0(parameters, i), (KA0.b) obj));
            i = i2;
        }
        List listM0 = AbstractC2455Um.M0(arrayList);
        InterfaceC10240zl interfaceC10240zlC = c71X.c();
        if (z && (interfaceC10240zlC instanceof InterfaceC5586j71)) {
            YS0 ys0C2 = M80.c((InterfaceC5586j71) interfaceC10240zlC, listM0);
            ys0C = ys0C2.R0(N80.b(ys0C2) || ka0.h0()).T0(s(this.a.c().v(), InterfaceC3072a8.b.a(AbstractC2455Um.x0(da, ys0C2.getAnnotations())), c71X, this.a.e()));
        } else if (SM.a.d(ka0.d0()).booleanValue()) {
            ys0C = k(c8387t71S, c71X, listM0, ka0.h0());
        } else {
            YS0 ys0K = M80.k(c8387t71S, c71X, listM0, ka0.h0(), null, 16, null);
            if (SM.b.d(ka0.d0()).booleanValue()) {
                ys0C = C8906uy.a.c(C8906uy.E, ys0K, true, false, 4, null);
                if (ys0C == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + ys0K + '\'').toString());
                }
            } else {
                ys0C = ys0K;
            }
        }
        KA0 ka0A = AbstractC3366bB0.a(ka0, this.a.j());
        return (ka0A == null || (ys0J = AbstractC7370pV0.j(ys0C, o(ka0A, false))) == null) ? ys0C : ys0J;
    }

    public final C8387t71 s(List list, InterfaceC3072a8 interfaceC3072a8, C71 c71, InterfaceC8612tw interfaceC8612tw) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC7829r71) it.next()).a(interfaceC3072a8, c71, interfaceC8612tw));
        }
        return C8387t71.C.i(AbstractC1703Nm.x(arrayList));
    }

    public final YS0 t(I80 i80) {
        I80 type;
        InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) AbstractC2455Um.r0(AR.m(i80));
        if (interfaceC6440m81 == null || (type = interfaceC6440m81.getType()) == null) {
            return null;
        }
        InterfaceC10240zl interfaceC10240zlC = type.N0().c();
        AP apO = interfaceC10240zlC != null ? AbstractC8400tA.o(interfaceC10240zlC) : null;
        if (type.L0().size() != 1 || (!G10.c(apO, YV0.v) && !G10.c(apO, L71.a))) {
            return (YS0) i80;
        }
        I80 type2 = ((InterfaceC6440m81) AbstractC2455Um.C0(type.L0())).getType();
        G10.f(type2, "getType(...)");
        InterfaceC8612tw interfaceC8612twE = this.a.e();
        InterfaceC1376Ki interfaceC1376Ki = interfaceC8612twE instanceof InterfaceC1376Ki ? (InterfaceC1376Ki) interfaceC8612twE : null;
        return G10.c(interfaceC1376Ki != null ? AbstractC8400tA.k(interfaceC1376Ki) : null, QZ0.a) ? j(i80, type2) : j(i80, type2);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        if (this.b == null) {
            str = "";
        } else {
            str = ". Child of " + this.b.c;
        }
        sb.append(str);
        return sb.toString();
    }

    public final I80 u(KA0 ka0) {
        G10.g(ka0, "proto");
        if (!ka0.r0()) {
            return o(ka0, true);
        }
        String string = this.a.g().getString(ka0.e0());
        YS0 ys0Q = q(this, ka0, false, 2, null);
        KA0 ka0F = AbstractC3366bB0.f(ka0, this.a.j());
        G10.d(ka0F);
        return this.a.c().m().a(ka0, string, ys0Q, q(this, ka0F, false, 2, null));
    }

    public final InterfaceC6440m81 w(Z71 z71, KA0.b bVar) {
        if (bVar.A() == KA0.b.c.STAR) {
            return z71 == null ? new ZV0(this.a.c().q().p()) : new C3450bW0(z71);
        }
        WA0 wa0 = WA0.a;
        KA0.b.c cVarA = bVar.A();
        G10.f(cVarA, "getProjection(...)");
        EnumC1042Hc1 enumC1042Hc1C = wa0.c(cVarA);
        KA0 ka0P = AbstractC3366bB0.p(bVar, this.a.j());
        return ka0P == null ? new C6998o81(BH.d(AH.a1, bVar.toString())) : new C6998o81(enumC1042Hc1C, u(ka0P));
    }

    public final C71 x(KA0 ka0) {
        InterfaceC10240zl interfaceC10240zlY;
        Object next;
        if (ka0.p0()) {
            interfaceC10240zlY = (InterfaceC10240zl) this.e.invoke(Integer.valueOf(ka0.a0()));
            if (interfaceC10240zlY == null) {
                interfaceC10240zlY = y(this, ka0, ka0.a0());
            }
        } else if (ka0.y0()) {
            interfaceC10240zlY = n(ka0.l0());
            if (interfaceC10240zlY == null) {
                return BH.a.e(AH.o0, String.valueOf(ka0.l0()), this.d);
            }
        } else if (ka0.z0()) {
            String string = this.a.g().getString(ka0.m0());
            Iterator it = m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (G10.c(((Z71) next).getName().c(), string)) {
                    break;
                }
            }
            interfaceC10240zlY = (Z71) next;
            if (interfaceC10240zlY == null) {
                return BH.a.e(AH.p0, string, this.a.e().toString());
            }
        } else {
            if (!ka0.x0()) {
                return BH.a.e(AH.s0, new String[0]);
            }
            interfaceC10240zlY = (InterfaceC10240zl) this.f.invoke(Integer.valueOf(ka0.k0()));
            if (interfaceC10240zlY == null) {
                interfaceC10240zlY = y(this, ka0, ka0.k0());
            }
        }
        C71 c71K = interfaceC10240zlY.k();
        G10.f(c71K, "getTypeConstructor(...)");
        return c71K;
    }
}
