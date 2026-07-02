package com.daaw;

import com.google.android.gms.internal.ads.zzafu;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.qp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7745qp1 implements InterfaceC1086Hn1 {
    public InterfaceC1398Kn1 b;
    public int c;
    public int d;
    public int e;
    public zzafu g;
    public InterfaceC1190In1 h;
    public C8581tp1 i;
    public C5793jr1 j;
    public final C5900kE2 a = new C5900kE2(6);
    public long f = -1;

    private final int a(InterfaceC1190In1 interfaceC1190In1) {
        this.a.d(2);
        ((C9694xn1) interfaceC1190In1).h(this.a.i(), 0, 2, false);
        return this.a.y();
    }

    private final void b() {
        c(new zzbx[0]);
        InterfaceC1398Kn1 interfaceC1398Kn1 = this.b;
        interfaceC1398Kn1.getClass();
        interfaceC1398Kn1.b();
        this.b.p(new C6624mo1(-9223372036854775807L, 0L));
        this.c = 6;
    }

    public final void c(zzbx... zzbxVarArr) {
        InterfaceC1398Kn1 interfaceC1398Kn1 = this.b;
        interfaceC1398Kn1.getClass();
        InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(1024, 4);
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.b("image/jpeg");
        c1106Hs1.o(new zzby(-9223372036854775807L, zzbxVarArr));
        interfaceC8576to1O.e(c1106Hs1.D());
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            C5793jr1 c5793jr1 = this.j;
            c5793jr1.getClass();
            c5793jr1.k(j, j2);
        }
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) throws EOFException, InterruptedIOException {
        if (a(interfaceC1190In1) != 65496) {
            return false;
        }
        int iA = a(interfaceC1190In1);
        this.d = iA;
        if (iA == 65504) {
            this.a.d(2);
            C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
            c9694xn1.h(this.a.i(), 0, 2, false);
            c9694xn1.l(this.a.y() - 2, false);
            iA = a(interfaceC1190In1);
            this.d = iA;
        }
        if (iA == 65505) {
            C9694xn1 c9694xn12 = (C9694xn1) interfaceC1190In1;
            c9694xn12.l(2, false);
            this.a.d(6);
            c9694xn12.h(this.a.i(), 0, 6, false);
            if (this.a.C() == 1165519206 && this.a.y() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.b = interfaceC1398Kn1;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.daaw.InterfaceC1190In1 r26, com.daaw.C6057ko1 r27) throws com.daaw.QT1, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7745qp1.n(com.daaw.In1, com.daaw.ko1):int");
    }
}
