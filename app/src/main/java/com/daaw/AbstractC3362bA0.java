package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.bA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3362bA0 {
    public static final List a(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        String strC = c2352Tm0.c();
        G10.f(strC, "asString(...)");
        return C10052z40.c(strC) ? AbstractC1599Mm.o(b(c2352Tm0)) : C10052z40.d(strC) ? f(c2352Tm0) : C1683Nh.a.b(c2352Tm0);
    }

    public static final C2352Tm0 b(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "methodName");
        C2352Tm0 c2352Tm0E = e(c2352Tm0, "get", false, null, 12, null);
        return c2352Tm0E == null ? e(c2352Tm0, "is", false, null, 8, null) : c2352Tm0E;
    }

    public static final C2352Tm0 c(C2352Tm0 c2352Tm0, boolean z) {
        G10.g(c2352Tm0, "methodName");
        return e(c2352Tm0, "set", false, z ? "is" : null, 4, null);
    }

    public static final C2352Tm0 d(C2352Tm0 c2352Tm0, String str, boolean z, String str2) {
        if (c2352Tm0.m()) {
            return null;
        }
        String strH = c2352Tm0.h();
        G10.f(strH, "getIdentifier(...)");
        if (!AY0.u(strH, str, false, 2, null) || strH.length() == str.length()) {
            return null;
        }
        char cCharAt = strH.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return C2352Tm0.l(str2 + BY0.b0(strH, str));
        }
        if (!z) {
            return c2352Tm0;
        }
        String strC = AbstractC9393wj.c(BY0.b0(strH, str), true);
        if (C2352Tm0.n(strC)) {
            return C2352Tm0.l(strC);
        }
        return null;
    }

    public static /* synthetic */ C2352Tm0 e(C2352Tm0 c2352Tm0, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return d(c2352Tm0, str, z, str2);
    }

    public static final List f(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "methodName");
        return AbstractC1599Mm.p(c(c2352Tm0, false), c(c2352Tm0, true));
    }
}
