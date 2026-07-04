package com.daaw;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class Xk3 {
    public final Handler a;
    public final Zk3 b;

    public Xk3(Handler handler, Zk3 zk3) {
        this.a = zk3 == null ? null : handler;
        this.b = zk3;
    }

    public final void a(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.sk3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.h(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.uk3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.i(exc);
                }
            });
        }
    }

    public final void c(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.Ak3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.j(str, j, j2);
                }
            });
        }
    }

    public final void d(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.Ck3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.k(str);
                }
            });
        }
    }

    public final void e(final C8787ua3 c8787ua3) {
        c8787ua3.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.Ek3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.l(c8787ua3);
                }
            });
        }
    }

    public final void f(final C8787ua3 c8787ua3) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ok3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.m(c8787ua3);
                }
            });
        }
    }

    public final void g(final C2485Ut1 c2485Ut1, final C9631xa3 c9631xa3) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.wk3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.n(c2485Ut1, c9631xa3);
                }
            });
        }
    }

    public final /* synthetic */ void h(Exception exc) {
        int i = AbstractC9004vJ2.a;
        this.b.c(exc);
    }

    public final /* synthetic */ void i(Exception exc) {
        int i = AbstractC9004vJ2.a;
        this.b.e(exc);
    }

    public final /* synthetic */ void j(String str, long j, long j2) {
        int i = AbstractC9004vJ2.a;
        this.b.d(str, j, j2);
    }

    public final /* synthetic */ void k(String str) {
        int i = AbstractC9004vJ2.a;
        this.b.l(str);
    }

    public final /* synthetic */ void l(C8787ua3 c8787ua3) {
        c8787ua3.a();
        int i = AbstractC9004vJ2.a;
        this.b.f(c8787ua3);
    }

    public final /* synthetic */ void m(C8787ua3 c8787ua3) {
        int i = AbstractC9004vJ2.a;
        this.b.h(c8787ua3);
    }

    public final /* synthetic */ void n(C2485Ut1 c2485Ut1, C9631xa3 c9631xa3) {
        int i = AbstractC9004vJ2.a;
        this.b.b(c2485Ut1, c9631xa3);
    }

    public final /* synthetic */ void o(long j) {
        int i = AbstractC9004vJ2.a;
        this.b.i(j);
    }

    public final /* synthetic */ void p(boolean z) {
        int i = AbstractC9004vJ2.a;
        this.b.a(z);
    }

    public final /* synthetic */ void q(int i, long j, long j2) {
        int i2 = AbstractC9004vJ2.a;
        this.b.g(i, j, j2);
    }

    public final void r(final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.Vk3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.o(j);
                }
            });
        }
    }

    public final void s(final boolean z) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.yk3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.p(z);
                }
            });
        }
    }

    public final void t(final int i, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.qk3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.q(i, j, j2);
                }
            });
        }
    }
}
