package com.daaw;

import android.net.Uri;
import android.os.Handler;
import com.daaw.C0833Fc0;
import com.daaw.CO0;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.InterfaceC9110vi0;
import com.daaw.OM0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.wJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9280wJ implements InterfaceC9110vi0, InterfaceC9838yJ, C0833Fc0.a, C0833Fc0.d, OM0.b {
    public final Uri B;
    public final InterfaceC2595Vv C;
    public final int D;
    public final InterfaceC1896Pi0.a E;
    public final e F;
    public final O3 G;
    public final String H;
    public final long I;
    public final d K;
    public InterfaceC9110vi0.a P;
    public CO0 Q;
    public boolean T;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public TrackGroupArray a0;
    public boolean[] c0;
    public boolean[] d0;
    public boolean[] e0;
    public boolean f0;
    public long h0;
    public boolean j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public final C0833Fc0 J = new C0833Fc0("Loader:ExtractorMediaPeriod");
    public final C4380eq L = new C4380eq();
    public final Runnable M = new a();
    public final Runnable N = new b();
    public final Handler O = new Handler();
    public int[] S = new int[0];
    public OM0[] R = new OM0[0];
    public long i0 = -9223372036854775807L;
    public long g0 = -1;
    public long b0 = -9223372036854775807L;

    /* JADX INFO: renamed from: com.daaw.wJ$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9280wJ.this.I();
        }
    }

    /* JADX INFO: renamed from: com.daaw.wJ$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9280wJ.this.m0) {
                return;
            }
            C9280wJ.this.P.n(C9280wJ.this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.wJ$c */
    public final class c implements C0833Fc0.c {
        public final Uri a;
        public final InterfaceC2595Vv b;
        public final d c;
        public final C4380eq d;
        public volatile boolean f;
        public long h;
        public C2907Yv i;
        public long k;
        public final C2082Qx0 e = new C2082Qx0();
        public boolean g = true;
        public long j = -1;

        public c(Uri uri, InterfaceC2595Vv interfaceC2595Vv, d dVar, C4380eq c4380eq) {
            this.a = (Uri) AbstractC7115ob.e(uri);
            this.b = (InterfaceC2595Vv) AbstractC7115ob.e(interfaceC2595Vv);
            this.c = (d) AbstractC7115ob.e(dVar);
            this.d = c4380eq;
        }

        @Override // com.daaw.C0833Fc0.c
        public void a() throws Throwable {
            int iD = 0;
            while (iD == 0 && !this.f) {
                C5536ix c5536ix = null;
                try {
                    long position = this.e.a;
                    C2907Yv c2907Yv = new C2907Yv(this.a, position, -1L, C9280wJ.this.H);
                    this.i = c2907Yv;
                    long jD = this.b.d(c2907Yv);
                    this.j = jD;
                    if (jD != -1) {
                        this.j = jD + position;
                    }
                    C5536ix c5536ix2 = new C5536ix(this.b, position, this.j);
                    try {
                        InterfaceC8715uJ interfaceC8715uJB = this.c.b(c5536ix2, this.b.e());
                        if (this.g) {
                            interfaceC8715uJB.f(position, this.h);
                            this.g = false;
                        }
                        while (iD == 0 && !this.f) {
                            this.d.a();
                            iD = interfaceC8715uJB.d(c5536ix2, this.e);
                            if (c5536ix2.getPosition() > C9280wJ.this.I + position) {
                                position = c5536ix2.getPosition();
                                this.d.b();
                                C9280wJ.this.O.post(C9280wJ.this.N);
                            }
                        }
                        if (iD == 1) {
                            iD = 0;
                        } else {
                            this.e.a = c5536ix2.getPosition();
                            this.k = this.e.a - this.i.c;
                        }
                        AbstractC6280lb1.h(this.b);
                    } catch (Throwable th) {
                        th = th;
                        c5536ix = c5536ix2;
                        if (iD != 1 && c5536ix != null) {
                            this.e.a = c5536ix.getPosition();
                            this.k = this.e.a - this.i.c;
                        }
                        AbstractC6280lb1.h(this.b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // com.daaw.C0833Fc0.c
        public void b() {
            this.f = true;
        }

        public void g(long j, long j2) {
            this.e.a = j;
            this.h = j2;
            this.g = true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wJ$d */
    public static final class d {
        public final InterfaceC8715uJ[] a;
        public final InterfaceC9838yJ b;
        public InterfaceC8715uJ c;

        public d(InterfaceC8715uJ[] interfaceC8715uJArr, InterfaceC9838yJ interfaceC9838yJ) {
            this.a = interfaceC8715uJArr;
            this.b = interfaceC9838yJ;
        }

        public void a() {
            InterfaceC8715uJ interfaceC8715uJ = this.c;
            if (interfaceC8715uJ != null) {
                interfaceC8715uJ.a();
                this.c = null;
            }
        }

        public InterfaceC8715uJ b(InterfaceC9001vJ interfaceC9001vJ, Uri uri) throws Y91 {
            InterfaceC8715uJ interfaceC8715uJ = this.c;
            if (interfaceC8715uJ != null) {
                return interfaceC8715uJ;
            }
            InterfaceC8715uJ[] interfaceC8715uJArr = this.a;
            int length = interfaceC8715uJArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InterfaceC8715uJ interfaceC8715uJ2 = interfaceC8715uJArr[i];
                try {
                    if (interfaceC8715uJ2.c(interfaceC9001vJ)) {
                        this.c = interfaceC8715uJ2;
                        interfaceC9001vJ.i();
                        break;
                    }
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    interfaceC9001vJ.i();
                    throw th;
                }
                interfaceC9001vJ.i();
                i++;
            }
            InterfaceC8715uJ interfaceC8715uJ3 = this.c;
            if (interfaceC8715uJ3 != null) {
                interfaceC8715uJ3.i(this.b);
                return this.c;
            }
            throw new Y91("None of the available extractors (" + AbstractC6280lb1.t(this.a) + ") could read the stream.", uri);
        }
    }

    /* JADX INFO: renamed from: com.daaw.wJ$e */
    public interface e {
        void b(long j, boolean z);
    }

    /* JADX INFO: renamed from: com.daaw.wJ$f */
    public final class f implements QM0 {
        public final int B;

        public f(int i) {
            this.B = i;
        }

        @Override // com.daaw.QM0
        public boolean a() {
            return C9280wJ.this.H(this.B);
        }

        @Override // com.daaw.QM0
        public void b() throws IOException {
            C9280wJ.this.L();
        }

        @Override // com.daaw.QM0
        public int j(C5103hP c5103hP, C1016Gw c1016Gw, boolean z) {
            return C9280wJ.this.P(this.B, c5103hP, c1016Gw, z);
        }

        @Override // com.daaw.QM0
        public int n(long j) {
            return C9280wJ.this.S(this.B, j);
        }
    }

    public C9280wJ(Uri uri, InterfaceC2595Vv interfaceC2595Vv, InterfaceC8715uJ[] interfaceC8715uJArr, int i, InterfaceC1896Pi0.a aVar, e eVar, O3 o3, String str, int i2) {
        this.B = uri;
        this.C = interfaceC2595Vv;
        this.D = i;
        this.E = aVar;
        this.F = eVar;
        this.G = o3;
        this.H = str;
        this.I = i2;
        this.K = new d(interfaceC8715uJArr, this);
        this.V = i == -1 ? 3 : i;
        aVar.q();
    }

    public static boolean F(IOException iOException) {
        return iOException instanceof Y91;
    }

    private boolean G() {
        return this.i0 != -9223372036854775807L;
    }

    public final boolean B(c cVar, int i) {
        CO0 co0;
        if (this.g0 != -1 || ((co0 = this.Q) != null && co0.h() != -9223372036854775807L)) {
            this.k0 = i;
            return true;
        }
        if (this.U && !U()) {
            this.j0 = true;
            return false;
        }
        this.X = this.U;
        this.h0 = 0L;
        this.k0 = 0;
        for (OM0 om0 : this.R) {
            om0.C();
        }
        cVar.g(0L, 0L);
        return true;
    }

    public final void C(c cVar) {
        if (this.g0 == -1) {
            this.g0 = cVar.j;
        }
    }

    public final int D() {
        int iT = 0;
        for (OM0 om0 : this.R) {
            iT += om0.t();
        }
        return iT;
    }

    public final long E() {
        long jMax = Long.MIN_VALUE;
        for (OM0 om0 : this.R) {
            jMax = Math.max(jMax, om0.q());
        }
        return jMax;
    }

    public boolean H(int i) {
        if (U()) {
            return false;
        }
        return this.l0 || this.R[i].u();
    }

    public final void I() {
        if (this.m0 || this.U || this.Q == null || !this.T) {
            return;
        }
        for (OM0 om0 : this.R) {
            if (om0.s() == null) {
                return;
            }
        }
        this.L.b();
        int length = this.R.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.d0 = new boolean[length];
        this.c0 = new boolean[length];
        this.e0 = new boolean[length];
        this.b0 = this.Q.h();
        for (int i = 0; i < length; i++) {
            Format formatS = this.R[i].s();
            trackGroupArr[i] = new TrackGroup(formatS);
            String str = formatS.G;
            boolean z = AbstractC8834uk0.m(str) || AbstractC8834uk0.k(str);
            this.d0[i] = z;
            this.f0 = z | this.f0;
        }
        this.a0 = new TrackGroupArray(trackGroupArr);
        if (this.D == -1 && this.g0 == -1 && this.Q.h() == -9223372036854775807L) {
            this.V = 6;
        }
        this.U = true;
        this.F.b(this.b0, this.Q.e());
        this.P.j(this);
    }

    public final void J(int i) {
        if (this.e0[i]) {
            return;
        }
        Format formatA = this.a0.a(i).a(0);
        this.E.c(AbstractC8834uk0.g(formatA.G), formatA, 0, null, this.h0);
        this.e0[i] = true;
    }

    public final void K(int i) {
        if (this.j0 && this.d0[i] && !this.R[i].u()) {
            this.i0 = 0L;
            this.j0 = false;
            this.X = true;
            this.h0 = 0L;
            this.k0 = 0;
            for (OM0 om0 : this.R) {
                om0.C();
            }
            this.P.n(this);
        }
    }

    public void L() throws IOException {
        this.J.h(this.V);
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void p(c cVar, long j, long j2, boolean z) {
        this.E.e(cVar.i, 1, -1, null, 0, null, cVar.h, this.b0, j, j2, cVar.k);
        if (z) {
            return;
        }
        C(cVar);
        for (OM0 om0 : this.R) {
            om0.C();
        }
        if (this.Z > 0) {
            this.P.n(this);
        }
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void s(c cVar, long j, long j2) {
        if (this.b0 == -9223372036854775807L) {
            long jE = E();
            long j3 = jE == Long.MIN_VALUE ? 0L : jE + 10000;
            this.b0 = j3;
            this.F.b(j3, this.Q.e());
        }
        this.E.h(cVar.i, 1, -1, null, 0, null, cVar.h, this.b0, j, j2, cVar.k);
        C(cVar);
        this.l0 = true;
        this.P.n(this);
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public int k(c cVar, long j, long j2, IOException iOException) {
        boolean zF = F(iOException);
        this.E.k(cVar.i, 1, -1, null, 0, null, cVar.h, this.b0, j, j2, cVar.k, iOException, zF);
        C(cVar);
        if (zF) {
            return 3;
        }
        int iD = D();
        boolean z = iD > this.k0;
        if (B(cVar, iD)) {
            return z ? 1 : 0;
        }
        return 2;
    }

    public int P(int i, C5103hP c5103hP, C1016Gw c1016Gw, boolean z) {
        if (U()) {
            return -3;
        }
        int iY = this.R[i].y(c5103hP, c1016Gw, z, this.l0, this.h0);
        if (iY == -4) {
            J(i);
            return iY;
        }
        if (iY == -3) {
            K(i);
        }
        return iY;
    }

    public void Q() {
        if (this.U) {
            for (OM0 om0 : this.R) {
                om0.k();
            }
        }
        this.J.j(this);
        this.O.removeCallbacksAndMessages(null);
        this.P = null;
        this.m0 = true;
        this.E.r();
    }

    public final boolean R(long j) {
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            OM0 om0 = this.R[i];
            om0.E();
            if (om0.f(j, true, false) == -1 && (this.d0[i] || !this.f0)) {
                return false;
            }
        }
        return true;
    }

    public int S(int i, long j) {
        int iG = 0;
        if (U()) {
            return 0;
        }
        OM0 om0 = this.R[i];
        if (!this.l0 || j <= om0.q()) {
            int iF = om0.f(j, true, true);
            if (iF != -1) {
                iG = iF;
            }
        } else {
            iG = om0.g();
        }
        if (iG > 0) {
            J(i);
            return iG;
        }
        K(i);
        return iG;
    }

    public final void T() {
        c cVar = new c(this.B, this.C, this.K, this.L);
        if (this.U) {
            AbstractC7115ob.f(G());
            long j = this.b0;
            if (j != -9223372036854775807L && this.i0 >= j) {
                this.l0 = true;
                this.i0 = -9223372036854775807L;
                return;
            } else {
                cVar.g(this.Q.g(this.i0).a.b, this.i0);
                this.i0 = -9223372036854775807L;
            }
        }
        this.k0 = D();
        this.E.n(cVar.i, 1, -1, null, 0, null, cVar.h, this.b0, this.J.k(cVar, this, this.V));
    }

    public final boolean U() {
        return this.X || G();
    }

    @Override // com.daaw.InterfaceC9838yJ
    public Z41 a(int i, int i2) {
        int length = this.R.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.S[i3] == i) {
                return this.R[i3];
            }
        }
        OM0 om0 = new OM0(this.G);
        om0.H(this);
        int i4 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.S, i4);
        this.S = iArrCopyOf;
        iArrCopyOf[length] = i;
        OM0[] om0Arr = (OM0[]) Arrays.copyOf(this.R, i4);
        this.R = om0Arr;
        om0Arr[length] = om0;
        return om0;
    }

    @Override // com.daaw.InterfaceC9838yJ
    public void b(CO0 co0) {
        this.Q = co0;
        this.O.post(this.M);
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long c() {
        if (this.Z == 0) {
            return Long.MIN_VALUE;
        }
        return f();
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public boolean d(long j) {
        if (this.l0 || this.j0) {
            return false;
        }
        if (this.U && this.Z == 0) {
            return false;
        }
        boolean zC = this.L.c();
        if (this.J.g()) {
            return zC;
        }
        T();
        return true;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long e(long j, DO0 do0) {
        if (!this.Q.e()) {
            return 0L;
        }
        CO0.a aVarG = this.Q.g(j);
        return AbstractC6280lb1.S(j, do0, aVarG.a.a, aVarG.b.a);
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public long f() {
        long jE;
        if (this.l0) {
            return Long.MIN_VALUE;
        }
        if (G()) {
            return this.i0;
        }
        if (this.f0) {
            int length = this.R.length;
            jE = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (this.d0[i]) {
                    jE = Math.min(jE, this.R[i].q());
                }
            }
        } else {
            jE = E();
        }
        return jE == Long.MIN_VALUE ? this.h0 : jE;
    }

    @Override // com.daaw.C0833Fc0.d
    public void h() {
        for (OM0 om0 : this.R) {
            om0.C();
        }
        this.K.a();
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long i(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, QM0[] qm0Arr, boolean[] zArr2, long j) {
        com.google.android.exoplayer2.trackselection.c cVar;
        AbstractC7115ob.f(this.U);
        int i = this.Z;
        int i2 = 0;
        for (int i3 = 0; i3 < cVarArr.length; i3++) {
            QM0 qm0 = qm0Arr[i3];
            if (qm0 != null && (cVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((f) qm0).B;
                AbstractC7115ob.f(this.c0[i4]);
                this.Z--;
                this.c0[i4] = false;
                qm0Arr[i3] = null;
            }
        }
        boolean z = !this.W ? j == 0 : i != 0;
        for (int i5 = 0; i5 < cVarArr.length; i5++) {
            if (qm0Arr[i5] == null && (cVar = cVarArr[i5]) != null) {
                AbstractC7115ob.f(cVar.length() == 1);
                AbstractC7115ob.f(cVar.g(0) == 0);
                int iB = this.a0.b(cVar.a());
                AbstractC7115ob.f(!this.c0[iB]);
                this.Z++;
                this.c0[iB] = true;
                qm0Arr[i5] = new f(iB);
                zArr2[i5] = true;
                if (!z) {
                    OM0 om0 = this.R[iB];
                    om0.E();
                    z = om0.f(j, true, true) == -1 && om0.r() != 0;
                }
            }
        }
        if (this.Z == 0) {
            this.j0 = false;
            this.X = false;
            if (this.J.g()) {
                OM0[] om0Arr = this.R;
                int length = om0Arr.length;
                while (i2 < length) {
                    om0Arr[i2].k();
                    i2++;
                }
                this.J.f();
            } else {
                OM0[] om0Arr2 = this.R;
                int length2 = om0Arr2.length;
                while (i2 < length2) {
                    om0Arr2[i2].C();
                    i2++;
                }
            }
        } else if (z) {
            j = m(j);
            while (i2 < qm0Arr.length) {
                if (qm0Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.W = true;
        return j;
    }

    @Override // com.daaw.OM0.b
    public void j(Format format) {
        this.O.post(this.M);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void l() throws IOException {
        L();
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long m(long j) {
        if (!this.Q.e()) {
            j = 0;
        }
        this.h0 = j;
        this.X = false;
        if (G() || !R(j)) {
            this.j0 = false;
            this.i0 = j;
            this.l0 = false;
            if (this.J.g()) {
                this.J.f();
                return j;
            }
            for (OM0 om0 : this.R) {
                om0.C();
            }
        }
        return j;
    }

    @Override // com.daaw.InterfaceC9838yJ
    public void n() {
        this.T = true;
        this.O.post(this.M);
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void o(InterfaceC9110vi0.a aVar, long j) {
        this.P = aVar;
        this.L.c();
        T();
    }

    @Override // com.daaw.InterfaceC9110vi0
    public long q() {
        if (!this.Y) {
            this.E.t();
            this.Y = true;
        }
        if (!this.X) {
            return -9223372036854775807L;
        }
        if (!this.l0 && D() <= this.k0) {
            return -9223372036854775807L;
        }
        this.X = false;
        return this.h0;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public TrackGroupArray r() {
        return this.a0;
    }

    @Override // com.daaw.InterfaceC9110vi0
    public void t(long j, boolean z) {
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i].j(j, z, this.c0[i]);
        }
    }

    @Override // com.daaw.InterfaceC9110vi0, com.daaw.PP0
    public void g(long j) {
    }
}
