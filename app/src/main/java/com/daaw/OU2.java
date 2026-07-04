package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class OU2 extends AbstractC5697jX2 {
    public OU2() {
        super(C9198w03.class, new MU2(InterfaceC5681jT2.class));
    }

    @Override // com.daaw.AbstractC5697jX2
    public final AbstractC5417iX2 a() {
        return new NU2(this, C10035z03.class);
    }

    @Override // com.daaw.AbstractC5697jX2
    public final EnumC6686n13 b() {
        return EnumC6686n13.SYMMETRIC;
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* synthetic */ U43 c(AbstractC9213w33 abstractC9213w33) {
        return C9198w03.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* bridge */ /* synthetic */ void e(U43 u43) throws GeneralSecurityException {
        C9198w03 c9198w03 = (C9198w03) u43;
        W23.b(c9198w03.M(), 0);
        W23.a(c9198w03.R().y());
        if (c9198w03.Q().M() != 12 && c9198w03.Q().M() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
