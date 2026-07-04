package com.daaw;

import com.daaw.YV0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.v81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C8957v81 {
    public static final C8957v81 b = g(AbstractC8392t81.b);
    public final AbstractC8392t81 a;

    /* JADX INFO: renamed from: com.daaw.v81$a */
    public static class a implements NQ {
        private static /* synthetic */ void a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(AP ap) {
            if (ap == null) {
                a(0);
            }
            return Boolean.valueOf(!ap.equals(YV0.a.Q));
        }
    }

    /* JADX INFO: renamed from: com.daaw.v81$b */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.v81$c */
    public static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.v81$d */
    public enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public C8957v81(AbstractC8392t81 abstractC8392t81) {
        if (abstractC8392t81 == null) {
            a(7);
        }
        this.a = abstractC8392t81;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8957v81.a(int):void");
    }

    public static void b(int i, InterfaceC6440m81 interfaceC6440m81, AbstractC8392t81 abstractC8392t81) {
        if (i <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(interfaceC6440m81) + "; substitution: " + o(abstractC8392t81));
    }

    public static EnumC1042Hc1 c(EnumC1042Hc1 enumC1042Hc1, InterfaceC6440m81 interfaceC6440m81) {
        if (enumC1042Hc1 == null) {
            a(35);
        }
        if (interfaceC6440m81 == null) {
            a(36);
        }
        if (!interfaceC6440m81.c()) {
            return d(enumC1042Hc1, interfaceC6440m81.b());
        }
        EnumC1042Hc1 enumC1042Hc12 = EnumC1042Hc1.H;
        if (enumC1042Hc12 == null) {
            a(37);
        }
        return enumC1042Hc12;
    }

    public static EnumC1042Hc1 d(EnumC1042Hc1 enumC1042Hc1, EnumC1042Hc1 enumC1042Hc12) {
        if (enumC1042Hc1 == null) {
            a(38);
        }
        if (enumC1042Hc12 == null) {
            a(39);
        }
        EnumC1042Hc1 enumC1042Hc13 = EnumC1042Hc1.F;
        if (enumC1042Hc1 == enumC1042Hc13) {
            if (enumC1042Hc12 == null) {
                a(40);
            }
            return enumC1042Hc12;
        }
        if (enumC1042Hc12 == enumC1042Hc13) {
            if (enumC1042Hc1 == null) {
                a(41);
            }
            return enumC1042Hc1;
        }
        if (enumC1042Hc1 == enumC1042Hc12) {
            if (enumC1042Hc12 == null) {
                a(42);
            }
            return enumC1042Hc12;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + enumC1042Hc1 + "' and projection kind '" + enumC1042Hc12 + "' cannot be combined");
    }

    public static d e(EnumC1042Hc1 enumC1042Hc1, EnumC1042Hc1 enumC1042Hc12) {
        EnumC1042Hc1 enumC1042Hc13 = EnumC1042Hc1.G;
        return (enumC1042Hc1 == enumC1042Hc13 && enumC1042Hc12 == EnumC1042Hc1.H) ? d.OUT_IN_IN_POSITION : (enumC1042Hc1 == EnumC1042Hc1.H && enumC1042Hc12 == enumC1042Hc13) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static C8957v81 f(I80 i80) {
        if (i80 == null) {
            a(6);
        }
        return g(E71.i(i80.N0(), i80.L0()));
    }

    public static C8957v81 g(AbstractC8392t81 abstractC8392t81) {
        if (abstractC8392t81 == null) {
            a(0);
        }
        return new C8957v81(abstractC8392t81);
    }

    public static C8957v81 h(AbstractC8392t81 abstractC8392t81, AbstractC8392t81 abstractC8392t812) {
        if (abstractC8392t81 == null) {
            a(3);
        }
        if (abstractC8392t812 == null) {
            a(4);
        }
        return g(C3926dC.i(abstractC8392t81, abstractC8392t812));
    }

    public static InterfaceC3072a8 i(InterfaceC3072a8 interfaceC3072a8) {
        if (interfaceC3072a8 == null) {
            a(33);
        }
        return !interfaceC3072a8.z(YV0.a.Q) ? interfaceC3072a8 : new C4240eL(interfaceC3072a8, new a());
    }

    public static InterfaceC6440m81 l(I80 i80, InterfaceC6440m81 interfaceC6440m81, Z71 z71, InterfaceC6440m81 interfaceC6440m812) {
        if (i80 == null) {
            a(26);
        }
        if (interfaceC6440m81 == null) {
            a(27);
        }
        if (interfaceC6440m812 == null) {
            a(28);
        }
        if (!i80.getAnnotations().z(YV0.a.Q)) {
            if (interfaceC6440m81 == null) {
                a(29);
            }
            return interfaceC6440m81;
        }
        C71 c71N0 = interfaceC6440m81.getType().N0();
        if (!(c71N0 instanceof C2146Rn0)) {
            return interfaceC6440m81;
        }
        InterfaceC6440m81 interfaceC6440m81E = ((C2146Rn0) c71N0).e();
        EnumC1042Hc1 enumC1042Hc1B = interfaceC6440m81E.b();
        d dVarE = e(interfaceC6440m812.b(), enumC1042Hc1B);
        d dVar = d.OUT_IN_IN_POSITION;
        return dVarE == dVar ? new C6998o81(interfaceC6440m81E.getType()) : (z71 != null && e(z71.o(), enumC1042Hc1B) == dVar) ? new C6998o81(interfaceC6440m81E.getType()) : interfaceC6440m81;
    }

    public static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (AbstractC7038oI.a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public AbstractC8392t81 j() {
        AbstractC8392t81 abstractC8392t81 = this.a;
        if (abstractC8392t81 == null) {
            a(8);
        }
        return abstractC8392t81;
    }

    public boolean k() {
        return this.a.f();
    }

    public C8957v81 m() {
        AbstractC8392t81 abstractC8392t81 = this.a;
        return ((abstractC8392t81 instanceof C8221sZ) && abstractC8392t81.b()) ? new C8957v81(new C8221sZ(((C8221sZ) this.a).j(), ((C8221sZ) this.a).i(), false)) : this;
    }

    public I80 n(I80 i80, EnumC1042Hc1 enumC1042Hc1) {
        if (i80 == null) {
            a(9);
        }
        if (enumC1042Hc1 == null) {
            a(10);
        }
        if (k()) {
            if (i80 == null) {
                a(11);
            }
            return i80;
        }
        try {
            I80 type = u(new C6998o81(enumC1042Hc1, i80), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e) {
            C9830yH c9830yHD = BH.d(AH.e0, e.getMessage());
            if (c9830yHD == null) {
                a(13);
            }
            return c9830yHD;
        }
    }

    public I80 p(I80 i80, EnumC1042Hc1 enumC1042Hc1) {
        if (i80 == null) {
            a(14);
        }
        if (enumC1042Hc1 == null) {
            a(15);
        }
        InterfaceC6440m81 interfaceC6440m81Q = q(new C6998o81(enumC1042Hc1, j().g(i80, enumC1042Hc1)));
        if (interfaceC6440m81Q == null) {
            return null;
        }
        return interfaceC6440m81Q.getType();
    }

    public InterfaceC6440m81 q(InterfaceC6440m81 interfaceC6440m81) {
        if (interfaceC6440m81 == null) {
            a(16);
        }
        InterfaceC6440m81 interfaceC6440m81T = t(interfaceC6440m81);
        return (this.a.a() || this.a.b()) ? AbstractC0435Bj.d(interfaceC6440m81T, this.a.b()) : interfaceC6440m81T;
    }

    public final InterfaceC6440m81 r(InterfaceC6440m81 interfaceC6440m81, int i) {
        I80 type = interfaceC6440m81.getType();
        EnumC1042Hc1 enumC1042Hc1B = interfaceC6440m81.b();
        if (type.N0().c() instanceof Z71) {
            return interfaceC6440m81;
        }
        YS0 ys0B = AbstractC7370pV0.b(type);
        I80 i80P = ys0B != null ? m().p(ys0B, EnumC1042Hc1.F) : null;
        I80 i80B = AbstractC8671u81.b(type, s(type.N0().getParameters(), type.L0(), i), this.a.d(type.getAnnotations()));
        if ((i80B instanceof YS0) && (i80P instanceof YS0)) {
            i80B = AbstractC7370pV0.j((YS0) i80B, (YS0) i80P);
        }
        return new C6998o81(enumC1042Hc1B, i80B);
    }

    public final List s(List list, List list2, int i) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Z71 z71 = (Z71) list.get(i2);
            InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) list2.get(i2);
            InterfaceC6440m81 interfaceC6440m81U = u(interfaceC6440m81, z71, i + 1);
            int i3 = b.a[e(z71.o(), interfaceC6440m81U.b()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                interfaceC6440m81U = D81.s(z71);
            } else if (i3 == 3) {
                EnumC1042Hc1 enumC1042Hc1O = z71.o();
                EnumC1042Hc1 enumC1042Hc1 = EnumC1042Hc1.F;
                if (enumC1042Hc1O != enumC1042Hc1 && !interfaceC6440m81U.c()) {
                    interfaceC6440m81U = new C6998o81(enumC1042Hc1, interfaceC6440m81U.getType());
                }
            }
            if (interfaceC6440m81U != interfaceC6440m81) {
                z = true;
            }
            arrayList.add(interfaceC6440m81U);
        }
        return !z ? list2 : arrayList;
    }

    public InterfaceC6440m81 t(InterfaceC6440m81 interfaceC6440m81) {
        if (interfaceC6440m81 == null) {
            a(17);
        }
        if (k()) {
            return interfaceC6440m81;
        }
        try {
            return u(interfaceC6440m81, null, 0);
        } catch (c unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final InterfaceC6440m81 u(InterfaceC6440m81 interfaceC6440m81, Z71 z71, int i) throws c {
        if (interfaceC6440m81 == null) {
            a(18);
        }
        b(i, interfaceC6440m81, this.a);
        if (!interfaceC6440m81.c()) {
            I80 type = interfaceC6440m81.getType();
            if (type instanceof K81) {
                K81 k81 = (K81) type;
                AbstractC5708ja1 abstractC5708ja1F0 = k81.F0();
                I80 i80F = k81.F();
                InterfaceC6440m81 interfaceC6440m81U = u(new C6998o81(interfaceC6440m81.b(), abstractC5708ja1F0), z71, i + 1);
                return interfaceC6440m81U.c() ? interfaceC6440m81U : new C6998o81(interfaceC6440m81U.b(), L81.d(interfaceC6440m81U.getType().Q0(), p(i80F, interfaceC6440m81.b())));
            }
            if (!XE.a(type) && !(type.Q0() instanceof BE0)) {
                InterfaceC6440m81 interfaceC6440m81E = this.a.e(type);
                InterfaceC6440m81 interfaceC6440m81L = interfaceC6440m81E != null ? l(type, interfaceC6440m81E, z71, interfaceC6440m81) : null;
                EnumC1042Hc1 enumC1042Hc1B = interfaceC6440m81.b();
                if (interfaceC6440m81L == null && ZM.b(type) && !AbstractC8952v71.b(type)) {
                    UM umA = ZM.a(type);
                    int i2 = i + 1;
                    InterfaceC6440m81 interfaceC6440m81U2 = u(new C6998o81(enumC1042Hc1B, umA.V0()), z71, i2);
                    InterfaceC6440m81 interfaceC6440m81U3 = u(new C6998o81(enumC1042Hc1B, umA.W0()), z71, i2);
                    EnumC1042Hc1 enumC1042Hc1B2 = interfaceC6440m81U2.b();
                    if (interfaceC6440m81U2.getType() != umA.V0() || interfaceC6440m81U3.getType() != umA.W0()) {
                        return new C6998o81(enumC1042Hc1B2, M80.e(AbstractC8671u81.a(interfaceC6440m81U2.getType()), AbstractC8671u81.a(interfaceC6440m81U3.getType())));
                    }
                } else if (!AbstractC8670u80.n0(type) && !N80.a(type)) {
                    if (interfaceC6440m81L != null) {
                        d dVarE = e(enumC1042Hc1B, interfaceC6440m81L.b());
                        if (!AbstractC0860Fj.f(type)) {
                            int i3 = b.a[dVarE.ordinal()];
                            if (i3 == 1) {
                                throw new c("Out-projection in in-position");
                            }
                            if (i3 == 2) {
                                return new C6998o81(EnumC1042Hc1.H, type.N0().p().I());
                            }
                        }
                        InterfaceC6377lv interfaceC6377lvA = AbstractC8952v71.a(type);
                        if (interfaceC6440m81L.c()) {
                            return interfaceC6440m81L;
                        }
                        I80 i80U = interfaceC6377lvA != null ? interfaceC6377lvA.U(interfaceC6440m81L.getType()) : D81.q(interfaceC6440m81L.getType(), type.O0());
                        if (!type.getAnnotations().isEmpty()) {
                            i80U = H81.C(i80U, new C7464pp(i80U.getAnnotations(), i(this.a.d(type.getAnnotations()))));
                        }
                        if (dVarE == d.NO_CONFLICT) {
                            enumC1042Hc1B = d(enumC1042Hc1B, interfaceC6440m81L.b());
                        }
                        return new C6998o81(enumC1042Hc1B, i80U);
                    }
                    interfaceC6440m81 = r(interfaceC6440m81, i);
                    if (interfaceC6440m81 == null) {
                        a(25);
                    }
                }
            }
        }
        return interfaceC6440m81;
    }
}
