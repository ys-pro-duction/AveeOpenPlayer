package com.daaw;

import com.daaw.C0560Co0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ga0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4869ga0 extends AbstractC5202hl implements F20 {
    public static final a Z = new a(null);
    public static final Set a0 = AbstractC9867yQ0.g("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    public final C0504Ca0 J;
    public final C20 K;
    public final InterfaceC4923gl L;
    public final C0504Ca0 M;
    public final O90 N;
    public final EnumC6886nl O;
    public final EnumC0336Ak0 P;
    public final AbstractC0742Ef1 Q;
    public final boolean R;
    public final b S;
    public final C8226sa0 T;
    public final UN0 U;
    public final MZ V;
    public final C2512Va0 W;
    public final InterfaceC3072a8 X;
    public final InterfaceC0881Fo0 Y;

    /* JADX INFO: renamed from: com.daaw.ga0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.ga0$b */
    public final class b extends AbstractC8628u {
        public final InterfaceC0881Fo0 d;

        public b() {
            super(C4869ga0.this.M.e());
            this.d = C4869ga0.this.M.e().h(new C5148ha0(C4869ga0.this));
        }

        public static final List M(C4869ga0 c4869ga0) {
            G10.g(c4869ga0, "this$0");
            return AbstractC6161l81.g(c4869ga0);
        }

        @Override // com.daaw.AbstractC9961yl, com.daaw.C71
        /* JADX INFO: renamed from: I */
        public InterfaceC4923gl c() {
            return C4869ga0.this;
        }

        public final I80 K() {
            AP apB;
            ArrayList arrayList;
            AP apL = L();
            if (apL == null || apL.d() || !apL.i(YV0.z)) {
                apL = null;
            }
            if (apL == null) {
                apB = MJ.a.b(AbstractC8400tA.o(C4869ga0.this));
                if (apB == null) {
                    return null;
                }
            } else {
                apB = apL;
            }
            InterfaceC4923gl interfaceC4923glB = AbstractC8400tA.B(C4869ga0.this.M.d(), apB, EnumC5496io0.T);
            if (interfaceC4923glB == null) {
                return null;
            }
            int size = interfaceC4923glB.k().getParameters().size();
            List parameters = C4869ga0.this.k().getParameters();
            G10.f(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                List list = parameters;
                arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C6998o81(EnumC1042Hc1.F, ((Z71) it.next()).s()));
                }
            } else {
                if (size2 != 1 || size <= 1 || apL != null) {
                    return null;
                }
                C6998o81 c6998o81 = new C6998o81(EnumC1042Hc1.F, ((Z71) AbstractC2455Um.C0(parameters)).s());
                H00 h00 = new H00(1, size);
                ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(h00, 10));
                Iterator it2 = h00.iterator();
                while (it2.hasNext()) {
                    ((A00) it2).b();
                    arrayList2.add(c6998o81);
                }
                arrayList = arrayList2;
            }
            return M80.h(C8387t71.C.j(), interfaceC4923glB, arrayList);
        }

        public final AP L() {
            String str;
            InterfaceC3072a8 annotations = C4869ga0.this.getAnnotations();
            AP ap = B40.r;
            G10.f(ap, "PURELY_IMPLEMENTS_ANNOTATION");
            O7 o7I = annotations.i(ap);
            if (o7I == null) {
                return null;
            }
            Object objD0 = AbstractC2455Um.D0(o7I.k().values());
            C7103oY0 c7103oY0 = objD0 instanceof C7103oY0 ? (C7103oY0) objD0 : null;
            if (c7103oY0 == null || (str = (String) c7103oY0.b()) == null || !CP.e(str)) {
                return null;
            }
            return new AP(str);
        }

        @Override // com.daaw.C71
        public boolean d() {
            return true;
        }

        @Override // com.daaw.C71
        public List getParameters() {
            return (List) this.d.invoke();
        }

        @Override // com.daaw.W0
        public Collection r() {
            Collection collectionB = C4869ga0.this.S0().b();
            ArrayList arrayList = new ArrayList(collectionB.size());
            ArrayList<InterfaceC10047z30> arrayList2 = new ArrayList(0);
            I80 i80K = K();
            Iterator it = collectionB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                L20 l20 = (L20) it.next();
                I80 i80Q = C4869ga0.this.M.a().r().q(C4869ga0.this.M.g().p(l20, C30.b(C81.B, false, false, null, 7, null)), C4869ga0.this.M);
                if (i80Q.N0().c() instanceof C0560Co0.b) {
                    arrayList2.add(l20);
                }
                if (!G10.c(i80Q.N0(), i80K != null ? i80K.N0() : null) && !AbstractC8670u80.b0(i80Q)) {
                    arrayList.add(i80Q);
                }
            }
            InterfaceC4923gl interfaceC4923gl = C4869ga0.this.L;
            AbstractC1392Km.a(arrayList, interfaceC4923gl != null ? AbstractC0953Gg0.a(interfaceC4923gl, C4869ga0.this).c().p(interfaceC4923gl.s(), EnumC1042Hc1.F) : null);
            AbstractC1392Km.a(arrayList, i80K);
            if (!arrayList2.isEmpty()) {
                InterfaceC8993vH interfaceC8993vHC = C4869ga0.this.M.a().c();
                InterfaceC4923gl interfaceC4923glC = c();
                ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(arrayList2, 10));
                for (InterfaceC10047z30 interfaceC10047z30 : arrayList2) {
                    G10.e(interfaceC10047z30, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((L20) interfaceC10047z30).p());
                }
                interfaceC8993vHC.b(interfaceC4923glC, arrayList3);
            }
            return !arrayList.isEmpty() ? AbstractC2455Um.M0(arrayList) : AbstractC1496Lm.e(C4869ga0.this.M.d().p().i());
        }

        public String toString() {
            String strC = C4869ga0.this.getName().c();
            G10.f(strC, "asString(...)");
            return strC;
        }

        @Override // com.daaw.W0
        public InterfaceC9624xZ0 v() {
            return C4869ga0.this.M.a().v();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ga0$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1188In.a(AbstractC8400tA.o((InterfaceC4923gl) obj).b(), AbstractC8400tA.o((InterfaceC4923gl) obj2).b());
        }
    }

    public /* synthetic */ C4869ga0(C0504Ca0 c0504Ca0, InterfaceC8612tw interfaceC8612tw, C20 c20, InterfaceC4923gl interfaceC4923gl, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c0504Ca0, interfaceC8612tw, c20, (i & 8) != 0 ? null : interfaceC4923gl);
    }

    public static final List Q0(C4869ga0 c4869ga0) {
        G10.g(c4869ga0, "this$0");
        List<G30> typeParameters = c4869ga0.K.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(typeParameters, 10));
        for (G30 g30 : typeParameters) {
            Z71 z71A = c4869ga0.M.f().a(g30);
            if (z71A == null) {
                throw new AssertionError("Parameter " + g30 + " surely belongs to class " + c4869ga0.K + ", so it must be resolved");
            }
            arrayList.add(z71A);
        }
        return arrayList;
    }

    public static final List W0(C4869ga0 c4869ga0) {
        G10.g(c4869ga0, "this$0");
        C6607ml c6607mlN = AbstractC8400tA.n(c4869ga0);
        if (c6607mlN != null) {
            return c4869ga0.J.a().f().a(c6607mlN);
        }
        return null;
    }

    public static final C8226sa0 X0(C4869ga0 c4869ga0, Q80 q80) {
        G10.g(c4869ga0, "this$0");
        G10.g(q80, "it");
        return new C8226sa0(c4869ga0.M, c4869ga0, c4869ga0.K, c4869ga0.L != null, c4869ga0.T);
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
        if (this.P != EnumC0336Ak0.D) {
            return AbstractC1599Mm.k();
        }
        B30 b30B = C30.b(C81.C, false, false, null, 7, null);
        KP0 kp0O = this.K.O();
        ArrayList arrayList = new ArrayList();
        Iterator it = kp0O.iterator();
        while (it.hasNext()) {
            InterfaceC10240zl interfaceC10240zlC = this.M.g().p((L20) it.next(), b30B).N0().c();
            InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
            if (interfaceC4923gl != null) {
                arrayList.add(interfaceC4923gl);
            }
        }
        return AbstractC2455Um.H0(arrayList, new c());
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
        return this.R;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC3241al N() {
        return null;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 O() {
        return this.W;
    }

    public final C4869ga0 P0(InterfaceC6972o30 interfaceC6972o30, InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC6972o30, "javaResolverCache");
        C0504Ca0 c0504Ca0 = this.M;
        C0504Ca0 c0504Ca0M = AbstractC10275zs.m(c0504Ca0, c0504Ca0.a().x(interfaceC6972o30));
        InterfaceC8612tw interfaceC8612twB = b();
        G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
        return new C4869ga0(c0504Ca0M, interfaceC8612twB, this.K, interfaceC4923gl);
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4923gl Q() {
        return null;
    }

    @Override // com.daaw.InterfaceC4923gl
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public List m() {
        return (List) this.T.a1().invoke();
    }

    public final C20 S0() {
        return this.K;
    }

    public final List T0() {
        return (List) this.N.getValue();
    }

    @Override // com.daaw.AbstractC8349t, com.daaw.InterfaceC4923gl
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C8226sa0 C0() {
        InterfaceC4346ej0 interfaceC4346ej0C0 = super.C0();
        G10.e(interfaceC4346ej0C0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C8226sa0) interfaceC4346ej0C0;
    }

    @Override // com.daaw.AbstractC2134Rk0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C8226sa0 U(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return (C8226sa0) this.U.c(q80);
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        return this.X;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0, com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        if (!G10.c(this.Q, AbstractC8679uA.a) || this.K.k() != null) {
            return AbstractC1142Ib1.d(this.Q);
        }
        AbstractC8965vA abstractC8965vA = S20.a;
        G10.d(abstractC8965vA);
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC4923gl
    public EnumC6886nl i() {
        return this.O;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean isInline() {
        return false;
    }

    @Override // com.daaw.InterfaceC10240zl
    public C71 k() {
        return this.S;
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        return this.P;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean n() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + AbstractC8400tA.p(this);
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC0339Al
    public List v() {
        return (List) this.Y.invoke();
    }

    @Override // com.daaw.AbstractC8349t, com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 w0() {
        return this.V;
    }

    @Override // com.daaw.InterfaceC4923gl
    public boolean x() {
        return false;
    }

    @Override // com.daaw.InterfaceC4923gl
    public AbstractC7958rc1 x0() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4869ga0(C0504Ca0 c0504Ca0, InterfaceC8612tw interfaceC8612tw, C20 c20, InterfaceC4923gl interfaceC4923gl) {
        EnumC0336Ak0 enumC0336Ak0A;
        super(c0504Ca0.e(), interfaceC8612tw, c20.getName(), c0504Ca0.a().t().a(c20), false);
        G10.g(c0504Ca0, "outerContext");
        G10.g(interfaceC8612tw, "containingDeclaration");
        G10.g(c20, "jClass");
        this.J = c0504Ca0;
        this.K = c20;
        this.L = interfaceC4923gl;
        C0504Ca0 c0504Ca0F = AbstractC10275zs.f(c0504Ca0, this, c20, 0, 4, null);
        this.M = c0504Ca0F;
        c0504Ca0F.a().h().c(c20, this);
        c20.I();
        this.N = AbstractC3192ab0.a(new C4023da0(this));
        this.O = c20.q() ? EnumC6886nl.G : c20.H() ? EnumC6886nl.D : c20.A() ? EnumC6886nl.E : EnumC6886nl.C;
        if (c20.q() || c20.A()) {
            enumC0336Ak0A = EnumC0336Ak0.C;
        } else {
            enumC0336Ak0A = EnumC0336Ak0.B.a(c20.E(), c20.E() || c20.isAbstract() || c20.H(), !c20.isFinal());
        }
        this.P = enumC0336Ak0A;
        this.Q = c20.getVisibility();
        this.R = (c20.k() == null || c20.g()) ? false : true;
        this.S = new b();
        C8226sa0 c8226sa0 = new C8226sa0(c0504Ca0F, this, c20, interfaceC4923gl != null, null, 16, null);
        this.T = c8226sa0;
        this.U = UN0.e.a(this, c0504Ca0F.e(), c0504Ca0F.a().k().c(), new C4301ea0(this));
        this.V = new MZ(c8226sa0);
        this.W = new C2512Va0(c0504Ca0F, c20, this);
        this.X = AbstractC3744ca0.a(c0504Ca0F, c20);
        this.Y = c0504Ca0F.e().h(new C4590fa0(this));
    }
}
