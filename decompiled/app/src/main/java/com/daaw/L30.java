package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class L30 {
    public final C0504Ca0 a;
    public final InterfaceC4188e81 b;
    public final C9540xE0 c;
    public final C5035h81 d;

    public L30(C0504Ca0 c0504Ca0, InterfaceC4188e81 interfaceC4188e81) {
        G10.g(c0504Ca0, "c");
        G10.g(interfaceC4188e81, "typeParameterResolver");
        this.a = c0504Ca0;
        this.b = interfaceC4188e81;
        C9540xE0 c9540xE0 = new C9540xE0();
        this.c = c9540xE0;
        this.d = new C5035h81(c9540xE0, null, 2, 0 == true ? 1 : 0);
    }

    public static final I80 e(L30 l30, Z71 z71, B30 b30, C71 c71, L20 l20) {
        G10.g(l30, "this$0");
        G10.g(z71, "$parameter");
        G10.g(b30, "$attr");
        G10.g(c71, "$constructor");
        G10.g(l20, "$javaType");
        C5035h81 c5035h81 = l30.d;
        InterfaceC10240zl interfaceC10240zlC = c71.c();
        return c5035h81.e(z71, b30.k(interfaceC10240zlC != null ? interfaceC10240zlC.s() : null).j(l20.w()));
    }

    public static /* synthetic */ I80 m(L30 l30, A20 a20, B30 b30, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return l30.l(a20, b30, z);
    }

    public static final C9830yH o(L20 l20) {
        return BH.d(AH.G, l20.p());
    }

    public final boolean b(L20 l20, InterfaceC4923gl interfaceC4923gl) {
        EnumC1042Hc1 enumC1042Hc1O;
        if (!N30.a((InterfaceC10047z30) AbstractC2455Um.r0(l20.F()))) {
            return false;
        }
        List parameters = C9768y30.a.b(interfaceC4923gl).k().getParameters();
        G10.f(parameters, "getParameters(...)");
        Z71 z71 = (Z71) AbstractC2455Um.r0(parameters);
        return (z71 == null || (enumC1042Hc1O = z71.o()) == null || enumC1042Hc1O == EnumC1042Hc1.H) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List c(com.daaw.L20 r10, com.daaw.B30 r11, com.daaw.C71 r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.L30.c(com.daaw.L20, com.daaw.B30, com.daaw.C71):java.util.List");
    }

    public final List d(L20 l20, List list, C71 c71, B30 b30) {
        L20 l202;
        C71 c712;
        B30 b302;
        InterfaceC6440m81 interfaceC6440m81A;
        List<Z71> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        for (Z71 z71 : list2) {
            if (H81.q(z71, null, b30.c())) {
                interfaceC6440m81A = D81.t(z71, b30);
                l202 = l20;
                c712 = c71;
                b302 = b30;
            } else {
                l202 = l20;
                c712 = c71;
                b302 = b30;
                interfaceC6440m81A = this.c.a(z71, b302.j(l202.w()), this.d, new C8231sb0(this.a.e(), new K30(this, z71, b302, c712, l202)));
            }
            arrayList.add(interfaceC6440m81A);
            b30 = b302;
            c71 = c712;
            l20 = l202;
        }
        return arrayList;
    }

    public final YS0 f(L20 l20, B30 b30, YS0 ys0) {
        L20 l202;
        C8387t71 c8387t71B;
        if (ys0 == null || (c8387t71B = ys0.M0()) == null) {
            l202 = l20;
            c8387t71B = AbstractC8666u71.b(new C3466ba0(this.a, l202, false, 4, null));
        } else {
            l202 = l20;
        }
        C8387t71 c8387t71 = c8387t71B;
        C71 c71G = g(l202, b30);
        if (c71G == null) {
            return null;
        }
        boolean zJ = j(b30);
        return (G10.c(ys0 != null ? ys0.N0() : null, c71G) && !l202.w() && zJ) ? ys0.R0(true) : M80.k(c8387t71, c71G, c(l202, b30, c71G), zJ, null, 16, null);
    }

    public final C71 g(L20 l20, B30 b30) {
        C71 c71K;
        K20 k20J = l20.j();
        if (k20J == null) {
            return h(l20);
        }
        if (!(k20J instanceof C20)) {
            if (k20J instanceof G30) {
                Z71 z71A = this.b.a((G30) k20J);
                if (z71A != null) {
                    return z71A.k();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + k20J);
        }
        C20 c20 = (C20) k20J;
        AP apD = c20.d();
        if (apD != null) {
            InterfaceC4923gl interfaceC4923glK = k(l20, b30, apD);
            if (interfaceC4923glK == null) {
                interfaceC4923glK = this.a.a().n().a(c20);
            }
            return (interfaceC4923glK == null || (c71K = interfaceC4923glK.k()) == null) ? h(l20) : c71K;
        }
        throw new AssertionError("Class type should have a FQ name: " + k20J);
    }

    public final C71 h(L20 l20) {
        C71 c71K = this.a.a().b().f().r().d(C6607ml.d.c(new AP(l20.x())), AbstractC1496Lm.e(0)).k();
        G10.f(c71K, "getTypeConstructor(...)");
        return c71K;
    }

    public final boolean i(EnumC1042Hc1 enumC1042Hc1, Z71 z71) {
        return (z71.o() == EnumC1042Hc1.F || enumC1042Hc1 == z71.o()) ? false : true;
    }

    public final boolean j(B30 b30) {
        return (b30.g() == F30.D || b30.h() || b30.b() == C81.B) ? false : true;
    }

    public final InterfaceC4923gl k(L20 l20, B30 b30, AP ap) {
        if (b30.h() && G10.c(ap, M30.a)) {
            return this.a.a().p().d();
        }
        C9768y30 c9768y30 = C9768y30.a;
        InterfaceC4923gl interfaceC4923glF = C9768y30.f(c9768y30, ap, this.a.d().p(), null, 4, null);
        if (interfaceC4923glF == null) {
            return null;
        }
        return (c9768y30.d(interfaceC4923glF) && (b30.g() == F30.D || b30.b() == C81.B || b(l20, interfaceC4923glF))) ? c9768y30.b(interfaceC4923glF) : interfaceC4923glF;
    }

    public final I80 l(A20 a20, B30 b30, boolean z) {
        G10.g(a20, "arrayType");
        G10.g(b30, "attr");
        InterfaceC10047z30 interfaceC10047z30O = a20.o();
        InterfaceC5847k30 interfaceC5847k30 = interfaceC10047z30O instanceof InterfaceC5847k30 ? (InterfaceC5847k30) interfaceC10047z30O : null;
        EnumC8067rz0 type = interfaceC5847k30 != null ? interfaceC5847k30.getType() : null;
        C3466ba0 c3466ba0 = new C3466ba0(this.a, a20, true);
        if (type != null) {
            YS0 ys0O = this.a.d().p().O(type);
            G10.d(ys0O);
            I80 i80C = H81.C(ys0O, new C7464pp(ys0O.getAnnotations(), c3466ba0));
            G10.e(i80C, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            YS0 ys0 = (YS0) i80C;
            return b30.h() ? ys0 : M80.e(ys0, ys0.R0(true));
        }
        I80 i80P = p(interfaceC10047z30O, C30.b(C81.C, b30.h(), false, null, 6, null));
        if (b30.h()) {
            YS0 ys0M = this.a.d().p().m(z ? EnumC1042Hc1.H : EnumC1042Hc1.F, i80P, c3466ba0);
            G10.f(ys0M, "getArrayType(...)");
            return ys0M;
        }
        YS0 ys0M2 = this.a.d().p().m(EnumC1042Hc1.F, i80P, c3466ba0);
        G10.f(ys0M2, "getArrayType(...)");
        return M80.e(ys0M2, this.a.d().p().m(EnumC1042Hc1.H, i80P, c3466ba0).R0(true));
    }

    public final I80 n(L20 l20, B30 b30) {
        boolean z = (b30.h() || b30.b() == C81.B) ? false : true;
        boolean zW = l20.w();
        if (!zW && !z) {
            YS0 ys0F = f(l20, b30, null);
            return ys0F != null ? ys0F : o(l20);
        }
        YS0 ys0F2 = f(l20, b30.l(F30.D), null);
        if (ys0F2 == null) {
            return o(l20);
        }
        YS0 ys0F3 = f(l20, b30.l(F30.C), ys0F2);
        return ys0F3 == null ? o(l20) : zW ? new DE0(ys0F2, ys0F3) : M80.e(ys0F2, ys0F3);
    }

    public final I80 p(InterfaceC10047z30 interfaceC10047z30, B30 b30) {
        I80 i80P;
        G10.g(b30, "attr");
        if (interfaceC10047z30 instanceof InterfaceC5847k30) {
            EnumC8067rz0 type = ((InterfaceC5847k30) interfaceC10047z30).getType();
            YS0 ys0R = type != null ? this.a.d().p().R(type) : this.a.d().p().Z();
            G10.d(ys0R);
            return ys0R;
        }
        if (interfaceC10047z30 instanceof L20) {
            return n((L20) interfaceC10047z30, b30);
        }
        if (interfaceC10047z30 instanceof A20) {
            return m(this, (A20) interfaceC10047z30, b30, false, 4, null);
        }
        if (interfaceC10047z30 instanceof S30) {
            InterfaceC10047z30 interfaceC10047z30B = ((S30) interfaceC10047z30).B();
            if (interfaceC10047z30B != null && (i80P = p(interfaceC10047z30B, b30)) != null) {
                return i80P;
            }
            YS0 ys0Y = this.a.d().p().y();
            G10.f(ys0Y, "getDefaultBound(...)");
            return ys0Y;
        }
        if (interfaceC10047z30 == null) {
            YS0 ys0Y2 = this.a.d().p().y();
            G10.f(ys0Y2, "getDefaultBound(...)");
            return ys0Y2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + interfaceC10047z30);
    }

    public final InterfaceC6440m81 q(InterfaceC10047z30 interfaceC10047z30, B30 b30, Z71 z71) {
        if (!(interfaceC10047z30 instanceof S30)) {
            return new C6998o81(EnumC1042Hc1.F, p(interfaceC10047z30, b30));
        }
        S30 s30 = (S30) interfaceC10047z30;
        InterfaceC10047z30 interfaceC10047z30B = s30.B();
        EnumC1042Hc1 enumC1042Hc1 = s30.J() ? EnumC1042Hc1.H : EnumC1042Hc1.G;
        if (interfaceC10047z30B == null || i(enumC1042Hc1, z71)) {
            InterfaceC6440m81 interfaceC6440m81T = D81.t(z71, b30);
            G10.f(interfaceC6440m81T, "makeStarProjection(...)");
            return interfaceC6440m81T;
        }
        O7 o7A = AbstractC1142Ib1.a(this.a, s30);
        I80 i80P = p(interfaceC10047z30B, C30.b(C81.C, false, false, null, 7, null));
        if (o7A != null) {
            i80P = H81.C(i80P, InterfaceC3072a8.b.a(AbstractC2455Um.y0(i80P.getAnnotations(), o7A)));
        }
        return H81.k(i80P, enumC1042Hc1, z71);
    }
}
