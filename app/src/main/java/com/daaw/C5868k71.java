package com.daaw;

import com.daaw.InterfaceC4346ej0;
import com.daaw.InterfaceC6435m71;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.k71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5868k71 {
    public static final a c = new a(null);
    public static final C5868k71 d = new C5868k71(InterfaceC6435m71.a.a, false);
    public final InterfaceC6435m71 a;
    public final boolean b;

    /* JADX INFO: renamed from: com.daaw.k71$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final void b(int i, InterfaceC5586j71 interfaceC5586j71) {
            if (i <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + interfaceC5586j71.getName());
        }

        public a() {
        }
    }

    public C5868k71(InterfaceC6435m71 interfaceC6435m71, boolean z) {
        G10.g(interfaceC6435m71, "reportStrategy");
        this.a = interfaceC6435m71;
        this.b = z;
    }

    public final void a(InterfaceC3072a8 interfaceC3072a8, InterfaceC3072a8 interfaceC3072a82) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC3072a8.iterator();
        while (it.hasNext()) {
            hashSet.add(((O7) it.next()).d());
        }
        Iterator it2 = interfaceC3072a82.iterator();
        while (it2.hasNext()) {
            O7 o7 = (O7) it2.next();
            if (hashSet.contains(o7.d())) {
                this.a.d(o7);
            }
        }
    }

    public final void b(I80 i80, I80 i802) {
        C8957v81 c8957v81F = C8957v81.f(i802);
        G10.f(c8957v81F, "create(...)");
        int i = 0;
        for (Object obj : i802.L0()) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) obj;
            if (!interfaceC6440m81.c()) {
                I80 type = interfaceC6440m81.getType();
                G10.f(type, "getType(...)");
                if (!H81.g(type)) {
                    InterfaceC6440m81 interfaceC6440m812 = (InterfaceC6440m81) i80.L0().get(i);
                    Z71 z71 = (Z71) i80.N0().getParameters().get(i);
                    if (this.b) {
                        InterfaceC6435m71 interfaceC6435m71 = this.a;
                        I80 type2 = interfaceC6440m812.getType();
                        G10.f(type2, "getType(...)");
                        I80 type3 = interfaceC6440m81.getType();
                        G10.f(type3, "getType(...)");
                        G10.d(z71);
                        interfaceC6435m71.c(c8957v81F, type2, type3, z71);
                    }
                }
            }
            i = i2;
        }
    }

    public final YS0 c(YS0 ys0, C8387t71 c8387t71) {
        return N80.a(ys0) ? ys0 : AbstractC8671u81.f(ys0, null, g(ys0, c8387t71), 1, null);
    }

    public final YS0 d(YS0 ys0, I80 i80) {
        YS0 ys0R = D81.r(ys0, i80.O0());
        G10.f(ys0R, "makeNullableIfNeeded(...)");
        return ys0R;
    }

    public final YS0 e(YS0 ys0, I80 i80) {
        return c(d(ys0, i80), i80.M0());
    }

    public final YS0 f(C6156l71 c6156l71, C8387t71 c8387t71, boolean z) {
        C71 c71K = c6156l71.b().k();
        G10.f(c71K, "getTypeConstructor(...)");
        return M80.m(c8387t71, c71K, c6156l71.a(), z, InterfaceC4346ej0.b.b);
    }

    public final C8387t71 g(I80 i80, C8387t71 c8387t71) {
        return N80.a(i80) ? i80.M0() : c8387t71.w(i80.M0());
    }

    public final YS0 h(C6156l71 c6156l71, C8387t71 c8387t71) {
        G10.g(c6156l71, "typeAliasExpansion");
        G10.g(c8387t71, "attributes");
        return j(c6156l71, c8387t71, false, 0, true);
    }

    public final InterfaceC6440m81 i(InterfaceC6440m81 interfaceC6440m81, C6156l71 c6156l71, int i) {
        AbstractC5708ja1 abstractC5708ja1Q0 = interfaceC6440m81.getType().Q0();
        if (!XE.a(abstractC5708ja1Q0)) {
            YS0 ys0A = AbstractC8671u81.a(abstractC5708ja1Q0);
            if (!N80.a(ys0A) && H81.E(ys0A)) {
                C71 c71N0 = ys0A.N0();
                InterfaceC10240zl interfaceC10240zlC = c71N0.c();
                c71N0.getParameters().size();
                ys0A.L0().size();
                if (!(interfaceC10240zlC instanceof Z71)) {
                    if (!(interfaceC10240zlC instanceof InterfaceC5586j71)) {
                        YS0 ys0L = l(ys0A, c6156l71, i);
                        b(ys0A, ys0L);
                        return new C6998o81(interfaceC6440m81.b(), ys0L);
                    }
                    InterfaceC5586j71 interfaceC5586j71 = (InterfaceC5586j71) interfaceC10240zlC;
                    if (c6156l71.d(interfaceC5586j71)) {
                        this.a.b(interfaceC5586j71);
                        return new C6998o81(EnumC1042Hc1.F, BH.d(AH.T, interfaceC5586j71.getName().toString()));
                    }
                    List listL0 = ys0A.L0();
                    ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listL0, 10));
                    int i2 = 0;
                    for (Object obj : listL0) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC1599Mm.u();
                        }
                        arrayList.add(k((InterfaceC6440m81) obj, c6156l71, (Z71) c71N0.getParameters().get(i2), i + 1));
                        i2 = i3;
                    }
                    YS0 ys0J = j(C6156l71.e.a(c6156l71, interfaceC5586j71, arrayList), ys0A.M0(), ys0A.O0(), i + 1, false);
                    YS0 ys0L2 = l(ys0A, c6156l71, i);
                    if (!XE.a(ys0J)) {
                        ys0J = AbstractC7370pV0.j(ys0J, ys0L2);
                    }
                    return new C6998o81(interfaceC6440m81.b(), ys0J);
                }
            }
        }
        return interfaceC6440m81;
    }

    public final YS0 j(C6156l71 c6156l71, C8387t71 c8387t71, boolean z, int i, boolean z2) {
        InterfaceC6440m81 interfaceC6440m81K = k(new C6998o81(EnumC1042Hc1.F, c6156l71.b().d0()), c6156l71, null, i);
        I80 type = interfaceC6440m81K.getType();
        G10.f(type, "getType(...)");
        YS0 ys0A = AbstractC8671u81.a(type);
        if (N80.a(ys0A)) {
            return ys0A;
        }
        interfaceC6440m81K.b();
        a(ys0A.getAnnotations(), AbstractC4465f8.a(c8387t71));
        YS0 ys0R = D81.r(c(ys0A, c8387t71), z);
        G10.f(ys0R, "let(...)");
        return z2 ? AbstractC7370pV0.j(ys0R, f(c6156l71, c8387t71, z)) : ys0R;
    }

    public final InterfaceC6440m81 k(InterfaceC6440m81 interfaceC6440m81, C6156l71 c6156l71, Z71 z71, int i) {
        EnumC1042Hc1 enumC1042Hc1O;
        EnumC1042Hc1 enumC1042Hc1;
        EnumC1042Hc1 enumC1042Hc12;
        c.b(i, c6156l71.b());
        if (interfaceC6440m81.c()) {
            G10.d(z71);
            InterfaceC6440m81 interfaceC6440m81S = D81.s(z71);
            G10.f(interfaceC6440m81S, "makeStarProjection(...)");
            return interfaceC6440m81S;
        }
        I80 type = interfaceC6440m81.getType();
        G10.f(type, "getType(...)");
        InterfaceC6440m81 interfaceC6440m81C = c6156l71.c(type.N0());
        if (interfaceC6440m81C == null) {
            return i(interfaceC6440m81, c6156l71, i);
        }
        if (interfaceC6440m81C.c()) {
            G10.d(z71);
            InterfaceC6440m81 interfaceC6440m81S2 = D81.s(z71);
            G10.f(interfaceC6440m81S2, "makeStarProjection(...)");
            return interfaceC6440m81S2;
        }
        AbstractC5708ja1 abstractC5708ja1Q0 = interfaceC6440m81C.getType().Q0();
        EnumC1042Hc1 enumC1042Hc1B = interfaceC6440m81C.b();
        G10.f(enumC1042Hc1B, "getProjectionKind(...)");
        EnumC1042Hc1 enumC1042Hc1B2 = interfaceC6440m81.b();
        G10.f(enumC1042Hc1B2, "getProjectionKind(...)");
        if (enumC1042Hc1B2 != enumC1042Hc1B && enumC1042Hc1B2 != (enumC1042Hc12 = EnumC1042Hc1.F)) {
            if (enumC1042Hc1B == enumC1042Hc12) {
                enumC1042Hc1B = enumC1042Hc1B2;
            } else {
                this.a.a(c6156l71.b(), z71, abstractC5708ja1Q0);
            }
        }
        if (z71 == null || (enumC1042Hc1O = z71.o()) == null) {
            enumC1042Hc1O = EnumC1042Hc1.F;
        }
        if (enumC1042Hc1O != enumC1042Hc1B && enumC1042Hc1O != (enumC1042Hc1 = EnumC1042Hc1.F)) {
            if (enumC1042Hc1B == enumC1042Hc1) {
                enumC1042Hc1B = enumC1042Hc1;
            } else {
                this.a.a(c6156l71.b(), z71, abstractC5708ja1Q0);
            }
        }
        a(type.getAnnotations(), abstractC5708ja1Q0.getAnnotations());
        return new C6998o81(enumC1042Hc1B, e(AbstractC8671u81.a(abstractC5708ja1Q0), type));
    }

    public final YS0 l(YS0 ys0, C6156l71 c6156l71, int i) {
        C71 c71N0 = ys0.N0();
        List listL0 = ys0.L0();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listL0, 10));
        int i2 = 0;
        for (Object obj : listL0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC1599Mm.u();
            }
            InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) obj;
            InterfaceC6440m81 interfaceC6440m81K = k(interfaceC6440m81, c6156l71, (Z71) c71N0.getParameters().get(i2), i + 1);
            if (!interfaceC6440m81K.c()) {
                interfaceC6440m81K = new C6998o81(interfaceC6440m81K.b(), D81.q(interfaceC6440m81K.getType(), interfaceC6440m81.getType().O0()));
            }
            arrayList.add(interfaceC6440m81K);
            i2 = i3;
        }
        return AbstractC8671u81.f(ys0, arrayList, null, 2, null);
    }
}
