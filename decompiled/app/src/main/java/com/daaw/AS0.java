package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AS0 {
    public int[] a;
    public Object[] b;
    public int c;

    public AS0(int i) {
        if (i == 0) {
            this.a = AbstractC0684Dr.a;
            this.b = AbstractC0684Dr.b;
        } else {
            this.a = new int[i];
            this.b = new Object[i << 1];
        }
        this.c = 0;
    }

    public final boolean a(Object obj) {
        return d(obj) >= 0;
    }

    public final Object b(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.b[(iD << 1) + 1];
        }
        return null;
    }

    public final int c(Object obj, int i) {
        G10.g(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int iA = AbstractC0684Dr.a(this.a, i2, i);
        if (iA < 0 || G10.c(obj, this.b[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (G10.c(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (G10.c(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public final int e() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int iA = AbstractC0684Dr.a(this.a, i, 0);
        if (iA < 0 || this.b[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof AS0) {
                AS0 as0 = (AS0) obj;
                int i = this.c;
                if (i != as0.c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object objG = g(i2);
                    Object objI = i(i2);
                    Object objB = as0.b(objG);
                    if (objI == null) {
                        if (objB != null || !as0.a(objG)) {
                            return false;
                        }
                    } else if (!G10.c(objI, objB)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objG2 = g(i4);
                Object objI2 = i(i4);
                Object obj2 = ((Map) obj).get(objG2);
                if (objI2 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!G10.c(objI2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.c <= 0;
    }

    public final Object g(int i) {
        return this.b[i << 1];
    }

    public final Object h(Object obj, Object obj2) {
        int iHashCode;
        int iC;
        int i = this.c;
        if (obj == null) {
            iC = e();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iC = c(obj, iHashCode);
        }
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            G10.f(iArrCopyOf, "copyOf(this, newSize)");
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i4 << 1);
            G10.f(objArrCopyOf, "copyOf(this, newSize)");
            this.b = objArrCopyOf;
            if (i != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            AbstractC5152hb.f(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            AbstractC5152hb.h(objArr2, objArr2, i5 << 1, i3 << 1, this.c << 1);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        return this.b[(i << 1) + 1];
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objG = g(i2);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i2);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        G10.f(string, "buffer.toString()");
        return string;
    }

    public /* synthetic */ AS0(int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
