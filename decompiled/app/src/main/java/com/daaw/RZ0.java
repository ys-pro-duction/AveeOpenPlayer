package com.daaw;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RZ0 {
    public static final C3526bm0 a;

    static {
        C7588qG c7588qG = new C7588qG(BH.a.i(), YV0.s);
        EnumC6886nl enumC6886nl = EnumC6886nl.D;
        C2352Tm0 c2352Tm0G = YV0.v.g();
        RU0 ru0 = RU0.a;
        InterfaceC10174zX0 interfaceC10174zX0 = C9085vd0.e;
        C3526bm0 c3526bm0 = new C3526bm0(c7588qG, enumC6886nl, false, false, c2352Tm0G, ru0, interfaceC10174zX0);
        c3526bm0.M0(EnumC0336Ak0.F);
        c3526bm0.O0(AbstractC8679uA.e);
        c3526bm0.N0(AbstractC1496Lm.e(C3074a81.R0(c3526bm0, InterfaceC3072a8.b.b(), false, EnumC1042Hc1.G, C2352Tm0.l(RequestConfiguration.MAX_AD_CONTENT_RATING_T), 0, interfaceC10174zX0)));
        c3526bm0.K0();
        a = c3526bm0;
    }

    public static final YS0 a(I80 i80) {
        G10.g(i80, "suspendFunType");
        AR.r(i80);
        AbstractC8670u80 abstractC8670u80N = H81.n(i80);
        InterfaceC3072a8 annotations = i80.getAnnotations();
        I80 i80K = AR.k(i80);
        List listE = AR.e(i80);
        List listM = AR.m(i80);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC6440m81) it.next()).getType());
        }
        C8387t71 c8387t71J = C8387t71.C.j();
        C71 c71K = a.k();
        G10.f(c71K, "getTypeConstructor(...)");
        List listA0 = AbstractC2455Um.A0(arrayList, M80.k(c8387t71J, c71K, AbstractC1496Lm.e(H81.d(AR.l(i80))), false, null, 16, null));
        YS0 ys0I = H81.n(i80).I();
        G10.f(ys0I, "getNullableAnyType(...)");
        return AR.b(abstractC8670u80N, annotations, i80K, listE, listA0, null, ys0I, (128 & 128) != 0 ? false : false).R0(i80.O0());
    }
}
