package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.eB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4201eB0 extends AbstractC4146e0 implements RandomAccess {
    public static final C4201eB0 E;
    public Object[] C;
    public int D;

    static {
        C4201eB0 c4201eB0 = new C4201eB0(new Object[0], 0);
        E = c4201eB0;
        c4201eB0.l();
    }

    public C4201eB0(Object[] objArr, int i) {
        this.C = objArr;
        this.D = i;
    }

    public static Object[] m(int i) {
        return new Object[i];
    }

    public static C4201eB0 p() {
        return E;
    }

    private void q(int i) {
        if (i < 0 || i >= this.D) {
            throw new IndexOutOfBoundsException(s(i));
        }
    }

    private String s(int i) {
        return "Index:" + i + ", Size:" + this.D;
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        e();
        int i = this.D;
        Object[] objArr = this.C;
        if (i == objArr.length) {
            this.C = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.C;
        int i2 = this.D;
        this.D = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        q(i);
        return this.C[i];
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        e();
        q(i);
        Object[] objArr = this.C;
        Object obj = objArr[i];
        if (i < this.D - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.D--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        e();
        q(i);
        Object[] objArr = this.C;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.D;
    }

    @Override // com.daaw.AbstractC3317b10.e
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C4201eB0 n(int i) {
        if (i >= this.D) {
            return new C4201eB0(Arrays.copyOf(this.C, i), this.D);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        e();
        if (i >= 0 && i <= (i2 = this.D)) {
            Object[] objArr = this.C;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArrM = m(((i2 * 3) / 2) + 1);
                System.arraycopy(this.C, 0, objArrM, 0, i);
                System.arraycopy(this.C, i, objArrM, i + 1, this.D - i);
                this.C = objArrM;
            }
            this.C[i] = obj;
            this.D++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(s(i));
    }
}
