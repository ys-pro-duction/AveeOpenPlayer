package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.fW2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4576fW2 extends AbstractC5417iX2 {
    public final /* synthetic */ C5972kW2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4576fW2(C5972kW2 c5972kW2, Class cls) {
        super(cls);
        this.b = c5972kW2;
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        S13 s13N = X13.N();
        s13N.n((C3046a23) u43);
        s13N.o(0);
        return (X13) s13N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return C3046a23.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ void d(U43 u43) throws GeneralSecurityException {
        C3046a23 c3046a23 = (C3046a23) u43;
        if (AbstractC4009dW2.b(c3046a23.M().R())) {
            if (c3046a23.Q().isEmpty() || !c3046a23.R()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        } else {
            throw new GeneralSecurityException("Unsupported DEK key type: " + c3046a23.M().R() + ". Only Tink AEAD key types are supported.");
        }
    }
}
