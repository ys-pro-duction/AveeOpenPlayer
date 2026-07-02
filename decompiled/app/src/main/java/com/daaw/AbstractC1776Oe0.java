package com.daaw;

import android.graphics.Rect;
import com.daaw.AbstractC6977o40;
import com.daaw.C5595j90;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Oe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1776Oe0 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static AbstractC6977o40.a b = AbstractC6977o40.a.a("id", "layers", "w", "h", "p", "u");
    public static final AbstractC6977o40.a c = AbstractC6977o40.a.a("list");
    public static final AbstractC6977o40.a d = AbstractC6977o40.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static C0737Ee0 a(AbstractC6977o40 abstractC6977o40) {
        float f;
        AbstractC6977o40 abstractC6977o402 = abstractC6977o40;
        float fE = AbstractC0301Ab1.e();
        C7131oe0 c7131oe0 = new C7131oe0();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        C3724cV0 c3724cV0 = new C3724cV0();
        C0737Ee0 c0737Ee0 = new C0737Ee0();
        abstractC6977o402.d();
        float F = 0.0f;
        float F2 = 0.0f;
        float F3 = 0.0f;
        int I = 0;
        int I2 = 0;
        while (abstractC6977o402.o()) {
            switch (abstractC6977o402.o0(a)) {
                case 0:
                    I = abstractC6977o40.I();
                    abstractC6977o402 = abstractC6977o40;
                    break;
                case 1:
                    I2 = abstractC6977o40.I();
                    abstractC6977o402 = abstractC6977o40;
                    break;
                case 2:
                    f = fE;
                    F = (float) abstractC6977o40.F();
                    abstractC6977o402 = abstractC6977o40;
                    fE = f;
                    break;
                case 3:
                    f = fE;
                    F2 = ((float) abstractC6977o40.F()) - 0.01f;
                    abstractC6977o402 = abstractC6977o40;
                    fE = f;
                    break;
                case 4:
                    f = fE;
                    F3 = (float) abstractC6977o40.F();
                    abstractC6977o402 = abstractC6977o40;
                    fE = f;
                    break;
                case 5:
                    String[] strArrSplit = abstractC6977o402.R().split("\\.");
                    if (!AbstractC0301Ab1.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        c0737Ee0.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    abstractC6977o402 = abstractC6977o40;
                    break;
                case 6:
                    e(abstractC6977o402, c0737Ee0, arrayList, c7131oe0);
                    abstractC6977o402 = abstractC6977o40;
                    break;
                case 7:
                    b(abstractC6977o402, c0737Ee0, map, map2);
                    abstractC6977o402 = abstractC6977o40;
                    break;
                case 8:
                    d(abstractC6977o402, map3);
                    abstractC6977o402 = abstractC6977o40;
                    break;
                case 9:
                    c(abstractC6977o402, c0737Ee0, c3724cV0);
                    abstractC6977o402 = abstractC6977o40;
                    break;
                case 10:
                    f(abstractC6977o402, arrayList2);
                    abstractC6977o402 = abstractC6977o40;
                    break;
                default:
                    abstractC6977o402.p0();
                    abstractC6977o402.q0();
                    abstractC6977o402 = abstractC6977o40;
                    break;
            }
        }
        float f2 = fE;
        c0737Ee0.t(new Rect(0, 0, (int) (I * f2), (int) (I2 * f2)), F, F2, F3, arrayList, c7131oe0, map, map2, c3724cV0, map3, arrayList2);
        return c0737Ee0;
    }

    public static void b(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, Map map, Map map2) {
        abstractC6977o40.c();
        while (abstractC6977o40.o()) {
            ArrayList arrayList = new ArrayList();
            C7131oe0 c7131oe0 = new C7131oe0();
            abstractC6977o40.d();
            String strR = null;
            String strR2 = null;
            String strR3 = null;
            int I = 0;
            int I2 = 0;
            while (abstractC6977o40.o()) {
                int iO0 = abstractC6977o40.o0(b);
                if (iO0 == 0) {
                    strR = abstractC6977o40.R();
                } else if (iO0 == 1) {
                    abstractC6977o40.c();
                    while (abstractC6977o40.o()) {
                        C5595j90 c5595j90A = AbstractC6165l90.a(abstractC6977o40, c0737Ee0);
                        c7131oe0.k(c5595j90A.d(), c5595j90A);
                        arrayList.add(c5595j90A);
                    }
                    abstractC6977o40.j();
                } else if (iO0 == 2) {
                    I = abstractC6977o40.I();
                } else if (iO0 == 3) {
                    I2 = abstractC6977o40.I();
                } else if (iO0 == 4) {
                    strR2 = abstractC6977o40.R();
                } else if (iO0 != 5) {
                    abstractC6977o40.p0();
                    abstractC6977o40.q0();
                } else {
                    strR3 = abstractC6977o40.R();
                }
            }
            abstractC6977o40.l();
            if (strR2 != null) {
                C5732jf0 c5732jf0 = new C5732jf0(I, I2, strR, strR2, strR3);
                map2.put(c5732jf0.d(), c5732jf0);
            } else {
                map.put(strR, arrayList);
            }
        }
        abstractC6977o40.j();
    }

    public static void c(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, C3724cV0 c3724cV0) {
        abstractC6977o40.c();
        while (abstractC6977o40.o()) {
            C7341pO c7341pOA = AbstractC7620qO.a(abstractC6977o40, c0737Ee0);
            c3724cV0.l(c7341pOA.hashCode(), c7341pOA);
        }
        abstractC6977o40.j();
    }

    public static void d(AbstractC6977o40 abstractC6977o40, Map map) {
        abstractC6977o40.d();
        while (abstractC6977o40.o()) {
            if (abstractC6977o40.o0(c) != 0) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                abstractC6977o40.c();
                while (abstractC6977o40.o()) {
                    C6504mO c6504mOA = EO.a(abstractC6977o40);
                    map.put(c6504mOA.b(), c6504mOA);
                }
                abstractC6977o40.j();
            }
        }
        abstractC6977o40.l();
    }

    public static void e(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, List list, C7131oe0 c7131oe0) {
        abstractC6977o40.c();
        int i = 0;
        while (abstractC6977o40.o()) {
            C5595j90 c5595j90A = AbstractC6165l90.a(abstractC6977o40, c0737Ee0);
            if (c5595j90A.f() == C5595j90.a.IMAGE) {
                i++;
            }
            list.add(c5595j90A);
            c7131oe0.k(c5595j90A.d(), c5595j90A);
            if (i > 4) {
                AbstractC1876Pd0.c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC6977o40.j();
    }

    public static void f(AbstractC6977o40 abstractC6977o40, List list) {
        abstractC6977o40.c();
        while (abstractC6977o40.o()) {
            abstractC6977o40.d();
            float F = 0.0f;
            String strR = null;
            float F2 = 0.0f;
            while (abstractC6977o40.o()) {
                int iO0 = abstractC6977o40.o0(d);
                if (iO0 == 0) {
                    strR = abstractC6977o40.R();
                } else if (iO0 == 1) {
                    F = (float) abstractC6977o40.F();
                } else if (iO0 != 2) {
                    abstractC6977o40.p0();
                    abstractC6977o40.q0();
                } else {
                    F2 = (float) abstractC6977o40.F();
                }
            }
            abstractC6977o40.l();
            list.add(new C1888Pg0(strR, F, F2));
        }
        abstractC6977o40.j();
    }
}
