package com.daaw;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.daaw.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4594fb {
    public static final Object[] a(Object[] objArr, int i) {
        G10.g(objArr, "reference");
        Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
        G10.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void b(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
