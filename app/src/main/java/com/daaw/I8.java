package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I8 {
    public static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static AssertionError b(String str, Throwable th) {
        AssertionError assertionError = new AssertionError(str);
        assertionError.initCause(th);
        return assertionError;
    }
}
