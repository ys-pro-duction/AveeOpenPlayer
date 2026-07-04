package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.daaw.AbstractC3895d51;
import com.daaw.C0488Bw0;
import com.daaw.C1124Hx;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.InterfaceC9110vi0;
import com.daaw.L31;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ZI implements Handler.Callback, InterfaceC9110vi0.a, AbstractC3895d51.a, InterfaceC1792Oi0.b, C1124Hx.a, C0488Bw0.a {
    public final VH0[] B;
    public final WH0[] C;
    public final AbstractC3895d51 D;
    public final C4173e51 E;
    public final InterfaceC0625Dc0 F;
    public final CU G;
    public final HandlerThread H;
    public final Handler I;
    public final WI J;
    public final L31.c K;
    public final L31.b L;
    public final long M;
    public final boolean N;
    public final C1124Hx O;
    public final ArrayList Q;
    public final InterfaceC5207hm R;
    public C9178vw0 U;
    public InterfaceC1792Oi0 V;
    public VH0[] W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a0;
    public boolean b0;
    public int c0;
    public e d0;
    public long e0;
    public int f0;
    public final C9947yi0 S = new C9947yi0();
    public DO0 T = DO0.g;
    public final d P = new d(null);

    public class a implements Runnable {
        public final /* synthetic */ C0488Bw0 B;

        public a(C0488Bw0 c0488Bw0) {
            this.B = c0488Bw0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ZI.this.f(this.B);
            } catch (VI e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class b {
        public final InterfaceC1792Oi0 a;
        public final L31 b;
        public final Object c;

        public b(InterfaceC1792Oi0 interfaceC1792Oi0, L31 l31, Object obj) {
            this.a = interfaceC1792Oi0;
            this.b = l31;
            this.c = obj;
        }
    }

    public static final class c implements Comparable {
        public final C0488Bw0 B;
        public int C;
        public long D;
        public Object E;

        public c(C0488Bw0 c0488Bw0) {
            this.B = c0488Bw0;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            Object obj = this.E;
            if ((obj == null) != (cVar.E == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.C - cVar.C;
            return i != 0 ? i : AbstractC6280lb1.j(this.D, cVar.D);
        }

        public void c(int i, long j, Object obj) {
            this.C = i;
            this.D = j;
            this.E = obj;
        }
    }

    public static final class d {
        public C9178vw0 a;
        public int b;
        public boolean c;
        public int d;

        public d() {
        }

        public boolean d(C9178vw0 c9178vw0) {
            return c9178vw0 != this.a || this.b > 0 || this.c;
        }

        public void e(int i) {
            this.b += i;
        }

        public void f(C9178vw0 c9178vw0) {
            this.a = c9178vw0;
            this.b = 0;
            this.c = false;
        }

        public void g(int i) {
            if (this.c && this.d != 4) {
                AbstractC7115ob.a(i == 4);
            } else {
                this.c = true;
                this.d = i;
            }
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e {
        public final L31 a;
        public final int b;
        public final long c;

        public e(L31 l31, int i, long j) {
            this.a = l31;
            this.b = i;
            this.c = j;
        }
    }

    public ZI(VH0[] vh0Arr, AbstractC3895d51 abstractC3895d51, C4173e51 c4173e51, InterfaceC0625Dc0 interfaceC0625Dc0, boolean z, int i, boolean z2, Handler handler, WI wi, InterfaceC5207hm interfaceC5207hm) {
        this.B = vh0Arr;
        this.D = abstractC3895d51;
        this.E = c4173e51;
        this.F = interfaceC0625Dc0;
        this.Y = z;
        this.a0 = i;
        this.b0 = z2;
        this.I = handler;
        this.J = wi;
        this.R = interfaceC5207hm;
        this.M = interfaceC0625Dc0.d();
        this.N = interfaceC0625Dc0.b();
        this.U = new C9178vw0(L31.a, -9223372036854775807L, TrackGroupArray.E, c4173e51);
        this.C = new WH0[vh0Arr.length];
        for (int i2 = 0; i2 < vh0Arr.length; i2++) {
            vh0Arr[i2].setIndex(i2);
            this.C[i2] = vh0Arr[i2].m();
        }
        this.O = new C1124Hx(this, interfaceC5207hm);
        this.Q = new ArrayList();
        this.W = new VH0[0];
        this.K = new L31.c();
        this.L = new L31.b();
        abstractC3895d51.a(this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.H = handlerThread;
        handlerThread.start();
        this.G = interfaceC5207hm.d(handlerThread.getLooper(), this);
    }

    public static Format[] p(com.google.android.exoplayer2.trackselection.c cVar) {
        int length = cVar != null ? cVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = cVar.d(i);
        }
        return formatArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0034, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x006b, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(long r7, long r9) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ZI.A(long, long):void");
    }

    public final void B() {
        this.S.v(this.e0);
        if (this.S.B()) {
            C9668xi0 c9668xi0M = this.S.m(this.e0, this.U);
            if (c9668xi0M == null) {
                this.V.e();
                return;
            }
            this.S.e(this.C, this.D, this.F.h(), this.V, this.U.a.g(c9668xi0M.a.a, this.L, true).b, c9668xi0M).o(this, c9668xi0M.b);
            Y(true);
        }
    }

    @Override // com.daaw.PP0.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void n(InterfaceC9110vi0 interfaceC9110vi0) {
        this.G.f(10, interfaceC9110vi0).sendToTarget();
    }

    public void D(InterfaceC1792Oi0 interfaceC1792Oi0, boolean z, boolean z2) {
        this.G.c(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC1792Oi0).sendToTarget();
    }

    public final void E(InterfaceC1792Oi0 interfaceC1792Oi0, boolean z, boolean z2) {
        this.c0++;
        J(true, z, z2);
        this.F.a();
        this.V = interfaceC1792Oi0;
        f0(2);
        interfaceC1792Oi0.f(this.J, true, this);
        this.G.b(2);
    }

    public synchronized void F() {
        if (this.X) {
            return;
        }
        this.G.b(7);
        boolean z = false;
        while (!this.X) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void G() {
        J(true, true, true);
        this.F.g();
        f0(1);
        this.H.quit();
        synchronized (this) {
            this.X = true;
            notifyAll();
        }
    }

    public final boolean H(VH0 vh0) {
        C9389wi0 c9389wi0 = this.S.o().i;
        return c9389wi0 != null && c9389wi0.f && vh0.i();
    }

    public final void I() throws VI {
        if (this.S.r()) {
            float f = this.O.g().a;
            C9389wi0 c9389wi0O = this.S.o();
            boolean z = true;
            for (C9389wi0 c9389wi0N = this.S.n(); c9389wi0N != null && c9389wi0N.f; c9389wi0N = c9389wi0N.i) {
                if (c9389wi0N.o(f)) {
                    if (z) {
                        C9389wi0 c9389wi0N2 = this.S.n();
                        boolean zW = this.S.w(c9389wi0N2);
                        boolean[] zArr = new boolean[this.B.length];
                        long jB = c9389wi0N2.b(this.U.j, zW, zArr);
                        l0(c9389wi0N2.j, c9389wi0N2.k);
                        C9178vw0 c9178vw0 = this.U;
                        if (c9178vw0.f != 4 && jB != c9178vw0.j) {
                            C9178vw0 c9178vw02 = this.U;
                            this.U = c9178vw02.g(c9178vw02.c, jB, c9178vw02.e);
                            this.P.g(4);
                            K(jB);
                        }
                        boolean[] zArr2 = new boolean[this.B.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            VH0[] vh0Arr = this.B;
                            if (i >= vh0Arr.length) {
                                break;
                            }
                            VH0 vh0 = vh0Arr[i];
                            boolean z2 = vh0.getState() != 0;
                            zArr2[i] = z2;
                            QM0 qm0 = c9389wi0N2.c[i];
                            if (qm0 != null) {
                                i2++;
                            }
                            if (z2) {
                                if (qm0 != vh0.f()) {
                                    g(vh0);
                                } else if (zArr[i]) {
                                    vh0.s(this.e0);
                                }
                            }
                            i++;
                        }
                        this.U = this.U.f(c9389wi0N2.j, c9389wi0N2.k);
                        l(zArr2, i2);
                    } else {
                        this.S.w(c9389wi0N);
                        if (c9389wi0N.f) {
                            c9389wi0N.a(Math.max(c9389wi0N.h.b, c9389wi0N.p(this.e0)), false);
                            l0(c9389wi0N.j, c9389wi0N.k);
                        }
                    }
                    if (this.U.f != 4) {
                        x();
                        n0();
                        this.G.b(2);
                        return;
                    }
                    return;
                }
                if (c9389wi0N == c9389wi0O) {
                    z = false;
                }
            }
        }
    }

    public final void J(boolean z, boolean z2, boolean z3) {
        InterfaceC1792Oi0 interfaceC1792Oi0;
        this.G.e(2);
        this.Z = false;
        this.O.i();
        this.e0 = 0L;
        for (VH0 vh0 : this.W) {
            try {
                g(vh0);
            } catch (VI | RuntimeException unused) {
            }
        }
        this.W = new VH0[0];
        this.S.d(!z2);
        Y(false);
        if (z2) {
            this.d0 = null;
        }
        if (z3) {
            this.S.A(L31.a);
            Iterator it = this.Q.iterator();
            while (it.hasNext()) {
                ((c) it.next()).B.k(false);
            }
            this.Q.clear();
            this.f0 = 0;
        }
        L31 l31 = z3 ? L31.a : this.U.a;
        Object obj = z3 ? null : this.U.b;
        InterfaceC1792Oi0.a aVar = z2 ? new InterfaceC1792Oi0.a(o()) : this.U.c;
        long j = z2 ? -9223372036854775807L : this.U.j;
        long j2 = z2 ? -9223372036854775807L : this.U.e;
        C9178vw0 c9178vw0 = this.U;
        this.U = new C9178vw0(l31, obj, aVar, j, j2, c9178vw0.f, false, z3 ? TrackGroupArray.E : c9178vw0.h, z3 ? this.E : c9178vw0.i);
        if (!z || (interfaceC1792Oi0 = this.V) == null) {
            return;
        }
        interfaceC1792Oi0.h(this);
        this.V = null;
    }

    public final void K(long j) {
        if (this.S.r()) {
            j = this.S.n().q(j);
        }
        this.e0 = j;
        this.O.f(j);
        for (VH0 vh0 : this.W) {
            vh0.s(this.e0);
        }
    }

    public final boolean L(c cVar) {
        Object obj = cVar.E;
        if (obj == null) {
            Pair pairN = N(new e(cVar.B.g(), cVar.B.i(), AbstractC6025ki.a(cVar.B.e())), false);
            if (pairN == null) {
                return false;
            }
            cVar.c(((Integer) pairN.first).intValue(), ((Long) pairN.second).longValue(), this.U.a.g(((Integer) pairN.first).intValue(), this.L, true).b);
        } else {
            int iB = this.U.a.b(obj);
            if (iB == -1) {
                return false;
            }
            cVar.C = iB;
        }
        return true;
    }

    public final void M() {
        for (int size = this.Q.size() - 1; size >= 0; size--) {
            if (!L((c) this.Q.get(size))) {
                ((c) this.Q.get(size)).B.k(false);
                this.Q.remove(size);
            }
        }
        Collections.sort(this.Q);
    }

    public final Pair N(e eVar, boolean z) {
        int iO;
        L31 l31 = this.U.a;
        L31 l312 = eVar.a;
        if (l31.o()) {
            return null;
        }
        L31 l313 = l312.o() ? l31 : l312;
        try {
            Pair pairI = l313.i(this.K, this.L, eVar.b, eVar.c);
            if (l31 == l313) {
                return pairI;
            }
            int iB = l31.b(l313.g(((Integer) pairI.first).intValue(), this.L, true).b);
            if (iB != -1) {
                return Pair.create(Integer.valueOf(iB), pairI.second);
            }
            if (!z || (iO = O(((Integer) pairI.first).intValue(), l313, l31)) == -1) {
                return null;
            }
            return q(l31, l31.f(iO, this.L).c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C4014dY(l31, eVar.b, eVar.c);
        }
    }

    public final int O(int i, L31 l31, L31 l312) {
        int iH = l31.h();
        int i2 = 0;
        int iD = i;
        int iB = -1;
        while (i2 < iH && iB == -1) {
            L31 l313 = l31;
            iD = l313.d(iD, this.L, this.K, this.a0, this.b0);
            if (iD == -1) {
                break;
            }
            iB = l312.b(l313.g(iD, this.L, true).b);
            i2++;
            l31 = l313;
        }
        return iB;
    }

    public final void P(long j, long j2) {
        this.G.e(2);
        this.G.d(2, j + j2);
    }

    public void Q(L31 l31, int i, long j) {
        this.G.f(3, new e(l31, i, j)).sendToTarget();
    }

    public final void R(boolean z) throws VI {
        InterfaceC1792Oi0.a aVar = this.S.n().h.a;
        long jU = U(aVar, this.U.j, true);
        if (jU != this.U.j) {
            C9178vw0 c9178vw0 = this.U;
            this.U = c9178vw0.g(aVar, jU, c9178vw0.e);
            if (z) {
                this.P.g(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:15:0x005d, B:17:0x0061, B:22:0x006a, B:25:0x0074, B:27:0x007e, B:31:0x008a, B:33:0x0094, B:35:0x00a4, B:41:0x00bb, B:45:0x00c5, B:46:0x00c9), top: B:56:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(com.daaw.ZI.e r21) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ZI.S(com.daaw.ZI$e):void");
    }

    public final long T(InterfaceC1792Oi0.a aVar, long j) {
        return U(aVar, j, this.S.n() != this.S.o());
    }

    public final long U(InterfaceC1792Oi0.a aVar, long j, boolean z) throws VI {
        k0();
        this.Z = false;
        f0(2);
        C9389wi0 c9389wi0N = this.S.n();
        C9389wi0 c9389wi0A = c9389wi0N;
        while (true) {
            if (c9389wi0A == null) {
                break;
            }
            if (g0(aVar, j, c9389wi0A)) {
                this.S.w(c9389wi0A);
                break;
            }
            c9389wi0A = this.S.a();
        }
        if (c9389wi0N != c9389wi0A || z) {
            for (VH0 vh0 : this.W) {
                g(vh0);
            }
            this.W = new VH0[0];
            c9389wi0N = null;
        }
        if (c9389wi0A != null) {
            o0(c9389wi0N);
            if (c9389wi0A.g) {
                j = c9389wi0A.a.m(j);
                c9389wi0A.a.t(j - this.M, this.N);
            }
            K(j);
            x();
        } else {
            this.S.d(true);
            K(j);
        }
        this.G.b(2);
        return j;
    }

    public final void V(C0488Bw0 c0488Bw0) {
        if (c0488Bw0.e() == -9223372036854775807L) {
            W(c0488Bw0);
            return;
        }
        if (this.V == null || this.c0 > 0) {
            this.Q.add(new c(c0488Bw0));
            return;
        }
        c cVar = new c(c0488Bw0);
        if (!L(cVar)) {
            c0488Bw0.k(false);
        } else {
            this.Q.add(cVar);
            Collections.sort(this.Q);
        }
    }

    public final void W(C0488Bw0 c0488Bw0) {
        if (c0488Bw0.c().getLooper() != this.G.g()) {
            this.G.f(15, c0488Bw0).sendToTarget();
            return;
        }
        f(c0488Bw0);
        int i = this.U.f;
        if (i == 3 || i == 2) {
            this.G.b(2);
        }
    }

    public final void X(C0488Bw0 c0488Bw0) {
        c0488Bw0.c().post(new a(c0488Bw0));
    }

    public final void Y(boolean z) {
        C9178vw0 c9178vw0 = this.U;
        if (c9178vw0.g != z) {
            this.U = c9178vw0.b(z);
        }
    }

    public void Z(boolean z) {
        this.G.a(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void a0(boolean z) {
        this.Z = false;
        this.Y = z;
        if (!z) {
            k0();
            n0();
            return;
        }
        int i = this.U.f;
        if (i == 3) {
            i0();
            this.G.b(2);
        } else if (i == 2) {
            this.G.b(2);
        }
    }

    @Override // com.daaw.C0488Bw0.a
    public synchronized void b(C0488Bw0 c0488Bw0) {
        if (this.X) {
            c0488Bw0.k(false);
        } else {
            this.G.f(14, c0488Bw0).sendToTarget();
        }
    }

    public final void b0(C9457ww0 c9457ww0) {
        this.O.d(c9457ww0);
    }

    @Override // com.daaw.C1124Hx.a
    public void c(C9457ww0 c9457ww0) {
        this.I.obtainMessage(1, c9457ww0).sendToTarget();
        p0(c9457ww0.a);
    }

    public final void c0(int i) throws VI {
        this.a0 = i;
        if (this.S.E(i)) {
            return;
        }
        R(true);
    }

    @Override // com.daaw.InterfaceC1792Oi0.b
    public void d(InterfaceC1792Oi0 interfaceC1792Oi0, L31 l31, Object obj) {
        this.G.f(8, new b(interfaceC1792Oi0, l31, obj)).sendToTarget();
    }

    public final void d0(DO0 do0) {
        this.T = do0;
    }

    public final void e0(boolean z) throws VI {
        this.b0 = z;
        if (this.S.F(z)) {
            return;
        }
        R(true);
    }

    public final void f(C0488Bw0 c0488Bw0) {
        if (c0488Bw0.j()) {
            return;
        }
        try {
            c0488Bw0.f().q(c0488Bw0.h(), c0488Bw0.d());
        } finally {
            c0488Bw0.k(true);
        }
    }

    public final void f0(int i) {
        C9178vw0 c9178vw0 = this.U;
        if (c9178vw0.f != i) {
            this.U = c9178vw0.d(i);
        }
    }

    public final void g(VH0 vh0) {
        this.O.c(vh0);
        m(vh0);
        vh0.e();
    }

    public final boolean g0(InterfaceC1792Oi0.a aVar, long j, C9389wi0 c9389wi0) {
        if (!aVar.equals(c9389wi0.h.a) || !c9389wi0.f) {
            return false;
        }
        this.U.a.f(c9389wi0.h.a.a, this.L);
        int iD = this.L.d(j);
        return iD == -1 || this.L.f(iD) == c9389wi0.h.c;
    }

    public final void h() throws VI {
        int i;
        long jC = this.R.c();
        m0();
        if (!this.S.r()) {
            z();
            P(jC, 10L);
            return;
        }
        C9389wi0 c9389wi0N = this.S.n();
        T41.a("doSomeWork");
        n0();
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        c9389wi0N.a.t(this.U.j - this.M, this.N);
        VH0[] vh0Arr = this.W;
        int length = vh0Arr.length;
        int i2 = 0;
        boolean z = true;
        boolean z2 = true;
        while (i2 < length) {
            VH0 vh0 = vh0Arr[i2];
            int i3 = i2;
            vh0.p(this.e0, jElapsedRealtime);
            z2 = z2 && vh0.c();
            boolean z3 = vh0.a() || vh0.c() || H(vh0);
            if (!z3) {
                vh0.r();
            }
            z = z && z3;
            i2 = i3 + 1;
        }
        if (!z) {
            z();
        }
        long j = c9389wi0N.h.e;
        if (z2 && ((j == -9223372036854775807L || j <= this.U.j) && c9389wi0N.h.g)) {
            f0(4);
            k0();
        } else if (this.U.f == 2 && h0(z)) {
            f0(3);
            if (this.Y) {
                i0();
            }
        } else if (this.U.f == 3 && (this.W.length != 0 ? !z : !w())) {
            this.Z = this.Y;
            f0(2);
            k0();
        }
        if (this.U.f == 2) {
            for (VH0 vh02 : this.W) {
                vh02.r();
            }
        }
        if ((this.Y && this.U.f == 3) || (i = this.U.f) == 2) {
            P(jC, 10L);
        } else if (this.W.length == 0 || i == 4) {
            this.G.e(2);
        } else {
            P(jC, 1000L);
        }
        T41.c();
    }

    public final boolean h0(boolean z) {
        if (this.W.length == 0) {
            return w();
        }
        if (!z) {
            return false;
        }
        if (!this.U.g) {
            return true;
        }
        C9389wi0 c9389wi0I = this.S.i();
        long jH = c9389wi0I.h(!c9389wi0I.h.g);
        return jH == Long.MIN_VALUE || this.F.e(jH - c9389wi0I.p(this.e0), this.O.g().a, this.Z);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    E((InterfaceC1792Oi0) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    a0(message.arg1 != 0);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    S((e) message.obj);
                    break;
                case 4:
                    b0((C9457ww0) message.obj);
                    break;
                case 5:
                    d0((DO0) message.obj);
                    break;
                case 6:
                    j0(message.arg1 != 0, true);
                    break;
                case 7:
                    G();
                    return true;
                case 8:
                    v((b) message.obj);
                    break;
                case 9:
                    t((InterfaceC9110vi0) message.obj);
                    break;
                case 10:
                    s((InterfaceC9110vi0) message.obj);
                    break;
                case 11:
                    I();
                    break;
                case 12:
                    c0(message.arg1);
                    break;
                case 13:
                    e0(message.arg1 != 0);
                    break;
                case 14:
                    V((C0488Bw0) message.obj);
                    break;
                case 15:
                    X((C0488Bw0) message.obj);
                    break;
                default:
                    return false;
            }
            y();
        } catch (VI e2) {
            j0(false, false);
            this.I.obtainMessage(2, e2).sendToTarget();
            y();
        } catch (IOException e3) {
            j0(false, false);
            this.I.obtainMessage(2, VI.b(e3)).sendToTarget();
            y();
        } catch (RuntimeException e4) {
            j0(false, false);
            this.I.obtainMessage(2, VI.c(e4)).sendToTarget();
            y();
        }
        return true;
    }

    public final void i(int i, boolean z, int i2) throws VI {
        C9389wi0 c9389wi0N = this.S.n();
        VH0 vh0 = this.B[i];
        this.W[i2] = vh0;
        if (vh0.getState() == 0) {
            C4173e51 c4173e51 = c9389wi0N.k;
            XH0 xh0 = c4173e51.b[i];
            Format[] formatArrP = p(c4173e51.c.a(i));
            boolean z2 = this.Y && this.U.f == 3;
            vh0.j(xh0, formatArrP, c9389wi0N.c[i], this.e0, !z && z2, c9389wi0N.j());
            this.O.e(vh0);
            if (z2) {
                vh0.start();
            }
        }
    }

    public final void i0() {
        this.Z = false;
        this.O.h();
        for (VH0 vh0 : this.W) {
            vh0.start();
        }
    }

    @Override // com.daaw.InterfaceC9110vi0.a
    public void j(InterfaceC9110vi0 interfaceC9110vi0) {
        this.G.f(9, interfaceC9110vi0).sendToTarget();
    }

    public final void j0(boolean z, boolean z2) {
        J(true, z, z);
        this.P.e(this.c0 + (z2 ? 1 : 0));
        this.c0 = 0;
        this.F.i();
        f0(1);
    }

    public final void k0() {
        this.O.i();
        for (VH0 vh0 : this.W) {
            m(vh0);
        }
    }

    public final void l(boolean[] zArr, int i) throws VI {
        this.W = new VH0[i];
        C9389wi0 c9389wi0N = this.S.n();
        int i2 = 0;
        for (int i3 = 0; i3 < this.B.length; i3++) {
            if (c9389wi0N.k.c(i3)) {
                i(i3, zArr[i3], i2);
                i2++;
            }
        }
    }

    public final void l0(TrackGroupArray trackGroupArray, C4173e51 c4173e51) {
        this.F.c(this.B, trackGroupArray, c4173e51.c);
    }

    public final void m(VH0 vh0) {
        if (vh0.getState() == 2) {
            vh0.stop();
        }
    }

    public final void m0() throws VI {
        InterfaceC1792Oi0 interfaceC1792Oi0 = this.V;
        if (interfaceC1792Oi0 == null) {
            return;
        }
        if (this.c0 > 0) {
            interfaceC1792Oi0.e();
            return;
        }
        B();
        C9389wi0 c9389wi0I = this.S.i();
        int i = 0;
        if (c9389wi0I == null || c9389wi0I.l()) {
            Y(false);
        } else if (!this.U.g) {
            x();
        }
        if (!this.S.r()) {
            return;
        }
        C9389wi0 c9389wi0N = this.S.n();
        C9389wi0 c9389wi0O = this.S.o();
        boolean z = false;
        while (this.Y && c9389wi0N != c9389wi0O && this.e0 >= c9389wi0N.i.e) {
            if (z) {
                y();
            }
            int i2 = c9389wi0N.h.f ? 0 : 3;
            C9389wi0 c9389wi0A = this.S.a();
            o0(c9389wi0N);
            C9178vw0 c9178vw0 = this.U;
            C9668xi0 c9668xi0 = c9389wi0A.h;
            this.U = c9178vw0.g(c9668xi0.a, c9668xi0.b, c9668xi0.d);
            this.P.g(i2);
            n0();
            c9389wi0N = c9389wi0A;
            z = true;
        }
        if (c9389wi0O.h.g) {
            while (true) {
                VH0[] vh0Arr = this.B;
                if (i >= vh0Arr.length) {
                    return;
                }
                VH0 vh0 = vh0Arr[i];
                QM0 qm0 = c9389wi0O.c[i];
                if (qm0 != null && vh0.f() == qm0 && vh0.i()) {
                    vh0.k();
                }
                i++;
            }
        } else {
            C9389wi0 c9389wi0 = c9389wi0O.i;
            if (c9389wi0 == null || !c9389wi0.f) {
                return;
            }
            int i3 = 0;
            while (true) {
                VH0[] vh0Arr2 = this.B;
                if (i3 < vh0Arr2.length) {
                    VH0 vh02 = vh0Arr2[i3];
                    QM0 qm02 = c9389wi0O.c[i3];
                    if (vh02.f() != qm02) {
                        return;
                    }
                    if (qm02 != null && !vh02.i()) {
                        return;
                    } else {
                        i3++;
                    }
                } else {
                    C4173e51 c4173e51 = c9389wi0O.k;
                    C9389wi0 c9389wi0B = this.S.b();
                    C4173e51 c4173e512 = c9389wi0B.k;
                    boolean z2 = c9389wi0B.a.q() != -9223372036854775807L;
                    int i4 = 0;
                    while (true) {
                        VH0[] vh0Arr3 = this.B;
                        if (i4 >= vh0Arr3.length) {
                            return;
                        }
                        VH0 vh03 = vh0Arr3[i4];
                        if (c4173e51.c(i4)) {
                            if (z2) {
                                vh03.k();
                            } else if (!vh03.t()) {
                                com.google.android.exoplayer2.trackselection.c cVarA = c4173e512.c.a(i4);
                                boolean zC = c4173e512.c(i4);
                                boolean z3 = this.C[i4].h() == 5;
                                XH0 xh0 = c4173e51.b[i4];
                                XH0 xh02 = c4173e512.b[i4];
                                if (zC && xh02.equals(xh0) && !z3) {
                                    vh03.l(p(cVarA), c9389wi0B.c[i4], c9389wi0B.j());
                                } else {
                                    vh03.k();
                                }
                            }
                        }
                        i4++;
                    }
                }
            }
        }
    }

    public final void n0() {
        if (this.S.r()) {
            C9389wi0 c9389wi0N = this.S.n();
            long jQ = c9389wi0N.a.q();
            if (jQ != -9223372036854775807L) {
                K(jQ);
                if (jQ != this.U.j) {
                    C9178vw0 c9178vw0 = this.U;
                    this.U = c9178vw0.g(c9178vw0.c, jQ, c9178vw0.e);
                    this.P.g(4);
                }
            } else {
                long j = this.O.j();
                this.e0 = j;
                long jP = c9389wi0N.p(j);
                A(this.U.j, jP);
                this.U.j = jP;
            }
            this.U.k = this.W.length == 0 ? c9389wi0N.h.e : c9389wi0N.h(true);
        }
    }

    public final int o() {
        L31 l31 = this.U.a;
        if (l31.o()) {
            return 0;
        }
        return l31.k(l31.a(this.b0), this.K).f;
    }

    public final void o0(C9389wi0 c9389wi0) throws VI {
        C9389wi0 c9389wi0N = this.S.n();
        if (c9389wi0N == null || c9389wi0 == c9389wi0N) {
            return;
        }
        boolean[] zArr = new boolean[this.B.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            VH0[] vh0Arr = this.B;
            if (i >= vh0Arr.length) {
                this.U = this.U.f(c9389wi0N.j, c9389wi0N.k);
                l(zArr, i2);
                return;
            }
            VH0 vh0 = vh0Arr[i];
            zArr[i] = vh0.getState() != 0;
            if (c9389wi0N.k.c(i)) {
                i2++;
            }
            if (zArr[i] && (!c9389wi0N.k.c(i) || (vh0.t() && vh0.f() == c9389wi0.c[i]))) {
                g(vh0);
            }
            i++;
        }
    }

    public final void p0(float f) {
        for (C9389wi0 c9389wi0H = this.S.h(); c9389wi0H != null; c9389wi0H = c9389wi0H.i) {
            C4173e51 c4173e51 = c9389wi0H.k;
            if (c4173e51 != null) {
                for (com.google.android.exoplayer2.trackselection.c cVar : c4173e51.c.b()) {
                    if (cVar != null) {
                        cVar.m(f);
                    }
                }
            }
        }
    }

    public final Pair q(L31 l31, int i, long j) {
        return l31.i(this.K, this.L, i, j);
    }

    public Looper r() {
        return this.H.getLooper();
    }

    public final void s(InterfaceC9110vi0 interfaceC9110vi0) {
        if (this.S.u(interfaceC9110vi0)) {
            this.S.v(this.e0);
            x();
        }
    }

    public final void t(InterfaceC9110vi0 interfaceC9110vi0) throws VI {
        if (this.S.u(interfaceC9110vi0)) {
            C9389wi0 c9389wi0I = this.S.i();
            c9389wi0I.k(this.O.g().a);
            l0(c9389wi0I.j, c9389wi0I.k);
            if (!this.S.r()) {
                K(this.S.a().h.b);
                o0(null);
            }
            x();
        }
    }

    public final void u() {
        f0(4);
        J(false, true, false);
    }

    public final void v(b bVar) throws VI {
        if (bVar.a != this.V) {
            return;
        }
        L31 l31 = this.U.a;
        L31 l312 = bVar.b;
        Object obj = bVar.c;
        this.S.A(l312);
        this.U = this.U.e(l312, obj);
        M();
        int i = this.c0;
        if (i > 0) {
            this.P.e(i);
            this.c0 = 0;
            e eVar = this.d0;
            if (eVar != null) {
                Pair pairN = N(eVar, true);
                this.d0 = null;
                if (pairN == null) {
                    u();
                    return;
                }
                int iIntValue = ((Integer) pairN.first).intValue();
                long jLongValue = ((Long) pairN.second).longValue();
                InterfaceC1792Oi0.a aVarX = this.S.x(iIntValue, jLongValue);
                this.U = this.U.g(aVarX, aVarX.b() ? 0L : jLongValue, jLongValue);
                return;
            }
            if (this.U.d == -9223372036854775807L) {
                if (l312.o()) {
                    u();
                    return;
                }
                Pair pairQ = q(l312, l312.a(this.b0), -9223372036854775807L);
                int iIntValue2 = ((Integer) pairQ.first).intValue();
                long jLongValue2 = ((Long) pairQ.second).longValue();
                InterfaceC1792Oi0.a aVarX2 = this.S.x(iIntValue2, jLongValue2);
                this.U = this.U.g(aVarX2, aVarX2.b() ? 0L : jLongValue2, jLongValue2);
                return;
            }
            return;
        }
        C9178vw0 c9178vw0 = this.U;
        int i2 = c9178vw0.c.a;
        long j = c9178vw0.e;
        if (l31.o()) {
            if (l312.o()) {
                return;
            }
            InterfaceC1792Oi0.a aVarX3 = this.S.x(i2, j);
            this.U = this.U.g(aVarX3, aVarX3.b() ? 0L : j, j);
            return;
        }
        C9389wi0 c9389wi0H = this.S.h();
        int iB = l312.b(c9389wi0H == null ? l31.g(i2, this.L, true).b : c9389wi0H.b);
        if (iB != -1) {
            if (iB != i2) {
                this.U = this.U.c(iB);
            }
            InterfaceC1792Oi0.a aVar = this.U.c;
            if (aVar.b()) {
                InterfaceC1792Oi0.a aVarX4 = this.S.x(iB, j);
                if (!aVarX4.equals(aVar)) {
                    this.U = this.U.g(aVarX4, T(aVarX4, aVarX4.b() ? 0L : j), j);
                    return;
                }
            }
            if (this.S.D(aVar, this.e0)) {
                return;
            }
            R(false);
            return;
        }
        int iO = O(i2, l31, l312);
        if (iO == -1) {
            u();
            return;
        }
        Pair pairQ2 = q(l312, l312.f(iO, this.L).c, -9223372036854775807L);
        int iIntValue3 = ((Integer) pairQ2.first).intValue();
        long jLongValue3 = ((Long) pairQ2.second).longValue();
        InterfaceC1792Oi0.a aVarX5 = this.S.x(iIntValue3, jLongValue3);
        l312.g(iIntValue3, this.L, true);
        if (c9389wi0H != null) {
            Object obj2 = this.L.b;
            c9389wi0H.h = c9389wi0H.h.a(-1);
            while (true) {
                c9389wi0H = c9389wi0H.i;
                if (c9389wi0H == null) {
                    break;
                } else if (c9389wi0H.b.equals(obj2)) {
                    c9389wi0H.h = this.S.p(c9389wi0H.h, iIntValue3);
                } else {
                    c9389wi0H.h = c9389wi0H.h.a(-1);
                }
            }
        }
        this.U = this.U.g(aVarX5, T(aVarX5, aVarX5.b() ? 0L : jLongValue3), jLongValue3);
    }

    public final boolean w() {
        C9389wi0 c9389wi0N = this.S.n();
        long j = c9389wi0N.h.e;
        if (j == -9223372036854775807L || this.U.j < j) {
            return true;
        }
        C9389wi0 c9389wi0 = c9389wi0N.i;
        if (c9389wi0 != null) {
            return c9389wi0.f || c9389wi0.h.a.b();
        }
        return false;
    }

    public final void x() {
        C9389wi0 c9389wi0I = this.S.i();
        long jI = c9389wi0I.i();
        if (jI == Long.MIN_VALUE) {
            Y(false);
            return;
        }
        boolean zF = this.F.f(jI - c9389wi0I.p(this.e0), this.O.g().a);
        Y(zF);
        if (zF) {
            c9389wi0I.d(this.e0);
        }
    }

    public final void y() {
        if (this.P.d(this.U)) {
            this.I.obtainMessage(0, this.P.b, this.P.c ? this.P.d : -1, this.U).sendToTarget();
            this.P.f(this.U);
        }
    }

    public final void z() {
        C9389wi0 c9389wi0I = this.S.i();
        C9389wi0 c9389wi0O = this.S.o();
        if (c9389wi0I == null || c9389wi0I.f) {
            return;
        }
        if (c9389wi0O == null || c9389wi0O.i == c9389wi0I) {
            for (VH0 vh0 : this.W) {
                if (!vh0.i()) {
                    return;
                }
            }
            c9389wi0I.a.l();
        }
    }
}
