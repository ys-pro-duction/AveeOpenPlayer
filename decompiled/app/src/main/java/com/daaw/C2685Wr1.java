package com.daaw;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Wr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2685Wr1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 d = new InterfaceC1813On1() { // from class: com.daaw.Vr1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C2685Wr1()};
        }
    };
    public final C2789Xr1 a = new C2789Xr1(null);
    public final C5900kE2 b = new C5900kE2(16384);
    public boolean c;

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        this.c = false;
        this.a.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r18.zzj();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if ((r7 - r5) >= 8192) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        return false;
     */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(com.daaw.InterfaceC1190In1 r18) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r17 = this;
            r0 = 2
            r1 = 1
            com.daaw.kE2 r2 = new com.daaw.kE2
            r3 = 10
            r2.<init>(r3)
            r4 = 0
            r5 = 0
        Lb:
            byte[] r6 = r2.i()
            r7 = r18
            com.daaw.xn1 r7 = (com.daaw.C9694xn1) r7
            r7.h(r6, r4, r3, r4)
            r2.g(r4)
            int r6 = r2.w()
            r8 = 4801587(0x494433, float:6.728456E-39)
            r9 = 3
            if (r6 == r8) goto La1
            r18.zzj()
            r6 = r18
            com.daaw.xn1 r6 = (com.daaw.C9694xn1) r6
            r6.l(r5, r4)
            r7 = r5
        L2e:
            r3 = 0
        L2f:
            byte[] r8 = r2.i()
            r10 = 7
            r6.h(r8, r4, r10, r4)
            r2.g(r4)
            int r8 = r2.y()
            r11 = 44096(0xac40, float:6.1792E-41)
            r12 = 44097(0xac41, float:6.1793E-41)
            if (r8 == r11) goto L57
            if (r8 == r12) goto L57
            r18.zzj()
            int r7 = r7 + r1
            int r3 = r7 - r5
            r8 = 8192(0x2000, float:1.148E-41)
            if (r3 >= r8) goto L56
            r6.l(r7, r4)
            goto L2e
        L56:
            return r4
        L57:
            int r3 = r3 + r1
            r11 = 4
            if (r3 < r11) goto L5c
            return r1
        L5c:
            byte[] r13 = r2.i()
            int[] r14 = com.daaw.AbstractC4656fn1.a
            int r14 = r13.length
            r15 = -1
            if (r14 >= r10) goto L6a
            r0 = -1
            r16 = 2
            goto L97
        L6a:
            r14 = r13[r0]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r16 = 2
            r0 = r13[r9]
            int r14 = r14 << 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r14) goto L91
            r0 = r13[r11]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r11 = 5
            r11 = r13[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            int r11 = r11 << 8
            r14 = 6
            r13 = r13[r14]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r0 = r0 | r11
            r0 = r0 | r13
            goto L92
        L91:
            r10 = 4
        L92:
            if (r8 != r12) goto L96
            int r10 = r10 + 2
        L96:
            int r0 = r0 + r10
        L97:
            if (r0 != r15) goto L9a
            return r4
        L9a:
            int r0 = r0 + (-7)
            r6.l(r0, r4)
            r0 = 2
            goto L2f
        La1:
            r16 = 2
            r2.h(r9)
            int r0 = r2.t()
            int r6 = r0 + 10
            int r5 = r5 + r6
            r7.l(r0, r4)
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2685Wr1.l(com.daaw.In1):boolean");
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.a.d(interfaceC1398Kn1, new C4118dt1(Integer.MIN_VALUE, 0, 1));
        interfaceC1398Kn1.b();
        interfaceC1398Kn1.p(new C6624mo1(-9223372036854775807L, 0L));
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final int n(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) {
        int iD = interfaceC1190In1.d(this.b.i(), 0, 16384);
        if (iD == -1) {
            return -1;
        }
        this.b.g(0);
        this.b.f(iD);
        if (!this.c) {
            this.a.c(0L, 4);
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }
}
