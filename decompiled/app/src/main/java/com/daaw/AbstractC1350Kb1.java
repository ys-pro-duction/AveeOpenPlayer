package com.daaw;

/* JADX INFO: renamed from: com.daaw.Kb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1350Kb1 {
    public static final int a(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final InterfaceC4969gu0 b() {
        return RT0.D.a();
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i) {
        return (i - 1) & (-32);
    }
}
