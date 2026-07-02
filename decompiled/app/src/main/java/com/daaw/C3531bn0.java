package com.daaw;

/* JADX INFO: renamed from: com.daaw.bn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3531bn0 {
    public static final C3531bn0 a = new C3531bn0();
    public static final C8146sG0 b = new C8146sG0("[^\\p{L}\\p{Digit}]");
    public static final String c = "$context_receiver";

    public static final C2352Tm0 a(int i) {
        C2352Tm0 c2352Tm0L = C2352Tm0.l(c + '_' + i);
        G10.f(c2352Tm0L, "identifier(...)");
        return c2352Tm0L;
    }

    public static final String b(String str) {
        G10.g(str, "name");
        return b.c(str, "_");
    }
}
