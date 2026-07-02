package com.daaw;

/* JADX INFO: renamed from: com.daaw.lf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6300lf1 extends RuntimeException {
    public final androidx.fragment.app.c B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6300lf1(androidx.fragment.app.c cVar, String str) {
        super(str);
        G10.g(cVar, "fragment");
        this.B = cVar;
    }

    public final androidx.fragment.app.c a() {
        return this.B;
    }
}
