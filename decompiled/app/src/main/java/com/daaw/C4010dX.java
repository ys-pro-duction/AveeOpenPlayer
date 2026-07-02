package com.daaw;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.dX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4010dX extends E {
    public String b;
    public byte c;
    public AG d;
    public byte[] e;

    public C4010dX(boolean z, byte[] bArr) {
        super(z);
        a(bArr);
    }

    @Override // com.daaw.E
    public void b(byte[] bArr) {
        int iF = AbstractC6308lh.f(bArr, 1, 1);
        if (iF >= 0) {
            try {
                this.b = AbstractC6308lh.a(bArr, 1, iF - 1);
            } catch (UnsupportedEncodingException unused) {
                this.b = "image/unknown";
            }
        } else {
            this.b = "image/unknown";
        }
        this.c = bArr[iF + 1];
        int length = iF + 2;
        int iG = AbstractC6308lh.g(bArr, length, bArr[0]);
        if (iG >= 0) {
            AG ag = new AG(bArr[0], AbstractC6308lh.e(bArr, length, iG - length));
            this.d = ag;
            length = iG + ag.e().length;
        } else {
            this.d = new AG(bArr[0], "");
        }
        this.e = AbstractC6308lh.e(bArr, length, bArr.length - length);
    }

    public byte[] c() {
        return this.e;
    }

    @Override // com.daaw.E
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        C4010dX c4010dX = (C4010dX) obj;
        AG ag = this.d;
        if (ag == null) {
            if (c4010dX.d != null) {
                return false;
            }
        } else if (!ag.equals(c4010dX.d)) {
            return false;
        }
        if (!Arrays.equals(this.e, c4010dX.e)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (c4010dX.b != null) {
                return false;
            }
        } else if (!str.equals(c4010dX.b)) {
            return false;
        }
        return this.c == c4010dX.c;
    }

    @Override // com.daaw.E
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        AG ag = this.d;
        int iHashCode2 = (((iHashCode + (ag == null ? 0 : ag.hashCode())) * 31) + Arrays.hashCode(this.e)) * 31;
        String str = this.b;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.c;
    }
}
