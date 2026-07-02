package com.daaw;

import com.daaw.InterfaceC6435m71;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class M80 {
    public static final M80 a = new M80();
    public static final NQ b = a.B;

    public static final class a implements NQ {
        public static final a B = new a();

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Q80 q80) {
            G10.g(q80, "<unused var>");
            return null;
        }
    }

    public static final class b {
        public final YS0 a;
        public final C71 b;

        public b(YS0 ys0, C71 c71) {
            this.a = ys0;
            this.b = c71;
        }

        public final YS0 a() {
            return this.a;
        }

        public final C71 b() {
            return this.b;
        }
    }

    public static final YS0 c(InterfaceC5586j71 interfaceC5586j71, List list) {
        G10.g(interfaceC5586j71, "<this>");
        G10.g(list, "arguments");
        return new C5868k71(InterfaceC6435m71.a.a, false).h(C6156l71.e.a(null, interfaceC5586j71, list), C8387t71.C.j());
    }

    public static final AbstractC5708ja1 e(YS0 ys0, YS0 ys02) {
        G10.g(ys0, "lowerBound");
        G10.g(ys02, "upperBound");
        return G10.c(ys0, ys02) ? ys0 : new WM(ys0, ys02);
    }

    public static final YS0 f(C8387t71 c8387t71, Q00 q00, boolean z) {
        G10.g(c8387t71, "attributes");
        G10.g(q00, "constructor");
        return m(c8387t71, q00, AbstractC1599Mm.k(), z, BH.a(EnumC9551xH.D, true, "unknown integer literal type"));
    }

    public static final YS0 h(C8387t71 c8387t71, InterfaceC4923gl interfaceC4923gl, List list) {
        G10.g(c8387t71, "attributes");
        G10.g(interfaceC4923gl, "descriptor");
        G10.g(list, "arguments");
        C71 c71K = interfaceC4923gl.k();
        G10.f(c71K, "getTypeConstructor(...)");
        return k(c8387t71, c71K, list, false, null, 16, null);
    }

    public static final YS0 i(C8387t71 c8387t71, C71 c71, List list, boolean z) {
        G10.g(c8387t71, "attributes");
        G10.g(c71, "constructor");
        G10.g(list, "arguments");
        return k(c8387t71, c71, list, z, null, 16, null);
    }

    public static final YS0 j(C8387t71 c8387t71, C71 c71, List list, boolean z, Q80 q80) {
        G10.g(c8387t71, "attributes");
        G10.g(c71, "constructor");
        G10.g(list, "arguments");
        if (!c8387t71.isEmpty() || !list.isEmpty() || z || c71.c() == null) {
            return n(c8387t71, c71, list, z, a.d(c71, list, q80), new K80(c71, list, c8387t71, z));
        }
        InterfaceC10240zl interfaceC10240zlC = c71.c();
        G10.d(interfaceC10240zlC);
        YS0 ys0S = interfaceC10240zlC.s();
        G10.f(ys0S, "getDefaultType(...)");
        return ys0S;
    }

    public static /* synthetic */ YS0 k(C8387t71 c8387t71, C71 c71, List list, boolean z, Q80 q80, int i, Object obj) {
        if ((i & 16) != 0) {
            q80 = null;
        }
        return j(c8387t71, c71, list, z, q80);
    }

    public static final YS0 l(C71 c71, List list, C8387t71 c8387t71, boolean z, Q80 q80) {
        G10.g(c71, "$constructor");
        G10.g(list, "$arguments");
        G10.g(c8387t71, "$attributes");
        G10.g(q80, "refiner");
        b bVarG = a.g(c71, q80, list);
        if (bVarG == null) {
            return null;
        }
        YS0 ys0A = bVarG.a();
        if (ys0A != null) {
            return ys0A;
        }
        C71 c71B = bVarG.b();
        G10.d(c71B);
        return j(c8387t71, c71B, list, z, q80);
    }

    public static final YS0 m(C8387t71 c8387t71, C71 c71, List list, boolean z, InterfaceC4346ej0 interfaceC4346ej0) {
        G10.g(c8387t71, "attributes");
        G10.g(c71, "constructor");
        G10.g(list, "arguments");
        G10.g(interfaceC4346ej0, "memberScope");
        ZS0 zs0 = new ZS0(c71, list, z, interfaceC4346ej0, new L80(c71, list, c8387t71, z, interfaceC4346ej0));
        return c8387t71.isEmpty() ? zs0 : new C3438bT0(zs0, c8387t71);
    }

    public static final YS0 n(C8387t71 c8387t71, C71 c71, List list, boolean z, InterfaceC4346ej0 interfaceC4346ej0, NQ nq) {
        G10.g(c8387t71, "attributes");
        G10.g(c71, "constructor");
        G10.g(list, "arguments");
        G10.g(interfaceC4346ej0, "memberScope");
        G10.g(nq, "refinedTypeFactory");
        ZS0 zs0 = new ZS0(c71, list, z, interfaceC4346ej0, nq);
        return c8387t71.isEmpty() ? zs0 : new C3438bT0(zs0, c8387t71);
    }

    public static final YS0 o(C71 c71, List list, C8387t71 c8387t71, boolean z, InterfaceC4346ej0 interfaceC4346ej0, Q80 q80) {
        G10.g(c71, "$constructor");
        G10.g(list, "$arguments");
        G10.g(c8387t71, "$attributes");
        G10.g(interfaceC4346ej0, "$memberScope");
        G10.g(q80, "kotlinTypeRefiner");
        b bVarG = a.g(c71, q80, list);
        if (bVarG == null) {
            return null;
        }
        YS0 ys0A = bVarG.a();
        if (ys0A != null) {
            return ys0A;
        }
        C71 c71B = bVarG.b();
        G10.d(c71B);
        return m(c8387t71, c71B, list, z, interfaceC4346ej0);
    }

    public final InterfaceC4346ej0 d(C71 c71, List list, Q80 q80) {
        InterfaceC10240zl interfaceC10240zlC = c71.c();
        if (interfaceC10240zlC instanceof Z71) {
            return ((Z71) interfaceC10240zlC).s().q();
        }
        if (interfaceC10240zlC instanceof InterfaceC4923gl) {
            if (q80 == null) {
                q80 = AbstractC8400tA.r(AbstractC8400tA.s(interfaceC10240zlC));
            }
            return list.isEmpty() ? AbstractC2240Sk0.b((InterfaceC4923gl) interfaceC10240zlC, q80) : AbstractC2240Sk0.a((InterfaceC4923gl) interfaceC10240zlC, E71.c.b(c71, list), q80);
        }
        if (interfaceC10240zlC instanceof InterfaceC5586j71) {
            return BH.a(EnumC9551xH.F, true, ((InterfaceC5586j71) interfaceC10240zlC).getName().toString());
        }
        if (c71 instanceof B10) {
            return ((B10) c71).i();
        }
        throw new IllegalStateException("Unsupported classifier: " + interfaceC10240zlC + " for constructor: " + c71);
    }

    public final b g(C71 c71, Q80 q80, List list) {
        InterfaceC10240zl interfaceC10240zlF;
        InterfaceC10240zl interfaceC10240zlC = c71.c();
        if (interfaceC10240zlC == null || (interfaceC10240zlF = q80.f(interfaceC10240zlC)) == null) {
            return null;
        }
        if (interfaceC10240zlF instanceof InterfaceC5586j71) {
            return new b(c((InterfaceC5586j71) interfaceC10240zlF, list), null);
        }
        C71 c71A = interfaceC10240zlF.k().a(q80);
        G10.f(c71A, "refine(...)");
        return new b(null, c71A);
    }
}
