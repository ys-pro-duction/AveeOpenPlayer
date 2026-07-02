package com.daaw;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class NK1 extends AbstractC5644jK1 {
    public final byte[] F;

    public NK1(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.F = bArr;
    }

    @Override // com.daaw.BM1
    public final String D(Charset charset) {
        return new String(this.F, 0, s(), charset);
    }

    @Override // com.daaw.BM1
    public final void E(AbstractC3665cG1 abstractC3665cG1) {
        ((C9864yP1) abstractC3665cG1).A(this.F, 0, s());
    }

    @Override // com.daaw.BM1
    public final boolean F() {
        return PO2.e(this.F, 0, s());
    }

    public int K() {
        return 0;
    }

    @Override // com.daaw.BM1
    public byte e(int i) {
        return this.F[i];
    }

    @Override // com.daaw.BM1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BM1) || s() != ((BM1) obj).s()) {
            return false;
        }
        if (s() == 0) {
            return true;
        }
        if (!(obj instanceof NK1)) {
            return obj.equals(this);
        }
        NK1 nk1 = (NK1) obj;
        int iH = H();
        int iH2 = nk1.H();
        if (iH != 0 && iH2 != 0 && iH != iH2) {
            return false;
        }
        int iS = s();
        if (iS > nk1.s()) {
            throw new IllegalArgumentException("Length too large: " + iS + s());
        }
        if (iS > nk1.s()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iS + ", " + nk1.s());
        }
        byte[] bArr = this.F;
        byte[] bArr2 = nk1.F;
        nk1.K();
        int i = 0;
        int i2 = 0;
        while (i < iS) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.daaw.BM1
    public byte q(int i) {
        return this.F[i];
    }

    @Override // com.daaw.BM1
    public int s() {
        return this.F.length;
    }

    @Override // com.daaw.BM1
    public final int w(int i, int i2, int i3) {
        return J82.b(i, this.F, 0, i3);
    }

    @Override // com.daaw.BM1
    public final BM1 y(int i, int i2) {
        int iG = BM1.G(0, i2, s());
        return iG == 0 ? BM1.C : new C8999vI1(this.F, 0, iG);
    }
}
