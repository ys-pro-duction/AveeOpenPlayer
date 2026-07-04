package com.daaw;

import android.os.Handler;
import com.daaw.C0833Fc0;
import com.daaw.C3449bW;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.OM0;
import com.daaw.PP0;
import com.daaw.XV;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.kW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5969kW implements C0833Fc0.a, C0833Fc0.d, PP0, InterfaceC9838yJ, OM0.b {
    public final int B;
    public final c C;
    public final XV D;
    public final O3 E;
    public final Format F;
    public final int G;
    public final InterfaceC1896Pi0.a I;
    public boolean R;
    public boolean T;
    public boolean V;
    public boolean W;
    public int X;
    public Format Y;
    public boolean Z;
    public TrackGroupArray a0;
    public TrackGroupArray b0;
    public int[] c0;
    public int d0;
    public boolean e0;
    public long h0;
    public long i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public long n0;
    public final C0833Fc0 H = new C0833Fc0("Loader:HlsSampleStreamWrapper");
    public final XV.b J = new XV.b();
    public int[] Q = new int[0];
    public int S = -1;
    public int U = -1;
    public OM0[] P = new OM0[0];
    public boolean[] g0 = new boolean[0];
    public boolean[] f0 = new boolean[0];
    public final ArrayList K = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final Runnable L = new a();
    public final Runnable M = new b();
    public final Handler N = new Handler();

    /* JADX INFO: renamed from: com.daaw.kW$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5969kW.this.J();
        }
    }

    /* JADX INFO: renamed from: com.daaw.kW$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5969kW.this.P();
        }
    }

    /* JADX INFO: renamed from: com.daaw.kW$c */
    public interface c extends PP0.a {
        void a();

        void k(C3449bW.a aVar);
    }

    public C5969kW(int i, c cVar, XV xv, O3 o3, long j, Format format, int i2, InterfaceC1896Pi0.a aVar) {
        this.B = i;
        this.C = cVar;
        this.D = xv;
        this.E = o3;
        this.F = format;
        this.G = i2;
        this.I = aVar;
        this.h0 = j;
        this.i0 = j;
    }

    public static Format A(Format format, Format format2, boolean z) {
        if (format == null) {
            return format2;
        }
        int i = z ? format.C : -1;
        String strS = AbstractC6280lb1.s(format.D, AbstractC8834uk0.g(format2.G));
        String strD = AbstractC8834uk0.d(strS);
        if (strD == null) {
            strD = format2.G;
        }
        return format2.a(format.B, strD, strS, i, format.K, format.L, format.Y, format.Z);
    }

    public static boolean C(Format format, Format format2) {
        String str = format.G;
        String str2 = format2.G;
        int iG = AbstractC8834uk0.g(str);
        if (iG != 3) {
            return iG == AbstractC8834uk0.g(str2);
        }
        if (AbstractC6280lb1.b(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || format.a0 == format2.a0;
        }
        return false;
    }

    private static boolean F(AbstractC1799Ok abstractC1799Ok) {
        return abstractC1799Ok instanceof C3727cW;
    }

    private boolean G() {
        return this.i0 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (!this.Z && this.c0 == null && this.V) {
            for (OM0 om0 : this.P) {
                if (om0.s() == null) {
                    return;
                }
            }
            if (this.a0 != null) {
                I();
                return;
            }
            x();
            this.W = true;
            this.C.a();
        }
    }

    private boolean U(long j) {
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            OM0 om0 = this.P[i];
            om0.E();
            if (om0.f(j, true, false) == -1 && (this.g0[i] || !this.e0)) {
                return false;
            }
        }
        return true;
    }

    public static JE z(int i, int i2) {
        return new JE();
    }

    public final boolean B(C3727cW c3727cW) {
        int i = c3727cW.j;
        int length = this.P.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f0[i2] && this.P[i2].v() == i) {
                return false;
            }
        }
        return true;
    }

    public final C3727cW D() {
        return (C3727cW) this.K.get(r0.size() - 1);
    }

    public void E(int i, boolean z, boolean z2) {
        if (!z2) {
            this.R = false;
            this.T = false;
        }
        for (OM0 om0 : this.P) {
            om0.I(i);
        }
        if (z) {
            for (OM0 om02 : this.P) {
                om02.J();
            }
        }
    }

    public boolean H(int i) {
        if (this.l0) {
            return true;
        }
        return !G() && this.P[i].u();
    }

    public final void I() {
        int i = this.a0.B;
        int[] iArr = new int[i];
        this.c0 = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                OM0[] om0Arr = this.P;
                if (i3 >= om0Arr.length) {
                    break;
                }
                if (C(om0Arr[i3].s(), this.a0.a(i2).a(0))) {
                    this.c0[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((C5690jW) it.next()).c();
        }
    }

    public void K() {
        this.H.b();
        this.D.e();
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void p(AbstractC1799Ok abstractC1799Ok, long j, long j2, boolean z) {
        this.I.e(abstractC1799Ok.a, abstractC1799Ok.b, this.B, abstractC1799Ok.c, abstractC1799Ok.d, abstractC1799Ok.e, abstractC1799Ok.f, abstractC1799Ok.g, j, j2, abstractC1799Ok.c());
        if (z) {
            return;
        }
        T();
        if (this.X > 0) {
            this.C.n(this);
        }
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void s(AbstractC1799Ok abstractC1799Ok, long j, long j2) {
        this.D.g(abstractC1799Ok);
        this.I.h(abstractC1799Ok.a, abstractC1799Ok.b, this.B, abstractC1799Ok.c, abstractC1799Ok.d, abstractC1799Ok.e, abstractC1799Ok.f, abstractC1799Ok.g, j, j2, abstractC1799Ok.c());
        if (this.W) {
            this.C.n(this);
        } else {
            d(this.h0);
        }
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public int k(AbstractC1799Ok abstractC1799Ok, long j, long j2, IOException iOException) {
        boolean z;
        long jC = abstractC1799Ok.c();
        boolean zF = F(abstractC1799Ok);
        if (this.D.h(abstractC1799Ok, !zF || jC == 0, iOException)) {
            if (zF) {
                ArrayList arrayList = this.K;
                AbstractC7115ob.f(((C3727cW) arrayList.remove(arrayList.size() - 1)) == abstractC1799Ok);
                if (this.K.isEmpty()) {
                    this.i0 = this.h0;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.I.k(abstractC1799Ok.a, abstractC1799Ok.b, this.B, abstractC1799Ok.c, abstractC1799Ok.d, abstractC1799Ok.e, abstractC1799Ok.f, abstractC1799Ok.g, j, j2, abstractC1799Ok.c(), iOException, z);
        if (!z) {
            return iOException instanceof C3000Zs0 ? 3 : 0;
        }
        if (this.W) {
            this.C.n(this);
            return 2;
        }
        d(this.h0);
        return 2;
    }

    public boolean O(C3449bW.a aVar, boolean z) {
        return this.D.i(aVar, z);
    }

    public final void P() {
        this.V = true;
        J();
    }

    public void Q(TrackGroupArray trackGroupArray, int i, TrackGroupArray trackGroupArray2) {
        this.W = true;
        this.a0 = trackGroupArray;
        this.b0 = trackGroupArray2;
        this.d0 = i;
        this.C.a();
    }

    public int R(int i, C5103hP c5103hP, C1016Gw c1016Gw, boolean z) {
        if (G()) {
            return -3;
        }
        if (!this.K.isEmpty()) {
            int i2 = 0;
            while (i2 < this.K.size() - 1 && B((C3727cW) this.K.get(i2))) {
                i2++;
            }
            if (i2 > 0) {
                AbstractC6280lb1.R(this.K, 0, i2);
            }
            C3727cW c3727cW = (C3727cW) this.K.get(0);
            Format format = c3727cW.c;
            if (!format.equals(this.Y)) {
                this.I.c(this.B, format, c3727cW.d, c3727cW.e, c3727cW.f);
            }
            this.Y = format;
        }
        return this.P[i].y(c5103hP, c1016Gw, z, this.l0, this.h0);
    }

    public void S() {
        if (this.W) {
            for (OM0 om0 : this.P) {
                om0.k();
            }
        }
        this.H.j(this);
        this.N.removeCallbacksAndMessages(null);
        this.Z = true;
        this.O.clear();
    }

    public final void T() {
        for (OM0 om0 : this.P) {
            om0.D(this.j0);
        }
        this.j0 = false;
    }

    public boolean V(long j, boolean z) {
        this.h0 = j;
        if (this.V && !z && !G() && U(j)) {
            return false;
        }
        this.i0 = j;
        this.l0 = false;
        this.K.clear();
        if (this.H.g()) {
            this.H.f();
            return true;
        }
        T();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean W(com.google.android.exoplayer2.trackselection.c[] r14, boolean[] r15, com.daaw.QM0[] r16, boolean[] r17, long r18, boolean r20) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5969kW.W(com.google.android.exoplayer2.trackselection.c[], boolean[], com.daaw.QM0[], boolean[], long, boolean):boolean");
    }

    public void X(boolean z) {
        this.D.n(z);
    }

    public void Y(long j) {
        this.n0 = j;
        for (OM0 om0 : this.P) {
            om0.G(j);
        }
    }

    public int Z(int i, long j) {
        if (G()) {
            return 0;
        }
        OM0 om0 = this.P[i];
        if (this.l0 && j > om0.q()) {
            return om0.g();
        }
        int iF = om0.f(j, true, true);
        if (iF == -1) {
            return 0;
        }
        return iF;
    }

    @Override // com.daaw.InterfaceC9838yJ
    public Z41 a(int i, int i2) {
        OM0[] om0Arr = this.P;
        int length = om0Arr.length;
        if (i2 == 1) {
            int i3 = this.S;
            if (i3 != -1) {
                if (this.R) {
                    return this.Q[i3] == i ? om0Arr[i3] : z(i, i2);
                }
                this.R = true;
                this.Q[i3] = i;
                return om0Arr[i3];
            }
            if (this.m0) {
                return z(i, i2);
            }
        } else if (i2 == 2) {
            int i4 = this.U;
            if (i4 != -1) {
                if (this.T) {
                    return this.Q[i4] == i ? om0Arr[i4] : z(i, i2);
                }
                this.T = true;
                this.Q[i4] = i;
                return om0Arr[i4];
            }
            if (this.m0) {
                return z(i, i2);
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                if (this.Q[i5] == i) {
                    return this.P[i5];
                }
            }
            if (this.m0) {
                return z(i, i2);
            }
        }
        OM0 om0 = new OM0(this.E);
        om0.G(this.n0);
        om0.H(this);
        int i6 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.Q, i6);
        this.Q = iArrCopyOf;
        iArrCopyOf[length] = i;
        OM0[] om0Arr2 = (OM0[]) Arrays.copyOf(this.P, i6);
        this.P = om0Arr2;
        om0Arr2[length] = om0;
        boolean[] zArrCopyOf = Arrays.copyOf(this.g0, i6);
        this.g0 = zArrCopyOf;
        boolean z = i2 == 1 || i2 == 2;
        zArrCopyOf[length] = z;
        this.e0 |= z;
        if (i2 == 1) {
            this.R = true;
            this.S = length;
        } else if (i2 == 2) {
            this.T = true;
            this.U = length;
        }
        this.f0 = Arrays.copyOf(this.f0, i6);
        return om0;
    }

    public void a0(int i) {
        int i2 = this.c0[i];
        AbstractC7115ob.f(this.f0[i2]);
        this.f0[i2] = false;
    }

    public final void b0(QM0[] qm0Arr) {
        this.O.clear();
        for (QM0 qm0 : qm0Arr) {
            if (qm0 != null) {
                this.O.add((C5690jW) qm0);
            }
        }
    }

    @Override // com.daaw.PP0
    public long c() {
        if (G()) {
            return this.i0;
        }
        if (this.l0) {
            return Long.MIN_VALUE;
        }
        return D().g;
    }

    @Override // com.daaw.PP0
    public boolean d(long j) {
        C3727cW c3727cWD;
        long j2;
        if (this.l0 || this.H.g()) {
            return false;
        }
        if (G()) {
            j2 = this.i0;
            c3727cWD = null;
        } else {
            c3727cWD = D();
            j2 = c3727cWD.g;
        }
        this.D.b(c3727cWD, j, j2, this.J);
        XV.b bVar = this.J;
        boolean z = bVar.b;
        AbstractC1799Ok abstractC1799Ok = bVar.a;
        C3449bW.a aVar = bVar.c;
        bVar.a();
        if (z) {
            this.i0 = -9223372036854775807L;
            this.l0 = true;
            return true;
        }
        if (abstractC1799Ok == null) {
            if (aVar != null) {
                this.C.k(aVar);
            }
            return false;
        }
        if (F(abstractC1799Ok)) {
            this.i0 = -9223372036854775807L;
            C3727cW c3727cW = (C3727cW) abstractC1799Ok;
            c3727cW.h(this);
            this.K.add(c3727cW);
        }
        this.I.n(abstractC1799Ok.a, abstractC1799Ok.b, this.B, abstractC1799Ok.c, abstractC1799Ok.d, abstractC1799Ok.e, abstractC1799Ok.f, abstractC1799Ok.g, this.H.k(abstractC1799Ok, this, this.G));
        return true;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // com.daaw.PP0
    public long f() {
        /*
            r7 = this;
            boolean r0 = r7.l0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.G()
            if (r0 == 0) goto L10
            long r0 = r7.i0
            return r0
        L10:
            long r0 = r7.h0
            com.daaw.cW r2 = r7.D()
            boolean r3 = r2.f()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r7.K
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r7.K
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            com.daaw.cW r2 = (com.daaw.C3727cW) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.g
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.V
            if (r2 == 0) goto L55
            com.daaw.OM0[] r2 = r7.P
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.q()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5969kW.f():long");
    }

    @Override // com.daaw.C0833Fc0.d
    public void h() {
        T();
    }

    @Override // com.daaw.OM0.b
    public void j(Format format) {
        this.N.post(this.L);
    }

    public void l() {
        K();
    }

    @Override // com.daaw.InterfaceC9838yJ
    public void n() {
        this.m0 = true;
        this.N.post(this.M);
    }

    public TrackGroupArray r() {
        return this.a0;
    }

    public void t(long j, boolean z) {
        if (this.V) {
            int length = this.P.length;
            for (int i = 0; i < length; i++) {
                this.P[i].j(j, z, this.f0[i]);
            }
        }
    }

    public int w(int i) {
        int i2 = this.c0[i];
        if (i2 == -1) {
            return this.b0.b(this.a0.a(i)) == -1 ? -2 : -3;
        }
        boolean[] zArr = this.f0;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    public final void x() {
        int length = this.P.length;
        int i = 0;
        char c2 = 0;
        int i2 = -1;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = this.P[i].s().G;
            char c3 = AbstractC8834uk0.m(str) ? (char) 3 : AbstractC8834uk0.k(str) ? (char) 2 : AbstractC8834uk0.l(str) ? (char) 1 : (char) 0;
            if (c3 > c2) {
                i2 = i;
                c2 = c3;
            } else if (c3 == c2 && i2 != -1) {
                i2 = -1;
            }
            i++;
        }
        TrackGroup trackGroupC = this.D.c();
        int i3 = trackGroupC.B;
        this.d0 = -1;
        this.c0 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.c0[i4] = i4;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i5 = 0; i5 < length; i5++) {
            Format formatS = this.P[i5].s();
            if (i5 == i2) {
                Format[] formatArr = new Format[i3];
                for (int i6 = 0; i6 < i3; i6++) {
                    formatArr[i6] = A(trackGroupC.a(i6), formatS, true);
                }
                trackGroupArr[i5] = new TrackGroup(formatArr);
                this.d0 = i5;
            } else {
                trackGroupArr[i5] = new TrackGroup(A((c2 == 3 && AbstractC8834uk0.k(formatS.G)) ? this.F : null, formatS, false));
            }
        }
        this.a0 = new TrackGroupArray(trackGroupArr);
        AbstractC7115ob.f(this.b0 == null);
        this.b0 = TrackGroupArray.E;
    }

    public void y() {
        if (this.W) {
            return;
        }
        d(this.h0);
    }

    @Override // com.daaw.InterfaceC9838yJ
    public void b(CO0 co0) {
    }

    @Override // com.daaw.PP0
    public void g(long j) {
    }
}
