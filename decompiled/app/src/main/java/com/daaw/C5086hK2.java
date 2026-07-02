package com.daaw;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.daaw.hK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5086hK2 extends AbstractC4807gK2 {
    public C5086hK2(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        j(webView);
    }
}
