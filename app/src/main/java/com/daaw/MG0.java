package com.daaw;

import com.daaw.AbstractC3191ab;
import com.daaw.AbstractC5738jg1;
import com.daaw.C0355Ap;
import com.daaw.C1839Ou;
import com.daaw.C3318b11;
import com.daaw.C3930dD;
import com.daaw.C4432f11;
import com.daaw.C4515fK;
import com.daaw.C4954gr0;
import com.daaw.C6390ly0;
import com.daaw.C7679qc0;
import com.daaw.C7993rj1;
import com.daaw.KC;
import com.daaw.LY0;
import com.daaw.Q31;
import com.daaw.UC;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MG0 {
    public final C3851cw a;
    public final String b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;
        public static final /* synthetic */ int[] h;
        public static final /* synthetic */ int[] i;
        public static final /* synthetic */ int[] j;
        public static final /* synthetic */ int[] k;
        public static final /* synthetic */ int[] l;
        public static final /* synthetic */ int[] m;

        static {
            int[] iArr = new int[C7679qc0.c.values().length];
            m = iArr;
            try {
                iArr[C7679qc0.c.TARGET_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m[C7679qc0.c.DOCUMENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m[C7679qc0.c.DOCUMENT_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                m[C7679qc0.c.DOCUMENT_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                m[C7679qc0.c.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                m[C7679qc0.c.RESPONSETYPE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[C4432f11.c.values().length];
            l = iArr2;
            try {
                iArr2[C4432f11.c.NO_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                l[C4432f11.c.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                l[C4432f11.c.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                l[C4432f11.c.CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                l[C4432f11.c.RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                l[C4432f11.c.UNRECOGNIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[LY0.e.values().length];
            k = iArr3;
            try {
                iArr3[LY0.e.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                k[LY0.e.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[LY0.f.b.values().length];
            j = iArr4;
            try {
                iArr4[LY0.f.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                j[LY0.f.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                j[LY0.f.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                j[LY0.f.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                j[LY0.f.b.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                j[LY0.f.b.GREATER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                j[LY0.f.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                j[LY0.f.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                j[LY0.f.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                j[LY0.f.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[C4515fK.b.values().length];
            i = iArr5;
            try {
                iArr5[C4515fK.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                i[C4515fK.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                i[C4515fK.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                i[C4515fK.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                i[C4515fK.b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                i[C4515fK.b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                i[C4515fK.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                i[C4515fK.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                i[C4515fK.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                i[C4515fK.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[LY0.k.b.values().length];
            h = iArr6;
            try {
                iArr6[LY0.k.b.IS_NAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                h[LY0.k.b.IS_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                h[LY0.k.b.IS_NOT_NAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                h[LY0.k.b.IS_NOT_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[LY0.h.b.values().length];
            g = iArr7;
            try {
                iArr7[LY0.h.b.COMPOSITE_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                g[LY0.h.b.FIELD_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                g[LY0.h.b.UNARY_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[LY0.d.b.values().length];
            f = iArr8;
            try {
                iArr8[LY0.d.b.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f[LY0.d.b.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[C0355Ap.a.values().length];
            e = iArr9;
            try {
                iArr9[C0355Ap.a.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                e[C0355Ap.a.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[EnumC7573qC0.values().length];
            d = iArr10;
            try {
                iArr10[EnumC7573qC0.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                d[EnumC7573qC0.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                d[EnumC7573qC0.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                d[EnumC7573qC0.LIMBO_RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            int[] iArr11 = new int[C3930dD.c.EnumC0166c.values().length];
            c = iArr11;
            try {
                iArr11[C3930dD.c.EnumC0166c.SET_TO_SERVER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                c[C3930dD.c.EnumC0166c.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                c[C3930dD.c.EnumC0166c.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                c[C3930dD.c.EnumC0166c.INCREMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            int[] iArr12 = new int[C6390ly0.c.values().length];
            b = iArr12;
            try {
                iArr12[C6390ly0.c.UPDATE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                b[C6390ly0.c.EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                b[C6390ly0.c.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            int[] iArr13 = new int[C7993rj1.c.values().length];
            a = iArr13;
            try {
                iArr13[C7993rj1.c.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                a[C7993rj1.c.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                a[C7993rj1.c.VERIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused59) {
            }
        }
    }

    public MG0(C3851cw c3851cw) {
        this.a = c3851cw;
        this.b = V(c3851cw).g();
    }

    public static UI0 V(C3851cw c3851cw) {
        return UI0.t(Arrays.asList("projects", c3851cw.k(), "databases", c3851cw.h()));
    }

    public static UI0 W(UI0 ui0) {
        AbstractC6557mb.d(ui0.p() > 4 && ui0.m(4).equals("documents"), "Tried to deserialize invalid key %s", ui0);
        return (UI0) ui0.q(5);
    }

    public static boolean Y(UI0 ui0) {
        return ui0.p() >= 4 && ui0.m(0).equals("projects") && ui0.m(2).equals("databases");
    }

    public KC A(TC tc, C7465pp0 c7465pp0) {
        KC.b bVarK0 = KC.k0();
        bVarK0.y(I(tc));
        bVarK0.x(c7465pp0.k());
        return (KC) bVarK0.n();
    }

    public final UC B(C5642jK c5642jK) {
        UC.b bVarG0 = UC.g0();
        Iterator it = c5642jK.b().iterator();
        while (it.hasNext()) {
            bVarG0.x(((C6488mK) it.next()).g());
        }
        return (UC) bVarG0.n();
    }

    public C3318b11.c C(Z01 z01) {
        C3318b11.c.a aVarG0 = C3318b11.c.g0();
        aVarG0.x(O(z01.n()));
        return (C3318b11.c) aVarG0.n();
    }

    public final LY0.f.b D(C4515fK.b bVar) {
        switch (a.i[bVar.ordinal()]) {
            case 1:
                return LY0.f.b.LESS_THAN;
            case 2:
                return LY0.f.b.LESS_THAN_OR_EQUAL;
            case 3:
                return LY0.f.b.EQUAL;
            case 4:
                return LY0.f.b.NOT_EQUAL;
            case 5:
                return LY0.f.b.GREATER_THAN;
            case 6:
                return LY0.f.b.GREATER_THAN_OR_EQUAL;
            case 7:
                return LY0.f.b.ARRAY_CONTAINS;
            case 8:
                return LY0.f.b.IN;
            case 9:
                return LY0.f.b.ARRAY_CONTAINS_ANY;
            case 10:
                return LY0.f.b.NOT_IN;
            default:
                throw AbstractC6557mb.a("Unknown operator %d", bVar);
        }
    }

    public final LY0.g E(C6488mK c6488mK) {
        return (LY0.g) LY0.g.d0().x(c6488mK.g()).n();
    }

    public final C3930dD.c F(C8161sK c8161sK) {
        InterfaceC6146l51 interfaceC6146l51B = c8161sK.b();
        if (interfaceC6146l51B instanceof C3426bQ0) {
            return (C3930dD.c) C3930dD.c.l0().y(c8161sK.a().g()).B(C3930dD.c.b.REQUEST_TIME).n();
        }
        if (interfaceC6146l51B instanceof AbstractC3191ab.b) {
            return (C3930dD.c) C3930dD.c.l0().y(c8161sK.a().g()).x(C3748cb.j0().x(((AbstractC3191ab.b) interfaceC6146l51B).f())).n();
        }
        if (interfaceC6146l51B instanceof AbstractC3191ab.a) {
            return (C3930dD.c) C3930dD.c.l0().y(c8161sK.a().g()).A(C3748cb.j0().x(((AbstractC3191ab.a) interfaceC6146l51B).f())).n();
        }
        if (interfaceC6146l51B instanceof C5501ip0) {
            return (C3930dD.c) C3930dD.c.l0().y(c8161sK.a().g()).z(((C5501ip0) interfaceC6146l51B).d()).n();
        }
        throw AbstractC6557mb.a("Unknown transform: %s", interfaceC6146l51B);
    }

    public LY0.h G(ZK zk) {
        if (zk instanceof C4515fK) {
            return T((C4515fK) zk);
        }
        if (zk instanceof C0355Ap) {
            return y((C0355Ap) zk);
        }
        throw AbstractC6557mb.a("Unrecognized filter type %s", zk.toString());
    }

    public final LY0.h H(List list) {
        return G(new C0355Ap(list, C0355Ap.a.AND));
    }

    public String I(TC tc) {
        return Q(this.a, tc.q());
    }

    public final String J(EnumC7573qC0 enumC7573qC0) {
        int i = a.d[enumC7573qC0.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "existence-filter-mismatch";
        }
        if (i == 3) {
            return "existence-filter-mismatch-bloom";
        }
        if (i == 4) {
            return "limbo-document";
        }
        throw AbstractC6557mb.a("Unrecognized query purpose: %s", enumC7573qC0);
    }

    public Map K(C5000h11 c5000h11) {
        String strJ = J(c5000h11.c());
        if (strJ == null) {
            return null;
        }
        HashMap map = new HashMap(1);
        map.put("goog-listen-tags", strJ);
        return map;
    }

    public C7993rj1 L(AbstractC9688xm0 abstractC9688xm0) {
        C7993rj1.b bVarU0 = C7993rj1.u0();
        if (abstractC9688xm0 instanceof C8744uQ0) {
            bVarU0.A(A(abstractC9688xm0.g(), ((C8744uQ0) abstractC9688xm0).o()));
        } else if (abstractC9688xm0 instanceof C5520it0) {
            bVarU0.A(A(abstractC9688xm0.g(), ((C5520it0) abstractC9688xm0).q()));
            bVarU0.B(B(abstractC9688xm0.e()));
        } else if (abstractC9688xm0 instanceof C2919Yy) {
            bVarU0.z(I(abstractC9688xm0.g()));
        } else {
            if (!(abstractC9688xm0 instanceof C9923yd1)) {
                throw AbstractC6557mb.a("unknown mutation type %s", abstractC9688xm0.getClass());
            }
            bVarU0.C(I(abstractC9688xm0.g()));
        }
        Iterator it = abstractC9688xm0.f().iterator();
        while (it.hasNext()) {
            bVarU0.x(F((C8161sK) it.next()));
        }
        if (!abstractC9688xm0.h().d()) {
            bVarU0.y(N(abstractC9688xm0.h()));
        }
        return (C7993rj1) bVarU0.n();
    }

    public final LY0.i M(C4954gr0 c4954gr0) {
        LY0.i.a aVarE0 = LY0.i.e0();
        if (c4954gr0.b().equals(C4954gr0.a.ASCENDING)) {
            aVarE0.x(LY0.e.ASCENDING);
        } else {
            aVarE0.x(LY0.e.DESCENDING);
        }
        aVarE0.y(E(c4954gr0.c()));
        return (LY0.i) aVarE0.n();
    }

    public final C6390ly0 N(C6669my0 c6669my0) {
        AbstractC6557mb.d(!c6669my0.d(), "Can't serialize an empty precondition", new Object[0]);
        C6390ly0.b bVarG0 = C6390ly0.g0();
        if (c6669my0.c() != null) {
            return (C6390ly0) bVarG0.y(U(c6669my0.c())).n();
        }
        if (c6669my0.b() != null) {
            return (C6390ly0) bVarG0.x(c6669my0.b().booleanValue()).n();
        }
        throw AbstractC6557mb.a("Unknown Precondition", new Object[0]);
    }

    public final String O(UI0 ui0) {
        return Q(this.a, ui0);
    }

    public C3318b11.d P(Z01 z01) {
        C3318b11.d.a aVarF0 = C3318b11.d.f0();
        LY0.b bVarX0 = LY0.x0();
        UI0 ui0N = z01.n();
        if (z01.d() != null) {
            AbstractC6557mb.d(ui0N.p() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            aVarF0.x(O(ui0N));
            LY0.c.a aVarE0 = LY0.c.e0();
            aVarE0.y(z01.d());
            aVarE0.x(true);
            bVarX0.x(aVarE0);
        } else {
            AbstractC6557mb.d(ui0N.p() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            aVarF0.x(O((UI0) ui0N.r()));
            LY0.c.a aVarE02 = LY0.c.e0();
            aVarE02.y(ui0N.l());
            bVarX0.x(aVarE02);
        }
        if (z01.h().size() > 0) {
            bVarX0.C(H(z01.h()));
        }
        Iterator it = z01.m().iterator();
        while (it.hasNext()) {
            bVarX0.y(M((C4954gr0) it.next()));
        }
        if (z01.r()) {
            bVarX0.A(C9474x00.d0().x((int) z01.j()));
        }
        if (z01.p() != null) {
            C1839Ou.b bVarG0 = C1839Ou.g0();
            bVarG0.x(z01.p().b());
            bVarG0.y(z01.p().c());
            bVarX0.B(bVarG0);
        }
        if (z01.f() != null) {
            C1839Ou.b bVarG02 = C1839Ou.g0();
            bVarG02.x(z01.f().b());
            bVarG02.y(!z01.f().c());
            bVarX0.z(bVarG02);
        }
        aVarF0.y(bVarX0);
        return (C3318b11.d) aVarF0.n();
    }

    public final String Q(C3851cw c3851cw, UI0 ui0) {
        return ((UI0) ((UI0) V(c3851cw).c("documents")).a(ui0)).g();
    }

    public C3318b11 R(C5000h11 c5000h11) {
        C3318b11.b bVarG0 = C3318b11.g0();
        Z01 z01G = c5000h11.g();
        if (z01G.s()) {
            bVarG0.x(C(z01G));
        } else {
            bVarG0.z(P(z01G));
        }
        bVarG0.C(c5000h11.h());
        if (!c5000h11.d().isEmpty() || c5000h11.f().compareTo(CU0.C) <= 0) {
            bVarG0.B(c5000h11.d());
        } else {
            bVarG0.A(S(c5000h11.f().c()));
        }
        if (c5000h11.a() != null && (!c5000h11.d().isEmpty() || c5000h11.f().compareTo(CU0.C) > 0)) {
            bVarG0.y(C9474x00.d0().x(c5000h11.a().intValue()));
        }
        return (C3318b11) bVarG0.n();
    }

    public Q31 S(Timestamp timestamp) {
        Q31.b bVarF0 = Q31.f0();
        bVarF0.y(timestamp.g());
        bVarF0.x(timestamp.c());
        return (Q31) bVarF0.n();
    }

    public LY0.h T(C4515fK c4515fK) {
        C4515fK.b bVarH = c4515fK.h();
        C4515fK.b bVar = C4515fK.b.EQUAL;
        if (bVarH == bVar || c4515fK.h() == C4515fK.b.NOT_EQUAL) {
            LY0.k.a aVarF0 = LY0.k.f0();
            aVarF0.x(E(c4515fK.g()));
            if (AbstractC0513Cc1.y(c4515fK.i())) {
                aVarF0.y(c4515fK.h() == bVar ? LY0.k.b.IS_NAN : LY0.k.b.IS_NOT_NAN);
                return (LY0.h) LY0.h.i0().z(aVarF0).n();
            }
            if (AbstractC0513Cc1.z(c4515fK.i())) {
                aVarF0.y(c4515fK.h() == bVar ? LY0.k.b.IS_NULL : LY0.k.b.IS_NOT_NULL);
                return (LY0.h) LY0.h.i0().z(aVarF0).n();
            }
        }
        LY0.f.a aVarH0 = LY0.f.h0();
        aVarH0.x(E(c4515fK.g()));
        aVarH0.y(D(c4515fK.h()));
        aVarH0.z(c4515fK.i());
        return (LY0.h) LY0.h.i0().y(aVarH0).n();
    }

    public Q31 U(CU0 cu0) {
        return S(cu0.c());
    }

    public final C6262lX0 X(C5974kX0 c5974kX0) {
        return C6262lX0.h(c5974kX0.a0()).q(c5974kX0.c0());
    }

    public String a() {
        return this.b;
    }

    public C0355Ap b(LY0.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = dVar.f0().iterator();
        while (it.hasNext()) {
            arrayList.add(i((LY0.h) it.next()));
        }
        return new C0355Ap(arrayList, c(dVar.g0()));
    }

    public C0355Ap.a c(LY0.d.b bVar) {
        int i = a.f[bVar.ordinal()];
        if (i == 1) {
            return C0355Ap.a.AND;
        }
        if (i == 2) {
            return C0355Ap.a.OR;
        }
        throw AbstractC6557mb.a("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    public final C5642jK d(UC uc) {
        int iF0 = uc.f0();
        HashSet hashSet = new HashSet(iF0);
        for (int i = 0; i < iF0; i++) {
            hashSet.add(C6488mK.u(uc.e0(i)));
        }
        return C5642jK.a(hashSet);
    }

    public Z01 e(C3318b11.c cVar) {
        int iF0 = cVar.f0();
        AbstractC6557mb.d(iF0 == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(iF0));
        return C5890kC0.b(p(cVar.e0(0))).z();
    }

    public C4515fK f(LY0.f fVar) {
        return C4515fK.f(C6488mK.u(fVar.e0().c0()), g(fVar.f0()), fVar.g0());
    }

    public final C4515fK.b g(LY0.f.b bVar) {
        switch (a.j[bVar.ordinal()]) {
            case 1:
                return C4515fK.b.LESS_THAN;
            case 2:
                return C4515fK.b.LESS_THAN_OR_EQUAL;
            case 3:
                return C4515fK.b.EQUAL;
            case 4:
                return C4515fK.b.NOT_EQUAL;
            case 5:
                return C4515fK.b.GREATER_THAN_OR_EQUAL;
            case 6:
                return C4515fK.b.GREATER_THAN;
            case 7:
                return C4515fK.b.ARRAY_CONTAINS;
            case 8:
                return C4515fK.b.IN;
            case 9:
                return C4515fK.b.ARRAY_CONTAINS_ANY;
            case 10:
                return C4515fK.b.NOT_IN;
            default:
                throw AbstractC6557mb.a("Unhandled FieldFilter.operator %d", bVar);
        }
    }

    public final C8161sK h(C3930dD.c cVar) {
        int i = a.c[cVar.k0().ordinal()];
        if (i == 1) {
            AbstractC6557mb.d(cVar.j0() == C3930dD.c.b.REQUEST_TIME, "Unknown transform setToServerValue: %s", cVar.j0());
            return new C8161sK(C6488mK.u(cVar.g0()), C3426bQ0.d());
        }
        if (i == 2) {
            return new C8161sK(C6488mK.u(cVar.g0()), new AbstractC3191ab.b(cVar.f0().g()));
        }
        if (i == 3) {
            return new C8161sK(C6488mK.u(cVar.g0()), new AbstractC3191ab.a(cVar.i0().g()));
        }
        if (i == 4) {
            return new C8161sK(C6488mK.u(cVar.g0()), new C5501ip0(cVar.h0()));
        }
        throw AbstractC6557mb.a("Unknown FieldTransform proto: %s", cVar);
    }

    public ZK i(LY0.h hVar) {
        int i = a.g[hVar.g0().ordinal()];
        if (i == 1) {
            return b(hVar.d0());
        }
        if (i == 2) {
            return f(hVar.f0());
        }
        if (i == 3) {
            return u(hVar.h0());
        }
        throw AbstractC6557mb.a("Unrecognized Filter.filterType %d", hVar.g0());
    }

    public final List j(LY0.h hVar) {
        ZK zkI = i(hVar);
        if (zkI instanceof C0355Ap) {
            C0355Ap c0355Ap = (C0355Ap) zkI;
            if (c0355Ap.l()) {
                return c0355Ap.b();
            }
        }
        return Collections.singletonList(zkI);
    }

    public TC k(String str) {
        UI0 ui0S = s(str);
        AbstractC6557mb.d(ui0S.m(1).equals(this.a.k()), "Tried to deserialize key from different project.", new Object[0]);
        AbstractC6557mb.d(ui0S.m(3).equals(this.a.h()), "Tried to deserialize key from different database.", new Object[0]);
        return TC.l(W(ui0S));
    }

    public AbstractC9688xm0 l(C7993rj1 c7993rj1) {
        C6669my0 c6669my0O = c7993rj1.q0() ? o(c7993rj1.i0()) : C6669my0.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = c7993rj1.o0().iterator();
        while (it.hasNext()) {
            arrayList.add(h((C3930dD.c) it.next()));
        }
        int i = a.a[c7993rj1.k0().ordinal()];
        if (i == 1) {
            return c7993rj1.t0() ? new C5520it0(k(c7993rj1.m0().g0()), C7465pp0.h(c7993rj1.m0().e0()), d(c7993rj1.n0()), c6669my0O, arrayList) : new C8744uQ0(k(c7993rj1.m0().g0()), C7465pp0.h(c7993rj1.m0().e0()), c6669my0O, arrayList);
        }
        if (i == 2) {
            return new C2919Yy(k(c7993rj1.j0()), c6669my0O);
        }
        if (i == 3) {
            return new C9923yd1(k(c7993rj1.p0()), c6669my0O);
        }
        throw AbstractC6557mb.a("Unknown mutation operation: %d", c7993rj1.k0());
    }

    public C0448Bm0 m(C9116vj1 c9116vj1, CU0 cu0) {
        CU0 cu0V = v(c9116vj1.c0());
        if (!CU0.C.equals(cu0V)) {
            cu0 = cu0V;
        }
        int iB0 = c9116vj1.b0();
        ArrayList arrayList = new ArrayList(iB0);
        for (int i = 0; i < iB0; i++) {
            arrayList.add(c9116vj1.a0(i));
        }
        return new C0448Bm0(cu0, arrayList);
    }

    public final C4954gr0 n(LY0.i iVar) {
        C4954gr0.a aVar;
        C6488mK c6488mKU = C6488mK.u(iVar.d0().c0());
        int i = a.k[iVar.c0().ordinal()];
        if (i == 1) {
            aVar = C4954gr0.a.ASCENDING;
        } else {
            if (i != 2) {
                throw AbstractC6557mb.a("Unrecognized direction %d", iVar.c0());
            }
            aVar = C4954gr0.a.DESCENDING;
        }
        return C4954gr0.d(aVar, c6488mKU);
    }

    public final C6669my0 o(C6390ly0 c6390ly0) {
        int i = a.b[c6390ly0.c0().ordinal()];
        if (i == 1) {
            return C6669my0.f(v(c6390ly0.f0()));
        }
        if (i == 2) {
            return C6669my0.a(c6390ly0.e0());
        }
        if (i == 3) {
            return C6669my0.c;
        }
        throw AbstractC6557mb.a("Unknown precondition", new Object[0]);
    }

    public final UI0 p(String str) {
        UI0 ui0S = s(str);
        return ui0S.p() == 4 ? UI0.C : W(ui0S);
    }

    public Z01 q(C3318b11.d dVar) {
        return r(dVar.d0(), dVar.e0());
    }

    public Z01 r(String str, LY0 ly0) {
        UI0 ui0;
        String strD0;
        List arrayList;
        UI0 ui0P = p(str);
        int iN0 = ly0.n0();
        if (iN0 <= 0) {
            ui0 = ui0P;
            strD0 = null;
        } else {
            AbstractC6557mb.d(iN0 == 1, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
            LY0.c cVarM0 = ly0.m0(0);
            if (cVarM0.c0()) {
                ui0 = ui0P;
                strD0 = cVarM0.d0();
            } else {
                ui0P = (UI0) ui0P.c(cVarM0.d0());
                ui0 = ui0P;
                strD0 = null;
            }
        }
        List listJ = ly0.w0() ? j(ly0.s0()) : Collections.EMPTY_LIST;
        int iQ0 = ly0.q0();
        if (iQ0 > 0) {
            arrayList = new ArrayList(iQ0);
            for (int i = 0; i < iQ0; i++) {
                arrayList.add(n(ly0.p0(i)));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        return new Z01(ui0, strD0, listJ, arrayList, ly0.u0() ? ly0.o0().c0() : -1L, ly0.v0() ? new C7976rg(ly0.r0().g(), ly0.r0().e0()) : null, ly0.t0() ? new C7976rg(ly0.l0().g(), !ly0.l0().e0()) : null);
    }

    public final UI0 s(String str) {
        UI0 ui0U = UI0.u(str);
        AbstractC6557mb.d(Y(ui0U), "Tried to deserialize invalid key %s", ui0U);
        return ui0U;
    }

    public Timestamp t(Q31 q31) {
        return new Timestamp(q31.e0(), q31.d0());
    }

    public final ZK u(LY0.k kVar) {
        C6488mK c6488mKU = C6488mK.u(kVar.d0().c0());
        int i = a.h[kVar.e0().ordinal()];
        if (i == 1) {
            return C4515fK.f(c6488mKU, C4515fK.b.EQUAL, AbstractC0513Cc1.a);
        }
        if (i == 2) {
            return C4515fK.f(c6488mKU, C4515fK.b.EQUAL, AbstractC0513Cc1.b);
        }
        if (i == 3) {
            return C4515fK.f(c6488mKU, C4515fK.b.NOT_EQUAL, AbstractC0513Cc1.a);
        }
        if (i == 4) {
            return C4515fK.f(c6488mKU, C4515fK.b.NOT_EQUAL, AbstractC0513Cc1.b);
        }
        throw AbstractC6557mb.a("Unrecognized UnaryFilter.operator %d", kVar.e0());
    }

    public CU0 v(Q31 q31) {
        return (q31.e0() == 0 && q31.d0() == 0) ? CU0.C : new CU0(t(q31));
    }

    public CU0 w(C7679qc0 c7679qc0) {
        return c7679qc0.f0() != C7679qc0.c.TARGET_CHANGE ? CU0.C : c7679qc0.g0().f0() != 0 ? CU0.C : v(c7679qc0.g0().c0());
    }

    public AbstractC5738jg1 x(C7679qc0 c7679qc0) {
        AbstractC5738jg1.e eVar;
        int i = a.m[c7679qc0.f0().ordinal()];
        C6262lX0 c6262lX0X = null;
        if (i == 1) {
            C4432f11 c4432f11G0 = c7679qc0.g0();
            int i2 = a.l[c4432f11G0.e0().ordinal()];
            if (i2 == 1) {
                eVar = AbstractC5738jg1.e.NoChange;
            } else if (i2 == 2) {
                eVar = AbstractC5738jg1.e.Added;
            } else if (i2 == 3) {
                eVar = AbstractC5738jg1.e.Removed;
                c6262lX0X = X(c4432f11G0.a0());
            } else if (i2 == 4) {
                eVar = AbstractC5738jg1.e.Current;
            } else {
                if (i2 != 5) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                eVar = AbstractC5738jg1.e.Reset;
            }
            return new AbstractC5738jg1.d(eVar, c4432f11G0.g0(), c4432f11G0.d0(), c6262lX0X);
        }
        if (i == 2) {
            MC mcB0 = c7679qc0.b0();
            List listD0 = mcB0.d0();
            List listC0 = mcB0.c0();
            TC tcK = k(mcB0.b0().g0());
            CU0 cu0V = v(mcB0.b0().h0());
            AbstractC6557mb.d(!cu0V.equals(CU0.C), "Got a document change without an update time", new Object[0]);
            C4083dm0 c4083dm0P = C4083dm0.p(tcK, cu0V, C7465pp0.h(mcB0.b0().e0()));
            return new AbstractC5738jg1.b(listD0, listC0, c4083dm0P.getKey(), c4083dm0P);
        }
        if (i == 3) {
            QC qcC0 = c7679qc0.c0();
            List listD02 = qcC0.d0();
            C4083dm0 c4083dm0R = C4083dm0.r(k(qcC0.b0()), v(qcC0.c0()));
            return new AbstractC5738jg1.b(Collections.EMPTY_LIST, listD02, c4083dm0R.getKey(), c4083dm0R);
        }
        if (i == 4) {
            ZC zcD0 = c7679qc0.d0();
            return new AbstractC5738jg1.b(Collections.EMPTY_LIST, zcD0.c0(), k(zcD0.b0()), null);
        }
        if (i != 5) {
            throw new IllegalArgumentException("Unknown change type set");
        }
        PI piE0 = c7679qc0.e0();
        return new AbstractC5738jg1.c(piE0.c0(), new QI(piE0.a0(), piE0.d0()));
    }

    public LY0.h y(C0355Ap c0355Ap) {
        ArrayList arrayList = new ArrayList(c0355Ap.b().size());
        Iterator it = c0355Ap.b().iterator();
        while (it.hasNext()) {
            arrayList.add(G((ZK) it.next()));
        }
        if (arrayList.size() == 1) {
            return (LY0.h) arrayList.get(0);
        }
        LY0.d.a aVarH0 = LY0.d.h0();
        aVarH0.y(z(c0355Ap.h()));
        aVarH0.x(arrayList);
        return (LY0.h) LY0.h.i0().x(aVarH0).n();
    }

    public LY0.d.b z(C0355Ap.a aVar) {
        int i = a.e[aVar.ordinal()];
        if (i == 1) {
            return LY0.d.b.AND;
        }
        if (i == 2) {
            return LY0.d.b.OR;
        }
        throw AbstractC6557mb.a("Unrecognized composite filter type.", new Object[0]);
    }
}
