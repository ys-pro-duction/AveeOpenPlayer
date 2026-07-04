package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.p20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7246p20 {
    public static final C7246p20 a = new C7246p20();
    public static a b;

    /* JADX INFO: renamed from: com.daaw.p20$a */
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

    public final a a(Member member) {
        G10.g(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), AbstractC9544xF0.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List b(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodA;
        G10.g(member, "member");
        a aVarA = b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = b;
                if (aVarA == null) {
                    aVarA = a.a(member);
                    b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, null);
        G10.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, null);
            G10.e(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
