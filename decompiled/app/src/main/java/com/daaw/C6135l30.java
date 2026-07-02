package com.daaw;

import com.daaw.InterfaceC1376Ki;
import com.daaw.InterfaceC1583Mi;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.l30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C6135l30 extends C4765gA0 implements B20 {
    public final boolean d0;
    public final C0576Cs0 e0;
    public I80 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6135l30(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, boolean z, C2352Tm0 c2352Tm0, RU0 ru0, InterfaceC4476fA0 interfaceC4476fA0, InterfaceC1583Mi.a aVar, boolean z2, C0576Cs0 c0576Cs0) {
        super(interfaceC8612tw, interfaceC4476fA0, interfaceC3072a8, enumC0336Ak0, abstractC8965vA, z, c2352Tm0, aVar, ru0, false, false, false, false, false, false);
        if (interfaceC8612tw == null) {
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
        if (c2352Tm0 == null) {
            F(4);
        }
        if (ru0 == null) {
            F(5);
        }
        if (aVar == null) {
            F(6);
        }
        this.f0 = null;
        this.d0 = z2;
        this.e0 = c0576Cs0;
    }

    private static /* synthetic */ void F(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static C6135l30 f1(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, boolean z, C2352Tm0 c2352Tm0, RU0 ru0, boolean z2) {
        if (interfaceC8612tw == null) {
            F(7);
        }
        if (interfaceC3072a8 == null) {
            F(8);
        }
        if (enumC0336Ak0 == null) {
            F(9);
        }
        if (abstractC8965vA == null) {
            F(10);
        }
        if (c2352Tm0 == null) {
            F(11);
        }
        if (ru0 == null) {
            F(12);
        }
        return new C6135l30(interfaceC8612tw, interfaceC3072a8, enumC0336Ak0, abstractC8965vA, z, c2352Tm0, ru0, null, InterfaceC1583Mi.a.DECLARATION, z2, null);
    }

    @Override // com.daaw.B20
    public B20 D0(I80 i80, List list, I80 i802, C0576Cs0 c0576Cs0) {
        C5323iA0 c5323iA0;
        C7843rA0 c7843rA0;
        if (list == null) {
            F(19);
        }
        if (i802 == null) {
            F(20);
        }
        InterfaceC4476fA0 interfaceC4476fA0A = a() == this ? null : a();
        C6135l30 c6135l30 = new C6135l30(b(), getAnnotations(), l(), getVisibility(), f0(), getName(), j(), interfaceC4476fA0A, i(), this.d0, c0576Cs0);
        C5323iA0 c5323iA0F = f();
        if (c5323iA0F != null) {
            C5323iA0 c5323iA02 = new C5323iA0(c6135l30, c5323iA0F.getAnnotations(), c5323iA0F.l(), c5323iA0F.getVisibility(), c5323iA0F.R(), c5323iA0F.isExternal(), c5323iA0F.isInline(), i(), interfaceC4476fA0A == null ? null : interfaceC4476fA0A.f(), c5323iA0F.j());
            c5323iA02.M0(c5323iA0F.b0());
            c5323iA02.P0(i802);
            c5323iA0 = c5323iA02;
        } else {
            c5323iA0 = null;
        }
        InterfaceC7565qA0 interfaceC7565qA0G = g();
        if (interfaceC7565qA0G != null) {
            c7843rA0 = new C7843rA0(c6135l30, interfaceC7565qA0G.getAnnotations(), interfaceC7565qA0G.l(), interfaceC7565qA0G.getVisibility(), interfaceC7565qA0G.R(), interfaceC7565qA0G.isExternal(), interfaceC7565qA0G.isInline(), i(), interfaceC4476fA0A == null ? null : interfaceC4476fA0A.g(), interfaceC7565qA0G.j());
            c7843rA0.M0(c7843rA0.b0());
            c7843rA0.Q0((InterfaceC9918yc1) interfaceC7565qA0G.h().get(0));
        } else {
            c7843rA0 = null;
        }
        c6135l30.V0(c5323iA0, c7843rA0, n0(), k0());
        c6135l30.a1(W0());
        LQ lq = this.I;
        if (lq != null) {
            c6135l30.K0(this.H, lq);
        }
        c6135l30.v0(e());
        c6135l30.b1(i802, getTypeParameters(), c0(), i80 != null ? AbstractC1444Kz.i(this, i80, InterfaceC3072a8.b.b()) : null, AbstractC1599Mm.k());
        return c6135l30;
    }

    @Override // com.daaw.AbstractC0730Ec1, com.daaw.InterfaceC1376Ki
    public boolean E() {
        return false;
    }

    @Override // com.daaw.C4765gA0
    public C4765gA0 P0(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC4476fA0 interfaceC4476fA0, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, RU0 ru0) {
        if (interfaceC8612tw == null) {
            F(13);
        }
        if (enumC0336Ak0 == null) {
            F(14);
        }
        if (abstractC8965vA == null) {
            F(15);
        }
        if (aVar == null) {
            F(16);
        }
        if (c2352Tm0 == null) {
            F(17);
        }
        if (ru0 == null) {
            F(18);
        }
        return new C6135l30(interfaceC8612tw, getAnnotations(), enumC0336Ak0, abstractC8965vA, f0(), c2352Tm0, ru0, interfaceC4476fA0, aVar, this.d0, this.e0);
    }

    @Override // com.daaw.C4765gA0, com.daaw.InterfaceC1376Ki
    public Object X(InterfaceC1376Ki.a aVar) {
        C0576Cs0 c0576Cs0 = this.e0;
        if (c0576Cs0 == null || !((InterfaceC1376Ki.a) c0576Cs0.c()).equals(aVar)) {
            return null;
        }
        return this.e0.d();
    }

    @Override // com.daaw.C4765gA0
    public void Z0(I80 i80) {
        if (i80 == null) {
            F(22);
        }
        this.f0 = i80;
    }

    @Override // com.daaw.C4765gA0, com.daaw.InterfaceC0626Dc1
    public boolean y() {
        I80 type = getType();
        if (this.d0 && C2575Vq.a(type)) {
            return !N71.i(type) || AbstractC8670u80.v0(type);
        }
        return false;
    }
}
