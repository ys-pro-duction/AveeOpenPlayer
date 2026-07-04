package com.daaw;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.daaw.Mq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1617Mq1 {
    public final SparseBooleanArray a;

    public final int a(int i) {
        AbstractC6048km2.a(i, 0, this.a.size());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1617Mq1)) {
            return false;
        }
        C1617Mq1 c1617Mq1 = (C1617Mq1) obj;
        if (AbstractC9004vJ2.a >= 24) {
            return this.a.equals(c1617Mq1.a);
        }
        if (this.a.size() != c1617Mq1.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (a(i) != c1617Mq1.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (AbstractC9004vJ2.a >= 24) {
            return this.a.hashCode();
        }
        int size = this.a.size();
        for (int i = 0; i < this.a.size(); i++) {
            size = (size * 31) + a(i);
        }
        return size;
    }
}
