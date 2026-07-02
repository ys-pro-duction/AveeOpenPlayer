package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

/* JADX INFO: renamed from: com.daaw.n31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6694n31 {
    public final int a;
    public final long[] b;
    public final Object[] c;

    public C6694n31(int i, long[] jArr, Object[] objArr) {
        G10.g(jArr, "keys");
        G10.g(objArr, DiagnosticsEntry.Histogram.VALUES_KEY);
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    public final int a(long j) {
        int i = this.a - 1;
        if (i != -1) {
            int i2 = 0;
            if (i != 0) {
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    long j2 = this.b[i3] - j;
                    if (j2 < 0) {
                        i2 = i3 + 1;
                    } else {
                        if (j2 <= 0) {
                            return i3;
                        }
                        i = i3 - 1;
                    }
                }
                return -(i2 + 1);
            }
            long j3 = this.b[0];
            if (j3 == j) {
                return 0;
            }
            if (j3 > j) {
                return -2;
            }
        }
        return -1;
    }

    public final Object b(long j) {
        int iA = a(j);
        if (iA >= 0) {
            return this.c[iA];
        }
        return null;
    }

    public final C6694n31 c(long j, Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : this.c) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = this.b[i5];
                Object obj3 = this.c[i5];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i2] = j2;
                    objArr[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr[i3] = j;
                objArr[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = this.b[i5];
                    Object obj4 = this.c[i5];
                    if (obj4 != null) {
                        jArr[i2] = j3;
                        objArr[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr[0] = j;
            objArr[0] = obj;
        }
        return new C6694n31(i4, jArr, objArr);
    }

    public final boolean d(long j, Object obj) {
        int iA = a(j);
        if (iA < 0) {
            return false;
        }
        this.c[iA] = obj;
        return true;
    }
}
