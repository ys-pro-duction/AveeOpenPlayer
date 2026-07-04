package com.daaw;

import com.daaw.AbstractC5362iK;
import com.daaw.C0428Bh0;
import com.daaw.C3039a11;
import com.daaw.C3930dD;
import com.daaw.C4660fo0;
import com.daaw.C5702jZ;
import com.daaw.C7993rj1;
import com.daaw.C8272sj1;
import com.daaw.J91;
import com.daaw.KC;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Pc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1872Pc0 {
    public final MG0 a;

    /* JADX INFO: renamed from: com.daaw.Pc0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[C3039a11.c.values().length];
            b = iArr;
            try {
                iArr[C3039a11.c.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[C3039a11.c.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C0428Bh0.c.values().length];
            a = iArr2;
            try {
                iArr2[C0428Bh0.c.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C0428Bh0.c.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C0428Bh0.c.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C1872Pc0(MG0 mg0) {
        this.a = mg0;
    }

    public final C4083dm0 a(KC kc, boolean z) {
        C4083dm0 c4083dm0P = C4083dm0.p(this.a.k(kc.g0()), this.a.v(kc.h0()), C7465pp0.h(kc.e0()));
        return z ? c4083dm0P.t() : c4083dm0P;
    }

    public List b(C5702jZ c5702jZ) {
        ArrayList arrayList = new ArrayList();
        for (C5702jZ.c cVar : c5702jZ.a0()) {
            arrayList.add(AbstractC5362iK.c.c(C6488mK.u(cVar.a0()), cVar.c0().equals(C5702jZ.c.EnumC0198c.ARRAY_CONFIG) ? AbstractC5362iK.c.a.CONTAINS : cVar.b0().equals(C5702jZ.c.b.ASCENDING) ? AbstractC5362iK.c.a.ASCENDING : AbstractC5362iK.c.a.DESCENDING));
        }
        return arrayList;
    }

    public C4083dm0 c(C0428Bh0 c0428Bh0) {
        int i = a.a[c0428Bh0.f0().ordinal()];
        if (i == 1) {
            return a(c0428Bh0.e0(), c0428Bh0.g0());
        }
        if (i == 2) {
            return f(c0428Bh0.h0(), c0428Bh0.g0());
        }
        if (i == 3) {
            return h(c0428Bh0.i0());
        }
        throw AbstractC6557mb.a("Unknown MaybeDocument %s", c0428Bh0);
    }

    public AbstractC9688xm0 d(C7993rj1 c7993rj1) {
        return this.a.l(c7993rj1);
    }

    public C9967ym0 e(C8272sj1 c8272sj1) {
        int iK0 = c8272sj1.k0();
        Timestamp timestampT = this.a.t(c8272sj1.l0());
        int iJ0 = c8272sj1.j0();
        ArrayList arrayList = new ArrayList(iJ0);
        for (int i = 0; i < iJ0; i++) {
            arrayList.add(this.a.l(c8272sj1.i0(i)));
        }
        ArrayList arrayList2 = new ArrayList(c8272sj1.n0());
        int i2 = 0;
        while (i2 < c8272sj1.n0()) {
            C7993rj1 c7993rj1M0 = c8272sj1.m0(i2);
            int i3 = i2 + 1;
            if (i3 >= c8272sj1.n0() || !c8272sj1.m0(i3).r0()) {
                arrayList2.add(this.a.l(c7993rj1M0));
            } else {
                AbstractC6557mb.d(c8272sj1.m0(i2).s0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                C7993rj1.b bVarV0 = C7993rj1.v0(c7993rj1M0);
                Iterator it = c8272sj1.m0(i3).l0().b0().iterator();
                while (it.hasNext()) {
                    bVarV0.x((C3930dD.c) it.next());
                }
                arrayList2.add(this.a.l((C7993rj1) bVarV0.n()));
                i2 = i3;
            }
            i2++;
        }
        return new C9967ym0(iK0, timestampT, arrayList, arrayList2);
    }

    public final C4083dm0 f(C4660fo0 c4660fo0, boolean z) {
        C4083dm0 c4083dm0R = C4083dm0.r(this.a.k(c4660fo0.d0()), this.a.v(c4660fo0.e0()));
        return z ? c4083dm0R.t() : c4083dm0R;
    }

    public C5000h11 g(C3039a11 c3039a11) {
        Z01 z01E;
        int iP0 = c3039a11.p0();
        CU0 cu0V = this.a.v(c3039a11.o0());
        CU0 cu0V2 = this.a.v(c3039a11.k0());
        AbstractC4340ei abstractC4340eiN0 = c3039a11.n0();
        long jL0 = c3039a11.l0();
        int i = a.b[c3039a11.q0().ordinal()];
        if (i == 1) {
            z01E = this.a.e(c3039a11.j0());
        } else {
            if (i != 2) {
                throw AbstractC6557mb.a("Unknown targetType %d", c3039a11.q0());
            }
            z01E = this.a.q(c3039a11.m0());
        }
        return new C5000h11(z01E, iP0, jL0, EnumC7573qC0.LISTEN, cu0V, cu0V2, abstractC4340eiN0, null);
    }

    public final C4083dm0 h(J91 j91) {
        return C4083dm0.s(this.a.k(j91.d0()), this.a.v(j91.e0()));
    }

    public final KC i(LC lc) {
        KC.b bVarK0 = KC.k0();
        bVarK0.y(this.a.I(lc.getKey()));
        bVarK0.x(lc.h().k());
        bVarK0.z(this.a.S(lc.k().c()));
        return (KC) bVarK0.n();
    }

    public C0428Bh0 j(LC lc) {
        C0428Bh0.b bVarJ0 = C0428Bh0.j0();
        if (lc.i()) {
            bVarJ0.z(m(lc));
        } else if (lc.b()) {
            bVarJ0.x(i(lc));
        } else {
            if (!lc.j()) {
                throw AbstractC6557mb.a("Cannot encode invalid document %s", lc);
            }
            bVarJ0.A(o(lc));
        }
        bVarJ0.y(lc.c());
        return (C0428Bh0) bVarJ0.n();
    }

    public C7993rj1 k(AbstractC9688xm0 abstractC9688xm0) {
        return this.a.L(abstractC9688xm0);
    }

    public C8272sj1 l(C9967ym0 c9967ym0) {
        C8272sj1.b bVarO0 = C8272sj1.o0();
        bVarO0.z(c9967ym0.e());
        bVarO0.A(this.a.S(c9967ym0.g()));
        Iterator it = c9967ym0.d().iterator();
        while (it.hasNext()) {
            bVarO0.x(this.a.L((AbstractC9688xm0) it.next()));
        }
        Iterator it2 = c9967ym0.h().iterator();
        while (it2.hasNext()) {
            bVarO0.y(this.a.L((AbstractC9688xm0) it2.next()));
        }
        return (C8272sj1) bVarO0.n();
    }

    public final C4660fo0 m(LC lc) {
        C4660fo0.b bVarF0 = C4660fo0.f0();
        bVarF0.x(this.a.I(lc.getKey()));
        bVarF0.y(this.a.S(lc.k().c()));
        return (C4660fo0) bVarF0.n();
    }

    public C3039a11 n(C5000h11 c5000h11) {
        EnumC7573qC0 enumC7573qC0 = EnumC7573qC0.LISTEN;
        AbstractC6557mb.d(enumC7573qC0.equals(c5000h11.c()), "Only queries with purpose %s may be stored, got %s", enumC7573qC0, c5000h11.c());
        C3039a11.b bVarR0 = C3039a11.r0();
        bVarR0.E(c5000h11.h()).A(c5000h11.e()).z(this.a.U(c5000h11.b())).D(this.a.U(c5000h11.f())).C(c5000h11.d());
        Z01 z01G = c5000h11.g();
        if (z01G.s()) {
            bVarR0.y(this.a.C(z01G));
        } else {
            bVarR0.B(this.a.P(z01G));
        }
        return (C3039a11) bVarR0.n();
    }

    public final J91 o(LC lc) {
        J91.b bVarF0 = J91.f0();
        bVarF0.x(this.a.I(lc.getKey()));
        bVarF0.y(this.a.S(lc.k().c()));
        return (J91) bVarF0.n();
    }
}
