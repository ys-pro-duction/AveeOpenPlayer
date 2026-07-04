package com.daaw;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N42 {
    public static Boolean a;

    public static void a(WebView webView, String str) {
        boolean zBooleanValue;
        synchronized (N42.class) {
            if (a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    a = Boolean.FALSE;
                }
                zBooleanValue = a.booleanValue();
            } else {
                zBooleanValue = a.booleanValue();
            }
        }
        if (zBooleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
