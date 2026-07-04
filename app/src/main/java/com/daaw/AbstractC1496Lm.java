package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1496Lm {
    public static List a(List list) {
        G10.g(list, "builder");
        return ((C5158hc0) list).M();
    }

    public static final Object[] b(Object[] objArr, boolean z) {
        G10.g(objArr, "<this>");
        if (z && G10.c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        G10.f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new C5158hc0(0, 1, null);
    }

    public static List d(int i) {
        return new C5158hc0(i);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        G10.f(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] f(int i, Object[] objArr) {
        G10.g(objArr, "array");
        if (i < objArr.length) {
            objArr[i] = null;
        }
        return objArr;
    }
}
