package com.daaw;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class XN0 extends V01 {
    public long b;

    public XN0() {
        super(null);
        this.b = -9223372036854775807L;
    }

    public static Boolean e(C2584Vs0 c2584Vs0) {
        return Boolean.valueOf(c2584Vs0.x() == 1);
    }

    public static Object f(C2584Vs0 c2584Vs0, int i) {
        if (i == 0) {
            return h(c2584Vs0);
        }
        if (i == 1) {
            return e(c2584Vs0);
        }
        if (i == 2) {
            return l(c2584Vs0);
        }
        if (i == 3) {
            return j(c2584Vs0);
        }
        if (i == 8) {
            return i(c2584Vs0);
        }
        if (i == 10) {
            return k(c2584Vs0);
        }
        if (i != 11) {
            return null;
        }
        return g(c2584Vs0);
    }

    public static Date g(C2584Vs0 c2584Vs0) {
        Date date = new Date((long) h(c2584Vs0).doubleValue());
        c2584Vs0.K(2);
        return date;
    }

    public static Double h(C2584Vs0 c2584Vs0) {
        return Double.valueOf(Double.longBitsToDouble(c2584Vs0.q()));
    }

    public static HashMap i(C2584Vs0 c2584Vs0) {
        int iB = c2584Vs0.B();
        HashMap map = new HashMap(iB);
        for (int i = 0; i < iB; i++) {
            map.put(l(c2584Vs0), f(c2584Vs0, m(c2584Vs0)));
        }
        return map;
    }

    public static HashMap j(C2584Vs0 c2584Vs0) {
        HashMap map = new HashMap();
        while (true) {
            String strL = l(c2584Vs0);
            int iM = m(c2584Vs0);
            if (iM == 9) {
                return map;
            }
            map.put(strL, f(c2584Vs0, iM));
        }
    }

    public static ArrayList k(C2584Vs0 c2584Vs0) {
        int iB = c2584Vs0.B();
        ArrayList arrayList = new ArrayList(iB);
        for (int i = 0; i < iB; i++) {
            arrayList.add(f(c2584Vs0, m(c2584Vs0)));
        }
        return arrayList;
    }

    public static String l(C2584Vs0 c2584Vs0) {
        int iD = c2584Vs0.D();
        int iC = c2584Vs0.c();
        c2584Vs0.K(iD);
        return new String(c2584Vs0.a, iC, iD);
    }

    public static int m(C2584Vs0 c2584Vs0) {
        return c2584Vs0.x();
    }

    @Override // com.daaw.V01
    public boolean b(C2584Vs0 c2584Vs0) {
        return true;
    }

    @Override // com.daaw.V01
    public void c(C2584Vs0 c2584Vs0, long j) throws C3000Zs0 {
        if (m(c2584Vs0) != 2) {
            throw new C3000Zs0();
        }
        if ("onMetaData".equals(l(c2584Vs0)) && m(c2584Vs0) == 8) {
            HashMap mapI = i(c2584Vs0);
            if (mapI.containsKey("duration")) {
                double dDoubleValue = ((Double) mapI.get("duration")).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.b = (long) (dDoubleValue * 1000000.0d);
                }
            }
        }
    }

    public long d() {
        return this.b;
    }
}
