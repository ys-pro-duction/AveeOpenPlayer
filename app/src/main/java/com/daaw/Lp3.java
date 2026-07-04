package com.daaw;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Lp3 implements InterfaceC7659qX2 {
    public final InterfaceC7659qX2 a;
    public final int b;
    public final Kp3 c;
    public final byte[] d;
    public int e;

    public Lp3(InterfaceC7659qX2 interfaceC7659qX2, int i, Kp3 kp3) {
        AbstractC6048km2.d(i > 0);
        this.a = interfaceC7659qX2;
        this.b = i;
        this.c = kp3;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.d(this.d, 0, 1) != -1) {
                int i5 = (this.d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iD = this.a.d(bArr2, i4, i6);
                        if (iD != -1) {
                            i4 += iD;
                            i6 -= iD;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.c.a(new C5900kE2(bArr2, i5));
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int iD2 = this.a.d(bArr, i, Math.min(i3, i2));
        if (iD2 != -1) {
            this.e -= iD2;
        }
        return iD2;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void k(InterfaceC3917d93 interfaceC3917d93) {
        interfaceC3917d93.getClass();
        this.a.k(interfaceC3917d93);
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.InterfaceC7659qX2, com.daaw.K83
    public final Map zze() {
        return this.a.zze();
    }
}
