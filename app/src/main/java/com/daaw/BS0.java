package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BS0 {
    public static Object[] E;
    public static int F;
    public static Object[] G;
    public static int H;
    public int[] B;
    public Object[] C;
    public int D;

    public BS0() {
        this.B = AbstractC0571Cr.a;
        this.C = AbstractC0571Cr.c;
        this.D = 0;
    }

    public static int c(int[] iArr, int i, int i2) {
        try {
            return AbstractC0571Cr.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (BS0.class) {
                try {
                    if (H < 10) {
                        objArr[0] = G;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        G = objArr;
                        H++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (BS0.class) {
                try {
                    if (F < 10) {
                        objArr[0] = E;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        E = objArr;
                        F++;
                    }
                } finally {
                }
            }
        }
    }

    public final void b(int i) {
        if (i == 8) {
            synchronized (BS0.class) {
                try {
                    Object[] objArr = G;
                    if (objArr != null) {
                        this.C = objArr;
                        G = (Object[]) objArr[0];
                        this.B = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        H--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (BS0.class) {
                try {
                    Object[] objArr2 = E;
                    if (objArr2 != null) {
                        this.C = objArr2;
                        E = (Object[]) objArr2[0];
                        this.B = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        F--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.B = new int[i];
        this.C = new Object[i << 1];
    }

    public void clear() {
        int i = this.D;
        if (i > 0) {
            int[] iArr = this.B;
            Object[] objArr = this.C;
            this.B = AbstractC0571Cr.a;
            this.C = AbstractC0571Cr.c;
            this.D = 0;
            e(iArr, objArr, i);
        }
        if (this.D > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public void d(int i) {
        int i2 = this.D;
        int[] iArr = this.B;
        if (iArr.length < i) {
            Object[] objArr = this.C;
            b(i);
            if (this.D > 0) {
                System.arraycopy(iArr, 0, this.B, 0, i2);
                System.arraycopy(objArr, 0, this.C, 0, i2 << 1);
            }
            e(iArr, objArr, i2);
        }
        if (this.D != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BS0) {
            BS0 bs0 = (BS0) obj;
            if (size() != bs0.size()) {
                return false;
            }
            for (int i = 0; i < this.D; i++) {
                try {
                    Object objJ = j(i);
                    Object objN = n(i);
                    Object obj2 = bs0.get(objJ);
                    if (objN == null) {
                        if (obj2 != null || !bs0.containsKey(objJ)) {
                            return false;
                        }
                    } else if (!objN.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.D; i2++) {
                try {
                    Object objJ2 = j(i2);
                    Object objN2 = n(i2);
                    Object obj3 = map.get(objJ2);
                    if (objN2 == null) {
                        if (obj3 != null || !map.containsKey(objJ2)) {
                            return false;
                        }
                    } else if (!objN2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj, int i) {
        int i2 = this.D;
        if (i2 == 0) {
            return -1;
        }
        int iC = c(this.B, i2, i);
        if (iC < 0 || obj.equals(this.C[iC << 1])) {
            return iC;
        }
        int i3 = iC + 1;
        while (i3 < i2 && this.B[i3] == i) {
            if (obj.equals(this.C[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iC - 1; i4 >= 0 && this.B[i4] == i; i4--) {
            if (obj.equals(this.C[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public int g(Object obj) {
        return obj == null ? h() : f(obj, obj.hashCode());
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iG = g(obj);
        return iG >= 0 ? this.C[(iG << 1) + 1] : obj2;
    }

    public int h() {
        int i = this.D;
        if (i == 0) {
            return -1;
        }
        int iC = c(this.B, i, 0);
        if (iC < 0 || this.C[iC << 1] == null) {
            return iC;
        }
        int i2 = iC + 1;
        while (i2 < i && this.B[i2] == 0) {
            if (this.C[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iC - 1; i3 >= 0 && this.B[i3] == 0; i3--) {
            if (this.C[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public int hashCode() {
        int[] iArr = this.B;
        Object[] objArr = this.C;
        int i = this.D;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public int i(Object obj) {
        int i = this.D * 2;
        Object[] objArr = this.C;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.D <= 0;
    }

    public Object j(int i) {
        return this.C[i << 1];
    }

    public void k(BS0 bs0) {
        int i = bs0.D;
        d(this.D + i);
        if (this.D != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(bs0.j(i2), bs0.n(i2));
            }
        } else if (i > 0) {
            System.arraycopy(bs0.B, 0, this.B, 0, i);
            System.arraycopy(bs0.C, 0, this.C, 0, i << 1);
            this.D = i;
        }
    }

    public Object l(int i) {
        Object[] objArr = this.C;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.D;
        int i4 = 0;
        if (i3 <= 1) {
            e(this.B, objArr, i3);
            this.B = AbstractC0571Cr.a;
            this.C = AbstractC0571Cr.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.B;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.C;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.C;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                b(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.D) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.B, 0, i);
                    System.arraycopy(objArr, 0, this.C, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.B, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.C, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.D) {
            throw new ConcurrentModificationException();
        }
        this.D = i4;
        return obj;
    }

    public Object m(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.C;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object n(int i) {
        return this.C[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int iF;
        int i2 = this.D;
        if (obj == null) {
            iF = h();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iF = f(obj, iHashCode);
        }
        if (iF >= 0) {
            int i3 = (iF << 1) + 1;
            Object[] objArr = this.C;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iF;
        int[] iArr = this.B;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.C;
            b(i5);
            if (i2 != this.D) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.B;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.C, 0, objArr2.length);
            }
            e(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.B;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.C;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.D - i4) << 1);
        }
        int i7 = this.D;
        if (i2 == i7) {
            int[] iArr4 = this.B;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.C;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.D = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iG = g(obj);
        if (iG >= 0) {
            return l(iG);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG >= 0) {
            return m(iG, obj2);
        }
        return null;
    }

    public int size() {
        return this.D;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.D * 28);
        sb.append('{');
        for (int i = 0; i < this.D; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objJ = j(i);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objN = n(i);
            if (objN != this) {
                sb.append(objN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        Object objN = n(iG);
        if (obj2 != objN && (obj2 == null || !obj2.equals(objN))) {
            return false;
        }
        l(iG);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        Object objN = n(iG);
        if (objN != obj2 && (obj2 == null || !obj2.equals(objN))) {
            return false;
        }
        m(iG, obj3);
        return true;
    }

    public BS0(int i) {
        if (i == 0) {
            this.B = AbstractC0571Cr.a;
            this.C = AbstractC0571Cr.c;
        } else {
            b(i);
        }
        this.D = 0;
    }

    public BS0(BS0 bs0) {
        this();
        if (bs0 != null) {
            k(bs0);
        }
    }
}
