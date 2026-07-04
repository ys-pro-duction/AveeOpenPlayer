package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.daaw.tz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8626tz1 extends BroadcastReceiver {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC9470wz1 a;

    public C8626tz1(ViewOnAttachStateChangeListenerC9470wz1 viewOnAttachStateChangeListenerC9470wz1) {
        this.a = viewOnAttachStateChangeListenerC9470wz1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.j(3);
    }
}
