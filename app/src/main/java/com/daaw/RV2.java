package com.daaw;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RV2 extends AbstractC5417iX2 {
    public final /* synthetic */ SV2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RV2(SV2 sv2, Class cls) {
        super(cls);
        this.b = sv2;
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        U03 u03N = V03.N();
        u03N.o(0);
        byte[] bArrB = AbstractC3181aY2.b(32);
        u03N.n(AbstractC9213w33.T(bArrB, 0, bArrB.length));
        return (V03) u03N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return Y03.O(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    public final Map c() {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", UV2.b(TV2.b));
        map.put("CHACHA20_POLY1305_RAW", UV2.b(TV2.d));
        return DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ void d(U43 u43) {
    }
}
