package com.daaw;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4032dc {
    public final a a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public C3753cc f;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public Method l;
    public long m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public long r;
    public long s;
    public int t;
    public int u;
    public long v;
    public long w;
    public long x;
    public long y;

    /* JADX INFO: renamed from: com.daaw.dc$a */
    public interface a {
        void a(int i, long j);

        void b(long j);

        void c(long j, long j2, long j3, long j4);

        void d(long j, long j2, long j3, long j4);
    }

    public C4032dc(a aVar) {
        this.a = (a) AbstractC7115ob.e(aVar);
        if (AbstractC6280lb1.a >= 18) {
            try {
                this.l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public static boolean o(int i) {
        if (AbstractC6280lb1.a < 23) {
            return i == 5 || i == 6;
        }
        return false;
    }

    public final boolean a() {
        return this.h && this.c.getPlayState() == 2 && e() == 0;
    }

    public final long b(long j) {
        return (j * 1000000) / ((long) this.g);
    }

    public int c(long j) {
        return this.e - ((int) (j - (e() * ((long) this.d))));
    }

    public long d(boolean z) {
        if (this.c.getPlayState() == 3) {
            m();
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (this.f.d()) {
            long jB = b(this.f.b());
            return !this.f.e() ? jB : jB + (jNanoTime - this.f.c());
        }
        long jF = this.u == 0 ? f() : jNanoTime + this.j;
        return !z ? jF - this.m : jF;
    }

    public final long e() {
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + ((((SystemClock.elapsedRealtime() * 1000) - this.v) * ((long) this.g)) / 1000000));
        }
        int playState = this.c.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.c.getPlaybackHeadPosition()) & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.s = this.q;
            }
            playbackHeadPosition += this.s;
        }
        if (AbstractC6280lb1.a <= 28) {
            if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                if (this.w == -9223372036854775807L) {
                    this.w = SystemClock.elapsedRealtime();
                }
                return this.q;
            }
            this.w = -9223372036854775807L;
        }
        if (this.q > playbackHeadPosition) {
            this.r++;
        }
        this.q = playbackHeadPosition;
        return playbackHeadPosition + (this.r << 32);
    }

    public final long f() {
        return b(e());
    }

    public void g(long j) {
        this.x = e();
        this.v = SystemClock.elapsedRealtime() * 1000;
        this.y = j;
    }

    public boolean h(long j) {
        return j > e() || a();
    }

    public boolean i() {
        return this.c.getPlayState() == 3;
    }

    public boolean j(long j) {
        return this.w != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.w >= 200;
    }

    public boolean k(long j) {
        a aVar;
        int playState = this.c.getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.n = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z = this.n;
        boolean zH = h(j);
        this.n = zH;
        if (z && !zH && playState != 1 && (aVar = this.a) != null) {
            aVar.a(this.e, AbstractC6025ki.b(this.i));
        }
        return true;
    }

    public final void l(long j, long j2) {
        if (this.f.f(j)) {
            long jC = this.f.c();
            long jB = this.f.b();
            if (Math.abs(jC - j) > 5000000) {
                this.a.d(jB, jC, j, j2);
                this.f.g();
            } else if (Math.abs(b(jB) - j2) <= 5000000) {
                this.f.a();
            } else {
                this.a.c(jB, jC, j, j2);
                this.f.g();
            }
        }
    }

    public final void m() {
        long jF = f();
        if (jF == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.k >= 30000) {
            long[] jArr = this.b;
            int i = this.t;
            jArr[i] = jF - jNanoTime;
            this.t = (i + 1) % 10;
            int i2 = this.u;
            if (i2 < 10) {
                this.u = i2 + 1;
            }
            this.k = jNanoTime;
            this.j = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.u;
                if (i3 >= i4) {
                    break;
                }
                this.j += this.b[i3] / ((long) i4);
                i3++;
            }
        }
        if (this.h) {
            return;
        }
        l(jNanoTime, jF);
        n(jNanoTime);
    }

    public final void n(long j) {
        Method method;
        if (!this.o || (method = this.l) == null || j - this.p < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) method.invoke(this.c, null)).intValue()) * 1000) - this.i;
            this.m = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.m = jMax;
            if (jMax > 5000000) {
                this.a.b(jMax);
                this.m = 0L;
            }
        } catch (Exception unused) {
            this.l = null;
        }
        this.p = j;
    }

    public boolean p() {
        r();
        if (this.v != -9223372036854775807L) {
            return false;
        }
        this.f.h();
        return true;
    }

    public void q() {
        r();
        this.c = null;
        this.f = null;
    }

    public final void r() {
        this.j = 0L;
        this.u = 0;
        this.t = 0;
        this.k = 0L;
    }

    public void s(AudioTrack audioTrack, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new C3753cc(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = o(i);
        boolean zI = AbstractC6280lb1.I(i);
        this.o = zI;
        this.i = zI ? b(i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.s = 0L;
        this.n = false;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.m = 0L;
    }

    public void t() {
        this.f.h();
    }
}
