package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.pU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7368pU2 extends AbstractC5697jX2 {
    public C7368pU2() {
        super(C3872d03.class, new C6810nU2(InterfaceC5681jT2.class));
    }

    @Override // com.daaw.AbstractC5697jX2
    public final AbstractC5417iX2 a() {
        return new C7089oU2(this, C4718g03.class);
    }

    @Override // com.daaw.AbstractC5697jX2
    public final EnumC6686n13 b() {
        return EnumC6686n13.SYMMETRIC;
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* synthetic */ U43 c(AbstractC9213w33 abstractC9213w33) {
        return C3872d03.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* bridge */ /* synthetic */ void e(U43 u43) throws GeneralSecurityException {
        C3872d03 c3872d03 = (C3872d03) u43;
        W23.b(c3872d03.M(), 0);
        new HU2();
        HU2.l(c3872d03.Q());
        new WY2();
        WY2.m(c3872d03.R());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final int f() {
        return 2;
    }
}
