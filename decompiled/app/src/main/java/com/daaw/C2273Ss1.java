package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ss1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2273Ss1 {
    public final List a;
    public final InterfaceC8576to1[] b;

    public C2273Ss1(List list) {
        this.a = list;
        this.b = new InterfaceC8576to1[list.size()];
    }

    public final void a(long j, C5900kE2 c5900kE2) {
        AbstractC7177on1.a(j, c5900kE2, this.b);
    }

    public final void b(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        for (int i = 0; i < this.b.length; i++) {
            c4118dt1.c();
            InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(c4118dt1.a(), 3);
            C2485Ut1 c2485Ut1 = (C2485Ut1) this.a.get(i);
            String str = c2485Ut1.l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            AbstractC6048km2.e(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strB = c2485Ut1.a;
            if (strB == null) {
                strB = c4118dt1.b();
            }
            C1106Hs1 c1106Hs1 = new C1106Hs1();
            c1106Hs1.j(strB);
            c1106Hs1.u(str);
            c1106Hs1.w(c2485Ut1.d);
            c1106Hs1.m(c2485Ut1.c);
            c1106Hs1.i0(c2485Ut1.D);
            c1106Hs1.k(c2485Ut1.n);
            interfaceC8576to1O.e(c1106Hs1.D());
            this.b[i] = interfaceC8576to1O;
        }
    }
}
