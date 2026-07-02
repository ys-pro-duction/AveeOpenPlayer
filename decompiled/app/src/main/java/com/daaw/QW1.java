package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class QW1 implements Runnable {
    public final /* synthetic */ RW1 B;

    public QW1(RW1 rw1) {
        this.B = rw1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
