package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0820Ez {
    public static final String a(InterfaceC4923gl interfaceC4923gl, W71 w71) {
        G10.g(interfaceC4923gl, "klass");
        G10.g(w71, "typeMappingConfiguration");
        String strE = w71.e(interfaceC4923gl);
        if (strE != null) {
            return strE;
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC4923gl.b();
        G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
        String strH = C7091oV0.b(interfaceC4923gl.getName()).h();
        G10.f(strH, "getIdentifier(...)");
        if (interfaceC8612twB instanceof InterfaceC2372Tr0) {
            AP apD = ((InterfaceC2372Tr0) interfaceC8612twB).d();
            if (apD.d()) {
                return strH;
            }
            StringBuilder sb = new StringBuilder();
            String strB = apD.b();
            G10.f(strB, "asString(...)");
            sb.append(AY0.r(strB, '.', '/', false, 4, null));
            sb.append('/');
            sb.append(strH);
            return sb.toString();
        }
        InterfaceC4923gl interfaceC4923gl2 = interfaceC8612twB instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twB : null;
        if (interfaceC4923gl2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC8612twB + " for " + interfaceC4923gl);
        }
        String strD = w71.d(interfaceC4923gl2);
        if (strD == null) {
            strD = a(interfaceC4923gl2, w71);
        }
        return strD + '$' + strH;
    }

    public static /* synthetic */ String b(InterfaceC4923gl interfaceC4923gl, W71 w71, int i, Object obj) {
        if ((i & 2) != 0) {
            w71 = X71.a;
        }
        return a(interfaceC4923gl, w71);
    }

    public static final boolean c(InterfaceC1376Ki interfaceC1376Ki) {
        G10.g(interfaceC1376Ki, "descriptor");
        if (interfaceC1376Ki instanceof InterfaceC7195or) {
            return true;
        }
        I80 returnType = interfaceC1376Ki.getReturnType();
        G10.d(returnType);
        if (!AbstractC8670u80.C0(returnType)) {
            return false;
        }
        I80 returnType2 = interfaceC1376Ki.getReturnType();
        G10.d(returnType2);
        return (D81.l(returnType2) || (interfaceC1376Ki instanceof InterfaceC5044hA0)) ? false : true;
    }

    public static final Object d(I80 i80, InterfaceC8097s50 interfaceC8097s50, Y71 y71, W71 w71, Z40 z40, InterfaceC3986dR interfaceC3986dR) {
        Object objA;
        I80 i802;
        Object objD;
        G10.g(i80, "kotlinType");
        G10.g(interfaceC8097s50, "factory");
        G10.g(y71, "mode");
        G10.g(w71, "typeMappingConfiguration");
        G10.g(interfaceC3986dR, "writeGenericType");
        I80 i80C = w71.c(i80);
        if (i80C != null) {
            return d(i80C, interfaceC8097s50, y71, w71, z40, interfaceC3986dR);
        }
        if (AR.r(i80)) {
            return d(RZ0.a(i80), interfaceC8097s50, y71, w71, z40, interfaceC3986dR);
        }
        CS0 cs0 = CS0.a;
        Object objB = AbstractC8113s81.b(cs0, i80, interfaceC8097s50, y71);
        if (objB != null) {
            Object objA2 = AbstractC8113s81.a(interfaceC8097s50, objB, y71.d());
            interfaceC3986dR.invoke(i80, objA2, y71);
            return objA2;
        }
        C71 c71N0 = i80.N0();
        if (c71N0 instanceof B10) {
            B10 b10 = (B10) c71N0;
            I80 i80L = b10.l();
            if (i80L == null) {
                i80L = w71.b(b10.b());
            }
            return d(H81.D(i80L), interfaceC8097s50, y71, w71, z40, interfaceC3986dR);
        }
        InterfaceC10240zl interfaceC10240zlC = c71N0.c();
        if (interfaceC10240zlC == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + i80);
        }
        if (BH.m(interfaceC10240zlC)) {
            Object objC = interfaceC8097s50.c("error/NonExistentClass");
            w71.f(i80, (InterfaceC4923gl) interfaceC10240zlC);
            return objC;
        }
        boolean z = interfaceC10240zlC instanceof InterfaceC4923gl;
        if (z && AbstractC8670u80.c0(i80)) {
            if (i80.L0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) i80.L0().get(0);
            I80 type = interfaceC6440m81.getType();
            G10.f(type, "getType(...)");
            if (interfaceC6440m81.b() == EnumC1042Hc1.G) {
                objD = interfaceC8097s50.c("java/lang/Object");
            } else {
                EnumC1042Hc1 enumC1042Hc1B = interfaceC6440m81.b();
                G10.f(enumC1042Hc1B, "getProjectionKind(...)");
                objD = d(type, interfaceC8097s50, y71.f(enumC1042Hc1B, true), w71, z40, interfaceC3986dR);
            }
            return interfaceC8097s50.b('[' + interfaceC8097s50.a(objD));
        }
        if (!z) {
            if (interfaceC10240zlC instanceof Z71) {
                I80 i80O = H81.o((Z71) interfaceC10240zlC);
                if (i80.O0()) {
                    i80O = H81.B(i80O);
                }
                return d(i80O, interfaceC8097s50, y71, w71, null, HR.l());
            }
            if ((interfaceC10240zlC instanceof InterfaceC5586j71) && y71.b()) {
                return d(((InterfaceC5586j71) interfaceC10240zlC).S(), interfaceC8097s50, y71, w71, z40, interfaceC3986dR);
            }
            throw new UnsupportedOperationException("Unknown type " + i80);
        }
        if (JZ.b(interfaceC10240zlC) && !y71.c() && (i802 = (I80) AbstractC3954dJ.a(cs0, i80)) != null) {
            return d(i802, interfaceC8097s50, y71.g(), w71, z40, interfaceC3986dR);
        }
        if (y71.e() && AbstractC8670u80.l0((InterfaceC4923gl) interfaceC10240zlC)) {
            objA = interfaceC8097s50.e();
        } else {
            InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) interfaceC10240zlC;
            InterfaceC4923gl interfaceC4923glA = interfaceC4923gl.a();
            G10.f(interfaceC4923glA, "getOriginal(...)");
            objA = w71.a(interfaceC4923glA);
            if (objA == null) {
                if (interfaceC4923gl.i() == EnumC6886nl.F) {
                    InterfaceC8612tw interfaceC8612twB = interfaceC4923gl.b();
                    G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC4923gl = (InterfaceC4923gl) interfaceC8612twB;
                }
                InterfaceC4923gl interfaceC4923glA2 = interfaceC4923gl.a();
                G10.f(interfaceC4923glA2, "getOriginal(...)");
                objA = interfaceC8097s50.c(a(interfaceC4923glA2, w71));
            }
        }
        interfaceC3986dR.invoke(i80, objA, y71);
        return objA;
    }

    public static /* synthetic */ Object e(I80 i80, InterfaceC8097s50 interfaceC8097s50, Y71 y71, W71 w71, Z40 z40, InterfaceC3986dR interfaceC3986dR, int i, Object obj) {
        if ((i & 32) != 0) {
            interfaceC3986dR = HR.l();
        }
        return d(i80, interfaceC8097s50, y71, w71, z40, interfaceC3986dR);
    }
}
