package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.hY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5142hY2 {
    public final Class a;
    public final Class b;

    public /* synthetic */ C5142hY2(Class cls, Class cls2, AbstractC4863gY2 abstractC4863gY2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5142hY2)) {
            return false;
        }
        C5142hY2 c5142hY2 = (C5142hY2) obj;
        return c5142hY2.a.equals(this.a) && c5142hY2.b.equals(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Class cls = this.b;
        return this.a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
