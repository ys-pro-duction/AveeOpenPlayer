package com.daaw;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.daaw.gX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4858gX1 extends AbstractC5137hX1 {
    public C4858gX1(InterfaceC9334wW1 interfaceC9334wW1, C6454mB1 c6454mB1, boolean z, BinderC9431wq2 binderC9431wq2) {
        super(interfaceC9334wW1, c6454mB1, z, binderC9431wq2);
    }

    @Override // com.daaw.FW1, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return F0(webView, str, null);
    }
}
