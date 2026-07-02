package com.daaw;

import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5455ig {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("ef");
    public static final AbstractC6977o40.a b = AbstractC6977o40.a.a("ty", "v");

    public static C5177hg a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        abstractC6977o40.d();
        C5177hg c5177hg = null;
        while (true) {
            boolean z = false;
            while (abstractC6977o40.o()) {
                int iO0 = abstractC6977o40.o0(b);
                if (iO0 != 0) {
                    if (iO0 != 1) {
                        abstractC6977o40.p0();
                        abstractC6977o40.q0();
                    } else if (z) {
                        c5177hg = new C5177hg(Y6.e(abstractC6977o40, c0737Ee0));
                    } else {
                        abstractC6977o40.q0();
                    }
                } else if (abstractC6977o40.I() == 0) {
                    z = true;
                }
            }
            abstractC6977o40.l();
            return c5177hg;
        }
    }

    public static C5177hg b(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        C5177hg c5177hg = null;
        while (abstractC6977o40.o()) {
            if (abstractC6977o40.o0(a) != 0) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                abstractC6977o40.c();
                while (abstractC6977o40.o()) {
                    C5177hg c5177hgA = a(abstractC6977o40, c0737Ee0);
                    if (c5177hgA != null) {
                        c5177hg = c5177hgA;
                    }
                }
                abstractC6977o40.j();
            }
        }
        return c5177hg;
    }
}
