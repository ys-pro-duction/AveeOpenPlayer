package com.daaw;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.daaw.u50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8655u50 {
    public static final C8655u50 a = new C8655u50();

    public final AbstractC8526te1 a(Class cls) throws InvocationTargetException {
        G10.g(cls, "modelClass");
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            G10.f(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (AbstractC8526te1) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
