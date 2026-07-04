package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.b61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3343b61 {
    public static final int f(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] g(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC5152hb.k(objArr, objArr2, 0, 0, i, 6, null);
        AbstractC5152hb.h(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC5152hb.k(objArr, objArr2, 0, 0, i, 6, null);
        AbstractC5152hb.h(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC5152hb.k(objArr, objArr2, 0, 0, i, 6, null);
        AbstractC5152hb.h(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i, int i2, X51 x51) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC5152hb.k(objArr, objArr2, 0, 0, i, 6, null);
        AbstractC5152hb.h(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = x51;
        AbstractC5152hb.h(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    public static final Object[] k(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        AbstractC5152hb.h(objArrCopyOf, objArrCopyOf, i + 2, i + 1, objArr.length);
        AbstractC5152hb.h(objArrCopyOf, objArrCopyOf, i2 + 2, i2, i);
        objArrCopyOf[i2] = obj;
        objArrCopyOf[i2 + 1] = obj2;
        return objArrCopyOf;
    }
}
