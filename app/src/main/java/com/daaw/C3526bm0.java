package com.daaw;

import com.daaw.InterfaceC4346ej0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.bm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3526bm0 extends AbstractC5202hl {
    public final EnumC6886nl J;
    public final boolean K;
    public EnumC0336Ak0 L;
    public AbstractC8965vA M;
    public C71 N;
    public List O;
    public final Collection P;
    public final InterfaceC10174zX0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3526bm0(InterfaceC8612tw interfaceC8612tw, EnumC6886nl enumC6886nl, boolean z, boolean z2, C2352Tm0 c2352Tm0, RU0 ru0, InterfaceC10174zX0 interfaceC10174zX0) {
        super(interfaceC10174zX0, interfaceC8612tw, c2352Tm0, ru0, z2);
        if (interfaceC8612tw == null) {
            y0(0);
        }
        if (enumC6886nl == null) {
            y0(1);
        }
        if (c2352Tm0 == null) {
            y0(2);
        }
        if (ru0 == null) {
            y0(3);
        }
        if (interfaceC10174zX0 == null) {
            y0(4);
        }
        this.P = new ArrayList();
        this.Q = interfaceC10174zX0;
        this.J = enumC6886nl;
        this.K = z;
    }

    private static /* synthetic */ void y0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean B() {
        return false;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean E0() {
        return false;
    }

    @Override // com.daaw.InterfaceC4923gl
    public Collection H() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            y0(19);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean I0() {
        return false;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean J() {
        return false;
    }

    @Override // com.daaw.InterfaceC0339Al
    public boolean K() {
        return this.K;
    }

    public void K0() {
        this.N = new C8280sl(this, this.O, this.P, this.Q);
        Iterator it = m().iterator();
        while (it.hasNext()) {
            ((C3520bl) ((InterfaceC8468tR) it.next())).g1(s());
        }
    }

    @Override // com.daaw.InterfaceC4923gl
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public Set m() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            y0(13);
        }
        return set;
    }

    public void M0(EnumC0336Ak0 enumC0336Ak0) {
        if (enumC0336Ak0 == null) {
            y0(6);
        }
        this.L = enumC0336Ak0;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC3241al N() {
        return null;
    }

    public void N0(List list) {
        if (list == null) {
            y0(14);
        }
        if (this.O == null) {
            this.O = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 O() {
        InterfaceC4346ej0.b bVar = InterfaceC4346ej0.b.b;
        if (bVar == null) {
            y0(18);
        }
        return bVar;
    }

    public void O0(AbstractC8965vA abstractC8965vA) {
        if (abstractC8965vA == null) {
            y0(9);
        }
        this.M = abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4923gl Q() {
        return null;
    }

    @Override // com.daaw.AbstractC2134Rk0
    public InterfaceC4346ej0 U(Q80 q80) {
        if (q80 == null) {
            y0(16);
        }
        InterfaceC4346ej0.b bVar = InterfaceC4346ej0.b.b;
        if (bVar == null) {
            y0(17);
        }
        return bVar;
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        InterfaceC3072a8 interfaceC3072a8B = InterfaceC3072a8.b.b();
        if (interfaceC3072a8B == null) {
            y0(5);
        }
        return interfaceC3072a8B;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0, com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA abstractC8965vA = this.M;
        if (abstractC8965vA == null) {
            y0(10);
        }
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC4923gl
    public EnumC6886nl i() {
        EnumC6886nl enumC6886nl = this.J;
        if (enumC6886nl == null) {
            y0(8);
        }
        return enumC6886nl;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean isInline() {
        return false;
    }

    @Override // com.daaw.InterfaceC10240zl
    public C71 k() {
        C71 c71 = this.N;
        if (c71 == null) {
            y0(11);
        }
        return c71;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        EnumC0336Ak0 enumC0336Ak0 = this.L;
        if (enumC0336Ak0 == null) {
            y0(7);
        }
        return enumC0336Ak0;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean n() {
        return false;
    }

    public String toString() {
        return AbstractC8898uw.U(this);
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC0339Al
    public List v() {
        List list = this.O;
        if (list == null) {
            y0(15);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean x() {
        return false;
    }

    @Override // com.daaw.InterfaceC4923gl
    public AbstractC7958rc1 x0() {
        return null;
    }
}
