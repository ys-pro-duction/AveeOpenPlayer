package com.daaw;

import android.util.Pair;
import com.daaw.AbstractC1244Jb;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1348Kb {
    public static final int a = AbstractC6280lb1.v("vide");
    public static final int b = AbstractC6280lb1.v("soun");
    public static final int c = AbstractC6280lb1.v("text");
    public static final int d = AbstractC6280lb1.v("sbtl");
    public static final int e = AbstractC6280lb1.v("subt");
    public static final int f = AbstractC6280lb1.v("clcp");
    public static final int g = AbstractC6280lb1.v("meta");

    /* JADX INFO: renamed from: com.daaw.Kb$a */
    public static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final C2584Vs0 f;
        public final C2584Vs0 g;
        public int h;
        public int i;

        public a(C2584Vs0 c2584Vs0, C2584Vs0 c2584Vs02, boolean z) {
            this.g = c2584Vs0;
            this.f = c2584Vs02;
            this.e = z;
            c2584Vs02.J(12);
            this.a = c2584Vs02.B();
            c2584Vs0.J(12);
            this.i = c2584Vs0.B();
            AbstractC7115ob.g(c2584Vs0.i() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            this.d = this.e ? this.f.C() : this.f.z();
            if (this.b == this.h) {
                this.c = this.g.B();
                this.g.K(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.B() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kb$b */
    public interface b {
        boolean a();

        int b();

        int c();
    }

    /* JADX INFO: renamed from: com.daaw.Kb$c */
    public static final class c {
        public final W41[] a;
        public Format b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.a = new W41[i];
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kb$d */
    public static final class d implements b {
        public final int a;
        public final int b;
        public final C2584Vs0 c;

        public d(AbstractC1244Jb.b bVar) {
            C2584Vs0 c2584Vs0 = bVar.Q0;
            this.c = c2584Vs0;
            c2584Vs0.J(12);
            this.a = c2584Vs0.B();
            this.b = c2584Vs0.B();
        }

        @Override // com.daaw.AbstractC1348Kb.b
        public boolean a() {
            return this.a != 0;
        }

        @Override // com.daaw.AbstractC1348Kb.b
        public int b() {
            return this.b;
        }

        @Override // com.daaw.AbstractC1348Kb.b
        public int c() {
            int i = this.a;
            return i == 0 ? this.c.B() : i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kb$e */
    public static final class e implements b {
        public final C2584Vs0 a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public e(AbstractC1244Jb.b bVar) {
            C2584Vs0 c2584Vs0 = bVar.Q0;
            this.a = c2584Vs0;
            c2584Vs0.J(12);
            this.c = c2584Vs0.B() & 255;
            this.b = c2584Vs0.B();
        }

        @Override // com.daaw.AbstractC1348Kb.b
        public boolean a() {
            return false;
        }

        @Override // com.daaw.AbstractC1348Kb.b
        public int b() {
            return this.b;
        }

        @Override // com.daaw.AbstractC1348Kb.b
        public int c() {
            int i = this.c;
            if (i == 8) {
                return this.a.x();
            }
            if (i == 16) {
                return this.a.D();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int iX = this.a.x();
            this.e = iX;
            return (iX & 240) >> 4;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kb$f */
    public static final class f {
        public final int a;
        public final long b;
        public final int c;

        public f(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    public static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[AbstractC6280lb1.l(3, 0, length)] && jArr[AbstractC6280lb1.l(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    public static int b(C2584Vs0 c2584Vs0, int i, int i2) {
        int iC = c2584Vs0.c();
        while (iC - i < i2) {
            c2584Vs0.J(iC);
            int i3 = c2584Vs0.i();
            AbstractC7115ob.b(i3 > 0, "childAtomSize should be positive");
            if (c2584Vs0.i() == AbstractC1244Jb.K) {
                return iC;
            }
            iC += i3;
        }
        return -1;
    }

    public static void c(C2584Vs0 c2584Vs0, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, c cVar, int i5) {
        int iD;
        int iRound;
        int iB;
        int i6;
        DrmInitData drmInitData2;
        int i7;
        String str2;
        int i8;
        int i9 = i2;
        int i10 = i3;
        String str3 = str;
        DrmInitData drmInitDataC = drmInitData;
        c2584Vs0.J(i9 + 16);
        if (z) {
            iD = c2584Vs0.D();
            c2584Vs0.K(6);
        } else {
            c2584Vs0.K(8);
            iD = 0;
        }
        if (iD == 0 || iD == 1) {
            int iD2 = c2584Vs0.D();
            c2584Vs0.K(6);
            int iY = c2584Vs0.y();
            if (iD == 1) {
                c2584Vs0.K(16);
            }
            iRound = iY;
            iB = iD2;
        } else {
            if (iD != 2) {
                return;
            }
            c2584Vs0.K(16);
            iRound = (int) Math.round(c2584Vs0.h());
            iB = c2584Vs0.B();
            c2584Vs0.K(20);
        }
        int iC = c2584Vs0.c();
        int iIntValue = i;
        if (iIntValue == AbstractC1244Jb.b0) {
            Pair pairO = o(c2584Vs0, i9, i10);
            if (pairO != null) {
                iIntValue = ((Integer) pairO.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((W41) pairO.second).b);
                cVar.a[i5] = (W41) pairO.second;
            }
            c2584Vs0.J(iC);
        }
        DrmInitData drmInitData3 = drmInitDataC;
        String str4 = "audio/raw";
        int i11 = iB;
        String str5 = iIntValue == AbstractC1244Jb.o ? "audio/ac3" : iIntValue == AbstractC1244Jb.q ? "audio/eac3" : iIntValue == AbstractC1244Jb.s ? "audio/vnd.dts" : (iIntValue == AbstractC1244Jb.t || iIntValue == AbstractC1244Jb.u) ? "audio/vnd.dts.hd" : iIntValue == AbstractC1244Jb.v ? "audio/vnd.dts.hd;profile=lbr" : iIntValue == AbstractC1244Jb.z0 ? "audio/3gpp" : iIntValue == AbstractC1244Jb.A0 ? "audio/amr-wb" : (iIntValue == AbstractC1244Jb.m || iIntValue == AbstractC1244Jb.n) ? "audio/raw" : iIntValue == AbstractC1244Jb.k ? "audio/mpeg" : iIntValue == AbstractC1244Jb.P0 ? "audio/alac" : null;
        int i12 = iC;
        int iIntValue2 = i11;
        byte[] bArr = null;
        while (i12 - i9 < i10) {
            c2584Vs0.J(i12);
            int i13 = c2584Vs0.i();
            AbstractC7115ob.b(i13 > 0, "childAtomSize should be positive");
            int i14 = c2584Vs0.i();
            int i15 = AbstractC1244Jb.K;
            if (i14 == i15 || (z && i14 == AbstractC1244Jb.l)) {
                i6 = i12;
                drmInitData2 = drmInitData3;
                i7 = i13;
                str2 = str4;
                i8 = iRound;
                int iB2 = i14 == i15 ? i6 : b(c2584Vs0, i6, i7);
                if (iB2 != -1) {
                    Pair pairF = f(c2584Vs0, iB2);
                    str5 = (String) pairF.first;
                    bArr = (byte[]) pairF.second;
                    if ("audio/mp4a-latm".equals(str5)) {
                        Pair pairI = AbstractC9129vm.i(bArr);
                        int iIntValue3 = ((Integer) pairI.first).intValue();
                        iIntValue2 = ((Integer) pairI.second).intValue();
                        i8 = iIntValue3;
                    }
                }
            } else {
                if (i14 == AbstractC1244Jb.p) {
                    c2584Vs0.J(i12 + 8);
                    cVar.b = AbstractC4719g1.d(c2584Vs0, Integer.toString(i4), str3, drmInitData3);
                } else if (i14 == AbstractC1244Jb.r) {
                    c2584Vs0.J(i12 + 8);
                    cVar.b = AbstractC4719g1.g(c2584Vs0, Integer.toString(i4), str3, drmInitData3);
                } else if (i14 == AbstractC1244Jb.w) {
                    drmInitData2 = drmInitData3;
                    i8 = iRound;
                    str2 = str4;
                    i7 = i13;
                    i6 = i12;
                    cVar.b = Format.k(Integer.toString(i4), str5, null, -1, -1, iIntValue2, i8, null, drmInitData2, 0, str);
                } else {
                    i6 = i12;
                    drmInitData2 = drmInitData3;
                    i7 = i13;
                    str2 = str4;
                    i8 = iRound;
                    if (i14 == AbstractC1244Jb.P0) {
                        byte[] bArr2 = new byte[i7];
                        c2584Vs0.J(i6);
                        c2584Vs0.g(bArr2, 0, i7);
                        bArr = bArr2;
                    }
                }
                i6 = i12;
                drmInitData2 = drmInitData3;
                i7 = i13;
                str2 = str4;
                i8 = iRound;
            }
            i12 = i6 + i7;
            i10 = i3;
            str4 = str2;
            iRound = i8;
            drmInitData3 = drmInitData2;
            i9 = i2;
            str3 = str;
        }
        DrmInitData drmInitData4 = drmInitData3;
        String str6 = str4;
        int i16 = iRound;
        if (cVar.b != null || str5 == null) {
            return;
        }
        cVar.b = Format.j(Integer.toString(i4), str5, null, -1, -1, iIntValue2, i16, str6.equals(str5) ? 2 : -1, bArr != null ? Collections.singletonList(bArr) : null, drmInitData4, 0, str);
    }

    public static Pair d(C2584Vs0 c2584Vs0, int i, int i2) {
        int i3 = i + 8;
        String strU = null;
        Integer numValueOf = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            c2584Vs0.J(i3);
            int i6 = c2584Vs0.i();
            int i7 = c2584Vs0.i();
            if (i7 == AbstractC1244Jb.c0) {
                numValueOf = Integer.valueOf(c2584Vs0.i());
            } else if (i7 == AbstractC1244Jb.X) {
                c2584Vs0.K(4);
                strU = c2584Vs0.u(4);
            } else if (i7 == AbstractC1244Jb.Y) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(strU) && !"cbc1".equals(strU) && !"cens".equals(strU) && !"cbcs".equals(strU)) {
            return null;
        }
        AbstractC7115ob.b(numValueOf != null, "frma atom is mandatory");
        AbstractC7115ob.b(i4 != -1, "schi atom is mandatory");
        W41 w41P = p(c2584Vs0, i4, i5, strU);
        AbstractC7115ob.b(w41P != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, w41P);
    }

    public static Pair e(AbstractC1244Jb.a aVar) {
        AbstractC1244Jb.b bVarG;
        if (aVar == null || (bVarG = aVar.g(AbstractC1244Jb.R)) == null) {
            return Pair.create(null, null);
        }
        C2584Vs0 c2584Vs0 = bVarG.Q0;
        c2584Vs0.J(8);
        int iC = AbstractC1244Jb.c(c2584Vs0.i());
        int iB = c2584Vs0.B();
        long[] jArr = new long[iB];
        long[] jArr2 = new long[iB];
        for (int i = 0; i < iB; i++) {
            jArr[i] = iC == 1 ? c2584Vs0.C() : c2584Vs0.z();
            jArr2[i] = iC == 1 ? c2584Vs0.q() : c2584Vs0.i();
            if (c2584Vs0.t() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c2584Vs0.K(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair f(C2584Vs0 c2584Vs0, int i) {
        c2584Vs0.J(i + 12);
        c2584Vs0.K(1);
        g(c2584Vs0);
        c2584Vs0.K(2);
        int iX = c2584Vs0.x();
        if ((iX & 128) != 0) {
            c2584Vs0.K(2);
        }
        if ((iX & 64) != 0) {
            c2584Vs0.K(c2584Vs0.D());
        }
        if ((iX & 32) != 0) {
            c2584Vs0.K(2);
        }
        c2584Vs0.K(1);
        g(c2584Vs0);
        String strE = AbstractC8834uk0.e(c2584Vs0.x());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return Pair.create(strE, null);
        }
        c2584Vs0.K(12);
        c2584Vs0.K(1);
        int iG = g(c2584Vs0);
        byte[] bArr = new byte[iG];
        c2584Vs0.g(bArr, 0, iG);
        return Pair.create(strE, bArr);
    }

    public static int g(C2584Vs0 c2584Vs0) {
        int iX = c2584Vs0.x();
        int i = iX & 127;
        while ((iX & 128) == 128) {
            iX = c2584Vs0.x();
            i = (i << 7) | (iX & 127);
        }
        return i;
    }

    public static int h(C2584Vs0 c2584Vs0) {
        c2584Vs0.J(16);
        int i = c2584Vs0.i();
        if (i == b) {
            return 1;
        }
        if (i == a) {
            return 2;
        }
        if (i == c || i == d || i == e || i == f) {
            return 3;
        }
        return i == g ? 4 : -1;
    }

    public static Metadata i(C2584Vs0 c2584Vs0, int i) {
        c2584Vs0.K(8);
        ArrayList arrayList = new ArrayList();
        while (c2584Vs0.c() < i) {
            Metadata.Entry entryC = AbstractC5757jk0.c(c2584Vs0);
            if (entryC != null) {
                arrayList.add(entryC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Pair j(C2584Vs0 c2584Vs0) {
        c2584Vs0.J(8);
        int iC = AbstractC1244Jb.c(c2584Vs0.i());
        c2584Vs0.K(iC == 0 ? 8 : 16);
        long jZ = c2584Vs0.z();
        c2584Vs0.K(iC == 0 ? 4 : 8);
        int iD = c2584Vs0.D();
        return Pair.create(Long.valueOf(jZ), "" + ((char) (((iD >> 10) & 31) + 96)) + ((char) (((iD >> 5) & 31) + 96)) + ((char) ((iD & 31) + 96)));
    }

    public static Metadata k(C2584Vs0 c2584Vs0, int i) {
        c2584Vs0.K(12);
        while (c2584Vs0.c() < i) {
            int iC = c2584Vs0.c();
            int i2 = c2584Vs0.i();
            if (c2584Vs0.i() == AbstractC1244Jb.D0) {
                c2584Vs0.J(iC);
                return i(c2584Vs0, iC + i2);
            }
            c2584Vs0.K(i2 - 8);
        }
        return null;
    }

    public static long l(C2584Vs0 c2584Vs0) {
        c2584Vs0.J(8);
        c2584Vs0.K(AbstractC1244Jb.c(c2584Vs0.i()) != 0 ? 16 : 8);
        return c2584Vs0.z();
    }

    public static float m(C2584Vs0 c2584Vs0, int i) {
        c2584Vs0.J(i + 8);
        return c2584Vs0.B() / c2584Vs0.B();
    }

    public static byte[] n(C2584Vs0 c2584Vs0, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            c2584Vs0.J(i3);
            int i4 = c2584Vs0.i();
            if (c2584Vs0.i() == AbstractC1244Jb.K0) {
                return Arrays.copyOfRange(c2584Vs0.a, i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    public static Pair o(C2584Vs0 c2584Vs0, int i, int i2) {
        Pair pairD;
        int iC = c2584Vs0.c();
        while (iC - i < i2) {
            c2584Vs0.J(iC);
            int i3 = c2584Vs0.i();
            AbstractC7115ob.b(i3 > 0, "childAtomSize should be positive");
            if (c2584Vs0.i() == AbstractC1244Jb.W && (pairD = d(c2584Vs0, iC, i3)) != null) {
                return pairD;
            }
            iC += i3;
        }
        return null;
    }

    public static W41 p(C2584Vs0 c2584Vs0, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            c2584Vs0.J(i5);
            int i6 = c2584Vs0.i();
            if (c2584Vs0.i() == AbstractC1244Jb.Z) {
                int iC = AbstractC1244Jb.c(c2584Vs0.i());
                c2584Vs0.K(1);
                if (iC == 0) {
                    c2584Vs0.K(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iX = c2584Vs0.x();
                    i3 = iX & 15;
                    i4 = (iX & 240) >> 4;
                }
                boolean z = c2584Vs0.x() == 1;
                int iX2 = c2584Vs0.x();
                byte[] bArr2 = new byte[16];
                c2584Vs0.g(bArr2, 0, 16);
                if (z && iX2 == 0) {
                    int iX3 = c2584Vs0.x();
                    bArr = new byte[iX3];
                    c2584Vs0.g(bArr, 0, iX3);
                }
                return new W41(z, str, iX2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.C3059a51 q(com.daaw.U41 r41, com.daaw.AbstractC1244Jb.a r42, com.daaw.MR r43) throws com.daaw.C3000Zs0 {
        /*
            Method dump skipped, instruction units count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC1348Kb.q(com.daaw.U41, com.daaw.Jb$a, com.daaw.MR):com.daaw.a51");
    }

    public static c r(C2584Vs0 c2584Vs0, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws C3000Zs0 {
        c2584Vs0.J(12);
        int i3 = c2584Vs0.i();
        c cVar = new c(i3);
        int i4 = 0;
        while (i4 < i3) {
            int iC = c2584Vs0.c();
            int i5 = c2584Vs0.i();
            AbstractC7115ob.b(i5 > 0, "childAtomSize should be positive");
            int i6 = c2584Vs0.i();
            if (i6 == AbstractC1244Jb.c || i6 == AbstractC1244Jb.d || i6 == AbstractC1244Jb.a0 || i6 == AbstractC1244Jb.m0 || i6 == AbstractC1244Jb.e || i6 == AbstractC1244Jb.f || i6 == AbstractC1244Jb.g || i6 == AbstractC1244Jb.L0 || i6 == AbstractC1244Jb.M0) {
                c cVar2 = cVar;
                int i7 = i4;
                w(c2584Vs0, i6, iC, i5, i, i2, drmInitData, cVar2, i7);
                cVar = cVar2;
                i4 = i7;
            } else if (i6 == AbstractC1244Jb.j || i6 == AbstractC1244Jb.b0 || i6 == AbstractC1244Jb.o || i6 == AbstractC1244Jb.q || i6 == AbstractC1244Jb.s || i6 == AbstractC1244Jb.v || i6 == AbstractC1244Jb.t || i6 == AbstractC1244Jb.u || i6 == AbstractC1244Jb.z0 || i6 == AbstractC1244Jb.A0 || i6 == AbstractC1244Jb.m || i6 == AbstractC1244Jb.n || i6 == AbstractC1244Jb.k || i6 == AbstractC1244Jb.P0) {
                c cVar3 = cVar;
                c(c2584Vs0, i6, iC, i5, i, str, z, drmInitData, cVar3, i4);
                cVar = cVar3;
            } else if (i6 == AbstractC1244Jb.k0 || i6 == AbstractC1244Jb.v0 || i6 == AbstractC1244Jb.w0 || i6 == AbstractC1244Jb.x0 || i6 == AbstractC1244Jb.y0) {
                s(c2584Vs0, i6, iC, i5, i, str, cVar);
            } else if (i6 == AbstractC1244Jb.O0) {
                cVar.b = Format.o(Integer.toString(i), "application/x-camera-motion", null, -1, null);
            }
            c2584Vs0.J(iC + i5);
            i4++;
        }
        return cVar;
    }

    public static void s(C2584Vs0 c2584Vs0, int i, int i2, int i3, int i4, String str, c cVar) {
        c2584Vs0.J(i2 + 16);
        String str2 = "application/ttml+xml";
        List listSingletonList = null;
        long j = Long.MAX_VALUE;
        if (i != AbstractC1244Jb.k0) {
            if (i == AbstractC1244Jb.v0) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                c2584Vs0.g(bArr, 0, i5);
                listSingletonList = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == AbstractC1244Jb.w0) {
                str2 = "application/x-mp4-vtt";
            } else if (i == AbstractC1244Jb.x0) {
                j = 0;
            } else {
                if (i != AbstractC1244Jb.y0) {
                    throw new IllegalStateException();
                }
                cVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        cVar.b = Format.v(Integer.toString(i4), str2, null, -1, 0, str, -1, null, j, listSingletonList);
    }

    public static f t(C2584Vs0 c2584Vs0) {
        long j;
        c2584Vs0.J(8);
        int iC = AbstractC1244Jb.c(c2584Vs0.i());
        c2584Vs0.K(iC == 0 ? 8 : 16);
        int i = c2584Vs0.i();
        c2584Vs0.K(4);
        int iC2 = c2584Vs0.c();
        int i2 = iC == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i4 >= i2) {
                c2584Vs0.K(i2);
                break;
            }
            if (c2584Vs0.a[iC2 + i4] != -1) {
                long jZ = iC == 0 ? c2584Vs0.z() : c2584Vs0.C();
                if (jZ != 0) {
                    j = jZ;
                }
            } else {
                i4++;
            }
        }
        c2584Vs0.K(16);
        int i5 = c2584Vs0.i();
        int i6 = c2584Vs0.i();
        c2584Vs0.K(4);
        int i7 = c2584Vs0.i();
        int i8 = c2584Vs0.i();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = 270;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new f(i, j, i3);
    }

    public static U41 u(AbstractC1244Jb.a aVar, AbstractC1244Jb.b bVar, long j, DrmInitData drmInitData, boolean z, boolean z2) {
        long[] jArr;
        long[] jArr2;
        AbstractC1244Jb.a aVarF = aVar.f(AbstractC1244Jb.F);
        int iH = h(aVarF.g(AbstractC1244Jb.T).Q0);
        if (iH == -1) {
            return null;
        }
        f fVarT = t(aVar.g(AbstractC1244Jb.P).Q0);
        long j2 = j == -9223372036854775807L ? fVarT.b : j;
        long jL = l(bVar.Q0);
        long jT = j2 != -9223372036854775807L ? AbstractC6280lb1.T(j2, 1000000L, jL) : -9223372036854775807L;
        AbstractC1244Jb.a aVarF2 = aVarF.f(AbstractC1244Jb.G).f(AbstractC1244Jb.H);
        Pair pairJ = j(aVarF.g(AbstractC1244Jb.S).Q0);
        c cVarR = r(aVarF2.g(AbstractC1244Jb.U).Q0, fVarT.a, fVarT.c, (String) pairJ.second, drmInitData, z2);
        if (z) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair pairE = e(aVar.f(AbstractC1244Jb.Q));
            long[] jArr3 = (long[]) pairE.first;
            jArr2 = (long[]) pairE.second;
            jArr = jArr3;
        }
        if (cVarR.b == null) {
            return null;
        }
        return new U41(fVarT.a, iH, ((Long) pairJ.first).longValue(), jL, jT, cVarR.b, cVarR.d, cVarR.a, cVarR.c, jArr, jArr2);
    }

    public static Metadata v(AbstractC1244Jb.b bVar, boolean z) {
        if (z) {
            return null;
        }
        C2584Vs0 c2584Vs0 = bVar.Q0;
        c2584Vs0.J(8);
        while (c2584Vs0.a() >= 8) {
            int iC = c2584Vs0.c();
            int i = c2584Vs0.i();
            if (c2584Vs0.i() == AbstractC1244Jb.C0) {
                c2584Vs0.J(iC);
                return k(c2584Vs0, iC + i);
            }
            c2584Vs0.K(i - 8);
        }
        return null;
    }

    public static void w(C2584Vs0 c2584Vs0, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, c cVar, int i6) throws C3000Zs0 {
        String str;
        List list;
        DrmInitData drmInitDataC = drmInitData;
        c2584Vs0.J(i2 + 16);
        c2584Vs0.K(16);
        int iD = c2584Vs0.D();
        int iD2 = c2584Vs0.D();
        c2584Vs0.K(50);
        int iC = c2584Vs0.c();
        String str2 = null;
        int iIntValue = i;
        if (iIntValue == AbstractC1244Jb.a0) {
            Pair pairO = o(c2584Vs0, i2, i3);
            if (pairO != null) {
                iIntValue = ((Integer) pairO.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((W41) pairO.second).b);
                cVar.a[i6] = (W41) pairO.second;
            }
            c2584Vs0.J(iC);
        }
        DrmInitData drmInitData2 = drmInitDataC;
        List listSingletonList = null;
        byte[] bArrN = null;
        boolean z = false;
        float fM = 1.0f;
        int i7 = -1;
        while (iC - i2 < i3) {
            c2584Vs0.J(iC);
            int iC2 = c2584Vs0.c();
            int i8 = c2584Vs0.i();
            if (i8 == 0 && c2584Vs0.c() - i2 == i3) {
                break;
            }
            AbstractC7115ob.b(i8 > 0, "childAtomSize should be positive");
            int i9 = c2584Vs0.i();
            if (i9 == AbstractC1244Jb.I) {
                AbstractC7115ob.f(str2 == null);
                c2584Vs0.J(iC2 + 8);
                C1979Qd c1979QdB = C1979Qd.b(c2584Vs0);
                list = c1979QdB.a;
                cVar.c = c1979QdB.b;
                if (!z) {
                    fM = c1979QdB.e;
                }
                str = "video/avc";
            } else if (i9 == AbstractC1244Jb.J) {
                AbstractC7115ob.f(str2 == null);
                c2584Vs0.J(iC2 + 8);
                PV pvA = PV.a(c2584Vs0);
                list = pvA.a;
                cVar.c = pvA.b;
                str = "video/hevc";
            } else {
                if (i9 == AbstractC1244Jb.N0) {
                    AbstractC7115ob.f(str2 == null);
                    str = iIntValue == AbstractC1244Jb.L0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (i9 == AbstractC1244Jb.h) {
                    AbstractC7115ob.f(str2 == null);
                    str = "video/3gpp";
                } else {
                    if (i9 == AbstractC1244Jb.K) {
                        AbstractC7115ob.f(str2 == null);
                        Pair pairF = f(c2584Vs0, iC2);
                        str2 = (String) pairF.first;
                        listSingletonList = Collections.singletonList(pairF.second);
                    } else if (i9 == AbstractC1244Jb.j0) {
                        fM = m(c2584Vs0, iC2);
                        z = true;
                    } else if (i9 == AbstractC1244Jb.J0) {
                        bArrN = n(c2584Vs0, iC2, i8);
                    } else if (i9 == AbstractC1244Jb.I0) {
                        int iX = c2584Vs0.x();
                        c2584Vs0.K(3);
                        if (iX == 0) {
                            int iX2 = c2584Vs0.x();
                            if (iX2 == 0) {
                                i7 = 0;
                            } else if (iX2 == 1) {
                                i7 = 1;
                            } else if (iX2 == 2) {
                                i7 = 2;
                            } else if (iX2 == 3) {
                                i7 = 3;
                            }
                        }
                    }
                    iC += i8;
                }
                str2 = str;
                iC += i8;
            }
            listSingletonList = list;
            str2 = str;
            iC += i8;
        }
        if (str2 == null) {
            return;
        }
        cVar.b = Format.B(Integer.toString(i4), str2, null, -1, -1, iD, iD2, -1.0f, listSingletonList, i5, fM, bArrN, i7, null, drmInitData2);
    }
}
