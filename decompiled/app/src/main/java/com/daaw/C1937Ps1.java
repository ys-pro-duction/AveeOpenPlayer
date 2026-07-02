package com.daaw;

import android.net.Uri;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ps1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1937Ps1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 l = new InterfaceC1813On1() { // from class: com.daaw.Ns1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C1937Ps1()};
        }
    };
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public C0898Fs1 i;
    public InterfaceC1398Kn1 j;
    public boolean k;
    public final C5916kI2 a = new C5916kI2(0);
    public final C5900kE2 c = new C5900kE2(4096);
    public final SparseArray b = new SparseArray();
    public final C1002Gs1 d = new C1002Gs1();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(long r5, long r7) {
        /*
            r4 = this;
            com.daaw.kI2 r5 = r4.a
            long r0 = r5.e()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.c()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.f(r7)
        L24:
            com.daaw.Fs1 r5 = r4.i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.d(r7)
        L2c:
            android.util.SparseArray r5 = r4.b
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.b
            java.lang.Object r5 = r5.valueAt(r6)
            com.daaw.Os1 r5 = (com.daaw.C1833Os1) r5
            r5.b()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1937Ps1.k(long, long):void");
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
        c9694xn1.h(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c9694xn1.l(bArr[13] & 7, false);
        c9694xn1.h(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.j = interfaceC1398Kn1;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0146  */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.daaw.InterfaceC1190In1 r13, com.daaw.C6057ko1 r14) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1937Ps1.n(com.daaw.In1, com.daaw.ko1):int");
    }
}
