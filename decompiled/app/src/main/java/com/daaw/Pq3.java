package com.daaw;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzby;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Pq3 implements Tp3, InterfaceC1398Kn1, InterfaceC4120dt3, InterfaceC5523it3, InterfaceC3554br3 {
    public static final Map n0;
    public static final C2485Ut1 o0;
    public final Uri B;
    public final InterfaceC7659qX2 C;
    public final Pn3 D;
    public final C6636mq3 E;
    public final C8015rn3 F;
    public final Bq3 G;
    public final long H;
    public final C6372lt3 I = new C6372lt3("ProgressiveMediaPeriod");
    public final InterfaceC8867uq3 J;
    public final C5779jo2 K;
    public final Runnable L;
    public final Runnable M;
    public final Handler N;
    public final boolean O;
    public Sp3 P;
    public zzaeq Q;
    public C3832cr3[] R;
    public Dq3[] S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Eq3 W;
    public InterfaceC6903no1 X;
    public long Y;
    public boolean Z;
    public int a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public boolean e0;
    public long f0;
    public long g0;
    public boolean h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final C3842ct3 l0;
    public final Ls3 m0;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        n0 = DesugarCollections.unmodifiableMap(map);
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.j("icy");
        c1106Hs1.u("application/x-icy");
        o0 = c1106Hs1.D();
    }

    public Pq3(Uri uri, InterfaceC7659qX2 interfaceC7659qX2, InterfaceC8867uq3 interfaceC8867uq3, Pn3 pn3, C8015rn3 c8015rn3, C3842ct3 c3842ct3, C6636mq3 c6636mq3, Bq3 bq3, Ls3 ls3, String str, int i, long j) {
        this.B = uri;
        this.C = interfaceC7659qX2;
        this.D = pn3;
        this.F = c8015rn3;
        this.l0 = c3842ct3;
        this.E = c6636mq3;
        this.G = bq3;
        this.m0 = ls3;
        this.H = i;
        this.J = interfaceC8867uq3;
        this.Y = j;
        this.O = j != -9223372036854775807L;
        this.K = new C5779jo2(InterfaceC1810Om2.a);
        this.L = new Runnable() { // from class: com.daaw.wq3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.D();
            }
        };
        this.M = new Runnable() { // from class: com.daaw.xq3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.s();
            }
        };
        this.N = AbstractC9004vJ2.H(null);
        this.S = new Dq3[0];
        this.R = new C3832cr3[0];
        this.g0 = -9223372036854775807L;
        this.a0 = 1;
    }

    public static /* bridge */ /* synthetic */ long N(Pq3 pq3, boolean z) {
        return pq3.A(true);
    }

    public static /* bridge */ /* synthetic */ void r(final Pq3 pq3) {
        pq3.N.post(new Runnable() { // from class: com.daaw.vq3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.t();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.daaw.cr3[] r3 = r5.R
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.daaw.Eq3 r4 = r5.W
            r4.getClass()
            boolean[] r4 = r4.c
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.z()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Pq3.A(boolean):long");
    }

    public final InterfaceC8576to1 B(Dq3 dq3) {
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            if (dq3.equals(this.S[i])) {
                return this.R[i];
            }
        }
        C3832cr3 c3832cr3 = new C3832cr3(this.m0, this.D, this.F);
        c3832cr3.J(this);
        int i2 = length + 1;
        Dq3[] dq3Arr = (Dq3[]) Arrays.copyOf(this.S, i2);
        dq3Arr[length] = dq3;
        int i3 = AbstractC9004vJ2.a;
        this.S = dq3Arr;
        C3832cr3[] c3832cr3Arr = (C3832cr3[]) Arrays.copyOf(this.R, i2);
        c3832cr3Arr[length] = c3832cr3;
        this.R = c3832cr3Arr;
        return c3832cr3;
    }

    public final void C() {
        AbstractC6048km2.f(this.U);
        this.W.getClass();
        this.X.getClass();
    }

    public final void D() {
        int i;
        if (this.k0 || this.U || !this.T || this.X == null) {
            return;
        }
        for (C3832cr3 c3832cr3 : this.R) {
            if (c3832cr3.A() == null) {
                return;
            }
        }
        this.K.c();
        int length = this.R.length;
        A62[] a62Arr = new A62[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            C2485Ut1 c2485Ut1A = this.R[i2].A();
            c2485Ut1A.getClass();
            String str = c2485Ut1A.l;
            boolean zF = AbstractC5959kT1.f(str);
            boolean z = zF || AbstractC5959kT1.g(str);
            zArr[i2] = z;
            this.V = z | this.V;
            zzaeq zzaeqVar = this.Q;
            if (zzaeqVar != null) {
                if (zF || this.S[i2].b) {
                    zzby zzbyVar = c2485Ut1A.j;
                    zzby zzbyVar2 = zzbyVar == null ? new zzby(-9223372036854775807L, zzaeqVar) : zzbyVar.c(zzaeqVar);
                    C1106Hs1 c1106Hs1B = c2485Ut1A.b();
                    c1106Hs1B.o(zzbyVar2);
                    c2485Ut1A = c1106Hs1B.D();
                }
                if (zF && c2485Ut1A.f == -1 && c2485Ut1A.g == -1 && (i = zzaeqVar.B) != -1) {
                    C1106Hs1 c1106Hs1B2 = c2485Ut1A.b();
                    c1106Hs1B2.j0(i);
                    c2485Ut1A = c1106Hs1B2.D();
                }
            }
            a62Arr[i2] = new A62(Integer.toString(i2), c2485Ut1A.c(this.D.c(c2485Ut1A)));
        }
        this.W = new Eq3(new C6362lr3(a62Arr), zArr);
        this.U = true;
        Sp3 sp3 = this.P;
        sp3.getClass();
        sp3.b(this);
    }

    public final void E(int i) {
        C();
        Eq3 eq3 = this.W;
        boolean[] zArr = eq3.d;
        if (zArr[i]) {
            return;
        }
        C2485Ut1 c2485Ut1B = eq3.a.b(i).b(0);
        this.E.c(new Rp3(1, AbstractC5959kT1.b(c2485Ut1B.l), c2485Ut1B, 0, null, AbstractC9004vJ2.E(this.f0), -9223372036854775807L));
        zArr[i] = true;
    }

    public final void F(int i) {
        C();
        boolean[] zArr = this.W.b;
        if (this.h0 && zArr[i] && !this.R[i].M(false)) {
            this.g0 = 0L;
            this.h0 = false;
            this.c0 = true;
            this.f0 = 0L;
            this.i0 = 0;
            for (C3832cr3 c3832cr3 : this.R) {
                c3832cr3.H(false);
            }
            Sp3 sp3 = this.P;
            sp3.getClass();
            sp3.i(this);
        }
    }

    public final void G() {
        Aq3 aq3 = new Aq3(this, this.B, this.C, this.J, this, this.K);
        if (this.U) {
            AbstractC6048km2.f(H());
            long j = this.Y;
            if (j != -9223372036854775807L && this.g0 > j) {
                this.j0 = true;
                this.g0 = -9223372036854775807L;
                return;
            }
            InterfaceC6903no1 interfaceC6903no1 = this.X;
            interfaceC6903no1.getClass();
            Aq3.f(aq3, interfaceC6903no1.a(this.g0).a.b, this.g0);
            for (C3832cr3 c3832cr3 : this.R) {
                c3832cr3.I(this.g0);
            }
            this.g0 = -9223372036854775807L;
        }
        this.i0 = z();
        long jA = this.I.a(aq3, this, C3842ct3.a(this.a0));
        C5835k03 c5835k03 = aq3.k;
        this.E.g(new Mp3(aq3.a, c5835k03, c5835k03.a, Collections.EMPTY_MAP, jA, 0L, 0L), new Rp3(1, -1, null, 0, null, AbstractC9004vJ2.E(aq3.j), AbstractC9004vJ2.E(this.Y)));
    }

    public final boolean H() {
        return this.g0 != -9223372036854775807L;
    }

    public final boolean I() {
        return this.c0 || H();
    }

    public final int J(int i, C5730je3 c5730je3, H93 h93, int i2) {
        if (I()) {
            return -3;
        }
        E(i);
        int iY = this.R[i].y(c5730je3, h93, i2, this.j0);
        if (iY == -3) {
            F(i);
        }
        return iY;
    }

    public final int K(int i, long j) throws Throwable {
        if (I()) {
            return 0;
        }
        E(i);
        C3832cr3 c3832cr3 = this.R[i];
        int iW = c3832cr3.w(j, this.j0);
        c3832cr3.K(iW);
        if (iW != 0) {
            return iW;
        }
        F(i);
        return 0;
    }

    public final InterfaceC8576to1 Q() {
        return B(new Dq3(0, true));
    }

    @Override // com.daaw.InterfaceC1398Kn1
    public final void b() {
        this.T = true;
        this.N.post(this.L);
    }

    @Override // com.daaw.InterfaceC5523it3
    public final void c() {
        for (C3832cr3 c3832cr3 : this.R) {
            c3832cr3.G();
        }
        this.J.zze();
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean d(C9651xe3 c9651xe3) {
        if (this.j0) {
            return false;
        }
        C6372lt3 c6372lt3 = this.I;
        if (c6372lt3.k() || this.h0) {
            return false;
        }
        if (this.U && this.d0 == 0) {
            return false;
        }
        boolean zE = this.K.e();
        if (c6372lt3.l()) {
            return zE;
        }
        G();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    @Override // com.daaw.Tp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(long r7) {
        /*
            r6 = this;
            r6.C()
            com.daaw.Eq3 r0 = r6.W
            boolean[] r0 = r0.b
            com.daaw.no1 r1 = r6.X
            boolean r1 = r1.zzh()
            r2 = 1
            if (r2 == r1) goto L12
            r7 = 0
        L12:
            r1 = 0
            r6.c0 = r1
            r6.f0 = r7
            boolean r2 = r6.H()
            if (r2 == 0) goto L20
            r6.g0 = r7
            return r7
        L20:
            int r2 = r6.a0
            r3 = 7
            if (r2 == r3) goto L4e
            com.daaw.cr3[] r2 = r6.R
            int r2 = r2.length
            r3 = 0
        L29:
            if (r3 >= r2) goto L80
            com.daaw.cr3[] r4 = r6.R
            r4 = r4[r3]
            boolean r5 = r6.O
            if (r5 == 0) goto L3c
            int r5 = r4.u()
            boolean r4 = r4.N(r5)
            goto L40
        L3c:
            boolean r4 = r4.g(r7, r1)
        L40:
            if (r4 != 0) goto L4b
            boolean r4 = r0[r3]
            if (r4 != 0) goto L4e
            boolean r4 = r6.V
            if (r4 != 0) goto L4b
            goto L4e
        L4b:
            int r3 = r3 + 1
            goto L29
        L4e:
            r6.h0 = r1
            r6.g0 = r7
            r6.j0 = r1
            com.daaw.lt3 r0 = r6.I
            boolean r2 = r0.l()
            if (r2 == 0) goto L6f
            com.daaw.cr3[] r0 = r6.R
            int r2 = r0.length
        L5f:
            if (r1 >= r2) goto L69
            r3 = r0[r1]
            r3.C()
            int r1 = r1 + 1
            goto L5f
        L69:
            com.daaw.lt3 r0 = r6.I
            r0.g()
            return r7
        L6f:
            r0.h()
            com.daaw.cr3[] r0 = r6.R
            int r2 = r0.length
            r3 = 0
        L76:
            if (r3 >= r2) goto L80
            r4 = r0[r3]
            r4.H(r1)
            int r3 = r3 + 1
            goto L76
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Pq3.e(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[PHI: r12
  0x0042: PHI (r12v1 long) = (r12v0 long), (r12v5 long), (r12v0 long) binds: [B:14:0x0038, B:23:0x004b, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.daaw.Tp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(com.daaw.InterfaceC9442ws3[] r8, boolean[] r9, com.daaw.InterfaceC4110dr3[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Pq3.f(com.daaw.ws3[], boolean[], com.daaw.dr3[], boolean[], long):long");
    }

    @Override // com.daaw.Tp3
    public final void g(Sp3 sp3, long j) {
        this.P = sp3;
        this.K.e();
        G();
    }

    @Override // com.daaw.Tp3
    public final void h(long j, boolean z) {
        if (this.O) {
            return;
        }
        C();
        if (H()) {
            return;
        }
        boolean[] zArr = this.W.c;
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i].B(j, false, zArr[i]);
        }
    }

    @Override // com.daaw.InterfaceC4120dt3
    public final /* bridge */ /* synthetic */ C4688ft3 i(InterfaceC5246ht3 interfaceC5246ht3, long j, long j2, IOException iOException, int i) {
        long jMin;
        C4688ft3 c4688ft3B;
        InterfaceC6903no1 interfaceC6903no1;
        Aq3 aq3 = (Aq3) interfaceC5246ht3;
        Z83 z83 = aq3.c;
        Mp3 mp3 = new Mp3(aq3.a, aq3.k, z83.m(), z83.n(), j, j2, z83.l());
        long unused = aq3.j;
        int i2 = AbstractC9004vJ2.a;
        if ((iOException instanceof QT1) || (iOException instanceof FileNotFoundException) || (iOException instanceof C9791y73) || (iOException instanceof C6093kt3)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof UX2) && ((UX2) cause).B == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            c4688ft3B = C6372lt3.g;
        } else {
            int iZ = z();
            boolean z = iZ > this.i0;
            if (this.e0 || !((interfaceC6903no1 = this.X) == null || interfaceC6903no1.zza() == -9223372036854775807L)) {
                this.i0 = iZ;
            } else {
                boolean z2 = this.U;
                if (!z2 || I()) {
                    this.c0 = z2;
                    this.f0 = 0L;
                    this.i0 = 0;
                    for (C3832cr3 c3832cr3 : this.R) {
                        c3832cr3.H(false);
                    }
                    Aq3.f(aq3, 0L, 0L);
                } else {
                    this.h0 = true;
                    c4688ft3B = C6372lt3.f;
                }
            }
            c4688ft3B = C6372lt3.b(z, jMin);
        }
        boolean zC = c4688ft3B.c();
        this.E.f(mp3, new Rp3(1, -1, null, 0, null, AbstractC9004vJ2.E(aq3.j), AbstractC9004vJ2.E(this.Y)), iOException, true ^ zC);
        if (!zC) {
            long unused2 = aq3.a;
        }
        return c4688ft3B;
    }

    @Override // com.daaw.InterfaceC4120dt3
    public final /* bridge */ /* synthetic */ void j(InterfaceC5246ht3 interfaceC5246ht3, long j, long j2, boolean z) {
        Aq3 aq3 = (Aq3) interfaceC5246ht3;
        Z83 z83 = aq3.c;
        Mp3 mp3 = new Mp3(aq3.a, aq3.k, z83.m(), z83.n(), j, j2, z83.l());
        long unused = aq3.a;
        this.E.d(mp3, new Rp3(1, -1, null, 0, null, AbstractC9004vJ2.E(aq3.j), AbstractC9004vJ2.E(this.Y)));
        if (z) {
            return;
        }
        for (C3832cr3 c3832cr3 : this.R) {
            c3832cr3.H(false);
        }
        if (this.d0 > 0) {
            Sp3 sp3 = this.P;
            sp3.getClass();
            sp3.i(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[RETURN] */
    @Override // com.daaw.Tp3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(long r23, com.daaw.C3777cg3 r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r25
            r0.C()
            com.daaw.no1 r4 = r0.X
            boolean r4 = r4.zzh()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.daaw.no1 r4 = r0.X
            com.daaw.lo1 r4 = r4.a(r1)
            com.daaw.oo1 r7 = r4.a
            com.daaw.oo1 r4 = r4.b
            long r8 = r3.a
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2c
            long r8 = r3.b
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2b
            return r1
        L2b:
            r8 = r5
        L2c:
            long r10 = r7.a
            int r7 = com.daaw.AbstractC9004vJ2.a
            long r12 = r1 - r8
            long r8 = r8 ^ r1
            long r14 = r1 ^ r12
            r16 = r5
            long r5 = r3.b
            long r18 = r1 + r5
            long r20 = r1 ^ r18
            long r5 = r5 ^ r18
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 >= 0) goto L46
            r12 = -9223372036854775808
        L46:
            long r5 = r20 & r5
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L51
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L51:
            r3 = 1
            r5 = 0
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 > 0) goto L5d
            int r6 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r6 > 0) goto L5d
            r6 = 1
            goto L5e
        L5d:
            r6 = 0
        L5e:
            long r7 = r4.a
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 > 0) goto L69
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 > 0) goto L69
            goto L6a
        L69:
            r3 = 0
        L6a:
            if (r6 == 0) goto L7f
            if (r3 == 0) goto L7f
            long r3 = r10 - r1
            long r1 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = java.lang.Math.abs(r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L84
            goto L81
        L7f:
            if (r6 == 0) goto L82
        L81:
            return r10
        L82:
            if (r3 == 0) goto L85
        L84:
            return r7
        L85:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Pq3.k(long, com.daaw.cg3):long");
    }

    @Override // com.daaw.InterfaceC3554br3
    public final void l(C2485Ut1 c2485Ut1) {
        this.N.post(this.L);
    }

    @Override // com.daaw.InterfaceC4120dt3
    public final /* bridge */ /* synthetic */ void m(InterfaceC5246ht3 interfaceC5246ht3, long j, long j2) {
        InterfaceC6903no1 interfaceC6903no1;
        if (this.Y == -9223372036854775807L && (interfaceC6903no1 = this.X) != null) {
            boolean zZzh = interfaceC6903no1.zzh();
            long jA = A(true);
            long j3 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.Y = j3;
            this.G.b(j3, zZzh, this.Z);
        }
        Aq3 aq3 = (Aq3) interfaceC5246ht3;
        Z83 z83 = aq3.c;
        Mp3 mp3 = new Mp3(aq3.a, aq3.k, z83.m(), z83.n(), j, j2, z83.l());
        long unused = aq3.a;
        this.E.e(mp3, new Rp3(1, -1, null, 0, null, AbstractC9004vJ2.E(aq3.j), AbstractC9004vJ2.E(this.Y)));
        this.j0 = true;
        Sp3 sp3 = this.P;
        sp3.getClass();
        sp3.i(this);
    }

    @Override // com.daaw.InterfaceC1398Kn1
    public final InterfaceC8576to1 o(int i, int i2) {
        return B(new Dq3(i, false));
    }

    @Override // com.daaw.InterfaceC1398Kn1
    public final void p(final InterfaceC6903no1 interfaceC6903no1) {
        this.N.post(new Runnable() { // from class: com.daaw.yq3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.u(interfaceC6903no1);
            }
        });
    }

    public final /* synthetic */ void s() {
        if (this.k0) {
            return;
        }
        Sp3 sp3 = this.P;
        sp3.getClass();
        sp3.i(this);
    }

    public final /* synthetic */ void t() {
        this.e0 = true;
    }

    public final /* synthetic */ void u(InterfaceC6903no1 interfaceC6903no1) {
        this.X = this.Q == null ? interfaceC6903no1 : new C6624mo1(-9223372036854775807L, 0L);
        if (interfaceC6903no1.zza() == -9223372036854775807L && this.Y != -9223372036854775807L) {
            this.X = new C10269zq3(this, this.X);
        }
        this.Y = this.X.zza();
        boolean z = false;
        if (!this.e0 && interfaceC6903no1.zza() == -9223372036854775807L) {
            z = true;
        }
        this.Z = z;
        this.a0 = true == z ? 7 : 1;
        this.G.b(this.Y, interfaceC6903no1.zzh(), this.Z);
        if (this.U) {
            return;
        }
        D();
    }

    public final void v() throws IOException {
        this.I.i(C3842ct3.a(this.a0));
    }

    public final void w(int i) {
        this.R[i].E();
        v();
    }

    public final void x() {
        if (this.U) {
            for (C3832cr3 c3832cr3 : this.R) {
                c3832cr3.F();
            }
        }
        this.I.j(this);
        this.N.removeCallbacksAndMessages(null);
        this.P = null;
        this.k0 = true;
    }

    public final boolean y(int i) {
        return !I() && this.R[i].M(this.j0);
    }

    public final int z() {
        int iX = 0;
        for (C3832cr3 c3832cr3 : this.R) {
            iX += c3832cr3.x();
        }
        return iX;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzb() {
        long jA;
        C();
        if (this.j0 || this.d0 == 0) {
            return Long.MIN_VALUE;
        }
        if (H()) {
            return this.g0;
        }
        if (this.V) {
            int length = this.R.length;
            jA = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                Eq3 eq3 = this.W;
                if (eq3.b[i] && eq3.c[i] && !this.R[i].L()) {
                    jA = Math.min(jA, this.R[i].z());
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = A(false);
        }
        return jA == Long.MIN_VALUE ? this.f0 : jA;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzc() {
        return zzb();
    }

    @Override // com.daaw.Tp3
    public final long zzd() {
        if (!this.c0) {
            return -9223372036854775807L;
        }
        if (!this.j0 && z() <= this.i0) {
            return -9223372036854775807L;
        }
        this.c0 = false;
        return this.f0;
    }

    @Override // com.daaw.Tp3
    public final C6362lr3 zzh() {
        C();
        return this.W.a;
    }

    @Override // com.daaw.Tp3
    public final void zzk() throws IOException {
        v();
        if (this.j0 && !this.U) {
            throw QT1.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean zzp() {
        return this.I.l() && this.K.d();
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final void a(long j) {
    }
}
