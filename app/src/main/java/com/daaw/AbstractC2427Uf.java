package com.daaw;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2427Uf {
    public static final Map a;
    public static final int[] b;
    public static final String[] c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        int i = 0;
        linkedHashMap.put(0, "Alpha");
        linkedHashMap.put(4, "PreMulAlpha");
        linkedHashMap.put(1, "Screen");
        linkedHashMap.put(2, "Add");
        linkedHashMap.put(5, "AddAlpha");
        b = new int[]{0, 5};
        c = new String[linkedHashMap.size()];
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            c[i] = (String) ((Map.Entry) it.next()).getValue();
            i++;
        }
    }

    public static int a(String str, int i) {
        for (Map.Entry entry : a.entrySet()) {
            if (((String) entry.getValue()).equals(str)) {
                return ((Integer) entry.getKey()).intValue();
            }
        }
        AbstractC0441Bk1.c("unknown typeName: " + str);
        return i;
    }

    public static String b(int i) {
        Map map = a;
        String str = (String) map.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        AbstractC0441Bk1.c("unknown instance type");
        return (String) map.get(0);
    }

    public static String[] c(int[] iArr) {
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            strArr[i] = b(iArr[i]);
        }
        return strArr;
    }
}
