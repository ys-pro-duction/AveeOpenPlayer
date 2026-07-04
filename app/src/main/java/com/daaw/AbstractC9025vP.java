package com.daaw;

import com.daaw.AbstractC2560Vm0;

/* JADX INFO: renamed from: com.daaw.vP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9025vP extends AbstractC2560Vm0 {
    public final AbstractC2560Vm0 a;

    public AbstractC9025vP(AbstractC2560Vm0 abstractC2560Vm0) {
        AbstractC7785qy0.o(abstractC2560Vm0, "delegate can not be null");
        this.a = abstractC2560Vm0;
    }

    @Override // com.daaw.AbstractC2560Vm0
    public void b() {
        this.a.b();
    }

    @Override // com.daaw.AbstractC2560Vm0
    public void c() {
        this.a.c();
    }

    @Override // com.daaw.AbstractC2560Vm0
    public void d(AbstractC2560Vm0.d dVar) {
        this.a.d(dVar);
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", this.a).toString();
    }
}
