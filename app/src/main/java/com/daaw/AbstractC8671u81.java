package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.u81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8671u81 {
    public static final YS0 a(I80 i80) {
        G10.g(i80, "<this>");
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        YS0 ys0 = abstractC5708ja1Q0 instanceof YS0 ? (YS0) abstractC5708ja1Q0 : null;
        if (ys0 != null) {
            return ys0;
        }
        throw new IllegalStateException(("This is should be simple type: " + i80).toString());
    }

    public static final I80 b(I80 i80, List list, InterfaceC3072a8 interfaceC3072a8) {
        G10.g(i80, "<this>");
        G10.g(list, "newArguments");
        G10.g(interfaceC3072a8, "newAnnotations");
        return e(i80, list, interfaceC3072a8, null, 4, null);
    }

    public static final I80 c(I80 i80, List list, InterfaceC3072a8 interfaceC3072a8, List list2) {
        G10.g(i80, "<this>");
        G10.g(list, "newArguments");
        G10.g(interfaceC3072a8, "newAnnotations");
        G10.g(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == i80.L0()) && interfaceC3072a8 == i80.getAnnotations()) {
            return i80;
        }
        C8387t71 c8387t71M0 = i80.M0();
        if ((interfaceC3072a8 instanceof C4240eL) && ((C4240eL) interfaceC3072a8).isEmpty()) {
            interfaceC3072a8 = InterfaceC3072a8.b.b();
        }
        C8387t71 c8387t71A = AbstractC8666u71.a(c8387t71M0, interfaceC3072a8);
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (abstractC5708ja1Q0 instanceof UM) {
            UM um = (UM) abstractC5708ja1Q0;
            return M80.e(d(um.V0(), list, c8387t71A), d(um.W0(), list2, c8387t71A));
        }
        if (abstractC5708ja1Q0 instanceof YS0) {
            return d((YS0) abstractC5708ja1Q0, list, c8387t71A);
        }
        throw new C6902no0();
    }

    public static final YS0 d(YS0 ys0, List list, C8387t71 c8387t71) {
        G10.g(ys0, "<this>");
        G10.g(list, "newArguments");
        G10.g(c8387t71, "newAttributes");
        return (list.isEmpty() && c8387t71 == ys0.M0()) ? ys0 : list.isEmpty() ? ys0.T0(c8387t71) : ys0 instanceof C9830yH ? ((C9830yH) ys0).Z0(list) : M80.k(c8387t71, ys0.N0(), list, ys0.O0(), null, 16, null);
    }

    public static /* synthetic */ I80 e(I80 i80, List list, InterfaceC3072a8 interfaceC3072a8, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = i80.L0();
        }
        if ((i & 2) != 0) {
            interfaceC3072a8 = i80.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return c(i80, list, interfaceC3072a8, list2);
    }

    public static /* synthetic */ YS0 f(YS0 ys0, List list, C8387t71 c8387t71, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ys0.L0();
        }
        if ((i & 2) != 0) {
            c8387t71 = ys0.M0();
        }
        return d(ys0, list, c8387t71);
    }
}
