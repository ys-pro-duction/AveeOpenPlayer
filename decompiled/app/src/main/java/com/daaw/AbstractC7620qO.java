package com.daaw;

import com.daaw.AbstractC6977o40;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.qO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7620qO {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("ch", "size", "w", "style", "fFamily", "data");
    public static final AbstractC6977o40.a b = AbstractC6977o40.a.a("shapes");

    public static C7341pO a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        ArrayList arrayList = new ArrayList();
        abstractC6977o40.d();
        double dF = 0.0d;
        String strR = null;
        String strR2 = null;
        double dF2 = 0.0d;
        char cCharAt = 0;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(a);
            if (iO0 == 0) {
                cCharAt = abstractC6977o40.R().charAt(0);
            } else if (iO0 == 1) {
                dF2 = abstractC6977o40.F();
            } else if (iO0 == 2) {
                dF = abstractC6977o40.F();
            } else if (iO0 == 3) {
                strR = abstractC6977o40.R();
            } else if (iO0 == 4) {
                strR2 = abstractC6977o40.R();
            } else if (iO0 != 5) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                abstractC6977o40.d();
                while (abstractC6977o40.o()) {
                    if (abstractC6977o40.o0(b) != 0) {
                        abstractC6977o40.p0();
                        abstractC6977o40.q0();
                    } else {
                        abstractC6977o40.c();
                        while (abstractC6977o40.o()) {
                            arrayList.add((C7911rR0) AbstractC7200os.a(abstractC6977o40, c0737Ee0));
                        }
                        abstractC6977o40.j();
                    }
                }
                abstractC6977o40.l();
            }
        }
        abstractC6977o40.l();
        return new C7341pO(arrayList, cCharAt, dF2, dF, strR, strR2);
    }
}
