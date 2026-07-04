package com.daaw;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.daaw.jW2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5693jW2 extends TT2 {
    public C5835k03 e;
    public byte[] f;
    public int g;
    public int h;

    public C5693jW2() {
        super(false);
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) throws QT1, UX2 {
        m(c5835k03);
        this.e = c5835k03;
        Uri uriNormalizeScheme = c5835k03.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC6048km2.e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = AbstractC9004vJ2.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw QT1.b("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw QT1.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.f = URLDecoder.decode(str, UN2.a.name()).getBytes(UN2.c);
        }
        long j = c5835k03.f;
        int length = this.f.length;
        if (j > length) {
            this.f = null;
            throw new UX2(2008);
        }
        int i2 = (int) j;
        this.g = i2;
        int i3 = length - i2;
        this.h = i3;
        long j2 = c5835k03.g;
        if (j2 != -1) {
            this.h = (int) Math.min(i3, j2);
        }
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
        byte[] bArr2 = this.f;
        int i4 = AbstractC9004vJ2.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        b(iMin);
        return iMin;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        C5835k03 c5835k03 = this.e;
        if (c5835k03 != null) {
            return c5835k03.a;
        }
        return null;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        if (this.f != null) {
            this.f = null;
            l();
        }
        this.e = null;
    }
}
