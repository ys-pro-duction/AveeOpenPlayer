package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.daaw.nq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6913nq1 implements InterfaceC7471pq1 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final C9430wq1 c = new C9430wq1();
    public InterfaceC7192oq1 d;
    public int e;
    public int f;
    public long g;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[LOOP:0: B:3:0x0005->B:37:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d A[SYNTHETIC] */
    @Override // com.daaw.InterfaceC7471pq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.daaw.InterfaceC1190In1 r14) throws com.daaw.QT1, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6913nq1.a(com.daaw.In1):boolean");
    }

    @Override // com.daaw.InterfaceC7471pq1
    public final void b(InterfaceC7192oq1 interfaceC7192oq1) {
        this.d = interfaceC7192oq1;
    }

    public final long c(InterfaceC1190In1 interfaceC1190In1, int i) throws EOFException, InterruptedIOException {
        ((C9694xn1) interfaceC1190In1).f(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
        }
        return j;
    }

    @Override // com.daaw.InterfaceC7471pq1
    public final void zzb() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }
}
