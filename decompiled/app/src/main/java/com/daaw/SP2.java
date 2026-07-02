package com.daaw;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class SP2 extends HP2 {
    public Object[] d;
    public int e;

    public SP2(int i) {
        super(i);
        this.d = new Object[TP2.F(i)];
    }

    @Override // com.daaw.IP2
    public final /* bridge */ /* synthetic */ IP2 a(Object obj) {
        g(obj);
        return this;
    }

    public final SP2 g(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iF = TP2.F(this.b);
            int length = this.d.length;
            if (iF <= length) {
                int iHashCode = obj.hashCode();
                int iA = GP2.a(iHashCode);
                while (true) {
                    Object[] objArr = this.d;
                    int i = iA & (length - 1);
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        objArr[i] = obj;
                        this.e += iHashCode;
                        super.c(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iA = i + 1;
                }
            }
        }
        this.d = null;
        super.c(obj);
        return this;
    }

    public final SP2 h(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.d(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        return this;
    }

    public final TP2 i() {
        TP2 tp2Q;
        int i = this.b;
        if (i == 0) {
            return KQ2.J;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new RQ2(obj);
        }
        if (this.d == null || TP2.F(i) != this.d.length) {
            tp2Q = TP2.Q(this.b, this.a);
            this.b = tp2Q.size();
        } else {
            int i2 = this.b;
            Object[] objArrCopyOf = this.a;
            if (TP2.R(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            tp2Q = new KQ2(objArrCopyOf, this.e, this.d, r6.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return tp2Q;
    }
}
