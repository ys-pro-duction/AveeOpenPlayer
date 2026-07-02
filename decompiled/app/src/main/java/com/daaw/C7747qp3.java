package com.daaw;

/* JADX INFO: renamed from: com.daaw.qp3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7747qp3 implements InterfaceC8867uq3 {
    public final InterfaceC1813On1 a;
    public InterfaceC1086Hn1 b;
    public InterfaceC1190In1 c;

    public C7747qp3(InterfaceC1813On1 interfaceC1813On1) {
        this.a = interfaceC1813On1;
    }

    @Override // com.daaw.InterfaceC8867uq3
    public final int a(C6057ko1 c6057ko1) {
        InterfaceC1086Hn1 interfaceC1086Hn1 = this.b;
        interfaceC1086Hn1.getClass();
        InterfaceC1190In1 interfaceC1190In1 = this.c;
        interfaceC1190In1.getClass();
        return interfaceC1086Hn1.n(interfaceC1190In1, c6057ko1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // com.daaw.InterfaceC8867uq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.daaw.InterfaceC8304sp3 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.daaw.InterfaceC1398Kn1 r15) throws com.daaw.C6641mr3 {
        /*
            r7 = this;
            com.daaw.xn1 r1 = new com.daaw.xn1
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.c = r1
            com.daaw.Hn1 r8 = r7.b
            if (r8 == 0) goto Lf
            return
        Lf:
            com.daaw.On1 r8 = r7.a
            com.daaw.Hn1[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r11 = 0
            r12 = 1
            if (r10 != r12) goto L20
            r8 = r8[r11]
            r7.b = r8
            goto Lb8
        L20:
            r13 = 0
        L21:
            if (r13 >= r10) goto L73
            r14 = r8[r13]
            boolean r0 = r14.l(r1)     // Catch: java.lang.Throwable -> L34 java.io.EOFException -> L37
            if (r0 == 0) goto L39
            r7.b = r14     // Catch: java.lang.Throwable -> L34 java.io.EOFException -> L37
            com.daaw.AbstractC6048km2.f(r12)
            r1.zzj()
            goto L73
        L34:
            r0 = move-exception
            r8 = r0
            goto L4f
        L37:
            goto L63
        L39:
            com.daaw.Hn1 r14 = r7.b
            if (r14 != 0) goto L45
            long r5 = r1.zzf()
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto L47
        L45:
            r14 = 1
            goto L48
        L47:
            r14 = 0
        L48:
            com.daaw.AbstractC6048km2.f(r14)
            r1.zzj()
            goto L70
        L4f:
            com.daaw.Hn1 r9 = r7.b
            if (r9 != 0) goto L5b
            long r9 = r1.zzf()
            int r13 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r13 != 0) goto L5c
        L5b:
            r11 = 1
        L5c:
            com.daaw.AbstractC6048km2.f(r11)
            r1.zzj()
            throw r8
        L63:
            com.daaw.Hn1 r14 = r7.b
            if (r14 != 0) goto L45
            long r5 = r1.zzf()
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto L47
            goto L45
        L70:
            int r13 = r13 + 1
            goto L21
        L73:
            com.daaw.Hn1 r10 = r7.b
            if (r10 != 0) goto Lb8
            com.daaw.mr3 r10 = new com.daaw.mr3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L7e:
            int r13 = r8.length
            if (r11 >= r13) goto L9a
            r14 = r8[r11]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r12.append(r14)
            int r13 = r13 + (-1)
            if (r11 >= r13) goto L97
            java.lang.String r13 = ", "
            r12.append(r13)
        L97:
            int r11 = r11 + 1
            goto L7e
        L9a:
            java.lang.String r8 = r12.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        Lb8:
            com.daaw.Hn1 r8 = r7.b
            r8.m(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7747qp3.b(com.daaw.sp3, android.net.Uri, java.util.Map, long, long, com.daaw.Kn1):void");
    }

    @Override // com.daaw.InterfaceC8867uq3
    public final void c(long j, long j2) {
        InterfaceC1086Hn1 interfaceC1086Hn1 = this.b;
        interfaceC1086Hn1.getClass();
        interfaceC1086Hn1.k(j, j2);
    }

    @Override // com.daaw.InterfaceC8867uq3
    public final long zzb() {
        InterfaceC1190In1 interfaceC1190In1 = this.c;
        if (interfaceC1190In1 != null) {
            return interfaceC1190In1.zzf();
        }
        return -1L;
    }

    @Override // com.daaw.InterfaceC8867uq3
    public final void zzc() {
        InterfaceC1086Hn1 interfaceC1086Hn1 = this.b;
        if (interfaceC1086Hn1 != null && (interfaceC1086Hn1 instanceof C0465Bq1)) {
            ((C0465Bq1) interfaceC1086Hn1).a();
        }
    }

    @Override // com.daaw.InterfaceC8867uq3
    public final void zze() {
        if (this.b != null) {
            this.b = null;
        }
        this.c = null;
    }
}
