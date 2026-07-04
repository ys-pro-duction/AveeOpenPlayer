package com.daaw;

import com.daaw.InterfaceC1376Ki;
import com.daaw.InterfaceC1583Mi;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class D20 extends C3520bl implements B20 {
    public Boolean g0;
    public Boolean h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D20(InterfaceC4923gl interfaceC4923gl, D20 d20, InterfaceC3072a8 interfaceC3072a8, boolean z, InterfaceC1583Mi.a aVar, RU0 ru0) {
        super(interfaceC4923gl, d20, interfaceC3072a8, z, aVar, ru0);
        if (interfaceC4923gl == null) {
            F(0);
        }
        if (interfaceC3072a8 == null) {
            F(1);
        }
        if (aVar == null) {
            F(2);
        }
        if (ru0 == null) {
            F(3);
        }
        this.g0 = null;
        this.h0 = null;
    }

    private static /* synthetic */ void F(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static D20 t1(InterfaceC4923gl interfaceC4923gl, InterfaceC3072a8 interfaceC3072a8, boolean z, RU0 ru0) {
        if (interfaceC4923gl == null) {
            F(4);
        }
        if (interfaceC3072a8 == null) {
            F(5);
        }
        if (ru0 == null) {
            F(6);
        }
        return new D20(interfaceC4923gl, null, interfaceC3072a8, z, InterfaceC1583Mi.a.DECLARATION, ru0);
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC1376Ki
    public boolean E() {
        return this.h0.booleanValue();
    }

    @Override // com.daaw.AbstractC8747uR
    public boolean Q0() {
        return this.g0.booleanValue();
    }

    @Override // com.daaw.AbstractC8747uR
    public void Y0(boolean z) {
        this.g0 = Boolean.valueOf(z);
    }

    @Override // com.daaw.AbstractC8747uR
    public void Z0(boolean z) {
        this.h0 = Boolean.valueOf(z);
    }

    public D20 s1(InterfaceC4923gl interfaceC4923gl, D20 d20, InterfaceC1583Mi.a aVar, RU0 ru0, InterfaceC3072a8 interfaceC3072a8) {
        if (interfaceC4923gl == null) {
            F(12);
        }
        if (aVar == null) {
            F(13);
        }
        if (ru0 == null) {
            F(14);
        }
        if (interfaceC3072a8 == null) {
            F(15);
        }
        return new D20(interfaceC4923gl, d20, interfaceC3072a8, this.f0, aVar, ru0);
    }

    @Override // com.daaw.C3520bl
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public D20 o1(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        if (interfaceC8612tw == null) {
            F(7);
        }
        if (aVar == null) {
            F(8);
        }
        if (interfaceC3072a8 == null) {
            F(9);
        }
        if (ru0 == null) {
            F(10);
        }
        if (aVar == InterfaceC1583Mi.a.DECLARATION || aVar == InterfaceC1583Mi.a.SYNTHESIZED) {
            D20 d20S1 = s1((InterfaceC4923gl) interfaceC8612tw, (D20) interfaceC8468tR, aVar, ru0, interfaceC3072a8);
            d20S1.Y0(Q0());
            d20S1.Z0(E());
            return d20S1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC8612tw + "\nkind: " + aVar);
    }

    @Override // com.daaw.B20
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public D20 D0(I80 i80, List list, I80 i802, C0576Cs0 c0576Cs0) {
        if (list == null) {
            F(16);
        }
        if (i802 == null) {
            F(17);
        }
        D20 d20O1 = o1(b(), null, i(), null, getAnnotations(), j());
        d20O1.R0(i80 == null ? null : AbstractC1444Kz.i(d20O1, i80, InterfaceC3072a8.b.b()), c0(), AbstractC1599Mm.k(), getTypeParameters(), AbstractC8790ub1.a(list, h(), d20O1), i802, l(), getVisibility());
        if (c0576Cs0 != null) {
            d20O1.U0((InterfaceC1376Ki.a) c0576Cs0.c(), c0576Cs0.d());
        }
        return d20O1;
    }
}
