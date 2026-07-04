package com.daaw;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.uW2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8770uW2 extends AbstractC5417iX2 {
    public final /* synthetic */ C9056vW2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8770uW2(C9056vW2 c9056vW2, Class cls) {
        super(cls);
        this.b = c9056vW2;
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ U43 a(U43 u43) {
        C5007h23 c5007h23N = C5286i23.N();
        c5007h23N.o(0);
        byte[] bArrB = AbstractC3181aY2.b(32);
        c5007h23N.n(AbstractC9213w33.T(bArrB, 0, bArrB.length));
        return (C5286i23) c5007h23N.j();
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* synthetic */ U43 b(AbstractC9213w33 abstractC9213w33) {
        return C6133l23.O(abstractC9213w33, U33.a());
    }

    @Override // com.daaw.AbstractC5417iX2
    public final Map c() {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", C9614xW2.b(C9335wW2.b));
        map.put("XCHACHA20_POLY1305_RAW", C9614xW2.b(C9335wW2.d));
        return DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.daaw.AbstractC5417iX2
    public final /* bridge */ /* synthetic */ void d(U43 u43) {
    }
}
