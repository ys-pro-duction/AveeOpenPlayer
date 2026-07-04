package com.daaw;

import com.daaw.AbstractC6533mV0;
import com.daaw.AbstractC7818r50;
import com.daaw.InterfaceC8157sJ;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Y20 implements InterfaceC8157sJ {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final boolean a(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2) {
            G10.g(interfaceC1376Ki, "superDescriptor");
            G10.g(interfaceC1376Ki2, "subDescriptor");
            if ((interfaceC1376Ki2 instanceof C3884d30) && (interfaceC1376Ki instanceof InterfaceC8468tR)) {
                C3884d30 c3884d30 = (C3884d30) interfaceC1376Ki2;
                c3884d30.h().size();
                InterfaceC8468tR interfaceC8468tR = (InterfaceC8468tR) interfaceC1376Ki;
                interfaceC8468tR.h().size();
                List listH = c3884d30.a().h();
                G10.f(listH, "getValueParameters(...)");
                List listH2 = interfaceC8468tR.a().h();
                G10.f(listH2, "getValueParameters(...)");
                for (C0576Cs0 c0576Cs0 : AbstractC2455Um.T0(listH, listH2)) {
                    InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) c0576Cs0.a();
                    InterfaceC9918yc1 interfaceC9918yc12 = (InterfaceC9918yc1) c0576Cs0.b();
                    G10.d(interfaceC9918yc1);
                    boolean z = c((InterfaceC8468tR) interfaceC1376Ki2, interfaceC9918yc1) instanceof AbstractC7818r50.d;
                    G10.d(interfaceC9918yc12);
                    if (z != (c(interfaceC8468tR, interfaceC9918yc12) instanceof AbstractC7818r50.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean b(InterfaceC8468tR interfaceC8468tR) {
            if (interfaceC8468tR.h().size() != 1) {
                return false;
            }
            InterfaceC8612tw interfaceC8612twB = interfaceC8468tR.b();
            InterfaceC4923gl interfaceC4923gl = interfaceC8612twB instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twB : null;
            if (interfaceC4923gl == null) {
                return false;
            }
            List listH = interfaceC8468tR.h();
            G10.f(listH, "getValueParameters(...)");
            InterfaceC10240zl interfaceC10240zlC = ((InterfaceC9918yc1) AbstractC2455Um.C0(listH)).getType().N0().c();
            InterfaceC4923gl interfaceC4923gl2 = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
            return interfaceC4923gl2 != null && AbstractC8670u80.r0(interfaceC4923gl) && G10.c(AbstractC8400tA.o(interfaceC4923gl), AbstractC8400tA.o(interfaceC4923gl2));
        }

        public final AbstractC7818r50 c(InterfaceC8468tR interfaceC8468tR, InterfaceC9918yc1 interfaceC9918yc1) {
            if (AbstractC7440pk0.e(interfaceC8468tR) || b(interfaceC8468tR)) {
                I80 type = interfaceC9918yc1.getType();
                G10.f(type, "getType(...)");
                return AbstractC7440pk0.g(H81.B(type));
            }
            I80 type2 = interfaceC9918yc1.getType();
            G10.f(type2, "getType(...)");
            return AbstractC7440pk0.g(type2);
        }

        public a() {
        }
    }

    @Override // com.daaw.InterfaceC8157sJ
    public InterfaceC8157sJ.b a(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC1376Ki, "superDescriptor");
        G10.g(interfaceC1376Ki2, "subDescriptor");
        return c(interfaceC1376Ki, interfaceC1376Ki2, interfaceC4923gl) ? InterfaceC8157sJ.b.INCOMPATIBLE : a.a(interfaceC1376Ki, interfaceC1376Ki2) ? InterfaceC8157sJ.b.INCOMPATIBLE : InterfaceC8157sJ.b.UNKNOWN;
    }

    @Override // com.daaw.InterfaceC8157sJ
    public InterfaceC8157sJ.a b() {
        return InterfaceC8157sJ.a.CONFLICTS_ONLY;
    }

    public final boolean c(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, InterfaceC4923gl interfaceC4923gl) {
        if ((interfaceC1376Ki instanceof InterfaceC1583Mi) && (interfaceC1376Ki2 instanceof InterfaceC8468tR) && !AbstractC8670u80.g0(interfaceC1376Ki2)) {
            C1579Mh c1579Mh = C1579Mh.o;
            InterfaceC8468tR interfaceC8468tR = (InterfaceC8468tR) interfaceC1376Ki2;
            C2352Tm0 name = interfaceC8468tR.getName();
            G10.f(name, "getName(...)");
            if (!c1579Mh.n(name)) {
                AbstractC6533mV0.a aVar = AbstractC6533mV0.a;
                C2352Tm0 name2 = interfaceC8468tR.getName();
                G10.f(name2, "getName(...)");
                if (!aVar.k(name2)) {
                    return false;
                }
            }
            InterfaceC1583Mi interfaceC1583MiJ = AbstractC4849gV0.j((InterfaceC1583Mi) interfaceC1376Ki);
            boolean z = interfaceC1376Ki instanceof InterfaceC8468tR;
            InterfaceC8468tR interfaceC8468tR2 = z ? (InterfaceC8468tR) interfaceC1376Ki : null;
            if (!(interfaceC8468tR2 != null && interfaceC8468tR.u0() == interfaceC8468tR2.u0()) && (interfaceC1583MiJ == null || !interfaceC8468tR.u0())) {
                return true;
            }
            if ((interfaceC4923gl instanceof F20) && interfaceC8468tR.b0() == null && interfaceC1583MiJ != null && !AbstractC4849gV0.l(interfaceC4923gl, interfaceC1583MiJ)) {
                if ((interfaceC1583MiJ instanceof InterfaceC8468tR) && z && C1579Mh.l((InterfaceC8468tR) interfaceC1583MiJ) != null) {
                    String strC = AbstractC7440pk0.c(interfaceC8468tR, false, false, 2, null);
                    InterfaceC8468tR interfaceC8468tRA = ((InterfaceC8468tR) interfaceC1376Ki).a();
                    G10.f(interfaceC8468tRA, "getOriginal(...)");
                    if (G10.c(strC, AbstractC7440pk0.c(interfaceC8468tRA, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
