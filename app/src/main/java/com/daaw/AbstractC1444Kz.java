package com.daaw;

import com.daaw.InterfaceC1583Mi;
import com.daaw.InterfaceC3072a8;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1444Kz {

    /* JADX INFO: renamed from: com.daaw.Kz$a */
    public static class a extends C3520bl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4923gl interfaceC4923gl, RU0 ru0, boolean z) {
            super(interfaceC4923gl, null, InterfaceC3072a8.b.b(), true, InterfaceC1583Mi.a.DECLARATION, ru0);
            if (interfaceC4923gl == null) {
                F(0);
            }
            if (ru0 == null) {
                F(1);
            }
            q1(Collections.EMPTY_LIST, AbstractC7006oA.k(interfaceC4923gl, z));
        }

        private static /* synthetic */ void F(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static RE0 b(InterfaceC1376Ki interfaceC1376Ki, I80 i80, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, int i) {
        if (interfaceC1376Ki == null) {
            a(32);
        }
        if (interfaceC3072a8 == null) {
            a(33);
        }
        if (i80 == null) {
            return null;
        }
        return new SE0(interfaceC1376Ki, new C0367As(interfaceC1376Ki, i80, c2352Tm0, null), interfaceC3072a8, C3531bn0.a(i));
    }

    public static RE0 c(InterfaceC4923gl interfaceC4923gl, I80 i80, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, int i) {
        if (interfaceC4923gl == null) {
            a(34);
        }
        if (interfaceC3072a8 == null) {
            a(35);
        }
        if (i80 == null) {
            return null;
        }
        return new SE0(interfaceC4923gl, new C9159vs(interfaceC4923gl, i80, c2352Tm0, null), interfaceC3072a8, C3531bn0.a(i));
    }

    public static C5323iA0 d(InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8) {
        if (interfaceC4476fA0 == null) {
            a(13);
        }
        if (interfaceC3072a8 == null) {
            a(14);
        }
        return j(interfaceC4476fA0, interfaceC3072a8, true, false, false);
    }

    public static C7843rA0 e(InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, InterfaceC3072a8 interfaceC3072a82) {
        if (interfaceC4476fA0 == null) {
            a(0);
        }
        if (interfaceC3072a8 == null) {
            a(1);
        }
        if (interfaceC3072a82 == null) {
            a(2);
        }
        return n(interfaceC4476fA0, interfaceC3072a8, interfaceC3072a82, true, false, false, interfaceC4476fA0.j());
    }

    public static InterfaceC4476fA0 f(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(26);
        }
        InterfaceC2968Zk0 interfaceC2968Zk0G = AbstractC7006oA.g(interfaceC4923gl);
        InterfaceC4923gl interfaceC4923glA = AbstractC8214sX0.a(interfaceC2968Zk0G).a(interfaceC2968Zk0G);
        if (interfaceC4923glA == null) {
            return null;
        }
        InterfaceC3072a8.a aVar = InterfaceC3072a8.b;
        InterfaceC3072a8 interfaceC3072a8B = aVar.b();
        EnumC0336Ak0 enumC0336Ak0 = EnumC0336Ak0.C;
        AbstractC8965vA abstractC8965vA = AbstractC8679uA.e;
        C2352Tm0 c2352Tm0 = YV0.e;
        InterfaceC1583Mi.a aVar2 = InterfaceC1583Mi.a.SYNTHESIZED;
        C4765gA0 c4765gA0O0 = C4765gA0.O0(interfaceC4923gl, interfaceC3072a8B, enumC0336Ak0, abstractC8965vA, false, c2352Tm0, aVar2, interfaceC4923gl.j(), false, false, false, false, false, false);
        C5323iA0 c5323iA0 = new C5323iA0(c4765gA0O0, aVar.b(), enumC0336Ak0, abstractC8965vA, false, false, false, aVar2, null, interfaceC4923gl.j());
        c4765gA0O0.U0(c5323iA0, null);
        YS0 ys0I = M80.i(C8387t71.C.j(), interfaceC4923glA.k(), Collections.singletonList(new C6998o81(interfaceC4923gl.s())), false);
        List list = Collections.EMPTY_LIST;
        c4765gA0O0.b1(ys0I, list, null, null, list);
        c5323iA0.P0(c4765gA0O0.getReturnType());
        return c4765gA0O0;
    }

    public static IS0 g(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(24);
        }
        InterfaceC3072a8.a aVar = InterfaceC3072a8.b;
        JS0 js0L1 = JS0.l1(interfaceC4923gl, aVar.b(), YV0.f, InterfaceC1583Mi.a.SYNTHESIZED, interfaceC4923gl.j());
        C10197zc1 c10197zc1 = new C10197zc1(js0L1, null, 0, aVar.b(), C2352Tm0.l("value"), AbstractC8400tA.m(interfaceC4923gl).W(), false, false, false, null, interfaceC4923gl.j());
        List list = Collections.EMPTY_LIST;
        JS0 js0N1 = js0L1.R0(null, null, list, list, Collections.singletonList(c10197zc1), interfaceC4923gl.s(), EnumC0336Ak0.C, AbstractC8679uA.e);
        if (js0N1 == null) {
            a(25);
        }
        return js0N1;
    }

    public static IS0 h(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(22);
        }
        JS0 js0L1 = JS0.l1(interfaceC4923gl, InterfaceC3072a8.b.b(), YV0.d, InterfaceC1583Mi.a.SYNTHESIZED, interfaceC4923gl.j());
        List list = Collections.EMPTY_LIST;
        JS0 js0N1 = js0L1.R0(null, null, list, list, list, AbstractC8400tA.m(interfaceC4923gl).l(EnumC1042Hc1.F, interfaceC4923gl.s()), EnumC0336Ak0.C, AbstractC8679uA.e);
        if (js0N1 == null) {
            a(23);
        }
        return js0N1;
    }

    public static RE0 i(InterfaceC1376Ki interfaceC1376Ki, I80 i80, InterfaceC3072a8 interfaceC3072a8) {
        if (interfaceC1376Ki == null) {
            a(30);
        }
        if (interfaceC3072a8 == null) {
            a(31);
        }
        if (i80 == null) {
            return null;
        }
        return new SE0(interfaceC1376Ki, new C5917kJ(interfaceC1376Ki, i80, null), interfaceC3072a8);
    }

    public static C5323iA0 j(InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, boolean z, boolean z2, boolean z3) {
        if (interfaceC4476fA0 == null) {
            a(15);
        }
        if (interfaceC3072a8 == null) {
            a(16);
        }
        return k(interfaceC4476fA0, interfaceC3072a8, z, z2, z3, interfaceC4476fA0.j());
    }

    public static C5323iA0 k(InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, boolean z, boolean z2, boolean z3, RU0 ru0) {
        if (interfaceC4476fA0 == null) {
            a(17);
        }
        if (interfaceC3072a8 == null) {
            a(18);
        }
        if (ru0 == null) {
            a(19);
        }
        return new C5323iA0(interfaceC4476fA0, interfaceC3072a8, interfaceC4476fA0.l(), interfaceC4476fA0.getVisibility(), z, z2, z3, InterfaceC1583Mi.a.DECLARATION, null, ru0);
    }

    public static C3520bl l(InterfaceC4923gl interfaceC4923gl, RU0 ru0) {
        if (interfaceC4923gl == null) {
            a(20);
        }
        if (ru0 == null) {
            a(21);
        }
        return new a(interfaceC4923gl, ru0, false);
    }

    public static C7843rA0 m(InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, InterfaceC3072a8 interfaceC3072a82, boolean z, boolean z2, boolean z3, AbstractC8965vA abstractC8965vA, RU0 ru0) {
        if (interfaceC4476fA0 == null) {
            a(7);
        }
        if (interfaceC3072a8 == null) {
            a(8);
        }
        if (interfaceC3072a82 == null) {
            a(9);
        }
        if (abstractC8965vA == null) {
            a(10);
        }
        if (ru0 == null) {
            a(11);
        }
        C7843rA0 c7843rA0 = new C7843rA0(interfaceC4476fA0, interfaceC3072a8, interfaceC4476fA0.l(), abstractC8965vA, z, z2, z3, InterfaceC1583Mi.a.DECLARATION, null, ru0);
        c7843rA0.Q0(C7843rA0.O0(c7843rA0, interfaceC4476fA0.getType(), interfaceC3072a82));
        return c7843rA0;
    }

    public static C7843rA0 n(InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, InterfaceC3072a8 interfaceC3072a82, boolean z, boolean z2, boolean z3, RU0 ru0) {
        if (interfaceC4476fA0 == null) {
            a(3);
        }
        if (interfaceC3072a8 == null) {
            a(4);
        }
        if (interfaceC3072a82 == null) {
            a(5);
        }
        if (ru0 == null) {
            a(6);
        }
        return m(interfaceC4476fA0, interfaceC3072a8, interfaceC3072a82, z, z2, z3, interfaceC4476fA0.getVisibility(), ru0);
    }

    public static boolean o(InterfaceC8468tR interfaceC8468tR) {
        if (interfaceC8468tR == null) {
            a(29);
        }
        return interfaceC8468tR.i() == InterfaceC1583Mi.a.SYNTHESIZED && AbstractC7006oA.A(interfaceC8468tR.b());
    }

    public static boolean p(InterfaceC8468tR interfaceC8468tR) {
        if (interfaceC8468tR == null) {
            a(28);
        }
        return interfaceC8468tR.getName().equals(YV0.f) && o(interfaceC8468tR);
    }

    public static boolean q(InterfaceC8468tR interfaceC8468tR) {
        if (interfaceC8468tR == null) {
            a(27);
        }
        return interfaceC8468tR.getName().equals(YV0.d) && o(interfaceC8468tR);
    }
}
