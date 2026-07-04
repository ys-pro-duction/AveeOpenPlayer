package com.daaw;

import com.daaw.InterfaceC1376Ki;
import com.daaw.InterfaceC1583Mi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.gA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4765gA0 extends AbstractC0938Gc1 implements InterfaceC4476fA0 {
    public final EnumC0336Ak0 J;
    public AbstractC8965vA K;
    public Collection L;
    public final InterfaceC4476fA0 M;
    public final InterfaceC1583Mi.a N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public List U;
    public RE0 V;
    public RE0 W;
    public List X;
    public C5323iA0 Y;
    public InterfaceC7565qA0 Z;
    public boolean a0;
    public InterfaceC3401bK b0;
    public InterfaceC3401bK c0;

    /* JADX INFO: renamed from: com.daaw.gA0$a */
    public class a {
        public InterfaceC8612tw a;
        public EnumC0336Ak0 b;
        public AbstractC8965vA c;
        public InterfaceC1583Mi.a f;
        public RE0 i;
        public C2352Tm0 k;
        public I80 l;
        public InterfaceC4476fA0 d = null;
        public boolean e = false;
        public AbstractC8392t81 g = AbstractC8392t81.b;
        public boolean h = true;
        public List j = null;

        public a() {
            this.a = C4765gA0.this.b();
            this.b = C4765gA0.this.l();
            this.c = C4765gA0.this.getVisibility();
            this.f = C4765gA0.this.i();
            this.i = C4765gA0.this.V;
            this.k = C4765gA0.this.getName();
            this.l = C4765gA0.this.getType();
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public InterfaceC4476fA0 n() {
            return C4765gA0.this.Q0(this);
        }

        public InterfaceC5044hA0 o() {
            InterfaceC4476fA0 interfaceC4476fA0 = this.d;
            if (interfaceC4476fA0 == null) {
                return null;
            }
            return interfaceC4476fA0.f();
        }

        public InterfaceC7565qA0 p() {
            InterfaceC4476fA0 interfaceC4476fA0 = this.d;
            if (interfaceC4476fA0 == null) {
                return null;
            }
            return interfaceC4476fA0.g();
        }

        public a q(boolean z) {
            this.h = z;
            return this;
        }

        public a r(InterfaceC1583Mi.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f = aVar;
            return this;
        }

        public a s(EnumC0336Ak0 enumC0336Ak0) {
            if (enumC0336Ak0 == null) {
                a(6);
            }
            this.b = enumC0336Ak0;
            return this;
        }

        public a t(InterfaceC1583Mi interfaceC1583Mi) {
            this.d = (InterfaceC4476fA0) interfaceC1583Mi;
            return this;
        }

        public a u(InterfaceC8612tw interfaceC8612tw) {
            if (interfaceC8612tw == null) {
                a(0);
            }
            this.a = interfaceC8612tw;
            return this;
        }

        public a v(AbstractC8392t81 abstractC8392t81) {
            if (abstractC8392t81 == null) {
                a(15);
            }
            this.g = abstractC8392t81;
            return this;
        }

        public a w(AbstractC8965vA abstractC8965vA) {
            if (abstractC8965vA == null) {
                a(8);
            }
            this.c = abstractC8965vA;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4765gA0(InterfaceC8612tw interfaceC8612tw, InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, boolean z, C2352Tm0 c2352Tm0, InterfaceC1583Mi.a aVar, RU0 ru0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(interfaceC8612tw, interfaceC3072a8, c2352Tm0, null, z, ru0);
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
        if (aVar == null) {
            F(5);
        }
        if (ru0 == null) {
            F(6);
        }
        this.L = null;
        this.U = Collections.EMPTY_LIST;
        this.J = enumC0336Ak0;
        this.K = abstractC8965vA;
        this.M = interfaceC4476fA0 == null ? this : interfaceC4476fA0;
        this.N = aVar;
        this.O = z2;
        this.P = z3;
        this.Q = z4;
        this.R = z5;
        this.S = z6;
        this.T = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void F(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4765gA0.F(int):void");
    }

    public static C4765gA0 O0(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, boolean z, C2352Tm0 c2352Tm0, InterfaceC1583Mi.a aVar, RU0 ru0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
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
        if (aVar == null) {
            F(12);
        }
        if (ru0 == null) {
            F(13);
        }
        return new C4765gA0(interfaceC8612tw, null, interfaceC3072a8, enumC0336Ak0, abstractC8965vA, z, c2352Tm0, aVar, ru0, z2, z3, z4, z5, z6, z7);
    }

    public static InterfaceC8468tR T0(C8957v81 c8957v81, InterfaceC3640cA0 interfaceC3640cA0) {
        if (c8957v81 == null) {
            F(30);
        }
        if (interfaceC3640cA0 == null) {
            F(31);
        }
        if (interfaceC3640cA0.b0() != null) {
            return interfaceC3640cA0.b0().c(c8957v81);
        }
        return null;
    }

    public static AbstractC8965vA Y0(AbstractC8965vA abstractC8965vA, InterfaceC1583Mi.a aVar) {
        return (aVar == InterfaceC1583Mi.a.FAKE_OVERRIDE && AbstractC8679uA.g(abstractC8965vA.f())) ? AbstractC8679uA.h : abstractC8965vA;
    }

    public static RE0 d1(C8957v81 c8957v81, InterfaceC4476fA0 interfaceC4476fA0, RE0 re0) {
        I80 i80P = c8957v81.p(re0.getType(), EnumC1042Hc1.G);
        if (i80P == null) {
            return null;
        }
        return new SE0(interfaceC4476fA0, new C0367As(interfaceC4476fA0, i80P, ((XY) re0.getValue()).a(), re0.getValue()), re0.getAnnotations());
    }

    public static RE0 e1(C8957v81 c8957v81, InterfaceC4476fA0 interfaceC4476fA0, RE0 re0) {
        I80 i80P = c8957v81.p(re0.getType(), EnumC1042Hc1.G);
        if (i80P == null) {
            return null;
        }
        return new SE0(interfaceC4476fA0, new C5917kJ(interfaceC4476fA0, i80P, re0.getValue()), re0.getAnnotations());
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean E0() {
        return this.R;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean J() {
        return this.Q;
    }

    @Override // com.daaw.InterfaceC0834Fc1
    public boolean L() {
        return this.T;
    }

    @Override // com.daaw.InterfaceC1583Mi
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public InterfaceC4476fA0 I(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC1583Mi.a aVar, boolean z) {
        InterfaceC4476fA0 interfaceC4476fA0N = X0().u(interfaceC8612tw).t(null).s(enumC0336Ak0).w(abstractC8965vA).r(aVar).q(z).n();
        if (interfaceC4476fA0N == null) {
            F(42);
        }
        return interfaceC4476fA0N;
    }

    public C4765gA0 P0(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC4476fA0 interfaceC4476fA0, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, RU0 ru0) {
        if (interfaceC8612tw == null) {
            F(32);
        }
        if (enumC0336Ak0 == null) {
            F(33);
        }
        if (abstractC8965vA == null) {
            F(34);
        }
        if (aVar == null) {
            F(35);
        }
        if (c2352Tm0 == null) {
            F(36);
        }
        if (ru0 == null) {
            F(37);
        }
        return new C4765gA0(interfaceC8612tw, interfaceC4476fA0, getAnnotations(), enumC0336Ak0, abstractC8965vA, f0(), c2352Tm0, aVar, ru0, p0(), y(), J(), E0(), isExternal(), L());
    }

    public InterfaceC4476fA0 Q0(a aVar) {
        RE0 re0;
        LQ lq;
        if (aVar == null) {
            F(29);
        }
        C4765gA0 c4765gA0P0 = P0(aVar.a, aVar.b, aVar.c, aVar.d, aVar.f, aVar.k, S0(aVar.e, aVar.d));
        List typeParameters = aVar.j == null ? getTypeParameters() : aVar.j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C8957v81 c8957v81B = AbstractC6448mA.b(typeParameters, aVar.g, c4765gA0P0, arrayList);
        I80 i80 = aVar.l;
        I80 i80P = c8957v81B.p(i80, EnumC1042Hc1.H);
        if (i80P == null) {
            return null;
        }
        I80 i80P2 = c8957v81B.p(i80, EnumC1042Hc1.G);
        if (i80P2 != null) {
            c4765gA0P0.Z0(i80P2);
        }
        RE0 re02 = aVar.i;
        if (re02 != null) {
            RE0 re0C = re02.c(c8957v81B);
            if (re0C == null) {
                return null;
            }
            re0 = re0C;
        } else {
            re0 = null;
        }
        RE0 re03 = this.W;
        RE0 re0E1 = re03 != null ? e1(c8957v81B, c4765gA0P0, re03) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            RE0 re0D1 = d1(c8957v81B, c4765gA0P0, (RE0) it.next());
            if (re0D1 != null) {
                arrayList2.add(re0D1);
            }
        }
        c4765gA0P0.b1(i80P, arrayList, re0, re0E1, arrayList2);
        C5323iA0 c5323iA0 = this.Y == null ? null : new C5323iA0(c4765gA0P0, this.Y.getAnnotations(), aVar.b, Y0(this.Y.getVisibility(), aVar.f), this.Y.R(), this.Y.isExternal(), this.Y.isInline(), aVar.f, aVar.o(), RU0.a);
        if (c5323iA0 != null) {
            I80 returnType = this.Y.getReturnType();
            c5323iA0.M0(T0(c8957v81B, this.Y));
            c5323iA0.P0(returnType != null ? c8957v81B.p(returnType, EnumC1042Hc1.H) : null);
        }
        C7843rA0 c7843rA0 = this.Z == null ? null : new C7843rA0(c4765gA0P0, this.Z.getAnnotations(), aVar.b, Y0(this.Z.getVisibility(), aVar.f), this.Z.R(), this.Z.isExternal(), this.Z.isInline(), aVar.f, aVar.p(), RU0.a);
        if (c7843rA0 != null) {
            List listP0 = AbstractC8747uR.P0(c7843rA0, this.Z.h(), c8957v81B, false, false, null);
            if (listP0 == null) {
                c4765gA0P0.a1(true);
                listP0 = Collections.singletonList(C7843rA0.O0(c7843rA0, AbstractC8400tA.m(aVar.a).H(), ((InterfaceC9918yc1) this.Z.h().get(0)).getAnnotations()));
            }
            if (listP0.size() != 1) {
                throw new IllegalStateException();
            }
            c7843rA0.M0(T0(c8957v81B, this.Z));
            c7843rA0.Q0((InterfaceC9918yc1) listP0.get(0));
        }
        InterfaceC3401bK interfaceC3401bK = this.b0;
        C3679cK c3679cK = interfaceC3401bK == null ? null : new C3679cK(interfaceC3401bK.getAnnotations(), c4765gA0P0);
        InterfaceC3401bK interfaceC3401bK2 = this.c0;
        c4765gA0P0.V0(c5323iA0, c7843rA0, c3679cK, interfaceC3401bK2 == null ? null : new C3679cK(interfaceC3401bK2.getAnnotations(), c4765gA0P0));
        if (aVar.h) {
            VT0 vt0S = VT0.s();
            Iterator it2 = e().iterator();
            while (it2.hasNext()) {
                vt0S.add(((InterfaceC4476fA0) it2.next()).c(c8957v81B));
            }
            c4765gA0P0.v0(vt0S);
        }
        if (y() && (lq = this.I) != null) {
            c4765gA0P0.K0(this.H, lq);
        }
        return c4765gA0P0;
    }

    @Override // com.daaw.InterfaceC4476fA0
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public C5323iA0 f() {
        return this.Y;
    }

    public final RU0 S0(boolean z, InterfaceC4476fA0 interfaceC4476fA0) {
        RU0 ru0J;
        if (z) {
            if (interfaceC4476fA0 == null) {
                interfaceC4476fA0 = a();
            }
            ru0J = interfaceC4476fA0.j();
        } else {
            ru0J = RU0.a;
        }
        if (ru0J == null) {
            F(28);
        }
        return ru0J;
    }

    public void U0(C5323iA0 c5323iA0, InterfaceC7565qA0 interfaceC7565qA0) {
        V0(c5323iA0, interfaceC7565qA0, null, null);
    }

    public void V0(C5323iA0 c5323iA0, InterfaceC7565qA0 interfaceC7565qA0, InterfaceC3401bK interfaceC3401bK, InterfaceC3401bK interfaceC3401bK2) {
        this.Y = c5323iA0;
        this.Z = interfaceC7565qA0;
        this.b0 = interfaceC3401bK;
        this.c0 = interfaceC3401bK2;
    }

    public boolean W0() {
        return this.a0;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public Object X(InterfaceC1376Ki.a aVar) {
        return null;
    }

    public a X0() {
        return new a();
    }

    public void Z0(I80 i80) {
        if (i80 == null) {
            F(14);
        }
    }

    public void a1(boolean z) {
        this.a0 = z;
    }

    public void b1(I80 i80, List list, RE0 re0, RE0 re02, List list2) {
        if (i80 == null) {
            F(17);
        }
        if (list == null) {
            F(18);
        }
        if (list2 == null) {
            F(19);
        }
        F0(i80);
        this.X = new ArrayList(list);
        this.W = re02;
        this.V = re0;
        this.U = list2;
    }

    @Override // com.daaw.AbstractC0730Ec1, com.daaw.InterfaceC1376Ki
    public RE0 c0() {
        return this.V;
    }

    public void c1(AbstractC8965vA abstractC8965vA) {
        if (abstractC8965vA == null) {
            F(20);
        }
        this.K = abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public Collection e() {
        Collection collection = this.L;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            F(41);
        }
        return collection;
    }

    @Override // com.daaw.InterfaceC4476fA0
    public InterfaceC7565qA0 g() {
        return this.Z;
    }

    @Override // com.daaw.AbstractC0730Ec1, com.daaw.InterfaceC1376Ki
    public I80 getReturnType() {
        I80 type = getType();
        if (type == null) {
            F(23);
        }
        return type;
    }

    @Override // com.daaw.AbstractC0730Ec1, com.daaw.InterfaceC1376Ki
    public List getTypeParameters() {
        List list = this.X;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA abstractC8965vA = this.K;
        if (abstractC8965vA == null) {
            F(25);
        }
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return interfaceC9735xw.d(this, obj);
    }

    @Override // com.daaw.InterfaceC1583Mi
    public InterfaceC1583Mi.a i() {
        InterfaceC1583Mi.a aVar = this.N;
        if (aVar == null) {
            F(39);
        }
        return aVar;
    }

    @Override // com.daaw.AbstractC0730Ec1, com.daaw.InterfaceC1376Ki
    public RE0 i0() {
        return this.W;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        return this.S;
    }

    @Override // com.daaw.InterfaceC4476fA0
    public InterfaceC3401bK k0() {
        return this.c0;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        EnumC0336Ak0 enumC0336Ak0 = this.J;
        if (enumC0336Ak0 == null) {
            F(24);
        }
        return enumC0336Ak0;
    }

    @Override // com.daaw.InterfaceC4476fA0
    public InterfaceC3401bK n0() {
        return this.b0;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List o0() {
        List list = this.U;
        if (list == null) {
            F(22);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public boolean p0() {
        return this.O;
    }

    @Override // com.daaw.InterfaceC1583Mi
    public void v0(Collection collection) {
        if (collection == null) {
            F(40);
        }
        this.L = collection;
    }

    @Override // com.daaw.InterfaceC4476fA0
    public List w() {
        ArrayList arrayList = new ArrayList(2);
        C5323iA0 c5323iA0 = this.Y;
        if (c5323iA0 != null) {
            arrayList.add(c5323iA0);
        }
        InterfaceC7565qA0 interfaceC7565qA0 = this.Z;
        if (interfaceC7565qA0 != null) {
            arrayList.add(interfaceC7565qA0);
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public boolean y() {
        return this.P;
    }

    @Override // com.daaw.InterfaceC4297eZ0
    public InterfaceC4476fA0 c(C8957v81 c8957v81) {
        if (c8957v81 == null) {
            F(27);
        }
        return c8957v81.k() ? this : X0().v(c8957v81.j()).t(a()).n();
    }

    @Override // com.daaw.AbstractC9456ww
    public InterfaceC4476fA0 a() {
        InterfaceC4476fA0 interfaceC4476fA0 = this.M;
        InterfaceC4476fA0 interfaceC4476fA0A = interfaceC4476fA0 == this ? this : interfaceC4476fA0.a();
        if (interfaceC4476fA0A == null) {
            F(38);
        }
        return interfaceC4476fA0A;
    }
}
