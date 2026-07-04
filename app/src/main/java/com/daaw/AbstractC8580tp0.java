package com.daaw;

import j$.util.Objects;

/* JADX INFO: renamed from: com.daaw.tp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8580tp0 {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static Object c(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
