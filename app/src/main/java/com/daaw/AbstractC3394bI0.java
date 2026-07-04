package com.daaw;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.bI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3394bI0 {
    public static final String a(BP bp) {
        G10.g(bp, "<this>");
        List listH = bp.h();
        G10.f(listH, "pathSegments(...)");
        return c(listH);
    }

    public static final String b(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "<this>");
        if (!e(c2352Tm0)) {
            String strC = c2352Tm0.c();
            G10.f(strC, "asString(...)");
            return strC;
        }
        StringBuilder sb = new StringBuilder();
        String strC2 = c2352Tm0.c();
        G10.f(strC2, "asString(...)");
        sb.append('`' + strC2);
        sb.append('`');
        return sb.toString();
    }

    public static final String c(List list) {
        G10.g(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2352Tm0 c2352Tm0 = (C2352Tm0) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(b(c2352Tm0));
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static final String d(String str, String str2, String str3, String str4, String str5) {
        G10.g(str, "lowerRendered");
        G10.g(str2, "lowerPrefix");
        G10.g(str3, "upperRendered");
        G10.g(str4, "upperPrefix");
        G10.g(str5, "foldedPrefix");
        if (AY0.u(str, str2, false, 2, null) && AY0.u(str3, str4, false, 2, null)) {
            String strSubstring = str.substring(str2.length());
            G10.f(strSubstring, "substring(...)");
            String strSubstring2 = str3.substring(str4.length());
            G10.f(strSubstring2, "substring(...)");
            String str6 = str5 + strSubstring;
            if (G10.c(strSubstring, strSubstring2)) {
                return str6;
            }
            if (f(strSubstring, strSubstring2)) {
                return str6 + '!';
            }
        }
        return null;
    }

    public static final boolean e(C2352Tm0 c2352Tm0) {
        String strC = c2352Tm0.c();
        G10.f(strC, "asString(...)");
        if (AbstractC3909d80.a.contains(strC)) {
            return true;
        }
        for (int i = 0; i < strC.length(); i++) {
            char cCharAt = strC.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strC.length() == 0 || !Character.isJavaIdentifierStart(strC.codePointAt(0));
    }

    public static final boolean f(String str, String str2) {
        G10.g(str, "lower");
        G10.g(str2, "upper");
        if (G10.c(str, AY0.s(str2, "?", "", false, 4, null))) {
            return true;
        }
        if (AY0.m(str2, "?", false, 2, null)) {
            if (G10.c(str + '?', str2)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(str);
        sb.append(")?");
        return G10.c(sb.toString(), str2);
    }
}
