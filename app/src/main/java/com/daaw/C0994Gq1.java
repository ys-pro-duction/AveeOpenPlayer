package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Gq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0994Gq1 extends AbstractC1202Iq1 {
    public final long b;
    public final List c;
    public final List d;

    public C0994Gq1(int i, long j) {
        super(i);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final C0994Gq1 c(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0994Gq1 c0994Gq1 = (C0994Gq1) this.d.get(i2);
            if (c0994Gq1.a == i) {
                return c0994Gq1;
            }
        }
        return null;
    }

    public final C1098Hq1 d(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1098Hq1 c1098Hq1 = (C1098Hq1) this.c.get(i2);
            if (c1098Hq1.a == i) {
                return c1098Hq1;
            }
        }
        return null;
    }

    public final void e(C0994Gq1 c0994Gq1) {
        this.d.add(c0994Gq1);
    }

    public final void f(C1098Hq1 c1098Hq1) {
        this.c.add(c1098Hq1);
    }

    @Override // com.daaw.AbstractC1202Iq1
    public final String toString() {
        List list = this.c;
        return AbstractC1202Iq1.b(this.a) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
    }
}
