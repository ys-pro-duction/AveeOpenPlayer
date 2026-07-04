package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class K01 {
    public static final int a(String str, int i, int i2, int i3) {
        return (int) I01.c(str, i, i2, i3);
    }

    public static final long b(String str, long j, long j2, long j3) {
        String strD = I01.d(str);
        if (strD == null) {
            return j;
        }
        Long lI = AbstractC10178zY0.i(strD);
        if (lI == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lI.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = I01.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(String str, boolean z) {
        String strD = I01.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z;
    }

    public static /* synthetic */ int e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return I01.b(str, i, i2, i3);
    }

    public static /* synthetic */ long f(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return I01.c(str, j, j4, j3);
    }
}
