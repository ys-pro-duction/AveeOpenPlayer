package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: renamed from: com.daaw.Sq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2266Sq2 {
    public AbstractC2956Zh0 a;
    public final Context b;

    public C2266Sq2(Context context) {
        this.b = context;
    }

    public final InterfaceFutureC8236sc0 a() {
        AbstractC2956Zh0 abstractC2956Zh0A = AbstractC2956Zh0.a(this.b);
        this.a = abstractC2956Zh0A;
        return abstractC2956Zh0A == null ? AbstractC7360pS2.g(new IllegalStateException("MeasurementManagerFutures is null")) : abstractC2956Zh0A.b();
    }

    public final InterfaceFutureC8236sc0 b(Uri uri, InputEvent inputEvent) {
        AbstractC2956Zh0 abstractC2956Zh0 = this.a;
        abstractC2956Zh0.getClass();
        return abstractC2956Zh0.c(uri, inputEvent);
    }
}
