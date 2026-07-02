package com.daaw;

import com.daaw.AbstractC0304Ac0;

/* JADX INFO: renamed from: com.daaw.rP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7902rP extends AbstractC0304Ac0 {
    @Override // com.daaw.AbstractC0304Ac0
    public boolean b() {
        return g().b();
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void c(C6262lX0 c6262lX0) {
        g().c(c6262lX0);
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void d(AbstractC0304Ac0.g gVar) {
        g().d(gVar);
    }

    @Override // com.daaw.AbstractC0304Ac0
    public void e() {
        g().e();
    }

    public abstract AbstractC0304Ac0 g();

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", g()).toString();
    }
}
