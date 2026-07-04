package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Dr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0686Dr1 extends AbstractC1725Nr1 {
    public C2461Un1 n;
    public C0573Cr1 o;

    public static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.daaw.AbstractC1725Nr1
    public final long a(C5900kE2 c5900kE2) {
        if (!j(c5900kE2.i())) {
            return -1L;
        }
        int i = (c5900kE2.i()[2] & 255) >> 4;
        if (i == 6) {
            c5900kE2.h(4);
            c5900kE2.E();
        } else if (i == 7) {
            i = 7;
            c5900kE2.h(4);
            c5900kE2.E();
        }
        int iA = AbstractC2043Qn1.a(c5900kE2, i);
        c5900kE2.g(0);
        return iA;
    }

    @Override // com.daaw.AbstractC1725Nr1
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // com.daaw.AbstractC1725Nr1
    public final boolean c(C5900kE2 c5900kE2, long j, C1414Kr1 c1414Kr1) {
        byte[] bArrI = c5900kE2.i();
        C2461Un1 c2461Un1 = this.n;
        if (c2461Un1 == null) {
            C2461Un1 c2461Un12 = new C2461Un1(bArrI, 17);
            this.n = c2461Un12;
            c1414Kr1.a = c2461Un12.c(Arrays.copyOfRange(bArrI, 9, c5900kE2.m()), null);
            return true;
        }
        if ((bArrI[0] & 127) == 3) {
            C2357Tn1 c2357Tn1B = AbstractC2147Rn1.b(c5900kE2);
            C2461Un1 c2461Un1F = c2461Un1.f(c2357Tn1B);
            this.n = c2461Un1F;
            this.o = new C0573Cr1(c2461Un1F, c2357Tn1B);
            return true;
        }
        if (!j(bArrI)) {
            return true;
        }
        C0573Cr1 c0573Cr1 = this.o;
        if (c0573Cr1 != null) {
            c0573Cr1.c(j);
            c1414Kr1.b = this.o;
        }
        c1414Kr1.a.getClass();
        return false;
    }
}
