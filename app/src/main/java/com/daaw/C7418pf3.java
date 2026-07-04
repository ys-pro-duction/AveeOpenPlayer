package com.daaw;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.pf3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7418pf3 implements InterfaceC6915nq3, InterfaceC8573tn3 {
    public final C9098vf3 a;
    public final /* synthetic */ Bf3 b;

    public C7418pf3(Bf3 bf3, C9098vf3 c9098vf3) {
        this.b = bf3;
        this.a = c9098vf3;
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void G(int i, Vp3 vp3, final Rp3 rp3) {
        final Pair pairA = a(0, vp3);
        if (pairA != null) {
            this.b.i.f(new Runnable() { // from class: com.daaw.jf3
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.B.b.h.G(((Integer) pair.first).intValue(), (Vp3) pair.second, rp3);
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void I(int i, Vp3 vp3, final Mp3 mp3, final Rp3 rp3) {
        final Pair pairA = a(0, vp3);
        if (pairA != null) {
            this.b.i.f(new Runnable() { // from class: com.daaw.hf3
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.B.b.h.I(((Integer) pair.first).intValue(), (Vp3) pair.second, mp3, rp3);
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void T(int i, Vp3 vp3, final Mp3 mp3, final Rp3 rp3, final IOException iOException, final boolean z) {
        final Pair pairA = a(0, vp3);
        if (pairA != null) {
            this.b.i.f(new Runnable() { // from class: com.daaw.bf3
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.B.b.h.T(((Integer) pair.first).intValue(), (Vp3) pair.second, mp3, rp3, iOException, z);
                }
            });
        }
    }

    public final Pair a(int i, Vp3 vp3) {
        Vp3 vp3A;
        Vp3 vp32 = null;
        if (vp3 != null) {
            C9098vf3 c9098vf3 = this.a;
            int i2 = 0;
            while (true) {
                if (i2 >= c9098vf3.c.size()) {
                    vp3A = null;
                    break;
                }
                if (((Vp3) c9098vf3.c.get(i2)).d == vp3.d) {
                    vp3A = vp3.a(Pair.create(c9098vf3.b, vp3.a));
                    break;
                }
                i2++;
            }
            if (vp3A == null) {
                return null;
            }
            vp32 = vp3A;
        }
        return Pair.create(Integer.valueOf(this.a.d), vp32);
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void t(int i, Vp3 vp3, final Mp3 mp3, final Rp3 rp3) {
        final Pair pairA = a(0, vp3);
        if (pairA != null) {
            this.b.i.f(new Runnable() { // from class: com.daaw.ef3
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.B.b.h.t(((Integer) pair.first).intValue(), (Vp3) pair.second, mp3, rp3);
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void x(int i, Vp3 vp3, final Mp3 mp3, final Rp3 rp3) {
        final Pair pairA = a(0, vp3);
        if (pairA != null) {
            this.b.i.f(new Runnable() { // from class: com.daaw.mf3
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairA;
                    this.B.b.h.x(((Integer) pair.first).intValue(), (Vp3) pair.second, mp3, rp3);
                }
            });
        }
    }
}
