package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Z83 implements InterfaceC7659qX2 {
    public final InterfaceC7659qX2 a;
    public long b;
    public Uri c = Uri.EMPTY;
    public Map d = Collections.EMPTY_MAP;

    public Z83(InterfaceC7659qX2 interfaceC7659qX2) {
        this.a = interfaceC7659qX2;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) {
        this.c = c5835k03.a;
        this.d = Collections.EMPTY_MAP;
        long jA = this.a.a(c5835k03);
        Uri uriZzc = zzc();
        uriZzc.getClass();
        this.c = uriZzc;
        this.d = zze();
        return jA;
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) {
        int iD = this.a.d(bArr, i, i2);
        if (iD != -1) {
            this.b += (long) iD;
        }
        return iD;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void k(InterfaceC3917d93 interfaceC3917d93) {
        interfaceC3917d93.getClass();
        this.a.k(interfaceC3917d93);
    }

    public final long l() {
        return this.b;
    }

    public final Uri m() {
        return this.c;
    }

    public final Map n() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.daaw.InterfaceC7659qX2, com.daaw.K83
    public final Map zze() {
        return this.a.zze();
    }
}
