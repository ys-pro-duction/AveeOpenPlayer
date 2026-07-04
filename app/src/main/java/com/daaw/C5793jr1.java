package com.daaw;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzafu;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzfo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.jr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5793jr1 implements InterfaceC1086Hn1, InterfaceC6903no1 {
    public static final InterfaceC1813On1 x = new InterfaceC1813On1() { // from class: com.daaw.hr1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C5793jr1(0)};
        }
    };
    public int i;
    public long j;
    public int k;
    public C5900kE2 l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public zzafu w;
    public int h = 0;
    public final C6360lr1 f = new C6360lr1();
    public final List g = new ArrayList();
    public final C5900kE2 d = new C5900kE2(16);
    public final ArrayDeque e = new ArrayDeque();
    public final C5900kE2 a = new C5900kE2(AbstractC4556fR2.a);
    public final C5900kE2 b = new C5900kE2(4);
    public final C5900kE2 c = new C5900kE2();
    public int m = -1;
    public InterfaceC1398Kn1 q = InterfaceC1398Kn1.s;
    public C5512ir1[] r = new C5512ir1[0];

    public C5793jr1(int i) {
    }

    public static int c(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static int d(C7755qr1 c7755qr1, long j) {
        int iA = c7755qr1.a(j);
        return iA == -1 ? c7755qr1.b(j) : iA;
    }

    public static long e(C7755qr1 c7755qr1, long j, long j2) {
        int iD = d(c7755qr1, j);
        return iD == -1 ? j2 : Math.min(c7755qr1.c[iD], j2);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        long j2;
        long j3;
        int iB;
        C5512ir1[] c5512ir1Arr = this.r;
        if (c5512ir1Arr.length == 0) {
            C7182oo1 c7182oo1 = C7182oo1.c;
            return new C6345lo1(c7182oo1, c7182oo1);
        }
        int i = this.t;
        long jE = -1;
        if (i != -1) {
            C7755qr1 c7755qr1 = c5512ir1Arr[i].b;
            int iD = d(c7755qr1, j);
            if (iD == -1) {
                C7182oo1 c7182oo12 = C7182oo1.c;
                return new C6345lo1(c7182oo12, c7182oo12);
            }
            long j4 = c7755qr1.f[iD];
            j2 = c7755qr1.c[iD];
            if (j4 >= j || iD >= c7755qr1.b - 1 || (iB = c7755qr1.b(j)) == -1 || iB == iD) {
                j3 = -9223372036854775807L;
            } else {
                j3 = c7755qr1.f[iB];
                jE = c7755qr1.c[iB];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C5512ir1[] c5512ir1Arr2 = this.r;
            if (i2 >= c5512ir1Arr2.length) {
                break;
            }
            if (i2 != this.t) {
                C7755qr1 c7755qr12 = c5512ir1Arr2[i2].b;
                long jE2 = e(c7755qr12, j, j2);
                if (j3 != -9223372036854775807L) {
                    jE = e(c7755qr12, j3, jE);
                }
                j2 = jE2;
            }
            i2++;
        }
        C7182oo1 c7182oo13 = new C7182oo1(j, j2);
        return j3 == -9223372036854775807L ? new C6345lo1(c7182oo13, c7182oo13) : new C6345lo1(c7182oo13, new C7182oo1(j3, jE));
    }

    public final void f() {
        this.h = 0;
        this.k = 0;
    }

    public final void g(long j) throws QT1 {
        zzby zzbyVar;
        long j2;
        List list;
        C4093do1 c4093do1;
        zzby zzbyVar2;
        int i;
        int i2;
        while (!this.e.isEmpty() && ((C0994Gq1) this.e.peek()).b == j) {
            C0994Gq1 c0994Gq1 = (C0994Gq1) this.e.pop();
            if (c0994Gq1.a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i3 = this.v;
                C4093do1 c4093do12 = new C4093do1();
                C1098Hq1 c1098Hq1D = c0994Gq1.d(1969517665);
                if (c1098Hq1D != null) {
                    zzby zzbyVarB = AbstractC2889Yq1.b(c1098Hq1D);
                    c4093do12.b(zzbyVarB);
                    zzbyVar = zzbyVarB;
                } else {
                    zzbyVar = null;
                }
                C0994Gq1 c0994Gq1C = c0994Gq1.c(1835365473);
                zzby zzbyVarA = c0994Gq1C != null ? AbstractC2889Yq1.a(c0994Gq1C) : null;
                C1098Hq1 c1098Hq1D2 = c0994Gq1.d(1836476516);
                c1098Hq1D2.getClass();
                boolean z = i3 == 1;
                zzby zzbyVar3 = zzbyVar;
                long j3 = -9223372036854775807L;
                zzby zzbyVar4 = new zzby(-9223372036854775807L, AbstractC2889Yq1.c(c1098Hq1D2.b));
                C4093do1 c4093do13 = c4093do12;
                zzby zzbyVar5 = zzbyVarA;
                List listD = AbstractC2889Yq1.d(c0994Gq1, c4093do13, -9223372036854775807L, null, false, z, new WN2() { // from class: com.daaw.gr1
                    @Override // com.daaw.WN2
                    public final Object apply(Object obj) {
                        C6918nr1 c6918nr1 = (C6918nr1) obj;
                        InterfaceC1813On1 interfaceC1813On1 = C5793jr1.x;
                        return c6918nr1;
                    }
                });
                int size = listD.size();
                long jMax = -9223372036854775807L;
                int i4 = 0;
                int size2 = -1;
                while (true) {
                    j2 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    C7755qr1 c7755qr1 = (C7755qr1) listD.get(i4);
                    long j4 = j3;
                    if (c7755qr1.b == 0) {
                        list = listD;
                        c4093do1 = c4093do13;
                        zzbyVar2 = zzbyVar5;
                    } else {
                        C6918nr1 c6918nr1 = c7755qr1.a;
                        long j5 = c6918nr1.e;
                        if (j5 == j4) {
                            j5 = c7755qr1.h;
                        }
                        jMax = Math.max(jMax, j5);
                        C5512ir1 c5512ir1 = new C5512ir1(c6918nr1, c7755qr1, this.q.o(i4, c6918nr1.b));
                        int i5 = "audio/true-hd".equals(c6918nr1.f.l) ? c7755qr1.e * 16 : c7755qr1.e + 30;
                        C1106Hs1 c1106Hs1B = c6918nr1.f.b();
                        c1106Hs1B.n(i5);
                        list = listD;
                        if (c6918nr1.b == 2 && j5 > 0 && (i2 = c7755qr1.b) > 1) {
                            c1106Hs1B.g(i2 / (j5 / 1000000.0f));
                        }
                        int i6 = c6918nr1.b;
                        String[] strArr = AbstractC4676fr1.a;
                        if (i6 == 1 && c4093do13.a()) {
                            c1106Hs1B.e(c4093do13.a);
                            c1106Hs1B.f(c4093do13.b);
                        }
                        int i7 = c6918nr1.b;
                        zzby[] zzbyVarArr = {this.g.isEmpty() ? null : new zzby(this.g), zzbyVar3, zzbyVar4};
                        c4093do1 = c4093do13;
                        zzby zzbyVar6 = new zzby(j4, new zzbx[0]);
                        zzbyVar2 = zzbyVar5;
                        if (zzbyVar2 != null) {
                            for (int i8 = 0; i8 < zzbyVar2.a(); i8 = i + 1) {
                                zzbx zzbxVarB = zzbyVar2.b(i8);
                                if (zzbxVarB instanceof zzfo) {
                                    zzfo zzfoVar = (zzfo) zzbxVarB;
                                    i = i8;
                                    if (!zzfoVar.B.equals("com.android.capture.fps")) {
                                        zzbyVar6 = zzbyVar6.c(zzfoVar);
                                    } else if (i7 == 2) {
                                        zzbyVar6 = zzbyVar6.c(zzfoVar);
                                    }
                                } else {
                                    i = i8;
                                }
                            }
                        }
                        for (int i9 = 0; i9 < 3; i9++) {
                            zzbyVar6 = zzbyVar6.d(zzbyVarArr[i9]);
                        }
                        if (zzbyVar6.a() > 0) {
                            c1106Hs1B.o(zzbyVar6);
                        }
                        c5512ir1.c.e(c1106Hs1B.D());
                        if (c6918nr1.b == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(c5512ir1);
                    }
                    i4++;
                    zzbyVar5 = zzbyVar2;
                    c4093do13 = c4093do1;
                    listD = list;
                    j3 = -9223372036854775807L;
                }
                this.t = size2;
                this.u = jMax;
                C5512ir1[] c5512ir1Arr = (C5512ir1[]) arrayList.toArray(new C5512ir1[0]);
                this.r = c5512ir1Arr;
                int length = c5512ir1Arr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i10 = 0; i10 < c5512ir1Arr.length; i10++) {
                    jArr[i10] = new long[c5512ir1Arr[i10].b.b];
                    jArr2[i10] = c5512ir1Arr[i10].b.f[0];
                }
                int i11 = 0;
                while (i11 < c5512ir1Arr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < c5512ir1Arr.length; i13++) {
                        if (!zArr[i13]) {
                            long j7 = jArr2[i13];
                            if (j7 <= j6) {
                                i12 = i13;
                                j6 = j7;
                            }
                        }
                    }
                    int i14 = iArr[i12];
                    long[] jArr3 = jArr[i12];
                    jArr3[i14] = j2;
                    C7755qr1 c7755qr12 = c5512ir1Arr[i12].b;
                    j2 += (long) c7755qr12.d[i14];
                    int i15 = i14 + 1;
                    iArr[i12] = i15;
                    if (i15 < jArr3.length) {
                        jArr2[i12] = c7755qr12.f[i15];
                    } else {
                        zArr[i12] = true;
                        i11++;
                    }
                }
                this.s = jArr;
                this.q.b();
                this.q.p(this);
                this.e.clear();
                this.h = 2;
            } else if (!this.e.isEmpty()) {
                ((C0994Gq1) this.e.peek()).e(c0994Gq1);
            }
        }
        if (this.h != 2) {
            f();
        }
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            f();
            return;
        }
        for (C5512ir1 c5512ir1 : this.r) {
            C7755qr1 c7755qr1 = c5512ir1.b;
            int iA = c7755qr1.a(j2);
            if (iA == -1) {
                iA = c7755qr1.b(j2);
            }
            c5512ir1.e = iA;
            C8855uo1 c8855uo1 = c5512ir1.d;
            if (c8855uo1 != null) {
                c8855uo1.b();
            }
        }
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) {
        return AbstractC6639mr1.b(interfaceC1190In1, false);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.q = interfaceC1398Kn1;
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.daaw.InterfaceC1190In1 r36, com.daaw.C6057ko1 r37) throws com.daaw.QT1 {
        /*
            Method dump skipped, instruction units count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5793jr1.n(com.daaw.In1, com.daaw.ko1):int");
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.u;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return true;
    }
}
