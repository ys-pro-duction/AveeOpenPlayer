package com.daaw;

import com.daaw.AbstractC5347iG0;
import com.daaw.AbstractC5674jS;
import com.daaw.AbstractC7823r60;
import com.daaw.C9514x80;
import com.daaw.FI0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.daaw.g60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4745g60 extends AbstractC7823r60 implements J50, InterfaceC5862k60, A70 {
    public final Class E;
    public final O90 F;

    /* JADX INFO: renamed from: com.daaw.g60$a */
    public final class a extends AbstractC7823r60.b {
        public static final /* synthetic */ W60[] w = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        public final AbstractC5347iG0.a d;
        public final AbstractC5347iG0.a e;
        public final AbstractC5347iG0.a f;
        public final AbstractC5347iG0.a g;
        public final AbstractC5347iG0.a h;
        public final AbstractC5347iG0.a i;
        public final O90 j;
        public final AbstractC5347iG0.a k;
        public final AbstractC5347iG0.a l;
        public final AbstractC5347iG0.a m;
        public final AbstractC5347iG0.a n;
        public final AbstractC5347iG0.a o;
        public final AbstractC5347iG0.a p;
        public final AbstractC5347iG0.a q;
        public final AbstractC5347iG0.a r;
        public final AbstractC5347iG0.a s;
        public final AbstractC5347iG0.a t;
        public final AbstractC5347iG0.a u;

        public a() {
            super();
            this.d = AbstractC5347iG0.b(new M50(C4745g60.this));
            this.e = AbstractC5347iG0.b(new X50(this));
            this.f = AbstractC5347iG0.b(new Y50(C4745g60.this, this));
            this.g = AbstractC5347iG0.b(new Z50(C4745g60.this));
            this.h = AbstractC5347iG0.b(new C3063a60(C4745g60.this));
            this.i = AbstractC5347iG0.b(new C3342b60(this));
            this.j = AbstractC3192ab0.b(EnumC7395pb0.C, new C3620c60(this, C4745g60.this));
            this.k = AbstractC5347iG0.b(new C3899d60(this, C4745g60.this));
            this.l = AbstractC5347iG0.b(new C4177e60(this, C4745g60.this));
            this.m = AbstractC5347iG0.b(new C4456f60(this));
            this.n = AbstractC5347iG0.b(new N50(C4745g60.this));
            this.o = AbstractC5347iG0.b(new O50(C4745g60.this));
            this.p = AbstractC5347iG0.b(new P50(C4745g60.this));
            this.q = AbstractC5347iG0.b(new Q50(C4745g60.this));
            this.r = AbstractC5347iG0.b(new R50(this));
            this.s = AbstractC5347iG0.b(new S50(this));
            this.t = AbstractC5347iG0.b(new T50(this));
            this.u = AbstractC5347iG0.b(new U50(this));
        }

        public static final List A(a aVar) {
            G10.g(aVar, "this$0");
            return AbstractC8511tb1.e(aVar.L());
        }

        public static final List C(C4745g60 c4745g60) {
            G10.g(c4745g60, "this$0");
            Collection collectionF = c4745g60.F();
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collectionF, 10));
            Iterator it = collectionF.iterator();
            while (it.hasNext()) {
                arrayList.add(new C9504x60(c4745g60, (InterfaceC7195or) it.next()));
            }
            return arrayList;
        }

        public static final List D(a aVar) {
            G10.g(aVar, "this$0");
            return AbstractC2455Um.z0(aVar.J(), aVar.K());
        }

        public static final Collection E(C4745g60 c4745g60) {
            G10.g(c4745g60, "this$0");
            return c4745g60.I(c4745g60.Z(), AbstractC7823r60.d.B);
        }

        public static final Collection F(C4745g60 c4745g60) {
            G10.g(c4745g60, "this$0");
            return c4745g60.I(c4745g60.a0(), AbstractC7823r60.d.B);
        }

        public static final InterfaceC4923gl G(C4745g60 c4745g60) {
            G10.g(c4745g60, "this$0");
            C6607ml c6607mlW = c4745g60.W();
            C9006vK0 c9006vK0B = ((a) c4745g60.X().getValue()).b();
            InterfaceC4923gl interfaceC4923glB = (c6607mlW.i() && c4745g60.b().isAnnotationPresent(Metadata.class)) ? c9006vK0B.a().b(c6607mlW) : AbstractC5366iL.b(c9006vK0B.b(), c6607mlW);
            return interfaceC4923glB == null ? c4745g60.U(c6607mlW, c9006vK0B) : interfaceC4923glB;
        }

        public static final Collection Q(C4745g60 c4745g60) {
            G10.g(c4745g60, "this$0");
            return c4745g60.I(c4745g60.Z(), AbstractC7823r60.d.C);
        }

        public static final Collection R(C4745g60 c4745g60) {
            G10.g(c4745g60, "this$0");
            return c4745g60.I(c4745g60.a0(), AbstractC7823r60.d.C);
        }

        public static final List S(a aVar) {
            G10.g(aVar, "this$0");
            Collection collectionA = FI0.a.a(aVar.L().w0(), null, null, 3, null);
            ArrayList<InterfaceC8612tw> arrayList = new ArrayList();
            for (Object obj : collectionA) {
                if (!AbstractC7006oA.B((InterfaceC8612tw) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC8612tw interfaceC8612tw : arrayList) {
                InterfaceC4923gl interfaceC4923gl = interfaceC8612tw instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612tw : null;
                Class clsQ = interfaceC4923gl != null ? AbstractC8511tb1.q(interfaceC4923gl) : null;
                C4745g60 c4745g60 = clsQ != null ? new C4745g60(clsQ) : null;
                if (c4745g60 != null) {
                    arrayList2.add(c4745g60);
                }
            }
            return arrayList2;
        }

        public static final Object T(a aVar, C4745g60 c4745g60) throws IllegalAccessException {
            G10.g(aVar, "this$0");
            G10.g(c4745g60, "this$1");
            InterfaceC4923gl interfaceC4923glL = aVar.L();
            if (interfaceC4923glL.i() != EnumC6886nl.H) {
                return null;
            }
            Object obj = ((!interfaceC4923glL.x() || AbstractC0772En.a(C0668Dn.a, interfaceC4923glL)) ? c4745g60.b().getDeclaredField("INSTANCE") : c4745g60.b().getEnclosingClass().getDeclaredField(interfaceC4923glL.getName().c())).get(null);
            G10.e(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance_delegate$lambda$11");
            return obj;
        }

        public static final String U(C4745g60 c4745g60) {
            G10.g(c4745g60, "this$0");
            if (c4745g60.b().isAnonymousClass()) {
                return null;
            }
            C6607ml c6607mlW = c4745g60.W();
            if (c6607mlW.i()) {
                return null;
            }
            return c6607mlW.a().b();
        }

        public static final List V(a aVar) {
            G10.g(aVar, "this$0");
            Collection<InterfaceC4923gl> collectionH = aVar.L().H();
            G10.f(collectionH, "getSealedSubclasses(...)");
            ArrayList arrayList = new ArrayList();
            for (InterfaceC4923gl interfaceC4923gl : collectionH) {
                G10.e(interfaceC4923gl, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class clsQ = AbstractC8511tb1.q(interfaceC4923gl);
                C4745g60 c4745g60 = clsQ != null ? new C4745g60(clsQ) : null;
                if (c4745g60 != null) {
                    arrayList.add(c4745g60);
                }
            }
            return arrayList;
        }

        public static final String W(C4745g60 c4745g60, a aVar) {
            G10.g(c4745g60, "this$0");
            G10.g(aVar, "this$1");
            if (c4745g60.b().isAnonymousClass()) {
                return null;
            }
            C6607ml c6607mlW = c4745g60.W();
            if (c6607mlW.i()) {
                return aVar.B(c4745g60.b());
            }
            String strC = c6607mlW.h().c();
            G10.f(strC, "asString(...)");
            return strC;
        }

        public static final List X(a aVar, C4745g60 c4745g60) {
            G10.g(aVar, "this$0");
            G10.g(c4745g60, "this$1");
            Collection<I80> collectionB = aVar.L().k().b();
            G10.f(collectionB, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(collectionB.size());
            for (I80 i80 : collectionB) {
                G10.d(i80);
                arrayList.add(new C9230w70(i80, new V50(i80, aVar, c4745g60)));
            }
            if (!AbstractC8670u80.u0(aVar.L())) {
                if (arrayList.isEmpty()) {
                    YS0 ys0I = AbstractC8400tA.m(aVar.L()).i();
                    G10.f(ys0I, "getAnyType(...)");
                    arrayList.add(new C9230w70(ys0I, W50.B));
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        EnumC6886nl enumC6886nlI = AbstractC7006oA.e(((C9230w70) it.next()).w()).i();
                        G10.f(enumC6886nlI, "getKind(...)");
                        if (enumC6886nlI != EnumC6886nl.D && enumC6886nlI != EnumC6886nl.G) {
                            break;
                        }
                    }
                    YS0 ys0I2 = AbstractC8400tA.m(aVar.L()).i();
                    G10.f(ys0I2, "getAnyType(...)");
                    arrayList.add(new C9230w70(ys0I2, W50.B));
                }
            }
            return AbstractC1392Km.c(arrayList);
        }

        public static final Type Y(I80 i80, a aVar, C4745g60 c4745g60) {
            G10.g(aVar, "this$0");
            G10.g(c4745g60, "this$1");
            InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
            if (!(interfaceC10240zlC instanceof InterfaceC4923gl)) {
                throw new E80("Supertype not a class: " + interfaceC10240zlC);
            }
            Class clsQ = AbstractC8511tb1.q((InterfaceC4923gl) interfaceC10240zlC);
            if (clsQ == null) {
                throw new E80("Unsupported superclass of " + aVar + ": " + interfaceC10240zlC);
            }
            if (G10.c(c4745g60.b().getSuperclass(), clsQ)) {
                Type genericSuperclass = c4745g60.b().getGenericSuperclass();
                G10.d(genericSuperclass);
                return genericSuperclass;
            }
            Class<?>[] interfaces = c4745g60.b().getInterfaces();
            G10.f(interfaces, "getInterfaces(...)");
            int iL = AbstractC5431ib.L(interfaces, clsQ);
            if (iL >= 0) {
                Type type = c4745g60.b().getGenericInterfaces()[iL];
                G10.d(type);
                return type;
            }
            throw new E80("No superclass of " + aVar + " in Java reflection for " + interfaceC10240zlC);
        }

        public static final Type Z() {
            return Object.class;
        }

        public static final List a0(a aVar, C4745g60 c4745g60) {
            G10.g(aVar, "this$0");
            G10.g(c4745g60, "this$1");
            List listV = aVar.L().v();
            G10.f(listV, "getDeclaredTypeParameters(...)");
            List<Z71> list = listV;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
            for (Z71 z71 : list) {
                G10.d(z71);
                arrayList.add(new C10067z70(c4745g60, z71));
            }
            return arrayList;
        }

        public static final List x(a aVar) {
            G10.g(aVar, "this$0");
            return AbstractC2455Um.z0(aVar.H(), aVar.I());
        }

        public static final List y(a aVar) {
            G10.g(aVar, "this$0");
            return AbstractC2455Um.z0(aVar.J(), aVar.M());
        }

        public static final List z(a aVar) {
            G10.g(aVar, "this$0");
            return AbstractC2455Um.z0(aVar.K(), aVar.N());
        }

        public final String B(Class cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                G10.d(simpleName);
                return BY0.r0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                G10.d(simpleName);
                return BY0.q0(simpleName, '$', null, 2, null);
            }
            G10.d(simpleName);
            return BY0.r0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final Collection H() {
            Object objC = this.r.c(this, w[13]);
            G10.f(objC, "getValue(...)");
            return (Collection) objC;
        }

        public final Collection I() {
            Object objC = this.s.c(this, w[14]);
            G10.f(objC, "getValue(...)");
            return (Collection) objC;
        }

        public final Collection J() {
            Object objC = this.n.c(this, w[9]);
            G10.f(objC, "getValue(...)");
            return (Collection) objC;
        }

        public final Collection K() {
            Object objC = this.o.c(this, w[10]);
            G10.f(objC, "getValue(...)");
            return (Collection) objC;
        }

        public final InterfaceC4923gl L() {
            Object objC = this.d.c(this, w[0]);
            G10.f(objC, "getValue(...)");
            return (InterfaceC4923gl) objC;
        }

        public final Collection M() {
            Object objC = this.p.c(this, w[11]);
            G10.f(objC, "getValue(...)");
            return (Collection) objC;
        }

        public final Collection N() {
            Object objC = this.q.c(this, w[12]);
            G10.f(objC, "getValue(...)");
            return (Collection) objC;
        }

        public final String O() {
            return (String) this.g.c(this, w[3]);
        }

        public final String P() {
            return (String) this.f.c(this, w[2]);
        }
    }

    /* JADX INFO: renamed from: com.daaw.g60$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C9514x80.a.values().length];
            try {
                iArr[C9514x80.a.G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C9514x80.a.I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C9514x80.a.J.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C9514x80.a.H.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C9514x80.a.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C9514x80.a.F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.g60$c */
    public static final class c extends VS {
        public c(C5761jl c5761jl, InterfaceC10174zX0 interfaceC10174zX0) {
            super(interfaceC10174zX0, c5761jl);
        }

        @Override // com.daaw.VS
        public List j() {
            return AbstractC1599Mm.k();
        }
    }

    /* JADX INFO: renamed from: com.daaw.g60$d */
    public /* synthetic */ class d extends AbstractC9312wR implements InterfaceC3429bR {
        public static final d B = new d();

        public d() {
            super(2);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "loadProperty";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(C3511bj0.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4476fA0 invoke(C3511bj0 c3511bj0, HA0 ha0) {
            G10.g(c3511bj0, "p0");
            G10.g(ha0, "p1");
            return c3511bj0.u(ha0);
        }
    }

    public C4745g60(Class cls) {
        G10.g(cls, "jClass");
        this.E = cls;
        this.F = AbstractC3192ab0.b(EnumC7395pb0.C, new L50(this));
    }

    public static final a V(C4745g60 c4745g60) {
        G10.g(c4745g60, "this$0");
        return c4745g60.new a();
    }

    @Override // com.daaw.AbstractC7823r60
    public Collection F() {
        InterfaceC4923gl interfaceC4923glE = e();
        if (interfaceC4923glE.i() == EnumC6886nl.D || interfaceC4923glE.i() == EnumC6886nl.H) {
            return AbstractC1599Mm.k();
        }
        Collection collectionM = interfaceC4923glE.m();
        G10.f(collectionM, "getConstructors(...)");
        return collectionM;
    }

    @Override // com.daaw.AbstractC7823r60
    public Collection G(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        InterfaceC4346ej0 interfaceC4346ej0Z = Z();
        EnumC5496io0 enumC5496io0 = EnumC5496io0.I;
        return AbstractC2455Um.z0(interfaceC4346ej0Z.c(c2352Tm0, enumC5496io0), a0().c(c2352Tm0, enumC5496io0));
    }

    @Override // com.daaw.AbstractC7823r60
    public InterfaceC4476fA0 H(int i) {
        Class<?> declaringClass;
        if (G10.c(b().getSimpleName(), "DefaultImpls") && (declaringClass = b().getDeclaringClass()) != null && declaringClass.isInterface()) {
            J50 j50E = X40.e(declaringClass);
            G10.e(j50E, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((C4745g60) j50E).H(i);
        }
        InterfaceC4923gl interfaceC4923glE = e();
        QA qa = interfaceC4923glE instanceof QA ? (QA) interfaceC4923glE : null;
        if (qa != null) {
            C9245wA0 c9245wA0E1 = qa.e1();
            AbstractC5674jS.f fVar = AbstractC7261p50.j;
            G10.f(fVar, "classLocalVariable");
            HA0 ha0 = (HA0) SA0.b(c9245wA0E1, fVar, i);
            if (ha0 != null) {
                return (InterfaceC4476fA0) AbstractC8511tb1.h(b(), ha0, qa.d1().g(), qa.d1().j(), qa.g1(), d.B);
            }
        }
        return null;
    }

    @Override // com.daaw.AbstractC7823r60
    public Collection K(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        InterfaceC4346ej0 interfaceC4346ej0Z = Z();
        EnumC5496io0 enumC5496io0 = EnumC5496io0.I;
        return AbstractC2455Um.z0(interfaceC4346ej0Z.a(c2352Tm0, enumC5496io0), a0().a(c2352Tm0, enumC5496io0));
    }

    public final InterfaceC4923gl T(C6607ml c6607ml, C9006vK0 c9006vK0) {
        C5761jl c5761jl = new C5761jl(new C7588qG(c9006vK0.b(), c6607ml.f()), c6607ml.h(), EnumC0336Ak0.C, EnumC6886nl.C, AbstractC1496Lm.e(c9006vK0.b().p().h().s()), RU0.a, false, c9006vK0.a().u());
        c5761jl.K0(new c(c5761jl, c9006vK0.a().u()), AbstractC9867yQ0.d(), null);
        return c5761jl;
    }

    public final InterfaceC4923gl U(C6607ml c6607ml, C9006vK0 c9006vK0) {
        C9514x80 c9514x80A;
        if (b().isSynthetic()) {
            return T(c6607ml, c9006vK0);
        }
        C3943dG0 c3943dG0A = C3943dG0.c.a(b());
        C9514x80.a aVarC = (c3943dG0A == null || (c9514x80A = c3943dG0A.a()) == null) ? null : c9514x80A.c();
        switch (aVarC == null ? -1 : b.a[aVarC.ordinal()]) {
            case -1:
            case 6:
                throw new E80("Unresolved class: " + b() + " (kind = " + aVarC + ')');
            case 0:
            default:
                throw new C6902no0();
            case 1:
            case 2:
            case 3:
            case 4:
                return T(c6607ml, c9006vK0);
            case 5:
                throw new E80("Unknown class: " + b() + " (kind = " + aVarC + ')');
        }
    }

    public final C6607ml W() {
        return C9564xK0.a.c(b());
    }

    public final O90 X() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC5862k60
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public InterfaceC4923gl e() {
        return ((a) this.F.getValue()).L();
    }

    public final InterfaceC4346ej0 Z() {
        return e().s().q();
    }

    public final InterfaceC4346ej0 a0() {
        InterfaceC4346ej0 interfaceC4346ej0O = e().O();
        G10.f(interfaceC4346ej0O, "getStaticScope(...)");
        return interfaceC4346ej0O;
    }

    @Override // com.daaw.InterfaceC2967Zk
    public Class b() {
        return this.E;
    }

    @Override // com.daaw.J50
    public String d() {
        return ((a) this.F.getValue()).O();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4745g60) && G10.c(X40.c(this), X40.c((J50) obj));
    }

    @Override // com.daaw.J50
    public String h() {
        return ((a) this.F.getValue()).P();
    }

    @Override // com.daaw.J50
    public int hashCode() {
        return X40.c(this).hashCode();
    }

    @Override // com.daaw.J50
    public boolean l(Object obj) {
        Integer numG = AbstractC9544xF0.g(b());
        if (numG != null) {
            return V71.k(obj, numG.intValue());
        }
        Class clsK = AbstractC9544xF0.k(b());
        if (clsK == null) {
            clsK = b();
        }
        return clsK.isInstance(obj);
    }

    @Override // com.daaw.J50
    public boolean n() {
        return e().n();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        C6607ml c6607mlW = W();
        AP apF = c6607mlW.f();
        if (apF.d()) {
            str = "";
        } else {
            str = apF.b() + '.';
        }
        String strB = c6607mlW.g().b();
        G10.f(strB, "asString(...)");
        sb.append(str + AY0.r(strB, '.', '$', false, 4, null));
        return sb.toString();
    }
}
