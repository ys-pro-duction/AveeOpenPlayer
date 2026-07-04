package com.daaw;

import com.daaw.C0525Cf1;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class IF0 extends OF0 implements BF0, UF0, C20 {
    public final Class a;

    public /* synthetic */ class a extends AbstractC9312wR implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "isSynthetic";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(Member.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member member) {
            G10.g(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    public /* synthetic */ class b extends AbstractC9312wR implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "<init>";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(NF0.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final NF0 invoke(Constructor constructor) {
            G10.g(constructor, "p0");
            return new NF0(constructor);
        }
    }

    public /* synthetic */ class c extends AbstractC9312wR implements NQ {
        public static final c B = new c();

        public c() {
            super(1);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "isSynthetic";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(Member.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member member) {
            G10.g(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    public /* synthetic */ class d extends AbstractC9312wR implements NQ {
        public static final d B = new d();

        public d() {
            super(1);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "<init>";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(QF0.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final QF0 invoke(Field field) {
            G10.g(field, "p0");
            return new QF0(field);
        }
    }

    public /* synthetic */ class e extends AbstractC9312wR implements NQ {
        public static final e B = new e();

        public e() {
            super(1);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "<init>";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(TF0.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final TF0 invoke(Method method) {
            G10.g(method, "p0");
            return new TF0(method);
        }
    }

    public IF0(Class cls) {
        G10.g(cls, "klass");
        this.a = cls;
    }

    public static final boolean R(Class cls) {
        String simpleName = cls.getSimpleName();
        G10.f(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    public static final C2352Tm0 S(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!C2352Tm0.n(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return C2352Tm0.l(simpleName);
        }
        return null;
    }

    public static final boolean T(IF0 if0, Method method) {
        G10.g(if0, "this$0");
        if (method.isSynthetic()) {
            return false;
        }
        if (!if0.A()) {
            return true;
        }
        G10.d(method);
        return !if0.d0(method);
    }

    @Override // com.daaw.C20
    public boolean A() {
        return this.a.isEnum();
    }

    @Override // com.daaw.UF0
    public int D() {
        return this.a.getModifiers();
    }

    @Override // com.daaw.C20
    public boolean E() throws IllegalAccessException, InvocationTargetException {
        Boolean boolF = C6688n20.a.f(this.a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @Override // com.daaw.C20
    public boolean H() {
        return this.a.isInterface();
    }

    @Override // com.daaw.C20
    public EnumC2308Tb0 I() {
        return null;
    }

    @Override // com.daaw.C20
    public KP0 O() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArrC = C6688n20.a.c(this.a);
        if (clsArrC != null) {
            ArrayList arrayList = new ArrayList(clsArrC.length);
            for (Class cls : clsArrC) {
                arrayList.add(new MF0(cls));
            }
            KP0 kp0V = AbstractC2455Um.V(arrayList);
            if (kp0V != null) {
                return kp0V;
            }
        }
        return SP0.e();
    }

    @Override // com.daaw.C20
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public List m() {
        Constructor<?>[] declaredConstructors = this.a.getDeclaredConstructors();
        G10.f(declaredConstructors, "getDeclaredConstructors(...)");
        return UP0.A(UP0.t(UP0.o(AbstractC5431ib.z(declaredConstructors), a.B), b.B));
    }

    @Override // com.daaw.BF0
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Class v() {
        return this.a;
    }

    @Override // com.daaw.C20
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public List C() {
        Field[] declaredFields = this.a.getDeclaredFields();
        G10.f(declaredFields, "getDeclaredFields(...)");
        return UP0.A(UP0.t(UP0.o(AbstractC5431ib.z(declaredFields), c.B), d.B));
    }

    @Override // com.daaw.C20
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public List L() {
        Class<?>[] declaredClasses = this.a.getDeclaredClasses();
        G10.f(declaredClasses, "getDeclaredClasses(...)");
        return UP0.A(UP0.u(UP0.o(AbstractC5431ib.z(declaredClasses), FF0.B), GF0.B));
    }

    @Override // com.daaw.C20
    public Collection b() {
        Class cls;
        cls = Object.class;
        if (G10.c(this.a, cls)) {
            return AbstractC1599Mm.k();
        }
        C9608xV0 c9608xV0 = new C9608xV0(2);
        Type genericSuperclass = this.a.getGenericSuperclass();
        c9608xV0.a(genericSuperclass != null ? genericSuperclass : Object.class);
        c9608xV0.b(this.a.getGenericInterfaces());
        List listN = AbstractC1599Mm.n(c9608xV0.d(new Type[c9608xV0.c()]));
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(new MF0((Type) it.next()));
        }
        return arrayList;
    }

    @Override // com.daaw.C20
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public List N() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        G10.f(declaredMethods, "getDeclaredMethods(...)");
        return UP0.A(UP0.t(UP0.n(AbstractC5431ib.z(declaredMethods), new HF0(this)), e.B));
    }

    @Override // com.daaw.C20
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public IF0 k() {
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass != null) {
            return new IF0(declaringClass);
        }
        return null;
    }

    @Override // com.daaw.C20
    public AP d() {
        return AbstractC9544xF0.e(this.a).a();
    }

    public final boolean d0(Method method) {
        String name = method.getName();
        if (G10.c(name, DiagnosticsEntry.Histogram.VALUES_KEY)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            G10.f(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (G10.c(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof IF0) && G10.c(this.a, ((IF0) obj).a);
    }

    @Override // com.daaw.InterfaceC4162e30
    public boolean g() {
        return Modifier.isStatic(D());
    }

    @Override // com.daaw.InterfaceC9205w20
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // com.daaw.InterfaceC4730g30
    public C2352Tm0 getName() {
        if (!this.a.isAnonymousClass()) {
            C2352Tm0 c2352Tm0L = C2352Tm0.l(this.a.getSimpleName());
            G10.d(c2352Tm0L);
            return c2352Tm0L;
        }
        String name = this.a.getName();
        G10.f(name, "getName(...)");
        C2352Tm0 c2352Tm0L2 = C2352Tm0.l(BY0.v0(name, ".", null, 2, null));
        G10.d(c2352Tm0L2);
        return c2352Tm0L2;
    }

    @Override // com.daaw.H30
    public List getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        G10.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ZF0(typeVariable));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC4162e30
    public AbstractC0742Ef1 getVisibility() {
        int iD = D();
        return Modifier.isPublic(iD) ? C0525Cf1.h.c : Modifier.isPrivate(iD) ? C0525Cf1.e.c : Modifier.isProtected(iD) ? Modifier.isStatic(iD) ? R30.c : Q30.c : P30.c;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.daaw.InterfaceC9205w20
    public /* bridge */ /* synthetic */ InterfaceC7525q20 i(AP ap) {
        return i(ap);
    }

    @Override // com.daaw.InterfaceC4162e30
    public boolean isAbstract() {
        return Modifier.isAbstract(D());
    }

    @Override // com.daaw.InterfaceC4162e30
    public boolean isFinal() {
        return Modifier.isFinal(D());
    }

    @Override // com.daaw.C20
    public Collection l() {
        Object[] objArrD = C6688n20.a.d(this.a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new XF0(obj));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC9205w20
    public boolean n() {
        return false;
    }

    @Override // com.daaw.C20
    public boolean q() {
        return this.a.isAnnotation();
    }

    @Override // com.daaw.C20
    public boolean s() throws IllegalAccessException, InvocationTargetException {
        Boolean boolE = C6688n20.a.e(this.a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // com.daaw.C20
    public boolean t() {
        return false;
    }

    public String toString() {
        return IF0.class.getName() + ": " + this.a;
    }

    @Override // com.daaw.BF0, com.daaw.InterfaceC9205w20
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementV = v();
        return (annotatedElementV == null || (declaredAnnotations = annotatedElementV.getDeclaredAnnotations()) == null || (listB = CF0.b(declaredAnnotations)) == null) ? AbstractC1599Mm.k() : listB;
    }

    @Override // com.daaw.BF0, com.daaw.InterfaceC9205w20
    public C9823yF0 i(AP ap) {
        Annotation[] declaredAnnotations;
        G10.g(ap, "fqName");
        AnnotatedElement annotatedElementV = v();
        if (annotatedElementV == null || (declaredAnnotations = annotatedElementV.getDeclaredAnnotations()) == null) {
            return null;
        }
        return CF0.a(declaredAnnotations, ap);
    }
}
