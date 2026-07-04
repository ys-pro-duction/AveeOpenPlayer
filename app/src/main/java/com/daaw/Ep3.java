package com.daaw;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ep3 extends AbstractC7468pp3 {
    public final HashMap h = new HashMap();
    public Handler i;
    public InterfaceC3917d93 j;

    public final void A(final Object obj, Xp3 xp3) {
        AbstractC6048km2.d(!this.h.containsKey(obj));
        Wp3 wp3 = new Wp3() { // from class: com.daaw.Bp3
            @Override // com.daaw.Wp3
            public final void a(Xp3 xp32, AbstractC8657u52 abstractC8657u52) {
                this.a.z(obj, xp32, abstractC8657u52);
            }
        };
        Cp3 cp3 = new Cp3(this, obj);
        this.h.put(obj, new Dp3(xp3, wp3, cp3));
        Handler handler = this.i;
        handler.getClass();
        xp3.d(handler, cp3);
        Handler handler2 = this.i;
        handler2.getClass();
        xp3.n(handler2, cp3);
        xp3.m(wp3, this.j, o());
        if (y()) {
            return;
        }
        xp3.c(wp3);
    }

    public int B(Object obj, int i) {
        return 0;
    }

    public abstract Vp3 D(Object obj, Vp3 vp3);

    @Override // com.daaw.AbstractC7468pp3
    public final void t() {
        for (Dp3 dp3 : this.h.values()) {
            dp3.a.c(dp3.b);
        }
    }

    @Override // com.daaw.AbstractC7468pp3
    public final void u() {
        for (Dp3 dp3 : this.h.values()) {
            dp3.a.l(dp3.b);
        }
    }

    @Override // com.daaw.AbstractC7468pp3
    public void v(InterfaceC3917d93 interfaceC3917d93) {
        this.j = interfaceC3917d93;
        this.i = AbstractC9004vJ2.H(null);
    }

    @Override // com.daaw.AbstractC7468pp3
    public void x() {
        for (Dp3 dp3 : this.h.values()) {
            dp3.a.f(dp3.b);
            dp3.a.e(dp3.c);
            dp3.a.j(dp3.c);
        }
        this.h.clear();
    }

    public abstract void z(Object obj, Xp3 xp3, AbstractC8657u52 abstractC8657u52);

    @Override // com.daaw.Xp3
    public void zzz() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((Dp3) it.next()).a.zzz();
        }
    }

    public long C(Object obj, long j) {
        return j;
    }
}
