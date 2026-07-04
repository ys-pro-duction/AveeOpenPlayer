package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.daaw.dy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4139dy1 extends BroadcastReceiver {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC4418ey1 a;

    public C4139dy1(ViewOnAttachStateChangeListenerC4418ey1 viewOnAttachStateChangeListenerC4418ey1) {
        this.a = viewOnAttachStateChangeListenerC4418ey1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.f();
    }
}
