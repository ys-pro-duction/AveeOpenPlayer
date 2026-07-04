package com.daaw;

/* JADX INFO: renamed from: com.daaw.Mo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1609Mo1 implements InterfaceC1086Hn1 {
    public int c;
    public C1713No1 e;
    public long h;
    public C1921Po1 i;
    public int m;
    public boolean n;
    public final C5900kE2 a = new C5900kE2(12);
    public final C1506Lo1 b = new C1506Lo1(null);
    public InterfaceC1398Kn1 d = new C0878Fn1();
    public C1921Po1[] g = new C1921Po1[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    public final C1921Po1 b(int i) {
        for (C1921Po1 c1921Po1 : this.g) {
            if (c1921Po1.g(i)) {
                return c1921Po1;
            }
        }
        return null;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        int i;
        this.h = -1L;
        this.i = null;
        for (C1921Po1 c1921Po1 : this.g) {
            c1921Po1.f(j);
        }
        if (j != 0) {
            i = 6;
        } else {
            if (this.g.length == 0) {
                this.c = 0;
                return;
            }
            i = 3;
        }
        this.c = i;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) {
        ((C9694xn1) interfaceC1190In1).h(this.a.i(), 0, 12, false);
        this.a.g(0);
        if (this.a.q() != 1179011410) {
            return false;
        }
        this.a.h(4);
        return this.a.q() == 541677121;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.c = 0;
        this.d = interfaceC1398Kn1;
        this.h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0304  */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.daaw.InterfaceC1190In1 r28, com.daaw.C6057ko1 r29) throws com.daaw.QT1, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1609Mo1.n(com.daaw.In1, com.daaw.ko1):int");
    }
}
