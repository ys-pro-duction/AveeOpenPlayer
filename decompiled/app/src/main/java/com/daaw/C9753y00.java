package com.daaw;

import com.daaw.AbstractC3317b10;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.y00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9753y00 extends AbstractC4146e0 implements AbstractC3317b10.d, RandomAccess, InterfaceC7231oz0 {
    public static final C9753y00 E;
    public int[] C;
    public int D;

    static {
        C9753y00 c9753y00 = new C9753y00(new int[0], 0);
        E = c9753y00;
        c9753y00.l();
    }

    public C9753y00(int[] iArr, int i) {
        this.C = iArr;
        this.D = i;
    }

    private String E(int i) {
        return "Index:" + i + ", Size:" + this.D;
    }

    public static C9753y00 v() {
        return E;
    }

    private void w(int i) {
        if (i < 0 || i >= this.D) {
            throw new IndexOutOfBoundsException(E(i));
        }
    }

    public int D(int i) {
        w(i);
        return this.C[i];
    }

    @Override // com.daaw.AbstractC3317b10.e
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public AbstractC3317b10.d n(int i) {
        if (i >= this.D) {
            return new C9753y00(Arrays.copyOf(this.C, i), this.D);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        e();
        w(i);
        int[] iArr = this.C;
        int i2 = iArr[i];
        if (i < this.D - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.D--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(I(i, num.intValue()));
    }

    public int I(int i, int i2) {
        e();
        w(i);
        int[] iArr = this.C;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        e();
        AbstractC3317b10.a(collection);
        if (!(collection instanceof C9753y00)) {
            return super.addAll(collection);
        }
        C9753y00 c9753y00 = (C9753y00) collection;
        int i = c9753y00.D;
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
        System.arraycopy(c9753y00.C, 0, this.C, this.D, c9753y00.D);
        this.D = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9753y00)) {
            return super.equals(obj);
        }
        C9753y00 c9753y00 = (C9753y00) obj;
        if (this.D != c9753y00.D) {
            return false;
        }
        int[] iArr = c9753y00.C;
        for (int i = 0; i < this.D; i++) {
            if (this.C[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.D; i2++) {
            i = (i * 31) + this.C[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.C[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        s(i, num.intValue());
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        q(num.intValue());
        return true;
    }

    public void q(int i) {
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

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.C;
        System.arraycopy(iArr, i2, iArr, i, this.D - i2);
        this.D -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public final void s(int i, int i2) {
        int i3;
        e();
        if (i < 0 || i > (i3 = this.D)) {
            throw new IndexOutOfBoundsException(E(i));
        }
        int[] iArr = this.C;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.C, i, iArr2, i + 1, this.D - i);
            this.C = iArr2;
        }
        this.C[i] = i2;
        this.D++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(D(i));
    }
}
