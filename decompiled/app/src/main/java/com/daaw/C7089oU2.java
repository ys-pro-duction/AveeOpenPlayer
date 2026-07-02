package com.daaw;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.oU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7089oU2 extends AbstractC5417iX2 {
    public final /* synthetic */ C7368pU2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7089oU2(C7368pU2 c7368pU2, Class cls) {
        super(cls);
        this.b = c7368pU2;
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        C4718g03 c4718g03 = (C4718g03) u43;
        new HU2();
        C6681n03 c6681n03F = GU2.f(c4718g03.P());
        U43 u43A = new WY2().a().a(c4718g03.Q());
        C3593c03 c3593c03N = C3872d03.N();
        c3593c03N.n(c6681n03F);
        c3593c03N.o((C3877d13) u43A);
        c3593c03N.p(0);
        return (C3872d03) c3593c03N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return C4718g03.O(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", AbstractC7933rW2.e);
        C7925rU2 c7925rU2 = new C7925rU2(null);
        c7925rU2.a(16);
        c7925rU2.c(32);
        c7925rU2.e(16);
        c7925rU2.d(16);
        C8204sU2 c8204sU2 = C8204sU2.d;
        c7925rU2.b(c8204sU2);
        C8483tU2 c8483tU2 = C8483tU2.d;
        c7925rU2.f(c8483tU2);
        map.put("AES128_CTR_HMAC_SHA256_RAW", c7925rU2.g());
        map.put("AES256_CTR_HMAC_SHA256", AbstractC7933rW2.f);
        C7925rU2 c7925rU22 = new C7925rU2(null);
        c7925rU22.a(32);
        c7925rU22.c(32);
        c7925rU22.e(32);
        c7925rU22.d(16);
        c7925rU22.b(c8204sU2);
        c7925rU22.f(c8483tU2);
        map.put("AES256_CTR_HMAC_SHA256_RAW", c7925rU22.g());
        return DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ void d(U43 u43) throws GeneralSecurityException {
        C4718g03 c4718g03 = (C4718g03) u43;
        ((GU2) new HU2().a()).d(c4718g03.P());
        new WY2().a().d(c4718g03.Q());
        W23.a(c4718g03.P().M());
    }
}
