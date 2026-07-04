package com.daaw;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.daaw.mq3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6636mq3 {
    public final int a;
    public final Vp3 b;
    public final CopyOnWriteArrayList c;

    public C6636mq3(CopyOnWriteArrayList copyOnWriteArrayList, int i, Vp3 vp3) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = vp3;
    }

    public final C6636mq3 a(int i, Vp3 vp3) {
        return new C6636mq3(this.c, 0, vp3);
    }

    public final void b(Handler handler, InterfaceC6915nq3 interfaceC6915nq3) {
        this.c.add(new C6357lq3(handler, interfaceC6915nq3));
    }

    public final void c(final Rp3 rp3) {
        for (C6357lq3 c6357lq3 : this.c) {
            final InterfaceC6915nq3 interfaceC6915nq3 = c6357lq3.b;
            AbstractC9004vJ2.i(c6357lq3.a, new Runnable() { // from class: com.daaw.Yp3
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC6915nq3.G(0, this.B.b, rp3);
                }
            });
        }
    }

    public final void d(final Mp3 mp3, final Rp3 rp3) {
        for (C6357lq3 c6357lq3 : this.c) {
            final InterfaceC6915nq3 interfaceC6915nq3 = c6357lq3.b;
            AbstractC9004vJ2.i(c6357lq3.a, new Runnable() { // from class: com.daaw.kq3
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC6915nq3.t(0, this.B.b, mp3, rp3);
                }
            });
        }
    }

    public final void e(final Mp3 mp3, final Rp3 rp3) {
        for (C6357lq3 c6357lq3 : this.c) {
            final InterfaceC6915nq3 interfaceC6915nq3 = c6357lq3.b;
            AbstractC9004vJ2.i(c6357lq3.a, new Runnable() { // from class: com.daaw.iq3
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC6915nq3.x(0, this.B.b, mp3, rp3);
                }
            });
        }
    }

    public final void f(final Mp3 mp3, final Rp3 rp3, final IOException iOException, final boolean z) {
        for (C6357lq3 c6357lq3 : this.c) {
            final InterfaceC6915nq3 interfaceC6915nq3 = c6357lq3.b;
            AbstractC9004vJ2.i(c6357lq3.a, new Runnable() { // from class: com.daaw.jq3
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC6915nq3.T(0, this.B.b, mp3, rp3, iOException, z);
                }
            });
        }
    }

    public final void g(final Mp3 mp3, final Rp3 rp3) {
        for (C6357lq3 c6357lq3 : this.c) {
            final InterfaceC6915nq3 interfaceC6915nq3 = c6357lq3.b;
            AbstractC9004vJ2.i(c6357lq3.a, new Runnable() { // from class: com.daaw.hq3
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC6915nq3.I(0, this.B.b, mp3, rp3);
                }
            });
        }
    }

    public final void h(InterfaceC6915nq3 interfaceC6915nq3) {
        for (C6357lq3 c6357lq3 : this.c) {
            if (c6357lq3.b == interfaceC6915nq3) {
                this.c.remove(c6357lq3);
            }
        }
    }

    public C6636mq3() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
