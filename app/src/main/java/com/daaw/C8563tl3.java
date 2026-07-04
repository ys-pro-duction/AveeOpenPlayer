package com.daaw;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.tl3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8563tl3 {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public boolean H;
    public long I;
    public InterfaceC1810Om2 J;
    public final InterfaceC8005rl3 a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public C7448pl3 f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    public C8563tl3(InterfaceC8005rl3 interfaceC8005rl3) {
        this.a = interfaceC8005rl3;
        int i = AbstractC9004vJ2.a;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.J = InterfaceC1810Om2.a;
    }

    public final int a(long j) {
        return this.e - ((int) (j - (m() * ((long) this.d))));
    }

    public final long b(boolean z) {
        long j;
        long j2;
        long jN;
        long j3;
        Method method;
        AudioTrack audioTrack;
        C8563tl3 c8563tl3 = this;
        AudioTrack audioTrack2 = c8563tl3.c;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - c8563tl3.m >= 30000) {
                long jN2 = c8563tl3.n();
                if (jN2 != 0) {
                    c8563tl3.b[c8563tl3.w] = AbstractC9004vJ2.B(jN2, c8563tl3.j) - jNanoTime;
                    c8563tl3.w = (c8563tl3.w + 1) % 10;
                    int i = c8563tl3.x;
                    if (i < 10) {
                        c8563tl3.x = i + 1;
                    }
                    c8563tl3.m = jNanoTime;
                    c8563tl3.l = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = c8563tl3.x;
                        if (i2 >= i3) {
                            break;
                        }
                        c8563tl3.l += c8563tl3.b[i2] / ((long) i3);
                        i2++;
                    }
                }
                j = 1000;
                j2 = 1000000;
            }
            if (c8563tl3.h) {
                j = 1000;
                j2 = 1000000;
            } else {
                C7448pl3 c7448pl3 = c8563tl3.f;
                c7448pl3.getClass();
                if (c7448pl3.g(jNanoTime)) {
                    long jB = c7448pl3.b();
                    j = 1000;
                    long jA = c7448pl3.a();
                    j3 = 5000000;
                    long jN3 = c8563tl3.n();
                    if (Math.abs(jB - jNanoTime) > 5000000) {
                        j2 = 1000000;
                        Nm3 nm3 = ((Am3) c8563tl3.a).a;
                        AbstractC3305ay2.f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + jA + ", " + jB + ", " + jNanoTime + ", " + jN3 + ", " + nm3.z() + ", " + nm3.A());
                        c7448pl3.d();
                        jNanoTime = jNanoTime;
                    } else {
                        j2 = 1000000;
                        int i4 = c8563tl3.g;
                        int i5 = AbstractC9004vJ2.a;
                        if (Math.abs(((jA * 1000000) / ((long) i4)) - jN3) > 5000000) {
                            Nm3 nm32 = ((Am3) c8563tl3.a).a;
                            AbstractC3305ay2.f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + jA + ", " + jB + ", " + jNanoTime + ", " + jN3 + ", " + nm32.z() + ", " + nm32.A());
                            c7448pl3.d();
                        } else {
                            c7448pl3.c();
                        }
                        c8563tl3 = this;
                    }
                } else {
                    j = 1000;
                    j2 = 1000000;
                    j3 = 5000000;
                }
                if (c8563tl3.q && (method = c8563tl3.n) != null && jNanoTime - c8563tl3.r >= 500000) {
                    try {
                        audioTrack = c8563tl3.c;
                    } catch (Exception unused) {
                        c8563tl3.n = null;
                    }
                    if (audioTrack == null) {
                        throw null;
                    }
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    int i6 = AbstractC9004vJ2.a;
                    long jIntValue = (((long) num.intValue()) * j) - c8563tl3.i;
                    c8563tl3.o = jIntValue;
                    long jMax = Math.max(jIntValue, 0L);
                    c8563tl3.o = jMax;
                    if (jMax > j3) {
                        AbstractC3305ay2.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        c8563tl3.o = 0L;
                    }
                    c8563tl3.r = jNanoTime;
                }
            }
        } else {
            j = 1000;
            j2 = 1000000;
        }
        long jNanoTime2 = System.nanoTime() / j;
        C7448pl3 c7448pl32 = c8563tl3.f;
        c7448pl32.getClass();
        boolean zF = c7448pl32.f();
        if (zF) {
            long jA2 = c7448pl32.a();
            int i7 = c8563tl3.g;
            int i8 = AbstractC9004vJ2.a;
            jN = ((jA2 * j2) / ((long) i7)) + AbstractC9004vJ2.A(jNanoTime2 - c7448pl32.b(), c8563tl3.j);
        } else {
            jN = c8563tl3.x == 0 ? c8563tl3.n() : AbstractC9004vJ2.A(c8563tl3.l + jNanoTime2, c8563tl3.j);
            if (!z) {
                jN = Math.max(0L, jN - c8563tl3.o);
            }
        }
        if (c8563tl3.E != zF) {
            c8563tl3.G = c8563tl3.D;
            c8563tl3.F = c8563tl3.C;
        }
        long j4 = jNanoTime2 - c8563tl3.G;
        if (j4 < j2) {
            long jA3 = c8563tl3.F + AbstractC9004vJ2.A(j4, c8563tl3.j);
            long j5 = (j4 * j) / j2;
            jN = ((jN * j5) + ((j - j5) * jA3)) / j;
        }
        if (!c8563tl3.k) {
            long j6 = c8563tl3.C;
            if (jN > j6) {
                c8563tl3.k = true;
                int i9 = AbstractC9004vJ2.a;
                long jCurrentTimeMillis = System.currentTimeMillis() - AbstractC9004vJ2.E(AbstractC9004vJ2.B(AbstractC9004vJ2.E(jN - j6), c8563tl3.j));
                Nm3 nm33 = ((Am3) c8563tl3.a).a;
                if (nm33.m != null) {
                    ((Ym3) nm33.m).a.C0.r(jCurrentTimeMillis);
                }
            }
        }
        c8563tl3.D = jNanoTime2;
        c8563tl3.C = jN;
        c8563tl3.E = zF;
        return jN;
    }

    public final void c(long j) {
        this.A = m();
        this.y = AbstractC9004vJ2.C(SystemClock.elapsedRealtime());
        this.B = j;
    }

    public final void d() {
        o();
        this.c = null;
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.media.AudioTrack r5, boolean r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            r4.c = r5
            r4.d = r8
            r4.e = r9
            com.daaw.pl3 r0 = new com.daaw.pl3
            r0.<init>(r5)
            r4.f = r0
            int r5 = r5.getSampleRate()
            r4.g = r5
            r5 = 0
            if (r6 == 0) goto L25
            int r6 = com.daaw.AbstractC9004vJ2.a
            r0 = 23
            if (r6 >= r0) goto L25
            r6 = 5
            r0 = 1
            if (r7 == r6) goto L26
            r6 = 6
            if (r7 != r6) goto L25
            r7 = 6
            goto L26
        L25:
            r0 = 0
        L26:
            r4.h = r0
            boolean r6 = com.daaw.AbstractC9004vJ2.f(r7)
            r4.q = r6
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L41
            int r9 = r9 / r8
            long r6 = (long) r9
            int r8 = r4.g
            long r8 = (long) r8
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r2
            long r6 = r6 / r8
            goto L42
        L41:
            r6 = r0
        L42:
            r4.i = r6
            r6 = 0
            r4.t = r6
            r4.u = r6
            r4.H = r5
            r4.I = r6
            r4.v = r6
            r4.p = r5
            r4.y = r0
            r4.z = r0
            r4.r = r6
            r4.o = r6
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8563tl3.e(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void f(InterfaceC1810Om2 interfaceC1810Om2) {
        this.J = interfaceC1810Om2;
    }

    public final void g() {
        C7448pl3 c7448pl3 = this.f;
        c7448pl3.getClass();
        c7448pl3.e();
    }

    public final boolean h(long j) {
        if (j > AbstractC9004vJ2.z(b(false), this.g)) {
            return true;
        }
        if (this.h) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && m() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean j(long j) {
        return this.z != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.z >= 200;
    }

    public final boolean k(long j) {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1) {
                if (m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.p;
        boolean zH = h(j);
        this.p = zH;
        if (z && !zH && playState != 1) {
            InterfaceC8005rl3 interfaceC8005rl3 = this.a;
            int i = this.e;
            long jE = AbstractC9004vJ2.E(this.i);
            Am3 am3 = (Am3) interfaceC8005rl3;
            Nm3 nm3 = am3.a;
            if (nm3.m != null) {
                ((Ym3) am3.a.m).a.C0.t(i, jE, SystemClock.elapsedRealtime() - nm3.S);
            }
        }
        return true;
    }

    public final boolean l() {
        o();
        if (this.y != -9223372036854775807L) {
            return false;
        }
        C7448pl3 c7448pl3 = this.f;
        c7448pl3.getClass();
        c7448pl3.e();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m() {
        /*
            r12 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r12.y
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2c
            long r0 = com.daaw.AbstractC9004vJ2.C(r0)
            long r2 = r12.y
            long r0 = r0 - r2
            float r2 = r12.j
            long r0 = com.daaw.AbstractC9004vJ2.A(r0, r2)
            int r2 = r12.g
            long r0 = com.daaw.AbstractC9004vJ2.z(r0, r2)
            long r2 = r12.B
            long r4 = r12.A
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L2c:
            long r2 = r12.s
            long r2 = r0 - r2
            r6 = 5
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L94
            android.media.AudioTrack r2 = r12.c
            r2.getClass()
            int r3 = r2.getPlayState()
            r6 = 1
            if (r3 != r6) goto L43
            goto L92
        L43:
            int r2 = r2.getPlaybackHeadPosition()
            long r6 = (long) r2
            boolean r2 = r12.h
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 0
            if (r2 == 0) goto L63
            r2 = 2
            if (r3 != r2) goto L60
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L5f
            long r10 = r12.t
            r12.v = r10
        L5f:
            r3 = 2
        L60:
            long r10 = r12.v
            long r6 = r6 + r10
        L63:
            int r2 = com.daaw.AbstractC9004vJ2.a
            r10 = 29
            if (r2 > r10) goto L83
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L7f
            long r6 = r12.t
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L80
            r2 = 3
            if (r3 != r2) goto L80
            long r2 = r12.z
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L92
            r12.z = r0
            goto L92
        L7f:
            r8 = r6
        L80:
            r12.z = r4
            r6 = r8
        L83:
            long r2 = r12.t
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L90
            long r2 = r12.u
            r4 = 1
            long r2 = r2 + r4
            r12.u = r2
        L90:
            r12.t = r6
        L92:
            r12.s = r0
        L94:
            long r0 = r12.t
            long r2 = r12.I
            long r0 = r0 + r2
            long r2 = r12.u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8563tl3.m():long");
    }

    public final long n() {
        long jM = m();
        int i = this.g;
        int i2 = AbstractC9004vJ2.a;
        return (jM * 1000000) / ((long) i);
    }

    public final void o() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
