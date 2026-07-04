package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ic0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5437ic0 {
    public static final Object[] d(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] e(Object[] objArr, int i) {
        G10.g(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i);
        G10.f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final void f(Object[] objArr, int i) {
        G10.g(objArr, "<this>");
        objArr[i] = null;
    }

    public static final void g(Object[] objArr, int i, int i2) {
        G10.g(objArr, "<this>");
        while (i < i2) {
            f(objArr, i);
            i++;
        }
    }

    public static final boolean h(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!G10.c(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final int i(Object[] objArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final String j(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }
}
