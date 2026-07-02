package com.daaw;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.qg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7700qg1 {
    public final WeakReference a;
    public final int b;
    public ClassLoader c;

    public C7700qg1(ClassLoader classLoader) {
        G10.g(classLoader, "classLoader");
        this.a = new WeakReference(classLoader);
        this.b = System.identityHashCode(classLoader);
        this.c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7700qg1) && this.a.get() == ((C7700qg1) obj).a.get();
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
