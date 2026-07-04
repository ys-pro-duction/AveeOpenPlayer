package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TP2 extends JP2 implements Set {
    public transient OP2 C;

    public static int F(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            AbstractC5381iO2.f(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static SP2 H(int i) {
        return new SP2(i);
    }

    public static TP2 J(Collection collection) {
        Object[] array = collection.toArray();
        return Q(array.length, array);
    }

    public static TP2 K() {
        return KQ2.J;
    }

    public static TP2 L(Object obj) {
        return new RQ2(obj);
    }

    public static TP2 M(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return Q(5, obj, obj2, obj3, obj4, obj5);
    }

    public static TP2 N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return Q(12, objArr2);
    }

    public static TP2 Q(int i, Object... objArr) {
        if (i == 0) {
            return KQ2.J;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new RQ2(obj);
        }
        int iF = F(i);
        Object[] objArr2 = new Object[iF];
        int i2 = iF - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            CQ2.a(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iA = GP2.a(iHashCode);
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
            return new RQ2(obj4);
        }
        if (F(i4) < iF / 2) {
            return Q(i4, objArr);
        }
        if (R(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new KQ2(objArr, i3, objArr2, i2, i4);
    }

    public static boolean R(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public OP2 G() {
        Object[] array = toArray();
        VQ2 vq2 = OP2.C;
        return OP2.G(array, array.length);
    }

    public boolean P() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof TP2) && P() && ((TP2) obj).P() && hashCode() != obj.hashCode()) {
            return false;
        }
        return QQ2.c(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return QQ2.a(this);
    }

    @Override // com.daaw.JP2
    public OP2 w() {
        OP2 op2 = this.C;
        if (op2 != null) {
            return op2;
        }
        OP2 op2G = G();
        this.C = op2G;
        return op2G;
    }

    @Override // com.daaw.JP2
    public abstract UQ2 y();
}
