package com.daaw;

import com.daaw.C0789Er0;
import com.daaw.InterfaceC8157sJ;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.kH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5909kH implements InterfaceC8157sJ {

    /* JADX INFO: renamed from: com.daaw.kH$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C0789Er0.i.a.values().length];
            try {
                iArr[C0789Er0.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final I80 d(InterfaceC9918yc1 interfaceC9918yc1) {
        return interfaceC9918yc1.getType();
    }

    @Override // com.daaw.InterfaceC8157sJ
    public InterfaceC8157sJ.b a(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC1376Ki, "superDescriptor");
        G10.g(interfaceC1376Ki2, "subDescriptor");
        if (interfaceC1376Ki2 instanceof C3884d30) {
            C3884d30 c3884d30 = (C3884d30) interfaceC1376Ki2;
            List typeParameters = c3884d30.getTypeParameters();
            G10.f(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                C0789Er0.i iVarW = C0789Er0.w(interfaceC1376Ki, interfaceC1376Ki2);
                C5035h81 c5035h81 = null;
                byte b = 0;
                if ((iVarW != null ? iVarW.c() : null) != null) {
                    return InterfaceC8157sJ.b.UNKNOWN;
                }
                List listH = c3884d30.h();
                G10.f(listH, "getValueParameters(...)");
                KP0 kp0T = UP0.t(AbstractC2455Um.V(listH), C5627jH.B);
                I80 returnType = c3884d30.getReturnType();
                G10.d(returnType);
                KP0 kp0X = UP0.x(kp0T, returnType);
                RE0 re0I0 = c3884d30.i0();
                for (I80 i80 : UP0.w(kp0X, AbstractC1599Mm.o(re0I0 != null ? re0I0.getType() : null))) {
                    if (!i80.L0().isEmpty() && !(i80.Q0() instanceof DE0)) {
                        return InterfaceC8157sJ.b.UNKNOWN;
                    }
                }
                InterfaceC1376Ki interfaceC1376KiA = (InterfaceC1376Ki) interfaceC1376Ki.c(new AE0(c5035h81, 1, b == true ? 1 : 0).c());
                if (interfaceC1376KiA == null) {
                    return InterfaceC8157sJ.b.UNKNOWN;
                }
                if (interfaceC1376KiA instanceof IS0) {
                    IS0 is0 = (IS0) interfaceC1376KiA;
                    List typeParameters2 = is0.getTypeParameters();
                    G10.f(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        interfaceC1376KiA = is0.t().o(AbstractC1599Mm.k()).a();
                        G10.d(interfaceC1376KiA);
                    }
                }
                C0789Er0.i.a aVarC = C0789Er0.f.F(interfaceC1376KiA, interfaceC1376Ki2, false).c();
                G10.f(aVarC, "getResult(...)");
                return a.a[aVarC.ordinal()] == 1 ? InterfaceC8157sJ.b.OVERRIDABLE : InterfaceC8157sJ.b.UNKNOWN;
            }
        }
        return InterfaceC8157sJ.b.UNKNOWN;
    }

    @Override // com.daaw.InterfaceC8157sJ
    public InterfaceC8157sJ.a b() {
        return InterfaceC8157sJ.a.SUCCESS_ONLY;
    }
}
