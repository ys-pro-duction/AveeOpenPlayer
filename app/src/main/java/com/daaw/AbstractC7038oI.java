package com.daaw;

/* JADX INFO: renamed from: com.daaw.oI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7038oI {
    public static final boolean a(Throwable th) {
        G10.g(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!G10.c(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable th) throws Throwable {
        G10.g(th, "e");
        throw th;
    }
}
