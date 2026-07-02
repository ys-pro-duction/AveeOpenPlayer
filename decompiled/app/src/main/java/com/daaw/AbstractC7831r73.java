package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.r73, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7831r73 {
    public static double a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    public static int b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static int c(ES2 es2) {
        int iB = b(es2.d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (iB > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        es2.g("runtime.counter", new C1825Oq1(Double.valueOf(iB)));
        return iB;
    }

    public static long d(double d) {
        return ((long) b(d)) & 4294967295L;
    }

    public static IJ1 e(String str) {
        IJ1 ij1A = null;
        if (str != null && !str.isEmpty()) {
            ij1A = IJ1.a(Integer.parseInt(str));
        }
        if (ij1A != null) {
            return ij1A;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(InterfaceC1637Mv1 interfaceC1637Mv1) {
        if (InterfaceC1637Mv1.u.equals(interfaceC1637Mv1)) {
            return null;
        }
        if (InterfaceC1637Mv1.t.equals(interfaceC1637Mv1)) {
            return "";
        }
        if (interfaceC1637Mv1 instanceof C2693Wt1) {
            return g((C2693Wt1) interfaceC1637Mv1);
        }
        if (!(interfaceC1637Mv1 instanceof C6350lp1)) {
            return !interfaceC1637Mv1.zzh().isNaN() ? interfaceC1637Mv1.zzh() : interfaceC1637Mv1.zzi();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C6350lp1) interfaceC1637Mv1).iterator();
        while (it.hasNext()) {
            Object objF = f((InterfaceC1637Mv1) it.next());
            if (objF != null) {
                arrayList.add(objF);
            }
        }
        return arrayList;
    }

    public static Map g(C2693Wt1 c2693Wt1) {
        HashMap map = new HashMap();
        for (String str : c2693Wt1.a()) {
            Object objF = f(c2693Wt1.e(str));
            if (objF != null) {
                map.put(str, objF);
            }
        }
        return map;
    }

    public static void h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(InterfaceC1637Mv1 interfaceC1637Mv1) {
        if (interfaceC1637Mv1 == null) {
            return false;
        }
        Double dZzh = interfaceC1637Mv1.zzh();
        return !dZzh.isNaN() && dZzh.doubleValue() >= 0.0d && dZzh.equals(Double.valueOf(Math.floor(dZzh.doubleValue())));
    }

    public static boolean l(InterfaceC1637Mv1 interfaceC1637Mv1, InterfaceC1637Mv1 interfaceC1637Mv12) {
        if (!interfaceC1637Mv1.getClass().equals(interfaceC1637Mv12.getClass())) {
            return false;
        }
        if ((interfaceC1637Mv1 instanceof C2401Ty1) || (interfaceC1637Mv1 instanceof C0377Au1)) {
            return true;
        }
        if (!(interfaceC1637Mv1 instanceof C1825Oq1)) {
            return interfaceC1637Mv1 instanceof C6391ly1 ? interfaceC1637Mv1.zzi().equals(interfaceC1637Mv12.zzi()) : interfaceC1637Mv1 instanceof C1406Kp1 ? interfaceC1637Mv1.zzg().equals(interfaceC1637Mv12.zzg()) : interfaceC1637Mv1 == interfaceC1637Mv12;
        }
        if (Double.isNaN(interfaceC1637Mv1.zzh().doubleValue()) || Double.isNaN(interfaceC1637Mv12.zzh().doubleValue())) {
            return false;
        }
        return interfaceC1637Mv1.zzh().equals(interfaceC1637Mv12.zzh());
    }
}
