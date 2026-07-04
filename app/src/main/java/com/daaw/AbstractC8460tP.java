package com.daaw;

/* JADX INFO: renamed from: com.daaw.tP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8460tP extends AbstractC5178hg0 {
    public final AbstractC5178hg0 a;

    public AbstractC8460tP(AbstractC5178hg0 abstractC5178hg0) {
        this.a = abstractC5178hg0;
    }

    @Override // com.daaw.AbstractC3515bk
    public String a() {
        return this.a.a();
    }

    @Override // com.daaw.AbstractC3515bk
    public AbstractC1699Nl e(C6882nk0 c6882nk0, C1168Ii c1168Ii) {
        return this.a.e(c6882nk0, c1168Ii);
    }

    @Override // com.daaw.AbstractC5178hg0
    public void i() {
        this.a.i();
    }

    @Override // com.daaw.AbstractC5178hg0
    public EnumC1304Jq j(boolean z) {
        return this.a.j(z);
    }

    @Override // com.daaw.AbstractC5178hg0
    public void k(EnumC1304Jq enumC1304Jq, Runnable runnable) {
        this.a.k(enumC1304Jq, runnable);
    }

    @Override // com.daaw.AbstractC5178hg0
    public AbstractC5178hg0 l() {
        return this.a.l();
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", this.a).toString();
    }
}
