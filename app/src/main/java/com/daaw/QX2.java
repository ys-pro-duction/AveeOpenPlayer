package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class QX2 {
    public final Class a;
    public final Class b;

    public /* synthetic */ QX2(Class cls, Class cls2, PX2 px2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QX2)) {
            return false;
        }
        QX2 qx2 = (QX2) obj;
        return qx2.a.equals(this.a) && qx2.b.equals(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Class cls = this.b;
        return this.a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
