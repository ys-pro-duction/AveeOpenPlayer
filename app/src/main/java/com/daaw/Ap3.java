package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Ap3 implements Tp3, Sp3 {
    public final Tp3 B;
    public Sp3 C;
    public C10264zp3[] D = new C10264zp3[0];
    public long E = 0;
    public long F;

    public Ap3(Tp3 tp3, boolean z, long j, long j2) {
        this.B = tp3;
        this.F = j2;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final void a(long j) {
        this.B.a(j);
    }

    @Override // com.daaw.Sp3
    public final void b(Tp3 tp3) {
        Sp3 sp3 = this.C;
        sp3.getClass();
        sp3.b(this);
    }

    public final void c(long j, long j2) {
        this.F = j2;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean d(C9651xe3 c9651xe3) {
        return this.B.d(c9651xe3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.daaw.Tp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.E = r0
            com.daaw.zp3[] r0 = r7.D
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.c()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.daaw.Tp3 r0 = r7.B
            long r0 = r0.e(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L35
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L36
            long r8 = r7.F
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L36
        L35:
            r2 = 1
        L36:
            com.daaw.AbstractC6048km2.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Ap3.e(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    @Override // com.daaw.Tp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(com.daaw.InterfaceC9442ws3[] r14, boolean[] r15, com.daaw.InterfaceC4110dr3[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r16
            int r1 = r0.length
            com.daaw.zp3[] r2 = new com.daaw.C10264zp3[r1]
            r13.D = r2
            com.daaw.dr3[] r6 = new com.daaw.InterfaceC4110dr3[r1]
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r0.length
            r10 = 0
            if (r2 >= r3) goto L20
            com.daaw.zp3[] r3 = r13.D
            r4 = r0[r2]
            com.daaw.zp3 r4 = (com.daaw.C10264zp3) r4
            r3[r2] = r4
            if (r4 == 0) goto L1b
            com.daaw.dr3 r10 = r4.a
        L1b:
            r6[r2] = r10
            int r2 = r2 + 1
            goto Lb
        L20:
            com.daaw.Tp3 r3 = r13.B
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            long r14 = r3.f(r4, r5, r6, r7, r8)
            boolean r2 = r13.j()
            r3 = 0
            if (r2 == 0) goto L3a
            int r2 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r2 != 0) goto L3a
            r7 = r3
            goto L3c
        L3a:
            r7 = r18
        L3c:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13.E = r11
            r2 = 1
            int r5 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r5 == 0) goto L5a
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 < 0) goto L59
            long r3 = r13.F
            r7 = -9223372036854775808
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L5a
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 > 0) goto L59
            goto L5a
        L59:
            r2 = 0
        L5a:
            com.daaw.AbstractC6048km2.f(r2)
        L5d:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            r2 = r6[r1]
            if (r2 != 0) goto L69
            com.daaw.zp3[] r2 = r13.D
            r2[r1] = r10
            goto L7a
        L69:
            com.daaw.zp3[] r3 = r13.D
            r4 = r3[r1]
            if (r4 == 0) goto L73
            com.daaw.dr3 r4 = r4.a
            if (r4 == r2) goto L7a
        L73:
            com.daaw.zp3 r4 = new com.daaw.zp3
            r4.<init>(r13, r2)
            r3[r1] = r4
        L7a:
            com.daaw.zp3[] r2 = r13.D
            r2 = r2[r1]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5d
        L83:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Ap3.f(com.daaw.ws3[], boolean[], com.daaw.dr3[], boolean[], long):long");
    }

    @Override // com.daaw.Tp3
    public final void g(Sp3 sp3, long j) {
        this.C = sp3;
        this.B.g(this, j);
    }

    @Override // com.daaw.Tp3
    public final void h(long j, boolean z) {
        this.B.h(j, false);
    }

    @Override // com.daaw.InterfaceC4389er3
    public final /* bridge */ /* synthetic */ void i(InterfaceC4678fr3 interfaceC4678fr3) {
        Sp3 sp3 = this.C;
        sp3.getClass();
        sp3.i(this);
    }

    public final boolean j() {
        return this.E != -9223372036854775807L;
    }

    @Override // com.daaw.Tp3
    public final long k(long j, C3777cg3 c3777cg3) {
        if (j == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(c3777cg3.a, j));
        long j2 = c3777cg3.b;
        long j3 = this.F;
        long jMax2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (jMax != c3777cg3.a || jMax2 != c3777cg3.b) {
            c3777cg3 = new C3777cg3(jMax, jMax2);
        }
        return this.B.k(j, c3777cg3);
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzb() {
        long jZzb = this.B.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.F;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzc() {
        long jZzc = this.B.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.F;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.Tp3
    public final long zzd() {
        if (j()) {
            long j = this.E;
            this.E = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j;
        }
        long jZzd2 = this.B.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC6048km2.f(jZzd2 >= 0);
        long j2 = this.F;
        AbstractC6048km2.f(j2 == Long.MIN_VALUE || jZzd2 <= j2);
        return jZzd2;
    }

    @Override // com.daaw.Tp3
    public final C6362lr3 zzh() {
        return this.B.zzh();
    }

    @Override // com.daaw.Tp3
    public final void zzk() {
        this.B.zzk();
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean zzp() {
        return this.B.zzp();
    }
}
