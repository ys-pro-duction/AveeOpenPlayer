package com.daaw;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.daaw.iX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5416iX1 extends AbstractC5137hX1 {
    public C5416iX1(InterfaceC9334wW1 interfaceC9334wW1, C6454mB1 c6454mB1, boolean z, BinderC9431wq2 binderC9431wq2) {
        super(interfaceC9334wW1, c6454mB1, z, binderC9431wq2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return F0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
