package com.daaw;

import com.daaw.InterfaceC4346ej0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5761jl extends AbstractC5202hl {
    public final EnumC0336Ak0 J;
    public final EnumC6886nl K;
    public final C71 L;
    public InterfaceC4346ej0 M;
    public Set N;
    public InterfaceC3241al O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5761jl(InterfaceC8612tw interfaceC8612tw, C2352Tm0 c2352Tm0, EnumC0336Ak0 enumC0336Ak0, EnumC6886nl enumC6886nl, Collection collection, RU0 ru0, boolean z, InterfaceC10174zX0 interfaceC10174zX0) {
        super(interfaceC10174zX0, interfaceC8612tw, c2352Tm0, ru0, z);
        if (interfaceC8612tw == null) {
            y0(0);
        }
        if (c2352Tm0 == null) {
            y0(1);
        }
        if (enumC0336Ak0 == null) {
            y0(2);
        }
        if (enumC6886nl == null) {
            y0(3);
        }
        if (collection == null) {
            y0(4);
        }
        if (ru0 == null) {
            y0(5);
        }
        if (interfaceC10174zX0 == null) {
            y0(6);
        }
        this.J = enumC0336Ak0;
        this.K = enumC6886nl;
        this.L = new C8280sl(this, Collections.EMPTY_LIST, collection, interfaceC10174zX0);
    }

    private static /* synthetic */ void y0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[1] = "getVisibility";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
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
        return false;
    }

    public final void K0(InterfaceC4346ej0 interfaceC4346ej0, Set set, InterfaceC3241al interfaceC3241al) {
        if (interfaceC4346ej0 == null) {
            y0(7);
        }
        if (set == null) {
            y0(8);
        }
        this.M = interfaceC4346ej0;
        this.N = set;
        this.O = interfaceC3241al;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC3241al N() {
        return this.O;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 O() {
        InterfaceC4346ej0.b bVar = InterfaceC4346ej0.b.b;
        if (bVar == null) {
            y0(14);
        }
        return bVar;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4923gl Q() {
        return null;
    }

    @Override // com.daaw.AbstractC2134Rk0
    public InterfaceC4346ej0 U(Q80 q80) {
        if (q80 == null) {
            y0(12);
        }
        InterfaceC4346ej0 interfaceC4346ej0 = this.M;
        if (interfaceC4346ej0 == null) {
            y0(13);
        }
        return interfaceC4346ej0;
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        InterfaceC3072a8 interfaceC3072a8B = InterfaceC3072a8.b.b();
        if (interfaceC3072a8B == null) {
            y0(9);
        }
        return interfaceC3072a8B;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0, com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA abstractC8965vA = AbstractC8679uA.e;
        if (abstractC8965vA == null) {
            y0(17);
        }
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC4923gl
    public EnumC6886nl i() {
        EnumC6886nl enumC6886nl = this.K;
        if (enumC6886nl == null) {
            y0(15);
        }
        return enumC6886nl;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean isInline() {
        return false;
    }

    @Override // com.daaw.InterfaceC10240zl
    public C71 k() {
        C71 c71 = this.L;
        if (c71 == null) {
            y0(10);
        }
        return c71;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        EnumC0336Ak0 enumC0336Ak0 = this.J;
        if (enumC0336Ak0 == null) {
            y0(16);
        }
        return enumC0336Ak0;
    }

    @Override // com.daaw.InterfaceC4923gl
    public Collection m() {
        Set set = this.N;
        if (set == null) {
            y0(11);
        }
        return set;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean n() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC0339Al
    public List v() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            y0(18);
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
