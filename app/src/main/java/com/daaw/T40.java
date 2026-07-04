package com.daaw;

import com.daaw.AbstractC0587Cv;
import com.daaw.C0789Er0;
import com.daaw.InterfaceC1583Mi;
import com.daaw.InterfaceC4346ej0;
import com.daaw.InterfaceC8468tR;
import com.daaw.J40;
import com.daaw.VT0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class T40 implements Z2, InterfaceC2280Su0 {
    public static final /* synthetic */ W60[] i = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(T40.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(T40.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(T40.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    public final InterfaceC2968Zk0 a;
    public final C9768y30 b;
    public final InterfaceC0881Fo0 c;
    public final I80 d;
    public final InterfaceC0881Fo0 e;
    public final InterfaceC7986ri f;
    public final InterfaceC0881Fo0 g;
    public final InterfaceC5471ij0 h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a B = new a("HIDDEN", 0);
        public static final a C = new a("VISIBLE", 1);
        public static final a D = new a("DEPRECATED_LIST_METHODS", 2);
        public static final a E = new a("NOT_CONSIDERED", 3);
        public static final a F = new a("DROP", 4);
        public static final /* synthetic */ a[] G;
        public static final /* synthetic */ YG H;

        static {
            a[] aVarArrA = a();
            G = aVarArrA;
            H = AbstractC3110aH.a(aVarArrA);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{B, C, D, E, F};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) G.clone();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.C.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public static final class c extends AbstractC2476Ur0 {
        public c(InterfaceC2968Zk0 interfaceC2968Zk0, AP ap) {
            super(interfaceC2968Zk0, ap);
        }

        @Override // com.daaw.InterfaceC2372Tr0
        /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
        public InterfaceC4346ej0.b q() {
            return InterfaceC4346ej0.b.b;
        }
    }

    public static final class d extends AbstractC0587Cv.b {
        public final /* synthetic */ String a;
        public final /* synthetic */ C6748nF0 b;

        public d(String str, C6748nF0 c6748nF0) {
            this.a = str;
            this.b = c6748nF0;
        }

        @Override // com.daaw.AbstractC0587Cv.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC4923gl interfaceC4923gl) {
            G10.g(interfaceC4923gl, "javaClassDescriptor");
            String strA = AbstractC7161ok0.a(C7079oS0.a, interfaceC4923gl, this.a);
            W40 w40 = W40.a;
            if (w40.f().contains(strA)) {
                this.b.B = a.B;
            } else if (w40.i().contains(strA)) {
                this.b.B = a.C;
            } else if (w40.c().contains(strA)) {
                this.b.B = a.D;
            } else if (w40.d().contains(strA)) {
                this.b.B = a.F;
            }
            return this.b.B == null;
        }

        @Override // com.daaw.AbstractC0587Cv.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = (a) this.b.B;
            return aVar == null ? a.E : aVar;
        }
    }

    public T40(InterfaceC2968Zk0 interfaceC2968Zk0, InterfaceC10174zX0 interfaceC10174zX0, LQ lq) {
        G10.g(interfaceC2968Zk0, "moduleDescriptor");
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(lq, "settingsComputation");
        this.a = interfaceC2968Zk0;
        this.b = C9768y30.a;
        this.c = interfaceC10174zX0.h(lq);
        this.d = q(interfaceC10174zX0);
        this.e = interfaceC10174zX0.h(new K40(this, interfaceC10174zX0));
        this.f = interfaceC10174zX0.d();
        this.g = interfaceC10174zX0.h(new L40(this));
        this.h = interfaceC10174zX0.g(new M40(this));
    }

    public static final Iterable B(T40 t40, InterfaceC4923gl interfaceC4923gl) {
        G10.g(t40, "this$0");
        Collection collectionB = interfaceC4923gl.k().b();
        G10.f(collectionB, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            InterfaceC10240zl interfaceC10240zlC = ((I80) it.next()).N0().c();
            InterfaceC4923gl interfaceC4923glZ = null;
            InterfaceC10240zl interfaceC10240zlA = interfaceC10240zlC != null ? interfaceC10240zlC.a() : null;
            InterfaceC4923gl interfaceC4923gl2 = interfaceC10240zlA instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlA : null;
            if (interfaceC4923gl2 != null && (interfaceC4923glZ = t40.z(interfaceC4923gl2)) == null) {
                interfaceC4923glZ = interfaceC4923gl2;
            }
            if (interfaceC4923glZ != null) {
                arrayList.add(interfaceC4923glZ);
            }
        }
        return arrayList;
    }

    public static final Iterable F(InterfaceC1583Mi interfaceC1583Mi) {
        return interfaceC1583Mi.a().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean G(com.daaw.T40 r2, com.daaw.InterfaceC1583Mi r3) {
        /*
            java.lang.String r0 = "this$0"
            com.daaw.G10.g(r2, r0)
            com.daaw.Mi$a r0 = r3.i()
            com.daaw.Mi$a r1 = com.daaw.InterfaceC1583Mi.a.DECLARATION
            if (r0 != r1) goto L22
            com.daaw.y30 r2 = r2.b
            com.daaw.tw r3 = r3.b()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            com.daaw.G10.e(r3, r0)
            com.daaw.gl r3 = (com.daaw.InterfaceC4923gl) r3
            boolean r2 = r2.c(r3)
            if (r2 == 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.T40.G(com.daaw.T40, com.daaw.Mi):java.lang.Boolean");
    }

    public static final InterfaceC3072a8 I(T40 t40) {
        G10.g(t40, "this$0");
        return InterfaceC3072a8.b.a(AbstractC1496Lm.e(Y7.c(t40.a.p(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    public static final YS0 o(T40 t40, InterfaceC10174zX0 interfaceC10174zX0) {
        G10.g(t40, "this$0");
        G10.g(interfaceC10174zX0, "$storageManager");
        return AbstractC5366iL.d(t40.D().a(), F40.d.a(), new C0560Co0(interfaceC10174zX0, t40.D().a())).s();
    }

    public static final I80 r(T40 t40) {
        G10.g(t40, "this$0");
        YS0 ys0I = t40.a.p().i();
        G10.f(ys0I, "getAnyType(...)");
        return ys0I;
    }

    public static final InterfaceC3072a8 s(T40 t40, C0576Cs0 c0576Cs0) {
        G10.g(t40, "this$0");
        G10.g(c0576Cs0, "<destruct>");
        String str = (String) c0576Cs0.a();
        String str2 = (String) c0576Cs0.b();
        return InterfaceC3072a8.b.a(AbstractC1496Lm.e(Y7.b(t40.a.p(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    public static final InterfaceC4923gl u(C4869ga0 c4869ga0, InterfaceC4923gl interfaceC4923gl) {
        G10.g(c4869ga0, "$javaAnalogueDescriptor");
        G10.g(interfaceC4923gl, "$kotlinMutableClassIfContainer");
        InterfaceC6972o30 interfaceC6972o30 = InterfaceC6972o30.a;
        G10.f(interfaceC6972o30, "EMPTY");
        return c4869ga0.P0(interfaceC6972o30, interfaceC4923gl);
    }

    public static final boolean w(InterfaceC7195or interfaceC7195or, C8957v81 c8957v81, InterfaceC7195or interfaceC7195or2) {
        return C0789Er0.x(interfaceC7195or, interfaceC7195or2.c(c8957v81)) == C0789Er0.i.a.OVERRIDABLE;
    }

    public static final Collection x(C2352Tm0 c2352Tm0, InterfaceC4346ej0 interfaceC4346ej0) {
        G10.g(c2352Tm0, "$name");
        G10.g(interfaceC4346ej0, "it");
        return interfaceC4346ej0.c(c2352Tm0, EnumC5496io0.E);
    }

    public final a A(InterfaceC8468tR interfaceC8468tR) {
        InterfaceC8612tw interfaceC8612twB = interfaceC8468tR.b();
        G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objB = AbstractC0587Cv.b(AbstractC1496Lm.e((InterfaceC4923gl) interfaceC8612twB), new S40(this), new d(AbstractC7440pk0.c(interfaceC8468tR, false, false, 3, null), new C6748nF0()));
        G10.f(objB, "dfs(...)");
        return (a) objB;
    }

    public final InterfaceC3072a8 C() {
        return (InterfaceC3072a8) AbstractC9895yX0.a(this.g, this, i[2]);
    }

    public final J40.b D() {
        return (J40.b) AbstractC9895yX0.a(this.c, this, i[0]);
    }

    public final boolean E(IS0 is0, boolean z) {
        InterfaceC8612tw interfaceC8612twB = is0.b();
        G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strC = AbstractC7440pk0.c(is0, false, false, 3, null);
        if (z ^ W40.a.g().contains(AbstractC7161ok0.a(C7079oS0.a, (InterfaceC4923gl) interfaceC8612twB, strC))) {
            return true;
        }
        Boolean boolE = AbstractC0587Cv.e(AbstractC1496Lm.e(is0), Q40.a, new R40(this));
        G10.f(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    public final boolean H(InterfaceC7195or interfaceC7195or, InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC7195or.h().size() != 1) {
            return false;
        }
        List listH = interfaceC7195or.h();
        G10.f(listH, "getValueParameters(...)");
        InterfaceC10240zl interfaceC10240zlC = ((InterfaceC9918yc1) AbstractC2455Um.C0(listH)).getType().N0().c();
        return G10.c(interfaceC10240zlC != null ? AbstractC8400tA.p(interfaceC10240zlC) : null, AbstractC8400tA.p(interfaceC4923gl));
    }

    @Override // com.daaw.Z2
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC4923gl interfaceC4923gl) {
        InterfaceC3072a8 interfaceC3072a8;
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC4923gl, "classDescriptor");
        if (G10.c(c2352Tm0, C6612mm.e.a()) && (interfaceC4923gl instanceof QA) && AbstractC8670u80.d0(interfaceC4923gl)) {
            QA qa = (QA) interfaceC4923gl;
            List listL0 = qa.e1().L0();
            G10.f(listL0, "getFunctionList(...)");
            List list = listL0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (G10.c(AbstractC3252an0.b(qa.d1().g(), ((CA0) it.next()).h0()), C6612mm.e.a())) {
                        return AbstractC1599Mm.k();
                    }
                }
            }
            return AbstractC1496Lm.e(p(qa, (IS0) AbstractC2455Um.B0(v().q().c(c2352Tm0, EnumC5496io0.E))));
        }
        if (!D().b()) {
            return AbstractC1599Mm.k();
        }
        Collection<IS0> collectionT = t(interfaceC4923gl, new O40(c2352Tm0));
        ArrayList arrayList = new ArrayList();
        for (IS0 is0 : collectionT) {
            InterfaceC8612tw interfaceC8612twB = is0.b();
            G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC8468tR interfaceC8468tRC = is0.c(AbstractC0953Gg0.a((InterfaceC4923gl) interfaceC8612twB, interfaceC4923gl).c());
            G10.e(interfaceC8468tRC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC8468tR.a aVarT = ((IS0) interfaceC8468tRC).t();
            aVarT.d(interfaceC4923gl);
            aVarT.n(interfaceC4923gl.J0());
            aVarT.h();
            int i2 = b.a[A(is0).ordinal()];
            IS0 is02 = null;
            if (i2 != 1) {
                if (i2 == 2) {
                    C2352Tm0 name = is0.getName();
                    if (G10.c(name, U40.a)) {
                        interfaceC3072a8 = (InterfaceC3072a8) this.h.invoke(D61.a(is0.getName().c(), "first"));
                    } else {
                        if (!G10.c(name, U40.b)) {
                            throw new IllegalStateException(("Unexpected name: " + is0.getName()).toString());
                        }
                        interfaceC3072a8 = (InterfaceC3072a8) this.h.invoke(D61.a(is0.getName().c(), "last"));
                    }
                    aVarT.r(interfaceC3072a8);
                } else if (i2 == 3) {
                    aVarT.r(C());
                } else if (i2 != 4) {
                    if (i2 != 5) {
                        throw new C6902no0();
                    }
                    G91 g91 = G91.a;
                }
                InterfaceC8468tR interfaceC8468tRA = aVarT.a();
                G10.d(interfaceC8468tRA);
                is02 = (IS0) interfaceC8468tRA;
            } else if (!AbstractC0440Bk0.a(interfaceC4923gl)) {
                aVarT.j();
                InterfaceC8468tR interfaceC8468tRA2 = aVarT.a();
                G10.d(interfaceC8468tRA2);
                is02 = (IS0) interfaceC8468tRA2;
            }
            if (is02 != null) {
                arrayList.add(is02);
            }
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC2280Su0
    public boolean b(InterfaceC4923gl interfaceC4923gl, IS0 is0) {
        G10.g(interfaceC4923gl, "classDescriptor");
        G10.g(is0, "functionDescriptor");
        C4869ga0 c4869ga0Z = z(interfaceC4923gl);
        if (c4869ga0Z == null || !is0.getAnnotations().z(AbstractC2384Tu0.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String strC = AbstractC7440pk0.c(is0, false, false, 3, null);
        C8226sa0 c8226sa0U0 = c4869ga0Z.C0();
        C2352Tm0 name = is0.getName();
        G10.f(name, "getName(...)");
        Collection collectionC = c8226sa0U0.c(name, EnumC5496io0.E);
        if ((collectionC instanceof Collection) && collectionC.isEmpty()) {
            return false;
        }
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            if (G10.c(AbstractC7440pk0.c((IS0) it.next(), false, false, 3, null), strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.Z2
    public Collection d(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "classDescriptor");
        if (interfaceC4923gl.i() != EnumC6886nl.C || !D().b()) {
            return AbstractC1599Mm.k();
        }
        C4869ga0 c4869ga0Z = z(interfaceC4923gl);
        if (c4869ga0Z == null) {
            return AbstractC1599Mm.k();
        }
        InterfaceC4923gl interfaceC4923glF = C9768y30.f(this.b, AbstractC8400tA.o(c4869ga0Z), NJ.h.a(), null, 4, null);
        if (interfaceC4923glF == null) {
            return AbstractC1599Mm.k();
        }
        C8957v81 c8957v81C = AbstractC0953Gg0.a(interfaceC4923glF, c4869ga0Z).c();
        List listR0 = c4869ga0Z.m();
        ArrayList<InterfaceC3241al> arrayList = new ArrayList();
        for (Object obj : listR0) {
            InterfaceC3241al interfaceC3241al = (InterfaceC3241al) obj;
            if (interfaceC3241al.getVisibility().d()) {
                Collection collectionM = interfaceC4923glF.m();
                G10.f(collectionM, "getConstructors(...)");
                Collection<InterfaceC3241al> collection = collectionM;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (InterfaceC3241al interfaceC3241al2 : collection) {
                        G10.d(interfaceC3241al2);
                        if (w(interfaceC3241al2, c8957v81C, interfaceC3241al)) {
                            break;
                        }
                    }
                }
                if (!H(interfaceC3241al, interfaceC4923gl) && !AbstractC8670u80.k0(interfaceC3241al) && !W40.a.e().contains(AbstractC7161ok0.a(C7079oS0.a, c4869ga0Z, AbstractC7440pk0.c(interfaceC3241al, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(arrayList, 10));
        for (InterfaceC3241al interfaceC3241al3 : arrayList) {
            InterfaceC8468tR.a aVarT = interfaceC3241al3.t();
            aVarT.d(interfaceC4923gl);
            aVarT.l(interfaceC4923gl.s());
            aVarT.h();
            aVarT.t(c8957v81C.j());
            if (!W40.a.h().contains(AbstractC7161ok0.a(C7079oS0.a, c4869ga0Z, AbstractC7440pk0.c(interfaceC3241al3, false, false, 3, null)))) {
                aVarT.r(C());
            }
            InterfaceC8468tR interfaceC8468tRA = aVarT.a();
            G10.e(interfaceC8468tRA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((InterfaceC3241al) interfaceC8468tRA);
        }
        return arrayList2;
    }

    @Override // com.daaw.Z2
    public Collection e(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "classDescriptor");
        BP bpP = AbstractC8400tA.p(interfaceC4923gl);
        W40 w40 = W40.a;
        return w40.j(bpP) ? AbstractC1599Mm.n(v(), this.d) : w40.k(bpP) ? AbstractC1496Lm.e(this.d) : AbstractC1599Mm.k();
    }

    public final IS0 p(QA qa, IS0 is0) {
        InterfaceC8468tR.a aVarT = is0.t();
        aVarT.d(qa);
        aVarT.e(AbstractC8679uA.e);
        aVarT.l(qa.s());
        aVarT.n(qa.J0());
        InterfaceC8468tR interfaceC8468tRA = aVarT.a();
        G10.d(interfaceC8468tRA);
        return (IS0) interfaceC8468tRA;
    }

    public final I80 q(InterfaceC10174zX0 interfaceC10174zX0) {
        C5761jl c5761jl = new C5761jl(new c(this.a, new AP("java.io")), C2352Tm0.l("Serializable"), EnumC0336Ak0.F, EnumC6886nl.D, AbstractC1496Lm.e(new C8231sb0(interfaceC10174zX0, new N40(this))), RU0.a, false, interfaceC10174zX0);
        c5761jl.K0(InterfaceC4346ej0.b.b, AbstractC9867yQ0.d(), null);
        YS0 ys0S = c5761jl.s();
        G10.f(ys0S, "getDefaultType(...)");
        return ys0S;
    }

    public final Collection t(InterfaceC4923gl interfaceC4923gl, NQ nq) {
        C4869ga0 c4869ga0Z = z(interfaceC4923gl);
        if (c4869ga0Z == null) {
            return AbstractC1599Mm.k();
        }
        Collection collectionG = this.b.g(AbstractC8400tA.o(c4869ga0Z), NJ.h.a());
        InterfaceC4923gl interfaceC4923gl2 = (InterfaceC4923gl) AbstractC2455Um.q0(collectionG);
        if (interfaceC4923gl2 == null) {
            return AbstractC1599Mm.k();
        }
        VT0.b bVar = VT0.D;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collectionG, 10));
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8400tA.o((InterfaceC4923gl) it.next()));
        }
        VT0 vt0B = bVar.b(arrayList);
        boolean zC = this.b.c(interfaceC4923gl);
        InterfaceC4346ej0 interfaceC4346ej0C0 = ((InterfaceC4923gl) this.f.a(AbstractC8400tA.o(c4869ga0Z), new P40(c4869ga0Z, interfaceC4923gl2))).C0();
        G10.f(interfaceC4346ej0C0, "getUnsubstitutedMemberScope(...)");
        Iterable iterable = (Iterable) nq.invoke(interfaceC4346ej0C0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            IS0 is0 = (IS0) obj;
            if (is0.i() == InterfaceC1583Mi.a.DECLARATION && is0.getVisibility().d() && !AbstractC8670u80.k0(is0)) {
                Collection collectionE = is0.e();
                G10.f(collectionE, "getOverriddenDescriptors(...)");
                Collection collection = collectionE;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        InterfaceC8612tw interfaceC8612twB = ((InterfaceC8468tR) it2.next()).b();
                        G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
                        if (vt0B.contains(AbstractC8400tA.o(interfaceC8612twB))) {
                            break;
                        }
                    }
                }
                if (!E(is0, zC)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    public final YS0 v() {
        return (YS0) AbstractC9895yX0.a(this.e, this, i[1]);
    }

    @Override // com.daaw.Z2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set c(InterfaceC4923gl interfaceC4923gl) {
        C8226sa0 c8226sa0U0;
        Set setB;
        G10.g(interfaceC4923gl, "classDescriptor");
        if (!D().b()) {
            return AbstractC9867yQ0.d();
        }
        C4869ga0 c4869ga0Z = z(interfaceC4923gl);
        return (c4869ga0Z == null || (c8226sa0U0 = c4869ga0Z.C0()) == null || (setB = c8226sa0U0.b()) == null) ? AbstractC9867yQ0.d() : setB;
    }

    public final C4869ga0 z(InterfaceC4923gl interfaceC4923gl) {
        C6607ml c6607mlN;
        AP apA;
        if (AbstractC8670u80.a0(interfaceC4923gl) || !AbstractC8670u80.B0(interfaceC4923gl)) {
            return null;
        }
        BP bpP = AbstractC8400tA.p(interfaceC4923gl);
        if (bpP.f() && (c6607mlN = C9489x30.a.n(bpP)) != null && (apA = c6607mlN.a()) != null) {
            InterfaceC4923gl interfaceC4923glD = AbstractC6727nA.d(D().a(), apA, EnumC5496io0.E);
            if (interfaceC4923glD instanceof C4869ga0) {
                return (C4869ga0) interfaceC4923glD;
            }
        }
        return null;
    }
}
