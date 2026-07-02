package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes.dex */
public final class WH implements QM0 {
    public final Format B;
    public long[] D;
    public boolean E;
    public C4228eI F;
    public boolean G;
    public int H;
    public final UH C = new UH();
    public long I = -9223372036854775807L;

    public WH(C4228eI c4228eI, Format format, boolean z) {
        this.B = format;
        this.F = c4228eI;
        this.D = c4228eI.b;
        e(c4228eI, z);
    }

    @Override // com.daaw.QM0
    public boolean a() {
        return true;
    }

    public String c() {
        return this.F.a();
    }

    public void d(long j) {
        int iC = AbstractC6280lb1.c(this.D, j, true, false);
        this.H = iC;
        if (!this.E || iC != this.D.length) {
            j = -9223372036854775807L;
        }
        this.I = j;
    }

    public void e(C4228eI c4228eI, boolean z) {
        int i = this.H;
        long j = i == 0 ? -9223372036854775807L : this.D[i - 1];
        this.E = z;
        this.F = c4228eI;
        long[] jArr = c4228eI.b;
        this.D = jArr;
        long j2 = this.I;
        if (j2 != -9223372036854775807L) {
            d(j2);
        } else if (j != -9223372036854775807L) {
            this.H = AbstractC6280lb1.c(jArr, j, false, false);
        }
    }

    @Override // com.daaw.QM0
    public int j(C5103hP c5103hP, C1016Gw c1016Gw, boolean z) {
        if (z || !this.G) {
            c5103hP.a = this.B;
            this.G = true;
            return -5;
        }
        int i = this.H;
        if (i == this.D.length) {
            if (this.E) {
                return -3;
            }
            c1016Gw.r(4);
            return -4;
        }
        this.H = i + 1;
        UH uh = this.C;
        C4228eI c4228eI = this.F;
        byte[] bArrA = uh.a(c4228eI.a[i], c4228eI.e);
        if (bArrA == null) {
            return -3;
        }
        c1016Gw.t(bArrA.length);
        c1016Gw.r(1);
        c1016Gw.D.put(bArrA);
        c1016Gw.E = this.D[i];
        return -4;
    }

    @Override // com.daaw.QM0
    public int n(long j) {
        int iMax = Math.max(this.H, AbstractC6280lb1.c(this.D, j, true, false));
        int i = iMax - this.H;
        this.H = iMax;
        return i;
    }

    @Override // com.daaw.QM0
    public void b() {
    }
}
