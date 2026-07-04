package com.daaw;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Tr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2373Tr1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 d = new InterfaceC1813On1() { // from class: com.daaw.Sr1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C2373Tr1()};
        }
    };
    public final C2477Ur1 a = new C2477Ur1(null);
    public final C5900kE2 b = new C5900kE2(2786);
    public boolean c;

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        this.c = false;
        this.a.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if ((r5 - r3) >= 8192) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r9.zzj();
        r5 = r5 + 1;
     */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(com.daaw.InterfaceC1190In1 r9) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r8 = this;
            com.daaw.kE2 r0 = new com.daaw.kE2
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.i()
            r5 = r9
            com.daaw.xn1 r5 = (com.daaw.C9694xn1) r5
            r5.h(r4, r2, r1, r2)
            r0.g(r2)
            int r4 = r0.w()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L65
            r9.zzj()
            r4 = r9
            com.daaw.xn1 r4 = (com.daaw.C9694xn1) r4
            r4.l(r3, r2)
            r5 = r3
        L29:
            r1 = 0
        L2a:
            byte[] r6 = r0.i()
            r7 = 6
            r4.h(r6, r2, r7, r2)
            r0.g(r2)
            int r6 = r0.y()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4d
            r9.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r1 >= r6) goto L4c
            r4.l(r5, r2)
            goto L29
        L4c:
            return r2
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.i()
            int r6 = com.daaw.AbstractC3810cn1.b(r6)
            r7 = -1
            if (r6 != r7) goto L5f
            return r2
        L5f:
            int r6 = r6 + (-6)
            r4.l(r6, r2)
            goto L2a
        L65:
            r4 = 3
            r0.h(r4)
            int r4 = r0.t()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.l(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2373Tr1.l(com.daaw.In1):boolean");
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.a.d(interfaceC1398Kn1, new C4118dt1(Integer.MIN_VALUE, 0, 1));
        interfaceC1398Kn1.b();
        interfaceC1398Kn1.p(new C6624mo1(-9223372036854775807L, 0L));
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final int n(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) {
        int iD = interfaceC1190In1.d(this.b.i(), 0, 2786);
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
