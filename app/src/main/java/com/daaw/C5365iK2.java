package com.daaw;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: com.daaw.iK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5365iK2 extends WebViewClient {
    public final String a = "OMID NativeBridge WebViewClient";
    public final /* synthetic */ C5924kK2 b;

    public C5365iK2(C5924kK2 c5924kK2) {
        this.b = c5924kK2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        "WebView renderer gone: ".concat(String.valueOf(renderProcessGoneDetail.toString()));
        if (this.b.a() != webView) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        this.b.j(null);
        webView.destroy();
        return true;
    }
}
