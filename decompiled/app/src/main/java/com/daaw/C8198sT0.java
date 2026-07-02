package com.daaw;

import com.daaw.L31;

/* JADX INFO: renamed from: com.daaw.sT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8198sT0 extends L31 {
    public static final Object k = new Object();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final Object j;

    public C8198sT0(long j, boolean z, boolean z2, Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // com.daaw.L31
    public int b(Object obj) {
        return k.equals(obj) ? 0 : -1;
    }

    @Override // com.daaw.L31
    public L31.b g(int i, L31.b bVar, boolean z) {
        AbstractC7115ob.c(i, 0, 1);
        return bVar.o(null, z ? k : null, 0, this.d, -this.f);
    }

    @Override // com.daaw.L31
    public int h() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[PHI: r1
  0x0031: PHI (r1v4 long) = (r1v3 long), (r1v3 long), (r1v7 long) binds: [B:8:0x0015, B:10:0x001b, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.daaw.L31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.L31.c m(int r19, com.daaw.L31.c r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = r19
            com.daaw.AbstractC7115ob.c(r3, r1, r2)
            if (r21 == 0) goto Lf
            java.lang.Object r1 = r0.j
        Ld:
            r3 = r1
            goto L11
        Lf:
            r1 = 0
            goto Ld
        L11:
            long r1 = r0.g
            boolean r9 = r0.i
            if (r9 == 0) goto L31
            r4 = 0
            int r6 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r6 == 0) goto L31
            long r4 = r0.e
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2a
        L28:
            r10 = r6
            goto L32
        L2a:
            long r1 = r1 + r22
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L31
            goto L28
        L31:
            r10 = r1
        L32:
            long r4 = r0.b
            long r6 = r0.c
            boolean r8 = r0.h
            long r12 = r0.e
            r15 = 0
            long r1 = r0.f
            r14 = 0
            r16 = r1
            r2 = r20
            com.daaw.L31$c r1 = r2.e(r3, r4, r6, r8, r9, r10, r12, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8198sT0.m(int, com.daaw.L31$c, boolean, long):com.daaw.L31$c");
    }

    @Override // com.daaw.L31
    public int n() {
        return 1;
    }

    public C8198sT0(long j, long j2, long j3, long j4, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public C8198sT0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = z;
        this.i = z2;
        this.j = obj;
    }
}
