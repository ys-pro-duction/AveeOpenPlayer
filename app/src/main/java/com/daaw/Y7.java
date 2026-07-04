package com.daaw;

import com.daaw.YV0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Y7 {
    public static final C2352Tm0 a;
    public static final C2352Tm0 b;
    public static final C2352Tm0 c;
    public static final C2352Tm0 d;
    public static final C2352Tm0 e;

    static {
        C2352Tm0 c2352Tm0L = C2352Tm0.l("message");
        G10.f(c2352Tm0L, "identifier(...)");
        a = c2352Tm0L;
        C2352Tm0 c2352Tm0L2 = C2352Tm0.l("replaceWith");
        G10.f(c2352Tm0L2, "identifier(...)");
        b = c2352Tm0L2;
        C2352Tm0 c2352Tm0L3 = C2352Tm0.l("level");
        G10.f(c2352Tm0L3, "identifier(...)");
        c = c2352Tm0L3;
        C2352Tm0 c2352Tm0L4 = C2352Tm0.l("expression");
        G10.f(c2352Tm0L4, "identifier(...)");
        d = c2352Tm0L4;
        C2352Tm0 c2352Tm0L5 = C2352Tm0.l("imports");
        G10.f(c2352Tm0L5, "identifier(...)");
        e = c2352Tm0L5;
    }

    public static final O7 b(AbstractC8670u80 abstractC8670u80, String str, String str2, String str3, boolean z) {
        G10.g(abstractC8670u80, "<this>");
        G10.g(str, "message");
        G10.g(str2, "replaceWith");
        G10.g(str3, "level");
        C9662xh c9662xh = new C9662xh(abstractC8670u80, YV0.a.B, AbstractC1473Lg0.k(D61.a(d, new C7103oY0(str2)), D61.a(e, new C4027db(AbstractC1599Mm.k(), new X7(abstractC8670u80)))), false, 8, null);
        AP ap = YV0.a.y;
        C0576Cs0 c0576Cs0A = D61.a(a, new C7103oY0(str));
        C0576Cs0 c0576Cs0A2 = D61.a(b, new Z7(c9662xh));
        C2352Tm0 c2352Tm0 = c;
        C6607ml c6607mlC = C6607ml.d.c(YV0.a.A);
        C2352Tm0 c2352Tm0L = C2352Tm0.l(str3);
        G10.f(c2352Tm0L, "identifier(...)");
        return new C9662xh(abstractC8670u80, ap, AbstractC1473Lg0.k(c0576Cs0A, c0576Cs0A2, D61.a(c2352Tm0, new C3946dH(c6607mlC, c2352Tm0L))), z);
    }

    public static /* synthetic */ O7 c(AbstractC8670u80 abstractC8670u80, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return b(abstractC8670u80, str, str2, str3, z);
    }

    public static final I80 d(AbstractC8670u80 abstractC8670u80, InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(abstractC8670u80, "$this_createDeprecatedAnnotation");
        G10.g(interfaceC2968Zk0, "module");
        YS0 ys0L = interfaceC2968Zk0.p().l(EnumC1042Hc1.F, abstractC8670u80.W());
        G10.f(ys0L, "getArrayType(...)");
        return ys0L;
    }
}
