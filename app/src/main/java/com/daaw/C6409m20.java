package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.m20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6409m20 {
    public static final C6409m20 a = new C6409m20();
    public static a b;

    /* JADX INFO: renamed from: com.daaw.m20$a */
    public static final class a {
        public final Method a;
        public final Method b;

        public a(Method method, Method method2) {
            this.a = method;
            this.b = method2;
        }

        public final Method a() {
            return this.b;
        }

        public final Method b() {
            return this.a;
        }
    }

    public final a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final a b(Object obj) {
        a aVar = b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a(obj);
        b = aVarA;
        return aVarA;
    }

    public final Method c(Object obj) throws IllegalAccessException, InvocationTargetException {
        G10.g(obj, "recordComponent");
        Method methodA = b(obj).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(obj, null);
        G10.e(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class d(Object obj) throws IllegalAccessException, InvocationTargetException {
        G10.g(obj, "recordComponent");
        Method methodB = b(obj).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(obj, null);
        G10.e(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
