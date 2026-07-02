package com.daaw;

/* JADX INFO: renamed from: com.daaw.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8950v7 {
    public static final AbstractC8664u7 a(AbstractC8664u7 abstractC8664u7) {
        G10.g(abstractC8664u7, "<this>");
        AbstractC8664u7 abstractC8664u7C = c(abstractC8664u7);
        int iB = abstractC8664u7C.b();
        for (int i = 0; i < iB; i++) {
            abstractC8664u7C.e(i, abstractC8664u7.a(i));
        }
        return abstractC8664u7C;
    }

    public static final void b(AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72) {
        G10.g(abstractC8664u7, "<this>");
        G10.g(abstractC8664u72, "source");
        int iB = abstractC8664u7.b();
        for (int i = 0; i < iB; i++) {
            abstractC8664u7.e(i, abstractC8664u72.a(i));
        }
    }

    public static final AbstractC8664u7 c(AbstractC8664u7 abstractC8664u7) {
        G10.g(abstractC8664u7, "<this>");
        return abstractC8664u7.c();
    }
}
