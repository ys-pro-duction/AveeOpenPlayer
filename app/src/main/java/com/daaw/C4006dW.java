package com.daaw;

import com.daaw.C3449bW;
import com.daaw.C5969kW;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.InterfaceC5410iW;
import com.daaw.InterfaceC9110vi0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.dW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4006dW implements InterfaceC9110vi0, C5969kW.c, InterfaceC5410iW.a {
    public final ZV B;
    public final InterfaceC5410iW C;
    public final YV D;
    public final int E;
    public final InterfaceC1896Pi0.a F;
    public final O3 G;
    public final InterfaceC0884Fp J;
    public final boolean K;
    public InterfaceC9110vi0.a L;
    public int M;
    public TrackGroupArray N;
    public PP0 Q;
    public boolean R;
    public final IdentityHashMap H = new IdentityHashMap();
    public final S31 I = new S31();
    public C5969kW[] O = new C5969kW[0];
    public C5969kW[] P = new C5969kW[0];

    public C4006dW(ZV zv, InterfaceC5410iW interfaceC5410iW, YV yv, int i, InterfaceC1896Pi0.a aVar, O3 o3, InterfaceC0884Fp interfaceC0884Fp, boolean z) {
        this.B = zv;
        this.C = interfaceC5410iW;
        this.D = yv;
        this.E = i;
        this.F = aVar;
        this.G = o3;
        this.J = interfaceC0884Fp;
        this.K = z;
        this.Q = interfaceC0884Fp.a(new PP0[0]);
        aVar.q();
    }

    public static Format v(Format format, Format format2, int i) {
        String strS;
        String str;
        int i2;
        int i3;
        if (format2 != null) {
            strS = format2.D;
            int i4 = format2.S;
            int i5 = format2.Y;
            str = format2.Z;
            i2 = i4;
            i3 = i5;
        } else {
            strS = AbstractC6280lb1.s(format.D, 1);
            str = null;
            i2 = -1;
            i3 = 0;
        }
        String str2 = str;
        String str3 = strS;
        return Format.k(format.B, AbstractC8834uk0.d(str3), str3, i, -1, i2, -1, null, null, i3, str2);
    }

    public static Format w(Format format) {
        String strS = AbstractC6280lb1.s(format.D, 2);
        return Format.C(format.B, AbstractC8834uk0.d(strS), strS, format.C, -1, format.K, format.L, format.M, null, null);
    }

    @Override // com.daaw.C5969kW.c
    public void a() {
        int i = this.M - 1;
        this.M = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C5969kW c5969kW : this.O) {
            i2 += c5969kW.r().B;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i2];
        int i3 = 0;
        for (C5969kW c5969kW2 : this.O) {
            int i4 = c5969kW2.r().B;
            int i5 = 0;
            while (i5 < i4) {
                trackGroupArr[i3] = c5969kW2.r().a(i5);
                i5++;
                i3++;
            }
        }
        this.N = new TrackGroupArray(trackGroupArr);
        this.L.j(this);
    }

    @Override // com.daaw.InterfaceC5410iW.a
    public boolean b(C3449bW.a aVar, boolean z) {
        boolean zO = true;
        for (C5969kW c5969kW : this.O) {
            zO &= c5969kW.O(aVar, z);
        }
        this.L.n(this);
        return zO;
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long c() {
        return this.Q.c();
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public boolean d(long j) {
        if (this.N != null) {
            return this.Q.d(j);
        }
        for (C5969kW c5969kW : this.O) {
            c5969kW.y();
        }
        return false;
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long f() {
        return this.Q.f();
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public void g(long j) {
        this.Q.g(j);
    }

    @Override // com.daaw.InterfaceC5410iW.a
    public void h() {
        this.L.n(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    @Override // com.daaw.InterfaceC9110vi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i(com.google.android.exoplayer2.trackselection.c[] r21, boolean[] r22, com.daaw.QM0[] r23, boolean[] r24, long r25) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4006dW.i(com.google.android.exoplayer2.trackselection.c[], boolean[], com.daaw.QM0[], boolean[], long):long");
    }

    @Override // com.daaw.C5969kW.c
    public void k(C3449bW.a aVar) {
        this.C.e(aVar);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void l() {
        for (C5969kW c5969kW : this.O) {
            c5969kW.l();
        }
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long m(long j) {
        C5969kW[] c5969kWArr = this.P;
        if (c5969kWArr.length > 0) {
            boolean zV = c5969kWArr[0].V(j, false);
            int i = 1;
            while (true) {
                C5969kW[] c5969kWArr2 = this.P;
                if (i >= c5969kWArr2.length) {
                    break;
                }
                c5969kWArr2[i].V(j, zV);
                i++;
            }
            if (zV) {
                this.I.b();
            }
        }
        return j;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void o(InterfaceC9110vi0.a aVar, long j) {
        this.L = aVar;
        this.C.l(this);
        s(j);
    }

    public final void p(C3449bW c3449bW, long j) {
        List list;
        List arrayList = new ArrayList(c3449bW.c);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C3449bW.a aVar = (C3449bW.a) arrayList.get(i);
            Format format = aVar.b;
            if (format.L > 0 || AbstractC6280lb1.s(format.D, 2) != null) {
                arrayList2.add(aVar);
            } else if (AbstractC6280lb1.s(format.D, 1) != null) {
                arrayList3.add(aVar);
            }
        }
        if (arrayList2.isEmpty()) {
            if (arrayList3.size() < arrayList.size()) {
                arrayList.removeAll(arrayList3);
            }
            list = arrayList;
        } else {
            list = arrayList2;
        }
        AbstractC7115ob.a(!list.isEmpty());
        C3449bW.a[] aVarArr = (C3449bW.a[]) list.toArray(new C3449bW.a[0]);
        String str = aVarArr[0].b.D;
        C5969kW c5969kWU = u(0, aVarArr, c3449bW.f, c3449bW.g, j);
        this.O[0] = c5969kWU;
        if (!this.K || str == null) {
            c5969kWU.X(true);
            c5969kWU.y();
            return;
        }
        boolean z = AbstractC6280lb1.s(str, 2) != null;
        boolean z2 = AbstractC6280lb1.s(str, 1) != null;
        ArrayList arrayList4 = new ArrayList();
        if (z) {
            int size = list.size();
            Format[] formatArr = new Format[size];
            for (int i2 = 0; i2 < size; i2++) {
                formatArr[i2] = w(aVarArr[i2].b);
            }
            arrayList4.add(new TrackGroup(formatArr));
            if (z2 && (c3449bW.f != null || c3449bW.d.isEmpty())) {
                arrayList4.add(new TrackGroup(v(aVarArr[0].b, c3449bW.f, -1)));
            }
            List list2 = c3449bW.g;
            if (list2 != null) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    arrayList4.add(new TrackGroup((Format) list2.get(i3)));
                }
            }
        } else {
            if (!z2) {
                throw new IllegalArgumentException("Unexpected codecs attribute: " + str);
            }
            int size2 = list.size();
            Format[] formatArr2 = new Format[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                Format format2 = aVarArr[i4].b;
                formatArr2[i4] = v(format2, c3449bW.f, format2.C);
            }
            arrayList4.add(new TrackGroup(formatArr2));
        }
        TrackGroup trackGroup = new TrackGroup(Format.o("ID3", "application/id3", null, -1, null));
        arrayList4.add(trackGroup);
        c5969kWU.Q(new TrackGroupArray((TrackGroup[]) arrayList4.toArray(new TrackGroup[0])), 0, new TrackGroupArray(trackGroup));
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long q() {
        if (this.R) {
            return -9223372036854775807L;
        }
        this.F.t();
        this.R = true;
        return -9223372036854775807L;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public TrackGroupArray r() {
        return this.N;
    }

    public final void s(long j) {
        C3449bW c3449bWI = this.C.i();
        List list = c3449bWI.d;
        List list2 = c3449bWI.e;
        int size = list.size() + 1 + list2.size();
        this.O = new C5969kW[size];
        this.M = size;
        long j2 = j;
        p(c3449bWI, j2);
        int i = 0;
        int i2 = 1;
        while (i < list.size()) {
            C3449bW.a aVar = (C3449bW.a) list.get(i);
            C5969kW c5969kWU = u(1, new C3449bW.a[]{aVar}, null, Collections.EMPTY_LIST, j2);
            int i3 = i2 + 1;
            this.O[i2] = c5969kWU;
            Format format = aVar.b;
            if (!this.K || format.D == null) {
                c5969kWU.y();
            } else {
                c5969kWU.Q(new TrackGroupArray(new TrackGroup(aVar.b)), 0, TrackGroupArray.E);
            }
            i++;
            j2 = j;
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < list2.size()) {
            C3449bW.a aVar2 = (C3449bW.a) list2.get(i4);
            C5969kW c5969kWU2 = u(3, new C3449bW.a[]{aVar2}, null, Collections.EMPTY_LIST, j);
            this.O[i2] = c5969kWU2;
            c5969kWU2.Q(new TrackGroupArray(new TrackGroup(aVar2.b)), 0, TrackGroupArray.E);
            i4++;
            i2++;
        }
        this.P = this.O;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void t(long j, boolean z) {
        for (C5969kW c5969kW : this.P) {
            c5969kW.t(j, z);
        }
    }

    public final C5969kW u(int i, C3449bW.a[] aVarArr, Format format, List list, long j) {
        return new C5969kW(i, this, new XV(this.B, this.C, aVarArr, this.D, this.I, list), this.G, j, format, this.E, this.F);
    }

    @Override // com.daaw.PP0.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void n(C5969kW c5969kW) {
        this.L.n(this);
    }

    public void y() {
        this.C.c(this);
        for (C5969kW c5969kW : this.O) {
            c5969kW.S();
        }
        this.L = null;
        this.F.r();
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long e(long j, DO0 do0) {
        return j;
    }
}
