package com.daaw;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RV1 implements InterfaceC7659qX2 {
    public final InterfaceC7659qX2 a;
    public final long b;
    public final InterfaceC7659qX2 c;
    public long d;
    public Uri e;

    public RV1(InterfaceC7659qX2 interfaceC7659qX2, int i, InterfaceC7659qX2 interfaceC7659qX22) {
        this.a = interfaceC7659qX2;
        this.b = i;
        this.c = interfaceC7659qX22;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) {
        C5835k03 c5835k032;
        this.e = c5835k03.a;
        long j = this.b;
        long j2 = c5835k03.f;
        C5835k03 c5835k033 = null;
        if (j2 >= j) {
            c5835k032 = null;
        } else {
            long j3 = c5835k03.g;
            long jMin = j - j2;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            c5835k032 = new C5835k03(c5835k03.a, null, j2, j2, jMin, null, 0);
        }
        long j4 = c5835k03.g;
        if (j4 == -1 || c5835k03.f + j4 > this.b) {
            long jMax = Math.max(this.b, c5835k03.f);
            long j5 = c5835k03.g;
            c5835k033 = new C5835k03(c5835k03.a, null, jMax, jMax, j5 != -1 ? Math.min(j5, (c5835k03.f + j5) - this.b) : -1L, null, 0);
        }
        long jA = c5835k032 != null ? this.a.a(c5835k032) : 0L;
        long jA2 = c5835k033 != null ? this.c.a(c5835k033) : 0L;
        this.d = c5835k03.f;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.d;
        long j2 = this.b;
        if (j < j2) {
            int iD = this.a.d(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.d + ((long) iD);
            this.d = j3;
            i3 = iD;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.b) {
            return i3;
        }
        int iD2 = this.c.d(bArr, i + i3, i2 - i3);
        int i4 = i3 + iD2;
        this.d += (long) iD2;
        return i4;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        this.a.zzd();
        this.c.zzd();
    }

    @Override // com.daaw.InterfaceC7659qX2, com.daaw.K83
    public final Map zze() {
        return RP2.e();
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void k(InterfaceC3917d93 interfaceC3917d93) {
    }
}
