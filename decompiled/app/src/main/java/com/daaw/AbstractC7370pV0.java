package com.daaw;

import com.daaw.C8906uy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.pV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7370pV0 {
    public static final C3310b a(I80 i80) {
        G10.g(i80, "<this>");
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (abstractC5708ja1Q0 instanceof C3310b) {
            return (C3310b) abstractC5708ja1Q0;
        }
        return null;
    }

    public static final YS0 b(I80 i80) {
        G10.g(i80, "<this>");
        C3310b c3310bA = a(i80);
        if (c3310bA != null) {
            return c3310bA.Z0();
        }
        return null;
    }

    public static final boolean c(I80 i80) {
        G10.g(i80, "<this>");
        return i80.Q0() instanceof C8906uy;
    }

    public static final B10 d(B10 b10) {
        I80 i80;
        Collection collectionB = b10.b();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collectionB, 10));
        Iterator it = collectionB.iterator();
        boolean z = false;
        while (true) {
            i80 = null;
            if (!it.hasNext()) {
                break;
            }
            I80 i80F = (I80) it.next();
            if (D81.l(i80F)) {
                i80F = f(i80F.Q0(), false, 1, null);
                z = true;
            }
            arrayList.add(i80F);
        }
        if (!z) {
            return null;
        }
        I80 i80L = b10.l();
        if (i80L != null) {
            if (D81.l(i80L)) {
                i80L = f(i80L.Q0(), false, 1, null);
            }
            i80 = i80L;
        }
        return new B10(arrayList).s(i80);
    }

    public static final AbstractC5708ja1 e(AbstractC5708ja1 abstractC5708ja1, boolean z) {
        G10.g(abstractC5708ja1, "<this>");
        C8906uy c8906uyC = C8906uy.a.c(C8906uy.E, abstractC5708ja1, z, false, 4, null);
        if (c8906uyC != null) {
            return c8906uyC;
        }
        YS0 ys0G = g(abstractC5708ja1);
        return ys0G != null ? ys0G : abstractC5708ja1.R0(false);
    }

    public static /* synthetic */ AbstractC5708ja1 f(AbstractC5708ja1 abstractC5708ja1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return e(abstractC5708ja1, z);
    }

    public static final YS0 g(I80 i80) {
        B10 b10D;
        C71 c71N0 = i80.N0();
        B10 b10 = c71N0 instanceof B10 ? (B10) c71N0 : null;
        if (b10 == null || (b10D = d(b10)) == null) {
            return null;
        }
        return b10D.j();
    }

    public static final YS0 h(YS0 ys0, boolean z) {
        G10.g(ys0, "<this>");
        C8906uy c8906uyC = C8906uy.a.c(C8906uy.E, ys0, z, false, 4, null);
        if (c8906uyC != null) {
            return c8906uyC;
        }
        YS0 ys0G = g(ys0);
        return ys0G == null ? ys0.R0(false) : ys0G;
    }

    public static /* synthetic */ YS0 i(YS0 ys0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return h(ys0, z);
    }

    public static final YS0 j(YS0 ys0, YS0 ys02) {
        G10.g(ys0, "<this>");
        G10.g(ys02, "abbreviatedType");
        return N80.a(ys0) ? ys0 : new C3310b(ys0, ys02);
    }

    public static final C1604Mn0 k(C1604Mn0 c1604Mn0) {
        G10.g(c1604Mn0, "<this>");
        return new C1604Mn0(c1604Mn0.W0(), c1604Mn0.N0(), c1604Mn0.Y0(), c1604Mn0.M0(), c1604Mn0.O0(), true);
    }
}
