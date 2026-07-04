package com.daaw;

import com.daaw.AbstractC4512fJ0;

/* JADX INFO: renamed from: com.daaw.pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7429pi {
    static {
        Object objA;
        try {
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            objA = AbstractC4512fJ0.a(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
            objA = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th));
        }
        if (AbstractC4512fJ0.d(objA)) {
            objA = Boolean.TRUE;
        }
        Object objA2 = AbstractC4512fJ0.a(objA);
        Boolean bool = Boolean.FALSE;
        if (AbstractC4512fJ0.c(objA2)) {
            objA2 = bool;
        }
        ((Boolean) objA2).getClass();
    }

    public static final AbstractC7150oi a(NQ nq) {
        G10.g(nq, "compute");
        return new C3545bq(nq);
    }
}
