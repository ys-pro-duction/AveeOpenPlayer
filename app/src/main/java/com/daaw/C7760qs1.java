package com.daaw;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.qs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7760qs1 implements InterfaceC6365ls1 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final C4965gt1 a;
    public C7481ps1 f;
    public long g;
    public String h;
    public InterfaceC8576to1 i;
    public boolean j;
    public final boolean[] c = new boolean[4];
    public final C7202os1 d = new C7202os1(128);
    public long k = -9223372036854775807L;
    public final C0369As1 e = new C0369As1(178, 128);
    public final C5900kE2 b = new C5900kE2();

    public C7760qs1(C4965gt1 c4965gt1) {
        this.a = c4965gt1;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void a(C5900kE2 c5900kE2) {
        int i;
        float f;
        float f2;
        int i2 = 3;
        AbstractC6048km2.b(this.f);
        AbstractC6048km2.b(this.i);
        int iL = c5900kE2.l();
        int iM = c5900kE2.m();
        byte[] bArrI = c5900kE2.i();
        this.g += (long) c5900kE2.j();
        this.i.b(c5900kE2, c5900kE2.j());
        while (true) {
            int iA = AbstractC4556fR2.a(bArrI, iL, iM, this.c);
            if (iA == iM) {
                break;
            }
            int i3 = iA + 3;
            int i4 = c5900kE2.i()[i3] & 255;
            int i5 = iA - iL;
            if (!this.j) {
                if (i5 > 0) {
                    this.d.a(bArrI, iL, iA);
                }
                if (this.d.c(i4, i5 < 0 ? -i5 : 0)) {
                    InterfaceC8576to1 interfaceC8576to1 = this.i;
                    C7202os1 c7202os1 = this.d;
                    int i6 = c7202os1.d;
                    String str = this.h;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(c7202os1.e, c7202os1.c);
                    GD2 gd2 = new GD2(bArrCopyOf, bArrCopyOf.length);
                    gd2.m(i6);
                    gd2.m(4);
                    gd2.k();
                    gd2.l(8);
                    if (gd2.n()) {
                        gd2.l(4);
                        gd2.l(i2);
                    }
                    int iD = gd2.d(4);
                    if (iD == 15) {
                        int iD2 = gd2.d(8);
                        int iD3 = gd2.d(8);
                        if (iD3 == 0) {
                            AbstractC3305ay2.f("H263Reader", "Invalid aspect ratio");
                            f2 = 1.0f;
                        } else {
                            f = iD2 / iD3;
                            f2 = f;
                        }
                    } else if (iD < 7) {
                        f = l[iD];
                        f2 = f;
                    } else {
                        AbstractC3305ay2.f("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (gd2.n()) {
                        gd2.l(2);
                        gd2.l(1);
                        if (gd2.n()) {
                            gd2.l(15);
                            gd2.k();
                            gd2.l(15);
                            gd2.k();
                            gd2.l(15);
                            gd2.k();
                            gd2.l(3);
                            gd2.l(11);
                            gd2.k();
                            gd2.l(15);
                            gd2.k();
                        }
                    }
                    if (gd2.d(2) != 0) {
                        AbstractC3305ay2.f("H263Reader", "Unhandled video object layer shape");
                    }
                    gd2.k();
                    int iD4 = gd2.d(16);
                    gd2.k();
                    if (gd2.n()) {
                        if (iD4 == 0) {
                            AbstractC3305ay2.f("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = iD4 - 1;
                            int i8 = 0;
                            while (i7 > 0) {
                                i7 >>= 1;
                                i8++;
                            }
                            gd2.l(i8);
                        }
                    }
                    gd2.k();
                    int iD5 = gd2.d(13);
                    gd2.k();
                    int iD6 = gd2.d(13);
                    gd2.k();
                    gd2.k();
                    C1106Hs1 c1106Hs1 = new C1106Hs1();
                    c1106Hs1.j(str);
                    c1106Hs1.u("video/mp4v-es");
                    c1106Hs1.C(iD5);
                    c1106Hs1.h(iD6);
                    c1106Hs1.r(f2);
                    c1106Hs1.k(Collections.singletonList(bArrCopyOf));
                    interfaceC8576to1.e(c1106Hs1.D());
                    this.j = true;
                }
            }
            this.f.a(bArrI, iL, iA);
            C0369As1 c0369As1 = this.e;
            if (i5 > 0) {
                c0369As1.a(bArrI, iL, iA);
                i = 0;
            } else {
                i = -i5;
            }
            if (this.e.d(i)) {
                C0369As1 c0369As12 = this.e;
                int iB = AbstractC4556fR2.b(c0369As12.d, c0369As12.e);
                C5900kE2 c5900kE22 = this.b;
                int i9 = AbstractC9004vJ2.a;
                c5900kE22.e(this.e.d, iB);
                this.a.a(this.k, this.b);
            }
            if (i4 == 178) {
                if (c5900kE2.i()[iA + 2] == 1) {
                    this.e.c(178);
                }
                i4 = 178;
            }
            int i10 = iM - iA;
            this.f.b(this.g - ((long) i10), i10, this.j);
            this.f.c(i4, this.k);
            iL = i3;
            i2 = 3;
        }
        if (!this.j) {
            this.d.a(bArrI, iL, iM);
        }
        this.f.a(bArrI, iL, iM);
        this.e.a(bArrI, iL, iM);
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
        AbstractC6048km2.b(this.f);
        if (z) {
            this.f.b(this.g, 0, this.j);
            this.f.d();
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void d(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        c4118dt1.c();
        this.h = c4118dt1.b();
        InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(c4118dt1.a(), 2);
        this.i = interfaceC8576to1O;
        this.f = new C7481ps1(interfaceC8576to1O);
        this.a.b(interfaceC1398Kn1, c4118dt1);
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        AbstractC4556fR2.f(this.c);
        this.d.b();
        C7481ps1 c7481ps1 = this.f;
        if (c7481ps1 != null) {
            c7481ps1.d();
        }
        this.e.b();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
}
