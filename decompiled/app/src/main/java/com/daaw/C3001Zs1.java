package com.daaw;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Zs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3001Zs1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 q = new InterfaceC1813On1() { // from class: com.daaw.Ws1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C3001Zs1(0)};
        }
    };
    public final List a;
    public final C5900kE2 b;
    public final SparseIntArray c;
    public final InterfaceC3840ct1 d;
    public final SparseArray e;
    public final SparseBooleanArray f;
    public final SparseBooleanArray g;
    public final C2585Vs1 h;
    public C2481Us1 i;
    public InterfaceC1398Kn1 j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;

    public C3001Zs1(int i) {
        this(1, new C5916kI2(0L), new C5517is1(0), 112800);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.a
            int r10 = r10.size()
            r11 = 0
            r0 = 0
        L8:
            r1 = 0
            if (r0 >= r10) goto L37
            java.util.List r3 = r9.a
            java.lang.Object r3 = r3.get(r0)
            com.daaw.kI2 r3 = (com.daaw.C5916kI2) r3
            long r4 = r3.e()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L31
            long r4 = r3.c()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L34
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 == 0) goto L34
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 == 0) goto L34
        L31:
            r3.f(r12)
        L34:
            int r0 = r0 + 1
            goto L8
        L37:
            int r10 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r10 == 0) goto L42
            com.daaw.Us1 r10 = r9.i
            if (r10 == 0) goto L42
            r10.d(r12)
        L42:
            com.daaw.kE2 r10 = r9.b
            r10.d(r11)
            android.util.SparseIntArray r10 = r9.c
            r10.clear()
            r10 = 0
        L4d:
            android.util.SparseArray r12 = r9.e
            int r12 = r12.size()
            if (r10 >= r12) goto L63
            android.util.SparseArray r12 = r9.e
            java.lang.Object r12 = r12.valueAt(r10)
            com.daaw.et1 r12 = (com.daaw.InterfaceC4397et1) r12
            r12.zzc()
            int r10 = r10 + 1
            goto L4d
        L63:
            r9.o = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3001Zs1.k(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(com.daaw.InterfaceC1190In1 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            com.daaw.kE2 r0 = r6.b
            byte[] r0 = r0.i()
            com.daaw.xn1 r7 = (com.daaw.C9694xn1) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.h(r0, r2, r1, r2)
            r1 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.m(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3001Zs1.l(com.daaw.In1):boolean");
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.j = interfaceC1398Kn1;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01b1  */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.daaw.InterfaceC1190In1 r20, com.daaw.C6057ko1 r21) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3001Zs1.n(com.daaw.In1, com.daaw.ko1):int");
    }

    public C3001Zs1(int i, C5916kI2 c5916kI2, InterfaceC3840ct1 interfaceC3840ct1, int i2) {
        this.d = interfaceC3840ct1;
        this.a = Collections.singletonList(c5916kI2);
        this.b = new C5900kE2(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f = sparseBooleanArray;
        this.g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.e = sparseArray;
        this.c = new SparseIntArray();
        this.h = new C2585Vs1(112800);
        this.j = InterfaceC1398Kn1.s;
        this.p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.e.put(sparseArray2.keyAt(i3), (InterfaceC4397et1) sparseArray2.valueAt(i3));
        }
        this.e.put(0, new C2167Rs1(new C2793Xs1(this)));
    }
}
