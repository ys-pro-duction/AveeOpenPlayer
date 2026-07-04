package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class QP2 {
    public Object[] a;
    public int b;
    public PP2 c;

    public QP2() {
        this(4);
    }

    public final QP2 a(Object obj, Object obj2) {
        d(this.b + 1);
        AbstractC5106hP2.b(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final QP2 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final RP2 c() {
        PP2 pp2 = this.c;
        if (pp2 != null) {
            throw pp2.a();
        }
        JQ2 jq2K = JQ2.k(this.b, this.a, this);
        PP2 pp22 = this.c;
        if (pp22 == null) {
            return jq2K;
        }
        throw pp22.a();
    }

    public final void d(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, IP2.b(length, i2));
        }
    }

    public QP2(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
