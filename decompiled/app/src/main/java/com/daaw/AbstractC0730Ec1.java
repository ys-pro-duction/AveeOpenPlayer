package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ec1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0730Ec1 extends AbstractC9456ww implements InterfaceC0626Dc1 {
    public I80 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0730Ec1(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, I80 i80, RU0 ru0) {
        super(interfaceC8612tw, interfaceC3072a8, c2352Tm0, ru0);
        if (interfaceC8612tw == null) {
            F(0);
        }
        if (interfaceC3072a8 == null) {
            F(1);
        }
        if (c2352Tm0 == null) {
            F(2);
        }
        if (ru0 == null) {
            F(3);
        }
        this.F = i80;
    }

    private static /* synthetic */ void F(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // com.daaw.InterfaceC1376Ki
    public boolean E() {
        return false;
    }

    public void F0(I80 i80) {
        this.F = i80;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 c0() {
        return null;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public I80 getReturnType() {
        I80 type = getType();
        if (type == null) {
            F(10);
        }
        return type;
    }

    @Override // com.daaw.InterfaceC8516tc1
    public I80 getType() {
        I80 i80 = this.F;
        if (i80 == null) {
            F(4);
        }
        return i80;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F(8);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List h() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F(6);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 i0() {
        return null;
    }
}
