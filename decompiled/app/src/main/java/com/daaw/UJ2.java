package com.daaw;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class UJ2 implements Runnable {
    public final /* synthetic */ WebView B;
    public final /* synthetic */ String C;
    public final /* synthetic */ ZJ2 D;

    public UJ2(ZJ2 zj2, WebView webView, String str) {
        this.D = zj2;
        this.B = webView;
        this.C = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ZJ2.i(this.B, this.C);
    }
}
