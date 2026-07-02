package com.daaw;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.zK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10122zK0 {
    public static final CharSequence a(Class cls) {
        G10.d(cls);
        return AbstractC9544xF0.f(cls);
    }

    public static final String d(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        G10.f(parameterTypes, "getParameterTypes(...)");
        sb.append(AbstractC5431ib.P(parameterTypes, "", "(", ")", 0, null, C9843yK0.B, 24, null));
        Class<?> returnType = method.getReturnType();
        G10.f(returnType, "getReturnType(...)");
        sb.append(AbstractC9544xF0.f(returnType));
        return sb.toString();
    }
}
