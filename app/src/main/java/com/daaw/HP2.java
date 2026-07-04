package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HP2 extends IP2 {
    public Object[] a;
    public int b = 0;
    public boolean c;

    public HP2(int i) {
        this.a = new Object[i];
    }

    public final HP2 c(Object obj) {
        obj.getClass();
        f(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    public final IP2 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(this.b + collection.size());
            if (collection instanceof JP2) {
                this.b = ((JP2) collection).e(this.a, this.b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final void e(Object[] objArr, int i) {
        CQ2.b(objArr, 2);
        f(this.b + 2);
        System.arraycopy(objArr, 0, this.a, this.b, 2);
        this.b += 2;
    }

    public final void f(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, IP2.b(length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
