package com.daaw;

/* JADX INFO: renamed from: com.daaw.nA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6727nA {
    public static final InterfaceC10240zl a(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        InterfaceC8612tw interfaceC8612twB = interfaceC8612tw.b();
        if (interfaceC8612twB != null && !(interfaceC8612tw instanceof InterfaceC2372Tr0)) {
            if (!b(interfaceC8612twB)) {
                return a(interfaceC8612twB);
            }
            if (interfaceC8612twB instanceof InterfaceC10240zl) {
                return (InterfaceC10240zl) interfaceC8612twB;
            }
        }
        return null;
    }

    public static final boolean b(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        return interfaceC8612tw.b() instanceof InterfaceC2372Tr0;
    }

    public static final boolean c(InterfaceC8468tR interfaceC8468tR) {
        YS0 ys0S;
        I80 i80D;
        I80 returnType;
        G10.g(interfaceC8468tR, "<this>");
        InterfaceC8612tw interfaceC8612twB = interfaceC8468tR.b();
        InterfaceC4923gl interfaceC4923gl = interfaceC8612twB instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twB : null;
        if (interfaceC4923gl != null) {
            InterfaceC4923gl interfaceC4923gl2 = JZ.g(interfaceC4923gl) ? interfaceC4923gl : null;
            if (interfaceC4923gl2 != null && (ys0S = interfaceC4923gl2.s()) != null && (i80D = H81.D(ys0S)) != null && (returnType = interfaceC8468tR.getReturnType()) != null && G10.c(interfaceC8468tR.getName(), C2680Wq0.e) && ((H81.s(returnType) || H81.t(returnType)) && interfaceC8468tR.h().size() == 1)) {
                I80 type = ((InterfaceC9918yc1) interfaceC8468tR.h().get(0)).getType();
                G10.f(type, "getType(...)");
                if (G10.c(H81.D(type), i80D) && interfaceC8468tR.o0().isEmpty() && interfaceC8468tR.i0() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final InterfaceC4923gl d(InterfaceC2968Zk0 interfaceC2968Zk0, AP ap, InterfaceC7689qe0 interfaceC7689qe0) {
        InterfaceC10240zl interfaceC10240zlG;
        InterfaceC4346ej0 interfaceC4346ej0W0;
        G10.g(interfaceC2968Zk0, "<this>");
        G10.g(ap, "fqName");
        G10.g(interfaceC7689qe0, "lookupLocation");
        if (ap.d()) {
            return null;
        }
        AP apE = ap.e();
        G10.f(apE, "parent(...)");
        InterfaceC4346ej0 interfaceC4346ej0Q = interfaceC2968Zk0.r0(apE).q();
        C2352Tm0 c2352Tm0G = ap.g();
        G10.f(c2352Tm0G, "shortName(...)");
        InterfaceC10240zl interfaceC10240zlG2 = interfaceC4346ej0Q.g(c2352Tm0G, interfaceC7689qe0);
        InterfaceC4923gl interfaceC4923gl = interfaceC10240zlG2 instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlG2 : null;
        if (interfaceC4923gl != null) {
            return interfaceC4923gl;
        }
        AP apE2 = ap.e();
        G10.f(apE2, "parent(...)");
        InterfaceC4923gl interfaceC4923glD = d(interfaceC2968Zk0, apE2, interfaceC7689qe0);
        if (interfaceC4923glD == null || (interfaceC4346ej0W0 = interfaceC4923glD.w0()) == null) {
            interfaceC10240zlG = null;
        } else {
            C2352Tm0 c2352Tm0G2 = ap.g();
            G10.f(c2352Tm0G2, "shortName(...)");
            interfaceC10240zlG = interfaceC4346ej0W0.g(c2352Tm0G2, interfaceC7689qe0);
        }
        if (interfaceC10240zlG instanceof InterfaceC4923gl) {
            return (InterfaceC4923gl) interfaceC10240zlG;
        }
        return null;
    }
}
