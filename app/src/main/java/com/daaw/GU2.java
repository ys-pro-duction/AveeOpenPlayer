package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class GU2 extends AbstractC5417iX2 {
    public final /* synthetic */ HU2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GU2(HU2 hu2, Class cls) {
        super(cls);
        this.b = hu2;
    }

    public static final C6681n03 f(C7518q03 c7518q03) {
        C6402m03 c6402m03N = C6681n03.N();
        c6402m03N.o(c7518q03.R());
        byte[] bArrB = AbstractC3181aY2.b(c7518q03.M());
        c6402m03N.n(AbstractC9213w33.T(bArrB, 0, bArrB.length));
        c6402m03N.p(0);
        return (C6681n03) c6402m03N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        return f((C7518q03) u43);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return C7518q03.Q(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void d(C7518q03 c7518q03) throws GeneralSecurityException {
        W23.a(c7518q03.M());
        HU2 hu2 = this.b;
        HU2.m(c7518q03.R());
    }
}
