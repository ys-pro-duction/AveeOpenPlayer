package com.daaw;

import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.xU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9606xU2 extends TT2 {
    public final byte[] e;
    public Uri f;
    public int g;
    public int h;
    public boolean i;

    public C9606xU2(byte[] bArr) {
        super(false);
        AbstractC6048km2.d(bArr.length > 0);
        this.e = bArr;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) throws UX2 {
        this.f = c5835k03.a;
        m(c5835k03);
        long j = c5835k03.f;
        int length = this.e.length;
        if (j > length) {
            throw new UX2(2008);
        }
        int i = (int) j;
        this.g = i;
        int i2 = length - i;
        this.h = i2;
        long j2 = c5835k03.g;
        if (j2 != -1) {
            this.h = (int) Math.min(i2, j2);
        }
        this.i = true;
        n(c5835k03);
        long j3 = c5835k03.g;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(this.e, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        b(iMin);
        return iMin;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        return this.f;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        if (this.i) {
            this.i = false;
            l();
        }
        this.f = null;
    }
}
