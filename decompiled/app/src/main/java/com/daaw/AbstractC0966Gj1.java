package com.daaw;

/* JADX INFO: renamed from: com.daaw.Gj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0966Gj1 {
    public static final Object a(InterfaceC1416Ks interfaceC1416Ks) {
        Object objC;
        InterfaceC4684ft context = interfaceC1416Ks.getContext();
        AbstractC3053a40.i(context);
        InterfaceC1416Ks interfaceC1416KsB = H10.b(interfaceC1416Ks);
        C6177lC c6177lC = interfaceC1416KsB instanceof C6177lC ? (C6177lC) interfaceC1416KsB : null;
        if (c6177lC == null) {
            objC = G91.a;
        } else {
            if (c6177lC.E.i1(context)) {
                c6177lC.k(context, G91.a);
            } else {
                C0862Fj1 c0862Fj1 = new C0862Fj1();
                InterfaceC4684ft interfaceC4684ftU = context.U(c0862Fj1);
                G91 g91 = G91.a;
                c6177lC.k(interfaceC4684ftU, g91);
                objC = (!c0862Fj1.C || AbstractC6456mC.d(c6177lC)) ? I10.c() : g91;
            }
            objC = I10.c();
        }
        if (objC == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objC == I10.c() ? objC : G91.a;
    }
}
