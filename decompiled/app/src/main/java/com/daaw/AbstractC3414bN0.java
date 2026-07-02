package com.daaw;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.bN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3414bN0 {
    public static final List a = AbstractC1599Mm.n(Application.class, androidx.lifecycle.r.class);
    public static final List b = AbstractC1496Lm.e(androidx.lifecycle.r.class);

    public static final Constructor c(Class cls, List list) {
        G10.g(cls, "modelClass");
        G10.g(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        G10.f(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            G10.f(parameterTypes, "constructor.parameterTypes");
            List listH0 = AbstractC5431ib.h0(parameterTypes);
            if (G10.c(list, listH0)) {
                G10.e(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listH0.size() && listH0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final AbstractC8526te1 d(Class cls, Constructor constructor, Object... objArr) {
        G10.g(cls, "modelClass");
        G10.g(constructor, "constructor");
        G10.g(objArr, "params");
        try {
            return (AbstractC8526te1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
