package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Qf3 extends K93 {
    public static final /* synthetic */ int o = 0;
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final AbstractC8657u52[] l;
    public final Object[] m;
    public final HashMap n;

    /* JADX WARN: Illegal instructions before constructor call */
    public Qf3(Collection collection, C4957gr3 c4957gr3) {
        AbstractC8657u52[] abstractC8657u52Arr = new AbstractC8657u52[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC8657u52Arr[i2] = ((Ne3) it.next()).zza();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((Ne3) it2.next()).zzb();
            i++;
        }
        this(abstractC8657u52Arr, objArr, c4957gr3);
    }

    @Override // com.daaw.AbstractC8657u52
    public final int b() {
        return this.i;
    }

    @Override // com.daaw.AbstractC8657u52
    public final int c() {
        return this.h;
    }

    @Override // com.daaw.K93
    public final int p(Object obj) {
        Integer num = (Integer) this.n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.daaw.K93
    public final int q(int i) {
        return AbstractC9004vJ2.n(this.j, i + 1, false, false);
    }

    @Override // com.daaw.K93
    public final int r(int i) {
        return AbstractC9004vJ2.n(this.k, i + 1, false, false);
    }

    @Override // com.daaw.K93
    public final int s(int i) {
        return this.j[i];
    }

    @Override // com.daaw.K93
    public final int t(int i) {
        return this.k[i];
    }

    @Override // com.daaw.K93
    public final AbstractC8657u52 u(int i) {
        return this.l[i];
    }

    @Override // com.daaw.K93
    public final Object v(int i) {
        return this.m[i];
    }

    public final List y() {
        return Arrays.asList(this.l);
    }

    public final Qf3 z(C4957gr3 c4957gr3) {
        AbstractC8657u52[] abstractC8657u52Arr = new AbstractC8657u52[this.l.length];
        int i = 0;
        while (true) {
            AbstractC8657u52[] abstractC8657u52Arr2 = this.l;
            if (i >= abstractC8657u52Arr2.length) {
                return new Qf3(abstractC8657u52Arr, this.m, c4957gr3);
            }
            abstractC8657u52Arr[i] = new Nf3(this, abstractC8657u52Arr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qf3(AbstractC8657u52[] abstractC8657u52Arr, Object[] objArr, C4957gr3 c4957gr3) {
        super(false, c4957gr3);
        int i = 0;
        this.l = abstractC8657u52Arr;
        int length = abstractC8657u52Arr.length;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap();
        int iC = 0;
        int iB = 0;
        int i2 = 0;
        while (i < abstractC8657u52Arr.length) {
            AbstractC8657u52 abstractC8657u52 = abstractC8657u52Arr[i];
            this.l[i2] = abstractC8657u52;
            this.k[i2] = iC;
            this.j[i2] = iB;
            iC += abstractC8657u52.c();
            iB += this.l[i2].b();
            this.n.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.h = iC;
        this.i = iB;
    }
}
