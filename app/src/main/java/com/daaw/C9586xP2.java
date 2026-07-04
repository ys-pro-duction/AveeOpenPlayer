package com.daaw;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.xP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9586xP2 extends AbstractMap implements Serializable {
    public static final Object K = new Object();
    public transient Object B;
    public transient int[] C;
    public transient Object[] D;
    public transient Object[] E;
    public transient int F;
    public transient int G;
    public transient Set H;
    public transient Set I;
    public transient Collection J;

    public C9586xP2(int i) {
        o(8);
    }

    public static /* synthetic */ Object i(C9586xP2 c9586xP2) {
        Object obj = c9586xP2.B;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (s()) {
            return;
        }
        n();
        Map mapK = k();
        if (mapK != null) {
            this.F = AbstractC4835gR2.b(size(), 3, 1073741823);
            mapK.clear();
            this.B = null;
            this.G = 0;
            return;
        }
        Object[] objArr = this.D;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.G, (Object) null);
        Object[] objArr2 = this.E;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.G, (Object) null);
        Object obj = this.B;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.C;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.G, 0);
        this.G = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapK = k();
        return mapK != null ? mapK.containsKey(obj) : u(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.containsValue(obj);
        }
        for (int i = 0; i < this.G; i++) {
            Object[] objArr = this.E;
            objArr.getClass();
            if (AbstractC3977dO2.a(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.I;
        if (set != null) {
            return set;
        }
        C6790nP2 c6790nP2 = new C6790nP2(this);
        this.I = c6790nP2;
        return c6790nP2;
    }

    public final int f() {
        return isEmpty() ? -1 : 0;
    }

    public final int g(int i) {
        int i2 = i + 1;
        if (i2 < this.G) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.get(obj);
        }
        int iU = u(obj);
        if (iU == -1) {
            return null;
        }
        Object[] objArr = this.E;
        objArr.getClass();
        return objArr[iU];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Map k() {
        Object obj = this.B;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.H;
        if (set != null) {
            return set;
        }
        C7627qP2 c7627qP2 = new C7627qP2(this);
        this.H = c7627qP2;
        return c7627qP2;
    }

    public final void n() {
        this.F += 32;
    }

    public final void o(int i) {
        this.F = AbstractC4835gR2.b(8, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (s()) {
            AbstractC5381iO2.j(s(), "Arrays already allocated");
            int i = this.F;
            int iMax = Math.max(i + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.B = AbstractC9865yP2.d(iMax2);
            y(iMax2 - 1);
            this.C = new int[i];
            this.D = new Object[i];
            this.E = new Object[i];
        }
        Map mapK = k();
        if (mapK != null) {
            return mapK.put(obj, obj2);
        }
        int[] iArr = this.C;
        iArr.getClass();
        Object[] objArr = this.D;
        objArr.getClass();
        Object[] objArr2 = this.E;
        objArr2.getClass();
        int i2 = this.G;
        int i3 = i2 + 1;
        int iB = GP2.b(obj);
        int iT = t();
        int i4 = iB & iT;
        Object obj3 = this.B;
        obj3.getClass();
        int iC = AbstractC9865yP2.c(obj3, i4);
        if (iC != 0) {
            int i5 = ~iT;
            int i6 = iB & i5;
            int i7 = 0;
            while (true) {
                int i8 = iC - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && AbstractC3977dO2.a(obj, objArr[i8])) {
                    Object obj4 = objArr2[i8];
                    objArr2[i8] = obj2;
                    return obj4;
                }
                int i11 = i9 & iT;
                i7++;
                if (i11 != 0) {
                    iC = i11;
                } else {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(t() + 1, 1.0f);
                        int iF = f();
                        while (iF >= 0) {
                            Object[] objArr3 = this.D;
                            objArr3.getClass();
                            Object obj5 = objArr3[iF];
                            Object[] objArr4 = this.E;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[iF]);
                            iF = g(iF);
                        }
                        this.B = linkedHashMap;
                        this.C = null;
                        this.D = null;
                        this.E = null;
                        n();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i3 > iT) {
                        iT = w(iT, AbstractC9865yP2.a(iT), iB, i2);
                    } else {
                        iArr[i8] = (i3 & iT) | i10;
                    }
                }
            }
        } else if (i3 > iT) {
            iT = w(iT, AbstractC9865yP2.a(iT), iB, i2);
        } else {
            Object obj6 = this.B;
            obj6.getClass();
            AbstractC9865yP2.e(obj6, i4, i3);
        }
        int[] iArr2 = this.C;
        iArr2.getClass();
        int length = iArr2.length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.C;
            iArr3.getClass();
            this.C = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.D;
            objArr5.getClass();
            this.D = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.E;
            objArr6.getClass();
            this.E = Arrays.copyOf(objArr6, iMin);
        }
        int i12 = (~iT) & iB;
        int[] iArr4 = this.C;
        iArr4.getClass();
        iArr4[i2] = i12;
        Object[] objArr7 = this.D;
        objArr7.getClass();
        objArr7[i2] = obj;
        Object[] objArr8 = this.E;
        objArr8.getClass();
        objArr8[i2] = obj2;
        this.G = i3;
        n();
        return null;
    }

    public final void r(int i, int i2) {
        Object obj = this.B;
        obj.getClass();
        int[] iArr = this.C;
        iArr.getClass();
        Object[] objArr = this.D;
        objArr.getClass();
        Object[] objArr2 = this.E;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int iB = GP2.b(obj2) & i2;
        int iC = AbstractC9865yP2.c(obj, iB);
        if (iC == size) {
            AbstractC9865yP2.e(obj, iB, i4);
            return;
        }
        while (true) {
            int i5 = iC - 1;
            int i6 = iArr[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArr[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            iC = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.remove(obj);
        }
        Object objX = x(obj);
        if (objX == K) {
            return null;
        }
        return objX;
    }

    public final boolean s() {
        return this.B == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapK = k();
        return mapK != null ? mapK.size() : this.G;
    }

    public final int t() {
        return (1 << (this.F & 31)) - 1;
    }

    public final int u(Object obj) {
        if (s()) {
            return -1;
        }
        int iB = GP2.b(obj);
        int iT = t();
        Object obj2 = this.B;
        obj2.getClass();
        int iC = AbstractC9865yP2.c(obj2, iB & iT);
        if (iC != 0) {
            int i = ~iT;
            int i2 = iB & i;
            do {
                int i3 = iC - 1;
                int[] iArr = this.C;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.D;
                    objArr.getClass();
                    if (AbstractC3977dO2.a(obj, objArr[i3])) {
                        return i3;
                    }
                }
                iC = i4 & iT;
            } while (iC != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.J;
        if (collection != null) {
            return collection;
        }
        C9307wP2 c9307wP2 = new C9307wP2(this);
        this.J = c9307wP2;
        return c9307wP2;
    }

    public final int w(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objD = AbstractC9865yP2.d(i2);
        if (i4 != 0) {
            AbstractC9865yP2.e(objD, i3 & i5, i4 + 1);
        }
        Object obj = this.B;
        obj.getClass();
        int[] iArr = this.C;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int iC = AbstractC9865yP2.c(obj, i6);
            while (iC != 0) {
                int i7 = iC - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iC2 = AbstractC9865yP2.c(objD, i10);
                AbstractC9865yP2.e(objD, i10, iC);
                iArr[i7] = ((~i5) & i9) | (iC2 & i5);
                iC = i8 & i;
            }
        }
        this.B = objD;
        y(i5);
        return i5;
    }

    public final Object x(Object obj) {
        if (s()) {
            return K;
        }
        int iT = t();
        Object obj2 = this.B;
        obj2.getClass();
        int[] iArr = this.C;
        iArr.getClass();
        Object[] objArr = this.D;
        objArr.getClass();
        int iB = AbstractC9865yP2.b(obj, null, iT, obj2, iArr, objArr, null);
        if (iB == -1) {
            return K;
        }
        Object[] objArr2 = this.E;
        objArr2.getClass();
        Object obj3 = objArr2[iB];
        r(iB, iT);
        this.G--;
        n();
        return obj3;
    }

    public final void y(int i) {
        this.F = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.F & (-32));
    }
}
