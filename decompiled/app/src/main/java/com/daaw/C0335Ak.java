package com.daaw;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.Ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0335Ak {
    public static final C0335Ak a = new C0335Ak();
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static final Charset g;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        G10.f(charsetForName, "forName(...)");
        b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        G10.f(charsetForName2, "forName(...)");
        c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        G10.f(charsetForName3, "forName(...)");
        d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        G10.f(charsetForName4, "forName(...)");
        e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        G10.f(charsetForName5, "forName(...)");
        f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        G10.f(charsetForName6, "forName(...)");
        g = charsetForName6;
    }
}
