package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class HU2 extends AbstractC5697jX2 {
    public HU2() {
        super(C6681n03.class, new FU2(Q23.class));
    }

    public static final void l(C6681n03 c6681n03) throws GeneralSecurityException {
        W23.b(c6681n03.M(), 0);
        W23.a(c6681n03.S().y());
        m(c6681n03.R());
    }

    public static final void m(C8354t03 c8354t03) throws GeneralSecurityException {
        if (c8354t03.M() < 12 || c8354t03.M() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.daaw.AbstractC5697jX2
    public final AbstractC5417iX2 a() {
        return new GU2(this, C7518q03.class);
    }

    @Override // com.daaw.AbstractC5697jX2
    public final EnumC6686n13 b() {
        return EnumC6686n13.SYMMETRIC;
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* synthetic */ U43 c(AbstractC9213w33 abstractC9213w33) {
        return C6681n03.Q(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* bridge */ /* synthetic */ void e(U43 u43) throws GeneralSecurityException {
        l((C6681n03) u43);
    }
}
