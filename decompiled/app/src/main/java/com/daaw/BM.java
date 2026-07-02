package com.daaw;

import com.daaw.C6564mc1;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class BM {
    public static final BM a = new BM();

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
                a[C6564mc1.c.DOUBLE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C6564mc1.c.INTEGER_VALUE.ordinal()] = 4;
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
                a[C6564mc1.c.MAP_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[C6564mc1.c.ARRAY_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public final void a(C3748cb c3748cb, AbstractC3090aC abstractC3090aC) {
        i(abstractC3090aC, 50);
        Iterator it = c3748cb.g().iterator();
        while (it.hasNext()) {
            f((C6564mc1) it.next(), abstractC3090aC);
        }
    }

    public final void b(String str, AbstractC3090aC abstractC3090aC) {
        i(abstractC3090aC, 37);
        UI0 ui0U = UI0.u(str);
        int iP = ui0U.p();
        for (int i = 5; i < iP; i++) {
            String strM = ui0U.m(i);
            i(abstractC3090aC, 60);
            h(strM, abstractC3090aC);
        }
    }

    public final void c(C0745Eg0 c0745Eg0, AbstractC3090aC abstractC3090aC) {
        i(abstractC3090aC, 55);
        for (Map.Entry entry : c0745Eg0.d0().entrySet()) {
            String str = (String) entry.getKey();
            C6564mc1 c6564mc1 = (C6564mc1) entry.getValue();
            d(str, abstractC3090aC);
            f(c6564mc1, abstractC3090aC);
        }
    }

    public final void d(String str, AbstractC3090aC abstractC3090aC) {
        i(abstractC3090aC, 25);
        h(str, abstractC3090aC);
    }

    public void e(C6564mc1 c6564mc1, AbstractC3090aC abstractC3090aC) {
        f(c6564mc1, abstractC3090aC);
        abstractC3090aC.c();
    }

    public final void f(C6564mc1 c6564mc1, AbstractC3090aC abstractC3090aC) {
        switch (a.a[c6564mc1.w0().ordinal()]) {
            case 1:
                i(abstractC3090aC, 5);
                return;
            case 2:
                i(abstractC3090aC, 10);
                abstractC3090aC.d(c6564mc1.m0() ? 1L : 0L);
                return;
            case 3:
                double dP0 = c6564mc1.p0();
                if (Double.isNaN(dP0)) {
                    i(abstractC3090aC, 13);
                    return;
                }
                i(abstractC3090aC, 15);
                if (dP0 == -0.0d) {
                    abstractC3090aC.b(0.0d);
                    return;
                } else {
                    abstractC3090aC.b(dP0);
                    return;
                }
            case 4:
                i(abstractC3090aC, 15);
                abstractC3090aC.b(c6564mc1.r0());
                return;
            case 5:
                Q31 q31V0 = c6564mc1.v0();
                i(abstractC3090aC, 20);
                abstractC3090aC.d(q31V0.e0());
                abstractC3090aC.d(q31V0.d0());
                return;
            case 6:
                d(c6564mc1.u0(), abstractC3090aC);
                g(abstractC3090aC);
                return;
            case 7:
                i(abstractC3090aC, 30);
                abstractC3090aC.a(c6564mc1.n0());
                g(abstractC3090aC);
                return;
            case 8:
                b(c6564mc1.t0(), abstractC3090aC);
                return;
            case 9:
                C4471f90 c4471f90Q0 = c6564mc1.q0();
                i(abstractC3090aC, 45);
                abstractC3090aC.b(c4471f90Q0.d0());
                abstractC3090aC.b(c4471f90Q0.e0());
                return;
            case 10:
                if (AbstractC0513Cc1.x(c6564mc1)) {
                    i(abstractC3090aC, Integer.MAX_VALUE);
                    return;
                } else {
                    c(c6564mc1.s0(), abstractC3090aC);
                    g(abstractC3090aC);
                    return;
                }
            case 11:
                a(c6564mc1.l0(), abstractC3090aC);
                g(abstractC3090aC);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + c6564mc1.w0());
        }
    }

    public final void g(AbstractC3090aC abstractC3090aC) {
        abstractC3090aC.d(2L);
    }

    public final void h(String str, AbstractC3090aC abstractC3090aC) {
        abstractC3090aC.e(str);
    }

    public final void i(AbstractC3090aC abstractC3090aC, int i) {
        abstractC3090aC.d(i);
    }
}
