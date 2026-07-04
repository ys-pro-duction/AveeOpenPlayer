package com.daaw;

/* JADX INFO: renamed from: com.daaw.Oo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1817Oo1 implements InterfaceC1194Io1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public C1817Oo1(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public static C1817Oo1 a(C5900kE2 c5900kE2) {
        int iQ = c5900kE2.q();
        c5900kE2.h(12);
        int iQ2 = c5900kE2.q();
        int iQ3 = c5900kE2.q();
        int iQ4 = c5900kE2.q();
        c5900kE2.h(4);
        int iQ5 = c5900kE2.q();
        int iQ6 = c5900kE2.q();
        c5900kE2.h(8);
        return new C1817Oo1(iQ, iQ2, iQ3, iQ4, iQ5, iQ6);
    }

    @Override // com.daaw.InterfaceC1194Io1
    public final int zza() {
        return 1752331379;
    }
}
