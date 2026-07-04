package com.daaw;

import com.daaw.P80;

/* JADX INFO: renamed from: com.daaw.Xn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2772Xn0 implements InterfaceC2668Wn0 {
    public final Q80 c;
    public final P80 d;
    public final C0789Er0 e;

    public C2772Xn0(Q80 q80, P80 p80) {
        G10.g(q80, "kotlinTypeRefiner");
        G10.g(p80, "kotlinTypePreparator");
        this.c = q80;
        this.d = p80;
        C0789Er0 c0789Er0M = C0789Er0.m(c());
        G10.f(c0789Er0M, "createWithTypeRefiner(...)");
        this.e = c0789Er0M;
    }

    @Override // com.daaw.InterfaceC2668Wn0
    public C0789Er0 a() {
        return this.e;
    }

    @Override // com.daaw.J80
    public boolean b(I80 i80, I80 i802) {
        G10.g(i80, "subtype");
        G10.g(i802, "supertype");
        return g(AbstractC9124vl.b(true, false, null, f(), c(), 6, null), i80.Q0(), i802.Q0());
    }

    @Override // com.daaw.InterfaceC2668Wn0
    public Q80 c() {
        return this.c;
    }

    @Override // com.daaw.J80
    public boolean d(I80 i80, I80 i802) {
        G10.g(i80, "a");
        G10.g(i802, "b");
        return e(AbstractC9124vl.b(false, false, null, f(), c(), 6, null), i80.Q0(), i802.Q0());
    }

    public final boolean e(C9510x71 c9510x71, AbstractC5708ja1 abstractC5708ja1, AbstractC5708ja1 abstractC5708ja12) {
        G10.g(c9510x71, "<this>");
        G10.g(abstractC5708ja1, "a");
        G10.g(abstractC5708ja12, "b");
        return N0.a.m(c9510x71, abstractC5708ja1, abstractC5708ja12);
    }

    public P80 f() {
        return this.d;
    }

    public final boolean g(C9510x71 c9510x71, AbstractC5708ja1 abstractC5708ja1, AbstractC5708ja1 abstractC5708ja12) {
        G10.g(c9510x71, "<this>");
        G10.g(abstractC5708ja1, "subType");
        G10.g(abstractC5708ja12, "superType");
        return N0.v(N0.a, c9510x71, abstractC5708ja1, abstractC5708ja12, false, 8, null);
    }

    public /* synthetic */ C2772Xn0(Q80 q80, P80 p80, int i, AbstractC2911Yw abstractC2911Yw) {
        this(q80, (i & 2) != 0 ? P80.a.a : p80);
    }
}
