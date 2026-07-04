package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.kW2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5972kW2 extends AbstractC5697jX2 {
    public C5972kW2() {
        super(X13.class, new C4287eW2(InterfaceC5681jT2.class));
    }

    @Override // com.daaw.AbstractC5697jX2
    public final AbstractC5417iX2 a() {
        return new C4576fW2(this, C3046a23.class);
    }

    @Override // com.daaw.AbstractC5697jX2
    public final EnumC6686n13 b() {
        return EnumC6686n13.REMOTE;
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* synthetic */ U43 c(AbstractC9213w33 abstractC9213w33) {
        return X13.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* bridge */ /* synthetic */ void e(U43 u43) throws GeneralSecurityException {
        X13 x13 = (X13) u43;
        W23.b(x13.M(), 0);
        if (AbstractC4009dW2.b(x13.Q().M().R())) {
            return;
        }
        throw new GeneralSecurityException("Unsupported DEK key type: " + x13.Q().M().R() + ". Only Tink AEAD key types are supported.");
    }
}
