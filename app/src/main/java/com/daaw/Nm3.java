package com.daaw;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class Nm3 implements InterfaceC6332ll3 {
    public static final Object X = new Object();
    public static ExecutorService Y;
    public static int Z;
    public long A;
    public int B;
    public boolean C;
    public boolean D;
    public long E;
    public float F;
    public ByteBuffer G;
    public int H;
    public ByteBuffer I;
    public byte[] J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public Te3 Q;
    public Ol3 R;
    public long S;
    public boolean T;
    public boolean U;
    public final C4653fm3 V;
    public final Dl3 W;
    public final C9128vl3 a;
    public final C5494in3 b;
    public final OP2 c;
    public final OP2 d;
    public final C5779jo2 e;
    public final C8563tl3 f;
    public final ArrayDeque g;
    public Im3 h;
    public final C9412wm3 i;
    public final C9412wm3 j;
    public final Ql3 k;
    public C3519bk3 l;
    public InterfaceC4648fl3 m;
    public C4086dm3 n;
    public C4086dm3 o;
    public C9660xg2 p;
    public AudioTrack q;
    public C4922gk3 r;
    public C7965rd3 s;
    public C8847um3 t;
    public C8847um3 u;
    public C7375pW1 v;
    public boolean w;
    public long x;
    public long y;
    public long z;

    public /* synthetic */ Nm3(Sl3 sl3, Km3 km3) {
        this.r = sl3.a;
        this.V = sl3.d;
        int i = AbstractC9004vJ2.a;
        this.k = sl3.c;
        Dl3 dl3 = sl3.e;
        dl3.getClass();
        this.W = dl3;
        C5779jo2 c5779jo2 = new C5779jo2(InterfaceC1810Om2.a);
        this.e = c5779jo2;
        c5779jo2.e();
        this.f = new C8563tl3(new Am3(this, null));
        C9128vl3 c9128vl3 = new C9128vl3();
        this.a = c9128vl3;
        C5494in3 c5494in3 = new C5494in3();
        this.b = c5494in3;
        this.c = OP2.M(new C0338Ak2(), c9128vl3, c5494in3);
        this.d = OP2.K(new C4937gn3());
        this.F = 1.0f;
        this.s = C7965rd3.c;
        this.P = 0;
        this.Q = new Te3(0, 0.0f);
        C7375pW1 c7375pW1 = C7375pW1.d;
        this.u = new C8847um3(c7375pW1, 0L, 0L, null);
        this.v = c7375pW1;
        this.w = false;
        this.g = new ArrayDeque();
        this.i = new C9412wm3(100L);
        this.j = new C9412wm3(100L);
    }

    public static boolean L(AudioTrack audioTrack) {
        return AbstractC9004vJ2.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static /* synthetic */ void x(AudioTrack audioTrack, C5779jo2 c5779jo2) {
        try {
            audioTrack.flush();
            audioTrack.release();
            c5779jo2.e();
            synchronized (X) {
                try {
                    int i = Z - 1;
                    Z = i;
                    if (i == 0) {
                        Y.shutdown();
                        Y = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            c5779jo2.e();
            synchronized (X) {
                try {
                    int i2 = Z - 1;
                    Z = i2;
                    if (i2 == 0) {
                        Y.shutdown();
                        Y = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final long A() {
        C4086dm3 c4086dm3 = this.o;
        if (c4086dm3.c != 0) {
            return this.A;
        }
        long j = this.z;
        long j2 = c4086dm3.d;
        int i = AbstractC9004vJ2.a;
        return ((j + j2) - 1) / j2;
    }

    public final AudioTrack B(C4086dm3 c4086dm3) throws C4081dl3 {
        try {
            return c4086dm3.a(false, this.s, this.P);
        } catch (C4081dl3 e) {
            InterfaceC4648fl3 interfaceC4648fl3 = this.m;
            if (interfaceC4648fl3 != null) {
                interfaceC4648fl3.a(e);
            }
            throw e;
        }
    }

    public final void C(long j) {
        C7375pW1 c7375pW1;
        boolean z;
        if (M()) {
            C4653fm3 c4653fm3 = this.V;
            c7375pW1 = this.v;
            c4653fm3.c(c7375pW1);
        } else {
            c7375pW1 = C7375pW1.d;
        }
        C7375pW1 c7375pW12 = c7375pW1;
        this.v = c7375pW12;
        if (M()) {
            C4653fm3 c4653fm32 = this.V;
            z = this.w;
            c4653fm32.d(z);
        } else {
            z = false;
        }
        this.w = z;
        ArrayDeque arrayDeque = this.g;
        long jMax = Math.max(0L, j);
        C4086dm3 c4086dm3 = this.o;
        long jA = A();
        int i = c4086dm3.e;
        int i2 = AbstractC9004vJ2.a;
        arrayDeque.add(new C8847um3(c7375pW12, jMax, (jA * 1000000) / ((long) i), null));
        H();
        InterfaceC4648fl3 interfaceC4648fl3 = this.m;
        if (interfaceC4648fl3 != null) {
            ((Ym3) interfaceC4648fl3).a.C0.s(this.w);
        }
    }

    public final void D() {
        if (this.M) {
            return;
        }
        this.M = true;
        this.f.c(A());
        this.q.stop();
    }

    public final void E(long j) throws Exception {
        ByteBuffer byteBufferB;
        if (!this.p.h()) {
            ByteBuffer byteBuffer = this.G;
            if (byteBuffer == null) {
                byteBuffer = InterfaceC6028ki2.a;
            }
            I(byteBuffer, j);
            return;
        }
        while (!this.p.g()) {
            do {
                byteBufferB = this.p.b();
                if (byteBufferB.hasRemaining()) {
                    I(byteBufferB, j);
                } else {
                    ByteBuffer byteBuffer2 = this.G;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.p.e(this.G);
                    }
                }
            } while (!byteBufferB.hasRemaining());
            return;
        }
    }

    public final void F(C7375pW1 c7375pW1) {
        C8847um3 c8847um3 = new C8847um3(c7375pW1, -9223372036854775807L, -9223372036854775807L, null);
        if (K()) {
            this.t = c8847um3;
        } else {
            this.u = c8847um3;
        }
    }

    public final void G() {
        if (K()) {
            if (AbstractC9004vJ2.a >= 21) {
                this.q.setVolume(this.F);
                return;
            }
            AudioTrack audioTrack = this.q;
            float f = this.F;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void H() {
        C9660xg2 c9660xg2 = this.o.i;
        this.p = c9660xg2;
        c9660xg2.c();
    }

    public final void I(ByteBuffer byteBuffer, long j) throws Exception {
        int iWrite;
        InterfaceC4648fl3 interfaceC4648fl3;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                AbstractC6048km2.d(byteBuffer2 == byteBuffer);
            } else {
                this.I = byteBuffer;
                if (AbstractC9004vJ2.a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.J;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.J = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.J, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.K = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i = AbstractC9004vJ2.a;
            if (i < 21) {
                int iA = this.f.a(this.z);
                if (iA > 0) {
                    iWrite = this.q.write(this.J, this.K, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.K += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else {
                iWrite = this.q.write(byteBuffer, iRemaining2, 1);
            }
            this.S = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                C5765jl3 c5765jl3 = new C5765jl3(iWrite, this.o.a, ((i >= 24 && iWrite == -6) || iWrite == -32) && A() > 0);
                InterfaceC4648fl3 interfaceC4648fl32 = this.m;
                if (interfaceC4648fl32 != null) {
                    interfaceC4648fl32.a(c5765jl3);
                }
                if (c5765jl3.C) {
                    this.r = C4922gk3.c;
                    throw c5765jl3;
                }
                this.j.b(c5765jl3);
                return;
            }
            this.j.a();
            if (L(this.q)) {
                if (this.A > 0) {
                    this.U = false;
                }
                if (this.N && (interfaceC4648fl3 = this.m) != null && iWrite < iRemaining2) {
                    C3255an3 c3255an3 = ((Ym3) interfaceC4648fl3).a;
                    if (c3255an3.L0 != null) {
                        c3255an3.L0.zza();
                    }
                }
            }
            int i2 = this.o.c;
            if (i2 == 0) {
                this.z += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i2 != 0) {
                    AbstractC6048km2.f(byteBuffer == this.G);
                    this.A += ((long) this.B) * ((long) this.H);
                }
                this.I = null;
            }
        }
    }

    public final boolean J() throws Exception {
        if (!this.p.h()) {
            ByteBuffer byteBuffer = this.I;
            if (byteBuffer == null) {
                return true;
            }
            I(byteBuffer, Long.MIN_VALUE);
            return this.I == null;
        }
        this.p.d();
        E(Long.MIN_VALUE);
        if (!this.p.g()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.I;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final boolean K() {
        return this.q != null;
    }

    public final boolean M() {
        C4086dm3 c4086dm3 = this.o;
        if (c4086dm3.c != 0) {
            return false;
        }
        int i = c4086dm3.a.A;
        return true;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final long a(boolean z) {
        long jA;
        if (!K() || this.D) {
            return Long.MIN_VALUE;
        }
        long jB = this.f.b(z);
        C4086dm3 c4086dm3 = this.o;
        long jA2 = A();
        int i = c4086dm3.e;
        int i2 = AbstractC9004vJ2.a;
        long jMin = Math.min(jB, (jA2 * 1000000) / ((long) i));
        while (!this.g.isEmpty() && jMin >= ((C8847um3) this.g.getFirst()).c) {
            this.u = (C8847um3) this.g.remove();
        }
        C8847um3 c8847um3 = this.u;
        long j = jMin - c8847um3.c;
        if (c8847um3.a.equals(C7375pW1.d)) {
            jA = this.u.b + j;
        } else if (this.g.isEmpty()) {
            jA = this.V.a(j) + this.u.b;
        } else {
            C8847um3 c8847um32 = (C8847um3) this.g.getFirst();
            jA = c8847um32.b - AbstractC9004vJ2.A(c8847um32.c - jMin, this.u.a.a);
        }
        C4086dm3 c4086dm32 = this.o;
        return jA + ((this.V.b() * 1000000) / ((long) c4086dm32.e));
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void b(int i) {
        if (this.P != i) {
            this.P = i;
            this.O = i != 0;
            zzf();
        }
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final int c(C2485Ut1 c2485Ut1) {
        if (!"audio/raw".equals(c2485Ut1.l)) {
            return this.r.a(c2485Ut1) != null ? 2 : 0;
        }
        if (AbstractC9004vJ2.f(c2485Ut1.A)) {
            return c2485Ut1.A != 2 ? 1 : 2;
        }
        AbstractC3305ay2.f("DefaultAudioSink", "Invalid PCM encoding: " + c2485Ut1.A);
        return 0;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void d(C7375pW1 c7375pW1) {
        this.v = new C7375pW1(Math.max(0.1f, Math.min(c7375pW1.a, 8.0f)), Math.max(0.1f, Math.min(c7375pW1.b, 8.0f)));
        F(c7375pW1);
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void e(boolean z) {
        this.w = z;
        F(this.v);
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void f(float f) {
        if (this.F != f) {
            this.F = f;
            G();
        }
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void g(C3519bk3 c3519bk3) {
        this.l = c3519bk3;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void h(InterfaceC1810Om2 interfaceC1810Om2) {
        this.f.f(interfaceC1810Om2);
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final boolean i() {
        if (K()) {
            return this.L && !zzx();
        }
        return true;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void j(int i, int i2) {
        AudioTrack audioTrack = this.q;
        if (audioTrack != null) {
            L(audioTrack);
        }
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final C6606mk3 k(C2485Ut1 c2485Ut1) {
        return this.T ? C6606mk3.d : this.W.a(c2485Ut1, this.s);
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void l(AudioDeviceInfo audioDeviceInfo) {
        Ol3 ol3 = audioDeviceInfo == null ? null : new Ol3(audioDeviceInfo);
        this.R = ol3;
        AudioTrack audioTrack = this.q;
        if (audioTrack != null) {
            Il3.a(audioTrack, ol3);
        }
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void m(InterfaceC4648fl3 interfaceC4648fl3) {
        this.m = interfaceC4648fl3;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final boolean n(C2485Ut1 c2485Ut1) {
        return c(c2485Ut1) != 0;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void o(C2485Ut1 c2485Ut1, int i, int[] iArr) throws C3524bl3 {
        int i2;
        int iIntValue;
        int i3;
        int iS;
        int i4;
        C9660xg2 c9660xg2;
        int iX;
        int i5;
        int i6;
        int iMax;
        int[] iArr2;
        if ("audio/raw".equals(c2485Ut1.l)) {
            AbstractC6048km2.d(AbstractC9004vJ2.f(c2485Ut1.A));
            int iX2 = AbstractC9004vJ2.x(c2485Ut1.A, c2485Ut1.y);
            LP2 lp2 = new LP2();
            lp2.i(this.c);
            lp2.h(this.V.e());
            C9660xg2 c9660xg22 = new C9660xg2(lp2.j());
            if (c9660xg22.equals(this.p)) {
                c9660xg22 = this.p;
            }
            this.b.k(c2485Ut1.B, c2485Ut1.C);
            if (AbstractC9004vJ2.a < 21 && c2485Ut1.y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i7 = 0; i7 < 6; i7++) {
                    iArr2[i7] = i7;
                }
            } else {
                iArr2 = iArr;
            }
            this.a.i(iArr2);
            try {
                C3503bh2 c3503bh2A = c9660xg22.a(new C3503bh2(c2485Ut1.z, c2485Ut1.y, c2485Ut1.A));
                iIntValue = c3503bh2A.c;
                i2 = c3503bh2A.a;
                int i8 = c3503bh2A.b;
                iS = AbstractC9004vJ2.s(i8);
                c9660xg2 = c9660xg22;
                iX = AbstractC9004vJ2.x(iIntValue, i8);
                i4 = iX2;
                i3 = 0;
            } catch (C0855Fh2 e) {
                throw new C3524bl3(e, c2485Ut1);
            }
        } else {
            C9660xg2 c9660xg23 = new C9660xg2(OP2.J());
            i2 = c2485Ut1.z;
            C6606mk3 c6606mk3 = C6606mk3.d;
            Pair pairA = this.r.a(c2485Ut1);
            if (pairA == null) {
                throw new C3524bl3("Unable to configure passthrough for: ".concat(String.valueOf(c2485Ut1)), c2485Ut1);
            }
            iIntValue = ((Integer) pairA.first).intValue();
            int iIntValue2 = ((Integer) pairA.second).intValue();
            i3 = 2;
            iS = iIntValue2;
            i4 = -1;
            c9660xg2 = c9660xg23;
            iX = -1;
        }
        if (iIntValue == 0) {
            throw new C3524bl3("Invalid output encoding (mode=" + i3 + ") for: " + String.valueOf(c2485Ut1), c2485Ut1);
        }
        if (iS == 0) {
            throw new C3524bl3("Invalid output channel config (mode=" + i3 + ") for: " + String.valueOf(c2485Ut1), c2485Ut1);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iS, iIntValue);
        AbstractC6048km2.f(minBufferSize != -2);
        int i9 = iX != -1 ? iX : 1;
        int i10 = c2485Ut1.h;
        int i11 = 250000;
        if (i3 == 0) {
            i5 = i4;
            i6 = -1;
            iMax = Math.max(Rm3.a(250000, i2, i9), Math.min(minBufferSize * 4, Rm3.a(750000, i2, i9)));
        } else if (i3 != 1) {
            int i12 = 5;
            if (iIntValue == 5) {
                i11 = 500000;
                iIntValue = 5;
            } else {
                i12 = iIntValue;
            }
            int iA = i10 != -1 ? AbstractC3153aR2.a(i10, 8, RoundingMode.CEILING) : Rm3.b(iIntValue);
            i5 = i4;
            i6 = -1;
            iMax = AbstractC4835gR2.a((((long) i11) * ((long) iA)) / 1000000);
            iIntValue = i12;
        } else {
            i5 = i4;
            i6 = -1;
            iMax = AbstractC4835gR2.a((((long) Rm3.b(iIntValue)) * 50000000) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, iMax) + i9) + i6) / i9) * i9;
        this.T = false;
        C4086dm3 c4086dm3 = new C4086dm3(c2485Ut1, i5, i3, iX, i2, iS, iIntValue, iMax2, c9660xg2, false, false);
        if (K()) {
            this.n = c4086dm3;
        } else {
            this.o = c4086dm3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03bb A[Catch: dl3 -> 0x00d7, TryCatch #2 {dl3 -> 0x00d7, blocks: (B:35:0x0070, B:48:0x00c1, B:50:0x00c9, B:52:0x00cf, B:55:0x00da, B:56:0x00e3, B:58:0x00e9, B:60:0x00ed, B:61:0x00f2, B:65:0x0108, B:69:0x0120, B:70:0x0125, B:44:0x0086, B:46:0x008f, B:190:0x03b3, B:192:0x03bb, B:193:0x03be, B:38:0x0079, B:40:0x007d, B:43:0x0085), top: B:203:0x0070, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[Catch: dl3 -> 0x00d7, SYNTHETIC, TRY_LEAVE, TryCatch #2 {dl3 -> 0x00d7, blocks: (B:35:0x0070, B:48:0x00c1, B:50:0x00c9, B:52:0x00cf, B:55:0x00da, B:56:0x00e3, B:58:0x00e9, B:60:0x00ed, B:61:0x00f2, B:65:0x0108, B:69:0x0120, B:70:0x0125, B:44:0x0086, B:46:0x008f, B:190:0x03b3, B:192:0x03bb, B:193:0x03be, B:38:0x0079, B:40:0x007d, B:43:0x0085), top: B:203:0x0070, inners: #0 }] */
    @Override // com.daaw.InterfaceC6332ll3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(java.nio.ByteBuffer r31, long r32, int r34) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Nm3.p(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void q(C7965rd3 c7965rd3) {
        if (this.s.equals(c7965rd3)) {
            return;
        }
        this.s = c7965rd3;
        zzf();
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void r(Te3 te3) {
        if (this.Q.equals(te3)) {
            return;
        }
        if (this.q != null) {
            int i = this.Q.a;
        }
        this.Q = te3;
    }

    public final long z() {
        C4086dm3 c4086dm3 = this.o;
        return c4086dm3.c == 0 ? this.x / ((long) c4086dm3.b) : this.y;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final C7375pW1 zzc() {
        return this.v;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void zzf() {
        if (K()) {
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.U = false;
            this.B = 0;
            this.u = new C8847um3(this.v, 0L, 0L, null);
            this.E = 0L;
            this.t = null;
            this.g.clear();
            this.G = null;
            this.H = 0;
            this.I = null;
            this.M = false;
            this.L = false;
            this.b.j();
            H();
            if (this.f.i()) {
                this.q.pause();
            }
            if (L(this.q)) {
                Im3 im3 = this.h;
                im3.getClass();
                im3.b(this.q);
            }
            if (AbstractC9004vJ2.a < 21 && !this.O) {
                this.P = 0;
            }
            C4086dm3 c4086dm3 = this.n;
            if (c4086dm3 != null) {
                this.o = c4086dm3;
                this.n = null;
            }
            this.f.d();
            final AudioTrack audioTrack = this.q;
            final C5779jo2 c5779jo2 = this.e;
            c5779jo2.c();
            synchronized (X) {
                try {
                    if (Y == null) {
                        Y = AbstractC9004vJ2.c("ExoPlayer:AudioTrackReleaseThread");
                    }
                    Z++;
                    Y.execute(new Runnable() { // from class: com.daaw.Fl3
                        @Override // java.lang.Runnable
                        public final void run() {
                            Nm3.x(audioTrack, c5779jo2);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.q = null;
        }
        this.j.a();
        this.i.a();
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void zzg() {
        this.C = true;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void zzh() {
        this.N = false;
        if (K() && this.f.l()) {
            this.q.pause();
        }
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void zzi() {
        this.N = true;
        if (K()) {
            this.f.g();
            this.q.play();
        }
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void zzj() {
        if (!this.L && K() && J()) {
            D();
            this.L = true;
        }
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final void zzk() {
        zzf();
        OP2 op2 = this.c;
        int size = op2.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC6028ki2) op2.get(i)).zzf();
        }
        OP2 op22 = this.d;
        int size2 = op22.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC6028ki2) op22.get(i2)).zzf();
        }
        C9660xg2 c9660xg2 = this.p;
        if (c9660xg2 != null) {
            c9660xg2.f();
        }
        this.N = false;
        this.T = false;
    }

    @Override // com.daaw.InterfaceC6332ll3
    public final boolean zzx() {
        return K() && this.f.h(A());
    }
}
