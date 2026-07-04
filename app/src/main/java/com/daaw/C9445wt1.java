package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.wt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9445wt1 implements InterfaceC1086Hn1 {
    public final C5900kE2 a = new C5900kE2(4);
    public final C7461po1 b = new C7461po1();

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        this.b.c(j);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) throws EOFException, InterruptedIOException {
        this.a.d(4);
        C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
        c9694xn1.h(this.a.i(), 0, 4, false);
        if (this.a.C() == 1380533830) {
            c9694xn1.l(4, false);
            this.a.d(4);
            c9694xn1.h(this.a.i(), 0, 4, false);
            if (this.a.C() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.b.b(interfaceC1398Kn1, "image/webp");
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final int n(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) {
        return this.b.a(interfaceC1190In1, c6057ko1);
    }
}
