package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.gk3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4922gk3 {
    public static final C4922gk3 c = new C4922gk3(new int[]{2}, 10);
    public static final OP2 d = OP2.M(2, 5, 6);
    public static final RP2 e;
    public final int[] a;
    public final int b;

    static {
        QP2 qp2 = new QP2();
        qp2.a(5, 6);
        qp2.a(17, 6);
        qp2.a(7, 6);
        qp2.a(30, 10);
        qp2.a(18, 6);
        qp2.a(6, 8);
        qp2.a(8, 8);
        qp2.a(14, 8);
        e = qp2.c();
    }

    public C4922gk3(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 1);
        this.a = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.b = 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[PHI: r0
  0x0038: PHI (r0v3 int) = (r0v2 int), (r0v6 int) binds: [B:11:0x002b, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(com.daaw.C2485Ut1 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.l
            r0.getClass()
            java.lang.String r1 = r10.i
            int r0 = com.daaw.AbstractC5959kT1.a(r0, r1)
            com.daaw.RP2 r1 = com.daaw.C4922gk3.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 8
            r5 = 6
            r6 = 18
            if (r0 != r6) goto L2b
            boolean r0 = r9.c(r6)
            if (r0 != 0) goto L29
            r0 = 6
            goto L43
        L29:
            r0 = 18
        L2b:
            if (r0 != r4) goto L38
            boolean r0 = r9.c(r4)
            if (r0 == 0) goto L36
            r0 = 8
            goto L38
        L36:
            r0 = 7
            goto L43
        L38:
            r7 = 30
            if (r0 != r7) goto L43
            boolean r7 = r9.c(r7)
            if (r7 != 0) goto L43
            goto L36
        L43:
            boolean r7 = r9.c(r0)
            if (r7 != 0) goto L4a
            return r3
        L4a:
            int r7 = r10.y
            r8 = -1
            if (r7 == r8) goto L64
            if (r0 != r6) goto L52
            goto L64
        L52:
            java.lang.String r10 = r10.l
            java.lang.String r1 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r10.equals(r1)
            r1 = 10
            if (r10 == 0) goto L61
            if (r7 <= r1) goto L8c
            return r3
        L61:
            if (r7 <= r1) goto L8c
            return r3
        L64:
            int r10 = r10.z
            if (r10 != r8) goto L6b
            r10 = 48000(0xbb80, float:6.7262E-41)
        L6b:
            int r6 = com.daaw.AbstractC9004vJ2.a
            r7 = 29
            if (r6 < r7) goto L76
            int r7 = com.daaw.AbstractC4354ek3.a(r0, r10)
            goto L8c
        L76:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r7 = r10.intValue()
        L8c:
            int r10 = com.daaw.AbstractC9004vJ2.a
            r1 = 28
            if (r10 > r1) goto La0
            if (r7 != r2) goto L95
            goto La1
        L95:
            r1 = 3
            if (r7 == r1) goto L9e
            r1 = 4
            if (r7 == r1) goto L9e
            r1 = 5
            if (r7 != r1) goto La0
        L9e:
            r4 = 6
            goto La1
        La0:
            r4 = r7
        La1:
            r1 = 26
            if (r10 > r1) goto Lb3
            java.lang.String r10 = "fugu"
            java.lang.String r1 = com.daaw.AbstractC9004vJ2.b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto Lb3
            r10 = 1
            if (r4 != r10) goto Lb3
            r4 = 2
        Lb3:
            int r10 = com.daaw.AbstractC9004vJ2.s(r4)
            if (r10 != 0) goto Lba
            return r3
        Lba:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4922gk3.a(com.daaw.Ut1):android.util.Pair");
    }

    public final boolean c(int i) {
        return Arrays.binarySearch(this.a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4922gk3) && Arrays.equals(this.a, ((C4922gk3) obj).a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + 10;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=10, supportedEncodings=" + Arrays.toString(this.a) + "]";
    }
}
