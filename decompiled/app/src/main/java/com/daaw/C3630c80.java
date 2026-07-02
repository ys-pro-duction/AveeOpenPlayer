package com.daaw;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.c80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3630c80 {
    public final Map a = new HashMap();
    public final int b;
    public final int c;

    public C3630c80(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public static String c(String str, int i) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    public synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.a));
    }

    public final String b(String str) {
        if (str != null) {
            return c(str, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.a.size() >= this.b && !this.a.containsKey(strB)) {
            C2106Rd0.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b);
            return false;
        }
        String strC = c(str2, this.c);
        if (AbstractC0555Cn.B((String) this.a.get(strB), strC)) {
            return false;
        }
        Map map = this.a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = b((String) entry.getKey());
                if (this.a.size() < this.b || this.a.containsKey(strB)) {
                    String str = (String) entry.getValue();
                    this.a.put(strB, str == null ? "" : c(str, this.c));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                C2106Rd0.f().k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
