package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JZ {
    public static final AP a;
    public static final C6607ml b;

    static {
        AP ap = new AP("kotlin.jvm.JvmInline");
        a = ap;
        b = C6607ml.d.c(ap);
    }

    public static final boolean a(InterfaceC1376Ki interfaceC1376Ki) {
        G10.g(interfaceC1376Ki, "<this>");
        if (!(interfaceC1376Ki instanceof InterfaceC5044hA0)) {
            return false;
        }
        InterfaceC4476fA0 interfaceC4476fA0A0 = ((InterfaceC5044hA0) interfaceC1376Ki).A0();
        G10.f(interfaceC4476fA0A0, "getCorrespondingProperty(...)");
        return f(interfaceC4476fA0A0);
    }

    public static final boolean b(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        return (interfaceC8612tw instanceof InterfaceC4923gl) && (((InterfaceC4923gl) interfaceC8612tw).x0() instanceof IZ);
    }

    public static final boolean c(I80 i80) {
        G10.g(i80, "<this>");
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC != null) {
            return b(interfaceC10240zlC);
        }
        return false;
    }

    public static final boolean d(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        return (interfaceC8612tw instanceof InterfaceC4923gl) && (((InterfaceC4923gl) interfaceC8612tw).x0() instanceof C2034Ql0);
    }

    public static final boolean e(InterfaceC0626Dc1 interfaceC0626Dc1) {
        IZ izQ;
        G10.g(interfaceC0626Dc1, "<this>");
        if (interfaceC0626Dc1.i0() != null) {
            return false;
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC0626Dc1.b();
        C2352Tm0 c2352Tm0C = null;
        InterfaceC4923gl interfaceC4923gl = interfaceC8612twB instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twB : null;
        if (interfaceC4923gl != null && (izQ = AbstractC8400tA.q(interfaceC4923gl)) != null) {
            c2352Tm0C = izQ.c();
        }
        return G10.c(c2352Tm0C, interfaceC0626Dc1.getName());
    }

    public static final boolean f(InterfaceC0626Dc1 interfaceC0626Dc1) {
        AbstractC7958rc1 abstractC7958rc1X0;
        G10.g(interfaceC0626Dc1, "<this>");
        if (interfaceC0626Dc1.i0() != null) {
            return false;
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC0626Dc1.b();
        InterfaceC4923gl interfaceC4923gl = interfaceC8612twB instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twB : null;
        if (interfaceC4923gl == null || (abstractC7958rc1X0 = interfaceC4923gl.x0()) == null) {
            return false;
        }
        C2352Tm0 name = interfaceC0626Dc1.getName();
        G10.f(name, "getName(...)");
        return abstractC7958rc1X0.a(name);
    }

    public static final boolean g(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "<this>");
        return b(interfaceC8612tw) || d(interfaceC8612tw);
    }

    public static final boolean h(I80 i80) {
        G10.g(i80, "<this>");
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC != null) {
            return g(interfaceC10240zlC);
        }
        return false;
    }

    public static final boolean i(I80 i80) {
        G10.g(i80, "<this>");
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        return (interfaceC10240zlC == null || !d(interfaceC10240zlC) || CS0.a.q(i80)) ? false : true;
    }

    public static final I80 j(I80 i80) {
        G10.g(i80, "<this>");
        I80 i80K = k(i80);
        if (i80K != null) {
            return C8957v81.f(i80).p(i80K, EnumC1042Hc1.F);
        }
        return null;
    }

    public static final I80 k(I80 i80) {
        IZ izQ;
        G10.g(i80, "<this>");
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
        if (interfaceC4923gl == null || (izQ = AbstractC8400tA.q(interfaceC4923gl)) == null) {
            return null;
        }
        return (YS0) izQ.d();
    }
}
