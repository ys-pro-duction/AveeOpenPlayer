package com.daaw;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.lt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6370lt1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 h = new InterfaceC1813On1() { // from class: com.daaw.ht1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C6370lt1()};
        }
    };
    public InterfaceC1398Kn1 a;
    public InterfaceC8576to1 b;
    public InterfaceC5803jt1 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        InterfaceC5803jt1 interfaceC5803jt1 = this.e;
        if (interfaceC5803jt1 != null) {
            interfaceC5803jt1.a(j2);
        }
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) {
        return AbstractC8880ut1.c(interfaceC1190In1);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.a = interfaceC1398Kn1;
        this.b = interfaceC1398Kn1.o(0, 1);
        interfaceC1398Kn1.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.daaw.InterfaceC1190In1 r19, com.daaw.C6057ko1 r20) throws com.daaw.QT1, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6370lt1.n(com.daaw.In1, com.daaw.ko1):int");
    }
}
