package com.daaw.avee.comp.playback;

import android.os.Handler;
import android.os.Message;
import android.view.SurfaceHolder;
import com.daaw.AbstractC0405Bb1;
import com.daaw.InterfaceC7377pX;
import com.daaw.UI;
import com.daaw.avee.comp.playback.b;
import com.daaw.avee.comp.playback.e;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public e a;
    public e.b b;
    public int c = 0;
    public int d = 0;
    public long e = 80;
    public float f = 0.25f;
    public float g = ((80 + 10) * 0.001f) / 0.25f;
    public long h = 300;
    public long i = -1;
    public b j = new b(this);

    public class a implements e.b {
        public a() {
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void a(boolean z, String str) {
            d.this.b.a(z, str);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void b() {
            d.this.b.b();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void c(b.C0153b c0153b) {
            d.this.b.c(c0153b);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public b.c d(String str) {
            return d.this.b.d(str);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public boolean e(String str) {
            return d.this.b.e(str);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void f(boolean z) {
            d.this.b.f(z);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void g(boolean z) {
            if (d.this.j.hasMessages(5) || d.this.j.hasMessages(6) || d.this.j.hasMessages(7)) {
                return;
            }
            d.this.b.g(z);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public boolean h() {
            return d.this.b.h();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void i(int i, int i2, float f) {
            d.this.b.i(i, i2, f);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void j(boolean z, int i) {
            d.this.b.j(z, i);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void k(UI ui) {
            d.this.b.k(ui);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public int l() {
            return d.this.b.l();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void m(long j) {
            d.this.b.m(j);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public SurfaceHolder n() {
            return d.this.b.n();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void o() {
            if (d.this.j.hasMessages(5) || d.this.j.hasMessages(6) || d.this.j.hasMessages(7)) {
                return;
            }
            d.this.b.o();
        }
    }

    public static class b extends Handler {
        public WeakReference a;

        public b(d dVar) {
            this.a = new WeakReference(dVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d dVar = (d) this.a.get();
            if (dVar == null) {
                return;
            }
            float f = ((dVar.e + 10) * 0.001f) / (dVar.i * 0.001f);
            switch (message.what) {
                case 2:
                    if (dVar.c == 1) {
                        if (dVar.a.t(-dVar.g, 0)) {
                            dVar.a.stop();
                            dVar.c = 0;
                        }
                    } else if (dVar.c == 2) {
                        if (dVar.a.t(-dVar.g, 0)) {
                            dVar.a.b();
                            dVar.c = 0;
                        }
                    } else if (dVar.c == 3) {
                        if (dVar.a.t(dVar.g, 0)) {
                            dVar.c = 0;
                        }
                    } else if (dVar.c != 4 && dVar.c == 5 && dVar.a.t(f, 0)) {
                        dVar.c = 0;
                    }
                    if (dVar.c != 0) {
                        sendMessageDelayed(obtainMessage(2), dVar.e);
                    }
                    break;
                case 3:
                    if (dVar.d == 4) {
                        if (dVar.a.t(-dVar.g, 1)) {
                            dVar.a.v();
                            dVar.d = 0;
                        }
                    } else if (dVar.d == 5) {
                        dVar.d = 0;
                    } else if (dVar.d == 6 && dVar.a.t(-f, 1)) {
                        dVar.a.v();
                        dVar.d = 0;
                    }
                    if (dVar.d != 0) {
                        sendMessageDelayed(obtainMessage(3), dVar.e);
                    }
                    break;
                case 4:
                    if (dVar.i >= 0) {
                        long jK = dVar.a.k();
                        long jL = dVar.a.l();
                        long j = jL - jK;
                        if (jL > dVar.i + 1500 && j <= dVar.i + 1500) {
                            dVar.b.m(AbstractC0405Bb1.F() + ((j - dVar.i) - 10));
                        } else {
                            sendMessageDelayed(obtainMessage(4), dVar.h);
                        }
                    }
                    break;
                case 5:
                    dVar.B();
                    dVar.q();
                    break;
                case 6:
                    dVar.C();
                    dVar.p();
                    break;
                case 7:
                    dVar.u();
                    break;
            }
        }
    }

    public d(e eVar, e.b bVar, long j) {
        this.a = eVar;
        this.b = bVar;
        A(j);
        eVar.q(new a());
    }

    public void A(long j) {
        this.i = j;
    }

    public final void B() {
        this.c = 5;
        this.a.start();
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public final void C() {
        this.c = 3;
        this.a.start();
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public void D() {
        C();
        r();
    }

    public final void E(InterfaceC7377pX interfaceC7377pX, boolean z, boolean z2, float f, long j) {
        this.j.removeMessages(4);
        this.j.sendMessageDelayed(this.j.obtainMessage(4), this.h);
        this.j.removeMessages(3);
        this.d = 0;
        this.c = 0;
        this.j.removeMessages(2);
        this.a.r(interfaceC7377pX);
        this.a.j(z, z2, f, j);
    }

    public void F() {
        this.a.stop();
    }

    public final void G() {
        this.c = 1;
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public void H() {
        G();
        r();
    }

    public final void p() {
        this.a.v();
    }

    public void q() {
        this.j.removeMessages(3);
        this.d = 6;
        this.j.sendMessageDelayed(this.j.obtainMessage(3), this.e);
    }

    public void r() {
        this.j.removeMessages(3);
        this.d = 4;
        this.j.sendMessageDelayed(this.j.obtainMessage(3), this.e);
    }

    public e s() {
        return this.a;
    }

    public final void t() {
        this.c = 5;
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public final void u() {
        this.a.start();
    }

    public final void v() {
        this.c = 2;
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public void w() {
        v();
        r();
    }

    public void x(InterfaceC7377pX interfaceC7377pX, boolean z, long j) {
        this.j.removeMessages(5);
        this.j.removeMessages(6);
        this.j.removeMessages(7);
        long j2 = this.i;
        if (j2 < 0 || j2 <= this.h) {
            E(interfaceC7377pX, true, z, 1.0f, j);
            p();
        } else {
            E(interfaceC7377pX, false, z, 0.0f, j);
            t();
            q();
        }
    }

    public void y(InterfaceC7377pX interfaceC7377pX, boolean z, long j, long j2) {
        this.j.removeMessages(5);
        this.j.removeMessages(6);
        this.j.removeMessages(7);
        long jF = j2 - AbstractC0405Bb1.F();
        if (j2 <= 0 || jF <= 0) {
            x(interfaceC7377pX, z, j);
            return;
        }
        long j3 = this.i;
        if (j3 >= 0 && j3 > this.h) {
            E(interfaceC7377pX, false, false, 0.0f, j);
            if (z) {
                this.j.sendMessageAtTime(this.j.obtainMessage(5), j2);
                return;
            }
            return;
        }
        if (j3 >= 0) {
            E(interfaceC7377pX, false, false, 1.0f, j);
            if (z) {
                this.j.sendMessageAtTime(this.j.obtainMessage(7), j2);
                return;
            }
            return;
        }
        E(interfaceC7377pX, true, false, 1.0f, j);
        if (z) {
            this.j.sendMessageAtTime(this.j.obtainMessage(7), j2);
        }
    }

    public void z() {
        this.j.removeCallbacksAndMessages(null);
        this.a.a();
        this.a = null;
    }
}
