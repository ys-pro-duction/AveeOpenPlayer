package com.daaw;

import android.graphics.Path;
import com.daaw.AbstractC6977o40;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.qR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7633qR0 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static C7354pR0 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        K6 k6 = null;
        String strR = null;
        H6 h6C = null;
        int I = 1;
        boolean zS = false;
        boolean zS2 = false;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 1) {
                h6C = Y6.c(abstractC6977o40, c0737Ee0);
            } else if (iO0 == 2) {
                k6 = Y6.h(abstractC6977o40, c0737Ee0);
            } else if (iO0 == 3) {
                zS = abstractC6977o40.s();
            } else if (iO0 == 4) {
                I = abstractC6977o40.I();
            } else if (iO0 != 5) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                zS2 = abstractC6977o40.s();
            }
        }
        if (k6 == null) {
            k6 = new K6(Collections.singletonList(new Y70(100)));
        }
        return new C7354pR0(strR, zS, I == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, h6C, k6, zS2);
    }
}
