package com.daaw;

import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.ap1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3263ap1 extends AbstractC4666fp1 {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public C3263ap1(InterfaceC8576to1 interfaceC8576to1) {
        super(interfaceC8576to1);
    }

    @Override // com.daaw.AbstractC4666fp1
    public final boolean a(C5900kE2 c5900kE2) throws C4377ep1 {
        if (this.b) {
            c5900kE2.h(1);
        } else {
            int iU = c5900kE2.u();
            int i = iU >> 4;
            this.d = i;
            if (i == 2) {
                int i2 = e[(iU >> 2) & 3];
                C1106Hs1 c1106Hs1 = new C1106Hs1();
                c1106Hs1.u("audio/mpeg");
                c1106Hs1.k0(1);
                c1106Hs1.v(i2);
                this.a.e(c1106Hs1.D());
                this.c = true;
            } else if (i == 7 || i == 8) {
                C1106Hs1 c1106Hs12 = new C1106Hs1();
                c1106Hs12.u(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                c1106Hs12.k0(1);
                c1106Hs12.v(8000);
                this.a.e(c1106Hs12.D());
                this.c = true;
            } else if (i != 10) {
                throw new C4377ep1("Audio format not supported: " + i);
            }
            this.b = true;
        }
        return true;
    }

    @Override // com.daaw.AbstractC4666fp1
    public final boolean b(C5900kE2 c5900kE2, long j) {
        if (this.d == 2) {
            int iJ = c5900kE2.j();
            this.a.b(c5900kE2, iJ);
            this.a.c(j, 1, iJ, 0, null);
            return true;
        }
        int iU = c5900kE2.u();
        if (iU != 0 || this.c) {
            if (this.d == 10 && iU != 1) {
                return false;
            }
            int iJ2 = c5900kE2.j();
            this.a.b(c5900kE2, iJ2);
            this.a.c(j, 1, iJ2, 0, null);
            return true;
        }
        int iJ3 = c5900kE2.j();
        byte[] bArr = new byte[iJ3];
        c5900kE2.c(bArr, 0, iJ3);
        C2873Ym1 c2873Ym1A = AbstractC2977Zm1.a(bArr);
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.u("audio/mp4a-latm");
        c1106Hs1.l0(c2873Ym1A.c);
        c1106Hs1.k0(c2873Ym1A.b);
        c1106Hs1.v(c2873Ym1A.a);
        c1106Hs1.k(Collections.singletonList(bArr));
        this.a.e(c1106Hs1.D());
        this.c = true;
        return false;
    }
}
