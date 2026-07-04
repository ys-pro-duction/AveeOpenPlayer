package com.daaw;

import android.net.Uri;
import android.os.SystemClock;
import com.daaw.C3449bW;
import com.daaw.C4284eW;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class XV {
    public final ZV a;
    public final InterfaceC2595Vv b;
    public final InterfaceC2595Vv c;
    public final S31 d;
    public final C3449bW.a[] e;
    public final InterfaceC5410iW f;
    public final TrackGroup g;
    public final List h;
    public boolean i;
    public byte[] j;
    public IOException k;
    public C3449bW.a l;
    public boolean m;
    public Uri n;
    public byte[] o;
    public String p;
    public byte[] q;
    public com.google.android.exoplayer2.trackselection.c r;
    public long s = -9223372036854775807L;
    public boolean t;

    public static final class a extends AbstractC1635Mv {
        public final String l;
        public byte[] m;

        public a(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv, Format format, int i, Object obj, byte[] bArr, String str) {
            super(interfaceC2595Vv, c2907Yv, 3, format, i, obj, bArr);
            this.l = str;
        }

        @Override // com.daaw.AbstractC1635Mv
        public void e(byte[] bArr, int i) {
            this.m = Arrays.copyOf(bArr, i);
        }

        public byte[] h() {
            return this.m;
        }
    }

    public static final class b {
        public AbstractC1799Ok a;
        public boolean b;
        public C3449bW.a c;

        public b() {
            a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    public static final class c extends AbstractC1360Ke {
        public int g;

        public c(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.g = i(trackGroup.a(0));
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public int b() {
            return this.g;
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public int l() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public void n(long j, long j2, long j3) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (q(this.g, jElapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!q(i, jElapsedRealtime)) {
                        this.g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.c
        public Object o() {
            return null;
        }
    }

    public XV(ZV zv, InterfaceC5410iW interfaceC5410iW, C3449bW.a[] aVarArr, YV yv, S31 s31, List list) {
        this.a = zv;
        this.f = interfaceC5410iW;
        this.e = aVarArr;
        this.d = s31;
        this.h = list;
        Format[] formatArr = new Format[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            formatArr[i] = aVarArr[i].b;
            iArr[i] = i;
        }
        this.b = yv.a(1);
        this.c = yv.a(3);
        TrackGroup trackGroup = new TrackGroup(formatArr);
        this.g = trackGroup;
        this.r = new c(trackGroup, iArr);
    }

    public final void a() {
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public void b(C3727cW c3727cW, long j, long j2, b bVar) {
        long size;
        long jE;
        int i;
        C3449bW.a aVar;
        C2907Yv c2907Yv;
        int iB = c3727cW == null ? -1 : this.g.b(c3727cW.c);
        long jMax = j2 - j;
        long jK = k(j);
        if (c3727cW != null && !this.m) {
            long jD = c3727cW.d();
            jMax = Math.max(0L, jMax - jD);
            if (jK != -9223372036854775807L) {
                jK = Math.max(0L, jK - jD);
            }
        }
        this.r.n(j, jMax, jK);
        int iJ = this.r.j();
        boolean z = iB != iJ;
        C3449bW.a aVar2 = this.e[iJ];
        if (!this.f.m(aVar2)) {
            bVar.c = aVar2;
            this.t &= this.l == aVar2;
            this.l = aVar2;
            return;
        }
        C4284eW c4284eWD = this.f.d(aVar2);
        this.m = c4284eWD.k;
        o(c4284eWD);
        long jF = c4284eWD.e - this.f.f();
        if (c3727cW == null || z) {
            long j3 = c4284eWD.p + jF;
            long j4 = (c3727cW == null || this.m) ? j2 : c3727cW.f;
            if (c4284eWD.l || j4 < j3) {
                long jD2 = AbstractC6280lb1.d(c4284eWD.o, Long.valueOf(j4 - jF), true, !this.f.g() || c3727cW == null);
                long j5 = c4284eWD.h;
                size = jD2 + j5;
                if (size < j5 && c3727cW != null) {
                    aVar2 = this.e[iB];
                    c4284eWD = this.f.d(aVar2);
                    jF = c4284eWD.e - this.f.f();
                    jE = c3727cW.e();
                }
                i = iB;
            } else {
                size = c4284eWD.h + ((long) c4284eWD.o.size());
            }
            iB = iJ;
            jE = size;
            i = iB;
        } else {
            jE = c3727cW.e();
            i = iJ;
        }
        C3449bW.a aVar3 = aVar2;
        long j6 = c4284eWD.h;
        if (jE < j6) {
            this.k = new C3768cf();
            return;
        }
        int i2 = (int) (jE - j6);
        if (i2 >= c4284eWD.o.size()) {
            if (c4284eWD.l) {
                bVar.b = true;
                return;
            }
            bVar.c = aVar3;
            this.t &= this.l == aVar3;
            this.l = aVar3;
            return;
        }
        this.t = false;
        this.l = null;
        C4284eW.a aVar4 = (C4284eW.a) c4284eWD.o.get(i2);
        String str = aVar4.G;
        if (str != null) {
            Uri uriD = AbstractC0401Ba1.d(c4284eWD.a, str);
            if (!uriD.equals(this.n)) {
                bVar.a = f(uriD, aVar4.H, i, this.r.l(), this.r.o());
                return;
            } else if (!AbstractC6280lb1.b(aVar4.H, this.p)) {
                m(uriD, aVar4.H, this.o);
            }
        } else {
            a();
        }
        C4284eW.a aVar5 = aVar4.C;
        if (aVar5 != null) {
            aVar = aVar3;
            c2907Yv = new C2907Yv(AbstractC0401Ba1.d(c4284eWD.a, aVar5.B), aVar5.I, aVar5.J, null);
        } else {
            aVar = aVar3;
            c2907Yv = null;
        }
        long j7 = jF + aVar4.F;
        int i3 = c4284eWD.g + aVar4.E;
        bVar.a = new C3727cW(this.a, this.b, new C2907Yv(AbstractC0401Ba1.d(c4284eWD.a, aVar4.B), aVar4.I, aVar4.J, null), c2907Yv, aVar, this.h, this.r.l(), this.r.o(), j7, aVar4.D + j7, jE, i3, aVar4.K, this.i, this.d.a(i3), c3727cW, c4284eWD.n, this.o, this.q);
    }

    public TrackGroup c() {
        return this.g;
    }

    public com.google.android.exoplayer2.trackselection.c d() {
        return this.r;
    }

    public void e() throws IOException {
        IOException iOException = this.k;
        if (iOException != null) {
            throw iOException;
        }
        C3449bW.a aVar = this.l;
        if (aVar == null || !this.t) {
            return;
        }
        this.f.h(aVar);
    }

    public final a f(Uri uri, String str, int i, int i2, Object obj) {
        return new a(this.c, new C2907Yv(uri, 0L, -1L, null, 1), this.e[i].b, i2, obj, this.j, str);
    }

    public void g(AbstractC1799Ok abstractC1799Ok) {
        if (abstractC1799Ok instanceof a) {
            a aVar = (a) abstractC1799Ok;
            this.j = aVar.f();
            m(aVar.a.a, aVar.l, aVar.h());
        }
    }

    public boolean h(AbstractC1799Ok abstractC1799Ok, boolean z, IOException iOException) {
        if (!z) {
            return false;
        }
        com.google.android.exoplayer2.trackselection.c cVar = this.r;
        return AbstractC2447Uk.a(cVar, cVar.p(this.g.b(abstractC1799Ok.c)), iOException);
    }

    public boolean i(C3449bW.a aVar, boolean z) {
        int iP;
        int iB = this.g.b(aVar.b);
        if (iB == -1 || (iP = this.r.p(iB)) == -1) {
            return true;
        }
        this.t = (this.l == aVar) | this.t;
        return !z || this.r.c(iP, 60000L);
    }

    public void j() {
        this.k = null;
    }

    public final long k(long j) {
        long j2 = this.s;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    public void l(com.google.android.exoplayer2.trackselection.c cVar) {
        this.r = cVar;
    }

    public final void m(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(AbstractC6280lb1.a0(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.n = uri;
        this.o = bArr;
        this.p = str;
        this.q = bArr2;
    }

    public void n(boolean z) {
        this.i = z;
    }

    public final void o(C4284eW c4284eW) {
        this.s = c4284eW.l ? -9223372036854775807L : c4284eW.e() - this.f.f();
    }
}
