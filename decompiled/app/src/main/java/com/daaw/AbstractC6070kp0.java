package com.daaw;

/* JADX INFO: renamed from: com.daaw.kp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6070kp0 {
    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public static Object[] b(Object[] objArr, int i) {
        return AbstractC2174Ru0.b(objArr, i);
    }
}
