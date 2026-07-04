package com.daaw;

import com.google.android.gms.internal.ads.zzby;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Jr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1310Jr1 extends AbstractC1725Nr1 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean j(C5900kE2 c5900kE2) {
        return k(c5900kE2, o);
    }

    public static boolean k(C5900kE2 c5900kE2, byte[] bArr) {
        if (c5900kE2.j() < 8) {
            return false;
        }
        int iL = c5900kE2.l();
        byte[] bArr2 = new byte[8];
        c5900kE2.c(bArr2, 0, 8);
        c5900kE2.g(iL);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.daaw.AbstractC1725Nr1
    public final long a(C5900kE2 c5900kE2) {
        return f(AbstractC5778jo1.d(c5900kE2.i()));
    }

    @Override // com.daaw.AbstractC1725Nr1
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // com.daaw.AbstractC1725Nr1
    public final boolean c(C5900kE2 c5900kE2, long j, C1414Kr1 c1414Kr1) {
        if (k(c5900kE2, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c5900kE2.i(), c5900kE2.m());
            int i = bArrCopyOf[9] & 255;
            List listE = AbstractC5778jo1.e(bArrCopyOf);
            if (c1414Kr1.a != null) {
                return true;
            }
            C1106Hs1 c1106Hs1 = new C1106Hs1();
            c1106Hs1.u("audio/opus");
            c1106Hs1.k0(i);
            c1106Hs1.v(48000);
            c1106Hs1.k(listE);
            c1414Kr1.a = c1106Hs1.D();
            return true;
        }
        if (!k(c5900kE2, p)) {
            AbstractC6048km2.b(c1414Kr1.a);
            return false;
        }
        AbstractC6048km2.b(c1414Kr1.a);
        if (this.n) {
            return true;
        }
        this.n = true;
        c5900kE2.h(8);
        zzby zzbyVarB = AbstractC10257zo1.b(OP2.I(AbstractC10257zo1.c(c5900kE2, false, false).b));
        if (zzbyVarB == null) {
            return true;
        }
        C1106Hs1 c1106Hs1B = c1414Kr1.a.b();
        c1106Hs1B.o(zzbyVarB.d(c1414Kr1.a.j));
        c1414Kr1.a = c1106Hs1B.D();
        return true;
    }
}
