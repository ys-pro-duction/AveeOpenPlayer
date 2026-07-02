package com.daaw;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4714g0 extends AbstractC8898uw implements RE0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4714g0(InterfaceC3072a8 interfaceC3072a8) {
        super(interfaceC3072a8, C7091oV0.i);
        if (interfaceC3072a8 == null) {
            F(0);
        }
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // com.daaw.InterfaceC1376Ki
    public boolean E() {
        return false;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 c0() {
        return null;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public Collection e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            F(8);
        }
        return set;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public I80 getReturnType() {
        return getType();
    }

    @Override // com.daaw.InterfaceC8516tc1
    public I80 getType() {
        I80 type = getValue().getType();
        if (type == null) {
            F(6);
        }
        return type;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F(5);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA abstractC8965vA = AbstractC8679uA.f;
        if (abstractC8965vA == null) {
            F(9);
        }
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List h() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F(7);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return interfaceC9735xw.a(this, obj);
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 i0() {
        return null;
    }

    @Override // com.daaw.InterfaceC10293zw
    public RU0 j() {
        RU0 ru0 = RU0.a;
        if (ru0 == null) {
            F(11);
        }
        return ru0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4714g0(InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0) {
        super(interfaceC3072a8, c2352Tm0);
        if (interfaceC3072a8 == null) {
            F(1);
        }
        if (c2352Tm0 == null) {
            F(2);
        }
    }

    @Override // com.daaw.InterfaceC4297eZ0
    public RE0 c(C8957v81 c8957v81) {
        if (c8957v81 == null) {
            F(3);
        }
        if (!c8957v81.k()) {
            I80 i80P = b() instanceof InterfaceC4923gl ? c8957v81.p(getType(), EnumC1042Hc1.H) : c8957v81.p(getType(), EnumC1042Hc1.F);
            if (i80P == null) {
                return null;
            }
            if (i80P != getType()) {
                return new SE0(b(), new C8377t51(i80P), getAnnotations());
            }
        }
        return this;
    }

    @Override // com.daaw.AbstractC8898uw, com.daaw.InterfaceC8612tw
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1624Ms0 a() {
        return this;
    }
}
