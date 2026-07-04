package com.daaw;

import android.graphics.Path;
import com.daaw.AbstractC6977o40;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class NT {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    public static final AbstractC6977o40.a b = AbstractC6977o40.a.a("p", "k");

    public static LT a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        K6 k6 = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strR = null;
        RT rt = null;
        J6 j6G = null;
        O6 o6I = null;
        O6 o6I2 = null;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            switch (abstractC6977o40.o0(a)) {
                case 0:
                    strR = abstractC6977o40.R();
                    break;
                case 1:
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
                    break;
                case 2:
                    k6 = Y6.h(abstractC6977o40, c0737Ee0);
                    break;
                case 3:
                    rt = abstractC6977o40.I() == 1 ? RT.LINEAR : RT.RADIAL;
                    break;
                case 4:
                    o6I = Y6.i(abstractC6977o40, c0737Ee0);
                    break;
                case 5:
                    o6I2 = Y6.i(abstractC6977o40, c0737Ee0);
                    break;
                case 6:
                    fillType = abstractC6977o40.I() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zS = abstractC6977o40.s();
                    break;
                default:
                    abstractC6977o40.p0();
                    abstractC6977o40.q0();
                    break;
            }
        }
        if (k6 == null) {
            k6 = new K6(Collections.singletonList(new Y70(100)));
        }
        return new LT(strR, rt, fillType, j6G, k6, o6I, o6I2, null, null, zS);
    }
}
