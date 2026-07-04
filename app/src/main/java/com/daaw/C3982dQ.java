package com.daaw;

/* JADX INFO: renamed from: com.daaw.dQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3982dQ extends AbstractC6300lf1 {
    public final String C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3982dQ(androidx.fragment.app.c cVar, String str) {
        super(cVar, "Attempting to reuse fragment " + cVar + " with previous ID " + str);
        G10.g(cVar, "fragment");
        G10.g(str, "previousFragmentId");
        this.C = str;
    }
}
