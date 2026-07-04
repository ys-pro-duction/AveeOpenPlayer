package com.daaw;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.fg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4623fg3 extends AbstractC9641xc3 implements RandomAccess, InterfaceC8533tf3, Yg3 {
    public static final C4623fg3 E = new C4623fg3(new long[0], 0, false);
    public long[] C;
    public int D;

    public C4623fg3(long[] jArr, int i, boolean z) {
        super(z);
        this.C = jArr;
        this.D = i;
    }

    public static C4623fg3 m() {
        return E;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        e();
        if (i < 0 || i > (i2 = this.D)) {
            throw new IndexOutOfBoundsException(q(i));
        }
        long[] jArr = this.C;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.C, i, jArr2, i + 1, this.D - i);
            this.C = jArr2;
        }
        this.C[i] = jLongValue;
        this.D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = AbstractC10214zf3.a;
        collection.getClass();
        if (!(collection instanceof C4623fg3)) {
            return super.addAll(collection);
        }
        C4623fg3 c4623fg3 = (C4623fg3) collection;
        int i = c4623fg3.D;
        if (i == 0) {
            return false;
        }
        int i2 = this.D;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.C;
        if (i3 > jArr.length) {
            this.C = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c4623fg3.C, 0, this.C, this.D, c4623fg3.D);
        this.D = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.daaw.InterfaceC8533tf3
    public final long c(int i) {
        s(i);
        return this.C[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4623fg3)) {
            return super.equals(obj);
        }
        C4623fg3 c4623fg3 = (C4623fg3) obj;
        if (this.D != c4623fg3.D) {
            return false;
        }
        long[] jArr = c4623fg3.C;
        for (int i = 0; i < this.D; i++) {
            if (this.C[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        s(i);
        return Long.valueOf(this.C[i]);
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.D; i2++) {
            long j = this.C[i2];
            Charset charset = AbstractC10214zf3.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.D;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.C[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void p(long j) {
        e();
        int i = this.D;
        long[] jArr = this.C;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.C = jArr2;
        }
        long[] jArr3 = this.C;
        int i2 = this.D;
        this.D = i2 + 1;
        jArr3[i2] = j;
    }

    public final String q(int i) {
        return "Index:" + i + ", Size:" + this.D;
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        e();
        s(i);
        long[] jArr = this.C;
        long j = jArr[i];
        if (i < this.D - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.D--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.C;
        System.arraycopy(jArr, i2, jArr, i, this.D - i2);
        this.D -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public final void s(int i) {
        if (i < 0 || i >= this.D) {
            throw new IndexOutOfBoundsException(q(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        e();
        s(i);
        long[] jArr = this.C;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D;
    }

    @Override // com.daaw.InterfaceC9377wf3
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final InterfaceC8533tf3 f(int i) {
        if (i >= this.D) {
            return new C4623fg3(Arrays.copyOf(this.C, i), this.D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        p(((Long) obj).longValue());
        return true;
    }
}
