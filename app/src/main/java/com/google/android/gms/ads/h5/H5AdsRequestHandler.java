package com.google.android.gms.ads.h5;

import android.content.Context;
import com.daaw.C9840yJ1;

/* JADX INFO: loaded from: classes.dex */
public final class H5AdsRequestHandler {
    public final C9840yJ1 a;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.a = new C9840yJ1(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.a.a();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.a.b(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return C9840yJ1.c(str);
    }
}
