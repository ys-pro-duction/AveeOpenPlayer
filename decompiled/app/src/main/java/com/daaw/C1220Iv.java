package com.daaw;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.daaw.C0384Aw0;
import com.daaw.C2239Sk;
import com.daaw.InterfaceC0804Ev;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.InterfaceC9110vi0;
import com.daaw.PP0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1220Iv implements InterfaceC9110vi0, PP0.a, C2239Sk.b {
    public final int B;
    public final InterfaceC0804Ev.a C;
    public final int D;
    public final InterfaceC1896Pi0.a E;
    public final long F;
    public final InterfaceC0937Gc0 G;
    public final O3 H;
    public final TrackGroupArray I;
    public final a[] J;
    public final InterfaceC0884Fp K;
    public final C0384Aw0 L;
    public InterfaceC9110vi0.a N;
    public PP0 Q;
    public C0908Fv R;
    public int S;
    public List T;
    public boolean U;
    public C2239Sk[] O = A(0);
    public WH[] P = new WH[0];
    public final IdentityHashMap M = new IdentityHashMap();

    /* JADX INFO: renamed from: com.daaw.Iv$a */
    public static final class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.b = i;
            this.a = iArr;
            this.c = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.d = i6;
        }

        public static a a(int[] iArr, int i) {
            return new a(3, 1, iArr, i, -1, -1, -1);
        }

        public static a b(int[] iArr, int i) {
            return new a(4, 1, iArr, i, -1, -1, -1);
        }

        public static a c(int i) {
            return new a(4, 2, null, -1, -1, -1, i);
        }

        public static a d(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public C1220Iv(int i, C0908Fv c0908Fv, int i2, InterfaceC0804Ev.a aVar, int i3, InterfaceC1896Pi0.a aVar2, long j, InterfaceC0937Gc0 interfaceC0937Gc0, O3 o3, InterfaceC0884Fp interfaceC0884Fp, C0384Aw0.b bVar) {
        this.B = i;
        this.R = c0908Fv;
        this.S = i2;
        this.C = aVar;
        this.D = i3;
        this.E = aVar2;
        this.F = j;
        this.G = interfaceC0937Gc0;
        this.H = o3;
        this.K = interfaceC0884Fp;
        this.L = new C0384Aw0(c0908Fv, bVar, o3);
        this.Q = interfaceC0884Fp.a(this.O);
        C1421Kt0 c1421Kt0D = c0908Fv.d(i2);
        List list = c1421Kt0D.d;
        this.T = list;
        Pair pairU = u(c1421Kt0D.c, list);
        this.I = (TrackGroupArray) pairU.first;
        this.J = (a[]) pairU.second;
        aVar2.q();
    }

    public static C2239Sk[] A(int i) {
        return new C2239Sk[i];
    }

    public static void D(QM0 qm0) {
        if (qm0 instanceof C2239Sk.a) {
            ((C2239Sk.a) qm0).d();
        }
    }

    public static void h(List list, TrackGroup[] trackGroupArr, a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            trackGroupArr[i] = new TrackGroup(Format.o(((C4228eI) list.get(i2)).a(), "application/x-emsg", null, -1, null));
            aVarArr[i] = a.c(i2);
            i2++;
            i++;
        }
    }

    public static int p(List list, int[][] iArr, int i, boolean[] zArr, boolean[] zArr2, TrackGroup[] trackGroupArr, a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(((W2) list.get(i6)).c);
            }
            int size = arrayList.size();
            Format[] formatArr = new Format[size];
            for (int i7 = 0; i7 < size; i7++) {
                formatArr[i7] = ((AbstractC6202lI0) arrayList.get(i7)).c;
            }
            W2 w2 = (W2) list.get(iArr2[0]);
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i5 + 2;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (zArr2[i4]) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            trackGroupArr[i5] = new TrackGroup(formatArr);
            aVarArr[i5] = a.d(w2.b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                trackGroupArr[i8] = new TrackGroup(Format.o(w2.a + ":emsg", "application/x-emsg", null, -1, null));
                aVarArr[i8] = a.b(iArr2, i5);
            }
            if (i2 != -1) {
                trackGroupArr[i2] = new TrackGroup(Format.s(w2.a + ":cea608", "application/cea-608", 0, null));
                aVarArr[i2] = a.a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    public static Pair u(List list, List list2) {
        int[][] iArrW = w(list);
        int length = iArrW.length;
        boolean[] zArr = new boolean[length];
        boolean[] zArr2 = new boolean[length];
        int iZ = z(length, list, iArrW, zArr, zArr2) + length + list2.size();
        TrackGroup[] trackGroupArr = new TrackGroup[iZ];
        a[] aVarArr = new a[iZ];
        h(list2, trackGroupArr, aVarArr, p(list, iArrW, length, zArr, zArr2, trackGroupArr, aVarArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), aVarArr);
    }

    public static C0499Bz v(List list) {
        for (int i = 0; i < list.size(); i++) {
            C0499Bz c0499Bz = (C0499Bz) list.get(i);
            if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(c0499Bz.a)) {
                return c0499Bz;
            }
        }
        return null;
    }

    public static int[][] w(List list) {
        int i;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            sparseIntArray.put(((W2) list.get(i2)).a, i2);
        }
        int[][] iArr = new int[size][];
        boolean[] zArr = new boolean[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            if (!zArr[i4]) {
                zArr[i4] = true;
                C0499Bz c0499BzV = v(((W2) list.get(i4)).e);
                if (c0499BzV == null) {
                    i = i3 + 1;
                    iArr[i3] = new int[]{i4};
                } else {
                    String[] strArrSplit = c0499BzV.b.split(",");
                    int[] iArr2 = new int[strArrSplit.length + 1];
                    iArr2[0] = i4;
                    int i5 = 0;
                    while (i5 < strArrSplit.length) {
                        int i6 = sparseIntArray.get(Integer.parseInt(strArrSplit[i5]));
                        zArr[i6] = true;
                        i5++;
                        iArr2[i5] = i6;
                    }
                    i = i3 + 1;
                    iArr[i3] = iArr2;
                }
                i3 = i;
            }
        }
        return i3 < size ? (int[][]) Arrays.copyOf(iArr, i3) : iArr;
    }

    public static boolean x(List list, int[] iArr) {
        for (int i : iArr) {
            List list2 = ((W2) list.get(i)).d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if ("urn:scte:dash:cc:cea-608:2015".equals(((C0499Bz) list2.get(i2)).a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean y(List list, int[] iArr) {
        for (int i : iArr) {
            List list2 = ((W2) list.get(i)).c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!((AbstractC6202lI0) list2.get(i2)).f.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int z(int i, List list, int[][] iArr, boolean[] zArr, boolean[] zArr2) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (y(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            if (x(list, iArr[i3])) {
                zArr2[i3] = true;
                i2++;
            }
        }
        return i2;
    }

    @Override // com.daaw.PP0.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void n(C2239Sk c2239Sk) {
        this.N.n(this);
    }

    public void C() {
        this.L.r();
        for (C2239Sk c2239Sk : this.O) {
            c2239Sk.N(this);
        }
        this.N = null;
        this.E.r();
    }

    public final void E(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, QM0[] qm0Arr, boolean[] zArr2, long j, SparseArray sparseArray) {
        for (int i = 0; i < cVarArr.length; i++) {
            QM0 qm0 = qm0Arr[i];
            if (((qm0 instanceof C2239Sk.a) || (qm0 instanceof C8145sG)) && (cVarArr[i] == null || !zArr[i])) {
                D(qm0);
                qm0Arr[i] = null;
            }
            com.google.android.exoplayer2.trackselection.c cVar = cVarArr[i];
            if (cVar != null) {
                a aVar = this.J[this.I.b(cVar.a())];
                if (aVar.c == 1) {
                    C2239Sk c2239Sk = (C2239Sk) sparseArray.get(aVar.e);
                    QM0 qm02 = qm0Arr[i];
                    if (!(c2239Sk == null ? qm02 instanceof C8145sG : (qm02 instanceof C2239Sk.a) && ((C2239Sk.a) qm02).B == c2239Sk)) {
                        D(qm02);
                        qm0Arr[i] = c2239Sk == null ? new C8145sG() : c2239Sk.P(j, aVar.b);
                        zArr2[i] = true;
                    }
                }
            }
        }
    }

    public final void F(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, QM0[] qm0Arr, boolean[] zArr2, List list) {
        com.google.android.exoplayer2.trackselection.c cVar;
        for (int i = 0; i < cVarArr.length; i++) {
            QM0 qm0 = qm0Arr[i];
            if (qm0 instanceof WH) {
                WH wh = (WH) qm0;
                if (cVarArr[i] == null || !zArr[i]) {
                    qm0Arr[i] = null;
                } else {
                    list.add(wh);
                }
            }
            if (qm0Arr[i] == null && (cVar = cVarArr[i]) != null) {
                a aVar = this.J[this.I.b(cVar.a())];
                if (aVar.c == 2) {
                    WH wh2 = new WH((C4228eI) this.T.get(aVar.d), cVarArr[i].a().a(0), this.R.d);
                    qm0Arr[i] = wh2;
                    zArr2[i] = true;
                    list.add(wh2);
                }
            }
        }
    }

    public final void G(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, QM0[] qm0Arr, boolean[] zArr2, long j, SparseArray sparseArray) {
        com.google.android.exoplayer2.trackselection.c cVar;
        for (int i = 0; i < cVarArr.length; i++) {
            QM0 qm0 = qm0Arr[i];
            if (qm0 instanceof C2239Sk) {
                C2239Sk c2239Sk = (C2239Sk) qm0;
                com.google.android.exoplayer2.trackselection.c cVar2 = cVarArr[i];
                if (cVar2 == null || !zArr[i]) {
                    c2239Sk.N(this);
                    qm0Arr[i] = null;
                } else {
                    sparseArray.put(this.I.b(cVar2.a()), c2239Sk);
                }
            }
            if (qm0Arr[i] == null && (cVar = cVarArr[i]) != null) {
                int iB = this.I.b(cVar.a());
                a aVar = this.J[iB];
                if (aVar.c == 0) {
                    C2239Sk c2239SkS = s(aVar, cVarArr[i], j);
                    sparseArray.put(iB, c2239SkS);
                    qm0Arr[i] = c2239SkS;
                    zArr2[i] = true;
                }
            }
        }
    }

    public void H(C0908Fv c0908Fv, int i) {
        this.R = c0908Fv;
        this.S = i;
        this.L.t(c0908Fv);
        C2239Sk[] c2239SkArr = this.O;
        if (c2239SkArr != null) {
            for (C2239Sk c2239Sk : c2239SkArr) {
                ((InterfaceC0804Ev) c2239Sk.B()).c(c0908Fv, i);
            }
            this.N.n(this);
        }
        this.T = c0908Fv.d(i).d;
        for (WH wh : this.P) {
            Iterator it = this.T.iterator();
            while (true) {
                if (it.hasNext()) {
                    C4228eI c4228eI = (C4228eI) it.next();
                    if (c4228eI.a().equals(wh.c())) {
                        wh.e(c4228eI, c0908Fv.d);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.daaw.C2239Sk.b
    public synchronized void b(C2239Sk c2239Sk) {
        C0384Aw0.c cVar = (C0384Aw0.c) this.M.remove(c2239Sk);
        if (cVar != null) {
            cVar.m();
        }
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long c() {
        return this.Q.c();
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public boolean d(long j) {
        return this.Q.d(j);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long e(long j, DO0 do0) {
        for (C2239Sk c2239Sk : this.O) {
            if (c2239Sk.B == 2) {
                return c2239Sk.e(j, do0);
            }
        }
        return j;
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long f() {
        return this.Q.f();
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public void g(long j) {
        this.Q.g(j);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long i(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, QM0[] qm0Arr, boolean[] zArr2, long j) {
        SparseArray sparseArray = new SparseArray();
        ArrayList arrayList = new ArrayList();
        G(cVarArr, zArr, qm0Arr, zArr2, j, sparseArray);
        F(cVarArr, zArr, qm0Arr, zArr2, arrayList);
        E(cVarArr, zArr, qm0Arr, zArr2, j, sparseArray);
        this.O = A(sparseArray.size());
        int i = 0;
        while (true) {
            C2239Sk[] c2239SkArr = this.O;
            if (i >= c2239SkArr.length) {
                WH[] whArr = new WH[arrayList.size()];
                this.P = whArr;
                arrayList.toArray(whArr);
                this.Q = this.K.a(this.O);
                return j;
            }
            c2239SkArr[i] = (C2239Sk) sparseArray.valueAt(i);
            i++;
        }
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void l() {
        this.G.b();
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long m(long j) {
        for (C2239Sk c2239Sk : this.O) {
            c2239Sk.O(j);
        }
        for (WH wh : this.P) {
            wh.d(j);
        }
        return j;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void o(InterfaceC9110vi0.a aVar, long j) {
        this.N = aVar;
        aVar.j(this);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long q() {
        if (this.U) {
            return -9223372036854775807L;
        }
        this.E.t();
        this.U = true;
        return -9223372036854775807L;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public TrackGroupArray r() {
        return this.I;
    }

    public final C2239Sk s(a aVar, com.google.android.exoplayer2.trackselection.c cVar, long j) {
        int i;
        int[] iArrCopyOf = new int[2];
        Format[] formatArr = new Format[2];
        int i2 = aVar.f;
        boolean z = i2 != -1;
        if (z) {
            formatArr[0] = this.I.a(i2).a(0);
            iArrCopyOf[0] = 4;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = aVar.g;
        boolean z2 = i3 != -1;
        if (z2) {
            formatArr[i] = this.I.a(i3).a(0);
            iArrCopyOf[i] = 3;
            i++;
        }
        if (i < 2) {
            formatArr = (Format[]) Arrays.copyOf(formatArr, i);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
        }
        C0384Aw0.c cVarN = (this.R.d && z) ? this.L.n() : null;
        C2239Sk c2239Sk = new C2239Sk(aVar.b, iArrCopyOf, formatArr, this.C.a(this.G, this.R, this.S, aVar.a, cVar, aVar.b, this.F, z, z2, cVarN), this, this.H, j, this.D, this.E);
        synchronized (this) {
            this.M.put(c2239Sk, cVarN);
        }
        return c2239Sk;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void t(long j, boolean z) {
        for (C2239Sk c2239Sk : this.O) {
            c2239Sk.t(j, z);
        }
    }
}
