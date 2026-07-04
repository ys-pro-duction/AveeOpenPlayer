package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class WY2 extends AbstractC5697jX2 {
    public static final LX2 d = LX2.b(new JX2() { // from class: com.daaw.SY2
        @Override // com.daaw.JX2
        public final Object a(AbstractC8758uT2 abstractC8758uT2) {
            return new C9347wZ2((RY2) abstractC8758uT2);
        }
    }, RY2.class, KY2.class);
    public static final LX2 e = LX2.b(new JX2() { // from class: com.daaw.TY2
        @Override // com.daaw.JX2
        public final Object a(AbstractC8758uT2 abstractC8758uT2) {
            return U23.c((RY2) abstractC8758uT2);
        }
    }, RY2.class, LT2.class);

    public WY2() {
        super(C3877d13.class, new UY2(LT2.class));
    }

    public static void l(boolean z) {
        AbstractC3165aU2.f(new WY2(), true);
        Y23 y23 = BZ2.a;
        BZ2.c(C10176zX2.b());
        C9339wX2.a().e(d);
        C9339wX2.a().e(e);
    }

    public static final void m(C3877d13 c3877d13) throws GeneralSecurityException {
        W23.b(c3877d13.M(), 0);
        if (c3877d13.S().y() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        n(c3877d13.R());
    }

    public static void n(C5558j13 c5558j13) throws GeneralSecurityException {
        if (c5558j13.M() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        EnumC3041a13 enumC3041a13 = EnumC3041a13.UNKNOWN_HASH;
        int iOrdinal = c5558j13.N().ordinal();
        if (iOrdinal == 1) {
            if (c5558j13.M() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (c5558j13.M() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (c5558j13.M() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (c5558j13.M() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (c5558j13.M() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.daaw.AbstractC5697jX2
    public final AbstractC5417iX2 a() {
        return new VY2(this, C4723g13.class);
    }

    @Override // com.daaw.AbstractC5697jX2
    public final EnumC6686n13 b() {
        return EnumC6686n13.SYMMETRIC;
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* synthetic */ U43 c(AbstractC9213w33 abstractC9213w33) {
        return C3877d13.Q(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5697jX2
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.daaw.AbstractC5697jX2
    public final /* bridge */ /* synthetic */ void e(U43 u43) throws GeneralSecurityException {
        m((C3877d13) u43);
    }

    @Override // com.daaw.AbstractC5697jX2
    public final int f() {
        return 2;
    }
}
