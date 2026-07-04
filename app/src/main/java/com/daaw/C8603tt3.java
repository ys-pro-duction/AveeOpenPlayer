package com.daaw;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.tt3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8603tt3 implements InterfaceC2665Wm1, InterfaceC3766ce2 {
    public final Context a;
    public final InterfaceC2457Um1 b;
    public final C5829jz2 c = new C5829jz2(16);
    public final GH2 d = new GH2(10);
    public final GH2 e = new GH2(10);
    public final Handler f;
    public final ArrayList g;
    public InterfaceC2353Tm1 h;
    public Executor i;
    public St3 j;
    public C2485Ut1 k;
    public Pair l;
    public final C2326Tf2 m;
    public final C2326Tf2 n;
    public boolean o;

    public C8603tt3(Context context, InterfaceC9645xd2 interfaceC9645xd2, InterfaceC2457Um1 interfaceC2457Um1, C2485Ut1 c2485Ut1) {
        Ho3 ho3;
        Ho3 ho3D;
        int i;
        int i2;
        this.a = context;
        this.b = interfaceC2457Um1;
        AbstractC9004vJ2.g(context);
        C2326Tf2 c2326Tf2 = C2326Tf2.e;
        this.m = c2326Tf2;
        this.n = c2326Tf2;
        final Handler handlerH = AbstractC9004vJ2.H(null);
        this.f = handlerH;
        Ho3 ho32 = c2485Ut1.x;
        if (ho32 == null || ((i2 = ho32.c) != 7 && i2 != 6)) {
            ho32 = Ho3.f;
        }
        if (ho32.c == 7) {
            Cn3 cn3C = ho32.c();
            cn3C.c(6);
            ho3D = cn3C.d();
            ho3 = ho32;
        } else {
            ho3 = ho32;
            ho3D = ho3;
        }
        interfaceC9645xd2.a(context, Jq3.a, ho3, ho3D, false, new Executor() { // from class: com.daaw.rt3
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handlerH.post(runnable);
            }
        }, this);
        Pair pair = this.l;
        if (pair != null) {
            throw null;
        }
        this.g = new ArrayList();
        if (AbstractC9004vJ2.a >= 21 || (i = c2485Ut1.t) == 0) {
            return;
        }
        AbstractC8324st3.a(i);
    }

    @Override // com.daaw.InterfaceC2665Wm1
    public final void a(int i, C2485Ut1 c2485Ut1) {
        this.k = c2485Ut1;
        f();
    }

    @Override // com.daaw.InterfaceC2665Wm1
    public final void b(InterfaceC2353Tm1 interfaceC2353Tm1, Executor executor) {
        if (AbstractC9004vJ2.e(this.h, interfaceC2353Tm1)) {
            AbstractC6048km2.f(AbstractC9004vJ2.e(this.i, executor));
        } else {
            this.h = interfaceC2353Tm1;
            this.i = executor;
        }
    }

    public final void c(Surface surface, NE2 ne2) {
        Pair pair = this.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((NE2) this.l.second).equals(ne2)) {
            return;
        }
        Pair pair2 = this.l;
        boolean z = true;
        if (pair2 != null && !((Surface) pair2.first).equals(surface)) {
            z = false;
        }
        this.o = z;
        this.l = Pair.create(surface, ne2);
        throw null;
    }

    public final void d(List list) {
        this.g.clear();
        this.g.addAll(list);
        f();
    }

    public final void e(St3 st3) {
        this.j = st3;
    }

    public final void f() {
        if (this.k == null) {
            return;
        }
        new ArrayList().addAll(this.g);
        this.k.getClass();
        throw null;
    }

    @Override // com.daaw.InterfaceC2665Wm1
    public final boolean zzf() {
        return AbstractC9004vJ2.g(this.a);
    }

    @Override // com.daaw.InterfaceC2665Wm1
    public final boolean zzg() {
        return this.o;
    }
}
