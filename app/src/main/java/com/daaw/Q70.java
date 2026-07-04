package com.daaw;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class Q70 implements InterfaceC1385Kk0, InterfaceC1696Nk0, InterfaceC9429wq0 {
    public final NQ B;
    public final NQ C;
    public SN D;
    public Q70 E;
    public E90 F;

    public Q70(NQ nq, NQ nq2) {
        this.B = nq;
        this.C = nq2;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final E90 a() {
        return this.F;
    }

    public final Q70 c() {
        return this.E;
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        C8565tm0 c8565tm0N;
        C8565tm0 c8565tm0N2;
        G10.g(interfaceC1904Pk0, "scope");
        SN sn = this.D;
        if (sn != null && (c8565tm0N2 = sn.n()) != null) {
            c8565tm0N2.w(this);
        }
        SN sn2 = (SN) interfaceC1904Pk0.a(TN.c());
        this.D = sn2;
        if (sn2 != null && (c8565tm0N = sn2.n()) != null) {
            c8565tm0N.d(this);
        }
        this.E = (Q70) interfaceC1904Pk0.a(R70.a());
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    @Override // com.daaw.InterfaceC1696Nk0
    public C6732nB0 getKey() {
        return R70.a();
    }

    public final boolean h(KeyEvent keyEvent) {
        SN snB;
        Q70 q70D;
        G10.g(keyEvent, "keyEvent");
        SN sn = this.D;
        if (sn == null || (snB = AbstractC5099hO.b(sn)) == null || (q70D = AbstractC5099hO.d(snB)) == null) {
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.");
        }
        if (q70D.j(keyEvent)) {
            return true;
        }
        return q70D.i(keyEvent);
    }

    public final boolean i(KeyEvent keyEvent) {
        G10.g(keyEvent, "keyEvent");
        NQ nq = this.B;
        Boolean bool = nq != null ? (Boolean) nq.invoke(I70.a(keyEvent)) : null;
        if (G10.c(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        Q70 q70 = this.E;
        if (q70 != null) {
            return q70.i(keyEvent);
        }
        return false;
    }

    public final boolean j(KeyEvent keyEvent) {
        G10.g(keyEvent, "keyEvent");
        Q70 q70 = this.E;
        Boolean boolValueOf = q70 != null ? Boolean.valueOf(q70.j(keyEvent)) : null;
        if (G10.c(boolValueOf, Boolean.TRUE)) {
            return boolValueOf.booleanValue();
        }
        NQ nq = this.C;
        if (nq != null) {
            return ((Boolean) nq.invoke(I70.a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // com.daaw.InterfaceC9429wq0
    public void o(InterfaceC7002o90 interfaceC7002o90) {
        G10.g(interfaceC7002o90, "coordinates");
        this.F = ((K90) interfaceC7002o90).X0();
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1696Nk0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Q70 getValue() {
        return this;
    }
}
