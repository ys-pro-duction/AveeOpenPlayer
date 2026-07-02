package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class KF0 {
    public static final Class a(ClassLoader classLoader, String str) {
        G10.g(classLoader, "<this>");
        G10.g(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
