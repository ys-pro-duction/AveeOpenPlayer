package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Cp3 implements InterfaceC6915nq3, InterfaceC8573tn3 {
    public final Object a;
    public C6636mq3 b;
    public C8015rn3 c;
    public final /* synthetic */ Ep3 d;

    public Cp3(Ep3 ep3, Object obj) {
        this.d = ep3;
        this.b = ep3.r(null);
        this.c = ep3.p(null);
        this.a = obj;
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void G(int i, Vp3 vp3, Rp3 rp3) {
        if (b(0, vp3)) {
            this.b.c(a(rp3));
        }
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void I(int i, Vp3 vp3, Mp3 mp3, Rp3 rp3) {
        if (b(0, vp3)) {
            this.b.g(mp3, a(rp3));
        }
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void T(int i, Vp3 vp3, Mp3 mp3, Rp3 rp3, IOException iOException, boolean z) {
        if (b(0, vp3)) {
            this.b.f(mp3, a(rp3), iOException, z);
        }
    }

    public final Rp3 a(Rp3 rp3) {
        Ep3 ep3 = this.d;
        Object obj = this.a;
        long j = rp3.c;
        ep3.C(obj, j);
        Ep3 ep32 = this.d;
        Object obj2 = this.a;
        long j2 = rp3.d;
        ep32.C(obj2, j2);
        return (j == rp3.c && j2 == rp3.d) ? rp3 : new Rp3(1, rp3.a, rp3.b, 0, null, j, j2);
    }

    public final boolean b(int i, Vp3 vp3) {
        Vp3 vp3D;
        if (vp3 != null) {
            vp3D = this.d.D(this.a, vp3);
            if (vp3D == null) {
                return false;
            }
        } else {
            vp3D = null;
        }
        this.d.B(this.a, 0);
        C6636mq3 c6636mq3 = this.b;
        int i2 = c6636mq3.a;
        if (!AbstractC9004vJ2.e(c6636mq3.b, vp3D)) {
            this.b = this.d.s(0, vp3D);
        }
        C8015rn3 c8015rn3 = this.c;
        int i3 = c8015rn3.a;
        if (AbstractC9004vJ2.e(c8015rn3.b, vp3D)) {
            return true;
        }
        this.c = this.d.q(0, vp3D);
        return true;
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void t(int i, Vp3 vp3, Mp3 mp3, Rp3 rp3) {
        if (b(0, vp3)) {
            this.b.d(mp3, a(rp3));
        }
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void x(int i, Vp3 vp3, Mp3 mp3, Rp3 rp3) {
        if (b(0, vp3)) {
            this.b.e(mp3, a(rp3));
        }
    }
}
