package com.daaw;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class Bg3 {
    public final C1617Mq1 a;
    public final SparseArray b;

    public Bg3(C1617Mq1 c1617Mq1, SparseArray sparseArray) {
        this.a = c1617Mq1;
        SparseArray sparseArray2 = new SparseArray(c1617Mq1.b());
        for (int i = 0; i < c1617Mq1.b(); i++) {
            int iA = c1617Mq1.a(i);
            C10219zg3 c10219zg3 = (C10219zg3) sparseArray.get(iA);
            c10219zg3.getClass();
            sparseArray2.append(iA, c10219zg3);
        }
        this.b = sparseArray2;
    }

    public final int a(int i) {
        return this.a.a(i);
    }

    public final int b() {
        return this.a.b();
    }

    public final C10219zg3 c(int i) {
        C10219zg3 c10219zg3 = (C10219zg3) this.b.get(i);
        c10219zg3.getClass();
        return c10219zg3;
    }

    public final boolean d(int i) {
        return this.a.c(i);
    }
}
