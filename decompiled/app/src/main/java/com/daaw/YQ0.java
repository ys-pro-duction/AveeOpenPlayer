package com.daaw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public abstract class YQ0 {
    public static final Map a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        linkedHashMap.put("None", null);
        linkedHashMap.put(ZQ0.c, new Supplier() { // from class: com.daaw.VQ0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ZQ0();
            }
        });
        linkedHashMap.put(UQ0.c, new Supplier() { // from class: com.daaw.WQ0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new UQ0();
            }
        });
        linkedHashMap.put(C3708cR0.f, new Supplier() { // from class: com.daaw.XQ0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C3708cR0();
            }
        });
    }

    public static CX a(String str, CX cx) {
        Supplier supplier = (Supplier) a.get(str);
        if (supplier == null) {
            AbstractC0441Bk1.a("Unknown typeName: " + str);
            return null;
        }
        try {
            CX cx2 = (CX) supplier.get();
            if (cx2 != null) {
                if (!cx2.getClass().isInstance(cx)) {
                    return cx2;
                }
            }
        } catch (Exception unused) {
            AbstractC0441Bk1.a("Failed to create input for typeName: " + str);
        }
        return cx;
    }

    public static String b(CX cx) {
        for (Map.Entry entry : a.entrySet()) {
            Supplier supplier = (Supplier) entry.getValue();
            if (supplier != null && ((CX) supplier.get()).getClass().isInstance(cx)) {
                return (String) entry.getKey();
            }
        }
        return "Unknown";
    }

    public static String[] c() {
        return (String[]) a.keySet().toArray(new String[0]);
    }
}
