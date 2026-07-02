package com.daaw;

/* JADX INFO: renamed from: com.daaw.gV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4849gV0 {
    public static final boolean d(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "<this>");
        return g(interfaceC1583Mi) != null;
    }

    public static final String e(InterfaceC1583Mi interfaceC1583Mi) {
        InterfaceC1583Mi interfaceC1583MiW;
        C2352Tm0 c2352Tm0J;
        G10.g(interfaceC1583Mi, "callableMemberDescriptor");
        InterfaceC1583Mi interfaceC1583MiF = f(interfaceC1583Mi);
        if (interfaceC1583MiF != null && (interfaceC1583MiW = AbstractC8400tA.w(interfaceC1583MiF)) != null) {
            if (interfaceC1583MiW instanceof InterfaceC4476fA0) {
                return C8838ul.a.b(interfaceC1583MiW);
            }
            if ((interfaceC1583MiW instanceof IS0) && (c2352Tm0J = C1268Jh.o.j((IS0) interfaceC1583MiW)) != null) {
                return c2352Tm0J.c();
            }
        }
        return null;
    }

    public static final InterfaceC1583Mi f(InterfaceC1583Mi interfaceC1583Mi) {
        if (AbstractC8670u80.g0(interfaceC1583Mi)) {
            return g(interfaceC1583Mi);
        }
        return null;
    }

    public static final InterfaceC1583Mi g(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "<this>");
        if (!AbstractC6533mV0.a.g().contains(interfaceC1583Mi.getName()) && !C1683Nh.a.d().contains(AbstractC8400tA.w(interfaceC1583Mi).getName())) {
            return null;
        }
        if ((interfaceC1583Mi instanceof InterfaceC4476fA0) || (interfaceC1583Mi instanceof InterfaceC3640cA0)) {
            return AbstractC8400tA.i(interfaceC1583Mi, false, C4003dV0.B, 1, null);
        }
        if (interfaceC1583Mi instanceof IS0) {
            return AbstractC8400tA.i(interfaceC1583Mi, false, C4281eV0.B, 1, null);
        }
        return null;
    }

    public static final boolean h(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "it");
        return C8838ul.a.d(AbstractC8400tA.w(interfaceC1583Mi));
    }

    public static final boolean i(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "it");
        return C1268Jh.o.k((IS0) interfaceC1583Mi);
    }

    public static final InterfaceC1583Mi j(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "<this>");
        InterfaceC1583Mi interfaceC1583MiG = g(interfaceC1583Mi);
        if (interfaceC1583MiG != null) {
            return interfaceC1583MiG;
        }
        C1579Mh c1579Mh = C1579Mh.o;
        C2352Tm0 name = interfaceC1583Mi.getName();
        G10.f(name, "getName(...)");
        if (c1579Mh.n(name)) {
            return AbstractC8400tA.i(interfaceC1583Mi, false, C4570fV0.B, 1, null);
        }
        return null;
    }

    public static final boolean k(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "it");
        return AbstractC8670u80.g0(interfaceC1583Mi) && C1579Mh.o(interfaceC1583Mi) != null;
    }

    public static final boolean l(InterfaceC4923gl interfaceC4923gl, InterfaceC1376Ki interfaceC1376Ki) {
        G10.g(interfaceC4923gl, "<this>");
        G10.g(interfaceC1376Ki, "specialCallableDescriptor");
        InterfaceC8612tw interfaceC8612twB = interfaceC1376Ki.b();
        G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        YS0 ys0S = ((InterfaceC4923gl) interfaceC8612twB).s();
        G10.f(ys0S, "getDefaultType(...)");
        for (InterfaceC4923gl interfaceC4923glS = AbstractC7006oA.s(interfaceC4923gl); interfaceC4923glS != null; interfaceC4923glS = AbstractC7006oA.s(interfaceC4923glS)) {
            if (!(interfaceC4923glS instanceof F20) && AbstractC9789y71.b(interfaceC4923glS.s(), ys0S) != null) {
                return !AbstractC8670u80.g0(interfaceC4923glS);
            }
        }
        return false;
    }

    public static final boolean m(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "<this>");
        return AbstractC8400tA.w(interfaceC1583Mi).b() instanceof F20;
    }

    public static final boolean n(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "<this>");
        return m(interfaceC1583Mi) || AbstractC8670u80.g0(interfaceC1583Mi);
    }
}
