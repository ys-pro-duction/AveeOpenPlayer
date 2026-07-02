package com.daaw;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.daaw.Ip1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1198Ip1 {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final C1198Ip1 a(int i) {
        AbstractC6048km2.f(!this.b);
        this.a.append(i, true);
        return this;
    }

    public final C1617Mq1 b() {
        AbstractC6048km2.f(!this.b);
        this.b = true;
        return new C1617Mq1(this.a, null);
    }
}
