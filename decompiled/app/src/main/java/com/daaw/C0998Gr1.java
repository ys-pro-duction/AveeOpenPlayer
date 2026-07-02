package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Gr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0998Gr1 {
    public final C1102Hr1 a = new C1102Hr1();
    public final C5900kE2 b = new C5900kE2(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final C5900kE2 a() {
        return this.b;
    }

    public final C1102Hr1 b() {
        return this.a;
    }

    public final void c() {
        this.a.a();
        this.b.d(0);
        this.c = -1;
        this.e = false;
    }

    public final void d() {
        C5900kE2 c5900kE2 = this.b;
        if (c5900kE2.i().length == 65025) {
            return;
        }
        c5900kE2.e(Arrays.copyOf(c5900kE2.i(), Math.max(65025, c5900kE2.m())), this.b.m());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.daaw.InterfaceC1190In1 r7) {
        /*
            r6 = this;
            boolean r0 = r6.e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.e = r1
            com.daaw.kE2 r0 = r6.b
            r0.d(r1)
        Ld:
            boolean r0 = r6.e
            r2 = 1
            if (r0 != 0) goto L99
            int r0 = r6.c
            if (r0 >= 0) goto L4e
            com.daaw.Hr1 r0 = r6.a
            r3 = -1
            boolean r0 = r0.c(r7, r3)
            if (r0 == 0) goto L4d
            com.daaw.Hr1 r0 = r6.a
            boolean r0 = r0.b(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            com.daaw.Hr1 r0 = r6.a
            int r3 = r0.d
            int r0 = r0.a
            r0 = r0 & r2
            if (r0 != r2) goto L42
            com.daaw.kE2 r0 = r6.b
            int r0 = r0.m()
            if (r0 != 0) goto L42
            int r0 = r6.f(r1)
            int r3 = r3 + r0
            int r0 = r6.d
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r3 = com.daaw.AbstractC1502Ln1.e(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.c = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.f(r0)
            int r3 = r6.c
            int r4 = r6.d
            int r3 = r3 + r4
            if (r0 <= 0) goto L8e
            com.daaw.kE2 r4 = r6.b
            int r5 = r4.m()
            int r5 = r5 + r0
            r4.a(r5)
            com.daaw.kE2 r4 = r6.b
            byte[] r5 = r4.i()
            int r4 = r4.m()
            boolean r4 = com.daaw.AbstractC1502Ln1.d(r7, r5, r4, r0)
            if (r4 != 0) goto L74
            return r1
        L74:
            com.daaw.kE2 r4 = r6.b
            int r5 = r4.m()
            int r5 = r5 + r0
            r4.f(r5)
            com.daaw.Hr1 r0 = r6.a
            int r4 = r3 + (-1)
            int[] r0 = r0.f
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8b
            goto L8c
        L8b:
            r2 = 0
        L8c:
            r6.e = r2
        L8e:
            com.daaw.Hr1 r0 = r6.a
            int r0 = r0.c
            if (r3 != r0) goto L95
            r3 = -1
        L95:
            r6.c = r3
            goto Ld
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0998Gr1.e(com.daaw.In1):boolean");
    }

    public final int f(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            C1102Hr1 c1102Hr1 = this.a;
            if (i5 >= c1102Hr1.c) {
                break;
            }
            this.d = i4 + 1;
            i2 = c1102Hr1.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
