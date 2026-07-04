package com.daaw;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.k42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5854k42 extends AbstractC3653cD1 implements RandomAccess, D62, InterfaceC2902Yt2 {
    public static final C5854k42 E = new C5854k42(new int[0], 0, false);
    public int[] C;
    public int D;

    public C5854k42(int[] iArr, int i, boolean z) {
        super(z);
        this.C = iArr;
        this.D = i;
    }

    public static C5854k42 p() {
        return E;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        e();
        if (i < 0 || i > (i2 = this.D)) {
            throw new IndexOutOfBoundsException(s(i));
        }
        int i3 = i + 1;
        int[] iArr = this.C;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.C, i, iArr2, i3, this.D - i);
            this.C = iArr2;
        }
        this.C[i] = iIntValue;
        this.D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.AbstractC3653cD1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = J82.a;
        collection.getClass();
        if (!(collection instanceof C5854k42)) {
            return super.addAll(collection);
        }
        C5854k42 c5854k42 = (C5854k42) collection;
        int i = c5854k42.D;
        if (i == 0) {
            return false;
        }
        int i2 = this.D;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.C;
        if (i3 > iArr.length) {
            this.C = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c5854k42.C, 0, this.C, this.D, c5854k42.D);
        this.D = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.daaw.AbstractC3653cD1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5854k42)) {
            return super.equals(obj);
        }
        C5854k42 c5854k42 = (C5854k42) obj;
        if (this.D != c5854k42.D) {
            return false;
        }
        int[] iArr = c5854k42.C;
        for (int i = 0; i < this.D; i++) {
            if (this.C[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.M72
    public final /* bridge */ /* synthetic */ M72 f(int i) {
        if (i >= this.D) {
            return new C5854k42(Arrays.copyOf(this.C, i), this.D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        v(i);
        return Integer.valueOf(this.C[i]);
    }

    @Override // com.daaw.AbstractC3653cD1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.D; i2++) {
            i = (i * 31) + this.C[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.D;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.C[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    public final int m(int i) {
        v(i);
        return this.C[i];
    }

    public final void q(int i) {
        e();
        int i2 = this.D;
        int[] iArr = this.C;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.C = iArr2;
        }
        int[] iArr3 = this.C;
        int i3 = this.D;
        this.D = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.daaw.AbstractC3653cD1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        e();
        v(i);
        int[] iArr = this.C;
        int i2 = iArr[i];
        if (i < this.D - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.D--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.C;
        System.arraycopy(iArr, i2, iArr, i, this.D - i2);
        this.D -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public final String s(int i) {
        return "Index:" + i + ", Size:" + this.D;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        e();
        v(i);
        int[] iArr = this.C;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D;
    }

    public final void v(int i) {
        if (i < 0 || i >= this.D) {
            throw new IndexOutOfBoundsException(s(i));
        }
    }

    @Override // com.daaw.AbstractC3653cD1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        q(((Integer) obj).intValue());
        return true;
    }
}
