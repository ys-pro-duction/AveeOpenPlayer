package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes.dex */
public class FN implements InterfaceC1385Kk0, InterfaceC1696Nk0 {
    public final NQ B;
    public final NQ C;
    public final C6732nB0 D;
    public FN E;

    public FN(NQ nq, NQ nq2, C6732nB0 c6732nB0) {
        G10.g(c6732nB0, SubscriberAttributeKt.JSON_NAME_KEY);
        this.B = nq;
        this.C = nq2;
        this.D = c6732nB0;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final boolean c(EN en) {
        NQ nq = this.B;
        if (nq != null && ((Boolean) nq.invoke(en)).booleanValue()) {
            return true;
        }
        FN fn = this.E;
        if (fn != null) {
            return fn.c(en);
        }
        return false;
    }

    public final boolean d(EN en) {
        G10.g(en, "event");
        return h(en) || c(en);
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        G10.g(interfaceC1904Pk0, "scope");
        this.E = (FN) interfaceC1904Pk0.a(getKey());
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
        return this.D;
    }

    public final boolean h(EN en) {
        FN fn = this.E;
        if (fn != null && fn.h(en)) {
            return true;
        }
        NQ nq = this.C;
        if (nq != null) {
            return ((Boolean) nq.invoke(en)).booleanValue();
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1696Nk0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FN getValue() {
        return this;
    }
}
