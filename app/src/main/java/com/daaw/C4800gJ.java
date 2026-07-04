package com.daaw;

import com.daaw.C9632xb;
import java.util.Date;

/* JADX INFO: renamed from: com.daaw.gJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4800gJ {
    public final C9632xb a;
    public final C9632xb.d b;
    public final long c;
    public final double d;
    public final long e;
    public long f;
    public long g;
    public long h = new Date().getTime();
    public C9632xb.b i;

    public C4800gJ(C9632xb c9632xb, C9632xb.d dVar, long j, double d, long j2) {
        this.a = c9632xb;
        this.b = dVar;
        this.c = j;
        this.d = d;
        this.e = j2;
        this.f = j2;
        e();
    }

    public static /* synthetic */ void a(C4800gJ c4800gJ, Runnable runnable) {
        c4800gJ.getClass();
        c4800gJ.h = new Date().getTime();
        runnable.run();
    }

    public void b(final Runnable runnable) {
        c();
        long jD = this.g + d();
        long jMax = Math.max(0L, new Date().getTime() - this.h);
        long jMax2 = Math.max(0L, jD - jMax);
        if (this.g > 0) {
            AbstractC2212Sd0.a(getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(jMax2), Long.valueOf(this.g), Long.valueOf(jD), Long.valueOf(jMax));
        }
        this.i = this.a.h(this.b, jMax2, new Runnable() { // from class: com.daaw.fJ
            @Override // java.lang.Runnable
            public final void run() {
                C4800gJ.a(this.B, runnable);
            }
        });
        long j = (long) (this.g * this.d);
        this.g = j;
        long j2 = this.c;
        if (j < j2) {
            this.g = j2;
        } else {
            long j3 = this.f;
            if (j > j3) {
                this.g = j3;
            }
        }
        this.f = this.e;
    }

    public void c() {
        C9632xb.b bVar = this.i;
        if (bVar != null) {
            bVar.c();
            this.i = null;
        }
    }

    public final long d() {
        return (long) ((Math.random() - 0.5d) * this.g);
    }

    public void e() {
        this.g = 0L;
    }

    public void f() {
        this.g = this.f;
    }

    public void g(long j) {
        this.f = j;
    }
}
