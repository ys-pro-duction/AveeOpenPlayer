package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.jX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5695jX0 {
    public static final C5695jX0 c = new C5695jX0(new ZX0[0]);
    public final ZX0[] a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public C5695jX0(ZX0[] zx0Arr) {
        this.a = zx0Arr;
    }

    public static C5695jX0 h(AbstractC3246am[] abstractC3246amArr, C1971Qb c1971Qb, C2756Xj0 c2756Xj0) {
        C5695jX0 c5695jX0 = new C5695jX0(abstractC3246amArr);
        for (AbstractC3246am abstractC3246am : abstractC3246amArr) {
            abstractC3246am.m(c1971Qb, c2756Xj0);
        }
        return c5695jX0;
    }

    public void a() {
        for (ZX0 zx0 : this.a) {
            ((AbstractC3246am) zx0).j();
        }
    }

    public void b(C2756Xj0 c2756Xj0) {
        for (ZX0 zx0 : this.a) {
            ((AbstractC3246am) zx0).k(c2756Xj0);
        }
    }

    public void c() {
        for (ZX0 zx0 : this.a) {
            ((AbstractC3246am) zx0).l();
        }
    }

    public void d(int i) {
        for (ZX0 zx0 : this.a) {
            zx0.a(i);
        }
    }

    public void e(int i, long j, long j2) {
        for (ZX0 zx0 : this.a) {
            zx0.b(i, j, j2);
        }
    }

    public void f(long j) {
        for (ZX0 zx0 : this.a) {
            zx0.c(j);
        }
    }

    public void g(long j) {
        for (ZX0 zx0 : this.a) {
            zx0.d(j);
        }
    }

    public void i(int i) {
        for (ZX0 zx0 : this.a) {
            zx0.e(i);
        }
    }

    public void j(int i, long j, long j2) {
        for (ZX0 zx0 : this.a) {
            zx0.f(i, j, j2);
        }
    }

    public void k(long j) {
        for (ZX0 zx0 : this.a) {
            zx0.g(j);
        }
    }

    public void l(long j) {
        for (ZX0 zx0 : this.a) {
            zx0.h(j);
        }
    }

    public void m(C6262lX0 c6262lX0) {
        if (this.b.compareAndSet(false, true)) {
            for (ZX0 zx0 : this.a) {
                zx0.i(c6262lX0);
            }
        }
    }
}
