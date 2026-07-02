package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.cp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3820cp1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 q = new InterfaceC1813On1() { // from class: com.daaw.bp1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C3820cp1()};
        }
    };
    public InterfaceC1398Kn1 f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public C3263ap1 o;
    public C4945gp1 p;
    public final C5900kE2 a = new C5900kE2(4);
    public final C5900kE2 b = new C5900kE2(9);
    public final C5900kE2 c = new C5900kE2(11);
    public final C5900kE2 d = new C5900kE2();
    public final C4098dp1 e = new C4098dp1();
    public int g = 1;

    private final void b() {
        if (this.n) {
            return;
        }
        this.f.p(new C6624mo1(-9223372036854775807L, 0L));
        this.n = true;
    }

    public final C5900kE2 a(InterfaceC1190In1 interfaceC1190In1) throws EOFException, InterruptedIOException {
        if (this.l > this.d.k()) {
            C5900kE2 c5900kE2 = this.d;
            int iK = c5900kE2.k();
            c5900kE2.e(new byte[Math.max(iK + iK, this.l)], 0);
        } else {
            this.d.g(0);
        }
        this.d.f(this.l);
        ((C9694xn1) interfaceC1190In1).f(this.d.i(), 0, this.l, false);
        return this.d;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) throws EOFException, InterruptedIOException {
        C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
        c9694xn1.h(this.a.i(), 0, 3, false);
        this.a.g(0);
        if (this.a.w() != 4607062) {
            return false;
        }
        c9694xn1.h(this.a.i(), 0, 2, false);
        this.a.g(0);
        if ((this.a.y() & 250) != 0) {
            return false;
        }
        c9694xn1.h(this.a.i(), 0, 4, false);
        this.a.g(0);
        int iO = this.a.o();
        interfaceC1190In1.zzj();
        C9694xn1 c9694xn12 = (C9694xn1) interfaceC1190In1;
        c9694xn12.l(iO, false);
        c9694xn12.h(this.a.i(), 0, 4, false);
        this.a.g(0);
        return this.a.o() == 0;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.f = interfaceC1398Kn1;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.daaw.InterfaceC1190In1 r17, com.daaw.C6057ko1 r18) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3820cp1.n(com.daaw.In1, com.daaw.ko1):int");
    }
}
