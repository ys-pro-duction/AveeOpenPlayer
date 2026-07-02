package com.daaw;

import j$.util.DesugarCollections;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.zV2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10168zV2 extends AbstractC5417iX2 {
    public final /* synthetic */ AV2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10168zV2(AV2 av2, Class cls) {
        super(cls);
        this.b = av2;
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        K03 k03N = P03.N();
        byte[] bArrB = AbstractC3181aY2.b(((S03) u43).M());
        k03N.n(AbstractC9213w33.T(bArrB, 0, bArrB.length));
        k03N.o(0);
        return (P03) k03N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return S03.P(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    public final Map c() throws InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        GV2 gv2 = new GV2(null);
        gv2.a(16);
        HV2 hv2 = HV2.b;
        gv2.b(hv2);
        map.put("AES128_GCM_SIV", gv2.c());
        GV2 gv22 = new GV2(null);
        gv22.a(16);
        HV2 hv22 = HV2.d;
        gv22.b(hv22);
        map.put("AES128_GCM_SIV_RAW", gv22.c());
        GV2 gv23 = new GV2(null);
        gv23.a(32);
        gv23.b(hv2);
        map.put("AES256_GCM_SIV", gv23.c());
        GV2 gv24 = new GV2(null);
        gv24.a(32);
        gv24.b(hv22);
        map.put("AES256_GCM_SIV_RAW", gv24.c());
        return DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ void d(U43 u43) throws InvalidAlgorithmParameterException {
        W23.a(((S03) u43).M());
    }
}
