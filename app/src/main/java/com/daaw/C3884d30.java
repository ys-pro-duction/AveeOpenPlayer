package com.daaw;

import com.daaw.InterfaceC1376Ki;
import com.daaw.InterfaceC1583Mi;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.d30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3884d30 extends JS0 implements B20 {
    public static final InterfaceC1376Ki.a h0 = new a();
    public static final InterfaceC1376Ki.a i0 = new b();
    public c f0;
    public final boolean g0;

    /* JADX INFO: renamed from: com.daaw.d30$a */
    public static class a implements InterfaceC1376Ki.a {
    }

    /* JADX INFO: renamed from: com.daaw.d30$b */
    public static class b implements InterfaceC1376Ki.a {
    }

    /* JADX INFO: renamed from: com.daaw.d30$c */
    public enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean B;
        public final boolean C;

        c(boolean z, boolean z2) {
            this.B = z;
            this.C = z2;
        }

        public static /* synthetic */ void a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static c c(boolean z, boolean z2) {
            c cVar = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                a(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3884d30(InterfaceC8612tw interfaceC8612tw, IS0 is0, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, InterfaceC1583Mi.a aVar, RU0 ru0, boolean z) {
        super(interfaceC8612tw, is0, interfaceC3072a8, c2352Tm0, aVar, ru0);
        if (interfaceC8612tw == null) {
            F(0);
        }
        if (interfaceC3072a8 == null) {
            F(1);
        }
        if (c2352Tm0 == null) {
            F(2);
        }
        if (aVar == null) {
            F(3);
        }
        if (ru0 == null) {
            F(4);
        }
        this.f0 = null;
        this.g0 = z;
    }

    private static /* synthetic */ void F(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C3884d30 p1(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, RU0 ru0, boolean z) {
        if (interfaceC8612tw == null) {
            F(5);
        }
        if (interfaceC3072a8 == null) {
            F(6);
        }
        if (c2352Tm0 == null) {
            F(7);
        }
        if (ru0 == null) {
            F(8);
        }
        return new C3884d30(interfaceC8612tw, null, interfaceC3072a8, c2352Tm0, InterfaceC1583Mi.a.DECLARATION, ru0, z);
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC1376Ki
    public boolean E() {
        return this.f0.C;
    }

    @Override // com.daaw.AbstractC8747uR
    public boolean Q0() {
        return this.f0.B;
    }

    @Override // com.daaw.JS0
    public JS0 o1(RE0 re0, RE0 re02, List list, List list2, List list3, I80 i80, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, Map map) {
        if (list == null) {
            F(9);
        }
        if (list2 == null) {
            F(10);
        }
        if (list3 == null) {
            F(11);
        }
        if (abstractC8965vA == null) {
            F(12);
        }
        JS0 js0O1 = super.o1(re0, re02, list, list2, list3, i80, enumC0336Ak0, abstractC8965vA, map);
        f1(C2576Vq0.a.a(js0O1).a());
        if (js0O1 == null) {
            F(13);
        }
        return js0O1;
    }

    @Override // com.daaw.JS0, com.daaw.AbstractC8747uR
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C3884d30 o1(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        if (interfaceC8612tw == null) {
            F(14);
        }
        if (aVar == null) {
            F(15);
        }
        if (interfaceC3072a8 == null) {
            F(16);
        }
        if (ru0 == null) {
            F(17);
        }
        IS0 is0 = (IS0) interfaceC8468tR;
        if (c2352Tm0 == null) {
            c2352Tm0 = getName();
        }
        C3884d30 c3884d30 = new C3884d30(interfaceC8612tw, is0, interfaceC3072a8, c2352Tm0, aVar, ru0, this.g0);
        c3884d30.s1(Q0(), E());
        return c3884d30;
    }

    @Override // com.daaw.B20
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C3884d30 D0(I80 i80, List list, I80 i802, C0576Cs0 c0576Cs0) {
        if (list == null) {
            F(19);
        }
        if (i802 == null) {
            F(20);
        }
        C3884d30 c3884d30 = (C3884d30) t().c(AbstractC8790ub1.a(list, h(), this)).l(i802).p(i80 == null ? null : AbstractC1444Kz.i(this, i80, InterfaceC3072a8.b.b())).b().h().a();
        if (c0576Cs0 != null) {
            c3884d30.U0((InterfaceC1376Ki.a) c0576Cs0.c(), c0576Cs0.d());
        }
        if (c3884d30 == null) {
            F(21);
        }
        return c3884d30;
    }

    public void s1(boolean z, boolean z2) {
        this.f0 = c.c(z, z2);
    }
}
