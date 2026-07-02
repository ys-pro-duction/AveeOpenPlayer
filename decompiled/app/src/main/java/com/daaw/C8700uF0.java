package com.daaw;

import com.daaw.C6607ml;
import com.daaw.InterfaceC10072z80;
import com.daaw.YV0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.uF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8700uF0 {
    public static final C8700uF0 a = new C8700uF0();

    public final C7165ol a(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            C6607ml c6607mlE = AbstractC9544xF0.e(cls);
            C6607ml c6607mlM = C9489x30.a.m(c6607mlE.a());
            if (c6607mlM != null) {
                c6607mlE = c6607mlM;
            }
            return new C7165ol(c6607mlE, i);
        }
        if (!G10.c(cls, Void.TYPE)) {
            EnumC8067rz0 enumC8067rz0L = EnumC6703n50.g(cls.getName()).l();
            G10.f(enumC8067rz0L, "getPrimitiveType(...)");
            return i > 0 ? new C7165ol(C6607ml.d.c(enumC8067rz0L.k()), i - 1) : new C7165ol(C6607ml.d.c(enumC8067rz0L.n()), i);
        }
        C6607ml.a aVar = C6607ml.d;
        AP apL = YV0.a.f.l();
        G10.f(apL, "toSafe(...)");
        return new C7165ol(aVar.c(apL), i);
    }

    public final void b(Class cls, InterfaceC10072z80.c cVar) {
        G10.g(cls, "klass");
        G10.g(cVar, "visitor");
        Iterator itA = AbstractC2093Ra.a(cls.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            G10.d(annotation);
            f(cVar, annotation);
        }
        cVar.a();
    }

    public final void c(Class cls, InterfaceC10072z80.d dVar) throws InvocationTargetException {
        Iterator itA = AbstractC2093Ra.a(cls.getDeclaredConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            C2352Tm0 c2352Tm0 = C7091oV0.j;
            C9875yS0 c9875yS0 = C9875yS0.a;
            G10.d(constructor);
            InterfaceC10072z80.e eVarB = dVar.b(c2352Tm0, c9875yS0.a(constructor));
            if (eVarB != null) {
                Iterator itA2 = AbstractC2093Ra.a(constructor.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    G10.d(annotation);
                    f(eVarB, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                G10.d(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i = 0; i < length2; i++) {
                        Iterator itA3 = AbstractC2093Ra.a(parameterAnnotations[i]);
                        while (itA3.hasNext()) {
                            Annotation annotation2 = (Annotation) itA3.next();
                            Class clsB = X40.b(X40.a(annotation2));
                            C6607ml c6607mlE = AbstractC9544xF0.e(clsB);
                            G10.d(annotation2);
                            InterfaceC10072z80.a aVarB = eVarB.b(i + length, c6607mlE, new C8421tF0(annotation2));
                            if (aVarB != null) {
                                a.h(aVarB, annotation2, clsB);
                            }
                        }
                    }
                }
                eVarB.a();
            }
        }
    }

    public final void d(Class cls, InterfaceC10072z80.d dVar) throws InvocationTargetException {
        Iterator itA = AbstractC2093Ra.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            C2352Tm0 c2352Tm0L = C2352Tm0.l(field.getName());
            G10.f(c2352Tm0L, "identifier(...)");
            C9875yS0 c9875yS0 = C9875yS0.a;
            G10.d(field);
            InterfaceC10072z80.c cVarA = dVar.a(c2352Tm0L, c9875yS0.b(field), null);
            if (cVarA != null) {
                Iterator itA2 = AbstractC2093Ra.a(field.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    G10.d(annotation);
                    f(cVarA, annotation);
                }
                cVarA.a();
            }
        }
    }

    public final void e(Class cls, InterfaceC10072z80.d dVar) throws InvocationTargetException {
        Iterator itA = AbstractC2093Ra.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            C2352Tm0 c2352Tm0L = C2352Tm0.l(method.getName());
            G10.f(c2352Tm0L, "identifier(...)");
            C9875yS0 c9875yS0 = C9875yS0.a;
            G10.d(method);
            InterfaceC10072z80.e eVarB = dVar.b(c2352Tm0L, c9875yS0.c(method));
            if (eVarB != null) {
                Iterator itA2 = AbstractC2093Ra.a(method.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    G10.d(annotation);
                    f(eVarB, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                G10.f(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i = 0; i < length; i++) {
                    Iterator itA3 = AbstractC2093Ra.a(annotationArr[i]);
                    while (itA3.hasNext()) {
                        Annotation annotation2 = (Annotation) itA3.next();
                        Class clsB = X40.b(X40.a(annotation2));
                        C6607ml c6607mlE = AbstractC9544xF0.e(clsB);
                        G10.d(annotation2);
                        InterfaceC10072z80.a aVarB = eVarB.b(i, c6607mlE, new C8421tF0(annotation2));
                        if (aVarB != null) {
                            a.h(aVarB, annotation2, clsB);
                        }
                    }
                }
                eVarB.a();
            }
        }
    }

    public final void f(InterfaceC10072z80.c cVar, Annotation annotation) throws InvocationTargetException {
        Class clsB = X40.b(X40.a(annotation));
        InterfaceC10072z80.a aVarC = cVar.c(AbstractC9544xF0.e(clsB), new C8421tF0(annotation));
        if (aVarC != null) {
            a.h(aVarC, annotation, clsB);
        }
    }

    public final void g(InterfaceC10072z80.a aVar, C2352Tm0 c2352Tm0, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (G10.c(enclosingClass, Class.class)) {
            G10.e(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.b(c2352Tm0, a((Class) obj));
            return;
        }
        if (AbstractC4789gG0.a.contains(enclosingClass)) {
            aVar.d(c2352Tm0, obj);
            return;
        }
        if (AbstractC9544xF0.l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            G10.d(enclosingClass);
            C6607ml c6607mlE = AbstractC9544xF0.e(enclosingClass);
            G10.e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            C2352Tm0 c2352Tm0L = C2352Tm0.l(((Enum) obj).name());
            G10.f(c2352Tm0L, "identifier(...)");
            aVar.e(c2352Tm0, c6607mlE, c2352Tm0L);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            G10.f(interfaces, "getInterfaces(...)");
            Class cls = (Class) AbstractC5431ib.V(interfaces);
            G10.d(cls);
            InterfaceC10072z80.a aVarF = aVar.f(c2352Tm0, AbstractC9544xF0.e(cls));
            if (aVarF == null) {
                return;
            }
            G10.e(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(aVarF, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        InterfaceC10072z80.b bVarC = aVar.c(c2352Tm0);
        if (bVarC == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i = 0;
        if (componentType.isEnum()) {
            G10.d(componentType);
            C6607ml c6607mlE2 = AbstractC9544xF0.e(componentType);
            G10.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i < length) {
                Object obj2 = objArr[i];
                G10.e(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                C2352Tm0 c2352Tm0L2 = C2352Tm0.l(((Enum) obj2).name());
                G10.f(c2352Tm0L2, "identifier(...)");
                bVarC.c(c6607mlE2, c2352Tm0L2);
                i++;
            }
        } else if (G10.c(componentType, Class.class)) {
            G10.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i < length2) {
                Object obj3 = objArr2[i];
                G10.e(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarC.e(a((Class) obj3));
                i++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            G10.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i < length3) {
                Object obj4 = objArr3[i];
                G10.d(componentType);
                InterfaceC10072z80.a aVarD = bVarC.d(AbstractC9544xF0.e(componentType));
                if (aVarD != null) {
                    G10.e(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(aVarD, (Annotation) obj4, componentType);
                }
                i++;
            }
        } else {
            G10.e(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i < length4) {
                bVarC.b(objArr4[i]);
                i++;
            }
        }
        bVarC.a();
    }

    public final void h(InterfaceC10072z80.a aVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Iterator itA = AbstractC2093Ra.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                G10.d(objInvoke);
                C2352Tm0 c2352Tm0L = C2352Tm0.l(method.getName());
                G10.f(c2352Tm0L, "identifier(...)");
                g(aVar, c2352Tm0L, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void i(Class cls, InterfaceC10072z80.d dVar) {
        G10.g(cls, "klass");
        G10.g(dVar, "memberVisitor");
        e(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }
}
