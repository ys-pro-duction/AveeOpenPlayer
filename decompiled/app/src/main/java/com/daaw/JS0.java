package com.daaw;

import com.daaw.InterfaceC1583Mi;
import com.daaw.InterfaceC8468tR;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class JS0 extends AbstractC8747uR implements IS0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JS0(InterfaceC8612tw interfaceC8612tw, IS0 is0, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, InterfaceC1583Mi.a aVar, RU0 ru0) {
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
    }

    private static /* synthetic */ void F(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static JS0 l1(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, InterfaceC1583Mi.a aVar, RU0 ru0) {
        if (interfaceC8612tw == null) {
            F(5);
        }
        if (interfaceC3072a8 == null) {
            F(6);
        }
        if (c2352Tm0 == null) {
            F(7);
        }
        if (aVar == null) {
            F(8);
        }
        if (ru0 == null) {
            F(9);
        }
        return new JS0(interfaceC8612tw, null, interfaceC3072a8, c2352Tm0, aVar, ru0);
    }

    @Override // com.daaw.AbstractC8747uR
    /* JADX INFO: renamed from: L0 */
    public AbstractC8747uR o1(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        if (interfaceC8612tw == null) {
            F(25);
        }
        if (aVar == null) {
            F(26);
        }
        if (interfaceC3072a8 == null) {
            F(27);
        }
        if (ru0 == null) {
            F(28);
        }
        IS0 is0 = (IS0) interfaceC8468tR;
        if (c2352Tm0 == null) {
            c2352Tm0 = getName();
        }
        return new JS0(interfaceC8612tw, is0, interfaceC3072a8, c2352Tm0, aVar, ru0);
    }

    @Override // com.daaw.InterfaceC1583Mi
    /* JADX INFO: renamed from: k1 */
    public IS0 I(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC1583Mi.a aVar, boolean z) {
        IS0 is0 = (IS0) super.K0(interfaceC8612tw, enumC0336Ak0, abstractC8965vA, aVar, z);
        if (is0 == null) {
            F(29);
        }
        return is0;
    }

    @Override // com.daaw.AbstractC9456ww
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public IS0 a() {
        IS0 is0 = (IS0) super.a();
        if (is0 == null) {
            F(24);
        }
        return is0;
    }

    @Override // com.daaw.AbstractC8747uR
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public JS0 R0(RE0 re0, RE0 re02, List list, List list2, List list3, I80 i80, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA) {
        if (list == null) {
            F(14);
        }
        if (list2 == null) {
            F(15);
        }
        if (list3 == null) {
            F(16);
        }
        if (abstractC8965vA == null) {
            F(17);
        }
        JS0 js0O1 = o1(re0, re02, list, list2, list3, i80, enumC0336Ak0, abstractC8965vA, null);
        if (js0O1 == null) {
            F(18);
        }
        return js0O1;
    }

    public JS0 o1(RE0 re0, RE0 re02, List list, List list2, List list3, I80 i80, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, Map map) {
        if (list == null) {
            F(19);
        }
        if (list2 == null) {
            F(20);
        }
        if (list3 == null) {
            F(21);
        }
        if (abstractC8965vA == null) {
            F(22);
        }
        super.R0(re0, re02, list, list2, list3, i80, enumC0336Ak0, abstractC8965vA);
        if (map != null && !map.isEmpty()) {
            this.e0 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC8468tR
    public InterfaceC8468tR.a t() {
        InterfaceC8468tR.a aVarT = super.t();
        if (aVarT == null) {
            F(30);
        }
        return aVarT;
    }
}
