package com.daaw;

/* JADX INFO: renamed from: com.daaw.No1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1713No1 implements InterfaceC1194Io1 {
    public final int a;
    public final int b;
    public final int c;

    public C1713No1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static C1713No1 a(C5900kE2 c5900kE2) {
        int iQ = c5900kE2.q();
        c5900kE2.h(8);
        int iQ2 = c5900kE2.q();
        int iQ3 = c5900kE2.q();
        c5900kE2.h(4);
        int iQ4 = c5900kE2.q();
        c5900kE2.h(12);
        return new C1713No1(iQ, iQ2, iQ3, iQ4);
    }

    @Override // com.daaw.InterfaceC1194Io1
    public final int zza() {
        return 1751742049;
    }
}
