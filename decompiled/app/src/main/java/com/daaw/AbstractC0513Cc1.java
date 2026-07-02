package com.daaw;

import com.daaw.C6564mc1;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.Cc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0513Cc1 {
    public static final C6564mc1 a = (C6564mc1) C6564mc1.x0().B(Double.NaN).n();
    public static final C6564mc1 b;
    public static final C6564mc1 c;
    public static final C6564mc1 d;
    public static final C6564mc1 e;

    /* JADX INFO: renamed from: com.daaw.Cc1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C6564mc1.c.values().length];
            a = iArr;
            try {
                iArr[C6564mc1.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C6564mc1.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C6564mc1.c.INTEGER_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C6564mc1.c.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C6564mc1.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[C6564mc1.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[C6564mc1.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[C6564mc1.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[C6564mc1.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[C6564mc1.c.ARRAY_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[C6564mc1.c.MAP_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        C6564mc1 c6564mc1 = (C6564mc1) C6564mc1.x0().H(EnumC2464Uo0.NULL_VALUE).n();
        b = c6564mc1;
        c = c6564mc1;
        C6564mc1 c6564mc12 = (C6564mc1) C6564mc1.x0().K("__max__").n();
        d = c6564mc12;
        e = (C6564mc1) C6564mc1.x0().E(C0745Eg0.j0().z("__type__", c6564mc12)).n();
    }

    public static boolean A(C6564mc1 c6564mc1) {
        return v(c6564mc1) || u(c6564mc1);
    }

    public static boolean B(C6564mc1 c6564mc1) {
        return c6564mc1 != null && c6564mc1.w0() == C6564mc1.c.REFERENCE_VALUE;
    }

    public static int C(C6564mc1 c6564mc1, boolean z, C6564mc1 c6564mc12, boolean z2) {
        int i = i(c6564mc1, c6564mc12);
        if (i != 0) {
            return i;
        }
        if (!z || z2) {
            return (z || !z2) ? 0 : 1;
        }
        return -1;
    }

    public static boolean D(C6564mc1 c6564mc1, C6564mc1 c6564mc12) {
        C6564mc1.c cVarW0 = c6564mc1.w0();
        C6564mc1.c cVar = C6564mc1.c.INTEGER_VALUE;
        if (cVarW0 == cVar && c6564mc12.w0() == cVar) {
            return c6564mc1.r0() == c6564mc12.r0();
        }
        C6564mc1.c cVarW02 = c6564mc1.w0();
        C6564mc1.c cVar2 = C6564mc1.c.DOUBLE_VALUE;
        return cVarW02 == cVar2 && c6564mc12.w0() == cVar2 && Double.doubleToLongBits(c6564mc1.p0()) == Double.doubleToLongBits(c6564mc12.p0());
    }

    public static boolean E(C6564mc1 c6564mc1, C6564mc1 c6564mc12) {
        C0745Eg0 c0745Eg0S0 = c6564mc1.s0();
        C0745Eg0 c0745Eg0S02 = c6564mc12.s0();
        if (c0745Eg0S0.c0() != c0745Eg0S02.c0()) {
            return false;
        }
        for (Map.Entry entry : c0745Eg0S0.d0().entrySet()) {
            if (!q((C6564mc1) entry.getValue(), (C6564mc1) c0745Eg0S02.d0().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static C6564mc1 F(C3851cw c3851cw, TC tc) {
        return (C6564mc1) C6564mc1.x0().J(String.format("projects/%s/databases/%s/documents/%s", c3851cw.k(), c3851cw.h(), tc.toString())).n();
    }

    public static int G(C6564mc1 c6564mc1) {
        switch (a.a[c6564mc1.w0().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                if (AbstractC3704cQ0.c(c6564mc1)) {
                    return 4;
                }
                return x(c6564mc1) ? Integer.MAX_VALUE : 10;
            default:
                throw AbstractC6557mb.a("Invalid value type: " + c6564mc1.w0(), new Object[0]);
        }
    }

    public static int H(C6564mc1 c6564mc1, boolean z, C6564mc1 c6564mc12, boolean z2) {
        int i = i(c6564mc1, c6564mc12);
        if (i != 0) {
            return i;
        }
        if (!z || z2) {
            return (z || !z2) ? 0 : -1;
        }
        return 1;
    }

    public static boolean a(C6564mc1 c6564mc1, C6564mc1 c6564mc12) {
        C3748cb c3748cbL0 = c6564mc1.l0();
        C3748cb c3748cbL02 = c6564mc12.l0();
        if (c3748cbL0.i0() != c3748cbL02.i0()) {
            return false;
        }
        for (int i = 0; i < c3748cbL0.i0(); i++) {
            if (!q(c3748cbL0.h0(i), c3748cbL02.h0(i))) {
                return false;
            }
        }
        return true;
    }

    public static String b(C6564mc1 c6564mc1) {
        StringBuilder sb = new StringBuilder();
        h(sb, c6564mc1);
        return sb.toString();
    }

    public static void c(StringBuilder sb, C3748cb c3748cb) {
        sb.append("[");
        for (int i = 0; i < c3748cb.i0(); i++) {
            h(sb, c3748cb.h0(i));
            if (i != c3748cb.i0() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    public static void d(StringBuilder sb, C4471f90 c4471f90) {
        sb.append(String.format("geo(%s,%s)", Double.valueOf(c4471f90.d0()), Double.valueOf(c4471f90.e0())));
    }

    public static void e(StringBuilder sb, C0745Eg0 c0745Eg0) {
        ArrayList<String> arrayList = new ArrayList(c0745Eg0.d0().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z = true;
        for (String str : arrayList) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
            sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            h(sb, c0745Eg0.f0(str));
        }
        sb.append("}");
    }

    public static void f(StringBuilder sb, C6564mc1 c6564mc1) {
        AbstractC6557mb.d(B(c6564mc1), "Value should be a ReferenceValue", new Object[0]);
        sb.append(TC.k(c6564mc1.t0()));
    }

    public static void g(StringBuilder sb, Q31 q31) {
        sb.append(String.format("time(%s,%s)", Long.valueOf(q31.e0()), Integer.valueOf(q31.d0())));
    }

    public static void h(StringBuilder sb, C6564mc1 c6564mc1) {
        switch (a.a[c6564mc1.w0().ordinal()]) {
            case 1:
                sb.append("null");
                return;
            case 2:
                sb.append(c6564mc1.m0());
                return;
            case 3:
                sb.append(c6564mc1.r0());
                return;
            case 4:
                sb.append(c6564mc1.p0());
                return;
            case 5:
                g(sb, c6564mc1.v0());
                return;
            case 6:
                sb.append(c6564mc1.u0());
                return;
            case 7:
                sb.append(AbstractC6838nb1.v(c6564mc1.n0()));
                return;
            case 8:
                f(sb, c6564mc1);
                return;
            case 9:
                d(sb, c6564mc1.q0());
                return;
            case 10:
                c(sb, c6564mc1.l0());
                return;
            case 11:
                e(sb, c6564mc1.s0());
                return;
            default:
                throw AbstractC6557mb.a("Invalid value type: " + c6564mc1.w0(), new Object[0]);
        }
    }

    public static int i(C6564mc1 c6564mc1, C6564mc1 c6564mc12) {
        int iG = G(c6564mc1);
        int iG2 = G(c6564mc12);
        if (iG != iG2) {
            return AbstractC6838nb1.l(iG, iG2);
        }
        if (iG != Integer.MAX_VALUE) {
            switch (iG) {
                case 0:
                    break;
                case 1:
                    return AbstractC6838nb1.h(c6564mc1.m0(), c6564mc12.m0());
                case 2:
                    return m(c6564mc1, c6564mc12);
                case 3:
                    return o(c6564mc1.v0(), c6564mc12.v0());
                case 4:
                    return o(AbstractC3704cQ0.a(c6564mc1), AbstractC3704cQ0.a(c6564mc12));
                case 5:
                    return c6564mc1.u0().compareTo(c6564mc12.u0());
                case 6:
                    return AbstractC6838nb1.j(c6564mc1.n0(), c6564mc12.n0());
                case 7:
                    return n(c6564mc1.t0(), c6564mc12.t0());
                case 8:
                    return k(c6564mc1.q0(), c6564mc12.q0());
                case 9:
                    return j(c6564mc1.l0(), c6564mc12.l0());
                case 10:
                    return l(c6564mc1.s0(), c6564mc12.s0());
                default:
                    throw AbstractC6557mb.a("Invalid value type: " + iG, new Object[0]);
            }
        }
        return 0;
    }

    public static int j(C3748cb c3748cb, C3748cb c3748cb2) {
        int iMin = Math.min(c3748cb.i0(), c3748cb2.i0());
        for (int i = 0; i < iMin; i++) {
            int i2 = i(c3748cb.h0(i), c3748cb2.h0(i));
            if (i2 != 0) {
                return i2;
            }
        }
        return AbstractC6838nb1.l(c3748cb.i0(), c3748cb2.i0());
    }

    public static int k(C4471f90 c4471f90, C4471f90 c4471f902) {
        int iK = AbstractC6838nb1.k(c4471f90.d0(), c4471f902.d0());
        return iK == 0 ? AbstractC6838nb1.k(c4471f90.e0(), c4471f902.e0()) : iK;
    }

    public static int l(C0745Eg0 c0745Eg0, C0745Eg0 c0745Eg02) {
        Iterator it = new TreeMap(c0745Eg0.d0()).entrySet().iterator();
        Iterator it2 = new TreeMap(c0745Eg02.d0()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int iCompareTo = ((String) entry.getKey()).compareTo((String) entry2.getKey());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int i = i((C6564mc1) entry.getValue(), (C6564mc1) entry2.getValue());
            if (i != 0) {
                return i;
            }
        }
        return AbstractC6838nb1.h(it.hasNext(), it2.hasNext());
    }

    public static int m(C6564mc1 c6564mc1, C6564mc1 c6564mc12) {
        C6564mc1.c cVarW0 = c6564mc1.w0();
        C6564mc1.c cVar = C6564mc1.c.DOUBLE_VALUE;
        if (cVarW0 == cVar) {
            double dP0 = c6564mc1.p0();
            if (c6564mc12.w0() == cVar) {
                return AbstractC6838nb1.k(dP0, c6564mc12.p0());
            }
            if (c6564mc12.w0() == C6564mc1.c.INTEGER_VALUE) {
                return AbstractC6838nb1.n(dP0, c6564mc12.r0());
            }
        } else {
            C6564mc1.c cVarW02 = c6564mc1.w0();
            C6564mc1.c cVar2 = C6564mc1.c.INTEGER_VALUE;
            if (cVarW02 == cVar2) {
                long jR0 = c6564mc1.r0();
                if (c6564mc12.w0() == cVar2) {
                    return AbstractC6838nb1.m(jR0, c6564mc12.r0());
                }
                if (c6564mc12.w0() == cVar) {
                    return AbstractC6838nb1.n(c6564mc12.p0(), jR0) * (-1);
                }
            }
        }
        throw AbstractC6557mb.a("Unexpected values: %s vs %s", c6564mc1, c6564mc12);
    }

    public static int n(String str, String str2) {
        String[] strArrSplit = str.split("/", -1);
        String[] strArrSplit2 = str2.split("/", -1);
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = strArrSplit[i].compareTo(strArrSplit2[i]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return AbstractC6838nb1.l(strArrSplit.length, strArrSplit2.length);
    }

    public static int o(Q31 q31, Q31 q312) {
        int iM = AbstractC6838nb1.m(q31.e0(), q312.e0());
        return iM != 0 ? iM : AbstractC6838nb1.l(q31.d0(), q312.d0());
    }

    public static boolean p(InterfaceC4305eb interfaceC4305eb, C6564mc1 c6564mc1) {
        Iterator it = interfaceC4305eb.g().iterator();
        while (it.hasNext()) {
            if (q((C6564mc1) it.next(), c6564mc1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(C6564mc1 c6564mc1, C6564mc1 c6564mc12) {
        int iG;
        if (c6564mc1 == c6564mc12) {
            return true;
        }
        if (c6564mc1 == null || c6564mc12 == null || (iG = G(c6564mc1)) != G(c6564mc12)) {
            return false;
        }
        if (iG == 2) {
            return D(c6564mc1, c6564mc12);
        }
        if (iG == 4) {
            return AbstractC3704cQ0.a(c6564mc1).equals(AbstractC3704cQ0.a(c6564mc12));
        }
        if (iG != Integer.MAX_VALUE) {
            return iG != 9 ? iG != 10 ? c6564mc1.equals(c6564mc12) : E(c6564mc1, c6564mc12) : a(c6564mc1, c6564mc12);
        }
        return true;
    }

    public static C6564mc1 r(C6564mc1.c cVar) {
        switch (a.a[cVar.ordinal()]) {
            case 1:
                return b;
            case 2:
                return (C6564mc1) C6564mc1.x0().z(false).n();
            case 3:
            case 4:
                return (C6564mc1) C6564mc1.x0().B(Double.NaN).n();
            case 5:
                return (C6564mc1) C6564mc1.x0().L(Q31.f0().y(Long.MIN_VALUE)).n();
            case 6:
                return (C6564mc1) C6564mc1.x0().K("").n();
            case 7:
                return (C6564mc1) C6564mc1.x0().A(AbstractC4340ei.C).n();
            case 8:
                return F(C3851cw.D, TC.g());
            case 9:
                return (C6564mc1) C6564mc1.x0().C(C4471f90.f0().x(-90.0d).y(-180.0d)).n();
            case 10:
                return (C6564mc1) C6564mc1.x0().y(C3748cb.g0()).n();
            case 11:
                return (C6564mc1) C6564mc1.x0().G(C0745Eg0.b0()).n();
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
    }

    public static C6564mc1 s(C6564mc1.c cVar) {
        switch (a.a[cVar.ordinal()]) {
            case 1:
                return r(C6564mc1.c.BOOLEAN_VALUE);
            case 2:
                return r(C6564mc1.c.INTEGER_VALUE);
            case 3:
            case 4:
                return r(C6564mc1.c.TIMESTAMP_VALUE);
            case 5:
                return r(C6564mc1.c.STRING_VALUE);
            case 6:
                return r(C6564mc1.c.BYTES_VALUE);
            case 7:
                return r(C6564mc1.c.REFERENCE_VALUE);
            case 8:
                return r(C6564mc1.c.GEO_POINT_VALUE);
            case 9:
                return r(C6564mc1.c.ARRAY_VALUE);
            case 10:
                return r(C6564mc1.c.MAP_VALUE);
            case 11:
                return e;
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
    }

    public static boolean t(C6564mc1 c6564mc1) {
        return c6564mc1 != null && c6564mc1.w0() == C6564mc1.c.ARRAY_VALUE;
    }

    public static boolean u(C6564mc1 c6564mc1) {
        return c6564mc1 != null && c6564mc1.w0() == C6564mc1.c.DOUBLE_VALUE;
    }

    public static boolean v(C6564mc1 c6564mc1) {
        return c6564mc1 != null && c6564mc1.w0() == C6564mc1.c.INTEGER_VALUE;
    }

    public static boolean w(C6564mc1 c6564mc1) {
        return c6564mc1 != null && c6564mc1.w0() == C6564mc1.c.MAP_VALUE;
    }

    public static boolean x(C6564mc1 c6564mc1) {
        return d.equals(c6564mc1.s0().d0().get("__type__"));
    }

    public static boolean y(C6564mc1 c6564mc1) {
        return c6564mc1 != null && Double.isNaN(c6564mc1.p0());
    }

    public static boolean z(C6564mc1 c6564mc1) {
        return c6564mc1 != null && c6564mc1.w0() == C6564mc1.c.NULL_VALUE;
    }
}
