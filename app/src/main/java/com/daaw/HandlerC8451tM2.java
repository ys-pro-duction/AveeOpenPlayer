package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.daaw.tM2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class HandlerC8451tM2 extends Handler {
    public final Looper a;

    public HandlerC8451tM2(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }
}
