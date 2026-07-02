package com.daaw;

import com.daaw.InterfaceC0443Bl;
import com.google.android.gms.ads.mediation.MediationConfiguration;

/* JADX INFO: renamed from: com.daaw.Yz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2923Yz {
    public static final a a;
    public static final AbstractC2923Yz b;
    public static final AbstractC2923Yz c;
    public static final AbstractC2923Yz d;
    public static final AbstractC2923Yz e;
    public static final AbstractC2923Yz f;
    public static final AbstractC2923Yz g;
    public static final AbstractC2923Yz h;
    public static final AbstractC2923Yz i;
    public static final AbstractC2923Yz j;
    public static final AbstractC2923Yz k;
    public static final AbstractC2923Yz l;

    /* JADX INFO: renamed from: com.daaw.Yz$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.Yz$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0137a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[EnumC6886nl.values().length];
                try {
                    iArr[EnumC6886nl.C.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6886nl.D.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6886nl.E.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC6886nl.H.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC6886nl.G.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC6886nl.F.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final String a(InterfaceC0339Al interfaceC0339Al) {
            G10.g(interfaceC0339Al, "classifier");
            if (interfaceC0339Al instanceof InterfaceC5586j71) {
                return "typealias";
            }
            if (!(interfaceC0339Al instanceof InterfaceC4923gl)) {
                throw new AssertionError("Unexpected classifier: " + interfaceC0339Al);
            }
            InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) interfaceC0339Al;
            if (interfaceC4923gl.x()) {
                return "companion object";
            }
            switch (C0137a.a[interfaceC4923gl.i().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new C6902no0();
            }
        }

        public final AbstractC2923Yz b(NQ nq) {
            G10.g(nq, "changeOptions");
            C5881kA c5881kA = new C5881kA();
            nq.invoke(c5881kA);
            c5881kA.p0();
            return new C4475fA(c5881kA);
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Yz$b */
    public interface b {

        /* JADX INFO: renamed from: com.daaw.Yz$b$a */
        public static final class a implements b {
            public static final a a = new a();

            @Override // com.daaw.AbstractC2923Yz.b
            public void a(InterfaceC9918yc1 interfaceC9918yc1, int i, int i2, StringBuilder sb) {
                G10.g(interfaceC9918yc1, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                G10.g(sb, "builder");
            }

            @Override // com.daaw.AbstractC2923Yz.b
            public void b(int i, StringBuilder sb) {
                G10.g(sb, "builder");
                sb.append("(");
            }

            @Override // com.daaw.AbstractC2923Yz.b
            public void c(InterfaceC9918yc1 interfaceC9918yc1, int i, int i2, StringBuilder sb) {
                G10.g(interfaceC9918yc1, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                G10.g(sb, "builder");
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }

            @Override // com.daaw.AbstractC2923Yz.b
            public void d(int i, StringBuilder sb) {
                G10.g(sb, "builder");
                sb.append(")");
            }
        }

        void a(InterfaceC9918yc1 interfaceC9918yc1, int i, int i2, StringBuilder sb);

        void b(int i, StringBuilder sb);

        void c(InterfaceC9918yc1 interfaceC9918yc1, int i, int i2, StringBuilder sb);

        void d(int i, StringBuilder sb);
    }

    static {
        a aVar = new a(null);
        a = aVar;
        b = aVar.b(C1755Nz.B);
        c = aVar.b(C1963Pz.B);
        d = aVar.b(C2089Qz.B);
        e = aVar.b(C2193Rz.B);
        f = aVar.b(C2299Sz.B);
        g = aVar.b(C2403Tz.B);
        h = aVar.b(C2507Uz.B);
        i = aVar.b(C2611Vz.B);
        j = aVar.b(C2715Wz.B);
        k = aVar.b(C2819Xz.B);
        l = aVar.b(C1859Oz.B);
    }

    public static final G91 A(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.e(false);
        interfaceC5043hA.d(AbstractC9867yQ0.d());
        interfaceC5043hA.q(InterfaceC0443Bl.b.a);
        interfaceC5043hA.r(true);
        interfaceC5043hA.h(EnumC1728Ns0.D);
        interfaceC5043hA.l(true);
        interfaceC5043hA.k(true);
        interfaceC5043hA.i(true);
        interfaceC5043hA.c(true);
        return G91.a;
    }

    public static final G91 B(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.q(InterfaceC0443Bl.b.a);
        interfaceC5043hA.h(EnumC1728Ns0.C);
        return G91.a;
    }

    public static final G91 C(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.d(AbstractC9867yQ0.d());
        return G91.a;
    }

    public static /* synthetic */ String Q(AbstractC2923Yz abstractC2923Yz, O7 o7, W7 w7, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i2 & 2) != 0) {
            w7 = null;
        }
        return abstractC2923Yz.P(o7, w7);
    }

    public static final G91 s(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.e(false);
        interfaceC5043hA.d(AbstractC9867yQ0.d());
        return G91.a;
    }

    public static final G91 t(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.e(false);
        interfaceC5043hA.d(AbstractC9867yQ0.d());
        interfaceC5043hA.i(true);
        return G91.a;
    }

    public static final G91 u(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.e(false);
        return G91.a;
    }

    public static final G91 v(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.d(AbstractC9867yQ0.d());
        interfaceC5043hA.q(InterfaceC0443Bl.b.a);
        interfaceC5043hA.h(EnumC1728Ns0.C);
        return G91.a;
    }

    public static final G91 w(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.j(true);
        interfaceC5043hA.q(InterfaceC0443Bl.a.a);
        interfaceC5043hA.d(EnumC4764gA.E);
        return G91.a;
    }

    public static final G91 x(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.d(EnumC4764gA.D);
        return G91.a;
    }

    public static final G91 y(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.d(EnumC4764gA.E);
        return G91.a;
    }

    public static final G91 z(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.f(EnumC3115aI0.C);
        interfaceC5043hA.d(EnumC4764gA.E);
        return G91.a;
    }

    public abstract String O(InterfaceC8612tw interfaceC8612tw);

    public abstract String P(O7 o7, W7 w7);

    public abstract String R(String str, String str2, AbstractC8670u80 abstractC8670u80);

    public abstract String S(BP bp);

    public abstract String T(C2352Tm0 c2352Tm0, boolean z);

    public abstract String U(I80 i80);

    public abstract String V(InterfaceC6440m81 interfaceC6440m81);

    public final AbstractC2923Yz W(NQ nq) {
        G10.g(nq, "changeOptions");
        G10.e(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        C5881kA c5881kAU = ((C4475fA) this).K0().u();
        nq.invoke(c5881kAU);
        c5881kAU.p0();
        return new C4475fA(c5881kAU);
    }
}
