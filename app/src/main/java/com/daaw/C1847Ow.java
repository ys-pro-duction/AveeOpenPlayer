package com.daaw;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.daaw.C4032dc;
import com.daaw.InterfaceC3196ac;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.Ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1847Ow implements InterfaceC3196ac {
    public static boolean Z = false;
    public static boolean a0 = false;
    public long A;
    public ByteBuffer B;
    public int C;
    public int D;
    public long E;
    public long F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public long L;
    public float M;
    public InterfaceC2827Yb[] N;
    public ByteBuffer[] O;
    public ByteBuffer P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public long Y;
    public final C2201Sb a;
    public final c b;
    public final boolean c;
    public final C6881nk d;
    public final C4746g61 e;
    public final InterfaceC2827Yb[] f;
    public final InterfaceC2827Yb[] g;
    public final ConditionVariable h;
    public final C4032dc i;
    public final ArrayDeque j;
    public InterfaceC3196ac.c k;
    public AudioTrack l;
    public AudioTrack m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public C2097Rb t;
    public boolean u;
    public boolean v;
    public int w;
    public C9457ww0 x;
    public C9457ww0 y;
    public long z;

    /* JADX INFO: renamed from: com.daaw.Ow$a */
    public class a extends Thread {
        public final /* synthetic */ AudioTrack B;

        public a(AudioTrack audioTrack) {
            this.B = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.B.flush();
                this.B.release();
            } finally {
                C1847Ow.this.h.open();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ow$b */
    public class b extends Thread {
        public final /* synthetic */ AudioTrack B;

        public b(AudioTrack audioTrack) {
            this.B = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.B.release();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ow$c */
    public interface c {
        long a(long j);

        C9457ww0 b(C9457ww0 c9457ww0);

        long c();

        InterfaceC2827Yb[] d();
    }

    /* JADX INFO: renamed from: com.daaw.Ow$d */
    public static class d implements c {
        public final InterfaceC2827Yb[] a;
        public final C10154zS0 b;
        public final MU0 c;

        public d(InterfaceC2827Yb... interfaceC2827YbArr) {
            InterfaceC2827Yb[] interfaceC2827YbArr2 = (InterfaceC2827Yb[]) Arrays.copyOf(interfaceC2827YbArr, interfaceC2827YbArr.length + 2);
            this.a = interfaceC2827YbArr2;
            C10154zS0 c10154zS0 = new C10154zS0();
            this.b = c10154zS0;
            MU0 mu0 = new MU0();
            this.c = mu0;
            interfaceC2827YbArr2[interfaceC2827YbArr.length] = c10154zS0;
            interfaceC2827YbArr2[interfaceC2827YbArr.length + 1] = mu0;
        }

        @Override // com.daaw.C1847Ow.c
        public long a(long j) {
            return this.c.a(j);
        }

        @Override // com.daaw.C1847Ow.c
        public C9457ww0 b(C9457ww0 c9457ww0) {
            this.b.t(c9457ww0.c);
            return new C9457ww0(this.c.l(c9457ww0.a), this.c.b(c9457ww0.b), c9457ww0.c);
        }

        @Override // com.daaw.C1847Ow.c
        public long c() {
            return this.b.m();
        }

        @Override // com.daaw.C1847Ow.c
        public InterfaceC2827Yb[] d() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ow$e */
    public static final class e extends RuntimeException {
        public /* synthetic */ e(String str, a aVar) {
            this(str);
        }

        public e(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ow$f */
    public static final class f {
        public final C9457ww0 a;
        public final long b;
        public final long c;

        public /* synthetic */ f(C9457ww0 c9457ww0, long j, long j2, a aVar) {
            this(c9457ww0, j, j2);
        }

        public f(C9457ww0 c9457ww0, long j, long j2) {
            this.a = c9457ww0;
            this.b = j;
            this.c = j2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ow$g */
    public final class g implements C4032dc.a {
        public g() {
        }

        @Override // com.daaw.C4032dc.a
        public void a(int i, long j) {
            if (C1847Ow.this.k != null) {
                C1847Ow.this.k.b(i, j, SystemClock.elapsedRealtime() - C1847Ow.this.Y);
            }
        }

        @Override // com.daaw.C4032dc.a
        public void c(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1847Ow.this.G() + ", " + C1847Ow.this.H();
            if (C1847Ow.a0) {
                throw new e(str, null);
            }
        }

        @Override // com.daaw.C4032dc.a
        public void d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1847Ow.this.G() + ", " + C1847Ow.this.H();
            if (C1847Ow.a0) {
                throw new e(str, null);
            }
        }

        public /* synthetic */ g(C1847Ow c1847Ow, a aVar) {
            this();
        }

        @Override // com.daaw.C4032dc.a
        public void b(long j) {
        }
    }

    public C1847Ow(C2201Sb c2201Sb, InterfaceC2827Yb[] interfaceC2827YbArr) {
        this(c2201Sb, interfaceC2827YbArr, false);
    }

    public static int F(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return IE.e(byteBuffer);
        }
        if (i == 5) {
            return AbstractC4719g1.b();
        }
        if (i == 6) {
            return AbstractC4719g1.h(byteBuffer);
        }
        if (i == 14) {
            int iA = AbstractC4719g1.a(byteBuffer);
            if (iA == -1) {
                return 0;
            }
            return AbstractC4719g1.i(byteBuffer, iA) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i);
    }

    public static void Q(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    public static void R(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    public static int U(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A() throws com.daaw.InterfaceC3196ac.d {
        /*
            r9 = this;
            int r0 = r9.T
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.u
            if (r0 == 0) goto Ld
            r0 = 0
            goto L10
        Ld:
            com.daaw.Yb[] r0 = r9.N
            int r0 = r0.length
        L10:
            r9.T = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.T
            com.daaw.Yb[] r5 = r9.N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.j()
        L28:
            r9.N(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.T
            int r0 = r0 + r1
            r9.T = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L44
            r9.T(r0, r7)
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.T = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1847Ow.A():boolean");
    }

    public final long B(long j) {
        return (j * ((long) this.q)) / 1000000;
    }

    public final void C() {
        int i = 0;
        while (true) {
            InterfaceC2827Yb[] interfaceC2827YbArr = this.N;
            if (i >= interfaceC2827YbArr.length) {
                return;
            }
            InterfaceC2827Yb interfaceC2827Yb = interfaceC2827YbArr[i];
            interfaceC2827Yb.flush();
            this.O[i] = interfaceC2827Yb.e();
            i++;
        }
    }

    public final long D(long j) {
        return (j * 1000000) / ((long) this.q);
    }

    public final InterfaceC2827Yb[] E() {
        return this.o ? this.g : this.f;
    }

    public final long G() {
        return this.n ? this.E / ((long) this.D) : this.F;
    }

    public final long H() {
        return this.n ? this.H / ((long) this.G) : this.I;
    }

    public final void I() throws InterfaceC3196ac.b {
        this.h.block();
        AudioTrack audioTrackJ = J();
        this.m = audioTrackJ;
        int audioSessionId = audioTrackJ.getAudioSessionId();
        if (Z && AbstractC6280lb1.a < 21) {
            AudioTrack audioTrack = this.l;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                O();
            }
            if (this.l == null) {
                this.l = K(audioSessionId);
            }
        }
        if (this.W != audioSessionId) {
            this.W = audioSessionId;
            InterfaceC3196ac.c cVar = this.k;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        this.y = this.v ? this.b.b(this.y) : C9457ww0.e;
        S();
        this.i.s(this.m, this.s, this.G, this.w);
        P();
    }

    public final AudioTrack J() throws InterfaceC3196ac.b {
        AudioTrack audioTrack;
        if (AbstractC6280lb1.a >= 21) {
            audioTrack = z();
        } else {
            int iA = AbstractC6280lb1.A(this.t.c);
            audioTrack = this.W == 0 ? new AudioTrack(iA, this.q, this.r, this.s, this.w, 1) : new AudioTrack(iA, this.q, this.r, this.s, this.w, 1, this.W);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new InterfaceC3196ac.b(state, this.q, this.r, this.w);
    }

    public final AudioTrack K(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    public final long L(long j) {
        return (j * 1000000) / ((long) this.p);
    }

    public final boolean M() {
        return this.m != null;
    }

    public final void N(long j) throws InterfaceC3196ac.d {
        ByteBuffer byteBuffer;
        int length = this.N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.O[i - 1];
            } else {
                byteBuffer = this.P;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC2827Yb.a;
                }
            }
            if (i == length) {
                T(byteBuffer, j);
            } else {
                InterfaceC2827Yb interfaceC2827Yb = this.N[i];
                interfaceC2827Yb.f(byteBuffer);
                ByteBuffer byteBufferE = interfaceC2827Yb.e();
                this.O[i] = byteBufferE;
                if (byteBufferE.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void O() {
        AudioTrack audioTrack = this.l;
        if (audioTrack == null) {
            return;
        }
        this.l = null;
        new b(audioTrack).start();
    }

    public final void P() {
        if (M()) {
            if (AbstractC6280lb1.a >= 21) {
                Q(this.m, this.M);
            } else {
                R(this.m, this.M);
            }
        }
    }

    public final void S() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2827Yb interfaceC2827Yb : E()) {
            if (interfaceC2827Yb.d()) {
                arrayList.add(interfaceC2827Yb);
            } else {
                interfaceC2827Yb.flush();
            }
        }
        int size = arrayList.size();
        this.N = (InterfaceC2827Yb[]) arrayList.toArray(new InterfaceC2827Yb[size]);
        this.O = new ByteBuffer[size];
        C();
    }

    public final void T(ByteBuffer byteBuffer, long j) throws InterfaceC3196ac.d {
        C1847Ow c1847Ow;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.Q;
            int iU = 0;
            if (byteBuffer2 != null) {
                AbstractC7115ob.a(byteBuffer2 == byteBuffer);
            } else {
                this.Q = byteBuffer;
                if (AbstractC6280lb1.a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.R;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.R = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.R, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.S = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (AbstractC6280lb1.a < 21) {
                int iC = this.i.c(this.H);
                if (iC > 0) {
                    iU = this.m.write(this.R, this.S, Math.min(iRemaining2, iC));
                    if (iU > 0) {
                        this.S += iU;
                        byteBuffer.position(byteBuffer.position() + iU);
                    }
                }
                c1847Ow = this;
            } else if (this.X) {
                AbstractC7115ob.f(j != -9223372036854775807L);
                c1847Ow = this;
                iU = c1847Ow.V(this.m, byteBuffer, iRemaining2, j);
            } else {
                c1847Ow = this;
                iU = U(c1847Ow.m, byteBuffer, iRemaining2);
            }
            c1847Ow.Y = SystemClock.elapsedRealtime();
            if (iU < 0) {
                throw new InterfaceC3196ac.d(iU);
            }
            boolean z = c1847Ow.n;
            if (z) {
                c1847Ow.H += (long) iU;
            }
            if (iU == iRemaining2) {
                if (!z) {
                    c1847Ow.I += (long) c1847Ow.J;
                }
                c1847Ow.Q = null;
            }
        }
    }

    public final int V(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.B == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.B = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.B.putInt(1431633921);
        }
        if (this.C == 0) {
            this.B.putInt(4, i);
            this.B.putLong(8, j * 1000);
            this.B.position(0);
            this.C = i;
        }
        int iRemaining = this.B.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.B, iRemaining, 1);
            if (iWrite < 0) {
                this.C = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iU = U(audioTrack, byteBuffer, i);
        if (iU < 0) {
            this.C = 0;
            return iU;
        }
        this.C -= iU;
        return iU;
    }

    @Override // com.daaw.InterfaceC3196ac
    public void a() {
        reset();
        O();
        for (InterfaceC2827Yb interfaceC2827Yb : this.f) {
            interfaceC2827Yb.reset();
        }
        for (InterfaceC2827Yb interfaceC2827Yb2 : this.g) {
            interfaceC2827Yb2.reset();
        }
        this.W = 0;
        this.V = false;
    }

    @Override // com.daaw.InterfaceC3196ac
    public void b() {
        this.V = false;
        if (M() && this.i.p()) {
            this.m.pause();
        }
    }

    @Override // com.daaw.InterfaceC3196ac
    public boolean c() {
        if (M()) {
            return this.U && !j();
        }
        return true;
    }

    @Override // com.daaw.InterfaceC3196ac
    public C9457ww0 d(C9457ww0 c9457ww0) {
        if (M() && !this.v) {
            C9457ww0 c9457ww02 = C9457ww0.e;
            this.y = c9457ww02;
            return c9457ww02;
        }
        C9457ww0 c9457ww03 = this.x;
        if (c9457ww03 == null) {
            c9457ww03 = !this.j.isEmpty() ? ((f) this.j.getLast()).a : this.y;
        }
        if (!c9457ww0.equals(c9457ww03)) {
            if (M()) {
                this.x = c9457ww0;
            } else {
                this.y = this.b.b(c9457ww0);
            }
        }
        return this.y;
    }

    @Override // com.daaw.InterfaceC3196ac
    public C9457ww0 g() {
        return this.y;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0134  */
    @Override // com.daaw.InterfaceC3196ac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(int r18, int r19, int r20, int r21, int[] r22, int r23, int r24) throws com.daaw.InterfaceC3196ac.a {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1847Ow.h(int, int, int, int, int[], int, int):void");
    }

    @Override // com.daaw.InterfaceC3196ac
    public void i() {
        if (!this.U && M() && A()) {
            this.i.g(H());
            this.m.stop();
            this.C = 0;
            this.U = true;
        }
    }

    @Override // com.daaw.InterfaceC3196ac
    public boolean j() {
        return M() && this.i.h(H());
    }

    @Override // com.daaw.InterfaceC3196ac
    public long k(boolean z) {
        if (!M() || this.K == 0) {
            return Long.MIN_VALUE;
        }
        return this.L + x(y(Math.min(this.i.d(z), D(H()))));
    }

    @Override // com.daaw.InterfaceC3196ac
    public void l() {
        if (this.X) {
            this.X = false;
            this.W = 0;
            reset();
        }
    }

    @Override // com.daaw.InterfaceC3196ac
    public void m(C2097Rb c2097Rb) {
        if (this.t.equals(c2097Rb)) {
            return;
        }
        this.t = c2097Rb;
        if (this.X) {
            return;
        }
        reset();
        this.W = 0;
    }

    @Override // com.daaw.InterfaceC3196ac
    public void n() {
        if (this.K == 1) {
            this.K = 2;
        }
    }

    @Override // com.daaw.InterfaceC3196ac
    public void o(float f2) {
        if (this.M != f2) {
            this.M = f2;
            P();
        }
    }

    @Override // com.daaw.InterfaceC3196ac
    public boolean p(ByteBuffer byteBuffer, long j) throws InterfaceC3196ac.d, InterfaceC3196ac.b {
        boolean z;
        ByteBuffer byteBuffer2 = this.P;
        AbstractC7115ob.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!M()) {
            I();
            if (this.V) {
                r();
            }
        }
        if (!this.i.k(H())) {
            return false;
        }
        if (this.P != null) {
            z = false;
        } else {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.n && this.J == 0) {
                int iF = F(this.s, byteBuffer);
                this.J = iF;
                if (iF == 0) {
                    return true;
                }
            }
            if (this.x == null) {
                z = false;
            } else {
                if (!A()) {
                    return false;
                }
                C9457ww0 c9457ww0 = this.x;
                this.x = null;
                z = false;
                this.j.add(new f(this.b.b(c9457ww0), Math.max(0L, j), D(H()), null));
                S();
            }
            if (this.K == 0) {
                this.L = Math.max(0L, j);
                this.K = 1;
            } else {
                long jL = this.L + L(G());
                if (this.K == 1 && Math.abs(jL - j) > 200000) {
                    this.K = 2;
                }
                if (this.K == 2) {
                    this.L += j - jL;
                    this.K = 1;
                    InterfaceC3196ac.c cVar = this.k;
                    if (cVar != null) {
                        cVar.c();
                    }
                }
            }
            if (this.n) {
                this.E += (long) byteBuffer.remaining();
            } else {
                this.F += (long) this.J;
            }
            this.P = byteBuffer;
        }
        if (this.u) {
            N(j);
        } else {
            T(this.P, j);
        }
        if (!this.P.hasRemaining()) {
            this.P = null;
            return true;
        }
        if (!this.i.j(H())) {
            return z;
        }
        reset();
        return true;
    }

    @Override // com.daaw.InterfaceC3196ac
    public void q(int i) {
        AbstractC7115ob.f(AbstractC6280lb1.a >= 21);
        if (this.X && this.W == i) {
            return;
        }
        this.X = true;
        this.W = i;
        reset();
    }

    @Override // com.daaw.InterfaceC3196ac
    public void r() {
        this.V = true;
        if (M()) {
            this.i.t();
            this.m.play();
        }
    }

    @Override // com.daaw.InterfaceC3196ac
    public void reset() {
        if (M()) {
            this.E = 0L;
            this.F = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0;
            C9457ww0 c9457ww0 = this.x;
            if (c9457ww0 != null) {
                this.y = c9457ww0;
                this.x = null;
            } else if (!this.j.isEmpty()) {
                this.y = ((f) this.j.getLast()).a;
            }
            this.j.clear();
            this.z = 0L;
            this.A = 0L;
            this.P = null;
            this.Q = null;
            C();
            this.U = false;
            this.T = -1;
            this.B = null;
            this.C = 0;
            this.K = 0;
            if (this.i.i()) {
                this.m.pause();
            }
            AudioTrack audioTrack = this.m;
            this.m = null;
            this.i.q();
            this.h.close();
            new a(audioTrack).start();
        }
    }

    @Override // com.daaw.InterfaceC3196ac
    public boolean s(int i) {
        if (AbstractC6280lb1.I(i)) {
            return i != 4 || AbstractC6280lb1.a >= 21;
        }
        C2201Sb c2201Sb = this.a;
        return c2201Sb != null && c2201Sb.c(i);
    }

    @Override // com.daaw.InterfaceC3196ac
    public void t(InterfaceC3196ac.c cVar) {
        this.k = cVar;
    }

    public final long x(long j) {
        return j + D(this.b.c());
    }

    public final long y(long j) {
        long j2;
        long jW;
        f fVar = null;
        while (!this.j.isEmpty() && j >= ((f) this.j.getFirst()).c) {
            fVar = (f) this.j.remove();
        }
        if (fVar != null) {
            this.y = fVar.a;
            this.A = fVar.c;
            this.z = fVar.b - this.L;
        }
        if (this.y.a == 1.0f) {
            return (j + this.z) - this.A;
        }
        if (this.j.isEmpty()) {
            j2 = this.z;
            jW = this.b.a(j - this.A);
        } else {
            j2 = this.z;
            jW = AbstractC6280lb1.w(j - this.A, this.y.a);
        }
        return j2 + jW;
    }

    public final AudioTrack z() {
        AudioAttributes audioAttributesBuild = this.X ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.t.a();
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.r).setEncoding(this.s).setSampleRate(this.q).build();
        int i = this.W;
        return new AudioTrack(audioAttributesBuild, audioFormatBuild, this.w, 1, i != 0 ? i : 0);
    }

    public C1847Ow(C2201Sb c2201Sb, InterfaceC2827Yb[] interfaceC2827YbArr, boolean z) {
        this(c2201Sb, new d(interfaceC2827YbArr), z);
    }

    public C1847Ow(C2201Sb c2201Sb, c cVar, boolean z) {
        this.a = c2201Sb;
        this.b = (c) AbstractC7115ob.e(cVar);
        this.c = z;
        this.h = new ConditionVariable(true);
        this.i = new C4032dc(new g(this, null));
        C6881nk c6881nk = new C6881nk();
        this.d = c6881nk;
        C4746g61 c4746g61 = new C4746g61();
        this.e = c4746g61;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C10114zI0(), c6881nk, c4746g61);
        Collections.addAll(arrayList, cVar.d());
        this.f = (InterfaceC2827Yb[]) arrayList.toArray(new InterfaceC2827Yb[arrayList.size()]);
        this.g = new InterfaceC2827Yb[]{new C4816gN()};
        this.M = 1.0f;
        this.K = 0;
        this.t = C2097Rb.e;
        this.W = 0;
        this.y = C9457ww0.e;
        this.T = -1;
        this.N = new InterfaceC2827Yb[0];
        this.O = new ByteBuffer[0];
        this.j = new ArrayDeque();
    }
}
