package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.de3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4046de3 implements Handler.Callback, Sp3, Bs3, InterfaceC9935yf3, Ja3, Gf3 {
    public final Uf3[] B;
    public final Set C;
    public final Yf3[] D;
    public final Cs3 E;
    public final Ds3 F;
    public final InterfaceC6576me3 G;
    public final Ks3 H;
    public final InterfaceC1834Os2 I;
    public final HandlerThread J;
    public final Looper K;
    public final Q42 L;
    public final H32 M;
    public final long N;
    public final Ma3 O;
    public final ArrayList P;
    public final InterfaceC1810Om2 Q;
    public final Le3 R;
    public final Bf3 S;
    public final long T;
    public C3777cg3 U;
    public Df3 V;
    public Yd3 W;
    public boolean X;
    public boolean Z;
    public boolean a0;
    public boolean c0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public C3210ae3 j0;
    public long k0;
    public int l0;
    public boolean m0;
    public Sa3 n0;
    public final Cb3 p0;
    public final Da3 q0;
    public int d0 = 0;
    public boolean e0 = false;
    public boolean Y = false;
    public long o0 = -9223372036854775807L;
    public long b0 = -9223372036854775807L;

    public C4046de3(Uf3[] uf3Arr, Cs3 cs3, Ds3 ds3, InterfaceC6576me3 interfaceC6576me3, Ks3 ks3, int i, boolean z, InterfaceC9661xg3 interfaceC9661xg3, C3777cg3 c3777cg3, Da3 da3, long j, boolean z2, Looper looper, InterfaceC1810Om2 interfaceC1810Om2, Cb3 cb3, C3519bk3 c3519bk3, Looper looper2) {
        this.p0 = cb3;
        this.B = uf3Arr;
        this.E = cs3;
        this.F = ds3;
        this.G = interfaceC6576me3;
        this.H = ks3;
        this.U = c3777cg3;
        this.q0 = da3;
        this.T = j;
        this.Q = interfaceC1810Om2;
        this.N = interfaceC6576me3.zza();
        interfaceC6576me3.zzf();
        Df3 df3I = Df3.i(ds3);
        this.V = df3I;
        this.W = new Yd3(df3I);
        int length = uf3Arr.length;
        this.D = new Yf3[2];
        Wf3 wf3A = cs3.a();
        for (int i2 = 0; i2 < 2; i2++) {
            uf3Arr[i2].q(i2, c3519bk3, interfaceC1810Om2);
            this.D[i2] = uf3Arr[i2].zzl();
            this.D[i2].a(wf3A);
        }
        this.O = new Ma3(this, interfaceC1810Om2);
        this.P = new ArrayList();
        this.C = Collections.newSetFromMap(new IdentityHashMap());
        this.L = new Q42();
        this.M = new H32();
        cs3.h(this, ks3);
        this.m0 = true;
        InterfaceC1834Os2 interfaceC1834Os2A = interfaceC1810Om2.a(looper, null);
        this.R = new Le3(interfaceC9661xg3, interfaceC1834Os2A);
        this.S = new Bf3(this, interfaceC9661xg3, interfaceC1834Os2A, c3519bk3);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.J = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.K = looper3;
        this.I = interfaceC1810Om2.a(looper3, this);
    }

    private final void B() {
        this.O.g();
        Uf3[] uf3Arr = this.B;
        int length = uf3Arr.length;
        for (int i = 0; i < 2; i++) {
            Uf3 uf3 = uf3Arr[i];
            if (J(uf3)) {
                Q(uf3);
            }
        }
    }

    public static boolean J(Uf3 uf3) {
        return uf3.g() != 0;
    }

    public static boolean L(Df3 df3, H32 h32) {
        Vp3 vp3 = df3.b;
        AbstractC8657u52 abstractC8657u52 = df3.a;
        return abstractC8657u52.o() || abstractC8657u52.n(vp3.a, h32).f;
    }

    public static C2485Ut1[] O(InterfaceC9442ws3 interfaceC9442ws3) {
        int iZzc = interfaceC9442ws3 != null ? interfaceC9442ws3.zzc() : 0;
        C2485Ut1[] c2485Ut1Arr = new C2485Ut1[iZzc];
        for (int i = 0; i < iZzc; i++) {
            c2485Ut1Arr[i] = interfaceC9442ws3.f(i);
        }
        return c2485Ut1Arr;
    }

    public static final void P(Lf3 lf3) {
        lf3.j();
        try {
            lf3.c().b(lf3.a(), lf3.g());
        } finally {
            lf3.h(true);
        }
    }

    public static final void Q(Uf3 uf3) {
        if (uf3.g() == 2) {
            uf3.k();
        }
    }

    public static final void R(Uf3 uf3, long j) {
        uf3.f();
    }

    public static Object V(Q42 q42, H32 h32, int i, boolean z, Object obj, AbstractC8657u52 abstractC8657u52, AbstractC8657u52 abstractC8657u522) {
        int iA = abstractC8657u52.a(obj);
        int iB = abstractC8657u52.b();
        int i2 = 0;
        int i3 = iA;
        int iA2 = -1;
        while (true) {
            if (i2 >= iB || iA2 != -1) {
                break;
            }
            Q42 q422 = q42;
            H32 h322 = h32;
            int i4 = i;
            boolean z2 = z;
            AbstractC8657u52 abstractC8657u523 = abstractC8657u52;
            i3 = abstractC8657u523.i(i3, h322, q422, i4, z2);
            if (i3 == -1) {
                iA2 = -1;
                break;
            }
            iA2 = abstractC8657u522.a(abstractC8657u523.f(i3));
            i2++;
            abstractC8657u52 = abstractC8657u523;
            h32 = h322;
            q42 = q422;
            i = i4;
            z = z2;
        }
        if (iA2 == -1) {
            return null;
        }
        return abstractC8657u522.f(iA2);
    }

    public static final /* synthetic */ void d0(Lf3 lf3) {
        try {
            P(lf3);
        } catch (Sa3 e) {
            AbstractC3305ay2.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    public static Pair k0(AbstractC8657u52 abstractC8657u52, C3210ae3 c3210ae3, boolean z, int i, boolean z2, Q42 q42, H32 h32) {
        Pair pairL;
        AbstractC8657u52 abstractC8657u522;
        AbstractC8657u52 abstractC8657u523 = c3210ae3.a;
        if (abstractC8657u52.o()) {
            return null;
        }
        boolean zO = abstractC8657u523.o();
        AbstractC8657u52 abstractC8657u524 = abstractC8657u523;
        if (true == zO) {
            abstractC8657u524 = abstractC8657u52;
        }
        try {
            pairL = abstractC8657u524.l(q42, h32, c3210ae3.b, c3210ae3.c);
            abstractC8657u522 = abstractC8657u524;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC8657u52.equals(abstractC8657u522)) {
            return pairL;
        }
        if (abstractC8657u52.a(pairL.first) != -1) {
            return (abstractC8657u522.n(pairL.first, h32).f && abstractC8657u522.e(h32.c, q42, 0L).n == abstractC8657u522.a(pairL.first)) ? abstractC8657u52.l(q42, h32, abstractC8657u52.n(pairL.first, h32).c, c3210ae3.c) : pairL;
        }
        Object objV = V(q42, h32, i, z2, pairL.first, abstractC8657u522, abstractC8657u52);
        if (objV != null) {
            return abstractC8657u52.l(q42, h32, abstractC8657u52.n(objV, h32).c, -9223372036854775807L);
        }
        return null;
    }

    private final void p() throws Sa3 {
        o();
        v(true);
    }

    private final void r() {
        Ce3 ce3G = this.R.g();
        boolean z = false;
        if (ce3G != null && ce3G.f.h && this.Y) {
            z = true;
        }
        this.Z = z;
    }

    public final void A(boolean z, boolean z2) {
        q(z || !this.f0, false, true, false);
        this.W.a(z2 ? 1 : 0);
        this.G.zzd();
        y(1);
    }

    public final void C() {
        Ce3 ce3F = this.R.f();
        boolean z = this.c0 || (ce3F != null && ce3F.a.zzp());
        Df3 df3 = this.V;
        if (z != df3.g) {
            this.V = new Df3(df3.a, df3.b, df3.c, df3.d, df3.e, df3.f, z, df3.h, df3.i, df3.j, df3.k, df3.l, df3.m, df3.n, df3.p, df3.q, df3.r, df3.s, df3.o);
        }
    }

    public final void D(Vp3 vp3, C6362lr3 c6362lr3, Ds3 ds3) {
        AbstractC8657u52 abstractC8657u52 = this.V.a;
        InterfaceC9442ws3[] interfaceC9442ws3Arr = ds3.c;
        this.G.a(abstractC8657u52, vp3, this.B, c6362lr3, interfaceC9442ws3Arr);
    }

    public final void E() {
        Ce3 ce3G = this.R.g();
        if (ce3G == null) {
            return;
        }
        long jZzd = ce3G.d ? ce3G.a.zzd() : -9223372036854775807L;
        if (jZzd != -9223372036854775807L) {
            if (!ce3G.r()) {
                this.R.p(ce3G);
                h(false);
                m();
            }
            s(jZzd);
            if (jZzd != this.V.r) {
                Df3 df3 = this.V;
                long j = jZzd;
                this.V = l0(df3.b, j, df3.c, j, true, 5);
            }
        } else {
            long jA = this.O.a(ce3G != this.R.h());
            this.k0 = jA;
            long jE = jA - ce3G.e();
            long j2 = this.V.r;
            if (!this.P.isEmpty() && !this.V.b.b()) {
                if (this.m0) {
                    this.m0 = false;
                }
                Df3 df32 = this.V;
                df32.a.a(df32.b.a);
                int iMin = Math.min(this.l0, this.P.size());
                if (iMin > 0) {
                    AbstractC6314li0.a(this.P.get(iMin - 1));
                }
                if (iMin < this.P.size()) {
                    AbstractC6314li0.a(this.P.get(iMin));
                }
                this.l0 = iMin;
            }
            Df3 df33 = this.V;
            df33.r = jE;
            df33.s = SystemClock.elapsedRealtime();
        }
        this.V.p = this.R.f().c();
        this.V.q = f0();
        Df3 df34 = this.V;
        if (df34.l && df34.e == 3 && N(df34.a, df34.b)) {
            Df3 df35 = this.V;
            if (df35.n.a == 1.0f) {
                float fA = this.q0.a(e0(df35.a, df35.b.a, df35.r), f0());
                if (this.O.zzc().a != fA) {
                    w(new C7375pW1(fA, this.V.n.b));
                    l(this.V.n, this.O.zzc().a, false, false);
                }
            }
        }
    }

    public final void F(AbstractC8657u52 abstractC8657u52, Vp3 vp3, AbstractC8657u52 abstractC8657u522, Vp3 vp32, long j, boolean z) {
        if (!N(abstractC8657u52, vp3)) {
            C7375pW1 c7375pW1 = vp3.b() ? C7375pW1.d : this.V.n;
            if (this.O.zzc().equals(c7375pW1)) {
                return;
            }
            w(c7375pW1);
            l(this.V.n, c7375pW1.a, false, false);
            return;
        }
        abstractC8657u52.e(abstractC8657u52.n(vp3.a, this.M).c, this.L, 0L);
        Da3 da3 = this.q0;
        C4222eG1 c4222eG1 = this.L.j;
        int i = AbstractC9004vJ2.a;
        da3.d(c4222eG1);
        if (j != -9223372036854775807L) {
            this.q0.e(e0(abstractC8657u52, vp3.a, j));
            return;
        }
        if (!AbstractC9004vJ2.e(!abstractC8657u522.o() ? abstractC8657u522.e(abstractC8657u522.n(vp32.a, this.M).c, this.L, 0L).a : null, this.L.a) || z) {
            this.q0.e(-9223372036854775807L);
        }
    }

    public final void G(boolean z, boolean z2) {
        this.a0 = z;
        this.b0 = z2 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    public final synchronized void H(CO2 co2, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Fd3) co2).B.X && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean I() {
        Ce3 ce3F = this.R.f();
        return (ce3F == null || ce3F.d() == Long.MIN_VALUE) ? false : true;
    }

    public final boolean K() {
        Ce3 ce3G = this.R.g();
        long j = ce3G.f.e;
        if (ce3G.d) {
            return j == -9223372036854775807L || this.V.r < j || !M();
        }
        return false;
    }

    public final boolean M() {
        Df3 df3 = this.V;
        return df3.l && df3.m == 0;
    }

    public final boolean N(AbstractC8657u52 abstractC8657u52, Vp3 vp3) {
        if (!vp3.b() && !abstractC8657u52.o()) {
            abstractC8657u52.e(abstractC8657u52.n(vp3.a, this.M).c, this.L, 0L);
            if (this.L.b()) {
                Q42 q42 = this.L;
                if (q42.h && q42.e != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Looper S() {
        return this.K;
    }

    public final /* synthetic */ Boolean U() {
        return Boolean.valueOf(this.X);
    }

    public final void X() {
        this.I.zzb(0).zza();
    }

    public final void Y(AbstractC8657u52 abstractC8657u52, int i, long j) {
        this.I.a(3, new C3210ae3(abstractC8657u52, i, j)).zza();
    }

    public final void Z(boolean z, int i) {
        this.I.h(1, z ? 1 : 0, i).zza();
    }

    @Override // com.daaw.Ja3
    public final void a(C7375pW1 c7375pW1) {
        this.I.a(16, c7375pW1).zza();
    }

    public final void a0() {
        this.I.zzb(6).zza();
    }

    @Override // com.daaw.Sp3
    public final void b(Tp3 tp3) {
        this.I.a(8, tp3).zza();
    }

    public final synchronized boolean b0() {
        if (!this.X && this.K.getThread().isAlive()) {
            this.I.n(7);
            H(new Fd3(this), this.T);
            return this.X;
        }
        return true;
    }

    @Override // com.daaw.Gf3
    public final synchronized void c(Lf3 lf3) {
        if (!this.X && this.K.getThread().isAlive()) {
            this.I.a(14, lf3).zza();
            return;
        }
        AbstractC3305ay2.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        lf3.h(false);
    }

    public final void c0(List list, int i, long j, C4957gr3 c4957gr3) {
        this.I.a(17, new Rd3(list, c4957gr3, i, j, null)).zza();
    }

    public final void d(Uf3 uf3) {
        if (J(uf3)) {
            this.O.b(uf3);
            Q(uf3);
            uf3.zzq();
            this.i0--;
        }
    }

    public final void e() throws Sa3 {
        int length = this.B.length;
        f(new boolean[2], this.R.h().f());
    }

    public final long e0(AbstractC8657u52 abstractC8657u52, Object obj, long j) {
        abstractC8657u52.e(abstractC8657u52.n(obj, this.M).c, this.L, 0L);
        Q42 q42 = this.L;
        if (q42.e != -9223372036854775807L && q42.b()) {
            Q42 q422 = this.L;
            if (q422.h) {
                long j2 = q422.f;
                return AbstractC9004vJ2.C((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.L.e) - j;
            }
        }
        return -9223372036854775807L;
    }

    public final void f(boolean[] zArr, long j) throws Sa3 {
        Ce3 ce3H = this.R.h();
        Ds3 ds3I = ce3H.i();
        int i = 0;
        while (true) {
            int length = this.B.length;
            if (i >= 2) {
                break;
            }
            if (!ds3I.b(i) && this.C.remove(this.B[i])) {
                this.B[i].j();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.B.length;
            if (i2 >= 2) {
                ce3H.g = true;
                return;
            }
            if (ds3I.b(i2)) {
                boolean z = zArr[i2];
                Uf3 uf3 = this.B[i2];
                if (!J(uf3)) {
                    Le3 le3 = this.R;
                    Ce3 ce3H2 = le3.h();
                    boolean z2 = ce3H2 == le3.g();
                    Ds3 ds3I2 = ce3H2.i();
                    C3220ag3 c3220ag3 = ds3I2.b[i2];
                    C2485Ut1[] c2485Ut1ArrO = O(ds3I2.c[i2]);
                    boolean z3 = M() && this.V.e == 3;
                    boolean z4 = !z && z3;
                    this.i0++;
                    this.C.add(uf3);
                    uf3.m(c3220ag3, c2485Ut1ArrO, ce3H2.c[i2], this.k0, z4, z2, j, ce3H2.e());
                    uf3.b(11, new Ld3(this));
                    this.O.c(uf3);
                    if (z3) {
                        uf3.c();
                    }
                }
            }
            i2++;
        }
    }

    public final long f0() {
        return g0(this.V.p);
    }

    public final void g(IOException iOException, int i) {
        Le3 le3 = this.R;
        Sa3 sa3C = Sa3.c(iOException, i);
        Ce3 ce3G = le3.g();
        if (ce3G != null) {
            sa3C = sa3C.a(ce3G.f.a);
        }
        AbstractC3305ay2.d("ExoPlayerImplInternal", "Playback error", sa3C);
        A(false, false);
        this.V = this.V.f(sa3C);
    }

    public final long g0(long j) {
        Ce3 ce3F = this.R.f();
        if (ce3F == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.k0 - ce3F.e()));
    }

    public final void h(boolean z) {
        Ce3 ce3F = this.R.f();
        Vp3 vp3 = ce3F == null ? this.V.b : ce3F.f.a;
        boolean zEquals = this.V.k.equals(vp3);
        if (!zEquals) {
            this.V = this.V.c(vp3);
        }
        Df3 df3 = this.V;
        df3.p = ce3F == null ? df3.r : ce3F.c();
        this.V.q = f0();
        if ((!zEquals || z) && ce3F != null && ce3F.d) {
            D(ce3F.f.a, ce3F.h(), ce3F.i());
        }
    }

    public final long h0(Vp3 vp3, long j, boolean z) {
        Le3 le3 = this.R;
        return i0(vp3, j, le3.g() != le3.h(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0663 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, UX2 -> 0x0030, QT1 -> 0x0033, nn3 -> 0x0036, Sa3 -> 0x0039, TryCatch #11 {RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:20:0x003c, B:21:0x0040, B:22:0x0044, B:26:0x004b, B:28:0x004f, B:30:0x0053, B:32:0x0059, B:33:0x005f, B:37:0x0066, B:39:0x006f, B:41:0x007d, B:42:0x0084, B:43:0x008e, B:44:0x00a1, B:45:0x00b9, B:46:0x00c3, B:47:0x00c4, B:49:0x00d3, B:50:0x00d7, B:51:0x00e8, B:53:0x00f7, B:54:0x0113, B:55:0x0126, B:56:0x012f, B:58:0x0141, B:59:0x014d, B:60:0x015d, B:62:0x0169, B:65:0x0174, B:66:0x017b, B:67:0x0188, B:71:0x018f, B:73:0x0197, B:75:0x019b, B:77:0x01a1, B:79:0x01a9, B:81:0x01b1, B:82:0x01b4, B:84:0x01b8, B:90:0x01c4, B:91:0x01c5, B:95:0x01cc, B:97:0x01da, B:98:0x01dd, B:99:0x01e2, B:101:0x01f2, B:102:0x01f5, B:103:0x01fa, B:104:0x01ff, B:106:0x020b, B:107:0x0217, B:109:0x0223, B:111:0x024f, B:112:0x026f, B:113:0x0274, B:114:0x0278, B:116:0x027d, B:117:0x028d, B:119:0x0299, B:120:0x029c, B:126:0x02a6, B:127:0x02a7, B:128:0x02ac, B:129:0x02b4, B:133:0x02ec, B:205:0x0420, B:184:0x03e5, B:183:0x03e1, B:212:0x0430, B:213:0x043a, B:141:0x033f, B:143:0x0356, B:226:0x0459, B:228:0x0473, B:232:0x0484, B:234:0x0493, B:236:0x049f, B:238:0x04ce, B:239:0x04d3, B:240:0x04d6, B:242:0x04da, B:244:0x04e7, B:316:0x063d, B:318:0x0645, B:320:0x064d, B:323:0x0652, B:324:0x065e, B:326:0x0663, B:328:0x066b, B:331:0x067b, B:333:0x0681, B:334:0x0699, B:336:0x06a1, B:338:0x06a6, B:340:0x06ab, B:342:0x06af, B:344:0x06b5, B:346:0x06b9, B:348:0x06c1, B:350:0x06c7, B:352:0x06d1, B:355:0x06d7, B:356:0x06da, B:358:0x06e2, B:360:0x06f4, B:362:0x06fd, B:364:0x0705, B:369:0x0711, B:370:0x0739, B:372:0x073e, B:374:0x0744, B:375:0x074b, B:377:0x0751, B:379:0x0755, B:383:0x0760, B:385:0x076a, B:386:0x076f, B:388:0x077d, B:389:0x0794, B:391:0x0799, B:393:0x07a1, B:395:0x07a8, B:399:0x07b1, B:404:0x07c0, B:410:0x07cd, B:412:0x07d3, B:421:0x07e5, B:422:0x07e8, B:424:0x07f4, B:426:0x07fa, B:430:0x0802, B:432:0x080a, B:434:0x080e, B:435:0x0818, B:437:0x081e, B:490:0x0909, B:493:0x0910, B:495:0x0915, B:497:0x091d, B:499:0x092b, B:500:0x0932, B:501:0x0937, B:503:0x093d, B:505:0x0946, B:507:0x094c, B:509:0x0952, B:516:0x0973, B:518:0x0979, B:522:0x0982, B:524:0x0986, B:529:0x098f, B:531:0x0995, B:534:0x09f1, B:536:0x09f5, B:545:0x0a07, B:547:0x0a0b, B:548:0x0a11, B:549:0x0a14, B:510:0x0959, B:513:0x0967, B:514:0x096e, B:515:0x096f, B:438:0x0826, B:440:0x082c, B:442:0x0830, B:469:0x08b1, B:471:0x08be, B:447:0x083c, B:449:0x0840, B:451:0x0854, B:453:0x085f, B:455:0x086b, B:459:0x0874, B:461:0x087e, B:467:0x0889, B:472:0x08c2, B:474:0x08c8, B:476:0x08cc, B:480:0x08d5, B:482:0x08e3, B:484:0x08eb, B:486:0x08f5, B:487:0x08fc, B:488:0x0901, B:489:0x0906, B:423:0x07ed, B:248:0x04f6, B:250:0x04fc, B:253:0x0507, B:256:0x0512, B:258:0x0517, B:261:0x0525, B:263:0x052b, B:264:0x0533, B:265:0x0536, B:267:0x053e, B:269:0x054c, B:271:0x0589, B:273:0x0593, B:275:0x059d, B:277:0x05a5, B:278:0x05a8, B:279:0x05ab, B:281:0x05b1, B:283:0x05bf, B:285:0x05c4, B:287:0x05ce, B:289:0x05d8, B:291:0x05e9, B:293:0x05ef, B:294:0x05fa, B:295:0x05fd, B:297:0x0603, B:300:0x0608, B:302:0x060d, B:304:0x0615, B:306:0x061b, B:308:0x0621, B:312:0x062f, B:314:0x0637, B:315:0x063a, B:243:0x04e4, B:550:0x0a19, B:554:0x0a20, B:555:0x0a28, B:559:0x0a46), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x073e A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, UX2 -> 0x0030, QT1 -> 0x0033, nn3 -> 0x0036, Sa3 -> 0x0039, TryCatch #11 {RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:20:0x003c, B:21:0x0040, B:22:0x0044, B:26:0x004b, B:28:0x004f, B:30:0x0053, B:32:0x0059, B:33:0x005f, B:37:0x0066, B:39:0x006f, B:41:0x007d, B:42:0x0084, B:43:0x008e, B:44:0x00a1, B:45:0x00b9, B:46:0x00c3, B:47:0x00c4, B:49:0x00d3, B:50:0x00d7, B:51:0x00e8, B:53:0x00f7, B:54:0x0113, B:55:0x0126, B:56:0x012f, B:58:0x0141, B:59:0x014d, B:60:0x015d, B:62:0x0169, B:65:0x0174, B:66:0x017b, B:67:0x0188, B:71:0x018f, B:73:0x0197, B:75:0x019b, B:77:0x01a1, B:79:0x01a9, B:81:0x01b1, B:82:0x01b4, B:84:0x01b8, B:90:0x01c4, B:91:0x01c5, B:95:0x01cc, B:97:0x01da, B:98:0x01dd, B:99:0x01e2, B:101:0x01f2, B:102:0x01f5, B:103:0x01fa, B:104:0x01ff, B:106:0x020b, B:107:0x0217, B:109:0x0223, B:111:0x024f, B:112:0x026f, B:113:0x0274, B:114:0x0278, B:116:0x027d, B:117:0x028d, B:119:0x0299, B:120:0x029c, B:126:0x02a6, B:127:0x02a7, B:128:0x02ac, B:129:0x02b4, B:133:0x02ec, B:205:0x0420, B:184:0x03e5, B:183:0x03e1, B:212:0x0430, B:213:0x043a, B:141:0x033f, B:143:0x0356, B:226:0x0459, B:228:0x0473, B:232:0x0484, B:234:0x0493, B:236:0x049f, B:238:0x04ce, B:239:0x04d3, B:240:0x04d6, B:242:0x04da, B:244:0x04e7, B:316:0x063d, B:318:0x0645, B:320:0x064d, B:323:0x0652, B:324:0x065e, B:326:0x0663, B:328:0x066b, B:331:0x067b, B:333:0x0681, B:334:0x0699, B:336:0x06a1, B:338:0x06a6, B:340:0x06ab, B:342:0x06af, B:344:0x06b5, B:346:0x06b9, B:348:0x06c1, B:350:0x06c7, B:352:0x06d1, B:355:0x06d7, B:356:0x06da, B:358:0x06e2, B:360:0x06f4, B:362:0x06fd, B:364:0x0705, B:369:0x0711, B:370:0x0739, B:372:0x073e, B:374:0x0744, B:375:0x074b, B:377:0x0751, B:379:0x0755, B:383:0x0760, B:385:0x076a, B:386:0x076f, B:388:0x077d, B:389:0x0794, B:391:0x0799, B:393:0x07a1, B:395:0x07a8, B:399:0x07b1, B:404:0x07c0, B:410:0x07cd, B:412:0x07d3, B:421:0x07e5, B:422:0x07e8, B:424:0x07f4, B:426:0x07fa, B:430:0x0802, B:432:0x080a, B:434:0x080e, B:435:0x0818, B:437:0x081e, B:490:0x0909, B:493:0x0910, B:495:0x0915, B:497:0x091d, B:499:0x092b, B:500:0x0932, B:501:0x0937, B:503:0x093d, B:505:0x0946, B:507:0x094c, B:509:0x0952, B:516:0x0973, B:518:0x0979, B:522:0x0982, B:524:0x0986, B:529:0x098f, B:531:0x0995, B:534:0x09f1, B:536:0x09f5, B:545:0x0a07, B:547:0x0a0b, B:548:0x0a11, B:549:0x0a14, B:510:0x0959, B:513:0x0967, B:514:0x096e, B:515:0x096f, B:438:0x0826, B:440:0x082c, B:442:0x0830, B:469:0x08b1, B:471:0x08be, B:447:0x083c, B:449:0x0840, B:451:0x0854, B:453:0x085f, B:455:0x086b, B:459:0x0874, B:461:0x087e, B:467:0x0889, B:472:0x08c2, B:474:0x08c8, B:476:0x08cc, B:480:0x08d5, B:482:0x08e3, B:484:0x08eb, B:486:0x08f5, B:487:0x08fc, B:488:0x0901, B:489:0x0906, B:423:0x07ed, B:248:0x04f6, B:250:0x04fc, B:253:0x0507, B:256:0x0512, B:258:0x0517, B:261:0x0525, B:263:0x052b, B:264:0x0533, B:265:0x0536, B:267:0x053e, B:269:0x054c, B:271:0x0589, B:273:0x0593, B:275:0x059d, B:277:0x05a5, B:278:0x05a8, B:279:0x05ab, B:281:0x05b1, B:283:0x05bf, B:285:0x05c4, B:287:0x05ce, B:289:0x05d8, B:291:0x05e9, B:293:0x05ef, B:294:0x05fa, B:295:0x05fd, B:297:0x0603, B:300:0x0608, B:302:0x060d, B:304:0x0615, B:306:0x061b, B:308:0x0621, B:312:0x062f, B:314:0x0637, B:315:0x063a, B:243:0x04e4, B:550:0x0a19, B:554:0x0a20, B:555:0x0a28, B:559:0x0a46), top: B:619:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:630:0x06a9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v73, types: [com.daaw.Ks3, com.daaw.d93] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:343:0x06b3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r50) {
        /*
            Method dump skipped, instruction units count: 2964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4046de3.handleMessage(android.os.Message):boolean");
    }

    @Override // com.daaw.InterfaceC4389er3
    public final /* bridge */ /* synthetic */ void i(InterfaceC4678fr3 interfaceC4678fr3) {
        this.I.a(9, (Tp3) interfaceC4678fr3).zza();
    }

    public final long i0(Vp3 vp3, long j, boolean z, boolean z2) throws Sa3 {
        B();
        G(false, true);
        if (z2 || this.V.e == 3) {
            y(2);
        }
        Ce3 ce3G = this.R.g();
        Ce3 ce3G2 = ce3G;
        while (ce3G2 != null && !vp3.equals(ce3G2.f.a)) {
            ce3G2 = ce3G2.g();
        }
        if (z || ce3G != ce3G2 || (ce3G2 != null && ce3G2.e() + j < 0)) {
            Uf3[] uf3Arr = this.B;
            int length = uf3Arr.length;
            for (int i = 0; i < 2; i++) {
                d(uf3Arr[i]);
            }
            if (ce3G2 != null) {
                while (this.R.g() != ce3G2) {
                    this.R.d();
                }
                this.R.p(ce3G2);
                ce3G2.p(1000000000000L);
                e();
            }
        }
        if (ce3G2 != null) {
            this.R.p(ce3G2);
            if (!ce3G2.d) {
                ce3G2.f = ce3G2.f.b(j);
            } else if (ce3G2.e) {
                j = ce3G2.a.e(j);
                ce3G2.a.h(j - this.N, false);
            }
            s(j);
            m();
        } else {
            this.R.l();
            s(j);
        }
        h(false);
        this.I.n(2);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0411  */
    /* JADX WARN: Type inference failed for: r12v10, types: [long] */
    /* JADX WARN: Type inference failed for: r12v14, types: [com.daaw.ae3] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.daaw.de3] */
    /* JADX WARN: Type inference failed for: r3v39, types: [long] */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59, types: [long] */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [long] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44, types: [long] */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [long] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(com.daaw.AbstractC8657u52 r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4046de3.j(com.daaw.u52, boolean):void");
    }

    public final Pair j0(AbstractC8657u52 abstractC8657u52) {
        long j = 0;
        if (abstractC8657u52.o()) {
            return Pair.create(Df3.j(), 0L);
        }
        Pair pairL = abstractC8657u52.l(this.L, this.M, abstractC8657u52.g(this.e0), -9223372036854775807L);
        Vp3 vp3K = this.R.k(abstractC8657u52, pairL.first, 0L);
        long jLongValue = ((Long) pairL.second).longValue();
        if (vp3K.b()) {
            abstractC8657u52.n(vp3K.a, this.M);
            if (vp3K.c == this.M.e(vp3K.b)) {
                this.M.j();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(vp3K, Long.valueOf(j));
    }

    public final void k(C7375pW1 c7375pW1, boolean z) {
        l(c7375pW1, c7375pW1.a, true, z);
    }

    public final void l(C7375pW1 c7375pW1, float f, boolean z, boolean z2) {
        C7375pW1 c7375pW12;
        int i;
        if (z) {
            if (z2) {
                this.W.a(1);
            }
            Df3 df3 = this.V;
            Df3 df32 = new Df3(df3.a, df3.b, df3.c, df3.d, df3.e, df3.f, df3.g, df3.h, df3.i, df3.j, df3.k, df3.l, df3.m, c7375pW1, df3.p, df3.q, df3.r, df3.s, df3.o);
            c7375pW12 = c7375pW1;
            this.V = df32;
        } else {
            c7375pW12 = c7375pW1;
        }
        float f2 = c7375pW12.a;
        Ce3 ce3G = this.R.g();
        while (true) {
            i = 0;
            if (ce3G == null) {
                break;
            }
            InterfaceC9442ws3[] interfaceC9442ws3Arr = ce3G.i().c;
            int length = interfaceC9442ws3Arr.length;
            while (i < length) {
                InterfaceC9442ws3 interfaceC9442ws3 = interfaceC9442ws3Arr[i];
                i++;
            }
            ce3G = ce3G.g();
        }
        Uf3[] uf3Arr = this.B;
        int length2 = uf3Arr.length;
        while (i < 2) {
            Uf3 uf3 = uf3Arr[i];
            if (uf3 != null) {
                uf3.e(f, c7375pW12.a);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.Df3 l0(com.daaw.Vp3 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4046de3.l0(com.daaw.Vp3, long, long, long, boolean, int):com.daaw.Df3");
    }

    public final void m() {
        long jE;
        long jE2;
        boolean zC = false;
        if (I()) {
            Ce3 ce3F = this.R.f();
            long jG0 = g0(ce3F.d());
            if (ce3F == this.R.g()) {
                jE = this.k0;
                jE2 = ce3F.e();
            } else {
                jE = this.k0 - ce3F.e();
                jE2 = ce3F.f.b;
            }
            long j = jE - jE2;
            boolean zC2 = this.G.c(j, jG0, this.O.zzc().a);
            if (zC2 || jG0 >= 500000 || this.N <= 0) {
                zC = zC2;
            } else {
                this.R.g().a.h(this.V.r, false);
                zC = this.G.c(j, jG0, this.O.zzc().a);
            }
        }
        this.c0 = zC;
        if (zC) {
            this.R.f().k(this.k0, this.O.zzc().a, this.b0);
        }
        C();
    }

    public final void n() {
        this.W.c(this.V);
        if (this.W.a) {
            Cb3 cb3 = this.p0;
            cb3.a.B(this.W);
            this.W = new Yd3(this.V);
        }
    }

    public final void o() throws Sa3 {
        int i;
        int i2;
        float f = this.O.zzc().a;
        Le3 le3 = this.R;
        Ce3 ce3H = le3.h();
        boolean z = true;
        for (Ce3 ce3G = le3.g(); ce3G != null && ce3G.d; ce3G = ce3G.g()) {
            Ds3 ds3J = ce3G.j(f, this.V.a);
            Ds3 ds3I = ce3G.i();
            boolean z2 = false;
            if (ds3I != null) {
                if (ds3I.c.length == ds3J.c.length) {
                    for (int i3 = 0; i3 < ds3J.c.length; i3++) {
                        if (ds3J.a(ds3I, i3)) {
                        }
                    }
                    if (ce3G != ce3H) {
                        z2 = true;
                    }
                    z &= z2;
                }
            }
            if (z) {
                Le3 le32 = this.R;
                Ce3 ce3G2 = le32.g();
                boolean zP = le32.p(ce3G2);
                int length = this.B.length;
                boolean[] zArr = new boolean[2];
                long jB = ce3G2.b(ds3J, this.V.r, zP, zArr);
                Df3 df3 = this.V;
                boolean z3 = (df3.e == 4 || jB == df3.r) ? false : true;
                Df3 df32 = this.V;
                i = 4;
                i2 = 2;
                this.V = l0(df32.b, jB, df32.c, df32.d, z3, 5);
                if (z3) {
                    s(jB);
                }
                int length2 = this.B.length;
                boolean[] zArr2 = new boolean[2];
                int i4 = 0;
                while (true) {
                    Uf3[] uf3Arr = this.B;
                    int length3 = uf3Arr.length;
                    if (i4 >= 2) {
                        break;
                    }
                    Uf3 uf3 = uf3Arr[i4];
                    boolean zJ = J(uf3);
                    zArr2[i4] = zJ;
                    InterfaceC4110dr3 interfaceC4110dr3 = ce3G2.c[i4];
                    if (zJ) {
                        if (interfaceC4110dr3 != uf3.zzo()) {
                            d(uf3);
                        } else if (zArr[i4]) {
                            uf3.l(this.k0);
                        }
                    }
                    i4++;
                }
                f(zArr2, this.k0);
            } else {
                i = 4;
                i2 = 2;
                this.R.p(ce3G);
                if (ce3G.d) {
                    ce3G.a(ds3J, Math.max(ce3G.f.b, this.k0 - ce3G.e()), false);
                }
            }
            h(true);
            if (this.V.e != i) {
                m();
                E();
                this.I.n(i2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[PHI: r2 r6 r8
  0x00a4: PHI (r2v2 com.daaw.Vp3) = (r2v1 com.daaw.Vp3), (r2v12 com.daaw.Vp3) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r6v3 long) = (r6v2 long), (r6v9 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r8v3 long) = (r8v2 long), (r8v7 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed A[PHI: r0
  0x00ed: PHI (r0v11 com.daaw.u52) = (r0v10 com.daaw.u52), (r0v10 com.daaw.u52), (r0v20 com.daaw.u52), (r0v20 com.daaw.u52) binds: [B:36:0x00b2, B:38:0x00b6, B:40:0x00c7, B:42:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4046de3.q(boolean, boolean, boolean, boolean):void");
    }

    public final void s(long j) {
        Ce3 ce3G = this.R.g();
        long jE = j + (ce3G == null ? 1000000000000L : ce3G.e());
        this.k0 = jE;
        this.O.e(jE);
        Uf3[] uf3Arr = this.B;
        int length = uf3Arr.length;
        for (int i = 0; i < 2; i++) {
            Uf3 uf3 = uf3Arr[i];
            if (J(uf3)) {
                uf3.l(this.k0);
            }
        }
        for (Ce3 ce3G2 = this.R.g(); ce3G2 != null; ce3G2 = ce3G2.g()) {
            for (InterfaceC9442ws3 interfaceC9442ws3 : ce3G2.i().c) {
            }
        }
    }

    public final void t(AbstractC8657u52 abstractC8657u52, AbstractC8657u52 abstractC8657u522) {
        if (abstractC8657u52.o() && abstractC8657u522.o()) {
            return;
        }
        int size = this.P.size() - 1;
        if (size < 0) {
            Collections.sort(this.P);
        } else {
            AbstractC6314li0.a(this.P.get(size));
            throw null;
        }
    }

    public final void u(long j, long j2) {
        this.I.c(2, j + j2);
    }

    public final void v(boolean z) throws Sa3 {
        Vp3 vp3 = this.R.g().f.a;
        long jI0 = i0(vp3, this.V.r, true, false);
        if (jI0 != this.V.r) {
            Df3 df3 = this.V;
            this.V = l0(vp3, jI0, df3.c, df3.d, z, 5);
        }
    }

    public final void w(C7375pW1 c7375pW1) {
        this.I.d(16);
        this.O.d(c7375pW1);
    }

    public final void x(boolean z, int i, boolean z2, int i2) {
        this.W.a(z2 ? 1 : 0);
        this.W.b(i2);
        this.V = this.V.e(z, i);
        G(false, false);
        for (Ce3 ce3G = this.R.g(); ce3G != null; ce3G = ce3G.g()) {
            for (InterfaceC9442ws3 interfaceC9442ws3 : ce3G.i().c) {
            }
        }
        if (!M()) {
            B();
            E();
            return;
        }
        int i3 = this.V.e;
        if (i3 == 3) {
            z();
            this.I.n(2);
        } else if (i3 == 2) {
            this.I.n(2);
        }
    }

    public final void y(int i) {
        Df3 df3 = this.V;
        if (df3.e != i) {
            if (i != 2) {
                this.o0 = -9223372036854775807L;
            }
            this.V = df3.g(i);
        }
    }

    public final void z() {
        G(false, false);
        this.O.f();
        Uf3[] uf3Arr = this.B;
        int length = uf3Arr.length;
        for (int i = 0; i < 2; i++) {
            Uf3 uf3 = uf3Arr[i];
            if (J(uf3)) {
                uf3.c();
            }
        }
    }

    @Override // com.daaw.InterfaceC9935yf3
    public final void zzh() {
        this.I.n(22);
    }

    @Override // com.daaw.Bs3
    public final void zzj() {
        this.I.n(10);
    }
}
