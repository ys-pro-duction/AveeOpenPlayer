package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcm;

/* JADX INFO: renamed from: com.daaw.zZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10183zZ1 extends BroadcastReceiver {
    public final /* synthetic */ zzcm a;

    public C10183zZ1(zzcm zzcmVar) {
        this.a = zzcmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.b(context, intent);
    }
}
