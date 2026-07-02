package com.daaw;

import j$.util.DesugarCollections;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.iV2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5409iV2 extends AbstractC5417iX2 {
    public final /* synthetic */ C5689jV2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5409iV2(C5689jV2 c5689jV2, Class cls) {
        super(cls);
        this.b = c5689jV2;
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        E03 e03N = F03.N();
        byte[] bArrB = AbstractC3181aY2.b(((I03) u43).M());
        e03N.n(AbstractC9213w33.T(bArrB, 0, bArrB.length));
        e03N.o(0);
        return (F03) e03N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return I03.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    public final Map c() throws InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", AbstractC7933rW2.a);
        C6256lV2 c6256lV2 = new C6256lV2(null);
        c6256lV2.a(12);
        c6256lV2.b(16);
        c6256lV2.c(16);
        C6535mV2 c6535mV2 = C6535mV2.d;
        c6256lV2.d(c6535mV2);
        map.put("AES128_GCM_RAW", c6256lV2.e());
        map.put("AES256_GCM", AbstractC7933rW2.b);
        C6256lV2 c6256lV22 = new C6256lV2(null);
        c6256lV22.a(12);
        c6256lV22.b(32);
        c6256lV22.c(16);
        c6256lV22.d(c6535mV2);
        map.put("AES256_GCM_RAW", c6256lV22.e());
        return DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ void d(U43 u43) throws InvalidAlgorithmParameterException {
        W23.a(((I03) u43).M());
    }
}
