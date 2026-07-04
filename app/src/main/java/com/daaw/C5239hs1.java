package com.daaw;

import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.hs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5239hs1 implements InterfaceC6365ls1 {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final GD2 b = new GD2(new byte[7], 7);
    public final C5900kE2 c = new C5900kE2(Arrays.copyOf(v, 10));
    public final String d;
    public String e;
    public InterfaceC8576to1 f;
    public InterfaceC8576to1 g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public InterfaceC8576to1 t;
    public long u;

    public C5239hs1(boolean z, String str) {
        g();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.a = z;
        this.d = str;
    }

    public static boolean e(int i) {
        return (i & 65526) == 65520;
    }

    public static final boolean k(byte b, byte b2) {
        return e((b2 & 255) | 65280);
    }

    public static final boolean l(C5900kE2 c5900kE2, byte[] bArr, int i) {
        if (c5900kE2.j() < i) {
            return false;
        }
        c5900kE2.c(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x026a, code lost:
    
        r20.k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x026e, code lost:
    
        if (r20.l != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0270, code lost:
    
        r20.h = 1;
        r20.i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0276, code lost:
    
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0279, code lost:
    
        r21.g(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025c, code lost:
    
        r20.o = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0265, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0267, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0269, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    @Override // com.daaw.InterfaceC6365ls1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.daaw.C5900kE2 r21) {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5239hs1.a(com.daaw.kE2):void");
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void d(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        c4118dt1.c();
        this.e = c4118dt1.b();
        InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(c4118dt1.a(), 1);
        this.f = interfaceC8576to1O;
        this.t = interfaceC8576to1O;
        if (!this.a) {
            this.g = new C0982Gn1();
            return;
        }
        c4118dt1.c();
        InterfaceC8576to1 interfaceC8576to1O2 = interfaceC1398Kn1.o(c4118dt1.a(), 5);
        this.g = interfaceC8576to1O2;
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.j(c4118dt1.b());
        c1106Hs1.u("application/id3");
        interfaceC8576to1O2.e(c1106Hs1.D());
    }

    public final void f() {
        this.l = false;
        g();
    }

    public final void g() {
        this.h = 0;
        this.i = 0;
        this.j = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    public final void h() {
        this.h = 3;
        this.i = 0;
    }

    public final void i(InterfaceC8576to1 interfaceC8576to1, long j, int i, int i2) {
        this.h = 4;
        this.i = i;
        this.t = interfaceC8576to1;
        this.u = j;
        this.r = i2;
    }

    public final boolean j(C5900kE2 c5900kE2, byte[] bArr, int i) {
        int iMin = Math.min(c5900kE2.j(), i - this.i);
        c5900kE2.c(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        this.s = -9223372036854775807L;
        f();
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
    }
}
