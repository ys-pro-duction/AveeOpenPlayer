package com.daaw;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.daaw.da3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class HandlerC4026da3 extends Handler {
    public final Looper a;

    public HandlerC4026da3(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public HandlerC4026da3(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
