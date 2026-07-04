package com.daaw;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DP2 {
    public static final DP2 a = new AP2();
    public static final DP2 b = new BP2(-1);
    public static final DP2 c = new BP2(1);

    public /* synthetic */ DP2(CP2 cp2) {
    }

    public static DP2 i() {
        return a;
    }

    public abstract int a();

    public abstract DP2 b(int i, int i2);

    public abstract DP2 c(Object obj, Object obj2, Comparator comparator);

    public abstract DP2 d(boolean z, boolean z2);

    public abstract DP2 e(boolean z, boolean z2);
}
