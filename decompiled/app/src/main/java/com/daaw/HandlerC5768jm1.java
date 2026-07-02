package com.daaw;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.daaw.jm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class HandlerC5768jm1 extends Handler {
    public final Looper a;

    public HandlerC5768jm1(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public HandlerC5768jm1(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
