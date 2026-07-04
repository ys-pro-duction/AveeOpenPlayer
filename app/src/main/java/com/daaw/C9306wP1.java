package com.daaw;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: com.daaw.wP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9306wP1 extends WebViewClient {
    public final /* synthetic */ C3148aQ1 a;

    public /* synthetic */ C9306wP1(C3148aQ1 c3148aQ1, UO1 uo1) {
        this.a = c3148aQ1;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (C3148aQ1.e(this.a, str)) {
            this.a.C.c(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.a.D) {
            return;
        }
        this.a.D = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.a.C.d(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        if (!C3148aQ1.e(this.a, string)) {
            return false;
        }
        this.a.C.c(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!C3148aQ1.e(this.a, str)) {
            return false;
        }
        this.a.C.c(str);
        return true;
    }
}
