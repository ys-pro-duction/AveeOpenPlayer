package com.daaw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class XV0 {
    public static final C6607ml k(String str) {
        AP apB = WV0.a.b();
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        return new C6607ml(apB, c2352Tm0L);
    }

    public static final C6607ml l(String str) {
        AP apF = WV0.a.f();
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        return new C6607ml(apF, c2352Tm0L);
    }

    public static final C6607ml m(String str) {
        AP apC = WV0.a.c();
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        return new C6607ml(apC, c2352Tm0L);
    }

    public static final C6607ml n(String str) {
        AP apD = WV0.a.d();
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        return new C6607ml(apD, c2352Tm0L);
    }

    public static final C6607ml o(String str) {
        AP apE = WV0.a.e();
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        return new C6607ml(apE, c2352Tm0L);
    }

    public static final Map p(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            C0576Cs0 c0576Cs0A = D61.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(c0576Cs0A.c(), c0576Cs0A.d());
        }
        return linkedHashMap;
    }

    public static final C6607ml q(C2352Tm0 c2352Tm0) {
        WV0 wv0 = WV0.a;
        AP apF = wv0.a().f();
        C2352Tm0 c2352Tm0L = C2352Tm0.l(c2352Tm0.h() + wv0.a().h().h());
        G10.f(c2352Tm0L, "identifier(...)");
        return new C6607ml(apF, c2352Tm0L);
    }

    public static final C6607ml r(String str) {
        AP apG = WV0.a.g();
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        return new C6607ml(apG, c2352Tm0L);
    }

    public static final C6607ml s(String str) {
        AP apH = WV0.a.h();
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str);
        G10.f(c2352Tm0L, "identifier(...)");
        return new C6607ml(apH, c2352Tm0L);
    }

    public static final C6607ml t(C6607ml c6607ml) {
        AP apF = WV0.a.f();
        C2352Tm0 c2352Tm0L = C2352Tm0.l('U' + c6607ml.h().h());
        G10.f(c2352Tm0L, "identifier(...)");
        return new C6607ml(apF, c2352Tm0L);
    }
}
