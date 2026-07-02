package com.daaw;

import com.daaw.AbstractC6977o40;
import com.daaw.C10150zR0;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class QT {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    public static final AbstractC6977o40.a b = AbstractC6977o40.a.a("p", "k");
    public static final AbstractC6977o40.a c = AbstractC6977o40.a.a("n", "v");

    public static OT a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        RT rt;
        K6 k6;
        ArrayList arrayList = new ArrayList();
        RT rt2 = null;
        K6 k6H = null;
        String strR = null;
        J6 j6G = null;
        O6 o6I = null;
        O6 o6I2 = null;
        I6 i6E = null;
        C10150zR0.b bVar = null;
        C10150zR0.c cVar = null;
        I6 i6 = null;
        float F = 0.0f;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            switch (abstractC6977o40.o0(a)) {
                case 0:
                    strR = abstractC6977o40.R();
                    break;
                case 1:
                    rt = rt2;
                    k6 = k6H;
                    abstractC6977o40.d();
                    int I = -1;
                    while (abstractC6977o40.o()) {
                        int iO0 = abstractC6977o40.o0(b);
                        if (iO0 == 0) {
                            I = abstractC6977o40.I();
                        } else if (iO0 != 1) {
                            abstractC6977o40.p0();
                            abstractC6977o40.q0();
                        } else {
                            j6G = Y6.g(abstractC6977o40, c0737Ee0, I);
                        }
                    }
                    abstractC6977o40.l();
                    k6H = k6;
                    rt2 = rt;
                    break;
                case 2:
                    k6H = Y6.h(abstractC6977o40, c0737Ee0);
                    break;
                case 3:
                    K6 k62 = k6H;
                    rt2 = abstractC6977o40.I() == 1 ? RT.LINEAR : RT.RADIAL;
                    k6H = k62;
                    break;
                case 4:
                    o6I = Y6.i(abstractC6977o40, c0737Ee0);
                    break;
                case 5:
                    o6I2 = Y6.i(abstractC6977o40, c0737Ee0);
                    break;
                case 6:
                    i6E = Y6.e(abstractC6977o40, c0737Ee0);
                    break;
                case 7:
                    rt = rt2;
                    k6 = k6H;
                    bVar = C10150zR0.b.values()[abstractC6977o40.I() - 1];
                    k6H = k6;
                    rt2 = rt;
                    break;
                case 8:
                    rt = rt2;
                    k6 = k6H;
                    cVar = C10150zR0.c.values()[abstractC6977o40.I() - 1];
                    k6H = k6;
                    rt2 = rt;
                    break;
                case 9:
                    rt = rt2;
                    k6 = k6H;
                    F = (float) abstractC6977o40.F();
                    k6H = k6;
                    rt2 = rt;
                    break;
                case 10:
                    rt = rt2;
                    zS = abstractC6977o40.s();
                    rt2 = rt;
                    break;
                case 11:
                    abstractC6977o40.c();
                    while (abstractC6977o40.o()) {
                        abstractC6977o40.d();
                        String strR2 = null;
                        I6 i6E2 = null;
                        while (abstractC6977o40.o()) {
                            int iO02 = abstractC6977o40.o0(c);
                            if (iO02 != 0) {
                                RT rt3 = rt2;
                                if (iO02 != 1) {
                                    abstractC6977o40.p0();
                                    abstractC6977o40.q0();
                                } else {
                                    i6E2 = Y6.e(abstractC6977o40, c0737Ee0);
                                }
                                rt2 = rt3;
                            } else {
                                strR2 = abstractC6977o40.R();
                            }
                        }
                        RT rt4 = rt2;
                        abstractC6977o40.l();
                        if (strR2.equals("o")) {
                            i6 = i6E2;
                        } else {
                            if (strR2.equals("d") || strR2.equals("g")) {
                                c0737Ee0.v(true);
                                arrayList.add(i6E2);
                            }
                            rt2 = rt4;
                        }
                        rt2 = rt4;
                    }
                    rt = rt2;
                    abstractC6977o40.j();
                    if (arrayList.size() == 1) {
                        arrayList.add((I6) arrayList.get(0));
                    }
                    rt2 = rt;
                    break;
                default:
                    abstractC6977o40.p0();
                    abstractC6977o40.q0();
                    break;
            }
        }
        RT rt5 = rt2;
        K6 k63 = k6H;
        if (k63 == null) {
            k63 = new K6(Collections.singletonList(new Y70(100)));
        }
        return new OT(strR, rt5, j6G, k63, o6I, o6I2, i6E, bVar, cVar, F, arrayList, i6, zS);
    }
}
