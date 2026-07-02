package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Y2 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final Void a(String str) {
        G10.g(str, "message");
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void b(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}
