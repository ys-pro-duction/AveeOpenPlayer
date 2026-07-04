package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.iL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5366iL {
    public static final InterfaceC4923gl b(InterfaceC2968Zk0 interfaceC2968Zk0, C6607ml c6607ml) {
        G10.g(interfaceC2968Zk0, "<this>");
        G10.g(c6607ml, "classId");
        InterfaceC10240zl interfaceC10240zlC = c(interfaceC2968Zk0, c6607ml);
        if (interfaceC10240zlC instanceof InterfaceC4923gl) {
            return (InterfaceC4923gl) interfaceC10240zlC;
        }
        return null;
    }

    public static final InterfaceC10240zl c(InterfaceC2968Zk0 interfaceC2968Zk0, C6607ml c6607ml) {
        G10.g(interfaceC2968Zk0, "<this>");
        G10.g(c6607ml, "classId");
        InterfaceC2968Zk0 interfaceC2968Zk0A = DI0.a(interfaceC2968Zk0);
        if (interfaceC2968Zk0A == null) {
            InterfaceC5516is0 interfaceC5516is0R0 = interfaceC2968Zk0.r0(c6607ml.f());
            List listF = c6607ml.g().f();
            G10.f(listF, "pathSegments(...)");
            InterfaceC4346ej0 interfaceC4346ej0Q = interfaceC5516is0R0.q();
            Object objE0 = AbstractC2455Um.e0(listF);
            G10.f(objE0, "first(...)");
            InterfaceC10240zl interfaceC10240zlG = interfaceC4346ej0Q.g((C2352Tm0) objE0, EnumC5496io0.S);
            if (interfaceC10240zlG == null) {
                return null;
            }
            for (C2352Tm0 c2352Tm0 : listF.subList(1, listF.size())) {
                if (!(interfaceC10240zlG instanceof InterfaceC4923gl)) {
                    return null;
                }
                InterfaceC4346ej0 interfaceC4346ej0W0 = ((InterfaceC4923gl) interfaceC10240zlG).w0();
                G10.d(c2352Tm0);
                InterfaceC10240zl interfaceC10240zlG2 = interfaceC4346ej0W0.g(c2352Tm0, EnumC5496io0.S);
                interfaceC10240zlG = interfaceC10240zlG2 instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlG2 : null;
                if (interfaceC10240zlG == null) {
                    return null;
                }
            }
            return interfaceC10240zlG;
        }
        InterfaceC5516is0 interfaceC5516is0R02 = interfaceC2968Zk0A.r0(c6607ml.f());
        List listF2 = c6607ml.g().f();
        G10.f(listF2, "pathSegments(...)");
        InterfaceC4346ej0 interfaceC4346ej0Q2 = interfaceC5516is0R02.q();
        Object objE02 = AbstractC2455Um.e0(listF2);
        G10.f(objE02, "first(...)");
        InterfaceC10240zl interfaceC10240zlG3 = interfaceC4346ej0Q2.g((C2352Tm0) objE02, EnumC5496io0.S);
        if (interfaceC10240zlG3 == null) {
            interfaceC10240zlG3 = null;
            break;
        }
        for (C2352Tm0 c2352Tm02 : listF2.subList(1, listF2.size())) {
            if (interfaceC10240zlG3 instanceof InterfaceC4923gl) {
                InterfaceC4346ej0 interfaceC4346ej0W02 = ((InterfaceC4923gl) interfaceC10240zlG3).w0();
                G10.d(c2352Tm02);
                InterfaceC10240zl interfaceC10240zlG4 = interfaceC4346ej0W02.g(c2352Tm02, EnumC5496io0.S);
                interfaceC10240zlG3 = interfaceC10240zlG4 instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlG4 : null;
                if (interfaceC10240zlG3 == null) {
                }
            }
            interfaceC10240zlG3 = null;
        }
        if (interfaceC10240zlG3 != null) {
            return interfaceC10240zlG3;
        }
        InterfaceC5516is0 interfaceC5516is0R03 = interfaceC2968Zk0.r0(c6607ml.f());
        List listF3 = c6607ml.g().f();
        G10.f(listF3, "pathSegments(...)");
        InterfaceC4346ej0 interfaceC4346ej0Q3 = interfaceC5516is0R03.q();
        Object objE03 = AbstractC2455Um.e0(listF3);
        G10.f(objE03, "first(...)");
        InterfaceC10240zl interfaceC10240zlG5 = interfaceC4346ej0Q3.g((C2352Tm0) objE03, EnumC5496io0.S);
        if (interfaceC10240zlG5 == null) {
            return null;
        }
        for (C2352Tm0 c2352Tm03 : listF3.subList(1, listF3.size())) {
            if (!(interfaceC10240zlG5 instanceof InterfaceC4923gl)) {
                return null;
            }
            InterfaceC4346ej0 interfaceC4346ej0W03 = ((InterfaceC4923gl) interfaceC10240zlG5).w0();
            G10.d(c2352Tm03);
            InterfaceC10240zl interfaceC10240zlG6 = interfaceC4346ej0W03.g(c2352Tm03, EnumC5496io0.S);
            interfaceC10240zlG5 = interfaceC10240zlG6 instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlG6 : null;
            if (interfaceC10240zlG5 == null) {
                return null;
            }
        }
        return interfaceC10240zlG5;
    }

    public static final InterfaceC4923gl d(InterfaceC2968Zk0 interfaceC2968Zk0, C6607ml c6607ml, C0560Co0 c0560Co0) {
        G10.g(interfaceC2968Zk0, "<this>");
        G10.g(c6607ml, "classId");
        G10.g(c0560Co0, "notFoundClasses");
        InterfaceC4923gl interfaceC4923glB = b(interfaceC2968Zk0, c6607ml);
        return interfaceC4923glB != null ? interfaceC4923glB : c0560Co0.d(c6607ml, UP0.A(UP0.t(SP0.i(c6607ml, new AbstractC6449mA0() { // from class: com.daaw.iL.a
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
        }), C5087hL.B)));
    }

    public static final int e(C6607ml c6607ml) {
        G10.g(c6607ml, "it");
        return 0;
    }

    public static final InterfaceC5586j71 f(InterfaceC2968Zk0 interfaceC2968Zk0, C6607ml c6607ml) {
        G10.g(interfaceC2968Zk0, "<this>");
        G10.g(c6607ml, "classId");
        InterfaceC10240zl interfaceC10240zlC = c(interfaceC2968Zk0, c6607ml);
        if (interfaceC10240zlC instanceof InterfaceC5586j71) {
            return (InterfaceC5586j71) interfaceC10240zlC;
        }
        return null;
    }
}
