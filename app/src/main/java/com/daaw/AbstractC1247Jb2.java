package com.daaw;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Jb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1247Jb2 extends AbstractC6446m92 implements Set {
    public transient AbstractC4308eb2 C;

    public static AbstractC1247Jb2 F() {
        return C9924yd2.J;
    }

    public static AbstractC1247Jb2 G(Object obj, Object obj2, Object obj3, Object obj4) {
        return I(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    public static AbstractC1247Jb2 I(int i, Object... objArr) {
        if (i == 0) {
            return C9924yd2.J;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new C4045de2(obj);
        }
        int iY = y(i);
        Object[] objArr2 = new Object[iY];
        int i2 = iY - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i5);
            }
            int iHashCode = obj2.hashCode();
            int iA = H82.a(iHashCode);
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
            return new C4045de2(obj4);
        }
        if (y(i4) < iY / 2) {
            return I(i4, objArr);
        }
        if (i4 < 3) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C9924yd2(objArr, i3, objArr2, i2, i4);
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

    public final AbstractC4308eb2 D() {
        AbstractC4308eb2 abstractC4308eb2 = this.C;
        if (abstractC4308eb2 != null) {
            return abstractC4308eb2;
        }
        AbstractC4308eb2 abstractC4308eb2E = E();
        this.C = abstractC4308eb2E;
        return abstractC4308eb2E;
    }

    public AbstractC4308eb2 E() {
        Object[] array = toArray();
        AbstractC6580mf2 abstractC6580mf2 = AbstractC4308eb2.C;
        return AbstractC4308eb2.D(array, array.length);
    }

    public boolean H() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1247Jb2) && H() && ((AbstractC1247Jb2) obj).H() && hashCode() != obj.hashCode()) {
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
