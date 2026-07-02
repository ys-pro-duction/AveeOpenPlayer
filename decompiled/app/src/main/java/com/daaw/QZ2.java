package com.daaw;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class QZ2 {
    public final JZ2 a;
    public final List b;
    public final Integer c;

    public /* synthetic */ QZ2(JZ2 jz2, List list, Integer num, PZ2 pz2) {
        this.a = jz2;
        this.b = list;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QZ2)) {
            return false;
        }
        QZ2 qz2 = (QZ2) obj;
        if (this.a.equals(qz2.a) && this.b.equals(qz2.b)) {
            Integer num = this.c;
            Integer num2 = qz2.c;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}
