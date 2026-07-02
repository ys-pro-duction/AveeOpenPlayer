package com.daaw;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class VY2 extends AbstractC5417iX2 {
    public final /* synthetic */ WY2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VY2(WY2 wy2, Class cls) {
        super(cls);
        this.b = wy2;
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        C4723g13 c4723g13 = (C4723g13) u43;
        C3598c13 c3598c13N = C3877d13.N();
        c3598c13N.p(0);
        c3598c13N.o(c4723g13.R());
        byte[] bArrB = AbstractC3181aY2.b(c4723g13.M());
        c3598c13N.n(AbstractC9213w33.T(bArrB, 0, bArrB.length));
        return (C3877d13) c3598c13N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return C4723g13.Q(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    public final Map c() {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", AbstractC8503tZ2.a);
        YY2 yy2 = new YY2(null);
        yy2.b(32);
        yy2.c(16);
        C4299eZ2 c4299eZ2 = C4299eZ2.e;
        yy2.d(c4299eZ2);
        C4021dZ2 c4021dZ2 = C4021dZ2.d;
        yy2.a(c4021dZ2);
        map.put("HMAC_SHA256_128BITTAG_RAW", yy2.e());
        YY2 yy22 = new YY2(null);
        yy22.b(32);
        yy22.c(32);
        C4299eZ2 c4299eZ22 = C4299eZ2.b;
        yy22.d(c4299eZ22);
        yy22.a(c4021dZ2);
        map.put("HMAC_SHA256_256BITTAG", yy22.e());
        YY2 yy23 = new YY2(null);
        yy23.b(32);
        yy23.c(32);
        yy23.d(c4299eZ2);
        yy23.a(c4021dZ2);
        map.put("HMAC_SHA256_256BITTAG_RAW", yy23.e());
        YY2 yy24 = new YY2(null);
        yy24.b(64);
        yy24.c(16);
        yy24.d(c4299eZ22);
        C4021dZ2 c4021dZ22 = C4021dZ2.f;
        yy24.a(c4021dZ22);
        map.put("HMAC_SHA512_128BITTAG", yy24.e());
        YY2 yy25 = new YY2(null);
        yy25.b(64);
        yy25.c(16);
        yy25.d(c4299eZ2);
        yy25.a(c4021dZ22);
        map.put("HMAC_SHA512_128BITTAG_RAW", yy25.e());
        YY2 yy26 = new YY2(null);
        yy26.b(64);
        yy26.c(32);
        yy26.d(c4299eZ22);
        yy26.a(c4021dZ22);
        map.put("HMAC_SHA512_256BITTAG", yy26.e());
        YY2 yy27 = new YY2(null);
        yy27.b(64);
        yy27.c(32);
        yy27.d(c4299eZ2);
        yy27.a(c4021dZ22);
        map.put("HMAC_SHA512_256BITTAG_RAW", yy27.e());
        map.put("HMAC_SHA512_512BITTAG", AbstractC8503tZ2.d);
        YY2 yy28 = new YY2(null);
        yy28.b(64);
        yy28.c(64);
        yy28.d(c4299eZ2);
        yy28.a(c4021dZ22);
        map.put("HMAC_SHA512_512BITTAG_RAW", yy28.e());
        return DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ void d(U43 u43) throws GeneralSecurityException {
        C4723g13 c4723g13 = (C4723g13) u43;
        if (c4723g13.M() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        WY2.n(c4723g13.R());
    }
}
