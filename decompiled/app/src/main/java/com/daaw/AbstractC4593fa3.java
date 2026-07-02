package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.fa3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4593fa3 {
    public static InterfaceC1637Mv1 a(C4459f63 c4459f63) {
        if (c4459f63 == null) {
            return InterfaceC1637Mv1.t;
        }
        int iK = c4459f63.K() - 1;
        if (iK == 1) {
            return c4459f63.J() ? new C6391ly1(c4459f63.E()) : InterfaceC1637Mv1.A;
        }
        if (iK == 2) {
            return c4459f63.I() ? new C1825Oq1(Double.valueOf(c4459f63.B())) : new C1825Oq1(null);
        }
        if (iK == 3) {
            return c4459f63.H() ? new C1406Kp1(Boolean.valueOf(c4459f63.G())) : new C1406Kp1(null);
        }
        if (iK != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listF = c4459f63.F();
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(a((C4459f63) it.next()));
        }
        return new C8335sw1(c4459f63.D(), arrayList);
    }

    public static InterfaceC1637Mv1 b(Object obj) {
        if (obj == null) {
            return InterfaceC1637Mv1.u;
        }
        if (obj instanceof String) {
            return new C6391ly1((String) obj);
        }
        if (obj instanceof Double) {
            return new C1825Oq1((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1825Oq1(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1825Oq1(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1406Kp1((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C6350lp1 c6350lp1 = new C6350lp1();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c6350lp1.H(c6350lp1.s(), b(it.next()));
            }
            return c6350lp1;
        }
        C2693Wt1 c2693Wt1 = new C2693Wt1();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC1637Mv1 interfaceC1637Mv1B = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c2693Wt1.p((String) string, interfaceC1637Mv1B);
            }
        }
        return c2693Wt1;
    }
}
