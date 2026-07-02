package com.daaw;

import com.daaw.C9514x80;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ZA {
    public static final a b = new a(null);
    public static final Set c = AbstractC9588xQ0.c(C9514x80.a.F);
    public static final Set d = AbstractC9867yQ0.g(C9514x80.a.G, C9514x80.a.J);
    public static final C4740g50 e = new C4740g50(1, 1, 2);
    public static final C4740g50 f = new C4740g50(1, 1, 11);
    public static final C4740g50 g = new C4740g50(1, 1, 13);
    public C9523xA a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C4740g50 a() {
            return ZA.g;
        }

        public a() {
        }
    }

    public static final Collection d() {
        return AbstractC1599Mm.k();
    }

    public final InterfaceC4346ej0 c(InterfaceC2372Tr0 interfaceC2372Tr0, InterfaceC10072z80 interfaceC10072z80) {
        C0576Cs0 c0576Cs0M;
        G10.g(interfaceC2372Tr0, "descriptor");
        G10.g(interfaceC10072z80, "kotlinClass");
        String[] strArrM = m(interfaceC10072z80, d);
        if (strArrM == null) {
            return null;
        }
        String[] strArrG = interfaceC10072z80.a().g();
        try {
            if (strArrG == null) {
                return null;
            }
            try {
                c0576Cs0M = C7540q50.m(strArrM, strArrG);
            } catch (Q10 e2) {
                throw new IllegalStateException("Could not read data from " + interfaceC10072z80.getLocation(), e2);
            }
        } catch (Throwable th) {
            if (i() || interfaceC10072z80.a().d().h(h())) {
                throw th;
            }
            c0576Cs0M = null;
        }
        if (c0576Cs0M == null) {
            return null;
        }
        C5019h50 c5019h50 = (C5019h50) c0576Cs0M.a();
        FA0 fa0 = (FA0) c0576Cs0M.b();
        C5857k50 c5857k50 = new C5857k50(interfaceC10072z80, fa0, c5019h50, g(interfaceC10072z80), k(interfaceC10072z80), e(interfaceC10072z80));
        return new C9527xB(interfaceC2372Tr0, fa0, c5019h50, interfaceC10072z80.a().d(), c5857k50, f(), "scope for " + c5857k50 + " in " + interfaceC2372Tr0, YA.B);
    }

    public final VA e(InterfaceC10072z80 interfaceC10072z80) {
        return f().g().b() ? VA.B : interfaceC10072z80.a().j() ? VA.C : VA.B;
    }

    public final C9523xA f() {
        C9523xA c9523xA = this.a;
        if (c9523xA != null) {
            return c9523xA;
        }
        G10.u("components");
        return null;
    }

    public final C4864gZ g(InterfaceC10072z80 interfaceC10072z80) {
        if (i() || interfaceC10072z80.a().d().h(h())) {
            return null;
        }
        return new C4864gZ(interfaceC10072z80.a().d(), C4740g50.i, h(), h().k(interfaceC10072z80.a().d().j()), interfaceC10072z80.getLocation(), interfaceC10072z80.e());
    }

    public final C4740g50 h() {
        return CA.a(f().g());
    }

    public final boolean i() {
        return f().g().e();
    }

    public final boolean j(InterfaceC10072z80 interfaceC10072z80) {
        return !f().g().c() && interfaceC10072z80.a().i() && G10.c(interfaceC10072z80.a().d(), f);
    }

    public final boolean k(InterfaceC10072z80 interfaceC10072z80) {
        return (f().g().f() && (interfaceC10072z80.a().i() || G10.c(interfaceC10072z80.a().d(), e))) || j(interfaceC10072z80);
    }

    public final C3798cl l(InterfaceC10072z80 interfaceC10072z80) {
        String[] strArrG;
        C0576Cs0 c0576Cs0I;
        G10.g(interfaceC10072z80, "kotlinClass");
        String[] strArrM = m(interfaceC10072z80, c);
        if (strArrM == null || (strArrG = interfaceC10072z80.a().g()) == null) {
            return null;
        }
        try {
            try {
                c0576Cs0I = C7540q50.i(strArrM, strArrG);
            } catch (Q10 e2) {
                throw new IllegalStateException("Could not read data from " + interfaceC10072z80.getLocation(), e2);
            }
        } catch (Throwable th) {
            if (i() || interfaceC10072z80.a().d().h(h())) {
                throw th;
            }
            c0576Cs0I = null;
        }
        if (c0576Cs0I == null) {
            return null;
        }
        return new C3798cl((C5019h50) c0576Cs0I.a(), (C9245wA0) c0576Cs0I.b(), interfaceC10072z80.a().d(), new B80(interfaceC10072z80, g(interfaceC10072z80), k(interfaceC10072z80), e(interfaceC10072z80)));
    }

    public final String[] m(InterfaceC10072z80 interfaceC10072z80, Set set) {
        C9514x80 c9514x80A = interfaceC10072z80.a();
        String[] strArrA = c9514x80A.a();
        if (strArrA == null) {
            strArrA = c9514x80A.b();
        }
        if (strArrA == null || !set.contains(c9514x80A.c())) {
            return null;
        }
        return strArrA;
    }

    public final InterfaceC4923gl n(InterfaceC10072z80 interfaceC10072z80) {
        G10.g(interfaceC10072z80, "kotlinClass");
        C3798cl c3798clL = l(interfaceC10072z80);
        if (c3798clL == null) {
            return null;
        }
        return f().f().e(interfaceC10072z80.e(), c3798clL);
    }

    public final void o(C9523xA c9523xA) {
        G10.g(c9523xA, "<set-?>");
        this.a = c9523xA;
    }

    public final void p(C9802yA c9802yA) {
        G10.g(c9802yA, "components");
        o(c9802yA.a());
    }
}
