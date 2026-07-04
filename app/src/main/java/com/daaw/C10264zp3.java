package com.daaw;

/* JADX INFO: renamed from: com.daaw.zp3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10264zp3 implements InterfaceC4110dr3 {
    public final InterfaceC4110dr3 a;
    public boolean b;
    public final /* synthetic */ Ap3 c;

    public C10264zp3(Ap3 ap3, InterfaceC4110dr3 interfaceC4110dr3) {
        this.c = ap3;
        this.a = interfaceC4110dr3;
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final int a(long j) {
        if (this.c.j()) {
            return -3;
        }
        return this.a.a(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.daaw.InterfaceC4110dr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.daaw.C5730je3 r13, com.daaw.H93 r14, int r15) {
        /*
            r12 = this;
            com.daaw.Ap3 r0 = r12.c
            boolean r1 = r0.j()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r12.b
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L14
            r14.c(r3)
            return r4
        L14:
            long r0 = r0.zzb()
            com.daaw.dr3 r5 = r12.a
            int r15 = r5.b(r13, r14, r15)
            r5 = -5
            r6 = -9223372036854775808
            if (r15 != r5) goto L4e
            com.daaw.Ut1 r14 = r13.a
            r14.getClass()
            int r15 = r14.B
            r0 = 0
            if (r15 != 0) goto L32
            int r15 = r14.C
            if (r15 == 0) goto L4d
            r15 = 0
        L32:
            com.daaw.Ap3 r1 = r12.c
            long r1 = r1.F
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            int r0 = r14.C
        L3d:
            com.daaw.Hs1 r14 = r14.b()
            r14.e(r15)
            r14.f(r0)
            com.daaw.Ut1 r14 = r14.D()
            r13.a = r14
        L4d:
            return r5
        L4e:
            com.daaw.Ap3 r13 = r12.c
            long r8 = r13.F
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 == 0) goto L72
            if (r15 != r4) goto L5e
            long r10 = r14.f
            int r13 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r13 >= 0) goto L68
        L5e:
            if (r15 != r2) goto L72
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 != 0) goto L72
            boolean r13 = r14.e
            if (r13 != 0) goto L72
        L68:
            r14.b()
            r14.c(r3)
            r13 = 1
            r12.b = r13
            return r4
        L72:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10264zp3.b(com.daaw.je3, com.daaw.H93, int):int");
    }

    public final void c() {
        this.b = false;
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final boolean zze() {
        return !this.c.j() && this.a.zze();
    }
}
