package com.daaw;

import com.daaw.SO;

/* JADX INFO: loaded from: classes.dex */
public abstract class O5 {
    public static final SO a(SO.a aVar) {
        G10.g(aVar, "<this>");
        return aVar.g();
    }

    public static final int b(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final int c(SO so, int i) {
        G10.g(so, "fontWeight");
        return b(so.compareTo(a(SO.C)) >= 0, PO.f(i, PO.b.a()));
    }
}
