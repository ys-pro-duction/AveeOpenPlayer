package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ON {
    public static /* synthetic */ void a(PN pn, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        pn.b(z);
    }
}
