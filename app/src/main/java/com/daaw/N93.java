package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class N93 extends BroadcastReceiver implements Runnable {
    public final Q93 B;
    public final Handler C;
    public final /* synthetic */ T93 D;

    public N93(T93 t93, Handler handler, Q93 q93) {
        this.D = t93;
        this.C = handler;
        this.B = q93;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.C.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
