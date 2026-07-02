package com.daaw;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PY extends IY implements Set {
    public transient MY C;

    public static int E(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            AbstractC7785qy0.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static PY F(int i, Object... objArr) {
        if (i == 0) {
            return J();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return K(obj);
        }
        int iE = E(i);
        Object[] objArr2 = new Object[iE];
        int i2 = iE - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object objA = AbstractC6070kp0.a(objArr[i5], i5);
            int iHashCode = objA.hashCode();
            int iA = EU.a(iHashCode);
            while (true) {
                int i6 = iA & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = objA;
                    objArr2[i6] = objA;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new C9321wT0(obj3);
        }
        if (E(i4) < iE / 2) {
            return F(i4, objArr);
        }
        if (L(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C9269wG0(objArr, i3, objArr2, i2, i4);
    }

    public static PY G(Collection collection) {
        if ((collection instanceof PY) && !(collection instanceof SortedSet)) {
            PY py = (PY) collection;
            if (!py.y()) {
                return py;
            }
        }
        Object[] array = collection.toArray();
        return F(array.length, array);
    }

    public static PY J() {
        return C9269wG0.J;
    }

    public static PY K(Object obj) {
        return new C9321wT0(obj);
    }

    public static boolean L(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public MY D() {
        MY my = this.C;
        if (my != null) {
            return my;
        }
        MY myH = H();
        this.C = myH;
        return myH;
    }

    public MY H() {
        return MY.D(toArray());
    }

    public boolean I() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof PY) && I() && ((PY) obj).I() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC9309wQ0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC9309wQ0.b(this);
    }
}
