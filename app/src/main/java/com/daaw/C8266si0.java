package com.daaw;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.si0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8266si0 extends BroadcastReceiver {
    public void a(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(context, (Class<?>) InterfaceC1688Ni0.l));
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
            a(context, "AUDIO_BECOMING_NOISY_ACTION");
        } else if (action.equals("android.intent.action.HEADSET_PLUG") && intent.getIntExtra("state", 0) == 1) {
            a(context, "ACTION_HEADSET_PLUGGED_IN");
        }
    }
}
