package com.daaw;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Ru0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2174Ru0 {
    public static Object[] a(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static Object[] b(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }
}
