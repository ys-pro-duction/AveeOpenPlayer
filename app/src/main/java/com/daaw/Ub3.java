package com.daaw;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ub3 extends AbstractC9636xb3 implements Set {
    public transient Rb3 C;

    public static Ub3 F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return H(15, objArr2);
    }

    public static Ub3 H(int i, Object... objArr) {
        if (i == 0) {
            return C4603fc3.J;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new C5440ic3(obj);
        }
        int iY = y(i);
        Object[] objArr2 = new Object[iY];
        int i2 = iY - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            Zb3.a(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iA = AbstractC7119ob3.a(iHashCode);
            while (true) {
                int i6 = iA & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C5440ic3(obj4);
        }
        if (y(i4) < iY / 2) {
            return H(i4, objArr);
        }
        if (i4 < 10) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C4603fc3(objArr, i3, objArr2, i2, i4);
    }

    public static int y(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public final Rb3 D() {
        Rb3 rb3 = this.C;
        if (rb3 != null) {
            return rb3;
        }
        Rb3 rb3E = E();
        this.C = rb3E;
        return rb3E;
    }

    public Rb3 E() {
        Object[] array = toArray();
        AbstractC7124oc3 abstractC7124oc3 = Rb3.C;
        return Rb3.D(array, array.length);
    }

    public boolean G() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Ub3) && G() && ((Ub3) obj).G() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();
}
