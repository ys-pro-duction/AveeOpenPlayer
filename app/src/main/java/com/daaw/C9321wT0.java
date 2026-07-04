package com.daaw;

/* JADX INFO: renamed from: com.daaw.wT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9321wT0 extends PY {
    public final transient Object D;

    public C9321wT0(Object obj) {
        this.D = AbstractC7785qy0.n(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public O91 iterator() {
        return AbstractC5560j20.b(this.D);
    }

    @Override // com.daaw.IY, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.D.equals(obj);
    }

    @Override // com.daaw.IY
    public int e(Object[] objArr, int i) {
        objArr[i] = this.D;
        return i + 1;
    }

    @Override // com.daaw.PY, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.D.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.D.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.daaw.IY
    public boolean y() {
        return false;
    }
}
