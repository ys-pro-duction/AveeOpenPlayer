package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.util.zzt;

/* JADX INFO: loaded from: classes.dex */
public final class Mo3 extends BroadcastReceiver {
    public final /* synthetic */ zzt a;

    public /* synthetic */ Mo3(zzt zztVar, zzr zzrVar) {
        this.a = zztVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.a.e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.a.e = false;
        }
    }
}
