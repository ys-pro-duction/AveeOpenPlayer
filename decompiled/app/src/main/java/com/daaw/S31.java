package com.daaw;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class S31 {
    public final SparseArray a = new SparseArray();

    public R31 a(int i) {
        R31 r31 = (R31) this.a.get(i);
        if (r31 != null) {
            return r31;
        }
        R31 r312 = new R31(Long.MAX_VALUE);
        this.a.put(i, r312);
        return r312;
    }

    public void b() {
        this.a.clear();
    }
}
