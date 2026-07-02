package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.ch3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3782ch3 extends AbstractC9641xc3 implements RandomAccess {
    public static final C3782ch3 E = new C3782ch3(new Object[0], 0, false);
    public Object[] C;
    public int D;

    public C3782ch3(Object[] objArr, int i, boolean z) {
        super(z);
        this.C = objArr;
        this.D = i;
    }

    public static C3782ch3 m() {
        return E;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.D)) {
            throw new IndexOutOfBoundsException(p(i));
        }
        Object[] objArr = this.C;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.C, i, objArr2, i + 1, this.D - i);
            this.C = objArr2;
        }
        this.C[i] = obj;
        this.D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.InterfaceC9377wf3
    public final /* bridge */ /* synthetic */ InterfaceC9377wf3 f(int i) {
        if (i >= this.D) {
            return new C3782ch3(Arrays.copyOf(this.C, i), this.D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        q(i);
        return this.C[i];
    }

    public final String p(int i) {
        return "Index:" + i + ", Size:" + this.D;
    }

    public final void q(int i) {
        if (i < 0 || i >= this.D) {
            throw new IndexOutOfBoundsException(p(i));
        }
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
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
    public final Object set(int i, Object obj) {
        e();
        q(i);
        Object[] objArr = this.C;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D;
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
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
}
