package com.daaw;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.daaw.Rm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2143Rm1 {
    public final Handler a;
    public final InterfaceC2249Sm1 b;

    public C2143Rm1(Handler handler, InterfaceC2249Sm1 interfaceC2249Sm1) {
        this.a = interfaceC2249Sm1 == null ? null : handler;
        this.b = interfaceC2249Sm1;
    }

    public final void a(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.cu3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.g(str, j, j2);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.Qm1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.h(str);
                }
            });
        }
    }

    public final void c(final C8787ua3 c8787ua3) {
        c8787ua3.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.Pm1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.i(c8787ua3);
                }
            });
        }
    }

    public final void d(final int i, final long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.eu3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.j(i, j);
                }
            });
        }
    }

    public final void e(final C8787ua3 c8787ua3) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.iu3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.k(c8787ua3);
                }
            });
        }
    }

    public final void f(final C2485Ut1 c2485Ut1, final C9631xa3 c9631xa3) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ju3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.l(c2485Ut1, c9631xa3);
                }
            });
        }
    }

    public final /* synthetic */ void g(String str, long j, long j2) {
        int i = AbstractC9004vJ2.a;
        this.b.u(str, j, j2);
    }

    public final /* synthetic */ void h(String str) {
        int i = AbstractC9004vJ2.a;
        this.b.m(str);
    }

    public final /* synthetic */ void i(C8787ua3 c8787ua3) {
        c8787ua3.a();
        int i = AbstractC9004vJ2.a;
        this.b.q(c8787ua3);
    }

    public final /* synthetic */ void j(int i, long j) {
        int i2 = AbstractC9004vJ2.a;
        this.b.o(i, j);
    }

    public final /* synthetic */ void k(C8787ua3 c8787ua3) {
        int i = AbstractC9004vJ2.a;
        this.b.n(c8787ua3);
    }

    public final /* synthetic */ void l(C2485Ut1 c2485Ut1, C9631xa3 c9631xa3) {
        int i = AbstractC9004vJ2.a;
        this.b.s(c2485Ut1, c9631xa3);
    }

    public final /* synthetic */ void m(Object obj, long j) {
        int i = AbstractC9004vJ2.a;
        this.b.v(obj, j);
    }

    public final /* synthetic */ void n(long j, int i) {
        int i2 = AbstractC9004vJ2.a;
        this.b.p(j, i);
    }

    public final /* synthetic */ void o(Exception exc) {
        int i = AbstractC9004vJ2.a;
        this.b.t(exc);
    }

    public final /* synthetic */ void p(C2326Tf2 c2326Tf2) {
        int i = AbstractC9004vJ2.a;
        this.b.r(c2326Tf2);
    }

    public final void q(final Object obj) {
        Handler handler = this.a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.daaw.fu3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.m(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j, final int i) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.gu3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.n(j, i);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.hu3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.o(exc);
                }
            });
        }
    }

    public final void t(final C2326Tf2 c2326Tf2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.du3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.p(c2326Tf2);
                }
            });
        }
    }
}
