package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.zY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10180zY2 extends AbstractC5697jX2 {
    public static final LX2 d = LX2.b(new JX2() { // from class: com.daaw.rY2
        @Override // com.daaw.JX2
        public final Object a(AbstractC8758uT2 abstractC8758uT2) {
            return new C9068vZ2((C7663qY2) abstractC8758uT2);
        }
    }, C7663qY2.class, KY2.class);
    public static final LX2 e = LX2.b(new JX2() { // from class: com.daaw.sY2
        @Override // com.daaw.JX2
        public final Object a(AbstractC8758uT2 abstractC8758uT2) {
            return U23.b((C7663qY2) abstractC8758uT2);
        }
    }, C7663qY2.class, LT2.class);

    public C10180zY2() {
        super(UZ2.class, new C8499tY2(LT2.class));
    }

    public static void m(boolean z) {
        AbstractC3165aU2.f(new C10180zY2(), true);
        Y23 y23 = JY2.a;
        JY2.a(C10176zX2.b());
        C9339wX2.a().e(d);
        C9339wX2.a().e(e);
    }

    public static void n(C3036a03 c3036a03) throws GeneralSecurityException {
        if (c3036a03.M() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c3036a03.M() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void o(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.daaw.AbstractC5697jX2
    public final AbstractC5417iX2 a() {
        return new C8778uY2(this, XZ2.class);
    }

    @Override // com.daaw.AbstractC5697jX2
    public final EnumC6686n13 b() {
        return EnumC6686n13.SYMMETRIC;
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* synthetic */ U43 c(AbstractC9213w33 abstractC9213w33) {
        return UZ2.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* bridge */ /* synthetic */ void e(U43 u43) throws GeneralSecurityException {
        UZ2 uz2 = (UZ2) u43;
        W23.b(uz2.M(), 0);
        o(uz2.R().y());
        n(uz2.Q());
    }
}
