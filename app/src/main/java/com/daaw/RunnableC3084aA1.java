package com.daaw;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.daaw.aA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3084aA1 implements Runnable {
    public final ValueCallback B;
    public final /* synthetic */ C2301Sz1 C;
    public final /* synthetic */ WebView D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ C3641cA1 F;

    public RunnableC3084aA1(C3641cA1 c3641cA1, final C2301Sz1 c2301Sz1, final WebView webView, final boolean z) {
        this.F = c3641cA1;
        this.C = c2301Sz1;
        this.D = webView;
        this.E = z;
        this.B = new ValueCallback() { // from class: com.daaw.Zz1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.a.F.d(c2301Sz1, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.D.getSettings().getJavaScriptEnabled()) {
            try {
                this.D.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.B);
            } catch (Throwable unused) {
                this.B.onReceiveValue("");
            }
        }
    }
}
