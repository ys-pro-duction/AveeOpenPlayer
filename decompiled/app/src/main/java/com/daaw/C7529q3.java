package com.daaw;

import com.daaw.CO0;
import com.daaw.InterfaceC8103s61;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: renamed from: com.daaw.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7529q3 implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ e = new a();
    public static final int f = AbstractC6280lb1.v("ID3");
    public final long a;
    public final C7807r3 b;
    public final C2584Vs0 c;
    public boolean d;

    /* JADX INFO: renamed from: com.daaw.q3$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C7529q3()};
        }
    }

    public C7529q3() {
        this(0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if ((r5 - r4) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        r11.i();
        r5 = r5 + 1;
     */
    @Override // com.daaw.InterfaceC8715uJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(com.daaw.InterfaceC9001vJ r11) {
        /*
            r10 = this;
            com.daaw.Vs0 r0 = new com.daaw.Vs0
            r1 = 10
            r0.<init>(r1)
            com.daaw.Us0 r2 = new com.daaw.Us0
            byte[] r3 = r0.a
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L10:
            byte[] r5 = r0.a
            r11.k(r5, r3, r1)
            r0.J(r3)
            int r5 = r0.A()
            int r6 = com.daaw.C7529q3.f
            if (r5 == r6) goto L74
            r11.i()
            r11.h(r4)
            r5 = r4
        L27:
            r1 = 0
            r6 = 0
        L29:
            byte[] r7 = r0.a
            r8 = 2
            r11.k(r7, r3, r8)
            r0.J(r3)
            int r7 = r0.D()
            r8 = 65526(0xfff6, float:9.1821E-41)
            r7 = r7 & r8
            r8 = 65520(0xfff0, float:9.1813E-41)
            if (r7 == r8) goto L4f
            r11.i()
            int r5 = r5 + 1
            int r1 = r5 - r4
            r6 = 8192(0x2000, float:1.148E-41)
            if (r1 < r6) goto L4b
            return r3
        L4b:
            r11.h(r5)
            goto L27
        L4f:
            r7 = 1
            int r1 = r1 + r7
            r8 = 4
            if (r1 < r8) goto L59
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 <= r9) goto L59
            return r7
        L59:
            byte[] r7 = r0.a
            r11.k(r7, r3, r8)
            r7 = 14
            r2.m(r7)
            r7 = 13
            int r7 = r2.h(r7)
            r8 = 6
            if (r7 > r8) goto L6d
            return r3
        L6d:
            int r8 = r7 + (-6)
            r11.h(r8)
            int r6 = r6 + r7
            goto L29
        L74:
            r5 = 3
            r0.K(r5)
            int r5 = r0.w()
            int r6 = r5 + 10
            int r4 = r4 + r6
            r11.h(r5)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7529q3.c(com.daaw.vJ):boolean");
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        int iC = interfaceC9001vJ.c(this.c.a, 0, RCHTTPStatusCodes.SUCCESS);
        if (iC == -1) {
            return -1;
        }
        this.c.J(0);
        this.c.I(iC);
        if (!this.d) {
            this.b.e(this.a, true);
            this.d = true;
        }
        this.b.a(this.c);
        return 0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        this.d = false;
        this.b.b();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.b.d(interfaceC9838yJ, new InterfaceC8103s61.d(0, 1));
        interfaceC9838yJ.n();
        interfaceC9838yJ.b(new CO0.b(-9223372036854775807L));
    }

    public C7529q3(long j) {
        this.a = j;
        this.b = new C7807r3(true);
        this.c = new C2584Vs0(RCHTTPStatusCodes.SUCCESS);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
