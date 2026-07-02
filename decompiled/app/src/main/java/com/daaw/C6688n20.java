package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.n20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6688n20 {
    public static final C6688n20 a = new C6688n20();
    public static a b;

    /* JADX INFO: renamed from: com.daaw.n20$a */
    public static final class a {
        public final Method a;
        public final Method b;
        public final Method c;
        public final Method d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.a = method;
            this.b = method2;
            this.c = method3;
            this.d = method4;
        }

        public final Method a() {
            return this.b;
        }

        public final Method b() {
            return this.d;
        }

        public final Method c() {
            return this.c;
        }

        public final Method d() {
            return this.a;
        }
    }

    public final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    public final a b() {
        a aVar = b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        b = aVarA;
        return aVarA;
    }

    public final Class[] c(Class cls) throws IllegalAccessException, InvocationTargetException {
        G10.g(cls, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(cls, null);
        G10.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class cls) {
        G10.g(cls, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(cls, null);
    }

    public final Boolean e(Class cls) throws IllegalAccessException, InvocationTargetException {
        G10.g(cls, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(cls, null);
        G10.e(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class cls) throws IllegalAccessException, InvocationTargetException {
        G10.g(cls, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(cls, null);
        G10.e(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
