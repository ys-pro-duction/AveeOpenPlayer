package com.daaw;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class X0 extends AbstractC9456ww implements Z71 {
    public final EnumC1042Hc1 F;
    public final boolean G;
    public final int H;
    public final InterfaceC0881Fo0 I;
    public final InterfaceC0881Fo0 J;
    public final InterfaceC10174zX0 K;

    public class a implements LQ {
        public final /* synthetic */ InterfaceC10174zX0 B;
        public final /* synthetic */ InterfaceC9624xZ0 C;

        public a(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC9624xZ0 interfaceC9624xZ0) {
            this.B = interfaceC10174zX0;
            this.C = interfaceC9624xZ0;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C71 invoke() {
            return new c(X0.this, this.B, this.C);
        }
    }

    public class b implements LQ {
        public final /* synthetic */ C2352Tm0 B;

        public class a implements LQ {
            public a() {
            }

            @Override // com.daaw.LQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC4346ej0 invoke() {
                return S71.m("Scope for type parameter " + b.this.B.c(), X0.this.getUpperBounds());
            }
        }

        public b(C2352Tm0 c2352Tm0) {
            this.B = c2352Tm0;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public YS0 invoke() {
            return M80.m(C8387t71.C.j(), X0.this.k(), Collections.EMPTY_LIST, false, new C5153hb0(new a()));
        }
    }

    public class c extends W0 {
        public final InterfaceC9624xZ0 d;
        public final /* synthetic */ X0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(X0 x0, InterfaceC10174zX0 interfaceC10174zX0, InterfaceC9624xZ0 interfaceC9624xZ0) {
            super(interfaceC10174zX0);
            if (interfaceC10174zX0 == null) {
                H(0);
            }
            this.e = x0;
            this.d = interfaceC9624xZ0;
        }

        public static /* synthetic */ void H(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // com.daaw.AbstractC9961yl, com.daaw.C71
        public InterfaceC10240zl c() {
            X0 x0 = this.e;
            if (x0 == null) {
                H(3);
            }
            return x0;
        }

        @Override // com.daaw.C71
        public boolean d() {
            return true;
        }

        @Override // com.daaw.C71
        public List getParameters() {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                H(2);
            }
            return list;
        }

        @Override // com.daaw.AbstractC9961yl
        public boolean h(InterfaceC10240zl interfaceC10240zl) {
            if (interfaceC10240zl == null) {
                H(9);
            }
            return (interfaceC10240zl instanceof Z71) && C1340Jz.a.m(this.e, (Z71) interfaceC10240zl, true);
        }

        @Override // com.daaw.C71
        public AbstractC8670u80 p() {
            AbstractC8670u80 abstractC8670u80M = AbstractC8400tA.m(this.e);
            if (abstractC8670u80M == null) {
                H(4);
            }
            return abstractC8670u80M;
        }

        @Override // com.daaw.W0
        public Collection r() {
            List listL0 = this.e.L0();
            if (listL0 == null) {
                H(1);
            }
            return listL0;
        }

        @Override // com.daaw.W0
        public I80 s() {
            return BH.d(AH.V, new String[0]);
        }

        public String toString() {
            return this.e.getName().toString();
        }

        @Override // com.daaw.W0
        public InterfaceC9624xZ0 v() {
            InterfaceC9624xZ0 interfaceC9624xZ0 = this.d;
            if (interfaceC9624xZ0 == null) {
                H(5);
            }
            return interfaceC9624xZ0;
        }

        @Override // com.daaw.W0
        public List x(List list) {
            if (list == null) {
                H(7);
            }
            List listF0 = this.e.F0(list);
            if (listF0 == null) {
                H(8);
            }
            return listF0;
        }

        @Override // com.daaw.W0
        public void z(I80 i80) {
            if (i80 == null) {
                H(6);
            }
            this.e.K0(i80);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, EnumC1042Hc1 enumC1042Hc1, boolean z, int i, RU0 ru0, InterfaceC9624xZ0 interfaceC9624xZ0) {
        super(interfaceC8612tw, interfaceC3072a8, c2352Tm0, ru0);
        if (interfaceC10174zX0 == null) {
            F(0);
        }
        if (interfaceC8612tw == null) {
            F(1);
        }
        if (interfaceC3072a8 == null) {
            F(2);
        }
        if (c2352Tm0 == null) {
            F(3);
        }
        if (enumC1042Hc1 == null) {
            F(4);
        }
        if (ru0 == null) {
            F(5);
        }
        if (interfaceC9624xZ0 == null) {
            F(6);
        }
        this.F = enumC1042Hc1;
        this.G = z;
        this.H = i;
        this.I = interfaceC10174zX0.h(new a(interfaceC10174zX0, interfaceC9624xZ0));
        this.J = interfaceC10174zX0.h(new b(c2352Tm0));
        this.K = interfaceC10174zX0;
    }

    private static /* synthetic */ void F(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // com.daaw.Z71
    public boolean D() {
        return this.G;
    }

    public List F0(List list) {
        if (list == null) {
            F(12);
        }
        if (list == null) {
            F(13);
        }
        return list;
    }

    public abstract void K0(I80 i80);

    public abstract List L0();

    @Override // com.daaw.Z71
    public InterfaceC10174zX0 e0() {
        InterfaceC10174zX0 interfaceC10174zX0 = this.K;
        if (interfaceC10174zX0 == null) {
            F(14);
        }
        return interfaceC10174zX0;
    }

    @Override // com.daaw.Z71
    public int getIndex() {
        return this.H;
    }

    @Override // com.daaw.Z71
    public List getUpperBounds() {
        List listB = ((c) k()).b();
        if (listB == null) {
            F(8);
        }
        return listB;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return interfaceC9735xw.i(this, obj);
    }

    @Override // com.daaw.Z71, com.daaw.InterfaceC10240zl
    public final C71 k() {
        C71 c71 = (C71) this.I.invoke();
        if (c71 == null) {
            F(9);
        }
        return c71;
    }

    @Override // com.daaw.Z71
    public boolean l0() {
        return false;
    }

    @Override // com.daaw.Z71
    public EnumC1042Hc1 o() {
        EnumC1042Hc1 enumC1042Hc1 = this.F;
        if (enumC1042Hc1 == null) {
            F(7);
        }
        return enumC1042Hc1;
    }

    @Override // com.daaw.InterfaceC10240zl
    public YS0 s() {
        YS0 ys0 = (YS0) this.J.invoke();
        if (ys0 == null) {
            F(10);
        }
        return ys0;
    }

    @Override // com.daaw.AbstractC9456ww
    public Z71 a() {
        Z71 z71 = (Z71) super.a();
        if (z71 == null) {
            F(11);
        }
        return z71;
    }
}
