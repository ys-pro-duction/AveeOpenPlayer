package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class A40 {
    public static final String a(Object obj, String str) {
        G10.g(obj, "obj");
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        C4293eY0 c4293eY0 = C4293eY0.a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        G10.f(str2, "format(format, *args)");
        sb.append(str2);
        return sb.toString();
    }
}
