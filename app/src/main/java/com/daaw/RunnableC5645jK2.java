package com.daaw;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.daaw.jK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5645jK2 implements Runnable {
    public final WebView B;
    public final /* synthetic */ C5924kK2 C;

    public RunnableC5645jK2(C5924kK2 c5924kK2) {
        this.C = c5924kK2;
        this.B = c5924kK2.d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.destroy();
    }
}
