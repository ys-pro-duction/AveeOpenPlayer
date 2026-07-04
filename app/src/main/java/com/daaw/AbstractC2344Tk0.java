package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.daaw.Tk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2344Tk0 {
    public static final ConcurrentMap a = new ConcurrentHashMap();

    public static final C9006vK0 a(Class cls) {
        G10.g(cls, "<this>");
        ClassLoader classLoaderJ = AbstractC9544xF0.j(cls);
        C7700qg1 c7700qg1 = new C7700qg1(classLoaderJ);
        ConcurrentMap concurrentMap = a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(c7700qg1);
        if (weakReference != null) {
            C9006vK0 c9006vK0 = (C9006vK0) weakReference.get();
            if (c9006vK0 != null) {
                return c9006vK0;
            }
            concurrentMap.remove(c7700qg1, weakReference);
        }
        C9006vK0 c9006vK0A = C9006vK0.c.a(classLoaderJ);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = a;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(c7700qg1, new WeakReference(c9006vK0A));
                if (weakReference2 == null) {
                    return c9006vK0A;
                }
                C9006vK0 c9006vK02 = (C9006vK0) weakReference2.get();
                if (c9006vK02 != null) {
                    return c9006vK02;
                }
                concurrentMap2.remove(c7700qg1, weakReference2);
            } finally {
                c7700qg1.a(null);
            }
        }
    }
}
