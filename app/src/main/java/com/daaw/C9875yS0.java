package com.daaw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.yS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9875yS0 {
    public static final C9875yS0 a = new C9875yS0();

    public final String a(Constructor constructor) {
        G10.g(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Iterator itA = AbstractC2093Ra.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            G10.d(cls);
            sb.append(AbstractC9544xF0.f(cls));
        }
        sb.append(")V");
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public final String b(Field field) {
        G10.g(field, "field");
        Class<?> type = field.getType();
        G10.f(type, "getType(...)");
        return AbstractC9544xF0.f(type);
    }

    public final String c(Method method) {
        G10.g(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Iterator itA = AbstractC2093Ra.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            G10.d(cls);
            sb.append(AbstractC9544xF0.f(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        G10.f(returnType, "getReturnType(...)");
        sb.append(AbstractC9544xF0.f(returnType));
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }
}
