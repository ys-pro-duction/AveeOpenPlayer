package com.daaw;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class bu3 {
    public final C9447wt3 a = new C9447wt3();
    public final Xt3 b;
    public final au3 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public bu3(Context context) {
        Xt3 xt3B;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = AbstractC9004vJ2.a;
            xt3B = Zt3.b(applicationContext);
            if (xt3B == null) {
                xt3B = Yt3.b(applicationContext);
            }
        } else {
            xt3B = null;
        }
        this.b = xt3B;
        this.c = xt3B != null ? au3.a() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static /* synthetic */ void b(bu3 bu3Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            bu3Var.k = refreshRate;
            bu3Var.l = (refreshRate * 80) / 100;
        } else {
            AbstractC3305ay2.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            bu3Var.k = -9223372036854775807L;
            bu3Var.l = -9223372036854775807L;
        }
    }

    public final long a(long j) {
        long j2;
        if (this.p != -1 && this.a.g()) {
            long jC = this.a.c();
            long j3 = this.q + ((long) ((jC * (this.m - this.p)) / this.i));
            if (Math.abs(j - j3) > 20000000) {
                l();
            } else {
                j = j3;
            }
        }
        this.n = this.m;
        this.o = j;
        au3 au3Var = this.c;
        if (au3Var != null && this.k != -9223372036854775807L) {
            long j4 = au3Var.B;
            if (j4 != -9223372036854775807L) {
                long j5 = this.k;
                long j6 = j4 + (((j - j4) / j5) * j5);
                if (j <= j6) {
                    j2 = j6 - j5;
                } else {
                    long j7 = j5 + j6;
                    j2 = j6;
                    j6 = j7;
                }
                long j8 = this.l;
                if (j6 - j >= j - j2) {
                    j6 = j2;
                }
                return j6 - j8;
            }
        }
        return j;
    }

    public final void c(float f) {
        this.f = f;
        this.a.f();
        m();
    }

    public final void d(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.a.e(j * 1000);
        m();
    }

    public final void e(float f) {
        this.i = f;
        l();
        n(false);
    }

    public final void f() {
        l();
    }

    public final void g() {
        this.d = true;
        l();
        if (this.b != null) {
            au3 au3Var = this.c;
            au3Var.getClass();
            au3Var.b();
            this.b.a(new Tt3(this));
        }
        n(false);
    }

    public final void h() {
        this.d = false;
        Xt3 xt3 = this.b;
        if (xt3 != null) {
            xt3.zza();
            au3 au3Var = this.c;
            au3Var.getClass();
            au3Var.c();
        }
        k();
    }

    public final void i(Surface surface) {
        int i = AbstractC9004vJ2.a;
        boolean zA = Ut3.a(surface);
        Surface surface2 = this.e;
        if (true == zA) {
            surface = null;
        }
        if (surface2 == surface) {
            return;
        }
        k();
        this.e = surface;
        n(true);
    }

    public final void j(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        n(true);
    }

    public final void k() {
        Surface surface;
        if (AbstractC9004vJ2.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        Wt3.a(surface, 0.0f);
    }

    public final void l() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public final void m() {
        if (AbstractC9004vJ2.a < 30 || this.e == null) {
            return;
        }
        float fA = this.a.g() ? this.a.a() : this.f;
        float f = this.g;
        if (fA == f) {
            return;
        }
        if (fA != -1.0f && f != -1.0f) {
            float f2 = 1.0f;
            if (this.a.g() && this.a.d() >= 5000000000L) {
                f2 = 0.02f;
            }
            if (Math.abs(fA - this.g) < f2) {
                return;
            }
        } else if (fA == -1.0f && this.a.b() < 30) {
            return;
        }
        this.g = fA;
        n(false);
    }

    public final void n(boolean z) {
        Surface surface;
        if (AbstractC9004vJ2.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = this.i * f2;
            }
        }
        if (z || this.h != f) {
            this.h = f;
            Wt3.a(surface, f);
        }
    }
}
