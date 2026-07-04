package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ho1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1090Ho1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 n = new InterfaceC1813On1() { // from class: com.daaw.Ao1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C1090Ho1(0)};
        }
    };
    public static final int[] o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final int s;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public int h;
    public long i;
    public InterfaceC1398Kn1 j;
    public InterfaceC8576to1 k;
    public InterfaceC6903no1 l;
    public boolean m;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        p = iArr;
        int i = AbstractC9004vJ2.a;
        Charset charset = UN2.c;
        q = "#!AMR\n".getBytes(charset);
        r = "#!AMR-WB\n".getBytes(charset);
        s = iArr[8];
    }

    public C1090Ho1(int i) {
    }

    public static boolean b(InterfaceC1190In1 interfaceC1190In1, byte[] bArr) {
        interfaceC1190In1.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((C9694xn1) interfaceC1190In1).h(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.daaw.InterfaceC1190In1 r12) throws com.daaw.QT1 {
        /*
            r11 = this;
            int r0 = r11.e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L8
            goto L55
        L8:
            r12.zzj()     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.a     // Catch: java.io.EOFException -> Lb5
            r4 = r12
            com.daaw.xn1 r4 = (com.daaw.C9694xn1) r4     // Catch: java.io.EOFException -> Lb5
            r4.h(r0, r3, r2, r3)     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.a     // Catch: java.io.EOFException -> Lb5
            r0 = r0[r3]     // Catch: java.io.EOFException -> Lb5
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L9f
            int r0 = r0 >> 3
            boolean r4 = r11.b     // Catch: java.io.EOFException -> Lb5
            r0 = r0 & 15
            if (r4 == 0) goto L2d
            r6 = 10
            if (r0 < r6) goto L38
            r6 = 13
            if (r0 <= r6) goto L2d
            goto L38
        L2d:
            if (r4 != 0) goto L7a
            r6 = 12
            if (r0 < r6) goto L38
            r6 = 14
            if (r0 > r6) goto L38
            goto L7a
        L38:
            if (r4 == 0) goto L3f
            int[] r4 = com.daaw.C1090Ho1.p     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
            goto L43
        L3f:
            int[] r4 = com.daaw.C1090Ho1.o     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
        L43:
            r11.d = r0     // Catch: java.io.EOFException -> Lb5
            r11.e = r0
            int r4 = r11.g
            if (r4 != r1) goto L4e
            r11.g = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto L55
            int r4 = r11.h
            int r4 = r4 + r2
            r11.h = r4
        L55:
            com.daaw.to1 r4 = r11.k
            int r12 = com.daaw.AbstractC8018ro1.a(r4, r12, r0, r2)
            if (r12 != r1) goto L5e
            return r1
        L5e:
            int r0 = r11.e
            int r0 = r0 - r12
            r11.e = r0
            if (r0 <= 0) goto L66
            return r3
        L66:
            com.daaw.to1 r4 = r11.k
            long r5 = r11.c
            int r8 = r11.d
            r9 = 0
            r10 = 0
            r7 = 1
            r4.c(r5, r7, r8, r9, r10)
            long r0 = r11.c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.c = r0
            return r3
        L7a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L81
            r12 = r3
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r2.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> Lb5
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            r2.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> Lb5
            com.daaw.QT1 r12 = com.daaw.QT1.a(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        L9f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r12.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> Lb5
            r12.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> Lb5
            com.daaw.QT1 r12 = com.daaw.QT1.a(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1090Ho1.a(com.daaw.In1):int");
    }

    public final boolean c(InterfaceC1190In1 interfaceC1190In1) throws EOFException, InterruptedIOException {
        byte[] bArr = q;
        if (b(interfaceC1190In1, bArr)) {
            this.b = false;
            ((C9694xn1) interfaceC1190In1).m(bArr.length, false);
            return true;
        }
        byte[] bArr2 = r;
        if (!b(interfaceC1190In1, bArr2)) {
            return false;
        }
        this.b = true;
        ((C9694xn1) interfaceC1190In1).m(bArr2.length, false);
        return true;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        this.i = 0L;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) {
        return c(interfaceC1190In1);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.j = interfaceC1398Kn1;
        this.k = interfaceC1398Kn1.o(0, 1);
        interfaceC1398Kn1.b();
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final int n(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) throws QT1 {
        AbstractC6048km2.b(this.k);
        int i = AbstractC9004vJ2.a;
        if (interfaceC1190In1.zzf() == 0 && !c(interfaceC1190In1)) {
            throw QT1.a("Could not find AMR header.", null);
        }
        if (!this.m) {
            this.m = true;
            boolean z = this.b;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            InterfaceC8576to1 interfaceC8576to1 = this.k;
            C1106Hs1 c1106Hs1 = new C1106Hs1();
            c1106Hs1.u(str);
            c1106Hs1.n(s);
            c1106Hs1.k0(1);
            c1106Hs1.v(i2);
            interfaceC8576to1.e(c1106Hs1.D());
        }
        int iA = a(interfaceC1190In1);
        if (this.f) {
            return iA;
        }
        C6624mo1 c6624mo1 = new C6624mo1(-9223372036854775807L, 0L);
        this.l = c6624mo1;
        this.j.p(c6624mo1);
        this.f = true;
        return iA;
    }
}
