package com.daaw;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.el0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4356el0 {
    public static final C4356el0 a = new C4356el0();
    public static final a b = new a(null, null, null);
    public static a c;

    /* JADX INFO: renamed from: com.daaw.el0$a */
    public static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    public final a a(AbstractC7409pe abstractC7409pe) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), abstractC7409pe.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC7409pe.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = b;
            c = aVar2;
            return aVar2;
        }
    }

    public final String b(AbstractC7409pe abstractC7409pe) {
        G10.g(abstractC7409pe, "continuation");
        a aVarA = c;
        if (aVarA == null) {
            aVarA = a(abstractC7409pe);
        }
        if (aVarA == b) {
            return null;
        }
        Method method = aVarA.a;
        Object objInvoke = method != null ? method.invoke(abstractC7409pe.getClass(), null) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
