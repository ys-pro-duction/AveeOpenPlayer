package com.daaw;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: com.daaw.ha1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5149ha1 extends UnsupportedOperationException {
    public final Feature B;

    public C5149ha1(Feature feature) {
        this.B = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.B));
    }
}
