package com.daaw;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.daaw.nz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6952nz0 {
    public static final Class a(String str) {
        G10.g(str, "<this>");
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object[] b(Class cls, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        int i2 = 0;
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            G10.f(constructors, "parameterProviderClass.constructors");
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i2 < length) {
                    Constructor<?> constructor2 = constructors[i2];
                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                    G10.f(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 0) {
                        if (z) {
                            break;
                        }
                        constructor = constructor2;
                        z = true;
                    }
                    i2++;
                } else if (!z) {
                }
            }
            constructor = null;
            if (constructor == null) {
                constructor = null;
            } else {
                constructor.setAccessible(true);
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            Object objNewInstance = constructor.newInstance(null);
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            }
            AbstractC6314li0.a(objNewInstance);
            if (i < 0) {
                throw null;
            }
            throw null;
        } catch (F80 unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
