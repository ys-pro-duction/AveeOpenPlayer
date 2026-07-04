package com.daaw;

import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.y30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9768y30 {
    public static final C9768y30 a = new C9768y30();

    public static /* synthetic */ InterfaceC4923gl f(C9768y30 c9768y30, AP ap, AbstractC8670u80 abstractC8670u80, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return c9768y30.e(ap, abstractC8670u80, num);
    }

    public final InterfaceC4923gl a(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "mutable");
        AP apO = C9489x30.a.o(AbstractC7006oA.m(interfaceC4923gl));
        if (apO != null) {
            InterfaceC4923gl interfaceC4923glO = AbstractC8400tA.m(interfaceC4923gl).o(apO);
            G10.f(interfaceC4923glO, "getBuiltInClassByFqName(...)");
            return interfaceC4923glO;
        }
        throw new IllegalArgumentException("Given class " + interfaceC4923gl + " is not a mutable collection");
    }

    public final InterfaceC4923gl b(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "readOnly");
        AP apP = C9489x30.a.p(AbstractC7006oA.m(interfaceC4923gl));
        if (apP != null) {
            InterfaceC4923gl interfaceC4923glO = AbstractC8400tA.m(interfaceC4923gl).o(apP);
            G10.f(interfaceC4923glO, "getBuiltInClassByFqName(...)");
            return interfaceC4923glO;
        }
        throw new IllegalArgumentException("Given class " + interfaceC4923gl + " is not a read-only collection");
    }

    public final boolean c(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "mutable");
        return C9489x30.a.k(AbstractC7006oA.m(interfaceC4923gl));
    }

    public final boolean d(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "readOnly");
        return C9489x30.a.l(AbstractC7006oA.m(interfaceC4923gl));
    }

    public final InterfaceC4923gl e(AP ap, AbstractC8670u80 abstractC8670u80, Integer num) {
        G10.g(ap, "fqName");
        G10.g(abstractC8670u80, "builtIns");
        C6607ml c6607mlM = (num == null || !G10.c(ap, C9489x30.a.h())) ? C9489x30.a.m(ap) : YV0.a(num.intValue());
        if (c6607mlM != null) {
            return abstractC8670u80.o(c6607mlM.a());
        }
        return null;
    }

    public final Collection g(AP ap, AbstractC8670u80 abstractC8670u80) {
        G10.g(ap, "fqName");
        G10.g(abstractC8670u80, "builtIns");
        InterfaceC4923gl interfaceC4923glF = f(this, ap, abstractC8670u80, null, 4, null);
        if (interfaceC4923glF == null) {
            return AbstractC9867yQ0.d();
        }
        AP apP = C9489x30.a.p(AbstractC8400tA.p(interfaceC4923glF));
        return apP == null ? AbstractC9588xQ0.c(interfaceC4923glF) : AbstractC1599Mm.n(interfaceC4923glF, abstractC8670u80.o(apP));
    }
}
