package com.daaw;

import android.util.Base64;
import com.daaw.GV0;
import com.daaw.HV0;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.InterfaceC9110vi0;
import com.daaw.PP0;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class JV0 implements InterfaceC9110vi0, PP0.a {
    public final GV0.a B;
    public final InterfaceC0937Gc0 C;
    public final int D;
    public final InterfaceC1896Pi0.a E;
    public final O3 F;
    public final TrackGroupArray G;
    public final W41[] H;
    public final InterfaceC0884Fp I;
    public InterfaceC9110vi0.a J;
    public HV0 K;
    public C2239Sk[] L;
    public PP0 M;
    public boolean N;

    public JV0(HV0 hv0, GV0.a aVar, InterfaceC0884Fp interfaceC0884Fp, int i, InterfaceC1896Pi0.a aVar2, InterfaceC0937Gc0 interfaceC0937Gc0, O3 o3) {
        this.B = aVar;
        this.C = interfaceC0937Gc0;
        this.D = i;
        this.E = aVar2;
        this.F = o3;
        this.I = interfaceC0884Fp;
        this.G = h(hv0);
        HV0.a aVar3 = hv0.e;
        if (aVar3 != null) {
            this.H = new W41[]{new W41(true, null, 8, p(aVar3.b), 0, 0, null)};
        } else {
            this.H = null;
        }
        this.K = hv0;
        C2239Sk[] c2239SkArrS = s(0);
        this.L = c2239SkArrS;
        this.M = interfaceC0884Fp.a(c2239SkArrS);
        aVar2.q();
    }

    public static TrackGroupArray h(HV0 hv0) {
        TrackGroup[] trackGroupArr = new TrackGroup[hv0.f.length];
        for (int i = 0; i < hv0.f.length; i++) {
            trackGroupArr[i] = new TrackGroup(hv0.f[i].j);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    public static byte[] p(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String string = sb.toString();
        byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
        w(bArrDecode, 0, 3);
        w(bArrDecode, 1, 2);
        w(bArrDecode, 4, 5);
        w(bArrDecode, 6, 7);
        return bArrDecode;
    }

    private static C2239Sk[] s(int i) {
        return new C2239Sk[i];
    }

    public static void w(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    public final C2239Sk b(com.google.android.exoplayer2.trackselection.c cVar, long j) {
        int iB = this.G.b(cVar.a());
        return new C2239Sk(this.K.f[iB].a, null, null, this.B.a(this.C, this.K, iB, cVar, this.H), this, this.F, j, this.D, this.E);
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long c() {
        return this.M.c();
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public boolean d(long j) {
        return this.M.d(j);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long e(long j, DO0 do0) {
        for (C2239Sk c2239Sk : this.L) {
            if (c2239Sk.B == 2) {
                return c2239Sk.e(j, do0);
            }
        }
        return j;
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long f() {
        return this.M.f();
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public void g(long j) {
        this.M.g(j);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long i(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, QM0[] qm0Arr, boolean[] zArr2, long j) {
        com.google.android.exoplayer2.trackselection.c cVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cVarArr.length; i++) {
            QM0 qm0 = qm0Arr[i];
            if (qm0 != null) {
                C2239Sk c2239Sk = (C2239Sk) qm0;
                if (cVarArr[i] == null || !zArr[i]) {
                    c2239Sk.M();
                    qm0Arr[i] = null;
                } else {
                    arrayList.add(c2239Sk);
                }
            }
            if (qm0Arr[i] == null && (cVar = cVarArr[i]) != null) {
                C2239Sk c2239SkB = b(cVar, j);
                arrayList.add(c2239SkB);
                qm0Arr[i] = c2239SkB;
                zArr2[i] = true;
            }
        }
        C2239Sk[] c2239SkArrS = s(arrayList.size());
        this.L = c2239SkArrS;
        arrayList.toArray(c2239SkArrS);
        this.M = this.I.a(this.L);
        return j;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void l() {
        this.C.b();
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long m(long j) {
        for (C2239Sk c2239Sk : this.L) {
            c2239Sk.O(j);
        }
        return j;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void o(InterfaceC9110vi0.a aVar, long j) {
        this.J = aVar;
        aVar.j(this);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long q() {
        if (this.N) {
            return -9223372036854775807L;
        }
        this.E.t();
        this.N = true;
        return -9223372036854775807L;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public TrackGroupArray r() {
        return this.G;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void t(long j, boolean z) {
        for (C2239Sk c2239Sk : this.L) {
            c2239Sk.t(j, z);
        }
    }

    @Override // com.daaw.PP0.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void n(C2239Sk c2239Sk) {
        this.J.n(this);
    }

    public void v() {
        for (C2239Sk c2239Sk : this.L) {
            c2239Sk.M();
        }
        this.J = null;
        this.E.r();
    }

    public void x(HV0 hv0) {
        this.K = hv0;
        for (C2239Sk c2239Sk : this.L) {
            ((GV0) c2239Sk.B()).a(hv0);
        }
        this.J.n(this);
    }
}
