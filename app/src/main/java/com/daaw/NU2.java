package com.daaw;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class NU2 extends AbstractC5417iX2 {
    public final /* synthetic */ OU2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NU2(OU2 ou2, Class cls) {
        super(cls);
        this.b = ou2;
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        C10035z03 c10035z03 = (C10035z03) u43;
        C8919v03 c8919v03N = C9198w03.N();
        byte[] bArrB = AbstractC3181aY2.b(c10035z03.M());
        c8919v03N.n(AbstractC9213w33.T(bArrB, 0, bArrB.length));
        c8919v03N.o(c10035z03.Q());
        c8919v03N.p(0);
        return (C9198w03) c8919v03N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return C10035z03.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", AbstractC7933rW2.c);
        QU2 qu2 = new QU2(null);
        qu2.a(16);
        qu2.b(16);
        qu2.c(16);
        RU2 ru2 = RU2.d;
        qu2.d(ru2);
        map.put("AES128_EAX_RAW", qu2.e());
        map.put("AES256_EAX", AbstractC7933rW2.d);
        QU2 qu22 = new QU2(null);
        qu22.a(16);
        qu22.b(32);
        qu22.c(16);
        qu22.d(ru2);
        map.put("AES256_EAX_RAW", qu22.e());
        return DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ void d(U43 u43) throws GeneralSecurityException {
        C10035z03 c10035z03 = (C10035z03) u43;
        W23.a(c10035z03.M());
        if (c10035z03.Q().M() != 12 && c10035z03.Q().M() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
