package com.daaw;

import com.daaw.AbstractC4512fJ0;

/* JADX INFO: renamed from: com.daaw.gJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4801gJ0 {
    public static final Object a(Throwable th) {
        G10.g(th, "exception");
        return new AbstractC4512fJ0.b(th);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof AbstractC4512fJ0.b) {
            throw ((AbstractC4512fJ0.b) obj).B;
        }
    }
}
