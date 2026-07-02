package com.daaw;

import com.daaw.InterfaceC9624xZ0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.a81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3074a81 extends X0 {
    public final NQ L;
    public final List M;
    public boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3074a81(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, boolean z, EnumC1042Hc1 enumC1042Hc1, C2352Tm0 c2352Tm0, int i, RU0 ru0, NQ nq, InterfaceC9624xZ0 interfaceC9624xZ0, InterfaceC10174zX0 interfaceC10174zX0) {
        super(interfaceC10174zX0, interfaceC8612tw, interfaceC3072a8, c2352Tm0, enumC1042Hc1, z, i, ru0, interfaceC9624xZ0);
        if (interfaceC8612tw == null) {
            F(19);
        }
        if (interfaceC3072a8 == null) {
            F(20);
        }
        if (enumC1042Hc1 == null) {
            F(21);
        }
        if (c2352Tm0 == null) {
            F(22);
        }
        if (ru0 == null) {
            F(23);
        }
        if (interfaceC9624xZ0 == null) {
            F(24);
        }
        if (interfaceC10174zX0 == null) {
            F(25);
        }
        this.M = new ArrayList(1);
        this.N = false;
        this.L = nq;
    }

    private static /* synthetic */ void F(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C3074a81 P0(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, boolean z, EnumC1042Hc1 enumC1042Hc1, C2352Tm0 c2352Tm0, int i, RU0 ru0, NQ nq, InterfaceC9624xZ0 interfaceC9624xZ0, InterfaceC10174zX0 interfaceC10174zX0) {
        if (interfaceC8612tw == null) {
            F(12);
        }
        if (interfaceC3072a8 == null) {
            F(13);
        }
        if (enumC1042Hc1 == null) {
            F(14);
        }
        if (c2352Tm0 == null) {
            F(15);
        }
        if (ru0 == null) {
            F(16);
        }
        if (interfaceC9624xZ0 == null) {
            F(17);
        }
        if (interfaceC10174zX0 == null) {
            F(18);
        }
        return new C3074a81(interfaceC8612tw, interfaceC3072a8, z, enumC1042Hc1, c2352Tm0, i, ru0, nq, interfaceC9624xZ0, interfaceC10174zX0);
    }

    public static C3074a81 Q0(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, boolean z, EnumC1042Hc1 enumC1042Hc1, C2352Tm0 c2352Tm0, int i, RU0 ru0, InterfaceC10174zX0 interfaceC10174zX0) {
        if (interfaceC8612tw == null) {
            F(6);
        }
        if (interfaceC3072a8 == null) {
            F(7);
        }
        if (enumC1042Hc1 == null) {
            F(8);
        }
        if (c2352Tm0 == null) {
            F(9);
        }
        if (ru0 == null) {
            F(10);
        }
        if (interfaceC10174zX0 == null) {
            F(11);
        }
        return P0(interfaceC8612tw, interfaceC3072a8, z, enumC1042Hc1, c2352Tm0, i, ru0, null, InterfaceC9624xZ0.a.a, interfaceC10174zX0);
    }

    public static Z71 R0(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, boolean z, EnumC1042Hc1 enumC1042Hc1, C2352Tm0 c2352Tm0, int i, InterfaceC10174zX0 interfaceC10174zX0) {
        if (interfaceC8612tw == null) {
            F(0);
        }
        if (interfaceC3072a8 == null) {
            F(1);
        }
        if (enumC1042Hc1 == null) {
            F(2);
        }
        if (c2352Tm0 == null) {
            F(3);
        }
        if (interfaceC10174zX0 == null) {
            F(4);
        }
        C3074a81 c3074a81Q0 = Q0(interfaceC8612tw, interfaceC3072a8, z, enumC1042Hc1, c2352Tm0, i, RU0.a, interfaceC10174zX0);
        c3074a81Q0.M0(AbstractC8400tA.m(interfaceC8612tw).y());
        c3074a81Q0.V0();
        return c3074a81Q0;
    }

    @Override // com.daaw.X0
    public void K0(I80 i80) {
        if (i80 == null) {
            F(27);
        }
        NQ nq = this.L;
        if (nq == null) {
            return;
        }
        nq.invoke(i80);
    }

    @Override // com.daaw.X0
    public List L0() {
        N0();
        List list = this.M;
        if (list == null) {
            F(28);
        }
        return list;
    }

    public void M0(I80 i80) {
        if (i80 == null) {
            F(26);
        }
        O0();
        S0(i80);
    }

    public final void N0() {
        if (this.N) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + U0());
    }

    public final void O0() {
        if (this.N) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + U0());
        }
    }

    public final void S0(I80 i80) {
        if (N80.a(i80)) {
            return;
        }
        this.M.add(i80);
    }

    public boolean T0() {
        return this.N;
    }

    public final String U0() {
        return getName() + " declared in " + AbstractC7006oA.m(b());
    }

    public void V0() {
        O0();
        this.N = true;
    }
}
