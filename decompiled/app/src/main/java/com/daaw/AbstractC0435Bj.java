package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0435Bj {

    /* JADX INFO: renamed from: com.daaw.Bj$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1042Hc1.values().length];
            try {
                iArr[EnumC1042Hc1.F.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1042Hc1.G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1042Hc1.H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bj$b */
    public static final class b extends E71 {
        @Override // com.daaw.E71
        public InterfaceC6440m81 k(C71 c71) {
            G10.g(c71, SubscriberAttributeKt.JSON_NAME_KEY);
            InterfaceC0539Cj interfaceC0539Cj = c71 instanceof InterfaceC0539Cj ? (InterfaceC0539Cj) c71 : null;
            if (interfaceC0539Cj == null) {
                return null;
            }
            return interfaceC0539Cj.e().c() ? new C6998o81(EnumC1042Hc1.H, interfaceC0539Cj.e().getType()) : interfaceC0539Cj.e();
        }
    }

    public static final C9069va b(I80 i80) {
        Object objG;
        G10.g(i80, "type");
        if (ZM.b(i80)) {
            C9069va c9069vaB = b(ZM.c(i80));
            C9069va c9069vaB2 = b(ZM.d(i80));
            return new C9069va(L81.b(M80.e(ZM.c((I80) c9069vaB.c()), ZM.d((I80) c9069vaB2.c())), i80), L81.b(M80.e(ZM.c((I80) c9069vaB.d()), ZM.d((I80) c9069vaB2.d())), i80));
        }
        C71 c71N0 = i80.N0();
        if (AbstractC0860Fj.f(i80)) {
            G10.e(c71N0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            InterfaceC6440m81 interfaceC6440m81E = ((InterfaceC0539Cj) c71N0).e();
            I80 type = interfaceC6440m81E.getType();
            G10.f(type, "getType(...)");
            I80 i80C = c(type, i80);
            int i = a.a[interfaceC6440m81E.b().ordinal()];
            if (i == 2) {
                return new C9069va(i80C, H81.n(i80).I());
            }
            if (i == 3) {
                YS0 ys0H = H81.n(i80).H();
                G10.f(ys0H, "getNothingType(...)");
                return new C9069va(c(ys0H, i80), i80C);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + interfaceC6440m81E);
        }
        if (i80.L0().isEmpty() || i80.L0().size() != c71N0.getParameters().size()) {
            return new C9069va(i80, i80);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL0 = i80.L0();
        List parameters = c71N0.getParameters();
        G10.f(parameters, "getParameters(...)");
        for (C0576Cs0 c0576Cs0 : AbstractC2455Um.T0(listL0, parameters)) {
            InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) c0576Cs0.a();
            Z71 z71 = (Z71) c0576Cs0.b();
            G10.d(z71);
            C6714n71 c6714n71I = i(interfaceC6440m81, z71);
            if (interfaceC6440m81.c()) {
                arrayList.add(c6714n71I);
                arrayList2.add(c6714n71I);
            } else {
                C9069va c9069vaF = f(c6714n71I);
                C6714n71 c6714n71 = (C6714n71) c9069vaF.a();
                C6714n71 c6714n712 = (C6714n71) c9069vaF.b();
                arrayList.add(c6714n71);
                arrayList2.add(c6714n712);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((C6714n71) it.next()).d()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            objG = H81.n(i80).H();
            G10.f(objG, "getNothingType(...)");
        } else {
            objG = g(i80, arrayList);
        }
        return new C9069va(objG, g(i80, arrayList2));
    }

    public static final I80 c(I80 i80, I80 i802) {
        I80 i80Q = D81.q(i80, i802.O0());
        G10.f(i80Q, "makeNullableIfNeeded(...)");
        return i80Q;
    }

    public static final InterfaceC6440m81 d(InterfaceC6440m81 interfaceC6440m81, boolean z) {
        if (interfaceC6440m81 == null) {
            return null;
        }
        if (!interfaceC6440m81.c()) {
            I80 type = interfaceC6440m81.getType();
            G10.f(type, "getType(...)");
            if (D81.c(type, C0331Aj.B)) {
                EnumC1042Hc1 enumC1042Hc1B = interfaceC6440m81.b();
                G10.f(enumC1042Hc1B, "getProjectionKind(...)");
                return enumC1042Hc1B == EnumC1042Hc1.H ? new C6998o81(enumC1042Hc1B, (I80) b(type).d()) : z ? new C6998o81(enumC1042Hc1B, (I80) b(type).c()) : h(interfaceC6440m81);
            }
        }
        return interfaceC6440m81;
    }

    public static final Boolean e(AbstractC5708ja1 abstractC5708ja1) {
        G10.d(abstractC5708ja1);
        return Boolean.valueOf(AbstractC0860Fj.f(abstractC5708ja1));
    }

    public static final C9069va f(C6714n71 c6714n71) {
        C9069va c9069vaB = b(c6714n71.a());
        I80 i80 = (I80) c9069vaB.a();
        I80 i802 = (I80) c9069vaB.b();
        C9069va c9069vaB2 = b(c6714n71.b());
        return new C9069va(new C6714n71(c6714n71.c(), i802, (I80) c9069vaB2.a()), new C6714n71(c6714n71.c(), i80, (I80) c9069vaB2.b()));
    }

    public static final I80 g(I80 i80, List list) {
        i80.L0().size();
        list.size();
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(j((C6714n71) it.next()));
        }
        return AbstractC8671u81.e(i80, arrayList, null, null, 6, null);
    }

    public static final InterfaceC6440m81 h(InterfaceC6440m81 interfaceC6440m81) {
        C8957v81 c8957v81G = C8957v81.g(new b());
        G10.f(c8957v81G, "create(...)");
        return c8957v81G.t(interfaceC6440m81);
    }

    public static final C6714n71 i(InterfaceC6440m81 interfaceC6440m81, Z71 z71) {
        int i = a.a[C8957v81.c(z71.o(), interfaceC6440m81).ordinal()];
        if (i == 1) {
            I80 type = interfaceC6440m81.getType();
            G10.f(type, "getType(...)");
            I80 type2 = interfaceC6440m81.getType();
            G10.f(type2, "getType(...)");
            return new C6714n71(z71, type, type2);
        }
        if (i == 2) {
            I80 type3 = interfaceC6440m81.getType();
            G10.f(type3, "getType(...)");
            YS0 ys0I = AbstractC8400tA.m(z71).I();
            G10.f(ys0I, "getNullableAnyType(...)");
            return new C6714n71(z71, type3, ys0I);
        }
        if (i != 3) {
            throw new C6902no0();
        }
        YS0 ys0H = AbstractC8400tA.m(z71).H();
        G10.f(ys0H, "getNothingType(...)");
        I80 type4 = interfaceC6440m81.getType();
        G10.f(type4, "getType(...)");
        return new C6714n71(z71, ys0H, type4);
    }

    public static final InterfaceC6440m81 j(C6714n71 c6714n71) {
        c6714n71.d();
        if (!G10.c(c6714n71.a(), c6714n71.b())) {
            EnumC1042Hc1 enumC1042Hc1O = c6714n71.c().o();
            EnumC1042Hc1 enumC1042Hc1 = EnumC1042Hc1.G;
            if (enumC1042Hc1O != enumC1042Hc1) {
                return (!AbstractC8670u80.n0(c6714n71.a()) || c6714n71.c().o() == enumC1042Hc1) ? AbstractC8670u80.p0(c6714n71.b()) ? new C6998o81(k(c6714n71, enumC1042Hc1), c6714n71.a()) : new C6998o81(k(c6714n71, EnumC1042Hc1.H), c6714n71.b()) : new C6998o81(k(c6714n71, EnumC1042Hc1.H), c6714n71.b());
            }
        }
        return new C6998o81(c6714n71.a());
    }

    public static final EnumC1042Hc1 k(C6714n71 c6714n71, EnumC1042Hc1 enumC1042Hc1) {
        return enumC1042Hc1 == c6714n71.c().o() ? EnumC1042Hc1.F : enumC1042Hc1;
    }
}
