package com.daaw;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HD1 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.InterfaceC1637Mv1 a(java.lang.String r27, com.daaw.C6350lp1 r28, com.daaw.ES2 r29, java.util.List r30) {
        /*
            Method dump skipped, instruction units count: 2048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.HD1.a(java.lang.String, com.daaw.lp1, com.daaw.ES2, java.util.List):com.daaw.Mv1");
    }

    public static C6350lp1 b(C6350lp1 c6350lp1, ES2 es2, AbstractC9435wr1 abstractC9435wr1, Boolean bool, Boolean bool2) {
        C6350lp1 c6350lp12 = new C6350lp1();
        Iterator itY = c6350lp1.y();
        while (itY.hasNext()) {
            int iIntValue = ((Integer) itY.next()).intValue();
            if (c6350lp1.I(iIntValue)) {
                InterfaceC1637Mv1 interfaceC1637Mv1A = abstractC9435wr1.a(es2, Arrays.asList(c6350lp1.v(iIntValue), new C1825Oq1(Double.valueOf(iIntValue)), c6350lp1));
                if (interfaceC1637Mv1A.zzg().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC1637Mv1A.zzg().equals(bool2)) {
                    c6350lp12.H(iIntValue, interfaceC1637Mv1A);
                }
            }
        }
        return c6350lp12;
    }

    public static InterfaceC1637Mv1 c(C6350lp1 c6350lp1, ES2 es2, List list, boolean z) {
        InterfaceC1637Mv1 interfaceC1637Mv1A;
        AbstractC7831r73.i("reduce", 1, list);
        AbstractC7831r73.j("reduce", 2, list);
        InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(0));
        if (!(interfaceC1637Mv1B instanceof AbstractC9435wr1)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC1637Mv1A = es2.b((InterfaceC1637Mv1) list.get(1));
            if (interfaceC1637Mv1A instanceof C5229hq1) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c6350lp1.s() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC1637Mv1A = null;
        }
        AbstractC9435wr1 abstractC9435wr1 = (AbstractC9435wr1) interfaceC1637Mv1B;
        int iS = c6350lp1.s();
        int i = z ? 0 : iS - 1;
        int i2 = z ? iS - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (interfaceC1637Mv1A == null) {
            interfaceC1637Mv1A = c6350lp1.v(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (c6350lp1.I(i)) {
                interfaceC1637Mv1A = abstractC9435wr1.a(es2, Arrays.asList(interfaceC1637Mv1A, c6350lp1.v(i), new C1825Oq1(Double.valueOf(i)), c6350lp1));
                if (interfaceC1637Mv1A instanceof C5229hq1) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return interfaceC1637Mv1A;
    }
}
