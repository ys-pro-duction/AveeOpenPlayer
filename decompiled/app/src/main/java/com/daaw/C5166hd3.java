package com.daaw;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.hd3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5166hd3 extends AbstractC4319ed3 {
    public final byte[] F;

    public C5166hd3(byte[] bArr) {
        bArr.getClass();
        this.F = bArr;
    }

    @Override // com.daaw.AbstractC9646xd3
    public final String D(Charset charset) {
        return new String(this.F, 0, s(), charset);
    }

    @Override // com.daaw.AbstractC9646xd3
    public final void E(Lc3 lc3) {
        ((Md3) lc3).B(this.F, 0, s());
    }

    @Override // com.daaw.AbstractC9646xd3
    public final boolean F() {
        return AbstractC8548ti3.e(this.F, 0, s());
    }

    public int K() {
        return 0;
    }

    @Override // com.daaw.AbstractC9646xd3
    public byte e(int i) {
        return this.F[i];
    }

    @Override // com.daaw.AbstractC9646xd3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9646xd3) || s() != ((AbstractC9646xd3) obj).s()) {
            return false;
        }
        if (s() == 0) {
            return true;
        }
        if (!(obj instanceof C5166hd3)) {
            return obj.equals(this);
        }
        C5166hd3 c5166hd3 = (C5166hd3) obj;
        int iH = H();
        int iH2 = c5166hd3.H();
        if (iH != 0 && iH2 != 0 && iH != iH2) {
            return false;
        }
        int iS = s();
        if (iS > c5166hd3.s()) {
            throw new IllegalArgumentException("Length too large: " + iS + s());
        }
        if (iS > c5166hd3.s()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iS + ", " + c5166hd3.s());
        }
        byte[] bArr = this.F;
        byte[] bArr2 = c5166hd3.F;
        c5166hd3.K();
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

    @Override // com.daaw.AbstractC9646xd3
    public byte q(int i) {
        return this.F[i];
    }

    @Override // com.daaw.AbstractC9646xd3
    public int s() {
        return this.F.length;
    }

    @Override // com.daaw.AbstractC9646xd3
    public final int w(int i, int i2, int i3) {
        return AbstractC10214zf3.b(i, this.F, 0, i3);
    }

    @Override // com.daaw.AbstractC9646xd3
    public final AbstractC9646xd3 y(int i, int i2) {
        int iG = AbstractC9646xd3.G(0, i2, s());
        return iG == 0 ? AbstractC9646xd3.C : new Yc3(this.F, 0, iG);
    }
}
