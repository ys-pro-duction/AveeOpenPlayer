package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.cS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3714cS2 extends KR2 {
    public AbstractC3436bS2 Q;

    public C3714cS2(JP2 jp2, boolean z, Executor executor, Callable callable) {
        super(jp2, z, false);
        this.Q = new C3157aS2(this, callable, executor);
        R();
    }

    @Override // com.daaw.KR2
    public final void Q() {
        AbstractC3436bS2 abstractC3436bS2 = this.Q;
        if (abstractC3436bS2 != null) {
            abstractC3436bS2.i();
        }
    }

    @Override // com.daaw.KR2
    public final void U(int i) {
        super.U(i);
        if (i == 1) {
            this.Q = null;
        }
    }

    @Override // com.daaw.AbstractC9873yR2
    public final void s() {
        AbstractC3436bS2 abstractC3436bS2 = this.Q;
        if (abstractC3436bS2 != null) {
            abstractC3436bS2.g();
        }
    }

    @Override // com.daaw.KR2
    public final void P(int i, Object obj) {
    }
}
