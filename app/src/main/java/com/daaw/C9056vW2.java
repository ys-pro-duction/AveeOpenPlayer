package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.vW2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9056vW2 extends AbstractC5697jX2 {
    public C9056vW2() {
        super(C5286i23.class, new C8491tW2(InterfaceC5681jT2.class));
    }

    @Override // com.daaw.AbstractC5697jX2
    public final AbstractC5417iX2 a() {
        return new C8770uW2(this, C6133l23.class);
    }

    @Override // com.daaw.AbstractC5697jX2
    public final EnumC6686n13 b() {
        return EnumC6686n13.SYMMETRIC;
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* synthetic */ U43 c(AbstractC9213w33 abstractC9213w33) {
        return C5286i23.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* bridge */ /* synthetic */ void e(U43 u43) throws GeneralSecurityException {
        C5286i23 c5286i23 = (C5286i23) u43;
        W23.b(c5286i23.M(), 0);
        if (c5286i23.Q().y() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
