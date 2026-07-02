package com.daaw;

import com.daaw.AbstractC3894d50;
import com.daaw.AbstractC4451f50;
import com.daaw.AbstractC5674jS;
import com.daaw.AbstractC6982o50;
import com.daaw.AbstractC7261p50;
import com.daaw.C6607ml;
import com.daaw.YV0;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.xK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9564xK0 {
    public static final C9564xK0 a = new C9564xK0();
    public static final C6607ml b = C6607ml.d.c(new AP("java.lang.Void"));

    public final EnumC8067rz0 a(Class cls) {
        if (cls.isPrimitive()) {
            return EnumC6703n50.g(cls.getSimpleName()).l();
        }
        return null;
    }

    public final boolean b(InterfaceC8468tR interfaceC8468tR) {
        if (AbstractC1444Kz.p(interfaceC8468tR) || AbstractC1444Kz.q(interfaceC8468tR)) {
            return true;
        }
        return G10.c(interfaceC8468tR.getName(), C6612mm.e.a()) && interfaceC8468tR.h().isEmpty();
    }

    public final C6607ml c(Class cls) {
        C6607ml c6607mlM;
        G10.g(cls, "klass");
        if (!cls.isArray()) {
            if (G10.c(cls, Void.TYPE)) {
                return b;
            }
            EnumC8067rz0 enumC8067rz0A = a(cls);
            if (enumC8067rz0A != null) {
                return new C6607ml(YV0.A, enumC8067rz0A.o());
            }
            C6607ml c6607mlE = AbstractC9544xF0.e(cls);
            return (c6607mlE.i() || (c6607mlM = C9489x30.a.m(c6607mlE.a())) == null) ? c6607mlE : c6607mlM;
        }
        Class<?> componentType = cls.getComponentType();
        G10.f(componentType, "getComponentType(...)");
        EnumC8067rz0 enumC8067rz0A2 = a(componentType);
        if (enumC8067rz0A2 != null) {
            return new C6607ml(YV0.A, enumC8067rz0A2.l());
        }
        C6607ml.a aVar = C6607ml.d;
        AP apL = YV0.a.i.l();
        G10.f(apL, "toSafe(...)");
        return aVar.c(apL);
    }

    public final AbstractC3894d50.e d(InterfaceC8468tR interfaceC8468tR) {
        return new AbstractC3894d50.e(new AbstractC4451f50.b(e(interfaceC8468tR), AbstractC7440pk0.c(interfaceC8468tR, false, false, 1, null)));
    }

    public final String e(InterfaceC1583Mi interfaceC1583Mi) {
        String strE = AbstractC4849gV0.e(interfaceC1583Mi);
        if (strE != null) {
            return strE;
        }
        if (interfaceC1583Mi instanceof InterfaceC5044hA0) {
            String strC = AbstractC8400tA.w(interfaceC1583Mi).getName().c();
            G10.f(strC, "asString(...)");
            return C10052z40.b(strC);
        }
        if (interfaceC1583Mi instanceof InterfaceC7565qA0) {
            String strC2 = AbstractC8400tA.w(interfaceC1583Mi).getName().c();
            G10.f(strC2, "asString(...)");
            return C10052z40.e(strC2);
        }
        String strC3 = interfaceC1583Mi.getName().c();
        G10.f(strC3, "asString(...)");
        return strC3;
    }

    public final AbstractC6982o50 f(InterfaceC4476fA0 interfaceC4476fA0) {
        G10.g(interfaceC4476fA0, "possiblyOverriddenProperty");
        InterfaceC4476fA0 interfaceC4476fA0A = ((InterfaceC4476fA0) AbstractC7006oA.L(interfaceC4476fA0)).a();
        G10.f(interfaceC4476fA0A, "getOriginal(...)");
        if (interfaceC4476fA0A instanceof C9806yB) {
            C9806yB c9806yB = (C9806yB) interfaceC4476fA0A;
            HA0 ha0F1 = c9806yB.C();
            AbstractC5674jS.f fVar = AbstractC7261p50.d;
            G10.f(fVar, "propertySignature");
            AbstractC7261p50.d dVar = (AbstractC7261p50.d) SA0.a(ha0F1, fVar);
            if (dVar != null) {
                return new AbstractC6982o50.c(interfaceC4476fA0A, ha0F1, dVar, c9806yB.Y(), c9806yB.P());
            }
        } else if (interfaceC4476fA0A instanceof C6135l30) {
            C6135l30 c6135l30 = (C6135l30) interfaceC4476fA0A;
            RU0 ru0J = c6135l30.j();
            InterfaceC8366t30 interfaceC8366t30 = ru0J instanceof InterfaceC8366t30 ? (InterfaceC8366t30) ru0J : null;
            T20 t20B = interfaceC8366t30 != null ? interfaceC8366t30.b() : null;
            if (t20B instanceof QF0) {
                return new AbstractC6982o50.a(((QF0) t20B).S());
            }
            if (t20B instanceof TF0) {
                Method methodS = ((TF0) t20B).S();
                InterfaceC7565qA0 interfaceC7565qA0G = c6135l30.g();
                RU0 ru0J2 = interfaceC7565qA0G != null ? interfaceC7565qA0G.j() : null;
                InterfaceC8366t30 interfaceC8366t302 = ru0J2 instanceof InterfaceC8366t30 ? (InterfaceC8366t30) ru0J2 : null;
                T20 t20B2 = interfaceC8366t302 != null ? interfaceC8366t302.b() : null;
                TF0 tf0 = t20B2 instanceof TF0 ? (TF0) t20B2 : null;
                return new AbstractC6982o50.b(methodS, tf0 != null ? tf0.S() : null);
            }
            throw new E80("Incorrect resolution sequence for Java field " + interfaceC4476fA0A + " (source = " + t20B + ')');
        }
        InterfaceC5044hA0 interfaceC5044hA0F = interfaceC4476fA0A.f();
        G10.d(interfaceC5044hA0F);
        AbstractC3894d50.e eVarD = d(interfaceC5044hA0F);
        InterfaceC7565qA0 interfaceC7565qA0G2 = interfaceC4476fA0A.g();
        return new AbstractC6982o50.d(eVarD, interfaceC7565qA0G2 != null ? d(interfaceC7565qA0G2) : null);
    }

    public final AbstractC3894d50 g(InterfaceC8468tR interfaceC8468tR) {
        Method methodS;
        AbstractC4451f50.b bVarB;
        AbstractC4451f50.b bVarE;
        G10.g(interfaceC8468tR, "possiblySubstitutedFunction");
        InterfaceC8468tR interfaceC8468tRA = ((InterfaceC8468tR) AbstractC7006oA.L(interfaceC8468tR)).a();
        G10.f(interfaceC8468tRA, "getOriginal(...)");
        if (!(interfaceC8468tRA instanceof EA)) {
            if (interfaceC8468tRA instanceof C3884d30) {
                RU0 ru0J = ((C3884d30) interfaceC8468tRA).j();
                InterfaceC8366t30 interfaceC8366t30 = ru0J instanceof InterfaceC8366t30 ? (InterfaceC8366t30) ru0J : null;
                T20 t20B = interfaceC8366t30 != null ? interfaceC8366t30.b() : null;
                TF0 tf0 = t20B instanceof TF0 ? (TF0) t20B : null;
                if (tf0 != null && (methodS = tf0.S()) != null) {
                    return new AbstractC3894d50.c(methodS);
                }
                throw new E80("Incorrect resolution sequence for Java method " + interfaceC8468tRA);
            }
            if (!(interfaceC8468tRA instanceof D20)) {
                if (b(interfaceC8468tRA)) {
                    return d(interfaceC8468tRA);
                }
                throw new E80("Unknown origin of " + interfaceC8468tRA + " (" + interfaceC8468tRA.getClass() + ')');
            }
            RU0 ru0J2 = ((D20) interfaceC8468tRA).j();
            InterfaceC8366t30 interfaceC8366t302 = ru0J2 instanceof InterfaceC8366t30 ? (InterfaceC8366t30) ru0J2 : null;
            T20 t20B2 = interfaceC8366t302 != null ? interfaceC8366t302.b() : null;
            if (t20B2 instanceof NF0) {
                return new AbstractC3894d50.b(((NF0) t20B2).S());
            }
            if (t20B2 instanceof IF0) {
                IF0 if0 = (IF0) t20B2;
                if (if0.q()) {
                    return new AbstractC3894d50.a(if0.v());
                }
            }
            throw new E80("Incorrect resolution sequence for Java constructor " + interfaceC8468tRA + " (" + t20B2 + ')');
        }
        InterfaceC3086aB interfaceC3086aB = (InterfaceC3086aB) interfaceC8468tRA;
        InterfaceC2026Qj0 interfaceC2026Qj0C = interfaceC3086aB.C();
        if ((interfaceC2026Qj0C instanceof CA0) && (bVarE = C7540q50.a.e((CA0) interfaceC2026Qj0C, interfaceC3086aB.Y(), interfaceC3086aB.P())) != null) {
            return new AbstractC3894d50.e(bVarE);
        }
        if (!(interfaceC2026Qj0C instanceof C9524xA0) || (bVarB = C7540q50.a.b((C9524xA0) interfaceC2026Qj0C, interfaceC3086aB.Y(), interfaceC3086aB.P())) == null) {
            return d(interfaceC8468tRA);
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC8468tR.b();
        G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
        if (JZ.b(interfaceC8612twB)) {
            return new AbstractC3894d50.e(bVarB);
        }
        InterfaceC8612tw interfaceC8612twB2 = interfaceC8468tR.b();
        G10.f(interfaceC8612twB2, "getContainingDeclaration(...)");
        if (!JZ.d(interfaceC8612twB2)) {
            return new AbstractC3894d50.d(bVarB);
        }
        InterfaceC7195or interfaceC7195or = (InterfaceC7195or) interfaceC8468tR;
        if (interfaceC7195or.z()) {
            if (!G10.c(bVarB.e(), "constructor-impl") || !AY0.m(bVarB.d(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        } else {
            if (!G10.c(bVarB.e(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
            InterfaceC4923gl interfaceC4923glA = interfaceC7195or.A();
            G10.f(interfaceC4923glA, "getConstructedClass(...)");
            String strU = AbstractC7680qc1.u(interfaceC4923glA);
            if (AY0.m(bVarB.d(), ")V", false, 2, null)) {
                bVarB = AbstractC4451f50.b.c(bVarB, null, BY0.c0(bVarB.d(), "V") + strU, 1, null);
            } else if (!AY0.m(bVarB.d(), strU, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
            }
        }
        return new AbstractC3894d50.e(bVarB);
    }
}
