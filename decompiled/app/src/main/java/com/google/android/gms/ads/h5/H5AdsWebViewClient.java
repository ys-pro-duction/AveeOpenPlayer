package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.daaw.AJ1;
import com.daaw.AbstractC6765nJ1;

/* JADX INFO: loaded from: classes.dex */
public final class H5AdsWebViewClient extends AbstractC6765nJ1 {
    public final AJ1 a;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.a = new AJ1(context, webView);
    }

    @Override // com.daaw.AbstractC6765nJ1
    public WebViewClient a() {
        return this.a;
    }

    public void clearAdObjects() {
        this.a.b();
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.a.a();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.a.c(webViewClient);
    }
}
