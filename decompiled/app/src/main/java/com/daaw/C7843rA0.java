package com.daaw;

import com.daaw.InterfaceC1583Mi;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C7843rA0 extends AbstractC3919dA0 implements InterfaceC7565qA0 {
    public InterfaceC9918yc1 N;
    public final InterfaceC7565qA0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7843rA0(InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, boolean z, boolean z2, boolean z3, InterfaceC1583Mi.a aVar, InterfaceC7565qA0 interfaceC7565qA0, RU0 ru0) {
        super(enumC0336Ak0, abstractC8965vA, interfaceC4476fA0, interfaceC3072a8, C2352Tm0.o("<set-" + interfaceC4476fA0.getName() + ">"), z, z2, z3, aVar, ru0);
        if (interfaceC4476fA0 == null) {
            F(0);
        }
        if (interfaceC3072a8 == null) {
            F(1);
        }
        if (enumC0336Ak0 == null) {
            F(2);
        }
        if (abstractC8965vA == null) {
            F(3);
        }
        if (aVar == null) {
            F(4);
        }
        if (ru0 == null) {
            F(5);
        }
        this.O = interfaceC7565qA0 != null ? interfaceC7565qA0 : this;
    }

    private static /* synthetic */ void F(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C10197zc1 O0(InterfaceC7565qA0 interfaceC7565qA0, I80 i80, InterfaceC3072a8 interfaceC3072a8) {
        if (interfaceC7565qA0 == null) {
            F(7);
        }
        if (i80 == null) {
            F(8);
        }
        if (interfaceC3072a8 == null) {
            F(9);
        }
        return new C10197zc1(interfaceC7565qA0, null, 0, interfaceC3072a8, C7091oV0.o, i80, false, false, false, null, RU0.a);
    }

    @Override // com.daaw.AbstractC9456ww
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public InterfaceC7565qA0 a() {
        InterfaceC7565qA0 interfaceC7565qA0 = this.O;
        if (interfaceC7565qA0 == null) {
            F(13);
        }
        return interfaceC7565qA0;
    }

    public void Q0(InterfaceC9918yc1 interfaceC9918yc1) {
        if (interfaceC9918yc1 == null) {
            F(6);
        }
        this.N = interfaceC9918yc1;
    }

    @Override // com.daaw.InterfaceC8468tR, com.daaw.InterfaceC1583Mi, com.daaw.InterfaceC1376Ki
    public Collection e() {
        Collection collectionK0 = super.K0(false);
        if (collectionK0 == null) {
            F(10);
        }
        return collectionK0;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public I80 getReturnType() {
        YS0 ys0Z = AbstractC8400tA.m(this).Z();
        if (ys0Z == null) {
            F(12);
        }
        return ys0Z;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List h() {
        InterfaceC9918yc1 interfaceC9918yc1 = this.N;
        if (interfaceC9918yc1 == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(interfaceC9918yc1);
        if (listSingletonList == null) {
            F(11);
        }
        return listSingletonList;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return interfaceC9735xw.m(this, obj);
    }
}
