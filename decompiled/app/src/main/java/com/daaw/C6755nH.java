package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.nH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6755nH extends C5761jl {
    /* JADX WARN: Illegal instructions before constructor call */
    public C6755nH(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        BH bh = BH.a;
        InterfaceC2968Zk0 interfaceC2968Zk0I = bh.i();
        EnumC0336Ak0 enumC0336Ak0 = EnumC0336Ak0.E;
        EnumC6886nl enumC6886nl = EnumC6886nl.C;
        List listK = AbstractC1599Mm.k();
        RU0 ru0 = RU0.a;
        super(interfaceC2968Zk0I, c2352Tm0, enumC0336Ak0, enumC6886nl, listK, ru0, false, C9085vd0.e);
        C3520bl c3520blN1 = C3520bl.n1(this, InterfaceC3072a8.b.b(), true, ru0);
        c3520blN1.q1(AbstractC1599Mm.k(), AbstractC8679uA.d);
        G10.f(c3520blN1, "apply(...)");
        InterfaceC4346ej0 interfaceC4346ej0B = BH.b(EnumC9551xH.K, c3520blN1.getName().toString(), "");
        AH ah = AH.U0;
        c3520blN1.g1(new C9830yH(bh.e(ah, new String[0]), interfaceC4346ej0B, ah, null, false, new String[0], 24, null));
        K0(interfaceC4346ej0B, AbstractC9588xQ0.c(c3520blN1), c3520blN1);
    }

    @Override // com.daaw.AbstractC8349t, com.daaw.AbstractC2134Rk0
    public InterfaceC4346ej0 F(AbstractC8392t81 abstractC8392t81, Q80 q80) {
        G10.g(abstractC8392t81, "typeSubstitution");
        G10.g(q80, "kotlinTypeRefiner");
        return BH.b(EnumC9551xH.K, getName().toString(), abstractC8392t81.toString());
    }

    @Override // com.daaw.AbstractC8349t, com.daaw.InterfaceC4297eZ0
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public InterfaceC4923gl c(C8957v81 c8957v81) {
        G10.g(c8957v81, "substitutor");
        return this;
    }

    @Override // com.daaw.C5761jl
    public String toString() {
        String strC = getName().c();
        G10.f(strC, "asString(...)");
        return strC;
    }
}
