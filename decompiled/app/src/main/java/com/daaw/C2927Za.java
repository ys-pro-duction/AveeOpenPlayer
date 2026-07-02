package com.daaw;

import com.daaw.SY;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2927Za extends SY {
    public final Object[] B;
    public final Object[] C;
    public final Comparator D;

    /* JADX INFO: renamed from: com.daaw.Za$a */
    public class a implements Iterator {
        public int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ boolean D;

        public a(int i, boolean z) {
            this.C = i;
            this.D = z;
            this.B = i;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj = C2927Za.this.B[this.B];
            Object[] objArr = C2927Za.this.C;
            int i = this.B;
            Object obj2 = objArr[i];
            this.B = this.D ? i - 1 : i + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.D ? this.B >= 0 : this.B < C2927Za.this.B.length;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public C2927Za(Comparator comparator) {
        this.B = new Object[0];
        this.C = new Object[0];
        this.D = comparator;
    }

    public static Object[] F(Object[] objArr, int i, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        objArr2[i] = obj;
        System.arraycopy(objArr, i, objArr2, i + 1, (r0 - i) - 1);
        return objArr2;
    }

    public static C2927Za G(List list, Map map, SY.a.InterfaceC0118a interfaceC0118a, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (Object obj : list) {
            objArr[i] = obj;
            objArr2[i] = map.get(interfaceC0118a.a(obj));
            i++;
        }
        return new C2927Za(comparator, objArr, objArr2);
    }

    public static Object[] K(Object[] objArr, int i) {
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        System.arraycopy(objArr, i + 1, objArr2, i, length - i);
        return objArr2;
    }

    public static Object[] L(Object[] objArr, int i, Object obj) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        objArr2[i] = obj;
        return objArr2;
    }

    public final int H(Object obj) {
        int i = 0;
        for (Object obj2 : this.B) {
            if (this.D.compare(obj, obj2) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int I(Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.B;
            if (i >= objArr.length || this.D.compare(objArr[i], obj) >= 0) {
                break;
            }
            i++;
        }
        return i;
    }

    public final Iterator J(int i, boolean z) {
        return new a(i, z);
    }

    @Override // com.daaw.SY
    public boolean e(Object obj) {
        return H(obj) != -1;
    }

    @Override // com.daaw.SY
    public boolean isEmpty() {
        return this.B.length == 0;
    }

    @Override // com.daaw.SY, java.lang.Iterable
    public Iterator iterator() {
        return J(0, false);
    }

    @Override // com.daaw.SY
    public Object m(Object obj) {
        int iH = H(obj);
        if (iH != -1) {
            return this.C[iH];
        }
        return null;
    }

    @Override // com.daaw.SY
    public Comparator p() {
        return this.D;
    }

    @Override // com.daaw.SY
    public Object q() {
        Object[] objArr = this.B;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // com.daaw.SY
    public Object s() {
        Object[] objArr = this.B;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // com.daaw.SY
    public int size() {
        return this.B.length;
    }

    @Override // com.daaw.SY
    public SY v(Object obj, Object obj2) {
        int iH = H(obj);
        if (iH != -1) {
            Object[] objArr = this.B;
            if (objArr[iH] == obj && this.C[iH] == obj2) {
                return this;
            }
            return new C2927Za(this.D, L(objArr, iH, obj), L(this.C, iH, obj2));
        }
        if (this.B.length <= 25) {
            int I = I(obj);
            return new C2927Za(this.D, F(this.B, I, obj), F(this.C, I, obj2));
        }
        HashMap map = new HashMap(this.B.length + 1);
        int i = 0;
        while (true) {
            Object[] objArr2 = this.B;
            if (i >= objArr2.length) {
                map.put(obj, obj2);
                return C5616jE0.E(map, this.D);
            }
            map.put(objArr2[i], this.C[i]);
            i++;
        }
    }

    @Override // com.daaw.SY
    public Iterator w(Object obj) {
        return J(I(obj), false);
    }

    @Override // com.daaw.SY
    public SY y(Object obj) {
        int iH = H(obj);
        if (iH == -1) {
            return this;
        }
        return new C2927Za(this.D, K(this.B, iH), K(this.C, iH));
    }

    public C2927Za(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.B = objArr;
        this.C = objArr2;
        this.D = comparator;
    }
}
