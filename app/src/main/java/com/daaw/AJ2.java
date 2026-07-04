package com.daaw;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AJ2 {
    public final IJ2 a;
    public final WebView b;
    public final List c = new ArrayList();
    public final Map d = new HashMap();
    public final String e = "";
    public final String f;
    public final BJ2 g;

    public AJ2(IJ2 ij2, WebView webView, String str, List list, String str2, String str3, BJ2 bj2) {
        this.a = ij2;
        this.b = webView;
        this.g = bj2;
        this.f = str2;
    }

    public static AJ2 b(IJ2 ij2, WebView webView, String str, String str2) {
        return new AJ2(ij2, webView, null, null, str, "", BJ2.HTML);
    }

    public static AJ2 c(IJ2 ij2, WebView webView, String str, String str2) {
        return new AJ2(ij2, webView, null, null, str, "", BJ2.JAVASCRIPT);
    }

    public final WebView a() {
        return this.b;
    }

    public final BJ2 d() {
        return this.g;
    }

    public final IJ2 e() {
        return this.a;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final List h() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    public final Map i() {
        return DesugarCollections.unmodifiableMap(this.d);
    }
}
