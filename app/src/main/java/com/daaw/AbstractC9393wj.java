package com.daaw;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9393wj {
    public static final String a(String str) {
        char cCharAt;
        G10.g(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static final String b(String str) {
        char cCharAt;
        G10.g(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        G10.f(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    public static final String c(String str, boolean z) {
        Object next;
        G10.g(str, "<this>");
        if (str.length() == 0 || !d(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z)) {
            if (z) {
                return b(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            G10.f(strSubstring, "substring(...)");
            return lowerCase + strSubstring;
        }
        Iterator it = BY0.F(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!d(str, ((Number) next).intValue(), z)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            return e(str, z);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        G10.f(strSubstring2, "substring(...)");
        sb.append(e(strSubstring2, z));
        String strSubstring3 = str.substring(iIntValue);
        G10.f(strSubstring3, "substring(...)");
        sb.append(strSubstring3);
        return sb.toString();
    }

    public static final boolean d(String str, int i, boolean z) {
        char cCharAt = str.charAt(i);
        return z ? 'A' <= cCharAt && cCharAt < '[' : Character.isUpperCase(cCharAt);
    }

    public static final String e(String str, boolean z) {
        if (z) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        G10.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String f(String str) {
        G10.g(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }
}
