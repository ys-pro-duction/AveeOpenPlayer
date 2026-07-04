package com.daaw;

import android.content.Context;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.daaw.El1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0766El1 extends HandlerC5768jm1 {
    public final Context b;
    public final /* synthetic */ C9320wT c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0766El1(C9320wT c9320wT, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.c = c9320wT;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        C9320wT c9320wT = this.c;
        int iG = c9320wT.g(this.b);
        if (c9320wT.j(iG)) {
            this.c.p(this.b, iG);
        }
    }
}
