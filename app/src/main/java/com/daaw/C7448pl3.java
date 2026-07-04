package com.daaw;

import android.media.AudioTrack;

/* JADX INFO: renamed from: com.daaw.pl3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7448pl3 {
    public final C6890nl3 a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public C7448pl3(AudioTrack audioTrack) {
        int i = AbstractC9004vJ2.a;
        this.a = new C6890nl3(audioTrack);
        h(0);
    }

    public final long a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final void c() {
        if (this.b == 4) {
            h(0);
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.b == 2;
    }

    public final boolean g(long j) {
        if (j - this.e < this.d) {
            return false;
        }
        C6890nl3 c6890nl3 = this.a;
        this.e = j;
        boolean zC = c6890nl3.c();
        int i = this.b;
        if (i == 0) {
            if (!zC) {
                if (j - this.c <= 500000) {
                    return false;
                }
                h(3);
                return false;
            }
            if (this.a.b() < this.c) {
                return false;
            }
            this.f = this.a.a();
            h(1);
            return true;
        }
        if (i == 1) {
            if (!zC) {
                h(0);
                return false;
            }
            if (this.a.a() <= this.f) {
                return true;
            }
            h(2);
            return true;
        }
        if (i == 2) {
            if (zC) {
                return true;
            }
            h(0);
            return false;
        }
        if (i != 3) {
            return zC;
        }
        if (!zC) {
            return false;
        }
        h(0);
        return true;
    }

    public final void h(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.d = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}
