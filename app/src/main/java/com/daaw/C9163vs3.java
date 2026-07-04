package com.daaw;

/* JADX INFO: renamed from: com.daaw.vs3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9163vs3 {
    public final A62 a;
    public final int[] b;

    public C9163vs3(A62 a62, int[] iArr, int i) {
        if (iArr.length == 0) {
            AbstractC3305ay2.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = a62;
        this.b = iArr;
    }
}
