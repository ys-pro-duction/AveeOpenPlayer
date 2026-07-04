package com.daaw;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class AJ1 extends AbstractC6765nJ1 {
    public static final /* synthetic */ int d = 0;
    public WebViewClient a;
    public final H5AdsRequestHandler b;
    public final WebView c;

    public AJ1(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        AbstractC5381iO2.f(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.c = webView;
        this.b = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.daaw.zJ1
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                int i = AJ1.d;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    @Override // com.daaw.AbstractC6765nJ1
    public final WebViewClient a() {
        return this.a;
    }

    public final void b() {
        this.b.clearAdObjects();
    }

    public final void c(WebViewClient webViewClient) {
        AbstractC5381iO2.f(webViewClient != this, "Delegate cannot be itself.");
        this.a = webViewClient;
    }

    public final boolean d(WebView webView) {
        if (this.c.equals(webView)) {
            return true;
        }
        AbstractC4274eT1.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.daaw.AbstractC6765nJ1, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (d(webView) && !this.b.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.daaw.AbstractC6765nJ1, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!d(this.c)) {
            return false;
        }
        if (this.b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.daaw.AbstractC6765nJ1, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!d(webView)) {
            return false;
        }
        if (this.b.handleH5AdsRequest(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
