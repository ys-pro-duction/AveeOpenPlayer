package com.daaw;

import com.daaw.InterfaceC1583Mi;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.iA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5323iA0 extends AbstractC3919dA0 implements InterfaceC5044hA0 {
    public I80 N;
    public final InterfaceC5044hA0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5323iA0(InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, boolean z, boolean z2, boolean z3, InterfaceC1583Mi.a aVar, InterfaceC5044hA0 interfaceC5044hA0, RU0 ru0) {
        super(enumC0336Ak0, abstractC8965vA, interfaceC4476fA0, interfaceC3072a8, C2352Tm0.o("<get-" + interfaceC4476fA0.getName() + ">"), z, z2, z3, aVar, ru0);
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
        this.O = interfaceC5044hA0 != null ? interfaceC5044hA0 : this;
    }

    private static /* synthetic */ void F(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // com.daaw.AbstractC9456ww
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5044hA0 a() {
        InterfaceC5044hA0 interfaceC5044hA0 = this.O;
        if (interfaceC5044hA0 == null) {
            F(8);
        }
        return interfaceC5044hA0;
    }

    public void P0(I80 i80) {
        if (i80 == null) {
            i80 = A0().getType();
        }
        this.N = i80;
    }

    @Override // com.daaw.InterfaceC8468tR, com.daaw.InterfaceC1583Mi, com.daaw.InterfaceC1376Ki
    public Collection e() {
        Collection collectionK0 = super.K0(true);
        if (collectionK0 == null) {
            F(6);
        }
        return collectionK0;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public I80 getReturnType() {
        return this.N;
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
        return interfaceC9735xw.b(this, obj);
    }
}
