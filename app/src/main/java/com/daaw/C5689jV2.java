package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.jV2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5689jV2 extends AbstractC5697jX2 {
    public C5689jV2() {
        super(F03.class, new C5130hV2(InterfaceC5681jT2.class));
    }

    @Override // com.daaw.AbstractC5697jX2
    public final AbstractC5417iX2 a() {
        return new C5409iV2(this, I03.class);
    }

    @Override // com.daaw.AbstractC5697jX2
    public final EnumC6686n13 b() {
        return EnumC6686n13.SYMMETRIC;
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* synthetic */ U43 c(AbstractC9213w33 abstractC9213w33) {
        return F03.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* bridge */ /* synthetic */ void e(U43 u43) throws GeneralSecurityException {
        F03 f03 = (F03) u43;
        W23.b(f03.M(), 0);
        W23.a(f03.Q().y());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final int f() {
        return 2;
    }
}
