package com.daaw;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class So3 extends AbstractC7950ra3 {
    public static final byte[] A0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public C2485Ut1 A;
    public C2485Ut1 B;
    public MediaCrypto C;
    public boolean D;
    public long E;
    public float F;
    public float G;
    public InterfaceC9980yo3 H;
    public C2485Ut1 I;
    public MediaFormat J;
    public boolean K;
    public float L;
    public ArrayDeque M;
    public Qo3 N;
    public Fo3 O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public long Z;
    public int a0;
    public int b0;
    public ByteBuffer c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public long p0;
    public final InterfaceC9701xo3 q;
    public long q0;
    public final Uo3 r;
    public boolean r0;
    public final float s;
    public boolean s0;
    public final H93 t;
    public boolean t0;
    public final H93 u;
    public C8787ua3 u0;
    public final H93 v;
    public Ro3 v0;
    public final C8857uo3 w;
    public long w0;
    public final MediaCodec.BufferInfo x;
    public boolean x0;
    public final ArrayDeque y;
    public Rn3 y0;
    public final C3812cn3 z;
    public Rn3 z0;

    public So3(int i, InterfaceC9701xo3 interfaceC9701xo3, Uo3 uo3, boolean z, float f) {
        super(i);
        this.q = interfaceC9701xo3;
        uo3.getClass();
        this.r = uo3;
        this.s = f;
        this.t = new H93(0, 0);
        this.u = new H93(0, 0);
        this.v = new H93(2, 0);
        C8857uo3 c8857uo3 = new C8857uo3();
        this.w = c8857uo3;
        this.x = new MediaCodec.BufferInfo();
        this.F = 1.0f;
        this.G = 1.0f;
        this.E = -9223372036854775807L;
        this.y = new ArrayDeque();
        a0(Ro3.e);
        c8857uo3.i(0);
        c8857uo3.d.order(ByteOrder.nativeOrder());
        this.z = new C3812cn3();
        this.L = -1.0f;
        this.P = 0;
        this.j0 = 0;
        this.a0 = -1;
        this.b0 = -1;
        this.Z = -9223372036854775807L;
        this.p0 = -9223372036854775807L;
        this.q0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        this.k0 = 0;
        this.l0 = 0;
    }

    public static boolean V(C2485Ut1 c2485Ut1) {
        return c2485Ut1.G == 0;
    }

    private final void Y() {
        this.a0 = -1;
        this.u.d = null;
    }

    private final void r0() {
        try {
            this.H.zzi();
        } finally {
            H0();
        }
    }

    public C10259zo3 A0(Throwable th, Fo3 fo3) {
        return new C10259zo3(th, fo3);
    }

    public final Fo3 B0() {
        return this.O;
    }

    public final void C0() throws Sa3 {
        C2485Ut1 c2485Ut1;
        if (this.H != null || this.f0 || (c2485Ut1 = this.A) == null) {
            return;
        }
        if (T(c2485Ut1)) {
            C2485Ut1 c2485Ut12 = this.A;
            i0();
            String str = c2485Ut12.l;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.w.o(32);
            } else {
                this.w.o(1);
            }
            this.f0 = true;
            return;
        }
        Rn3 rn3 = this.z0;
        this.y0 = rn3;
        C2485Ut1 c2485Ut13 = this.A;
        String str2 = c2485Ut13.l;
        if (rn3 != null) {
            boolean z = Tn3.a;
        }
        try {
            if (this.M == null) {
                try {
                    List listL0 = l0(this.r, c2485Ut13, false);
                    listL0.isEmpty();
                    this.M = new ArrayDeque();
                    if (!listL0.isEmpty()) {
                        this.M.add((Fo3) listL0.get(0));
                    }
                    this.N = null;
                } catch (C3544bp3 e) {
                    throw new Qo3(this.A, (Throwable) e, false, -49998);
                }
            }
            if (this.M.isEmpty()) {
                throw new Qo3(this.A, (Throwable) null, false, -49999);
            }
            Fo3 fo3 = (Fo3) this.M.peekFirst();
            while (this.H == null) {
                Fo3 fo32 = (Fo3) this.M.peekFirst();
                if (!U(fo32)) {
                    return;
                }
                try {
                    W(fo32, null);
                } catch (Exception e2) {
                    if (fo32 != fo3) {
                        throw e2;
                    }
                    try {
                        AbstractC3305ay2.f("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        W(fo32, null);
                    } catch (Exception e3) {
                        AbstractC3305ay2.g("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(fo32)), e3);
                        this.M.removeFirst();
                        Qo3 qo3 = new Qo3(this.A, (Throwable) e3, false, fo32);
                        n0(qo3);
                        Qo3 qo32 = this.N;
                        if (qo32 == null) {
                            this.N = qo3;
                        } else {
                            this.N = Qo3.a(qo32, qo3);
                        }
                        if (this.M.isEmpty()) {
                            throw this.N;
                        }
                    }
                }
            }
            this.M = null;
        } catch (Qo3 e4) {
            throw D(e4, this.A, false, 4001);
        }
    }

    public void D0(long j) {
        this.w0 = j;
        while (!this.y.isEmpty() && j >= ((Ro3) this.y.peek()).a) {
            a0((Ro3) this.y.poll());
            s0();
        }
    }

    public final void G0() {
        try {
            InterfaceC9980yo3 interfaceC9980yo3 = this.H;
            if (interfaceC9980yo3 != null) {
                interfaceC9980yo3.zzl();
                this.u0.b++;
                p0(this.O.a);
            }
        } finally {
            this.H = null;
            this.C = null;
            this.y0 = null;
            P();
        }
    }

    @Override // com.daaw.AbstractC7950ra3
    public void H() {
        this.A = null;
        a0(Ro3.e);
        this.y.clear();
        R();
    }

    public void H0() {
        Y();
        Z();
        this.Z = -9223372036854775807L;
        this.n0 = false;
        this.m0 = false;
        this.W = false;
        this.X = false;
        this.d0 = false;
        this.e0 = false;
        this.p0 = -9223372036854775807L;
        this.q0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        this.k0 = 0;
        this.l0 = 0;
        this.j0 = this.i0 ? 1 : 0;
    }

    @Override // com.daaw.AbstractC7950ra3
    public void I(boolean z, boolean z2) {
        this.u0 = new C8787ua3();
    }

    @Override // com.daaw.AbstractC7950ra3
    public void J(long j, boolean z) {
        this.r0 = false;
        this.s0 = false;
        if (this.f0) {
            this.w.b();
            this.v.b();
            this.g0 = false;
            this.z.b();
        } else {
            Q();
        }
        GH2 gh2 = this.v0.d;
        if (gh2.a() > 0) {
            this.t0 = true;
        }
        gh2.e();
        this.y.clear();
    }

    public abstract float L(float f, C2485Ut1 c2485Ut1, C2485Ut1[] c2485Ut1Arr);

    public abstract int M(Uo3 uo3, C2485Ut1 c2485Ut1);

    public abstract C9631xa3 N(Fo3 fo3, C2485Ut1 c2485Ut1, C2485Ut1 c2485Ut12);

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.C9631xa3 O(com.daaw.C5730je3 r12) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.So3.O(com.daaw.je3):com.daaw.xa3");
    }

    public final void P() {
        H0();
        this.M = null;
        this.O = null;
        this.I = null;
        this.J = null;
        this.K = false;
        this.o0 = false;
        this.L = -1.0f;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.Y = false;
        this.i0 = false;
        this.j0 = 0;
        this.D = false;
    }

    public final boolean Q() throws Sa3 {
        boolean zR = R();
        if (zR) {
            C0();
        }
        return zR;
    }

    public final boolean R() {
        if (this.H == null) {
            return false;
        }
        int i = this.l0;
        if (i == 3 || this.R || ((this.S && !this.o0) || (this.T && this.n0))) {
            G0();
            return true;
        }
        if (i == 2) {
            int i2 = AbstractC9004vJ2.a;
            AbstractC6048km2.f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    b0();
                } catch (Sa3 e) {
                    AbstractC3305ay2.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    G0();
                    return true;
                }
            }
        }
        r0();
        return false;
    }

    public final boolean S() {
        return this.f0;
    }

    public final boolean T(C2485Ut1 c2485Ut1) {
        return this.z0 == null && v0(c2485Ut1);
    }

    public boolean U(Fo3 fo3) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(com.daaw.Fo3 r22, android.media.MediaCrypto r23) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.So3.W(com.daaw.Fo3, android.media.MediaCrypto):void");
    }

    public final void X() throws Sa3 {
        int i = this.l0;
        if (i == 1) {
            r0();
            return;
        }
        if (i == 2) {
            r0();
            b0();
        } else if (i != 3) {
            this.s0 = true;
            t0();
        } else {
            G0();
            C0();
        }
    }

    public final void Z() {
        this.b0 = -1;
        this.c0 = null;
    }

    public final void a0(Ro3 ro3) {
        this.v0 = ro3;
        if (ro3.c != -9223372036854775807L) {
            this.x0 = true;
        }
    }

    public final void b0() {
        this.y0 = this.z0;
        this.k0 = 0;
        this.l0 = 0;
    }

    public final boolean c0() {
        if (this.m0) {
            this.k0 = 1;
            if (this.R || this.T) {
                this.l0 = 3;
                return false;
            }
            this.l0 = 2;
        } else {
            b0();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public final boolean d0() throws Sa3 {
        InterfaceC9980yo3 interfaceC9980yo3 = this.H;
        boolean z = 0;
        if (interfaceC9980yo3 == null || this.k0 == 2 || this.r0) {
            return false;
        }
        if (this.a0 < 0) {
            int iZza = interfaceC9980yo3.zza();
            this.a0 = iZza;
            if (iZza < 0) {
                return false;
            }
            this.u.d = this.H.d(iZza);
            this.u.b();
        }
        if (this.k0 == 1) {
            if (!this.Y) {
                this.n0 = true;
                this.H.c(this.a0, 0, 0, 0L, 4);
                Y();
            }
            this.k0 = 2;
            return false;
        }
        if (this.W) {
            this.W = false;
            this.u.d.put(A0);
            this.H.c(this.a0, 0, 38, 0L, 0);
            Y();
            this.m0 = true;
            return true;
        }
        if (this.j0 == 1) {
            for (int i = 0; i < this.I.n.size(); i++) {
                this.u.d.put((byte[]) this.I.n.get(i));
            }
            this.j0 = 2;
        }
        int iPosition = this.u.d.position();
        C5730je3 c5730je3E = E();
        try {
            int iZ = z(c5730je3E, this.u, 0);
            if (iZ == -3) {
                if (zzN()) {
                    this.q0 = this.p0;
                }
                return false;
            }
            if (iZ == -5) {
                if (this.j0 == 2) {
                    this.u.b();
                    this.j0 = 1;
                }
                O(c5730je3E);
                return true;
            }
            H93 h93 = this.u;
            if (h93.f()) {
                this.q0 = this.p0;
                if (this.j0 == 2) {
                    h93.b();
                    this.j0 = 1;
                }
                this.r0 = true;
                if (!this.m0) {
                    X();
                    return false;
                }
                try {
                    if (!this.Y) {
                        this.n0 = true;
                        this.H.c(this.a0, 0, 0, 0L, 4);
                        Y();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw D(e, this.A, false, AbstractC9004vJ2.u(e.getErrorCode()));
                }
            }
            if (!this.m0 && !h93.g()) {
                h93.b();
                if (this.j0 == 2) {
                    this.j0 = 1;
                }
                return true;
            }
            boolean zK = h93.k();
            if (zK) {
                h93.c.b(iPosition);
            }
            if (this.Q && !zK) {
                ByteBuffer byteBuffer = this.u.d;
                byte[] bArr = AbstractC4556fR2.a;
                int iPosition2 = byteBuffer.position();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + 1;
                    if (i4 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i5 = byteBuffer.get(i2) & 255;
                    if (i3 == 3) {
                        if (i5 == 1) {
                            if ((byteBuffer.get(i4) & 31) == 7) {
                                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                                byteBufferDuplicate.position(i2 - 3);
                                byteBufferDuplicate.limit(iPosition2);
                                byteBuffer.position(0);
                                byteBuffer.put(byteBufferDuplicate);
                                break;
                            }
                            i5 = 1;
                        }
                    } else if (i5 == 0) {
                        i3++;
                    }
                    if (i5 != 0) {
                        i3 = 0;
                    }
                    i2 = i4;
                }
                if (this.u.d.position() == 0) {
                    return true;
                }
                this.Q = false;
            }
            long j = this.u.f;
            if (this.t0) {
                if (this.y.isEmpty()) {
                    this.v0.d.d(j, this.A);
                } else {
                    ((Ro3) this.y.peekLast()).d.d(j, this.A);
                }
                this.t0 = false;
            }
            long jMax = Math.max(this.p0, j);
            this.p0 = jMax;
            if (zzN() || this.u.h()) {
                this.q0 = jMax;
            }
            this.u.j();
            H93 h932 = this.u;
            if (h932.e()) {
                m0(h932);
            }
            E0(this.u);
            try {
                if (zK) {
                    this.H.e(this.a0, 0, this.u.c, j, 0);
                } else {
                    this.H.c(this.a0, 0, this.u.d.limit(), j, 0);
                }
                Y();
                this.m0 = true;
                this.j0 = 0;
                C8787ua3 c8787ua3 = this.u0;
                z = c8787ua3.c + 1;
                c8787ua3.c = z;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw D(e2, this.A, z, AbstractC9004vJ2.u(e2.getErrorCode()));
            }
        } catch (E93 e3) {
            n0(e3);
            f0(0);
            r0();
            return true;
        }
    }

    @Override // com.daaw.Uf3
    public void e(float f, float f2) throws Sa3 {
        this.F = f;
        this.G = f2;
        h0(this.I);
    }

    public final boolean e0() {
        return this.b0 >= 0;
    }

    public final boolean f0(int i) throws Sa3 {
        H93 h93 = this.t;
        C5730je3 c5730je3E = E();
        h93.b();
        int iZ = z(c5730je3E, this.t, i | 4);
        if (iZ == -5) {
            O(c5730je3E);
            return true;
        }
        if (iZ != -4 || !this.t.f()) {
            return false;
        }
        this.r0 = true;
        X();
        return false;
    }

    public final boolean g0(long j) {
        if (this.E == -9223372036854775807L) {
            return true;
        }
        C();
        return SystemClock.elapsedRealtime() - j < this.E;
    }

    public final boolean h0(C2485Ut1 c2485Ut1) throws Sa3 {
        if (AbstractC9004vJ2.a >= 23 && this.H != null && this.l0 != 3 && g() != 0) {
            float fL = L(this.G, c2485Ut1, x());
            float f = this.L;
            if (f == fL) {
                return true;
            }
            if (fL == -1.0f) {
                j0();
                return false;
            }
            if (f == -1.0f && fL <= this.s) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fL);
            this.H.q(bundle);
            this.L = fL;
        }
        return true;
    }

    @Override // com.daaw.Uf3
    public boolean i() {
        return this.s0;
    }

    public final void i0() {
        this.h0 = false;
        this.w.b();
        this.v.b();
        this.g0 = false;
        this.f0 = false;
        this.z.b();
    }

    public final void j0() throws Sa3 {
        if (this.m0) {
            this.k0 = 1;
            this.l0 = 3;
        } else {
            G0();
            C0();
        }
    }

    public abstract C9422wo3 k0(Fo3 fo3, C2485Ut1 c2485Ut1, MediaCrypto mediaCrypto, float f);

    public abstract List l0(Uo3 uo3, C2485Ut1 c2485Ut1, boolean z);

    public abstract void m0(H93 h93);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02eb A[Catch: IllegalStateException -> 0x0347, TRY_LEAVE, TryCatch #11 {IllegalStateException -> 0x0347, blocks: (B:110:0x01af, B:111:0x01bd, B:187:0x02e7, B:189:0x02eb), top: B:290:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0337 A[Catch: IllegalStateException -> 0x033d, TryCatch #6 {IllegalStateException -> 0x033d, blocks: (B:231:0x0380, B:235:0x038d, B:237:0x0393, B:239:0x0399, B:227:0x0368, B:229:0x037a, B:216:0x0330, B:218:0x0337, B:225:0x034b, B:240:0x039e), top: B:281:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0368 A[Catch: IllegalStateException -> 0x033d, TryCatch #6 {IllegalStateException -> 0x033d, blocks: (B:231:0x0380, B:235:0x038d, B:237:0x0393, B:239:0x0399, B:227:0x0368, B:229:0x037a, B:216:0x0330, B:218:0x0337, B:225:0x034b, B:240:0x039e), top: B:281:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0387 A[LOOP:2: B:111:0x01bd->B:234:0x0387, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0393 A[Catch: IllegalStateException -> 0x033d, TryCatch #6 {IllegalStateException -> 0x033d, blocks: (B:231:0x0380, B:235:0x038d, B:237:0x0393, B:239:0x0399, B:227:0x0368, B:229:0x037a, B:216:0x0330, B:218:0x0337, B:225:0x034b, B:240:0x039e), top: B:281:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x033a A[EDGE_INSN: B:321:0x033a->B:219:0x033a BREAK  A[LOOP:2: B:111:0x01bd->B:234:0x0387], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // com.daaw.Uf3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(long r21, long r23) throws com.daaw.Sa3 {
        /*
            Method dump skipped, instruction units count: 1023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.So3.n(long, long):void");
    }

    public abstract void n0(Exception exc);

    public abstract void o0(String str, C9422wo3 c9422wo3, long j, long j2);

    @Override // com.daaw.Yf3
    public final int p(C2485Ut1 c2485Ut1) throws Sa3 {
        try {
            return M(this.r, c2485Ut1);
        } catch (C3544bp3 e) {
            throw D(e, c2485Ut1, false, 4002);
        }
    }

    public abstract void p0(String str);

    public abstract void q0(C2485Ut1 c2485Ut1, MediaFormat mediaFormat);

    @Override // com.daaw.AbstractC7950ra3
    public void r() {
        try {
            i0();
            G0();
        } finally {
            this.z0 = null;
        }
    }

    public abstract void s0();

    @Override // com.daaw.Uf3
    public boolean u() {
        if (this.A == null) {
            return false;
        }
        if (w() || e0()) {
            return true;
        }
        if (this.Z == -9223372036854775807L) {
            return false;
        }
        C();
        return SystemClock.elapsedRealtime() < this.Z;
    }

    public abstract boolean u0(long j, long j2, InterfaceC9980yo3 interfaceC9980yo3, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2485Ut1 c2485Ut1);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.daaw.AbstractC7950ra3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(com.daaw.C2485Ut1[] r13, long r14, long r16) {
        /*
            r12 = this;
            com.daaw.Ro3 r13 = r12.v0
            long r0 = r13.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            com.daaw.Ro3 r4 = new com.daaw.Ro3
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.a0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.y
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.p0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.w0
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            com.daaw.Ro3 r5 = new com.daaw.Ro3
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.a0(r5)
            com.daaw.Ro3 r13 = r12.v0
            long r0 = r13.c
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.s0()
        L51:
            return
        L52:
            java.util.ArrayDeque r13 = r12.y
            com.daaw.Ro3 r5 = new com.daaw.Ro3
            long r6 = r12.p0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.So3.v(com.daaw.Ut1[], long, long):void");
    }

    public boolean v0(C2485Ut1 c2485Ut1) {
        return false;
    }

    public final float w0() {
        return this.F;
    }

    public final long x0() {
        return this.v0.c;
    }

    public final long y0() {
        return this.v0.b;
    }

    public final InterfaceC9980yo3 z0() {
        return this.H;
    }

    @Override // com.daaw.Yf3
    public final int zze() {
        return 8;
    }

    public void t0() {
    }

    public void E0(H93 h93) {
    }

    public void F0(C2485Ut1 c2485Ut1) {
    }
}
