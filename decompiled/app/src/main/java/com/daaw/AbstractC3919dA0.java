package com.daaw;

import com.daaw.InterfaceC1376Ki;
import com.daaw.InterfaceC1583Mi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.dA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3919dA0 extends AbstractC9456ww implements InterfaceC3640cA0 {
    public boolean F;
    public final boolean G;
    public final EnumC0336Ak0 H;
    public final InterfaceC4476fA0 I;
    public final boolean J;
    public final InterfaceC1583Mi.a K;
    public AbstractC8965vA L;
    public InterfaceC8468tR M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3919dA0(EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, boolean z, boolean z2, boolean z3, InterfaceC1583Mi.a aVar, RU0 ru0) {
        super(interfaceC4476fA0.b(), interfaceC3072a8, c2352Tm0, ru0);
        if (enumC0336Ak0 == null) {
            F(0);
        }
        if (abstractC8965vA == null) {
            F(1);
        }
        if (interfaceC4476fA0 == null) {
            F(2);
        }
        if (interfaceC3072a8 == null) {
            F(3);
        }
        if (c2352Tm0 == null) {
            F(4);
        }
        if (ru0 == null) {
            F(5);
        }
        this.M = null;
        this.H = enumC0336Ak0;
        this.L = abstractC8965vA;
        this.I = interfaceC4476fA0;
        this.F = z;
        this.G = z2;
        this.J = z3;
        this.K = aVar;
    }

    private static /* synthetic */ void F(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // com.daaw.InterfaceC3640cA0
    public InterfaceC4476fA0 A0() {
        InterfaceC4476fA0 interfaceC4476fA0 = this.I;
        if (interfaceC4476fA0 == null) {
            F(13);
        }
        return interfaceC4476fA0;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean B0() {
        return false;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public boolean E() {
        return false;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean E0() {
        return false;
    }

    @Override // com.daaw.InterfaceC1583Mi
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public InterfaceC3640cA0 I(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC1583Mi.a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean J() {
        return false;
    }

    public Collection K0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC4476fA0 interfaceC4476fA0 : A0().e()) {
            A7 a7F = z ? interfaceC4476fA0.f() : interfaceC4476fA0.g();
            if (a7F != null) {
                arrayList.add(a7F);
            }
        }
        return arrayList;
    }

    public void L0(boolean z) {
        this.F = z;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean M() {
        return false;
    }

    public void M0(InterfaceC8468tR interfaceC8468tR) {
        this.M = interfaceC8468tR;
    }

    public void N0(AbstractC8965vA abstractC8965vA) {
        this.L = abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC3640cA0
    public boolean R() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public Object X(InterfaceC1376Ki.a aVar) {
        return null;
    }

    @Override // com.daaw.InterfaceC8468tR
    public InterfaceC8468tR b0() {
        return this.M;
    }

    @Override // com.daaw.InterfaceC4297eZ0
    public InterfaceC8468tR c(C8957v81 c8957v81) {
        if (c8957v81 == null) {
            F(7);
        }
        return this;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 c0() {
        return A0().c0();
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F(9);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA abstractC8965vA = this.L;
        if (abstractC8965vA == null) {
            F(11);
        }
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC1583Mi
    public InterfaceC1583Mi.a i() {
        InterfaceC1583Mi.a aVar = this.K;
        if (aVar == null) {
            F(6);
        }
        return aVar;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 i0() {
        return A0().i0();
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        return this.G;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean isInfix() {
        return false;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean isInline() {
        return this.J;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean isOperator() {
        return false;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean isSuspend() {
        return false;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        EnumC0336Ak0 enumC0336Ak0 = this.H;
        if (enumC0336Ak0 == null) {
            F(10);
        }
        return enumC0336Ak0;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List o0() {
        List listO0 = A0().o0();
        if (listO0 == null) {
            F(14);
        }
        return listO0;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean u0() {
        return false;
    }

    @Override // com.daaw.InterfaceC1583Mi
    public void v0(Collection collection) {
        if (collection == null) {
            F(16);
        }
    }
}
