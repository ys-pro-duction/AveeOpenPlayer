package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CP {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5970kW0.values().length];
            try {
                iArr[EnumC5970kW0.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5970kW0.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5970kW0.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final Object a(AP ap, Map map) {
        Object next;
        G10.g(ap, "<this>");
        G10.g(map, DiagnosticsEntry.Histogram.VALUES_KEY);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            AP ap2 = (AP) entry.getKey();
            if (G10.c(ap, ap2) || b(ap, ap2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((AP) ((Map.Entry) next).getKey(), ap).b().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((AP) ((Map.Entry) next2).getKey(), ap).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final boolean b(AP ap, AP ap2) {
        G10.g(ap, "<this>");
        G10.g(ap2, "packageName");
        return G10.c(f(ap), ap2);
    }

    public static final boolean c(AP ap, AP ap2) {
        G10.g(ap, "<this>");
        G10.g(ap2, "packageName");
        if (G10.c(ap, ap2) || ap2.d()) {
            return true;
        }
        String strB = ap.b();
        G10.f(strB, "asString(...)");
        String strB2 = ap2.b();
        G10.f(strB2, "asString(...)");
        return d(strB, strB2);
    }

    public static final boolean d(String str, String str2) {
        return AY0.u(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        EnumC5970kW0 enumC5970kW0 = EnumC5970kW0.B;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            int i2 = a.a[enumC5970kW0.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                enumC5970kW0 = EnumC5970kW0.C;
            } else {
                if (i2 != 3) {
                    throw new C6902no0();
                }
                if (cCharAt == '.') {
                    enumC5970kW0 = EnumC5970kW0.D;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return enumC5970kW0 != EnumC5970kW0.D;
    }

    public static final AP f(AP ap) {
        G10.g(ap, "<this>");
        if (ap.d()) {
            return null;
        }
        return ap.e();
    }

    public static final AP g(AP ap, AP ap2) {
        G10.g(ap, "<this>");
        G10.g(ap2, "prefix");
        if (!c(ap, ap2) || ap2.d()) {
            return ap;
        }
        if (G10.c(ap, ap2)) {
            AP ap3 = AP.c;
            G10.f(ap3, "ROOT");
            return ap3;
        }
        String strB = ap.b();
        G10.f(strB, "asString(...)");
        String strSubstring = strB.substring(ap2.b().length() + 1);
        G10.f(strSubstring, "substring(...)");
        return new AP(strSubstring);
    }
}
