package com.daaw;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.uY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8778uY2 extends AbstractC5417iX2 {
    public C8778uY2(C10180zY2 c10180zY2, Class cls) {
        super(cls);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        XZ2 xz2 = (XZ2) u43;
        TZ2 tz2N = UZ2.N();
        tz2N.p(0);
        byte[] bArrB = AbstractC3181aY2.b(xz2.M());
        tz2N.n(AbstractC9213w33.T(bArrB, 0, bArrB.length));
        tz2N.o(xz2.Q());
        return (UZ2) tz2N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return XZ2.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        EY2 ey2 = AbstractC8503tZ2.e;
        map.put("AES_CMAC", ey2);
        map.put("AES256_CMAC", ey2);
        BY2 by2 = new BY2(null);
        by2.a(32);
        by2.b(16);
        by2.c(CY2.e);
        map.put("AES256_CMAC_RAW", by2.d());
        return DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ void d(U43 u43) throws GeneralSecurityException {
        XZ2 xz2 = (XZ2) u43;
        C10180zY2.n(xz2.Q());
        C10180zY2.o(xz2.M());
    }
}
