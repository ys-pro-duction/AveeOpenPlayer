package com.daaw;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.dp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4098dp1 extends AbstractC4666fp1 {
    public long b;
    public long[] c;
    public long[] d;

    public C4098dp1() {
        super(new C0982Gn1());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    public static Double g(C5900kE2 c5900kE2) {
        return Double.valueOf(Double.longBitsToDouble(c5900kE2.B()));
    }

    public static Object h(C5900kE2 c5900kE2, int i) {
        if (i == 0) {
            return g(c5900kE2);
        }
        if (i == 1) {
            return Boolean.valueOf(c5900kE2.u() == 1);
        }
        if (i == 2) {
            return i(c5900kE2);
        }
        if (i != 3) {
            if (i == 8) {
                return j(c5900kE2);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) g(c5900kE2).doubleValue());
                c5900kE2.h(2);
                return date;
            }
            int iX = c5900kE2.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i2 = 0; i2 < iX; i2++) {
                Object objH = h(c5900kE2, c5900kE2.u());
                if (objH != null) {
                    arrayList.add(objH);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strI = i(c5900kE2);
            int iU = c5900kE2.u();
            if (iU == 9) {
                return map;
            }
            Object objH2 = h(c5900kE2, iU);
            if (objH2 != null) {
                map.put(strI, objH2);
            }
        }
    }

    public static String i(C5900kE2 c5900kE2) {
        int iY = c5900kE2.y();
        int iL = c5900kE2.l();
        c5900kE2.h(iY);
        return new String(c5900kE2.i(), iL, iY);
    }

    public static HashMap j(C5900kE2 c5900kE2) {
        int iX = c5900kE2.x();
        HashMap map = new HashMap(iX);
        for (int i = 0; i < iX; i++) {
            String strI = i(c5900kE2);
            Object objH = h(c5900kE2, c5900kE2.u());
            if (objH != null) {
                map.put(strI, objH);
            }
        }
        return map;
    }

    @Override // com.daaw.AbstractC4666fp1
    public final boolean a(C5900kE2 c5900kE2) {
        return true;
    }

    @Override // com.daaw.AbstractC4666fp1
    public final boolean b(C5900kE2 c5900kE2, long j) {
        if (c5900kE2.u() != 2 || !"onMetaData".equals(i(c5900kE2)) || c5900kE2.j() == 0 || c5900kE2.u() != 8) {
            return false;
        }
        HashMap mapJ = j(c5900kE2);
        Object obj = mapJ.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapJ.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                    this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.b;
    }

    public final long[] e() {
        return this.d;
    }

    public final long[] f() {
        return this.c;
    }
}
