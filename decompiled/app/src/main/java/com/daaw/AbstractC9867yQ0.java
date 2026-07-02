package com.daaw;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.yQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9867yQ0 extends AbstractC9588xQ0 {
    public static Set d() {
        return C8703uG.B;
    }

    public static LinkedHashSet e(Object... objArr) {
        G10.g(objArr, "elements");
        return (LinkedHashSet) AbstractC5431ib.a0(objArr, new LinkedHashSet(AbstractC1369Kg0.d(objArr.length)));
    }

    public static final Set f(Set set) {
        G10.g(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : AbstractC9588xQ0.c(set.iterator().next()) : d();
    }

    public static Set g(Object... objArr) {
        G10.g(objArr, "elements");
        return AbstractC5431ib.t0(objArr);
    }
}
