package com.daaw;

import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Da1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0609Da1 {
    public final String[] a;
    public final int[] b;
    public final String[] c;
    public final int d;

    public C0609Da1(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.a = strArr;
        this.b = iArr;
        this.c = strArr2;
        this.d = i;
    }

    public static C0609Da1 b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new C0609Da1(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(java.lang.String r12, java.lang.String[] r13, int[] r14, java.lang.String[] r15) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0609Da1.c(java.lang.String, java.lang.String[], int[], java.lang.String[]):int");
    }

    public String a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.d;
            if (i2 >= i3) {
                sb.append(this.a[i3]);
                return sb.toString();
            }
            sb.append(this.a[i2]);
            int i4 = this.b[i2];
            if (i4 == 1) {
                sb.append(str);
            } else if (i4 == 2) {
                sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(j)));
            } else if (i4 == 3) {
                sb.append(String.format(Locale.US, this.c[i2], Integer.valueOf(i)));
            } else if (i4 == 4) {
                sb.append(String.format(Locale.US, this.c[i2], Long.valueOf(j2)));
            }
            i2++;
        }
    }
}
