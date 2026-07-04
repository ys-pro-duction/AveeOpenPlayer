package com.daaw;

/* JADX INFO: renamed from: com.daaw.Hr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1102Hr1 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final C5900kE2 g = new C5900kE2(255);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(InterfaceC1190In1 interfaceC1190In1, boolean z) throws QT1 {
        a();
        this.g.d(27);
        if (AbstractC1502Ln1.c(interfaceC1190In1, this.g.i(), 0, 27, z) && this.g.C() == 1332176723) {
            if (this.g.u() != 0) {
                if (z) {
                    return false;
                }
                throw QT1.c("unsupported bit stream revision");
            }
            this.a = this.g.u();
            this.b = this.g.z();
            this.g.A();
            this.g.A();
            this.g.A();
            int iU = this.g.u();
            this.c = iU;
            this.d = iU + 27;
            this.g.d(iU);
            if (AbstractC1502Ln1.c(interfaceC1190In1, this.g.i(), 0, this.c, z)) {
                for (int i = 0; i < this.c; i++) {
                    this.f[i] = this.g.u();
                    this.e += this.f[i];
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r10 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r9.zzf() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r9.c(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.daaw.InterfaceC1190In1 r9, long r10) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r8 = this;
            long r0 = r9.zzf()
            long r2 = r9.zze()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.daaw.AbstractC6048km2.d(r0)
            com.daaw.kE2 r0 = r8.g
            r1 = 4
            r0.d(r1)
        L1a:
            r2 = -1
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r2 = r9.zzf()
            r6 = 4
            long r2 = r2 + r6
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 < 0) goto L2c
            goto L55
        L2c:
            com.daaw.kE2 r2 = r8.g
            byte[] r2 = r2.i()
            boolean r2 = com.daaw.AbstractC1502Ln1.c(r9, r2, r4, r1, r5)
            if (r2 == 0) goto L55
            com.daaw.kE2 r0 = r8.g
            r0.g(r4)
            com.daaw.kE2 r0 = r8.g
            long r2 = r0.C()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L51
            r0 = r9
            com.daaw.xn1 r0 = (com.daaw.C9694xn1) r0
            r0.m(r5, r4)
            goto L1a
        L51:
            r9.zzj()
            return r5
        L55:
            if (r0 == 0) goto L5f
            long r1 = r9.zzf()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L66
        L5f:
            int r1 = r9.c(r5)
            r2 = -1
            if (r1 != r2) goto L55
        L66:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1102Hr1.c(com.daaw.In1, long):boolean");
    }
}
