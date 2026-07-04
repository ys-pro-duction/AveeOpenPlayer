package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.fY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4584fY2 {
    public final Class a;
    public final Y23 b;

    public /* synthetic */ C4584fY2(Class cls, Y23 y23, AbstractC4295eY2 abstractC4295eY2) {
        this.a = cls;
        this.b = y23;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4584fY2)) {
            return false;
        }
        C4584fY2 c4584fY2 = (C4584fY2) obj;
        return c4584fY2.a.equals(this.a) && c4584fY2.b.equals(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Y23 y23 = this.b;
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(y23);
    }
}
