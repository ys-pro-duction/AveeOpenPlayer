package com.daaw;

import com.daaw.AbstractC4512fJ0;

/* JADX INFO: renamed from: com.daaw.hJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5080hJ0 extends AbstractC3610c40 {
    public final C4067dj F;

    public C5080hJ0(C4067dj c4067dj) {
        this.F = c4067dj;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        w((Throwable) obj);
        return G91.a;
    }

    @Override // com.daaw.AbstractC2251Sn
    public void w(Throwable th) {
        Object objA0 = x().a0();
        if (objA0 instanceof C2041Qn) {
            C4067dj c4067dj = this.F;
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            c4067dj.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(((C2041Qn) objA0).a)));
        } else {
            C4067dj c4067dj2 = this.F;
            AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
            c4067dj2.x(AbstractC4512fJ0.a(AbstractC4167e40.h(objA0)));
        }
    }
}
