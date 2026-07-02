package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Zr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2997Zr1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 j = new InterfaceC1813On1() { // from class: com.daaw.Yr1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C2997Zr1(0)};
        }
    };
    public final C5900kE2 c;
    public final GD2 d;
    public InterfaceC1398Kn1 e;
    public long f;
    public boolean h;
    public boolean i;
    public final C5239hs1 a = new C5239hs1(true, null);
    public final C5900kE2 b = new C5900kE2(2048);
    public long g = -1;

    public C2997Zr1(int i) {
        C5900kE2 c5900kE2 = new C5900kE2(10);
        this.c = c5900kE2;
        byte[] bArrI = c5900kE2.i();
        this.d = new GD2(bArrI, bArrI.length);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j2, long j3) {
        this.h = false;
        this.a.zze();
        this.f = j3;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
            c9694xn1.h(this.c.i(), 0, 10, false);
            this.c.g(0);
            if (this.c.w() != 4801587) {
                break;
            }
            this.c.h(3);
            int iT = this.c.t();
            i += iT + 10;
            c9694xn1.l(iT, false);
        }
        interfaceC1190In1.zzj();
        C9694xn1 c9694xn12 = (C9694xn1) interfaceC1190In1;
        c9694xn12.l(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            c9694xn12.h(this.c.i(), 0, 2, false);
            this.c.g(0);
            if (C5239hs1.e(this.c.y())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                c9694xn12.h(this.c.i(), 0, 4, false);
                this.d.j(14);
                int iD = this.d.d(13);
                if (iD <= 6) {
                    i2++;
                    interfaceC1190In1.zzj();
                    c9694xn12.l(i2, false);
                } else {
                    c9694xn12.l(iD - 6, false);
                    i4 += iD;
                }
            } else {
                i2++;
                interfaceC1190In1.zzj();
                c9694xn12.l(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.e = interfaceC1398Kn1;
        this.a.d(interfaceC1398Kn1, new C4118dt1(Integer.MIN_VALUE, 0, 1));
        interfaceC1398Kn1.b();
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final int n(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) {
        AbstractC6048km2.b(this.e);
        int iD = interfaceC1190In1.d(this.b.i(), 0, 2048);
        if (!this.i) {
            this.e.p(new C6624mo1(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (iD == -1) {
            return -1;
        }
        this.b.g(0);
        this.b.f(iD);
        if (!this.h) {
            this.a.c(this.f, 4);
            this.h = true;
        }
        this.a.a(this.b);
        return 0;
    }
}
