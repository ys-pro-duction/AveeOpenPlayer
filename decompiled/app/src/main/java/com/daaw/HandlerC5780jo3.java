package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.daaw.jo3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC5780jo3 extends Handler {
    public final /* synthetic */ C7184oo3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5780jo3(C7184oo3 c7184oo3, Looper looper) {
        super(looper);
        this.a = c7184oo3;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C7184oo3.a(this.a, message);
    }
}
