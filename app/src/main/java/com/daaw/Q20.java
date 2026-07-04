package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class Q20 {
    public final C9907ya0 a;
    public final InterfaceC6972o30 b;

    public Q20(C9907ya0 c9907ya0, InterfaceC6972o30 interfaceC6972o30) {
        G10.g(c9907ya0, "packageFragmentProvider");
        G10.g(interfaceC6972o30, "javaResolverCache");
        this.a = c9907ya0;
        this.b = interfaceC6972o30;
    }

    public final C9907ya0 a() {
        return this.a;
    }

    public final InterfaceC4923gl b(C20 c20) {
        G10.g(c20, "javaClass");
        AP apD = c20.d();
        if (apD != null && c20.I() == EnumC2308Tb0.B) {
            return this.b.d(apD);
        }
        C20 c20K = c20.k();
        if (c20K != null) {
            InterfaceC4923gl interfaceC4923glB = b(c20K);
            InterfaceC4346ej0 interfaceC4346ej0W0 = interfaceC4923glB != null ? interfaceC4923glB.w0() : null;
            InterfaceC10240zl interfaceC10240zlG = interfaceC4346ej0W0 != null ? interfaceC4346ej0W0.g(c20.getName(), EnumC5496io0.T) : null;
            if (interfaceC10240zlG instanceof InterfaceC4923gl) {
                return (InterfaceC4923gl) interfaceC10240zlG;
            }
            return null;
        }
        if (apD == null) {
            return null;
        }
        C9907ya0 c9907ya0 = this.a;
        AP apE = apD.e();
        G10.f(apE, "parent(...)");
        C9349wa0 c9349wa0 = (C9349wa0) AbstractC2455Um.g0(c9907ya0.c(apE));
        if (c9349wa0 != null) {
            return c9349wa0.N0(c20);
        }
        return null;
    }
}
