package com.daaw;

import com.daaw.InterfaceC2971Zl;
import com.daaw.TX0;

/* JADX INFO: renamed from: com.daaw.mP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6508mP implements InterfaceC2971Zl {
    @Override // com.daaw.TX0
    public void a(TX0.a aVar) {
        e().a(aVar);
    }

    @Override // com.daaw.InterfaceC2971Zl
    public void b(C2756Xj0 c2756Xj0) {
        e().b(c2756Xj0);
    }

    @Override // com.daaw.InterfaceC2971Zl
    public void c(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
        e().c(c6262lX0, aVar, c2756Xj0);
    }

    @Override // com.daaw.TX0
    public void d() {
        e().d();
    }

    public abstract InterfaceC2971Zl e();

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", e()).toString();
    }
}
