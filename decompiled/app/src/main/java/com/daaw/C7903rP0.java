package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.rP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7903rP0 implements InterfaceC7625qP0 {
    public static final a D = new a(null);
    public static AtomicInteger E = new AtomicInteger(0);
    public final int B;
    public final C6788nP0 C;

    /* JADX INFO: renamed from: com.daaw.rP0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return C7903rP0.E.addAndGet(1);
        }

        public a() {
        }
    }

    public C7903rP0(int i, boolean z, boolean z2, NQ nq) {
        G10.g(nq, DiagnosticsEntry.Event.PROPERTIES_KEY);
        this.B = i;
        C6788nP0 c6788nP0 = new C6788nP0();
        c6788nP0.H(z);
        c6788nP0.G(z2);
        nq.invoke(c6788nP0);
        this.C = c6788nP0;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.InterfaceC7625qP0
    public C6788nP0 M() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7903rP0)) {
            return false;
        }
        C7903rP0 c7903rP0 = (C7903rP0) obj;
        return getId() == c7903rP0.getId() && G10.c(M(), c7903rP0.M());
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    @Override // com.daaw.InterfaceC7625qP0
    public int getId() {
        return this.B;
    }

    public int hashCode() {
        return (M().hashCode() * 31) + getId();
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
