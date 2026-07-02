package com.daaw;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzaem;
import com.google.android.gms.internal.ads.zzby;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Zo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2985Zo1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 n = new InterfaceC1813On1() { // from class: com.daaw.Yo1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C2985Zo1(0)};
        }
    };
    public InterfaceC1398Kn1 d;
    public InterfaceC8576to1 e;
    public zzby g;
    public C2461Un1 h;
    public int i;
    public int j;
    public C2777Xo1 k;
    public int l;
    public long m;
    public final byte[] a = new byte[42];
    public final C5900kE2 b = new C5900kE2(new byte[32768], 0);
    public final C1917Pn1 c = new C1917Pn1();
    public int f = 0;

    public C2985Zo1(int i) {
    }

    public final long a(C5900kE2 c5900kE2, boolean z) {
        boolean zC;
        this.h.getClass();
        int iL = c5900kE2.l();
        while (iL <= c5900kE2.m() - 16) {
            c5900kE2.g(iL);
            if (AbstractC2043Qn1.c(c5900kE2, this.h, this.j, this.c)) {
                c5900kE2.g(iL);
                return this.c.a;
            }
            iL++;
        }
        if (!z) {
            c5900kE2.g(iL);
            return -1L;
        }
        while (iL <= c5900kE2.m() - this.i) {
            c5900kE2.g(iL);
            try {
                zC = AbstractC2043Qn1.c(c5900kE2, this.h, this.j, this.c);
            } catch (IndexOutOfBoundsException unused) {
                zC = false;
            }
            if (c5900kE2.l() <= c5900kE2.m() && zC) {
                c5900kE2.g(iL);
                return this.c.a;
            }
            iL++;
        }
        c5900kE2.g(c5900kE2.m());
        return -1L;
    }

    public final void b() {
        long j = this.m * 1000000;
        C2461Un1 c2461Un1 = this.h;
        int i = AbstractC9004vJ2.a;
        this.e.c(j / ((long) c2461Un1.e), 1, this.l, 0, null);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            C2777Xo1 c2777Xo1 = this.k;
            if (c2777Xo1 != null) {
                c2777Xo1.d(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.d(0);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) throws Throwable {
        AbstractC2147Rn1.a(interfaceC1190In1, false);
        C5900kE2 c5900kE2 = new C5900kE2(4);
        ((C9694xn1) interfaceC1190In1).h(c5900kE2.i(), 0, 4, false);
        return c5900kE2.C() == 1716281667;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.d = interfaceC1398Kn1;
        this.e = interfaceC1398Kn1.o(0, 1);
        interfaceC1398Kn1.b();
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final int n(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) throws Throwable {
        boolean zN;
        InterfaceC6903no1 c6624mo1;
        boolean z;
        int i = this.f;
        if (i == 0) {
            interfaceC1190In1.zzj();
            long jZze = interfaceC1190In1.zze();
            zzby zzbyVarA = AbstractC2147Rn1.a(interfaceC1190In1, true);
            ((C9694xn1) interfaceC1190In1).m((int) (interfaceC1190In1.zze() - jZze), false);
            this.g = zzbyVarA;
            this.f = 1;
            return 0;
        }
        if (i == 1) {
            ((C9694xn1) interfaceC1190In1).h(this.a, 0, 42, false);
            interfaceC1190In1.zzj();
            this.f = 2;
            return 0;
        }
        if (i == 2) {
            C5900kE2 c5900kE2 = new C5900kE2(4);
            ((C9694xn1) interfaceC1190In1).f(c5900kE2.i(), 0, 4, false);
            if (c5900kE2.C() != 1716281667) {
                throw QT1.a("Failed to read FLAC stream marker.", null);
            }
            this.f = 3;
            return 0;
        }
        if (i == 3) {
            C2461Un1 c2461Un1E = this.h;
            do {
                interfaceC1190In1.zzj();
                GD2 gd2 = new GD2(new byte[4], 4);
                C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
                c9694xn1.h(gd2.a, 0, 4, false);
                zN = gd2.n();
                int iD = gd2.d(7);
                int iD2 = gd2.d(24) + 4;
                if (iD == 0) {
                    byte[] bArr = new byte[38];
                    c9694xn1.f(bArr, 0, 38, false);
                    c2461Un1E = new C2461Un1(bArr, 4);
                } else {
                    if (c2461Un1E == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iD == 3) {
                        C5900kE2 c5900kE22 = new C5900kE2(iD2);
                        c9694xn1.f(c5900kE22.i(), 0, iD2, false);
                        c2461Un1E = c2461Un1E.f(AbstractC2147Rn1.b(c5900kE22));
                    } else if (iD == 4) {
                        C5900kE2 c5900kE23 = new C5900kE2(iD2);
                        c9694xn1.f(c5900kE23.i(), 0, iD2, false);
                        c5900kE23.h(4);
                        c2461Un1E = c2461Un1E.g(Arrays.asList(AbstractC10257zo1.c(c5900kE23, false, false).b));
                    } else if (iD == 6) {
                        C5900kE2 c5900kE24 = new C5900kE2(iD2);
                        c9694xn1.f(c5900kE24.i(), 0, iD2, false);
                        c5900kE24.h(4);
                        c2461Un1E = c2461Un1E.e(OP2.K(zzaem.a(c5900kE24)));
                    } else {
                        c9694xn1.m(iD2, false);
                    }
                }
                int i2 = AbstractC9004vJ2.a;
                this.h = c2461Un1E;
            } while (!zN);
            c2461Un1E.getClass();
            this.i = Math.max(c2461Un1E.c, 6);
            this.e.e(this.h.c(this.a, this.g));
            this.f = 4;
            return 0;
        }
        if (i == 4) {
            interfaceC1190In1.zzj();
            C5900kE2 c5900kE25 = new C5900kE2(2);
            ((C9694xn1) interfaceC1190In1).h(c5900kE25.i(), 0, 2, false);
            int iY = c5900kE25.y();
            if ((iY >> 2) != 16382) {
                interfaceC1190In1.zzj();
                throw QT1.a("First frame does not start with sync code.", null);
            }
            interfaceC1190In1.zzj();
            this.j = iY;
            InterfaceC1398Kn1 interfaceC1398Kn1 = this.d;
            int i3 = AbstractC9004vJ2.a;
            long jZzf = interfaceC1190In1.zzf();
            long jZzd = interfaceC1190In1.zzd();
            C2461Un1 c2461Un1 = this.h;
            c2461Un1.getClass();
            if (c2461Un1.k != null) {
                c6624mo1 = new C2253Sn1(c2461Un1, jZzf);
            } else if (jZzd == -1 || c2461Un1.j <= 0) {
                c6624mo1 = new C6624mo1(c2461Un1.a(), 0L);
            } else {
                C2777Xo1 c2777Xo1 = new C2777Xo1(c2461Un1, this.j, jZzf, jZzd);
                this.k = c2777Xo1;
                c6624mo1 = c2777Xo1.b();
            }
            interfaceC1398Kn1.p(c6624mo1);
            this.f = 5;
            return 0;
        }
        this.e.getClass();
        C2461Un1 c2461Un12 = this.h;
        c2461Un12.getClass();
        C2777Xo1 c2777Xo12 = this.k;
        if (c2777Xo12 != null && c2777Xo12.e()) {
            return c2777Xo12.a(interfaceC1190In1, c6057ko1);
        }
        if (this.m == -1) {
            this.m = AbstractC2043Qn1.b(interfaceC1190In1, c2461Un12);
            return 0;
        }
        C5900kE2 c5900kE26 = this.b;
        int iM = c5900kE26.m();
        if (iM < 32768) {
            int iD3 = interfaceC1190In1.d(c5900kE26.i(), iM, 32768 - iM);
            z = iD3 == -1;
            if (!z) {
                this.b.f(iM + iD3);
            } else if (this.b.j() == 0) {
                b();
                return -1;
            }
        } else {
            z = false;
        }
        C5900kE2 c5900kE27 = this.b;
        int iL = c5900kE27.l();
        int i4 = this.l;
        int i5 = this.i;
        if (i4 < i5) {
            c5900kE27.h(Math.min(i5 - i4, c5900kE27.j()));
        }
        long jA = a(this.b, z);
        C5900kE2 c5900kE28 = this.b;
        int iL2 = c5900kE28.l() - iL;
        c5900kE28.g(iL);
        AbstractC8018ro1.b(this.e, this.b, iL2);
        this.l += iL2;
        if (jA != -1) {
            b();
            this.l = 0;
            this.m = jA;
        }
        C5900kE2 c5900kE29 = this.b;
        if (c5900kE29.j() >= 16) {
            return 0;
        }
        int iJ = c5900kE29.j();
        System.arraycopy(c5900kE29.i(), c5900kE29.l(), c5900kE29.i(), 0, iJ);
        this.b.g(0);
        this.b.f(iJ);
        return 0;
    }
}
